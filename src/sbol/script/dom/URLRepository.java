package sbol.script.dom;


import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

//import org.scriptweaver.script.dom.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class URLRepository 
	extends Repository {

	private XPath xpath;
	private Document doc;
	private DocumentBuilder db;
	
	public URLRepository(String sName) {
		super(sName);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dbFactory.setNamespaceAware(true); // never forget this!
		try {
			db=dbFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}				
	}
	
	public void setLocation(String location) { 
		this.location = location;
	}
	
	public Part loadPart(String partName) 
			throws SAXException, IOException, XPathExpressionException {
		return this.parseXMLPart(partName);
	}
	
	private Part parseXMLPart(String partName) 
			throws SAXException, IOException, XPathExpressionException {
		this.doc = db.parse(this.getLocation()+partName);
	    XPathFactory factory = XPathFactory.newInstance();
	    this.xpath = factory.newXPath();
	    
		XPathExpression expr = xpath.compile("//part_list/part/*");
		Object result = expr.evaluate(doc, XPathConstants.NODESET);

	    Part objPart=null;
	    NodeList nodes = (NodeList) result;
	    for (int i = 0; i < nodes.getLength(); i++) {
	    	Node node=nodes.item(i);

	    	String sContent = node.getTextContent().trim();
	    	String sID=null;
	    	if(node.getLocalName().equals("part_name")) {	
	    		objPart=new Part(sContent,partName);
	    		objPart.setID(sID);
	    	} else if(node.getLocalName().equals("part_id")) {
	    		sID = sContent;
	    	} else if(node.getLocalName().equals("part_short_name")) {
	    		objPart.setShortName(sContent);
	    	} else if(node.getLocalName().equals("part_type")) {
	    		objPart.setPartType(sContent);
	    	} else if(node.getLocalName().equals("part_url")) {
	    		objPart.setUrl(sContent);
	    	} else if(node.getLocalName().equals("sequences")) {
	    		objPart.setDnaSequence(sContent.replaceAll("\n", "").toUpperCase());
	    	} else if(node.getLocalName().equals("ERROR")) {
	    		return null;
	    	}
	    }

	    return objPart;
	}
}
