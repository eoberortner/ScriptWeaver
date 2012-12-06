package sbol.script.dom;


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

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
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

