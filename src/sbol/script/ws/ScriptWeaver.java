package sbol.script.ws;

import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.sbolstandard.core.SBOLDocument;

import sbol.script.dom.Module;
import sbol.script.parser.ScriptLexer;
import sbol.script.parser.ScriptParser;
import sbol.script.parser.SymbolTables;
import sbol.script.util.SBOLExporter;


public class ScriptWeaver { 

	public byte[] execute(byte[] arrScript) {
		String sScript = new String(arrScript);

		StringBuilder sb = new StringBuilder();
		sb.append(sScript);
		
		try {
			String sResult = 
					(String) ScriptWeaver.executeScript(
							sb.toString());			
			return sResult.getBytes();
		} catch (Exception e) {
			return e.getMessage().getBytes();
		}
	}

	public static String executeScript(String sScript) 
			throws Exception {

		if(null == sScript || sScript.isEmpty()) {
			throw new Exception("I cannot execute the given script!");
		}
		
        ScriptLexer lex = new ScriptLexer(
            new ANTLRStringStream(sScript));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        ScriptParser parser = new ScriptParser(tokens);
        
        System.out.println("initializing the parser...");
        try {
        	parser.init();
        } catch(Exception e) {
        	System.out.println(e.toString());
        	return null;
        }
        
        System.out.println("starting to parse...");
        parser.prog();
        
        // get all defined modules
        System.out.println("processing the created modules...");
        List<Module> lstModules = parser.getModules();
        SBOLDocument document = SBOLExporter.serialize(lstModules);
        
        // cleanup
        System.out.println("cleaning up the parser...");
        parser.cleanUp();
        
        return document.toString();
	}
}
