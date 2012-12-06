package sbol.script;

import java.net.URL;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class ScriptInvoker {
	private static XmlRpcClientConfigImpl config = null;
	private static XmlRpcClient client = null;
	
	public static String invokeXmlRpc(String sScript) 
			throws Exception {
	
		if(null == config) {
	        config = new XmlRpcClientConfigImpl();
	        config.setServerURL(new URL("http://localhost:8080/ScriptWeaver/xmlrpc"));	
		}
		if(null == client) {
	        client = new XmlRpcClient(); 
	        client.setConfig(config);
		}
		
		Object result = client.execute("ScriptWeaver.execute", new Object[]{sScript.getBytes()});

        if(null != result) {
        	return new String((byte[])result);
        }
        
        return (String)null;
	}

}
