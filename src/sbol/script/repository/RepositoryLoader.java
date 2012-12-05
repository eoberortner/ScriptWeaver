package sbol.script.repository;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import sbol.script.dom.*;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import sbol.script.dom.Repository;
import sbol.script.parser.SymbolTables;

public class RepositoryLoader {
	
	// this class loads all repositories from the config/registries.xml file
	// and puts them into the hmRegistries HashMap of the SymbolTables 
	public static void load(SymbolTables objSymbolTables) 
			throws ParserConfigurationException, SAXException, 
			       IOException, XPathExpressionException {
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dbFactory.setNamespaceAware(true); // never forget this!
		DocumentBuilder db=dbFactory.newDocumentBuilder();
		Document doc = db.parse("./config/repositories.xml");
		
	    XPathFactory factory = XPathFactory.newInstance();
	    XPath xpath = factory.newXPath();
	    
	    XPathExpression expr = xpath.compile("//repository/*");
	    Object result = expr.evaluate(doc, XPathConstants.NODESET);
	    NodeList nodes = (NodeList) result;
	    Repository objRepository = null;
	    String sRepoName = null;
	    for (int i = 0; i < nodes.getLength(); i++) {
	    	Node node=nodes.item(i);

	    	
	    	if(node.getLocalName().equals("id")) {	
	    		//objRepository=new Repository(node.getTextContent());
	    		sRepoName=node.getTextContent();
	    	} else if(node.getLocalName().equals("type")) {
	    		String sType = node.getTextContent();
	    		if("URLRepository".equals(sType)) {
	    			objRepository = new URLRepository(sRepoName);
	    		} else if ("XMLFileRepository".equals(sType)) {
	    			objRepository = new XMLFileRepository(sRepoName);
	    		} else {
	    			throw new XPathExpressionException(
	    					"The "+objRepository.getName()+" repository has an invalid type!");
	    		}	    		
	    		objRepository.setType(node.getTextContent());
	    		
	    		objSymbolTables.put(objRepository);
		    	sRepoName = null;
	    	} else if(node.getLocalName().equals("description")) {
	    		objRepository.setDescription(node.getTextContent());
	    	} else if(node.getLocalName().equals("location")) {
	    		objRepository.setLocation(node.getTextContent());
	    	} 
	    }
	}
}
