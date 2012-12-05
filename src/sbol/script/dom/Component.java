package sbol.script.dom;

import sbol.script.util.ISBOLComponent;

public abstract class Component 
	extends NamedElement 
	implements ISBOLComponent {
	
	private String type;
	
	public Component(String sName) {
		super(sName);
	}
	
	public Component(String sName,String type) {
		super(sName);
		this.type=type;
	}
	
	public String getType() {
		return this.type;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		String NEWLINE=System.getProperty("line.separator");
		sb.append("<id>"+this.getName()+"</id>").append(NEWLINE);
		sb.append("<type>"+this.getType()+"</type>").append(NEWLINE);		
		return sb.toString();
	}

	public abstract String toDNASequence();
}
