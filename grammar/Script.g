grammar Script;


@header {
package sbol.script.parser;

import java.util.HashMap;
import java.util.Stack;
import java.util.Set;
import java.util.Iterator;
import java.util.Random;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import sbol.script.dom.*;
import sbol.script.repository.*;
import sbol.script.util.*;
import sbol.script.util.xml.*;
import sbol.script.util.genbank.*;
}

@lexer::header {
package sbol.script.parser;
}

@members {
private ComponentSearcher cs;
private SymbolTables objSymbolTables;

public void init() 
        throws Exception {
    this.cs = new ComponentSearcher();
    this.objSymbolTables = new SymbolTables();

    List<Repository> lst = RepositoryLoader.load();
    for(Repository reg:lst) {
        this.objSymbolTables.put(reg);
    }
}

public List<Module> getModules() {
    if(null != objSymbolTables) {
        return objSymbolTables.getModules();
    }
    return (List<Module>)null;
}

public void cleanUp() {
    if(null != objSymbolTables) {
        objSymbolTables.cleanUp();
        objSymbolTables = null;
    }
    
    this.cs = null;
}
}

prog	
	:	(statement)+
	;
	
statement
	:	use '.'
	|	construct '.'
	|	express '.'
	|	export '.'
	;
	

use	:	'use' whatToUse 'from' listOfSources
	;

whatToUse
	:	'components'
	;
	
listOfSources
	:	nameToken=ID ('.' domainToken=ID)? (('and'|'or') listOfSources)* {

String repoID=$nameToken.text;
if(null!=$domainToken.text) {
    repoID+="."+$domainToken.text;
}

// check if the repository exists
if(!objSymbolTables.containsRepository(repoID)) {
    // the registry does not exist or is not configured
    System.err.println("The repository "+repoID+" is not defined and/or configured!");
}
	}
	;
		
construct
	:	'construct' constructToken=whatToConstruct nameToken=ID {
Module objModule=null;	
if("module".equals($constructToken.text)) {
    if(!objSymbolTables.containsComponent($nameToken.text)) {
        objModule = new Module($nameToken.text);
        objSymbolTables.put(objModule);
    } else {
        System.err.println("Module "+$nameToken.text+" is defined already!");
    }
}	
	}	'with' useToken=whatToUse listOfIDs[objModule] 
	;

whatToConstruct
	:	'module'
	;

listOfIDs[Component objComponent]
	:	idToken=ID {
if(objComponent instanceof Module) {
    Module m = (Module)objComponent;
    Component c = cs.search(objSymbolTables, $idToken.text);
    if(null!=c) {
        m.addComponent(c);
    }
}	
	}	(',' listOfIDs[objComponent])* 
	;
	catch[Exception e] {
e.printStackTrace();	
	}
	
express	:	'express'
	;
		
export	:	'export' 'all' 'modules' 'to' whereToExport
	|	'export' 'module' moduleToken=ID 'to' whereToExport
	;
	
whereToExport
	:	'SBOL'
	|	'Genbank'
	|	'XML'
	;
					
/*********************
**** LEXER RULES ****		
*********************/

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
