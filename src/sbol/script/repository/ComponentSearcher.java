package sbol.script.repository;

import java.io.IOException;
import java.util.Iterator;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import sbol.script.dom.Component;
import sbol.script.dom.NamedElement;
import sbol.script.dom.Repository;
import sbol.script.dom.URLRepository;
import sbol.script.dom.XMLFileRepository;
import sbol.script.parser.SymbolTables;


public class ComponentSearcher {

	public ComponentSearcher() {}
	
	public Component search(SymbolTables objSymbolTables, String id) 
			throws Exception {
		
		NamedElement objElement = null;
		
		// 1. search in the symboltables 
		objElement = objSymbolTables.get(id);
		
		if(objElement != null && objElement instanceof Component) {
			return (Component)objElement;
		}
		
		// 2. if the symboltables do not contain the component
		//    then request the component from one of the configured repositories
		
		// iterate over all registries in order to find the given component
		Iterator<Repository> it=objSymbolTables.getRepositories().iterator();
		while(it.hasNext()) {
			Repository objRepository=it.next();

			Component comp=null;
			if(objRepository instanceof URLRepository) {
				comp=((URLRepository)objRepository).loadPart(id);
			} else if(objRepository instanceof  XMLFileRepository) {
				comp=((XMLFileRepository)objRepository).loadComponent(id);
			}
			
			if(null!=comp) {
				return comp;
			} 
		}
		
		return null;
	}
}
