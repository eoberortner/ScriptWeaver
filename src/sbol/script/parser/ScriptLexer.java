// $ANTLR 3.4 /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g 2012-12-05 18:04:23

package sbol.script.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ScriptLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ScriptLexer() {} 
    public ScriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ScriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:6:7: ( ',' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:6:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:7:7: ( '.' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:7:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:8:7: ( 'Genbank' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:8:9: 'Genbank'
            {
            match("Genbank"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:9:7: ( 'SBOL' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:9:9: 'SBOL'
            {
            match("SBOL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:10:7: ( 'XML' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:10:9: 'XML'
            {
            match("XML"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:11:7: ( 'all' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:11:9: 'all'
            {
            match("all"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:12:7: ( 'and' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:12:9: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:13:7: ( 'components' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:13:9: 'components'
            {
            match("components"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:14:7: ( 'construct' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:14:9: 'construct'
            {
            match("construct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:15:7: ( 'export' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:15:9: 'export'
            {
            match("export"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:16:7: ( 'express' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:16:9: 'express'
            {
            match("express"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:17:7: ( 'from' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:17:9: 'from'
            {
            match("from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:18:7: ( 'module' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:18:9: 'module'
            {
            match("module"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:19:7: ( 'modules' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:19:9: 'modules'
            {
            match("modules"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:20:7: ( 'or' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:20:9: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:21:7: ( 'to' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:21:9: 'to'
            {
            match("to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:22:7: ( 'use' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:22:9: 'use'
            {
            match("use"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:23:7: ( 'with' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:23:9: 'with'
            {
            match("with"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:148:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:148:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:148:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:147:5: ( ( '0' .. '9' )+ )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:147:7: ( '0' .. '9' )+
            {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:147:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:151:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:151:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:151:9: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    match('.'); 

                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:151:25: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:151:37: ( EXPONENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:151:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:152:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:152:13: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:152:25: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:152:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:153:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:153:9: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:157:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='/') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='/') ) {
                    alt13=1;
                }
                else if ( (LA13_1=='*') ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:157:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:157:14: (~ ( '\\n' | '\\r' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:157:28: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:157:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:158:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:158:14: ( options {greedy=false; } : . )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='*') ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1=='/') ) {
                                alt12=2;
                            }
                            else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
                                alt12=1;
                            }


                        }
                        else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:158:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:161:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:161:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:169:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:169:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:169:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:169:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:169:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:172:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:172:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:172:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                alt15=1;
            }
            else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:172:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:172:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:177:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:177:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:177:22: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:177:33: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:180:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:184:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt18=1;
                    }
                    break;
                case 'u':
                    {
                    alt18=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:184:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:185:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:186:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:191:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
                        int LA19_4 = input.LA(4);

                        if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;
                        }
                    }
                    else {
                        alt19=3;
                    }
                }
                else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:191:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:192:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:193:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:198:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:198:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
        int alt20=25;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:10: T__16
                {
                mT__16(); 


                }
                break;
            case 2 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:16: T__17
                {
                mT__17(); 


                }
                break;
            case 3 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:22: T__18
                {
                mT__18(); 


                }
                break;
            case 4 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:28: T__19
                {
                mT__19(); 


                }
                break;
            case 5 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:34: T__20
                {
                mT__20(); 


                }
                break;
            case 6 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:40: T__21
                {
                mT__21(); 


                }
                break;
            case 7 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:46: T__22
                {
                mT__22(); 


                }
                break;
            case 8 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:52: T__23
                {
                mT__23(); 


                }
                break;
            case 9 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:58: T__24
                {
                mT__24(); 


                }
                break;
            case 10 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:64: T__25
                {
                mT__25(); 


                }
                break;
            case 11 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:70: T__26
                {
                mT__26(); 


                }
                break;
            case 12 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:76: T__27
                {
                mT__27(); 


                }
                break;
            case 13 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:82: T__28
                {
                mT__28(); 


                }
                break;
            case 14 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:88: T__29
                {
                mT__29(); 


                }
                break;
            case 15 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:94: T__30
                {
                mT__30(); 


                }
                break;
            case 16 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:100: T__31
                {
                mT__31(); 


                }
                break;
            case 17 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:106: T__32
                {
                mT__32(); 


                }
                break;
            case 18 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:112: T__33
                {
                mT__33(); 


                }
                break;
            case 19 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:118: ID
                {
                mID(); 


                }
                break;
            case 20 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:121: INT
                {
                mINT(); 


                }
                break;
            case 21 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:125: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 22 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:131: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 23 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:139: WS
                {
                mWS(); 


                }
                break;
            case 24 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:142: STRING
                {
                mSTRING(); 


                }
                break;
            case 25 :
                // /Users/ernstl/PostDoc/BU/SBOL/Script/coding/ScriptWeaver/grammar/Script.g:1:149: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA9_eotS =
        "\5\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\2\56\3\uffff";
    static final String DFA9_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "150:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA20_eotS =
        "\2\uffff\1\25\14\17\1\uffff\1\44\6\uffff\11\17\1\57\1\60\2\17\1"+
        "\uffff\2\17\1\65\1\66\1\67\5\17\2\uffff\1\76\2\17\1\101\3\uffff"+
        "\4\17\1\106\1\17\1\uffff\1\110\1\17\1\uffff\4\17\1\uffff\1\17\1"+
        "\uffff\3\17\1\122\1\17\1\125\1\126\2\17\1\uffff\1\131\1\132\2\uffff"+
        "\2\17\2\uffff\1\17\1\136\1\137\2\uffff";
    static final String DFA20_eofS =
        "\140\uffff";
    static final String DFA20_minS =
        "\1\11\1\uffff\1\60\1\145\1\102\1\115\1\154\1\157\1\170\1\162\1\157"+
        "\1\162\1\157\1\163\1\151\1\uffff\1\56\6\uffff\1\156\1\117\1\114"+
        "\1\154\1\144\1\155\1\160\1\157\1\144\2\60\1\145\1\164\1\uffff\1"+
        "\142\1\114\3\60\1\160\1\163\1\157\1\155\1\165\2\uffff\1\60\1\150"+
        "\1\141\1\60\3\uffff\1\157\1\164\1\162\1\145\1\60\1\154\1\uffff\1"+
        "\60\1\156\1\uffff\1\156\1\162\1\164\1\163\1\uffff\1\145\1\uffff"+
        "\1\153\1\145\1\165\1\60\1\163\2\60\1\156\1\143\1\uffff\2\60\2\uffff"+
        "\2\164\2\uffff\1\163\2\60\2\uffff";
    static final String DFA20_maxS =
        "\1\172\1\uffff\1\71\1\145\1\102\1\115\1\156\1\157\1\170\1\162\1"+
        "\157\1\162\1\157\1\163\1\151\1\uffff\1\145\6\uffff\1\156\1\117\1"+
        "\114\1\154\1\144\1\156\1\160\1\157\1\144\2\172\1\145\1\164\1\uffff"+
        "\1\142\1\114\3\172\1\160\1\163\1\162\1\155\1\165\2\uffff\1\172\1"+
        "\150\1\141\1\172\3\uffff\1\157\1\164\1\162\1\145\1\172\1\154\1\uffff"+
        "\1\172\1\156\1\uffff\1\156\1\162\1\164\1\163\1\uffff\1\145\1\uffff"+
        "\1\153\1\145\1\165\1\172\1\163\2\172\1\156\1\143\1\uffff\2\172\2"+
        "\uffff\2\164\2\uffff\1\163\2\172\2\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\15\uffff\1\23\1\uffff\1\26\1\27\1\30\1\31\1\2\1\25"+
        "\15\uffff\1\24\12\uffff\1\17\1\20\4\uffff\1\5\1\6\1\7\6\uffff\1"+
        "\21\2\uffff\1\4\4\uffff\1\14\1\uffff\1\22\11\uffff\1\12\2\uffff"+
        "\1\15\1\3\2\uffff\1\13\1\16\3\uffff\1\11\1\10";
    static final String DFA20_specialS =
        "\140\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\22\2\uffff\1\22\22\uffff\1\22\1\uffff\1\23\4\uffff\1\24\4"+
            "\uffff\1\1\1\uffff\1\2\1\21\12\20\7\uffff\6\17\1\3\13\17\1\4"+
            "\4\17\1\5\2\17\4\uffff\1\17\1\uffff\1\6\1\17\1\7\1\17\1\10\1"+
            "\11\6\17\1\12\1\17\1\13\4\17\1\14\1\15\1\17\1\16\3\17",
            "",
            "\12\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32\1\uffff\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "",
            "\1\26\1\uffff\12\20\13\uffff\1\26\37\uffff\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\61",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\70",
            "\1\71",
            "\1\72\2\uffff\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\77",
            "\1\100",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\107",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\123",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\22\17\1\124\7\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\127",
            "\1\130",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "",
            "\1\133",
            "\1\134",
            "",
            "",
            "\1\135",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}