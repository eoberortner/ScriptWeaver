// $ANTLR 3.4 /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g 2012-12-05 18:04:23

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


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "','", "'.'", "'Genbank'", "'SBOL'", "'XML'", "'all'", "'and'", "'components'", "'construct'", "'export'", "'express'", "'from'", "'module'", "'modules'", "'or'", "'to'", "'use'", "'with'"
    };

    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ESC_SEQ=6;
    public static final int EXPONENT=7;
    public static final int FLOAT=8;
    public static final int HEX_DIGIT=9;
    public static final int ID=10;
    public static final int INT=11;
    public static final int OCTAL_ESC=12;
    public static final int STRING=13;
    public static final int UNICODE_ESC=14;
    public static final int WS=15;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ScriptParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ScriptParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ScriptParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g"; }


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



    // $ANTLR start "prog"
    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:59:1: prog : ( statement )+ ;
    public final void prog() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:60:2: ( ( statement )+ )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:60:4: ( statement )+
            {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:60:4: ( statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 24 && LA1_0 <= 26)||LA1_0==32) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:60:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_prog35);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "statement"
    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:63:1: statement : ( use '.' | construct '.' | express '.' | export '.' );
    public final void statement() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:64:2: ( use '.' | construct '.' | express '.' | export '.' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:64:4: use '.'
                    {
                    pushFollow(FOLLOW_use_in_statement49);
                    use();

                    state._fsp--;


                    match(input,17,FOLLOW_17_in_statement51); 

                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:65:4: construct '.'
                    {
                    pushFollow(FOLLOW_construct_in_statement56);
                    construct();

                    state._fsp--;


                    match(input,17,FOLLOW_17_in_statement58); 

                    }
                    break;
                case 3 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:66:4: express '.'
                    {
                    pushFollow(FOLLOW_express_in_statement63);
                    express();

                    state._fsp--;


                    match(input,17,FOLLOW_17_in_statement65); 

                    }
                    break;
                case 4 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:67:4: export '.'
                    {
                    pushFollow(FOLLOW_export_in_statement70);
                    export();

                    state._fsp--;


                    match(input,17,FOLLOW_17_in_statement72); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "use"
    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:71:1: use : 'use' whatToUse 'from' listOfSources ;
    public final void use() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:71:5: ( 'use' whatToUse 'from' listOfSources )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:71:7: 'use' whatToUse 'from' listOfSources
            {
            match(input,32,FOLLOW_32_in_use84); 

            pushFollow(FOLLOW_whatToUse_in_use86);
            whatToUse();

            state._fsp--;


            match(input,27,FOLLOW_27_in_use88); 

            pushFollow(FOLLOW_listOfSources_in_use90);
            listOfSources();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "use"



    // $ANTLR start "whatToUse"
    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:74:1: whatToUse : 'components' ;
    public final void whatToUse() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:75:2: ( 'components' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:75:4: 'components'
            {
            match(input,23,FOLLOW_23_in_whatToUse101); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "whatToUse"



    // $ANTLR start "listOfSources"
    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:78:1: listOfSources : nameToken= ID ( '.' domainToken= ID )? ( ( 'and' | 'or' ) listOfSources )* ;
    public final void listOfSources() throws RecognitionException {
        Token nameToken=null;
        Token domainToken=null;

        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:79:2: (nameToken= ID ( '.' domainToken= ID )? ( ( 'and' | 'or' ) listOfSources )* )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:79:4: nameToken= ID ( '.' domainToken= ID )? ( ( 'and' | 'or' ) listOfSources )*
            {
            nameToken=(Token)match(input,ID,FOLLOW_ID_in_listOfSources115); 

            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:79:17: ( '.' domainToken= ID )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==ID) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:79:18: '.' domainToken= ID
                    {
                    match(input,17,FOLLOW_17_in_listOfSources118); 

                    domainToken=(Token)match(input,ID,FOLLOW_ID_in_listOfSources122); 

                    }
                    break;

            }


            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:79:39: ( ( 'and' | 'or' ) listOfSources )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22||LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:79:40: ( 'and' | 'or' ) listOfSources
            	    {
            	    if ( input.LA(1)==22||input.LA(1)==30 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_listOfSources_in_listOfSources133);
            	    listOfSources();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);




            String repoID=(nameToken!=null?nameToken.getText():null);
            if(null!=(domainToken!=null?domainToken.getText():null)) {
                repoID+="."+(domainToken!=null?domainToken.getText():null);
            }

            // check if the repository exists
            if(!objSymbolTables.containsRepository(repoID)) {
                // the registry does not exist or is not configured
                System.err.println("The repository "+repoID+" is not defined and/or configured!");
            }
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listOfSources"



    // $ANTLR start "construct"
    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:94:1: construct : 'construct' constructToken= whatToConstruct nameToken= ID 'with' useToken= whatToUse listOfIDs[objModule] ;
    public final void construct() throws RecognitionException {
        Token nameToken=null;
        ScriptParser.whatToConstruct_return constructToken =null;


        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:95:2: ( 'construct' constructToken= whatToConstruct nameToken= ID 'with' useToken= whatToUse listOfIDs[objModule] )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:95:4: 'construct' constructToken= whatToConstruct nameToken= ID 'with' useToken= whatToUse listOfIDs[objModule]
            {
            match(input,24,FOLLOW_24_in_construct150); 

            pushFollow(FOLLOW_whatToConstruct_in_construct154);
            constructToken=whatToConstruct();

            state._fsp--;


            nameToken=(Token)match(input,ID,FOLLOW_ID_in_construct158); 


            Module objModule=null;	
            if("module".equals((constructToken!=null?input.toString(constructToken.start,constructToken.stop):null))) {
                if(!objSymbolTables.containsComponent((nameToken!=null?nameToken.getText():null))) {
                    objModule = new Module((nameToken!=null?nameToken.getText():null));
                    objSymbolTables.put(objModule);
                } else {
                    System.err.println("Module "+(nameToken!=null?nameToken.getText():null)+" is defined already!");
                }
            }	
            	

            match(input,33,FOLLOW_33_in_construct162); 

            pushFollow(FOLLOW_whatToUse_in_construct166);
            whatToUse();

            state._fsp--;


            pushFollow(FOLLOW_listOfIDs_in_construct168);
            listOfIDs(objModule);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "construct"


    public static class whatToConstruct_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "whatToConstruct"
    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:108:1: whatToConstruct : 'module' ;
    public final ScriptParser.whatToConstruct_return whatToConstruct() throws RecognitionException {
        ScriptParser.whatToConstruct_return retval = new ScriptParser.whatToConstruct_return();
        retval.start = input.LT(1);


        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:109:2: ( 'module' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:109:4: 'module'
            {
            match(input,28,FOLLOW_28_in_whatToConstruct181); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whatToConstruct"



    // $ANTLR start "listOfIDs"
    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:112:1: listOfIDs[Component objComponent] : idToken= ID ( ',' listOfIDs[objComponent] )* ;
    public final void listOfIDs(Component objComponent) throws RecognitionException {
        Token idToken=null;

        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:113:2: (idToken= ID ( ',' listOfIDs[objComponent] )* )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:113:4: idToken= ID ( ',' listOfIDs[objComponent] )*
            {
            idToken=(Token)match(input,ID,FOLLOW_ID_in_listOfIDs195); 


            if(objComponent instanceof Module) {
                Module m = (Module)objComponent;
                Component c = cs.search(objSymbolTables, (idToken!=null?idToken.getText():null));
                if(null!=c) {
                    m.addComponent(c);
                }
            }	
            	

            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:121:4: ( ',' listOfIDs[objComponent] )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:121:5: ',' listOfIDs[objComponent]
            	    {
            	    match(input,16,FOLLOW_16_in_listOfIDs200); 

            	    pushFollow(FOLLOW_listOfIDs_in_listOfIDs202);
            	    listOfIDs(objComponent);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (Exception e) {

            e.printStackTrace();	
            	
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "listOfIDs"



    // $ANTLR start "express"
    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:127:1: express : 'express' ;
    public final void express() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:127:9: ( 'express' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:127:11: 'express'
            {
            match(input,26,FOLLOW_26_in_express223); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "express"



    // $ANTLR start "export"
    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:130:1: export : ( 'export' 'all' 'modules' 'to' whereToExport | 'export' 'module' moduleToken= ID 'to' whereToExport );
    public final void export() throws RecognitionException {
        Token moduleToken=null;

        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:130:8: ( 'export' 'all' 'modules' 'to' whereToExport | 'export' 'module' moduleToken= ID 'to' whereToExport )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==21) ) {
                    alt6=1;
                }
                else if ( (LA6_1==28) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:130:10: 'export' 'all' 'modules' 'to' whereToExport
                    {
                    match(input,25,FOLLOW_25_in_export235); 

                    match(input,21,FOLLOW_21_in_export237); 

                    match(input,29,FOLLOW_29_in_export239); 

                    match(input,31,FOLLOW_31_in_export241); 

                    pushFollow(FOLLOW_whereToExport_in_export243);
                    whereToExport();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:131:4: 'export' 'module' moduleToken= ID 'to' whereToExport
                    {
                    match(input,25,FOLLOW_25_in_export248); 

                    match(input,28,FOLLOW_28_in_export250); 

                    moduleToken=(Token)match(input,ID,FOLLOW_ID_in_export254); 

                    match(input,31,FOLLOW_31_in_export256); 

                    pushFollow(FOLLOW_whereToExport_in_export258);
                    whereToExport();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "export"



    // $ANTLR start "whereToExport"
    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:134:1: whereToExport : ( 'SBOL' | 'Genbank' | 'XML' );
    public final void whereToExport() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:135:2: ( 'SBOL' | 'Genbank' | 'XML' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:
            {
            if ( (input.LA(1) >= 18 && input.LA(1) <= 20) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "whereToExport"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_prog35 = new BitSet(new long[]{0x0000000107000002L});
    public static final BitSet FOLLOW_use_in_statement49 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_statement51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_construct_in_statement56 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_statement58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_express_in_statement63 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_statement65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_export_in_statement70 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_statement72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_use84 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_whatToUse_in_use86 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_use88 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_listOfSources_in_use90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_whatToUse101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_listOfSources115 = new BitSet(new long[]{0x0000000040420002L});
    public static final BitSet FOLLOW_17_in_listOfSources118 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_listOfSources122 = new BitSet(new long[]{0x0000000040400002L});
    public static final BitSet FOLLOW_set_in_listOfSources127 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_listOfSources_in_listOfSources133 = new BitSet(new long[]{0x0000000040400002L});
    public static final BitSet FOLLOW_24_in_construct150 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_whatToConstruct_in_construct154 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_construct158 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_construct162 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_whatToUse_in_construct166 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_listOfIDs_in_construct168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_whatToConstruct181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_listOfIDs195 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_listOfIDs200 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_listOfIDs_in_listOfIDs202 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_26_in_express223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_export235 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_export237 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_export239 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_export241 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_whereToExport_in_export243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_export248 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_export250 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_export254 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_export256 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_whereToExport_in_export258 = new BitSet(new long[]{0x0000000000000002L});

}