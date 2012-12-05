package sbol.script.dom;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

public class Repository 
	extends NamedElement {

	public String type;
	public String description;
	public String location;
	
	public Repository(String sName) {
		super(sName);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) 
			throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		this.location = location;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	public String getDescription() {
		return this.description;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		String NEWLINE=System.getProperty("line.separator");
		sb.append("<registry>").append(NEWLINE);
		sb.append("	  <id>"+this.getName()+"</id>").append(NEWLINE);
		sb.append("	  <type>"+this.getType()+"</type>").append(NEWLINE);
		sb.append("	  <description>"+this.getDescription()+"</description>").append(NEWLINE);
		sb.append("	  <location>"+this.getLocation()+"</location>").append(NEWLINE);
		sb.append("</registry>");
		return sb.toString();
	}
}

