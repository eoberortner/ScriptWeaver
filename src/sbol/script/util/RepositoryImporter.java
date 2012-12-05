package sbol.script.util;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import sbol.script.dom.Repository;


public class RepositoryImporter {
	
	// this class loads all repositories from the config/registries.xml file
	// and puts them into the hmRegistries HashMap of the SymbolTables 
	public static ArrayList<Repository> load() 
			throws ParserConfigurationException, SAXException, 
			       IOException, XPathExpressionException {
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dbFactory.setNamespaceAware(true); // never forget this!
		DocumentBuilder db=dbFactory.newDocumentBuilder();
		Document doc = db.parse(System.getProperty("user.home")+"/script/config/repositories.xml");
		
	    XPathFactory factory = XPathFactory.newInstance();
	    XPath xpath = factory.newXPath();
	    
	    XPathExpression expr = xpath.compile("//repository/*");
	    Object result = expr.evaluate(doc, XPathConstants.NODESET);
	    NodeList nodes = (NodeList) result;
	    ArrayList<Repository> lstRepositories=new ArrayList<Repository>();
	    Repository objRepository=null;
	    for (int i = 0; i < nodes.getLength(); i++) {
	    	Node node=nodes.item(i);

	    	if(node.getLocalName().equals("id")) {	
	    		objRepository=new Repository(node.getTextContent());
	    		lstRepositories.add(objRepository);
	    	} else if(node.getLocalName().equals("type")) {
	    		objRepository.setType(node.getTextContent());
	    	} else if(node.getLocalName().equals("description")) {
	    		objRepository.setDescription(node.getTextContent());
	    	} else if(node.getLocalName().equals("location")) {
	    		String sRepoLocation=node.getTextContent();
	    		if(!sRepoLocation.startsWith("http")) {
	    			sRepoLocation=System.getProperty("user.home")+"/"+sRepoLocation;
	    		}
	    		objRepository.setLocation(sRepoLocation);
	    	} 
	    }
	    
	    return lstRepositories;
	}
}
