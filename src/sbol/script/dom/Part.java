package sbol.script.dom;

import org.sbolstandard.core.DnaComponent;
import org.sbolstandard.core.DnaSequence;
import org.sbolstandard.core.SBOLFactory;

public class Part 
	extends Component {

	// partID ... MIT's part-id
	private String sID;
	
	private String shortName;
	private String description;
	private String partType;
	private String url;
	private String dnaSequence;
	
	public Part(String sName,String description) {
		super(sName);
		this.description=description;
	}
	
	public void setID(String sID) {
		this.sID=sID;
	}
	public String getID() {
		return sID;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getPartType() {
		return partType;
	}

	public void setPartType(String partType) {
		this.partType = partType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDnaSequence() {
		return dnaSequence;
	}

	public void setDnaSequence(String dnaSequence) {
		this.dnaSequence = dnaSequence;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		String NEWLINE=System.getProperty("line.separator");
		sb.append("<name>"+this.getName()+"</name>").append(NEWLINE);
		sb.append("<id>"+this.sID+"</id>").append(NEWLINE);
		sb.append("<type>"+this.getType()+"</type>").append(NEWLINE);		
		sb.append("<sequence>"+this.getDnaSequence()+"</sequence>").append(NEWLINE);
		return sb.toString();
	}
	
	public String toDNASequence() {
		return this.dnaSequence.trim();
	}

	@Override
	public DnaComponent toDnaComponent() {
		DnaComponent objDnaComponent = SBOLFactory.createDnaComponent();
		objDnaComponent.setDescription(this.description);
		objDnaComponent.setDisplayId(this.getName());
		DnaSequence objDnaSequence = SBOLFactory.createDnaSequence();
		objDnaSequence.setNucleotides(this.getDnaSequence());
		objDnaComponent.setDnaSequence(objDnaSequence);
		return objDnaComponent;
	}
	
}
