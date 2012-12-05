package sbol.script.dom;

//http://www.ibm.com/developerworks/library/x-javaxpathapi/index.html
import java.io.IOException;

//import org.scriptweaver.script.dom.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;


import javax.xml.parsers.*;
import javax.xml.xpath.*;

public class XMLFileRepository 
	extends Repository {
	
	private XPath xpath;
	private Document doc;
	
	public XMLFileRepository(String sName) {		
		super(sName);		
	}
	
	public void setLocation(String sXMLFile) 
			throws ParserConfigurationException, SAXException, 
				IOException, XPathExpressionException {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dbFactory.setNamespaceAware(true); // never forget this!
		DocumentBuilder db=dbFactory.newDocumentBuilder();
		this.doc = db.parse(sXMLFile);
		
	    XPathFactory factory = XPathFactory.newInstance();
	    this.xpath = factory.newXPath();
	}
	
	public Component loadComponent(String sID) {
	    XPathExpression expr;
		try {
			expr = xpath.compile("//RECORD[genetic_part_id='"+sID+"']/type/text()");
		} catch (XPathExpressionException e) {
			e.printStackTrace();
			return null;
		}

	    Object result;
		try {
			result = expr.evaluate(doc, XPathConstants.STRING);
		} catch (XPathExpressionException e) {
			e.printStackTrace();
			return null;
		}
		
		if("PROMOTER".equals(result.toString().toUpperCase())) {			
			return this.getPromoter(sID);
		}
		return null;
	}
	
	public Promoter getPromoter(String sPromoterID) {
		Promoter objProm=new Promoter(sPromoterID);
	    XPathExpression expr;
		try {
			expr = xpath.compile("//RECORD[genetic_part_id='"+sPromoterID+"']/*");
		} catch (XPathExpressionException e) {
			e.printStackTrace();
			return null;
		}
		
	    Object result;
		try {
			
			result = expr.evaluate(doc, XPathConstants.NODESET);
		} catch (XPathExpressionException e) {
			e.printStackTrace();
			return null;
		}
		
	    NodeList nodes = (NodeList) result;
	    for (int i = 0; i < nodes.getLength(); i++) {
	    	Node node=nodes.item(i);

	    	String sContent = node.getTextContent().trim();
	    	if(node.getLocalName().equals("description")) {	
	    		objProm.setDescription(sContent);
	    	} else if(node.getLocalName().equals("dna_sequence")) {
	    		objProm.setDnaSequence(sContent.replaceAll("\n","").toUpperCase());
	    	} else if(node.getLocalName().equals("plasmid_id")) {
	    		objProm.setPlasmidID(sContent);
	    	} else if(node.getLocalName().equals("mean_fluorescence_per_cell")) {
	    		objProm.setMeanFlourescencePerCell(
	    				Double.parseDouble(sContent));
	    	} else if(node.getLocalName().equals("mean_fluorescence_per_cell_sd")) {
	    		objProm.setMeanFlourescencePerCellSD(
	    				Double.parseDouble(sContent));
	    	} 
	    }
		
	    return objProm;
	}
}
