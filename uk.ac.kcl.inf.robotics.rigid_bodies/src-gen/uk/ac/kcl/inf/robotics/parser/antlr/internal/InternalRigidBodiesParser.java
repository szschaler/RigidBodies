package uk.ac.kcl.inf.robotics.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.robotics.services.RigidBodiesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRigidBodiesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'world'", "'{'", "'gravity'", "'}'", "'system'", "'body'", "'local'", "'frame'", "'orientation'", "'position'", "'mass'", "'value'", "'inertia'", "'joint'", "':'", "'between'", "'('", "'with'", "'relative'", "'transformation'", "')'", "'and'", "'colocate'", "'vector'", "','", "'m3'", "'['", "']'", "'m4'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_REAL=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalRigidBodiesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRigidBodiesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRigidBodiesParser.tokenNames; }
    public String getGrammarFileName() { return "../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g"; }



     	private RigidBodiesGrammarAccess grammarAccess;
     	
        public InternalRigidBodiesParser(TokenStream input, RigidBodiesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected RigidBodiesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_defs_0_0 = null;

        EObject lv_world_1_0 = null;

        EObject lv_bodies_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:79:28: ( ( ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+ ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:80:1: ( ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+ )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:80:1: ( ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+ )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:80:2: ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:80:2: ( (lv_defs_0_0= ruleInitialDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28||LA1_0==35||(LA1_0>=37 && LA1_0<=38)||LA1_0==40) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:81:1: (lv_defs_0_0= ruleInitialDefinition )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:81:1: (lv_defs_0_0= ruleInitialDefinition )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:82:3: lv_defs_0_0= ruleInitialDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDefsInitialDefinitionParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInitialDefinition_in_ruleModel131);
            	    lv_defs_0_0=ruleInitialDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"defs",
            	            		lv_defs_0_0, 
            	            		"InitialDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:98:3: ( (lv_world_1_0= ruleEnvironment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:99:1: (lv_world_1_0= ruleEnvironment )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:99:1: (lv_world_1_0= ruleEnvironment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:100:3: lv_world_1_0= ruleEnvironment
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getWorldEnvironmentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEnvironment_in_ruleModel153);
            lv_world_1_0=ruleEnvironment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"world",
                    		lv_world_1_0, 
                    		"Environment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:116:2: ( (lv_bodies_2_0= ruleSystem ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:117:1: (lv_bodies_2_0= ruleSystem )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:117:1: (lv_bodies_2_0= ruleSystem )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:118:3: lv_bodies_2_0= ruleSystem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getBodiesSystemParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSystem_in_ruleModel174);
            	    lv_bodies_2_0=ruleSystem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bodies",
            	            		lv_bodies_2_0, 
            	            		"System");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInitialDefinition"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:142:1: entryRuleInitialDefinition returns [EObject current=null] : iv_ruleInitialDefinition= ruleInitialDefinition EOF ;
    public final EObject entryRuleInitialDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialDefinition = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:143:2: (iv_ruleInitialDefinition= ruleInitialDefinition EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:144:2: iv_ruleInitialDefinition= ruleInitialDefinition EOF
            {
             newCompositeNode(grammarAccess.getInitialDefinitionRule()); 
            pushFollow(FOLLOW_ruleInitialDefinition_in_entryRuleInitialDefinition211);
            iv_ruleInitialDefinition=ruleInitialDefinition();

            state._fsp--;

             current =iv_ruleInitialDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialDefinition221); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialDefinition"


    // $ANTLR start "ruleInitialDefinition"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:151:1: ruleInitialDefinition returns [EObject current=null] : (this_MatrixDef_0= ruleMatrixDef | this_BaseVector3_1= ruleBaseVector3 ) ;
    public final EObject ruleInitialDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_MatrixDef_0 = null;

        EObject this_BaseVector3_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:154:28: ( (this_MatrixDef_0= ruleMatrixDef | this_BaseVector3_1= ruleBaseVector3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:155:1: (this_MatrixDef_0= ruleMatrixDef | this_BaseVector3_1= ruleBaseVector3 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:155:1: (this_MatrixDef_0= ruleMatrixDef | this_BaseVector3_1= ruleBaseVector3 )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=37 && LA3_0<=38)||LA3_0==40) ) {
                alt3=1;
            }
            else if ( (LA3_0==28||LA3_0==35) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:156:5: this_MatrixDef_0= ruleMatrixDef
                    {
                     
                            newCompositeNode(grammarAccess.getInitialDefinitionAccess().getMatrixDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMatrixDef_in_ruleInitialDefinition268);
                    this_MatrixDef_0=ruleMatrixDef();

                    state._fsp--;

                     
                            current = this_MatrixDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:166:5: this_BaseVector3_1= ruleBaseVector3
                    {
                     
                            newCompositeNode(grammarAccess.getInitialDefinitionAccess().getBaseVector3ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBaseVector3_in_ruleInitialDefinition295);
                    this_BaseVector3_1=ruleBaseVector3();

                    state._fsp--;

                     
                            current = this_BaseVector3_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialDefinition"


    // $ANTLR start "entryRuleEnvironment"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:182:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:183:2: (iv_ruleEnvironment= ruleEnvironment EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:184:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_ruleEnvironment_in_entryRuleEnvironment330);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironment340); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:191:1: ruleEnvironment returns [EObject current=null] : (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleVector3 ) ) otherlv_4= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_gravity_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:194:28: ( (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleVector3 ) ) otherlv_4= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:195:1: (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleVector3 ) ) otherlv_4= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:195:1: (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleVector3 ) ) otherlv_4= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:195:3: otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleVector3 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleEnvironment377); 

                	newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getWorldKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEnvironment389); 

                	newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEnvironment401); 

                	newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getGravityKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:207:1: ( (lv_gravity_3_0= ruleVector3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:208:1: (lv_gravity_3_0= ruleVector3 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:208:1: (lv_gravity_3_0= ruleVector3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:209:3: lv_gravity_3_0= ruleVector3
            {
             
            	        newCompositeNode(grammarAccess.getEnvironmentAccess().getGravityVector3ParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVector3_in_ruleEnvironment422);
            lv_gravity_3_0=ruleVector3();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	        }
                   		set(
                   			current, 
                   			"gravity",
                    		lv_gravity_3_0, 
                    		"Vector3");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEnvironment434); 

                	newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleSystem"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:237:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:238:2: (iv_ruleSystem= ruleSystem EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:239:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem470);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem480); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:246:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:249:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:250:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:250:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:250:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSystem517); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:254:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:255:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:255:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:256:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem534); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSystem551); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:276:1: ( (lv_elements_3_0= ruleSystemElement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||LA4_0==25||LA4_0==34) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:277:1: (lv_elements_3_0= ruleSystemElement )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:277:1: (lv_elements_3_0= ruleSystemElement )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:278:3: lv_elements_3_0= ruleSystemElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getElementsSystemElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSystemElement_in_ruleSystem572);
            	    lv_elements_3_0=ruleSystemElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"SystemElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleSystem585); 

                	newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleSystemElement"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:306:1: entryRuleSystemElement returns [EObject current=null] : iv_ruleSystemElement= ruleSystemElement EOF ;
    public final EObject entryRuleSystemElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemElement = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:307:2: (iv_ruleSystemElement= ruleSystemElement EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:308:2: iv_ruleSystemElement= ruleSystemElement EOF
            {
             newCompositeNode(grammarAccess.getSystemElementRule()); 
            pushFollow(FOLLOW_ruleSystemElement_in_entryRuleSystemElement621);
            iv_ruleSystemElement=ruleSystemElement();

            state._fsp--;

             current =iv_ruleSystemElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemElement631); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemElement"


    // $ANTLR start "ruleSystemElement"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:315:1: ruleSystemElement returns [EObject current=null] : (this_Body_0= ruleBody | this_Joint_1= ruleJoint | this_Constraint_2= ruleConstraint ) ;
    public final EObject ruleSystemElement() throws RecognitionException {
        EObject current = null;

        EObject this_Body_0 = null;

        EObject this_Joint_1 = null;

        EObject this_Constraint_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:318:28: ( (this_Body_0= ruleBody | this_Joint_1= ruleJoint | this_Constraint_2= ruleConstraint ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:319:1: (this_Body_0= ruleBody | this_Joint_1= ruleJoint | this_Constraint_2= ruleConstraint )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:319:1: (this_Body_0= ruleBody | this_Joint_1= ruleJoint | this_Constraint_2= ruleConstraint )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 34:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:320:5: this_Body_0= ruleBody
                    {
                     
                            newCompositeNode(grammarAccess.getSystemElementAccess().getBodyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBody_in_ruleSystemElement678);
                    this_Body_0=ruleBody();

                    state._fsp--;

                     
                            current = this_Body_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:330:5: this_Joint_1= ruleJoint
                    {
                     
                            newCompositeNode(grammarAccess.getSystemElementAccess().getJointParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleJoint_in_ruleSystemElement705);
                    this_Joint_1=ruleJoint();

                    state._fsp--;

                     
                            current = this_Joint_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:340:5: this_Constraint_2= ruleConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getSystemElementAccess().getConstraintParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConstraint_in_ruleSystemElement732);
                    this_Constraint_2=ruleConstraint();

                    state._fsp--;

                     
                            current = this_Constraint_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemElement"


    // $ANTLR start "entryRuleBody"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:356:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:357:2: (iv_ruleBody= ruleBody EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:358:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody767);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody777); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:365:1: ruleBody returns [EObject current=null] : (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_frame_3_0= ruleLocalFrame ) ) ( (lv_mass_4_0= ruleMass ) ) otherlv_5= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_frame_3_0 = null;

        EObject lv_mass_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:368:28: ( (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_frame_3_0= ruleLocalFrame ) ) ( (lv_mass_4_0= ruleMass ) ) otherlv_5= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:369:1: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_frame_3_0= ruleLocalFrame ) ) ( (lv_mass_4_0= ruleMass ) ) otherlv_5= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:369:1: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_frame_3_0= ruleLocalFrame ) ) ( (lv_mass_4_0= ruleMass ) ) otherlv_5= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:369:3: otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_frame_3_0= ruleLocalFrame ) ) ( (lv_mass_4_0= ruleMass ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleBody814); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getBodyKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:373:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:374:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:374:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:375:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody831); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBodyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleBody848); 

                	newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:395:1: ( (lv_frame_3_0= ruleLocalFrame ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:396:1: (lv_frame_3_0= ruleLocalFrame )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:396:1: (lv_frame_3_0= ruleLocalFrame )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:397:3: lv_frame_3_0= ruleLocalFrame
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getFrameLocalFrameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLocalFrame_in_ruleBody869);
            lv_frame_3_0=ruleLocalFrame();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		set(
                   			current, 
                   			"frame",
                    		lv_frame_3_0, 
                    		"LocalFrame");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:413:2: ( (lv_mass_4_0= ruleMass ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:414:1: (lv_mass_4_0= ruleMass )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:414:1: (lv_mass_4_0= ruleMass )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:415:3: lv_mass_4_0= ruleMass
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getMassMassParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMass_in_ruleBody890);
            lv_mass_4_0=ruleMass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		set(
                   			current, 
                   			"mass",
                    		lv_mass_4_0, 
                    		"Mass");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleBody902); 

                	newLeafNode(otherlv_5, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleLocalFrame"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:443:1: entryRuleLocalFrame returns [EObject current=null] : iv_ruleLocalFrame= ruleLocalFrame EOF ;
    public final EObject entryRuleLocalFrame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalFrame = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:444:2: (iv_ruleLocalFrame= ruleLocalFrame EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:445:2: iv_ruleLocalFrame= ruleLocalFrame EOF
            {
             newCompositeNode(grammarAccess.getLocalFrameRule()); 
            pushFollow(FOLLOW_ruleLocalFrame_in_entryRuleLocalFrame938);
            iv_ruleLocalFrame=ruleLocalFrame();

            state._fsp--;

             current =iv_ruleLocalFrame; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalFrame948); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalFrame"


    // $ANTLR start "ruleLocalFrame"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:452:1: ruleLocalFrame returns [EObject current=null] : (otherlv_0= 'local' otherlv_1= 'frame' otherlv_2= '{' otherlv_3= 'orientation' ( (lv_orientation_4_0= ruleMatrix3X3 ) ) otherlv_5= 'position' ( (lv_position_6_0= ruleVector3 ) ) otherlv_7= '}' ) ;
    public final EObject ruleLocalFrame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_orientation_4_0 = null;

        EObject lv_position_6_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:455:28: ( (otherlv_0= 'local' otherlv_1= 'frame' otherlv_2= '{' otherlv_3= 'orientation' ( (lv_orientation_4_0= ruleMatrix3X3 ) ) otherlv_5= 'position' ( (lv_position_6_0= ruleVector3 ) ) otherlv_7= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:456:1: (otherlv_0= 'local' otherlv_1= 'frame' otherlv_2= '{' otherlv_3= 'orientation' ( (lv_orientation_4_0= ruleMatrix3X3 ) ) otherlv_5= 'position' ( (lv_position_6_0= ruleVector3 ) ) otherlv_7= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:456:1: (otherlv_0= 'local' otherlv_1= 'frame' otherlv_2= '{' otherlv_3= 'orientation' ( (lv_orientation_4_0= ruleMatrix3X3 ) ) otherlv_5= 'position' ( (lv_position_6_0= ruleVector3 ) ) otherlv_7= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:456:3: otherlv_0= 'local' otherlv_1= 'frame' otherlv_2= '{' otherlv_3= 'orientation' ( (lv_orientation_4_0= ruleMatrix3X3 ) ) otherlv_5= 'position' ( (lv_position_6_0= ruleVector3 ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleLocalFrame985); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalFrameAccess().getLocalKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleLocalFrame997); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalFrameAccess().getFrameKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleLocalFrame1009); 

                	newLeafNode(otherlv_2, grammarAccess.getLocalFrameAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleLocalFrame1021); 

                	newLeafNode(otherlv_3, grammarAccess.getLocalFrameAccess().getOrientationKeyword_3());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:472:1: ( (lv_orientation_4_0= ruleMatrix3X3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:473:1: (lv_orientation_4_0= ruleMatrix3X3 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:473:1: (lv_orientation_4_0= ruleMatrix3X3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:474:3: lv_orientation_4_0= ruleMatrix3X3
            {
             
            	        newCompositeNode(grammarAccess.getLocalFrameAccess().getOrientationMatrix3X3ParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix3X3_in_ruleLocalFrame1042);
            lv_orientation_4_0=ruleMatrix3X3();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocalFrameRule());
            	        }
                   		set(
                   			current, 
                   			"orientation",
                    		lv_orientation_4_0, 
                    		"Matrix3X3");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleLocalFrame1054); 

                	newLeafNode(otherlv_5, grammarAccess.getLocalFrameAccess().getPositionKeyword_5());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:494:1: ( (lv_position_6_0= ruleVector3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:495:1: (lv_position_6_0= ruleVector3 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:495:1: (lv_position_6_0= ruleVector3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:496:3: lv_position_6_0= ruleVector3
            {
             
            	        newCompositeNode(grammarAccess.getLocalFrameAccess().getPositionVector3ParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleVector3_in_ruleLocalFrame1075);
            lv_position_6_0=ruleVector3();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocalFrameRule());
            	        }
                   		set(
                   			current, 
                   			"position",
                    		lv_position_6_0, 
                    		"Vector3");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleLocalFrame1087); 

                	newLeafNode(otherlv_7, grammarAccess.getLocalFrameAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalFrame"


    // $ANTLR start "entryRuleMass"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:524:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:525:2: (iv_ruleMass= ruleMass EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:526:2: iv_ruleMass= ruleMass EOF
            {
             newCompositeNode(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_ruleMass_in_entryRuleMass1123);
            iv_ruleMass=ruleMass();

            state._fsp--;

             current =iv_ruleMass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMass1133); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:533:1: ruleMass returns [EObject current=null] : (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= RULE_REAL ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleVector3 ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix3X3 ) ) otherlv_8= '}' ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_position_5_0 = null;

        EObject lv_inertia_7_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:536:28: ( (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= RULE_REAL ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleVector3 ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix3X3 ) ) otherlv_8= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:537:1: (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= RULE_REAL ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleVector3 ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix3X3 ) ) otherlv_8= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:537:1: (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= RULE_REAL ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleVector3 ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix3X3 ) ) otherlv_8= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:537:3: otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= RULE_REAL ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleVector3 ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix3X3 ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleMass1170); 

                	newLeafNode(otherlv_0, grammarAccess.getMassAccess().getMassKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleMass1182); 

                	newLeafNode(otherlv_1, grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleMass1194); 

                	newLeafNode(otherlv_2, grammarAccess.getMassAccess().getValueKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:549:1: ( (lv_value_3_0= RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:550:1: (lv_value_3_0= RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:550:1: (lv_value_3_0= RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:551:3: lv_value_3_0= RULE_REAL
            {
            lv_value_3_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleMass1211); 

            			newLeafNode(lv_value_3_0, grammarAccess.getMassAccess().getValueREALTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"REAL");
            	    

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleMass1228); 

                	newLeafNode(otherlv_4, grammarAccess.getMassAccess().getPositionKeyword_4());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:571:1: ( (lv_position_5_0= ruleVector3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:572:1: (lv_position_5_0= ruleVector3 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:572:1: (lv_position_5_0= ruleVector3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:573:3: lv_position_5_0= ruleVector3
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getPositionVector3ParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleVector3_in_ruleMass1249);
            lv_position_5_0=ruleVector3();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMassRule());
            	        }
                   		set(
                   			current, 
                   			"position",
                    		lv_position_5_0, 
                    		"Vector3");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleMass1261); 

                	newLeafNode(otherlv_6, grammarAccess.getMassAccess().getInertiaKeyword_6());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:593:1: ( (lv_inertia_7_0= ruleMatrix3X3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:594:1: (lv_inertia_7_0= ruleMatrix3X3 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:594:1: (lv_inertia_7_0= ruleMatrix3X3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:595:3: lv_inertia_7_0= ruleMatrix3X3
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getInertiaMatrix3X3ParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix3X3_in_ruleMass1282);
            lv_inertia_7_0=ruleMatrix3X3();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMassRule());
            	        }
                   		set(
                   			current, 
                   			"inertia",
                    		lv_inertia_7_0, 
                    		"Matrix3X3");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleMass1294); 

                	newLeafNode(otherlv_8, grammarAccess.getMassAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleJoint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:623:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:624:2: (iv_ruleJoint= ruleJoint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:625:2: iv_ruleJoint= ruleJoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_ruleJoint_in_entryRuleJoint1330);
            iv_ruleJoint=ruleJoint();

            state._fsp--;

             current =iv_ruleJoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoint1340); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:632:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleMatrix4X4 ) ) otherlv_4= 'between' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' otherlv_7= 'with' otherlv_8= 'relative' otherlv_9= 'transformation' ( (lv_relTransformation1_10_0= ruleMatrix4X4 ) ) otherlv_11= ')' otherlv_12= 'and' ( (otherlv_13= RULE_ID ) ) otherlv_14= '(' otherlv_15= 'with' otherlv_16= 'relative' otherlv_17= 'transformation' ( (lv_relTransformation2_18_0= ruleMatrix4X4 ) ) otherlv_19= ')' ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_type_3_0 = null;

        EObject lv_relTransformation1_10_0 = null;

        EObject lv_relTransformation2_18_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:635:28: ( (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleMatrix4X4 ) ) otherlv_4= 'between' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' otherlv_7= 'with' otherlv_8= 'relative' otherlv_9= 'transformation' ( (lv_relTransformation1_10_0= ruleMatrix4X4 ) ) otherlv_11= ')' otherlv_12= 'and' ( (otherlv_13= RULE_ID ) ) otherlv_14= '(' otherlv_15= 'with' otherlv_16= 'relative' otherlv_17= 'transformation' ( (lv_relTransformation2_18_0= ruleMatrix4X4 ) ) otherlv_19= ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:636:1: (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleMatrix4X4 ) ) otherlv_4= 'between' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' otherlv_7= 'with' otherlv_8= 'relative' otherlv_9= 'transformation' ( (lv_relTransformation1_10_0= ruleMatrix4X4 ) ) otherlv_11= ')' otherlv_12= 'and' ( (otherlv_13= RULE_ID ) ) otherlv_14= '(' otherlv_15= 'with' otherlv_16= 'relative' otherlv_17= 'transformation' ( (lv_relTransformation2_18_0= ruleMatrix4X4 ) ) otherlv_19= ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:636:1: (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleMatrix4X4 ) ) otherlv_4= 'between' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' otherlv_7= 'with' otherlv_8= 'relative' otherlv_9= 'transformation' ( (lv_relTransformation1_10_0= ruleMatrix4X4 ) ) otherlv_11= ')' otherlv_12= 'and' ( (otherlv_13= RULE_ID ) ) otherlv_14= '(' otherlv_15= 'with' otherlv_16= 'relative' otherlv_17= 'transformation' ( (lv_relTransformation2_18_0= ruleMatrix4X4 ) ) otherlv_19= ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:636:3: otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleMatrix4X4 ) ) otherlv_4= 'between' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' otherlv_7= 'with' otherlv_8= 'relative' otherlv_9= 'transformation' ( (lv_relTransformation1_10_0= ruleMatrix4X4 ) ) otherlv_11= ')' otherlv_12= 'and' ( (otherlv_13= RULE_ID ) ) otherlv_14= '(' otherlv_15= 'with' otherlv_16= 'relative' otherlv_17= 'transformation' ( (lv_relTransformation2_18_0= ruleMatrix4X4 ) ) otherlv_19= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleJoint1377); 

                	newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:640:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:641:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:641:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:642:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJoint1394); 

            			newLeafNode(lv_name_1_0, grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleJoint1411); 

                	newLeafNode(otherlv_2, grammarAccess.getJointAccess().getColonKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:662:1: ( (lv_type_3_0= ruleMatrix4X4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:663:1: (lv_type_3_0= ruleMatrix4X4 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:663:1: (lv_type_3_0= ruleMatrix4X4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:664:3: lv_type_3_0= ruleMatrix4X4
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getTypeMatrix4X4ParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix4X4_in_ruleJoint1432);
            lv_type_3_0=ruleMatrix4X4();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"Matrix4X4");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleJoint1444); 

                	newLeafNode(otherlv_4, grammarAccess.getJointAccess().getBetweenKeyword_4());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:684:1: ( (otherlv_5= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:685:1: (otherlv_5= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:685:1: (otherlv_5= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:686:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJointRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJoint1464); 

            		newLeafNode(otherlv_5, grammarAccess.getJointAccess().getBody1BodyCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleJoint1476); 

                	newLeafNode(otherlv_6, grammarAccess.getJointAccess().getLeftParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleJoint1488); 

                	newLeafNode(otherlv_7, grammarAccess.getJointAccess().getWithKeyword_7());
                
            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleJoint1500); 

                	newLeafNode(otherlv_8, grammarAccess.getJointAccess().getRelativeKeyword_8());
                
            otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleJoint1512); 

                	newLeafNode(otherlv_9, grammarAccess.getJointAccess().getTransformationKeyword_9());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:713:1: ( (lv_relTransformation1_10_0= ruleMatrix4X4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:714:1: (lv_relTransformation1_10_0= ruleMatrix4X4 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:714:1: (lv_relTransformation1_10_0= ruleMatrix4X4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:715:3: lv_relTransformation1_10_0= ruleMatrix4X4
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getRelTransformation1Matrix4X4ParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix4X4_in_ruleJoint1533);
            lv_relTransformation1_10_0=ruleMatrix4X4();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"relTransformation1",
                    		lv_relTransformation1_10_0, 
                    		"Matrix4X4");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,32,FOLLOW_32_in_ruleJoint1545); 

                	newLeafNode(otherlv_11, grammarAccess.getJointAccess().getRightParenthesisKeyword_11());
                
            otherlv_12=(Token)match(input,33,FOLLOW_33_in_ruleJoint1557); 

                	newLeafNode(otherlv_12, grammarAccess.getJointAccess().getAndKeyword_12());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:739:1: ( (otherlv_13= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:740:1: (otherlv_13= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:740:1: (otherlv_13= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:741:3: otherlv_13= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJointRule());
            	        }
                    
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJoint1577); 

            		newLeafNode(otherlv_13, grammarAccess.getJointAccess().getBody2BodyCrossReference_13_0()); 
            	

            }


            }

            otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleJoint1589); 

                	newLeafNode(otherlv_14, grammarAccess.getJointAccess().getLeftParenthesisKeyword_14());
                
            otherlv_15=(Token)match(input,29,FOLLOW_29_in_ruleJoint1601); 

                	newLeafNode(otherlv_15, grammarAccess.getJointAccess().getWithKeyword_15());
                
            otherlv_16=(Token)match(input,30,FOLLOW_30_in_ruleJoint1613); 

                	newLeafNode(otherlv_16, grammarAccess.getJointAccess().getRelativeKeyword_16());
                
            otherlv_17=(Token)match(input,31,FOLLOW_31_in_ruleJoint1625); 

                	newLeafNode(otherlv_17, grammarAccess.getJointAccess().getTransformationKeyword_17());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:768:1: ( (lv_relTransformation2_18_0= ruleMatrix4X4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:769:1: (lv_relTransformation2_18_0= ruleMatrix4X4 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:769:1: (lv_relTransformation2_18_0= ruleMatrix4X4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:770:3: lv_relTransformation2_18_0= ruleMatrix4X4
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getRelTransformation2Matrix4X4ParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix4X4_in_ruleJoint1646);
            lv_relTransformation2_18_0=ruleMatrix4X4();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"relTransformation2",
                    		lv_relTransformation2_18_0, 
                    		"Matrix4X4");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_19=(Token)match(input,32,FOLLOW_32_in_ruleJoint1658); 

                	newLeafNode(otherlv_19, grammarAccess.getJointAccess().getRightParenthesisKeyword_19());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:798:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:799:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:800:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1694);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1704); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:807:1: ruleConstraint returns [EObject current=null] : this_ColocationConstraint_0= ruleColocationConstraint ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ColocationConstraint_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:810:28: (this_ColocationConstraint_0= ruleColocationConstraint )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:812:5: this_ColocationConstraint_0= ruleColocationConstraint
            {
             
                    newCompositeNode(grammarAccess.getConstraintAccess().getColocationConstraintParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleColocationConstraint_in_ruleConstraint1750);
            this_ColocationConstraint_0=ruleColocationConstraint();

            state._fsp--;

             
                    current = this_ColocationConstraint_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleColocationConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:828:1: entryRuleColocationConstraint returns [EObject current=null] : iv_ruleColocationConstraint= ruleColocationConstraint EOF ;
    public final EObject entryRuleColocationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColocationConstraint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:829:2: (iv_ruleColocationConstraint= ruleColocationConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:830:2: iv_ruleColocationConstraint= ruleColocationConstraint EOF
            {
             newCompositeNode(grammarAccess.getColocationConstraintRule()); 
            pushFollow(FOLLOW_ruleColocationConstraint_in_entryRuleColocationConstraint1784);
            iv_ruleColocationConstraint=ruleColocationConstraint();

            state._fsp--;

             current =iv_ruleColocationConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColocationConstraint1794); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColocationConstraint"


    // $ANTLR start "ruleColocationConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:837:1: ruleColocationConstraint returns [EObject current=null] : (otherlv_0= 'colocate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleColocationConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:840:28: ( (otherlv_0= 'colocate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:841:1: (otherlv_0= 'colocate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:841:1: (otherlv_0= 'colocate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:841:3: otherlv_0= 'colocate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleColocationConstraint1831); 

                	newLeafNode(otherlv_0, grammarAccess.getColocationConstraintAccess().getColocateKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:845:1: ( (otherlv_1= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:846:1: (otherlv_1= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:846:1: (otherlv_1= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:847:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getColocationConstraintRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocationConstraint1851); 

            		newLeafNode(otherlv_1, grammarAccess.getColocationConstraintAccess().getJoint1JointCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleColocationConstraint1863); 

                	newLeafNode(otherlv_2, grammarAccess.getColocationConstraintAccess().getWithKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:862:1: ( (otherlv_3= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:863:1: (otherlv_3= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:863:1: (otherlv_3= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:864:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getColocationConstraintRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocationConstraint1883); 

            		newLeafNode(otherlv_3, grammarAccess.getColocationConstraintAccess().getJoint2JointCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColocationConstraint"


    // $ANTLR start "entryRuleVector3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:883:1: entryRuleVector3 returns [EObject current=null] : iv_ruleVector3= ruleVector3 EOF ;
    public final EObject entryRuleVector3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector3 = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:884:2: (iv_ruleVector3= ruleVector3 EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:885:2: iv_ruleVector3= ruleVector3 EOF
            {
             newCompositeNode(grammarAccess.getVector3Rule()); 
            pushFollow(FOLLOW_ruleVector3_in_entryRuleVector31919);
            iv_ruleVector3=ruleVector3();

            state._fsp--;

             current =iv_ruleVector3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector31929); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVector3"


    // $ANTLR start "ruleVector3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:892:1: ruleVector3 returns [EObject current=null] : (this_BaseVector3_0= ruleBaseVector3 | this_Vector3Ref_1= ruleVector3Ref ) ;
    public final EObject ruleVector3() throws RecognitionException {
        EObject current = null;

        EObject this_BaseVector3_0 = null;

        EObject this_Vector3Ref_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:895:28: ( (this_BaseVector3_0= ruleBaseVector3 | this_Vector3Ref_1= ruleVector3Ref ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:896:1: (this_BaseVector3_0= ruleBaseVector3 | this_Vector3Ref_1= ruleVector3Ref )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:896:1: (this_BaseVector3_0= ruleBaseVector3 | this_Vector3Ref_1= ruleVector3Ref )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28||LA6_0==35) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:897:5: this_BaseVector3_0= ruleBaseVector3
                    {
                     
                            newCompositeNode(grammarAccess.getVector3Access().getBaseVector3ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBaseVector3_in_ruleVector31976);
                    this_BaseVector3_0=ruleBaseVector3();

                    state._fsp--;

                     
                            current = this_BaseVector3_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:907:5: this_Vector3Ref_1= ruleVector3Ref
                    {
                     
                            newCompositeNode(grammarAccess.getVector3Access().getVector3RefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVector3Ref_in_ruleVector32003);
                    this_Vector3Ref_1=ruleVector3Ref();

                    state._fsp--;

                     
                            current = this_Vector3Ref_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVector3"


    // $ANTLR start "entryRuleBaseVector3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:923:1: entryRuleBaseVector3 returns [EObject current=null] : iv_ruleBaseVector3= ruleBaseVector3 EOF ;
    public final EObject entryRuleBaseVector3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseVector3 = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:924:2: (iv_ruleBaseVector3= ruleBaseVector3 EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:925:2: iv_ruleBaseVector3= ruleBaseVector3 EOF
            {
             newCompositeNode(grammarAccess.getBaseVector3Rule()); 
            pushFollow(FOLLOW_ruleBaseVector3_in_entryRuleBaseVector32038);
            iv_ruleBaseVector3=ruleBaseVector3();

            state._fsp--;

             current =iv_ruleBaseVector3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseVector32048); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseVector3"


    // $ANTLR start "ruleBaseVector3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:932:1: ruleBaseVector3 returns [EObject current=null] : ( (otherlv_0= 'vector' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '(' this_REAL_3= RULE_REAL otherlv_4= ',' this_REAL_5= RULE_REAL otherlv_6= ',' this_REAL_7= RULE_REAL otherlv_8= ')' () ) ;
    public final EObject ruleBaseVector3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_REAL_3=null;
        Token otherlv_4=null;
        Token this_REAL_5=null;
        Token otherlv_6=null;
        Token this_REAL_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:935:28: ( ( (otherlv_0= 'vector' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '(' this_REAL_3= RULE_REAL otherlv_4= ',' this_REAL_5= RULE_REAL otherlv_6= ',' this_REAL_7= RULE_REAL otherlv_8= ')' () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:936:1: ( (otherlv_0= 'vector' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '(' this_REAL_3= RULE_REAL otherlv_4= ',' this_REAL_5= RULE_REAL otherlv_6= ',' this_REAL_7= RULE_REAL otherlv_8= ')' () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:936:1: ( (otherlv_0= 'vector' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '(' this_REAL_3= RULE_REAL otherlv_4= ',' this_REAL_5= RULE_REAL otherlv_6= ',' this_REAL_7= RULE_REAL otherlv_8= ')' () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:936:2: (otherlv_0= 'vector' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '(' this_REAL_3= RULE_REAL otherlv_4= ',' this_REAL_5= RULE_REAL otherlv_6= ',' this_REAL_7= RULE_REAL otherlv_8= ')' ()
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:936:2: (otherlv_0= 'vector' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:936:4: otherlv_0= 'vector' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleBaseVector32086); 

                        	newLeafNode(otherlv_0, grammarAccess.getBaseVector3Access().getVectorKeyword_0_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:940:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:941:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:941:1: (lv_name_1_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:942:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseVector32103); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getBaseVector3Access().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseVector3Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleBaseVector32122); 

                	newLeafNode(otherlv_2, grammarAccess.getBaseVector3Access().getLeftParenthesisKeyword_1());
                
            this_REAL_3=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseVector32133); 
             
                newLeafNode(this_REAL_3, grammarAccess.getBaseVector3Access().getREALTerminalRuleCall_2()); 
                
            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleBaseVector32144); 

                	newLeafNode(otherlv_4, grammarAccess.getBaseVector3Access().getCommaKeyword_3());
                
            this_REAL_5=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseVector32155); 
             
                newLeafNode(this_REAL_5, grammarAccess.getBaseVector3Access().getREALTerminalRuleCall_4()); 
                
            otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleBaseVector32166); 

                	newLeafNode(otherlv_6, grammarAccess.getBaseVector3Access().getCommaKeyword_5());
                
            this_REAL_7=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseVector32177); 
             
                newLeafNode(this_REAL_7, grammarAccess.getBaseVector3Access().getREALTerminalRuleCall_6()); 
                
            otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleBaseVector32188); 

                	newLeafNode(otherlv_8, grammarAccess.getBaseVector3Access().getRightParenthesisKeyword_7());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:986:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:987:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBaseVector3Access().getBaseVector3Action_8(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseVector3"


    // $ANTLR start "entryRuleVector3Ref"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1000:1: entryRuleVector3Ref returns [EObject current=null] : iv_ruleVector3Ref= ruleVector3Ref EOF ;
    public final EObject entryRuleVector3Ref() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector3Ref = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1001:2: (iv_ruleVector3Ref= ruleVector3Ref EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1002:2: iv_ruleVector3Ref= ruleVector3Ref EOF
            {
             newCompositeNode(grammarAccess.getVector3RefRule()); 
            pushFollow(FOLLOW_ruleVector3Ref_in_entryRuleVector3Ref2233);
            iv_ruleVector3Ref=ruleVector3Ref();

            state._fsp--;

             current =iv_ruleVector3Ref; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector3Ref2243); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVector3Ref"


    // $ANTLR start "ruleVector3Ref"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1009:1: ruleVector3Ref returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVector3Ref() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1012:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1013:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1013:1: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1014:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1014:1: (otherlv_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1015:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVector3RefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVector3Ref2287); 

            		newLeafNode(otherlv_0, grammarAccess.getVector3RefAccess().getVectorBaseVector3CrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVector3Ref"


    // $ANTLR start "entryRuleMatrix3X3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1034:1: entryRuleMatrix3X3 returns [EObject current=null] : iv_ruleMatrix3X3= ruleMatrix3X3 EOF ;
    public final EObject entryRuleMatrix3X3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix3X3 = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1035:2: (iv_ruleMatrix3X3= ruleMatrix3X3 EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1036:2: iv_ruleMatrix3X3= ruleMatrix3X3 EOF
            {
             newCompositeNode(grammarAccess.getMatrix3X3Rule()); 
            pushFollow(FOLLOW_ruleMatrix3X3_in_entryRuleMatrix3X32322);
            iv_ruleMatrix3X3=ruleMatrix3X3();

            state._fsp--;

             current =iv_ruleMatrix3X3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix3X32332); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatrix3X3"


    // $ANTLR start "ruleMatrix3X3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1043:1: ruleMatrix3X3 returns [EObject current=null] : (this_BaseMatrix3X3_0= ruleBaseMatrix3X3 | this_Matrix3X3Ref_1= ruleMatrix3X3Ref ) ;
    public final EObject ruleMatrix3X3() throws RecognitionException {
        EObject current = null;

        EObject this_BaseMatrix3X3_0 = null;

        EObject this_Matrix3X3Ref_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1046:28: ( (this_BaseMatrix3X3_0= ruleBaseMatrix3X3 | this_Matrix3X3Ref_1= ruleMatrix3X3Ref ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1047:1: (this_BaseMatrix3X3_0= ruleBaseMatrix3X3 | this_Matrix3X3Ref_1= ruleMatrix3X3Ref )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1047:1: (this_BaseMatrix3X3_0= ruleBaseMatrix3X3 | this_Matrix3X3Ref_1= ruleMatrix3X3Ref )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=37 && LA8_0<=38)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1048:5: this_BaseMatrix3X3_0= ruleBaseMatrix3X3
                    {
                     
                            newCompositeNode(grammarAccess.getMatrix3X3Access().getBaseMatrix3X3ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBaseMatrix3X3_in_ruleMatrix3X32379);
                    this_BaseMatrix3X3_0=ruleBaseMatrix3X3();

                    state._fsp--;

                     
                            current = this_BaseMatrix3X3_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1058:5: this_Matrix3X3Ref_1= ruleMatrix3X3Ref
                    {
                     
                            newCompositeNode(grammarAccess.getMatrix3X3Access().getMatrix3X3RefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMatrix3X3Ref_in_ruleMatrix3X32406);
                    this_Matrix3X3Ref_1=ruleMatrix3X3Ref();

                    state._fsp--;

                     
                            current = this_Matrix3X3Ref_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatrix3X3"


    // $ANTLR start "entryRuleBaseMatrix3X3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1074:1: entryRuleBaseMatrix3X3 returns [EObject current=null] : iv_ruleBaseMatrix3X3= ruleBaseMatrix3X3 EOF ;
    public final EObject entryRuleBaseMatrix3X3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseMatrix3X3 = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1075:2: (iv_ruleBaseMatrix3X3= ruleBaseMatrix3X3 EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1076:2: iv_ruleBaseMatrix3X3= ruleBaseMatrix3X3 EOF
            {
             newCompositeNode(grammarAccess.getBaseMatrix3X3Rule()); 
            pushFollow(FOLLOW_ruleBaseMatrix3X3_in_entryRuleBaseMatrix3X32441);
            iv_ruleBaseMatrix3X3=ruleBaseMatrix3X3();

            state._fsp--;

             current =iv_ruleBaseMatrix3X3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseMatrix3X32451); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseMatrix3X3"


    // $ANTLR start "ruleBaseMatrix3X3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1083:1: ruleBaseMatrix3X3 returns [EObject current=null] : ( (otherlv_0= 'm3' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' this_REAL_3= RULE_REAL this_REAL_4= RULE_REAL this_REAL_5= RULE_REAL this_REAL_6= RULE_REAL this_REAL_7= RULE_REAL this_REAL_8= RULE_REAL this_REAL_9= RULE_REAL this_REAL_10= RULE_REAL this_REAL_11= RULE_REAL otherlv_12= ']' () ) ;
    public final EObject ruleBaseMatrix3X3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_REAL_3=null;
        Token this_REAL_4=null;
        Token this_REAL_5=null;
        Token this_REAL_6=null;
        Token this_REAL_7=null;
        Token this_REAL_8=null;
        Token this_REAL_9=null;
        Token this_REAL_10=null;
        Token this_REAL_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1086:28: ( ( (otherlv_0= 'm3' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' this_REAL_3= RULE_REAL this_REAL_4= RULE_REAL this_REAL_5= RULE_REAL this_REAL_6= RULE_REAL this_REAL_7= RULE_REAL this_REAL_8= RULE_REAL this_REAL_9= RULE_REAL this_REAL_10= RULE_REAL this_REAL_11= RULE_REAL otherlv_12= ']' () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1087:1: ( (otherlv_0= 'm3' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' this_REAL_3= RULE_REAL this_REAL_4= RULE_REAL this_REAL_5= RULE_REAL this_REAL_6= RULE_REAL this_REAL_7= RULE_REAL this_REAL_8= RULE_REAL this_REAL_9= RULE_REAL this_REAL_10= RULE_REAL this_REAL_11= RULE_REAL otherlv_12= ']' () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1087:1: ( (otherlv_0= 'm3' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' this_REAL_3= RULE_REAL this_REAL_4= RULE_REAL this_REAL_5= RULE_REAL this_REAL_6= RULE_REAL this_REAL_7= RULE_REAL this_REAL_8= RULE_REAL this_REAL_9= RULE_REAL this_REAL_10= RULE_REAL this_REAL_11= RULE_REAL otherlv_12= ']' () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1087:2: (otherlv_0= 'm3' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' this_REAL_3= RULE_REAL this_REAL_4= RULE_REAL this_REAL_5= RULE_REAL this_REAL_6= RULE_REAL this_REAL_7= RULE_REAL this_REAL_8= RULE_REAL this_REAL_9= RULE_REAL this_REAL_10= RULE_REAL this_REAL_11= RULE_REAL otherlv_12= ']' ()
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1087:2: (otherlv_0= 'm3' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1087:4: otherlv_0= 'm3' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleBaseMatrix3X32489); 

                        	newLeafNode(otherlv_0, grammarAccess.getBaseMatrix3X3Access().getM3Keyword_0_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1091:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1092:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1092:1: (lv_name_1_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1093:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseMatrix3X32506); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getBaseMatrix3X3Access().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseMatrix3X3Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleBaseMatrix3X32525); 

                	newLeafNode(otherlv_2, grammarAccess.getBaseMatrix3X3Access().getLeftSquareBracketKeyword_1());
                
            this_REAL_3=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32536); 
             
                newLeafNode(this_REAL_3, grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_2()); 
                
            this_REAL_4=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32546); 
             
                newLeafNode(this_REAL_4, grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_3()); 
                
            this_REAL_5=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32556); 
             
                newLeafNode(this_REAL_5, grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_4()); 
                
            this_REAL_6=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32566); 
             
                newLeafNode(this_REAL_6, grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_5()); 
                
            this_REAL_7=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32576); 
             
                newLeafNode(this_REAL_7, grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_6()); 
                
            this_REAL_8=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32586); 
             
                newLeafNode(this_REAL_8, grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_7()); 
                
            this_REAL_9=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32596); 
             
                newLeafNode(this_REAL_9, grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_8()); 
                
            this_REAL_10=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32606); 
             
                newLeafNode(this_REAL_10, grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_9()); 
                
            this_REAL_11=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32616); 
             
                newLeafNode(this_REAL_11, grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_10()); 
                
            otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleBaseMatrix3X32627); 

                	newLeafNode(otherlv_12, grammarAccess.getBaseMatrix3X3Access().getRightSquareBracketKeyword_11());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1153:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1154:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBaseMatrix3X3Access().getBaseMatrix3X3Action_12(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseMatrix3X3"


    // $ANTLR start "entryRuleMatrix3X3Ref"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1167:1: entryRuleMatrix3X3Ref returns [EObject current=null] : iv_ruleMatrix3X3Ref= ruleMatrix3X3Ref EOF ;
    public final EObject entryRuleMatrix3X3Ref() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix3X3Ref = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1168:2: (iv_ruleMatrix3X3Ref= ruleMatrix3X3Ref EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1169:2: iv_ruleMatrix3X3Ref= ruleMatrix3X3Ref EOF
            {
             newCompositeNode(grammarAccess.getMatrix3X3RefRule()); 
            pushFollow(FOLLOW_ruleMatrix3X3Ref_in_entryRuleMatrix3X3Ref2672);
            iv_ruleMatrix3X3Ref=ruleMatrix3X3Ref();

            state._fsp--;

             current =iv_ruleMatrix3X3Ref; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix3X3Ref2682); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatrix3X3Ref"


    // $ANTLR start "ruleMatrix3X3Ref"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1176:1: ruleMatrix3X3Ref returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleMatrix3X3Ref() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1179:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1180:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1180:1: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1181:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1181:1: (otherlv_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1182:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMatrix3X3RefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMatrix3X3Ref2726); 

            		newLeafNode(otherlv_0, grammarAccess.getMatrix3X3RefAccess().getMatrixBaseMatrix3X3CrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatrix3X3Ref"


    // $ANTLR start "entryRuleMatrix4X4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1201:1: entryRuleMatrix4X4 returns [EObject current=null] : iv_ruleMatrix4X4= ruleMatrix4X4 EOF ;
    public final EObject entryRuleMatrix4X4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix4X4 = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1202:2: (iv_ruleMatrix4X4= ruleMatrix4X4 EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1203:2: iv_ruleMatrix4X4= ruleMatrix4X4 EOF
            {
             newCompositeNode(grammarAccess.getMatrix4X4Rule()); 
            pushFollow(FOLLOW_ruleMatrix4X4_in_entryRuleMatrix4X42761);
            iv_ruleMatrix4X4=ruleMatrix4X4();

            state._fsp--;

             current =iv_ruleMatrix4X4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix4X42771); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatrix4X4"


    // $ANTLR start "ruleMatrix4X4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1210:1: ruleMatrix4X4 returns [EObject current=null] : (this_BaseMatrix4X4_0= ruleBaseMatrix4X4 | this_Matrix4X4Ref_1= ruleMatrix4X4Ref ) ;
    public final EObject ruleMatrix4X4() throws RecognitionException {
        EObject current = null;

        EObject this_BaseMatrix4X4_0 = null;

        EObject this_Matrix4X4Ref_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1213:28: ( (this_BaseMatrix4X4_0= ruleBaseMatrix4X4 | this_Matrix4X4Ref_1= ruleMatrix4X4Ref ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1214:1: (this_BaseMatrix4X4_0= ruleBaseMatrix4X4 | this_Matrix4X4Ref_1= ruleMatrix4X4Ref )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1214:1: (this_BaseMatrix4X4_0= ruleBaseMatrix4X4 | this_Matrix4X4Ref_1= ruleMatrix4X4Ref )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38||LA10_0==40) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1215:5: this_BaseMatrix4X4_0= ruleBaseMatrix4X4
                    {
                     
                            newCompositeNode(grammarAccess.getMatrix4X4Access().getBaseMatrix4X4ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBaseMatrix4X4_in_ruleMatrix4X42818);
                    this_BaseMatrix4X4_0=ruleBaseMatrix4X4();

                    state._fsp--;

                     
                            current = this_BaseMatrix4X4_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1225:5: this_Matrix4X4Ref_1= ruleMatrix4X4Ref
                    {
                     
                            newCompositeNode(grammarAccess.getMatrix4X4Access().getMatrix4X4RefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMatrix4X4Ref_in_ruleMatrix4X42845);
                    this_Matrix4X4Ref_1=ruleMatrix4X4Ref();

                    state._fsp--;

                     
                            current = this_Matrix4X4Ref_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatrix4X4"


    // $ANTLR start "entryRuleBaseMatrix4X4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1241:1: entryRuleBaseMatrix4X4 returns [EObject current=null] : iv_ruleBaseMatrix4X4= ruleBaseMatrix4X4 EOF ;
    public final EObject entryRuleBaseMatrix4X4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseMatrix4X4 = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1242:2: (iv_ruleBaseMatrix4X4= ruleBaseMatrix4X4 EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1243:2: iv_ruleBaseMatrix4X4= ruleBaseMatrix4X4 EOF
            {
             newCompositeNode(grammarAccess.getBaseMatrix4X4Rule()); 
            pushFollow(FOLLOW_ruleBaseMatrix4X4_in_entryRuleBaseMatrix4X42880);
            iv_ruleBaseMatrix4X4=ruleBaseMatrix4X4();

            state._fsp--;

             current =iv_ruleBaseMatrix4X4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseMatrix4X42890); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseMatrix4X4"


    // $ANTLR start "ruleBaseMatrix4X4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1250:1: ruleBaseMatrix4X4 returns [EObject current=null] : ( (otherlv_0= 'm4' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' this_REAL_3= RULE_REAL this_REAL_4= RULE_REAL this_REAL_5= RULE_REAL this_REAL_6= RULE_REAL this_REAL_7= RULE_REAL this_REAL_8= RULE_REAL this_REAL_9= RULE_REAL this_REAL_10= RULE_REAL this_REAL_11= RULE_REAL this_REAL_12= RULE_REAL this_REAL_13= RULE_REAL this_REAL_14= RULE_REAL this_REAL_15= RULE_REAL this_REAL_16= RULE_REAL this_REAL_17= RULE_REAL this_REAL_18= RULE_REAL otherlv_19= ']' () ) ;
    public final EObject ruleBaseMatrix4X4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_REAL_3=null;
        Token this_REAL_4=null;
        Token this_REAL_5=null;
        Token this_REAL_6=null;
        Token this_REAL_7=null;
        Token this_REAL_8=null;
        Token this_REAL_9=null;
        Token this_REAL_10=null;
        Token this_REAL_11=null;
        Token this_REAL_12=null;
        Token this_REAL_13=null;
        Token this_REAL_14=null;
        Token this_REAL_15=null;
        Token this_REAL_16=null;
        Token this_REAL_17=null;
        Token this_REAL_18=null;
        Token otherlv_19=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1253:28: ( ( (otherlv_0= 'm4' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' this_REAL_3= RULE_REAL this_REAL_4= RULE_REAL this_REAL_5= RULE_REAL this_REAL_6= RULE_REAL this_REAL_7= RULE_REAL this_REAL_8= RULE_REAL this_REAL_9= RULE_REAL this_REAL_10= RULE_REAL this_REAL_11= RULE_REAL this_REAL_12= RULE_REAL this_REAL_13= RULE_REAL this_REAL_14= RULE_REAL this_REAL_15= RULE_REAL this_REAL_16= RULE_REAL this_REAL_17= RULE_REAL this_REAL_18= RULE_REAL otherlv_19= ']' () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1254:1: ( (otherlv_0= 'm4' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' this_REAL_3= RULE_REAL this_REAL_4= RULE_REAL this_REAL_5= RULE_REAL this_REAL_6= RULE_REAL this_REAL_7= RULE_REAL this_REAL_8= RULE_REAL this_REAL_9= RULE_REAL this_REAL_10= RULE_REAL this_REAL_11= RULE_REAL this_REAL_12= RULE_REAL this_REAL_13= RULE_REAL this_REAL_14= RULE_REAL this_REAL_15= RULE_REAL this_REAL_16= RULE_REAL this_REAL_17= RULE_REAL this_REAL_18= RULE_REAL otherlv_19= ']' () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1254:1: ( (otherlv_0= 'm4' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' this_REAL_3= RULE_REAL this_REAL_4= RULE_REAL this_REAL_5= RULE_REAL this_REAL_6= RULE_REAL this_REAL_7= RULE_REAL this_REAL_8= RULE_REAL this_REAL_9= RULE_REAL this_REAL_10= RULE_REAL this_REAL_11= RULE_REAL this_REAL_12= RULE_REAL this_REAL_13= RULE_REAL this_REAL_14= RULE_REAL this_REAL_15= RULE_REAL this_REAL_16= RULE_REAL this_REAL_17= RULE_REAL this_REAL_18= RULE_REAL otherlv_19= ']' () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1254:2: (otherlv_0= 'm4' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' this_REAL_3= RULE_REAL this_REAL_4= RULE_REAL this_REAL_5= RULE_REAL this_REAL_6= RULE_REAL this_REAL_7= RULE_REAL this_REAL_8= RULE_REAL this_REAL_9= RULE_REAL this_REAL_10= RULE_REAL this_REAL_11= RULE_REAL this_REAL_12= RULE_REAL this_REAL_13= RULE_REAL this_REAL_14= RULE_REAL this_REAL_15= RULE_REAL this_REAL_16= RULE_REAL this_REAL_17= RULE_REAL this_REAL_18= RULE_REAL otherlv_19= ']' ()
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1254:2: (otherlv_0= 'm4' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1254:4: otherlv_0= 'm4' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleBaseMatrix4X42928); 

                        	newLeafNode(otherlv_0, grammarAccess.getBaseMatrix4X4Access().getM4Keyword_0_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1258:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1259:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1259:1: (lv_name_1_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1260:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseMatrix4X42945); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getBaseMatrix4X4Access().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseMatrix4X4Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleBaseMatrix4X42964); 

                	newLeafNode(otherlv_2, grammarAccess.getBaseMatrix4X4Access().getLeftSquareBracketKeyword_1());
                
            this_REAL_3=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X42975); 
             
                newLeafNode(this_REAL_3, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_2()); 
                
            this_REAL_4=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X42985); 
             
                newLeafNode(this_REAL_4, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_3()); 
                
            this_REAL_5=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X42995); 
             
                newLeafNode(this_REAL_5, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_4()); 
                
            this_REAL_6=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43005); 
             
                newLeafNode(this_REAL_6, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_5()); 
                
            this_REAL_7=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43015); 
             
                newLeafNode(this_REAL_7, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_6()); 
                
            this_REAL_8=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43025); 
             
                newLeafNode(this_REAL_8, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_7()); 
                
            this_REAL_9=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43035); 
             
                newLeafNode(this_REAL_9, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_8()); 
                
            this_REAL_10=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43045); 
             
                newLeafNode(this_REAL_10, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_9()); 
                
            this_REAL_11=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43055); 
             
                newLeafNode(this_REAL_11, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_10()); 
                
            this_REAL_12=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43065); 
             
                newLeafNode(this_REAL_12, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_11()); 
                
            this_REAL_13=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43075); 
             
                newLeafNode(this_REAL_13, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_12()); 
                
            this_REAL_14=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43085); 
             
                newLeafNode(this_REAL_14, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_13()); 
                
            this_REAL_15=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43095); 
             
                newLeafNode(this_REAL_15, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_14()); 
                
            this_REAL_16=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43105); 
             
                newLeafNode(this_REAL_16, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_15()); 
                
            this_REAL_17=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43115); 
             
                newLeafNode(this_REAL_17, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_16()); 
                
            this_REAL_18=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43125); 
             
                newLeafNode(this_REAL_18, grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_17()); 
                
            otherlv_19=(Token)match(input,39,FOLLOW_39_in_ruleBaseMatrix4X43136); 

                	newLeafNode(otherlv_19, grammarAccess.getBaseMatrix4X4Access().getRightSquareBracketKeyword_18());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1348:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1349:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBaseMatrix4X4Access().getBaseMatrix4X4Action_19(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseMatrix4X4"


    // $ANTLR start "entryRuleMatrix4X4Ref"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1362:1: entryRuleMatrix4X4Ref returns [EObject current=null] : iv_ruleMatrix4X4Ref= ruleMatrix4X4Ref EOF ;
    public final EObject entryRuleMatrix4X4Ref() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix4X4Ref = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1363:2: (iv_ruleMatrix4X4Ref= ruleMatrix4X4Ref EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1364:2: iv_ruleMatrix4X4Ref= ruleMatrix4X4Ref EOF
            {
             newCompositeNode(grammarAccess.getMatrix4X4RefRule()); 
            pushFollow(FOLLOW_ruleMatrix4X4Ref_in_entryRuleMatrix4X4Ref3181);
            iv_ruleMatrix4X4Ref=ruleMatrix4X4Ref();

            state._fsp--;

             current =iv_ruleMatrix4X4Ref; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix4X4Ref3191); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatrix4X4Ref"


    // $ANTLR start "ruleMatrix4X4Ref"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1371:1: ruleMatrix4X4Ref returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleMatrix4X4Ref() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1374:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1375:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1375:1: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1376:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1376:1: (otherlv_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1377:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMatrix4X4RefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMatrix4X4Ref3235); 

            		newLeafNode(otherlv_0, grammarAccess.getMatrix4X4RefAccess().getMatrixBaseMatrix4X4CrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatrix4X4Ref"


    // $ANTLR start "entryRuleMatrixDef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1396:1: entryRuleMatrixDef returns [EObject current=null] : iv_ruleMatrixDef= ruleMatrixDef EOF ;
    public final EObject entryRuleMatrixDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixDef = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1397:2: (iv_ruleMatrixDef= ruleMatrixDef EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1398:2: iv_ruleMatrixDef= ruleMatrixDef EOF
            {
             newCompositeNode(grammarAccess.getMatrixDefRule()); 
            pushFollow(FOLLOW_ruleMatrixDef_in_entryRuleMatrixDef3270);
            iv_ruleMatrixDef=ruleMatrixDef();

            state._fsp--;

             current =iv_ruleMatrixDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrixDef3280); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatrixDef"


    // $ANTLR start "ruleMatrixDef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1405:1: ruleMatrixDef returns [EObject current=null] : (this_BaseMatrix3X3_0= ruleBaseMatrix3X3 | this_BaseMatrix4X4_1= ruleBaseMatrix4X4 ) ;
    public final EObject ruleMatrixDef() throws RecognitionException {
        EObject current = null;

        EObject this_BaseMatrix3X3_0 = null;

        EObject this_BaseMatrix4X4_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1408:28: ( (this_BaseMatrix3X3_0= ruleBaseMatrix3X3 | this_BaseMatrix4X4_1= ruleBaseMatrix4X4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1409:1: (this_BaseMatrix3X3_0= ruleBaseMatrix3X3 | this_BaseMatrix4X4_1= ruleBaseMatrix4X4 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1409:1: (this_BaseMatrix3X3_0= ruleBaseMatrix3X3 | this_BaseMatrix4X4_1= ruleBaseMatrix4X4 )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1410:5: this_BaseMatrix3X3_0= ruleBaseMatrix3X3
                    {
                     
                            newCompositeNode(grammarAccess.getMatrixDefAccess().getBaseMatrix3X3ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBaseMatrix3X3_in_ruleMatrixDef3327);
                    this_BaseMatrix3X3_0=ruleBaseMatrix3X3();

                    state._fsp--;

                     
                            current = this_BaseMatrix3X3_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1420:5: this_BaseMatrix4X4_1= ruleBaseMatrix4X4
                    {
                     
                            newCompositeNode(grammarAccess.getMatrixDefAccess().getBaseMatrix4X4ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBaseMatrix4X4_in_ruleMatrixDef3354);
                    this_BaseMatrix4X4_1=ruleBaseMatrix4X4();

                    state._fsp--;

                     
                            current = this_BaseMatrix4X4_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatrixDef"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\15\uffff";
    static final String DFA12_eofS =
        "\15\uffff";
    static final String DFA12_minS =
        "\1\45\1\uffff\1\5\1\uffff\11\5";
    static final String DFA12_maxS =
        "\1\50\1\uffff\1\5\1\uffff\10\5\1\47";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\11\uffff";
    static final String DFA12_specialS =
        "\15\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\2\1\uffff\1\3",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\3\41\uffff\1\1"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1409:1: (this_BaseMatrix3X3_0= ruleBaseMatrix3X3 | this_BaseMatrix4X4_1= ruleBaseMatrix4X4 )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialDefinition_in_ruleModel131 = new BitSet(new long[]{0x0000016810001000L});
    public static final BitSet FOLLOW_ruleEnvironment_in_ruleModel153 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleModel174 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleInitialDefinition_in_entryRuleInitialDefinition211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialDefinition221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixDef_in_ruleInitialDefinition268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseVector3_in_ruleInitialDefinition295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_entryRuleEnvironment330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironment340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEnvironment377 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnvironment389 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnvironment401 = new BitSet(new long[]{0x0000016810001010L});
    public static final BitSet FOLLOW_ruleVector3_in_ruleEnvironment422 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnvironment434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSystem517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem534 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem551 = new BitSet(new long[]{0x0000000402020000L});
    public static final BitSet FOLLOW_ruleSystemElement_in_ruleSystem572 = new BitSet(new long[]{0x0000000402028000L});
    public static final BitSet FOLLOW_15_in_ruleSystem585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemElement_in_entryRuleSystemElement621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemElement631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_ruleSystemElement678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_ruleSystemElement705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleSystemElement732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBody814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody831 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBody848 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleLocalFrame_in_ruleBody869 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleMass_in_ruleBody890 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBody902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalFrame_in_entryRuleLocalFrame938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalFrame948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleLocalFrame985 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLocalFrame997 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLocalFrame1009 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLocalFrame1021 = new BitSet(new long[]{0x0000006000000010L});
    public static final BitSet FOLLOW_ruleMatrix3X3_in_ruleLocalFrame1042 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLocalFrame1054 = new BitSet(new long[]{0x0000016810001010L});
    public static final BitSet FOLLOW_ruleVector3_in_ruleLocalFrame1075 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLocalFrame1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_entryRuleMass1123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMass1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMass1170 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMass1182 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMass1194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleMass1211 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMass1228 = new BitSet(new long[]{0x0000016810001010L});
    public static final BitSet FOLLOW_ruleVector3_in_ruleMass1249 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMass1261 = new BitSet(new long[]{0x0000006000000010L});
    public static final BitSet FOLLOW_ruleMatrix3X3_in_ruleMass1282 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMass1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_entryRuleJoint1330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoint1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleJoint1377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJoint1394 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleJoint1411 = new BitSet(new long[]{0x0000016000000010L});
    public static final BitSet FOLLOW_ruleMatrix4X4_in_ruleJoint1432 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleJoint1444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJoint1464 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleJoint1476 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleJoint1488 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleJoint1500 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleJoint1512 = new BitSet(new long[]{0x0000016000000010L});
    public static final BitSet FOLLOW_ruleMatrix4X4_in_ruleJoint1533 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleJoint1545 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleJoint1557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJoint1577 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleJoint1589 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleJoint1601 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleJoint1613 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleJoint1625 = new BitSet(new long[]{0x0000016000000010L});
    public static final BitSet FOLLOW_ruleMatrix4X4_in_ruleJoint1646 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleJoint1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColocationConstraint_in_ruleConstraint1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColocationConstraint_in_entryRuleColocationConstraint1784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColocationConstraint1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleColocationConstraint1831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocationConstraint1851 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleColocationConstraint1863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocationConstraint1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector3_in_entryRuleVector31919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector31929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseVector3_in_ruleVector31976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector3Ref_in_ruleVector32003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseVector3_in_entryRuleBaseVector32038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseVector32048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBaseVector32086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseVector32103 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleBaseVector32122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseVector32133 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBaseVector32144 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseVector32155 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBaseVector32166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseVector32177 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBaseVector32188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector3Ref_in_entryRuleVector3Ref2233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector3Ref2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVector3Ref2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix3X3_in_entryRuleMatrix3X32322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix3X32332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix3X3_in_ruleMatrix3X32379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix3X3Ref_in_ruleMatrix3X32406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix3X3_in_entryRuleBaseMatrix3X32441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseMatrix3X32451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBaseMatrix3X32489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseMatrix3X32506 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBaseMatrix3X32525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32536 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32546 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32556 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32566 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32576 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32606 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix3X32616 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleBaseMatrix3X32627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix3X3Ref_in_entryRuleMatrix3X3Ref2672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix3X3Ref2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMatrix3X3Ref2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix4X4_in_entryRuleMatrix4X42761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix4X42771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix4X4_in_ruleMatrix4X42818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix4X4Ref_in_ruleMatrix4X42845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix4X4_in_entryRuleBaseMatrix4X42880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseMatrix4X42890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBaseMatrix4X42928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseMatrix4X42945 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBaseMatrix4X42964 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X42975 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X42985 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X42995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43015 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43025 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43035 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43045 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43055 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43075 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43085 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43095 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleBaseMatrix4X43125 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleBaseMatrix4X43136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix4X4Ref_in_entryRuleMatrix4X4Ref3181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix4X4Ref3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMatrix4X4Ref3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixDef_in_entryRuleMatrixDef3270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrixDef3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix3X3_in_ruleMatrixDef3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix4X4_in_ruleMatrixDef3354 = new BitSet(new long[]{0x0000000000000002L});

}