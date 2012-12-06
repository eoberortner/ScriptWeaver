package sbol.script.repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import sbol.script.dom.Repository;
import sbol.script.dom.URLRepository;
import sbol.script.dom.XMLFileRepository;

public class RepositoryLoader {
	
	// this class loads all repositories from the config/registries.xml file
	// and puts them into the hmRegistries HashMap of the SymbolTables 
	public static List<Repository> load() 
			throws Exception {

	    ArrayList<Repository> lstRepositories = new ArrayList<Repository>();

	    // URL Repository
	    /**
		<repository>
			<id>partsregistry.org</id>
			<type>URLRepository</type>
			<description>The MIT's part registry</description>
			<location>http://partsregistry.org/xml/part.</location>
		</repository>
	    **/
	    URLRepository registry = new URLRepository("partsregistry.org");
	    registry.setType("URLRepository");
	    registry.setDescription("The MIT's part registry");
	    registry.setLocation("http://partsregistry.org/xml/part.");
	    lstRepositories.add(registry);
	    
	    
	    // XML File Repository
	    /**
	    <repository>
			<id>biofab.org</id>
			<type>XMLFileRepository</type>
			<description>The BioFab's part registry</description>
			<location>./repository/biofab_modular_promoter_library.xml</location>
		</repository>
	    **/
	    XMLFileRepository biofab = new XMLFileRepository("biofab.org");
	    biofab.setType("XMLFileRepository");
	    biofab.setDescription("The BioFab's part registry");
	    biofab.setLocation("./ScriptWeaver/repository/biofab_modular_promoter_library.xml");
	    lstRepositories.add(biofab);
	    
		/**
		String currentDir = new File(".").getAbsolutePath();

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dbFactory.setNamespaceAware(true); // never forget this!
		DocumentBuilder db=dbFactory.newDocumentBuilder();
		Document doc = db.parse(currentDir+"/ScriptWeaver/config/repositories.xml");
		
	    XPathFactory factory = XPathFactory.newInstance();
	    XPath xpath = factory.newXPath();
	    
	    XPathExpression expr = xpath.compile("//repository/*");
	    Object result = expr.evaluate(doc, XPathConstants.NODESET);
	    NodeList nodes = (NodeList) result;
	    
	    ArrayList<Repository> lstRepositories = new ArrayList<Repository>();
	    
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
	    		
	    		lstRepositories.add(objRepository);
		    	sRepoName = null;
	    	} else if(node.getLocalName().equals("description")) {
	    		objRepository.setDescription(node.getTextContent());
	    	} else if(node.getLocalName().equals("location")) {
	    		if(null != objRepository) {
	    			if(objRepository instanceof URLRepository) {
	    				((URLRepository)objRepository).setLocation(node.getTextContent());
	    			} else if(objRepository instanceof XMLFileRepository) {
	    				((XMLFileRepository)objRepository).setLocation(currentDir+"/ScriptWeaver/repository/");
	    			}
	    		}
	    	} 
	    }
	    **/
		
	    return lstRepositories;
	}
}
