package sbol.script.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import sbol.script.dom.Component;
import sbol.script.dom.Module;
import sbol.script.dom.NamedElement;
import sbol.script.dom.Repository;
import sbol.script.dom.URLRepository;
import sbol.script.dom.XMLFileRepository;
import sbol.script.util.RepositoryImporter;
import sbol.script.util.SBOLExporter;

public class SymbolTables {
	private HashMap<String,Repository> hmRepositories;
	private HashMap<String,Component> hmComponents;
	
	public SymbolTables() {
		this.hmRepositories= 
				new HashMap<String,Repository>();
		this.hmComponents=
				new HashMap<String,Component>();
	}
	
	public boolean contains(String sKey) {
		if(sKey!=null) {
			if(this.hmRepositories.containsKey(sKey) ||
					this.hmComponents.containsKey(sKey)) {
				return true;
			}
		}
		return false;
	}

	public boolean containsRepository(String sKey) {
		return this.hmRepositories.containsKey(sKey);
	}

	public boolean containsComponent(String sKey) {
		return this.hmComponents.containsKey(sKey);
	}
	
	public void put(NamedElement objElement) {
		if(objElement!=null) {
			if(objElement instanceof Component) {
				this.hmComponents.put(objElement.getName(), (Component)objElement);
			} else if(objElement instanceof Repository) {
				this.hmRepositories.put(objElement.getName(), (Repository)objElement);
			}
		}
	}

	public NamedElement get(String sName) {
		if(this.hmComponents.containsKey(sName)) {
			return this.hmComponents.get(sName);
		} else if(this.hmRepositories.containsKey(sName)) {
			return this.hmRepositories.get(sName);
		}
		return null;
	}
	
	public ArrayList<Repository> getRepositories() {
		ArrayList<Repository> lstRepos = new ArrayList<Repository>();
		Iterator<Repository> it = this.hmRepositories.values().iterator();
		while(it.hasNext()) {
			lstRepos.add(it.next());
		}

		return lstRepos;
	}
	
	public ArrayList<Component> getComponents() {
		ArrayList<Component> lstComponents = new ArrayList<Component>();
		Iterator<Component> it = this.hmComponents.values().iterator();
		while(it.hasNext()) {
			lstComponents.add(it.next());
		}
		return lstComponents;
	}

	public void dump() {
		dumpRegistries();
		dumpComponents();
	}
	
	public void dumpRegistries() {
		// dump the registries
		Iterator<String> it=hmRepositories.keySet().iterator();
		while(it.hasNext()) {
			String id=it.next();
			System.out.println(id+" => "+hmRepositories.get(id));
		}
	}
	
	public void dumpComponents() {
		// dump the components
		Iterator<String> it=hmComponents.keySet().iterator();
		while(it.hasNext()) {
			String id=it.next();
			System.out.println(hmComponents.get(id));
		}
	}
	
	public void cleanUp() {
		if(null!=this.hmComponents) {
			this.hmComponents.clear();
			this.hmComponents=null;
		}
		if(null!=this.hmRepositories) {
			this.hmRepositories.clear();
			this.hmRepositories=null;
		}
	}
	
	public Component searchComponent(String id) 
			throws XPathExpressionException, ParserConfigurationException, 
			       SAXException, IOException {
		// iterate over all registries in order to find the given component
		Iterator<String> it=this.hmRepositories.keySet().iterator();
		while(it.hasNext()) {
			String sRegistryName=it.next();
			Repository objRepository=this.hmRepositories.get(sRegistryName);

			Component comp=null;
			if(objRepository instanceof URLRepository) {
				comp=((URLRepository)objRepository).loadPart(id);
			} else if(objRepository instanceof XMLFileRepository) {
				comp=((XMLFileRepository)objRepository).loadComponent(id);
			}
			
			if(null!=comp) {
				return comp;
			} 
		}
		
		return null;
	}
	
	public ArrayList<Module> getModules() {
		ArrayList<Component> lstComponents = this.getComponents();
		ArrayList<Module> lstModules = new ArrayList<Module>();
		for(int i=0;i<lstComponents.size();i++) {
			Component objComponent = lstComponents.get(i);
			if(objComponent instanceof Module) {
				lstModules.add((Module)objComponent);
			}
		}
		return lstModules;
	}
	
}
