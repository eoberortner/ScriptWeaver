package sbol.script.util;

import java.util.List;

import org.sbolstandard.core.SBOLDocument;
import org.sbolstandard.core.SBOLFactory;

import sbol.script.dom.Module;

/**
 *
 * @author Ernst Oberortner
 */
public class SBOLExporter {
	public static SBOLDocument serialize(List<Module> lstModules) 
			throws Exception {
		// create an empty document populated with some SBOL objects
		SBOLDocument document = SBOLFactory.createDocument();

		if(null != lstModules && !lstModules.isEmpty()) {
			if(lstModules.size() > 1) {
				org.sbolstandard.core.Collection sbolCollection = 
						Script2SBOL.convert("result-set", lstModules, "http://scriptweaver.net");
				
				// add the DnaComponent to this document
				document.addContent(sbolCollection);
			} else {
				document.addContent(
						Script2SBOL.convert(lstModules.get(0), "http://scriptweaver.net"));
			}
		}
		
		return document;
	}	
}
