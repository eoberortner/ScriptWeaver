package sbol.script.util.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import sbol.script.dom.Module;

public class XMLFileExporter {
	public static void export(Module objModule) {
		System.out.println("exporting module => "+objModule.toString());
		
		FileWriter fw;
		try {
			fw = new FileWriter(new File("./"+objModule.getName()+".module"));
			fw.write(objModule.toString());
			fw.flush();
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Update the project's view with the generated module
		
	}
}
