package sbol.script.util.genbank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import org.biojava.bio.Annotation;
import org.biojava.bio.BioException;
import org.biojava.bio.seq.DNATools;
import org.biojava.bio.seq.Feature;
import org.biojava.bio.seq.Sequence;
import org.biojava.bio.symbol.IllegalSymbolException;
import org.biojava.bio.symbol.RangeLocation;
import org.biojava.utils.ChangeVetoException;
import org.biojavax.bio.seq.io.GenbankFormat;

import sbol.script.dom.Component;
import sbol.script.dom.Module;


public class GenbankExporter {

	public static boolean export(Module objModule) {
		
		Sequence objSeq;
		try {
			objSeq = DNATools.createDNASequence(
					objModule.toDNASequence().toUpperCase(), 
					objModule.getName());
		} catch (IllegalSymbolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		// FEATURE ANNOTATIONS
		ArrayList<Component> lstComponents = objModule.getComponents();
		int nCurrIndex = 0;
		for(int i=0; i<lstComponents.size(); i++) {
			Component objComponent = lstComponents.get(i);
			String sSequence = objComponent.toDNASequence();
			
			System.out.println("annotating sequence from "+nCurrIndex+" to "+(nCurrIndex+sSequence.length()-1)+
					" with feature "+objComponent.getName());

			Feature.Template template = new Feature.Template();
			template.type = objComponent.getType();
			template.source = objComponent.getName();
			template.location = new RangeLocation(nCurrIndex, (nCurrIndex+sSequence.length()-1));
			template.annotation = Annotation.EMPTY_ANNOTATION;
			try {
				objSeq.createFeature(template);
			} catch (ChangeVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			} catch (BioException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			
			//dnaSequence.addFeature(nCurrIndex, nCurrIndex+sSequence.length()-1, feature);
			nCurrIndex+=sSequence.length();
		}

		String sFileName="./"+objModule.getName()+".gb";

		try {
			PrintStream ps = new PrintStream(new File(sFileName));
			new GenbankFormat().writeSequence(objSeq, ps);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}

		return true;
		/*		
		System.out.println(dnaSequence.toString());
		Project objProject=(Project)objScript.getParent();

		
		FileWriter fw;
		try {
			fw = new FileWriter(new File(
					System.getProperty("user.home")+"/script/projects/"+
							objProject.getName()+"/"+
							objModule.getName()+".gb"));
			fw.write(objModule.toString());
			fw.flush();
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		
		
		// Update the project's view with the generated module
		
	}
}
