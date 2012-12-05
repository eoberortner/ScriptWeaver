package sbol.script.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.sbolstandard.core.DnaComponent;
import org.sbolstandard.core.SBOLDocument;
import org.sbolstandard.core.SBOLFactory;
import org.sbolstandard.core.SBOLValidationException;
import org.sbolstandard.core.util.SBOLPrettyWriter;

import sbol.script.dom.Module;

public class SBOLExporter {
	public static boolean serialize(Module objModule, String sPath) {
		
		//System.out.println("[SBOLExporter] serializing module "+objModule.getName());
		
		// objModule.toDNASequence().toUpperCase()		
		DnaComponent dnaComponent = objModule.toDnaComponent();
		if(dnaComponent==null) {
			return false;
		}
		
		// create an empty document populated with some SBOL objects
		SBOLDocument document = SBOLFactory.createDocument();
		// add the DnaComponent to this document
		document.addContent(dnaComponent);
		
		FileOutputStream fos;
		try {
			/**
			Bundle bundle = Platform.getBundle("org.scriptweaver");
			System.out.println(bundle.getLocation());
			Path path = new Path("icons/sample.gif");
			URL fileURL = Platform.find(bundle, path);
			InputStream in = fileURL.openStream();
			 **/

			File fDir = new File(sPath+"/downloads/sbol/");
			if(!fDir.exists()) {
				fDir.mkdirs();
			}
			File f = new File(fDir.toString()+"/"+objModule.getName()+".sbol"); 
			if(f.exists()) {
				f.delete();
			}
			
			fos = new FileOutputStream(f);
			new SBOLPrettyWriter().write(document, fos);
		} catch (FileNotFoundException e) {
			System.err.println(e.toString());
		} catch (SBOLValidationException e) {
			System.err.println(e.toString());
		}
		
		return true;
	}
}
