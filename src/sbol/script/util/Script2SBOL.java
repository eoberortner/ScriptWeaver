package sbol.script.util;

// SBOL
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.sbolstandard.core.Collection;
import org.sbolstandard.core.DnaComponent;
import org.sbolstandard.core.DnaSequence;
import org.sbolstandard.core.SequenceAnnotation;
import org.sbolstandard.core.impl.CollectionImpl;
import org.sbolstandard.core.impl.DnaComponentImpl;
import org.sbolstandard.core.impl.DnaSequenceImpl;
import org.sbolstandard.core.impl.SequenceAnnotationImpl;
import org.sbolstandard.core.util.SequenceOntology;

import sbol.script.dom.Component;
import sbol.script.dom.Module;
import sbol.script.dom.Part;


public class Script2SBOL {

	public static ArrayList<String> lstURIs;
	
	public static DnaComponent convert(Component objComponent, String sURI) 
			throws Exception {
		if(null == objComponent) {
			throw new Exception("I cannot export a NULL value to SBOL!");
		}
		
		DnaComponent dc = new DnaComponentImpl();
		if(objComponent instanceof Module) {
			Module objModule = (Module)objComponent;
			
			int n = 1;
			for(Component c: objModule.getComponents()) {
				SequenceAnnotation sa = new SequenceAnnotationImpl();
				sa.setURI(URI.create(sURI+"/"+objModule.getName()+"/anno"+n));
				n++;

				//subcomponent
				DnaComponent sc = Script2SBOL.convert(c, sURI+"/"+objModule.getName());
				sc.setDisplayId(objModule.getName()+"_"+sc.getDisplayId());
				
				sa.setSubComponent(sc);				
				dc.addAnnotation(sa);
			}
			
			
			dc.setDescription(objModule.getName());
			dc.setDisplayId(objModule.getName());
			//dc.setDisplayId(sURI+"/"+objDevice.getName());
			dc.setURI(URI.create(sURI+"/"+objModule.getName()));
			
			String seq = objModule.toDNASequence();
			if(null != seq && !seq.isEmpty()) {
				DnaSequence dnaSeq = new DnaSequenceImpl();
				dnaSeq.setURI(URI.create(sURI+"/"+objModule.getName()+"_Sequence"));
				dnaSeq.setNucleotides(seq.toLowerCase());
				dc.setDnaSequence(dnaSeq);
			}

			return dc;
		} else if(objComponent instanceof Part) {
			Part objPart = (Part)objComponent;

			dc.setDescription(objPart.getName());
			dc.setDisplayId(objPart.getName());
			//dc.setDisplayId(sURI+"/"+objDevice.getName());
			dc.setURI(URI.create(sURI+"/"+objPart.getName()));

			String seq = objPart.toDNASequence();
			if(null != seq && !seq.isEmpty()) {
				DnaSequence dnaSeq = new DnaSequenceImpl();
				dnaSeq.setURI(URI.create(sURI+"/"+objPart.getName()+"_Sequence"));
				dnaSeq.setNucleotides(seq.toLowerCase());
				dc.setDnaSequence(dnaSeq);
			}

			return dc;			
		}
		
		return dc;
		
		//return (DnaComponent)null;
	}
	
	public static URI mapToSequenceOntology(Part pt) {
		if(null != pt) {
			if("Five_Prime_UTR".equals(pt.getType())) {
				return SequenceOntology.FIVE_PRIME_UTR;
			} else if("CDS".equals(pt.getType())) {
				return SequenceOntology.CDS;
			} else if("Insulator".equals(pt.getType())) {
				return SequenceOntology.INSULATOR;
			} else if("Operator".equals(pt.getType())) {
				return SequenceOntology.OPERATOR;
			} else if("Origin_of_Replication".equals(pt.getType())) {
				return SequenceOntology.ORIGIN_OF_REPLICATION;
			} else if("Primiter_Binding_Site".equals(pt.getType())) {
				return SequenceOntology.PRIMER_BINDING_SITE;
			} else if("Promoter".equals(pt.getType())) {
				return SequenceOntology.PROMOTER;
			} else if("Restriction_Enzyme_Recognition_Site".equals(pt.getType())) {
				return SequenceOntology.RESTRICTION_ENZYME_RECOGNITION_SITE;
			} else if("Terminator".equals(pt.getType())) {
				return SequenceOntology.TERMINATOR;
			}
		}
		return URI.create("http://purl.obolibrary.org/obo/user_defined");
	}

	
	public static Collection convert (String sName, List<Module> lstModules, String sURI) 
			throws Exception {
		if(null == lstModules) {
			throw new Exception("I cannot export a NULL value to SBOL!");
		}

		Collection col = new CollectionImpl();
		col.setDescription(sName);
		col.setDisplayId(sName);

		try {
			col.setURI(URI.create(sURI+"/"+sName));
		} catch(Exception e) {
			throw new Exception(e.toString());
		}
		 
		for(Module objModule : lstModules) {
			col.addComponent(Script2SBOL.convert(objModule, sURI+"/"+objModule.getName()));
		}

		return col;		
	}
	
	public static void addURI(String s) {
		if(null == lstURIs) {
			lstURIs = new ArrayList<String>();
		}
		
		if(!lstURIs.contains(s)) {
			lstURIs.add(s);
		} else {
			System.out.println(s+" appears several times");
			
		}
	}
}
