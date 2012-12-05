package sbol.script.dom;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.sbolstandard.core.DnaComponent;
import org.sbolstandard.core.DnaSequence;
import org.sbolstandard.core.SBOLFactory;
import org.sbolstandard.core.SequenceAnnotation;

public class Module 
	extends Component {
	private ArrayList<Component> lstComponents;
	
	public Module(String sName) {
		super(sName);
		lstComponents=new ArrayList<Component>();
	}
	
	public boolean addComponent(Component c) {
		if(!lstComponents.contains(c)) {
			lstComponents.add(c);
			return true;
		}
		return false;
	}
	
	public ArrayList<Component> getComponents() {
		return this.lstComponents;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		String NEWLINE=System.getProperty("line.separator");
		
		sb.append("<module id=\""+this.getName()+"\">").append(NEWLINE);
		sb.append("<components>").append(NEWLINE);
		for(int i=0;i<lstComponents.size();i++) {
			sb.append("<component>").append(NEWLINE);
			sb.append(lstComponents.get(i).toString());
			sb.append("</component>").append(NEWLINE);
		}
		sb.append("<components>").append(NEWLINE);
		sb.append("</module>");
		return sb.toString();
	}


	public String toDNASequence() {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<lstComponents.size();i++) {
			Component objComponent = lstComponents.get(i);
			sb.append(objComponent.toDNASequence());
		}
		String s = sb.toString();
		s.replace("\n","");
		System.out.println(s);
		return sb.toString().trim();
	}

	@Override
	public DnaComponent toDnaComponent() {
		String sURI = "http://sbolstandard.org/script/"+this.getName();
		DnaComponent objDnaComponent = SBOLFactory.createDnaComponent();
		objDnaComponent.setName(this.getName());
		try {
			objDnaComponent.setURI(new URI(sURI));
		} catch (URISyntaxException e) {
			e.printStackTrace();
			return null;
		}
		
		int nBioStart=0, nBioEnd=-1;
		for(int i=0;i<lstComponents.size();i++) {
			Component objComponent = lstComponents.get(i);
			String sSequence = objComponent.toDNASequence();
			
			// for every module create a sequence annotation
			SequenceAnnotation objSequenceAnnotation = SBOLFactory.createSequenceAnnotation();
			String sAnnoURI=sURI+"#"+objComponent.getName();
			try {
				objSequenceAnnotation.setURI(new URI(sAnnoURI));
			} catch (URISyntaxException e) {
				e.printStackTrace();
				return null;
			}
			nBioStart = nBioEnd+1;
			objSequenceAnnotation.setBioStart(nBioStart);
			nBioEnd = nBioStart+sSequence.length();
			objSequenceAnnotation.setBioEnd(nBioEnd);
			objSequenceAnnotation.setSubComponent(objComponent.toDnaComponent());
			objDnaComponent.addAnnotation(objSequenceAnnotation);
		}
		
		DnaSequence objDnaSequence = SBOLFactory.createDnaSequence();
		objDnaSequence.setNucleotides(this.toDNASequence());
		objDnaComponent.setDnaSequence(objDnaSequence);
		return objDnaComponent;
	}
}
