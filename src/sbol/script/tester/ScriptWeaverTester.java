/*
 *  Script Class
 * 
 *  Developers:
 *      Ernst Oberortner
 *      Cesar Rodriguez
 *      
 * 
 */

package sbol.script.tester;

import java.io.File;

import sbol.script.ScriptInvoker;
import sbol.script.util.FileUtils;

public class ScriptWeaverTester {

	public ScriptWeaverTester(File file) {
	    try { 
	    	// read the file
	    	String s = FileUtils.readFile(file);
	    	
	    	String sResult = ScriptInvoker.invokeXmlRpc(s);
	    	
	    	System.out.println(sResult);
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	}
	

	public static void main(String[] args) {
		new ScriptWeaverTester(new File("./tests/demo.script"));
	}
}
