package sbol.script.dom;

import org.sbolstandard.core.DnaComponent;
import org.sbolstandard.core.DnaSequence;
import org.sbolstandard.core.SBOLFactory;

public class Promoter 
	extends Part {

	private String description;
	private String dnaSequence;
	private String plasmidID;
	private double meanFlourescencePerCell;
	private double meanFlourescencePerCellSD;
	
	public Promoter(String ID) {
		super(ID,"PROMOTER");
		this.description=null;
		this.dnaSequence=null;
		this.plasmidID=null;
		this.meanFlourescencePerCell=0.0;
		this.meanFlourescencePerCellSD=0.0;
	}
	
	public Promoter(String ID,String description,String dnaSequence,
			String plasmidID,double meanFlourescencePerCell,double meanFlourescencePerCellSD) {
		super(ID,"PROMOTER");
		this.description=description;
		this.dnaSequence=dnaSequence;
		this.plasmidID=plasmidID;
		this.meanFlourescencePerCell=meanFlourescencePerCell;
		this.meanFlourescencePerCellSD=meanFlourescencePerCellSD;		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDnaSequence() {
		return dnaSequence;
	}

	public void setDnaSequence(String dnaSequence) {
		this.dnaSequence = dnaSequence;
	}

	public String getPlasmidID() {
		return plasmidID;
	}

	public void setPlasmidID(String plasmidID) {
		this.plasmidID = plasmidID;
	}

	public double getMeanFlourescencePerCell() {
		return meanFlourescencePerCell;
	}

	public void setMeanFlourescencePerCell(double meanFlourescencePerCell) {
		this.meanFlourescencePerCell = meanFlourescencePerCell;
	}

	public double getMeanFlourescencePerCellSD() {
		return meanFlourescencePerCellSD;
	}

	public void setMeanFlourescencePerCellSD(double meanFlourescencePerCellSD) {
		this.meanFlourescencePerCellSD = meanFlourescencePerCellSD;
	}	
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		String NEWLINE=System.getProperty("line.separator");
		sb.append("<id>"+this.getName()+"</id>").append(NEWLINE);
		sb.append("<type>"+this.getType()+"</type>").append(NEWLINE);		
		sb.append("<description>"+this.getDescription()+"</description>").append(NEWLINE);
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
