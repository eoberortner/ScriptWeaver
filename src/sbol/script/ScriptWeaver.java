/*
 *  Script Class
 * 
 *  Developers:
 *      Ernst Oberortner
 *      Cesar Rodriguez
 *      
 * 
 */

package sbol.script;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

import sbol.script.dom.Module;
import sbol.script.parser.ScriptLexer;
import sbol.script.parser.ScriptParser;
import sbol.script.parser.SymbolTables;
import sbol.script.util.FileUtils;
import sbol.script.util.SBOLExporter;

public class ScriptWeaver {

	public ScriptWeaver(File file) {
	    try { 
	    	// read the file
	    	String s = FileUtils.readFile(file);
	    	ScriptWeaver.executeScript(s, ".");
	    	/**
	    	// read the input file & execute it
	        ScriptLexer lex = new ScriptLexer(
	            new ANTLRFileStream(
	            		file.getAbsolutePath()));
	        CommonTokenStream tokens = new CommonTokenStream(lex);
	        ScriptParser parser = new ScriptParser(tokens);
	        parser.prog();
	        **/
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	}

	public static List<String> executeScript(String sScript, String sPath) 
			throws Exception {

		if(null == sScript || sScript.isEmpty()) {
			throw new Exception("I cannot execute the given script!");
		}
		
        ScriptLexer lex = new ScriptLexer(
            new ANTLRStringStream(sScript));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        ScriptParser parser = new ScriptParser(tokens);
        parser.prog();
        
        // TODO: remove this hack!!!
        
        // get the symbol tables
        SymbolTables st = parser.getSymbolTables();
        List<Module> lstModules = st.getModules();
        List<String> lstModuleNames = new ArrayList<String>(lstModules.size());
        for(Module m: lstModules) {
        	SBOLExporter.serialize(m, sPath);
        	lstModuleNames.add(m.getName());
        }
        return lstModuleNames;
	}

	public static void main(String[] args) {
		new ScriptWeaver(new File("./tests/demo.script"));
	}
}
