package uk.ac.kcl.inf.robotics.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'world'", "'{'", "'gravity'", "'}'", "'system'", "'body'", "'base'", "'mass'", "'value'", "'position'", "'inertia'", "'joint'", "':'", "'start'", "'between'", "'and'", "'type'", "'+'", "'with'", "'revolute'", "'planar'", "'stiffness'", "'springCoeff'", "'springInit'", "'dampViscous'", "'dampCoulomb'", "'('", "'relative'", "'transformation'", "','", "')'", "'reorient'", "'constraint'", "'external'", "'load'", "'at'", "'matrix'", "'['", "']'", "'-'", "'*'", "'/'", "'x'", "'y'", "'z'", "'geometrical'", "'velocity'", "'force'", "'torque'"
    };
    public static final int RULE_ID=4;
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
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_REAL=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_defs_0_0 = null;

        EObject lv_world_1_0 = null;

        EObject lv_bodies_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:80:28: ( ( ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+ ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:81:1: ( ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+ )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:81:1: ( ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+ )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:81:2: ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:81:2: ( (lv_defs_0_0= ruleInitialDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13||LA1_0==23||(LA1_0>=31 && LA1_0<=33)||(LA1_0>=48 && LA1_0<=49)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:82:1: (lv_defs_0_0= ruleInitialDefinition )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:82:1: (lv_defs_0_0= ruleInitialDefinition )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:83:3: lv_defs_0_0= ruleInitialDefinition
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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:99:3: ( (lv_world_1_0= ruleEnvironment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:100:1: (lv_world_1_0= ruleEnvironment )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:100:1: (lv_world_1_0= ruleEnvironment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:101:3: lv_world_1_0= ruleEnvironment
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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:117:2: ( (lv_bodies_2_0= ruleSystem ) )+
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
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:118:1: (lv_bodies_2_0= ruleSystem )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:118:1: (lv_bodies_2_0= ruleSystem )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:119:3: lv_bodies_2_0= ruleSystem
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:143:1: entryRuleInitialDefinition returns [EObject current=null] : iv_ruleInitialDefinition= ruleInitialDefinition EOF ;
    public final EObject entryRuleInitialDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialDefinition = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:144:2: (iv_ruleInitialDefinition= ruleInitialDefinition EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:145:2: iv_ruleInitialDefinition= ruleInitialDefinition EOF
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:152:1: ruleInitialDefinition returns [EObject current=null] : (this_BaseMatrix_0= ruleBaseMatrix | this_JointType_1= ruleJointType | this_BaseStiffnessExp_2= ruleBaseStiffnessExp ) ;
    public final EObject ruleInitialDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_BaseMatrix_0 = null;

        EObject this_JointType_1 = null;

        EObject this_BaseStiffnessExp_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:155:28: ( (this_BaseMatrix_0= ruleBaseMatrix | this_JointType_1= ruleJointType | this_BaseStiffnessExp_2= ruleBaseStiffnessExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:156:1: (this_BaseMatrix_0= ruleBaseMatrix | this_JointType_1= ruleJointType | this_BaseStiffnessExp_2= ruleBaseStiffnessExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:156:1: (this_BaseMatrix_0= ruleBaseMatrix | this_JointType_1= ruleJointType | this_BaseStiffnessExp_2= ruleBaseStiffnessExp )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 48:
            case 49:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
            case 23:
            case 31:
            case 32:
                {
                alt3=2;
                }
                break;
            case 13:
            case 33:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:157:5: this_BaseMatrix_0= ruleBaseMatrix
                    {
                     
                            newCompositeNode(grammarAccess.getInitialDefinitionAccess().getBaseMatrixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBaseMatrix_in_ruleInitialDefinition268);
                    this_BaseMatrix_0=ruleBaseMatrix();

                    state._fsp--;

                     
                            current = this_BaseMatrix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:167:5: this_JointType_1= ruleJointType
                    {
                     
                            newCompositeNode(grammarAccess.getInitialDefinitionAccess().getJointTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleJointType_in_ruleInitialDefinition295);
                    this_JointType_1=ruleJointType();

                    state._fsp--;

                     
                            current = this_JointType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:177:5: this_BaseStiffnessExp_2= ruleBaseStiffnessExp
                    {
                     
                            newCompositeNode(grammarAccess.getInitialDefinitionAccess().getBaseStiffnessExpParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBaseStiffnessExp_in_ruleInitialDefinition322);
                    this_BaseStiffnessExp_2=ruleBaseStiffnessExp();

                    state._fsp--;

                     
                            current = this_BaseStiffnessExp_2; 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:193:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:194:2: (iv_ruleEnvironment= ruleEnvironment EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:195:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_ruleEnvironment_in_entryRuleEnvironment357);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironment367); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:202:1: ruleEnvironment returns [EObject current=null] : (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_gravity_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:205:28: ( (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:206:1: (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:206:1: (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:206:3: otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleEnvironment404); 

                	newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getWorldKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEnvironment416); 

                	newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEnvironment428); 

                	newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getGravityKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:218:1: ( (lv_gravity_3_0= ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:219:1: (lv_gravity_3_0= ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:219:1: (lv_gravity_3_0= ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:220:3: lv_gravity_3_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getEnvironmentAccess().getGravityMatrixParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleEnvironment449);
            lv_gravity_3_0=ruleMatrix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	        }
                   		set(
                   			current, 
                   			"gravity",
                    		lv_gravity_3_0, 
                    		"Matrix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEnvironment461); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:248:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:249:2: (iv_ruleSystem= ruleSystem EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:250:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem497);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem507); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:257:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:260:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:261:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:261:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:261:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSystem544); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:265:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:266:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:266:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:267:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem561); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSystem578); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:287:1: ( (lv_elements_3_0= ruleSystemElement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||LA4_0==23||(LA4_0>=44 && LA4_0<=45)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:288:1: (lv_elements_3_0= ruleSystemElement )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:288:1: (lv_elements_3_0= ruleSystemElement )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:289:3: lv_elements_3_0= ruleSystemElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getElementsSystemElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSystemElement_in_ruleSystem599);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleSystem612); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:317:1: entryRuleSystemElement returns [EObject current=null] : iv_ruleSystemElement= ruleSystemElement EOF ;
    public final EObject entryRuleSystemElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemElement = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:318:2: (iv_ruleSystemElement= ruleSystemElement EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:319:2: iv_ruleSystemElement= ruleSystemElement EOF
            {
             newCompositeNode(grammarAccess.getSystemElementRule()); 
            pushFollow(FOLLOW_ruleSystemElement_in_entryRuleSystemElement648);
            iv_ruleSystemElement=ruleSystemElement();

            state._fsp--;

             current =iv_ruleSystemElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemElement658); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:326:1: ruleSystemElement returns [EObject current=null] : (this_Body_0= ruleBody | this_Connective_1= ruleConnective ) ;
    public final EObject ruleSystemElement() throws RecognitionException {
        EObject current = null;

        EObject this_Body_0 = null;

        EObject this_Connective_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:329:28: ( (this_Body_0= ruleBody | this_Connective_1= ruleConnective ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:330:1: (this_Body_0= ruleBody | this_Connective_1= ruleConnective )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:330:1: (this_Body_0= ruleBody | this_Connective_1= ruleConnective )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==23||(LA5_0>=44 && LA5_0<=45)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:331:5: this_Body_0= ruleBody
                    {
                     
                            newCompositeNode(grammarAccess.getSystemElementAccess().getBodyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBody_in_ruleSystemElement705);
                    this_Body_0=ruleBody();

                    state._fsp--;

                     
                            current = this_Body_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:341:5: this_Connective_1= ruleConnective
                    {
                     
                            newCompositeNode(grammarAccess.getSystemElementAccess().getConnectiveParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConnective_in_ruleSystemElement732);
                    this_Connective_1=ruleConnective();

                    state._fsp--;

                     
                            current = this_Connective_1; 
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


    // $ANTLR start "entryRuleConnective"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:357:1: entryRuleConnective returns [EObject current=null] : iv_ruleConnective= ruleConnective EOF ;
    public final EObject entryRuleConnective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnective = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:358:2: (iv_ruleConnective= ruleConnective EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:359:2: iv_ruleConnective= ruleConnective EOF
            {
             newCompositeNode(grammarAccess.getConnectiveRule()); 
            pushFollow(FOLLOW_ruleConnective_in_entryRuleConnective767);
            iv_ruleConnective=ruleConnective();

            state._fsp--;

             current =iv_ruleConnective; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnective777); 

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
    // $ANTLR end "entryRuleConnective"


    // $ANTLR start "ruleConnective"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:366:1: ruleConnective returns [EObject current=null] : (this_Joint_0= ruleJoint | this_Constraint_1= ruleConstraint | this_ExternalLoad_2= ruleExternalLoad ) ;
    public final EObject ruleConnective() throws RecognitionException {
        EObject current = null;

        EObject this_Joint_0 = null;

        EObject this_Constraint_1 = null;

        EObject this_ExternalLoad_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:369:28: ( (this_Joint_0= ruleJoint | this_Constraint_1= ruleConstraint | this_ExternalLoad_2= ruleExternalLoad ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:370:1: (this_Joint_0= ruleJoint | this_Constraint_1= ruleConstraint | this_ExternalLoad_2= ruleExternalLoad )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:370:1: (this_Joint_0= ruleJoint | this_Constraint_1= ruleConstraint | this_ExternalLoad_2= ruleExternalLoad )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 44:
                {
                alt6=2;
                }
                break;
            case 45:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:371:5: this_Joint_0= ruleJoint
                    {
                     
                            newCompositeNode(grammarAccess.getConnectiveAccess().getJointParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleJoint_in_ruleConnective824);
                    this_Joint_0=ruleJoint();

                    state._fsp--;

                     
                            current = this_Joint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:381:5: this_Constraint_1= ruleConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConnectiveAccess().getConstraintParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConstraint_in_ruleConnective851);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;

                     
                            current = this_Constraint_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:391:5: this_ExternalLoad_2= ruleExternalLoad
                    {
                     
                            newCompositeNode(grammarAccess.getConnectiveAccess().getExternalLoadParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExternalLoad_in_ruleConnective878);
                    this_ExternalLoad_2=ruleExternalLoad();

                    state._fsp--;

                     
                            current = this_ExternalLoad_2; 
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
    // $ANTLR end "ruleConnective"


    // $ANTLR start "entryRuleBody"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:407:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:408:2: (iv_ruleBody= ruleBody EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:409:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody913);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody923); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:416:1: ruleBody returns [EObject current=null] : (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mass_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:419:28: ( (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:420:1: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:420:1: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:420:3: otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleBody960); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getBodyKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:424:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:425:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:425:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:426:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody977); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleBody994); 

                	newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:446:1: ( (lv_mass_3_0= ruleMass ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:447:1: (lv_mass_3_0= ruleMass )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:447:1: (lv_mass_3_0= ruleMass )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:448:3: lv_mass_3_0= ruleMass
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getMassMassParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMass_in_ruleBody1015);
            lv_mass_3_0=ruleMass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		set(
                   			current, 
                   			"mass",
                    		lv_mass_3_0, 
                    		"Mass");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleBody1027); 

                	newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleBodyReference"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:476:1: entryRuleBodyReference returns [EObject current=null] : iv_ruleBodyReference= ruleBodyReference EOF ;
    public final EObject entryRuleBodyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyReference = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:477:2: (iv_ruleBodyReference= ruleBodyReference EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:478:2: iv_ruleBodyReference= ruleBodyReference EOF
            {
             newCompositeNode(grammarAccess.getBodyReferenceRule()); 
            pushFollow(FOLLOW_ruleBodyReference_in_entryRuleBodyReference1063);
            iv_ruleBodyReference=ruleBodyReference();

            state._fsp--;

             current =iv_ruleBodyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyReference1073); 

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
    // $ANTLR end "entryRuleBodyReference"


    // $ANTLR start "ruleBodyReference"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:485:1: ruleBodyReference returns [EObject current=null] : ( ( (lv_base_0_0= 'base' ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleBodyReference() throws RecognitionException {
        EObject current = null;

        Token lv_base_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:488:28: ( ( ( (lv_base_0_0= 'base' ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:489:1: ( ( (lv_base_0_0= 'base' ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:489:1: ( ( (lv_base_0_0= 'base' ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:489:2: ( (lv_base_0_0= 'base' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:489:2: ( (lv_base_0_0= 'base' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:490:1: (lv_base_0_0= 'base' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:490:1: (lv_base_0_0= 'base' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:491:3: lv_base_0_0= 'base'
                    {
                    lv_base_0_0=(Token)match(input,18,FOLLOW_18_in_ruleBodyReference1116); 

                            newLeafNode(lv_base_0_0, grammarAccess.getBodyReferenceAccess().getBaseBaseKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBodyReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "base", true, "base");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:505:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:505:6: ( (otherlv_1= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:506:1: (otherlv_1= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:506:1: (otherlv_1= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:507:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBodyReferenceRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyReference1155); 

                    		newLeafNode(otherlv_1, grammarAccess.getBodyReferenceAccess().getRefBodyCrossReference_1_0()); 
                    	

                    }


                    }


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
    // $ANTLR end "ruleBodyReference"


    // $ANTLR start "entryRuleMass"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:526:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:527:2: (iv_ruleMass= ruleMass EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:528:2: iv_ruleMass= ruleMass EOF
            {
             newCompositeNode(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_ruleMass_in_entryRuleMass1191);
            iv_ruleMass=ruleMass();

            state._fsp--;

             current =iv_ruleMass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMass1201); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:535:1: ruleMass returns [EObject current=null] : (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_value_3_0 = null;

        EObject lv_position_5_0 = null;

        EObject lv_inertia_7_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:538:28: ( (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:539:1: (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:539:1: (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:539:3: otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleMass1238); 

                	newLeafNode(otherlv_0, grammarAccess.getMassAccess().getMassKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleMass1250); 

                	newLeafNode(otherlv_1, grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMass1262); 

                	newLeafNode(otherlv_2, grammarAccess.getMassAccess().getValueKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:551:1: ( (lv_value_3_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:552:1: (lv_value_3_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:552:1: (lv_value_3_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:553:3: lv_value_3_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getValueAddExpParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleMass1283);
            lv_value_3_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMassRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleMass1295); 

                	newLeafNode(otherlv_4, grammarAccess.getMassAccess().getPositionKeyword_4());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:573:1: ( (lv_position_5_0= ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:574:1: (lv_position_5_0= ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:574:1: (lv_position_5_0= ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:575:3: lv_position_5_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getPositionMatrixParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleMass1316);
            lv_position_5_0=ruleMatrix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMassRule());
            	        }
                   		set(
                   			current, 
                   			"position",
                    		lv_position_5_0, 
                    		"Matrix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleMass1328); 

                	newLeafNode(otherlv_6, grammarAccess.getMassAccess().getInertiaKeyword_6());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:595:1: ( (lv_inertia_7_0= ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:596:1: (lv_inertia_7_0= ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:596:1: (lv_inertia_7_0= ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:597:3: lv_inertia_7_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getInertiaMatrixParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleMass1349);
            lv_inertia_7_0=ruleMatrix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMassRule());
            	        }
                   		set(
                   			current, 
                   			"inertia",
                    		lv_inertia_7_0, 
                    		"Matrix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleMass1361); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:625:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:626:2: (iv_ruleJoint= ruleJoint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:627:2: iv_ruleJoint= ruleJoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_ruleJoint_in_entryRuleJoint1397);
            iv_ruleJoint=ruleJoint();

            state._fsp--;

             current =iv_ruleJoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoint1407); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:634:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) ) ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_isStart_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_type_3_0 = null;

        EObject lv_body1_6_0 = null;

        EObject lv_relTrans1_7_0 = null;

        EObject lv_body2_9_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:637:28: ( (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:638:1: (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:638:1: (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:638:3: otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleJoint1444); 

                	newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:642:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:643:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:643:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:644:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJoint1461); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleJoint1478); 

                	newLeafNode(otherlv_2, grammarAccess.getJointAccess().getColonKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:664:1: ( (lv_type_3_0= ruleJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:665:1: (lv_type_3_0= ruleJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:665:1: (lv_type_3_0= ruleJointType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:666:3: lv_type_3_0= ruleJointType
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleJointType_in_ruleJoint1499);
            lv_type_3_0=ruleJointType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"JointType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:682:2: ( (lv_isStart_4_0= 'start' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:683:1: (lv_isStart_4_0= 'start' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:683:1: (lv_isStart_4_0= 'start' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:684:3: lv_isStart_4_0= 'start'
                    {
                    lv_isStart_4_0=(Token)match(input,25,FOLLOW_25_in_ruleJoint1517); 

                            newLeafNode(lv_isStart_4_0, grammarAccess.getJointAccess().getIsStartStartKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJointRule());
                    	        }
                           		setWithLastConsumed(current, "isStart", true, "start");
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleJoint1543); 

                	newLeafNode(otherlv_5, grammarAccess.getJointAccess().getBetweenKeyword_5());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:701:1: ( (lv_body1_6_0= ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:702:1: (lv_body1_6_0= ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:702:1: (lv_body1_6_0= ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:703:3: lv_body1_6_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getBody1BodyReferenceParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyReference_in_ruleJoint1564);
            lv_body1_6_0=ruleBodyReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"body1",
                    		lv_body1_6_0, 
                    		"BodyReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:719:2: ( (lv_relTrans1_7_0= ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:720:1: (lv_relTrans1_7_0= ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:720:1: (lv_relTrans1_7_0= ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:721:3: lv_relTrans1_7_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getRelTrans1RelativeTransformationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleRelativeTransformation_in_ruleJoint1585);
            lv_relTrans1_7_0=ruleRelativeTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"relTrans1",
                    		lv_relTrans1_7_0, 
                    		"RelativeTransformation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleJoint1597); 

                	newLeafNode(otherlv_8, grammarAccess.getJointAccess().getAndKeyword_8());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:741:1: ( (lv_body2_9_0= ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:742:1: (lv_body2_9_0= ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:742:1: (lv_body2_9_0= ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:743:3: lv_body2_9_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getBody2BodyReferenceParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyReference_in_ruleJoint1618);
            lv_body2_9_0=ruleBodyReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"body2",
                    		lv_body2_9_0, 
                    		"BodyReference");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:767:1: entryRuleJointType returns [EObject current=null] : iv_ruleJointType= ruleJointType EOF ;
    public final EObject entryRuleJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointType = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:768:2: (iv_ruleJointType= ruleJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:769:2: iv_ruleJointType= ruleJointType EOF
            {
             newCompositeNode(grammarAccess.getJointTypeRule()); 
            pushFollow(FOLLOW_ruleJointType_in_entryRuleJointType1654);
            iv_ruleJointType=ruleJointType();

            state._fsp--;

             current =iv_ruleJointType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointType1664); 

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
    // $ANTLR end "entryRuleJointType"


    // $ANTLR start "ruleJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:776:1: ruleJointType returns [EObject current=null] : ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) ) ) ;
    public final EObject ruleJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:779:28: ( ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:780:1: ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:780:1: ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:780:2: (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:780:2: (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:780:4: otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleJointType1702); 

                        	newLeafNode(otherlv_0, grammarAccess.getJointTypeAccess().getJointKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleJointType1714); 

                        	newLeafNode(otherlv_1, grammarAccess.getJointTypeAccess().getTypeKeyword_0_1());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:788:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:789:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:789:1: (lv_name_2_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:790:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJointType1731); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getJointTypeAccess().getNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJointTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:806:4: ( (lv_exp_3_0= ruleAdditiveJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:807:1: (lv_exp_3_0= ruleAdditiveJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:807:1: (lv_exp_3_0= ruleAdditiveJointType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:808:3: lv_exp_3_0= ruleAdditiveJointType
            {
             
            	        newCompositeNode(grammarAccess.getJointTypeAccess().getExpAdditiveJointTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAdditiveJointType_in_ruleJointType1759);
            lv_exp_3_0=ruleAdditiveJointType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointTypeRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_3_0, 
                    		"AdditiveJointType");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleJointType"


    // $ANTLR start "entryRuleAdditiveJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:832:1: entryRuleAdditiveJointType returns [EObject current=null] : iv_ruleAdditiveJointType= ruleAdditiveJointType EOF ;
    public final EObject entryRuleAdditiveJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveJointType = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:833:2: (iv_ruleAdditiveJointType= ruleAdditiveJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:834:2: iv_ruleAdditiveJointType= ruleAdditiveJointType EOF
            {
             newCompositeNode(grammarAccess.getAdditiveJointTypeRule()); 
            pushFollow(FOLLOW_ruleAdditiveJointType_in_entryRuleAdditiveJointType1795);
            iv_ruleAdditiveJointType=ruleAdditiveJointType();

            state._fsp--;

             current =iv_ruleAdditiveJointType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveJointType1805); 

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
    // $ANTLR end "entryRuleAdditiveJointType"


    // $ANTLR start "ruleAdditiveJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:841:1: ruleAdditiveJointType returns [EObject current=null] : (this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )* ) ;
    public final EObject ruleAdditiveJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PrimaryJointType_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:844:28: ( (this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:845:1: (this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:845:1: (this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:846:5: this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditiveJointTypeAccess().getPrimaryJointTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryJointType_in_ruleAdditiveJointType1852);
            this_PrimaryJointType_0=rulePrimaryJointType();

            state._fsp--;

             
                    current = this_PrimaryJointType_0; 
                    afterParserOrEnumRuleCall();
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:854:1: (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:854:3: otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleAdditiveJointType1864); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAdditiveJointTypeAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:858:1: ()
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:859:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditiveJointTypeAccess().getAdditiveJointTypeLeftAction_1_1(),
            	                current);
            	        

            	    }

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:864:2: ( (lv_right_3_0= rulePrimaryJointType ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:865:1: (lv_right_3_0= rulePrimaryJointType )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:865:1: (lv_right_3_0= rulePrimaryJointType )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:866:3: lv_right_3_0= rulePrimaryJointType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveJointTypeAccess().getRightPrimaryJointTypeParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryJointType_in_ruleAdditiveJointType1894);
            	    lv_right_3_0=rulePrimaryJointType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveJointTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PrimaryJointType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
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
    // $ANTLR end "ruleAdditiveJointType"


    // $ANTLR start "entryRulePrimaryJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:890:1: entryRulePrimaryJointType returns [EObject current=null] : iv_rulePrimaryJointType= rulePrimaryJointType EOF ;
    public final EObject entryRulePrimaryJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryJointType = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:891:2: (iv_rulePrimaryJointType= rulePrimaryJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:892:2: iv_rulePrimaryJointType= rulePrimaryJointType EOF
            {
             newCompositeNode(grammarAccess.getPrimaryJointTypeRule()); 
            pushFollow(FOLLOW_rulePrimaryJointType_in_entryRulePrimaryJointType1932);
            iv_rulePrimaryJointType=rulePrimaryJointType();

            state._fsp--;

             current =iv_rulePrimaryJointType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryJointType1942); 

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
    // $ANTLR end "entryRulePrimaryJointType"


    // $ANTLR start "rulePrimaryJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:899:1: rulePrimaryJointType returns [EObject current=null] : (this_JointTypeReference_0= ruleJointTypeReference | this_BasicJointType_1= ruleBasicJointType ) ;
    public final EObject rulePrimaryJointType() throws RecognitionException {
        EObject current = null;

        EObject this_JointTypeReference_0 = null;

        EObject this_BasicJointType_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:902:28: ( (this_JointTypeReference_0= ruleJointTypeReference | this_BasicJointType_1= ruleBasicJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:903:1: (this_JointTypeReference_0= ruleJointTypeReference | this_BasicJointType_1= ruleBasicJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:903:1: (this_JointTypeReference_0= ruleJointTypeReference | this_BasicJointType_1= ruleBasicJointType )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=31 && LA11_0<=32)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:904:5: this_JointTypeReference_0= ruleJointTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryJointTypeAccess().getJointTypeReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleJointTypeReference_in_rulePrimaryJointType1989);
                    this_JointTypeReference_0=ruleJointTypeReference();

                    state._fsp--;

                     
                            current = this_JointTypeReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:914:5: this_BasicJointType_1= ruleBasicJointType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryJointTypeAccess().getBasicJointTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBasicJointType_in_rulePrimaryJointType2016);
                    this_BasicJointType_1=ruleBasicJointType();

                    state._fsp--;

                     
                            current = this_BasicJointType_1; 
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
    // $ANTLR end "rulePrimaryJointType"


    // $ANTLR start "entryRuleJointTypeReference"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:930:1: entryRuleJointTypeReference returns [EObject current=null] : iv_ruleJointTypeReference= ruleJointTypeReference EOF ;
    public final EObject entryRuleJointTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointTypeReference = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:931:2: (iv_ruleJointTypeReference= ruleJointTypeReference EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:932:2: iv_ruleJointTypeReference= ruleJointTypeReference EOF
            {
             newCompositeNode(grammarAccess.getJointTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleJointTypeReference_in_entryRuleJointTypeReference2051);
            iv_ruleJointTypeReference=ruleJointTypeReference();

            state._fsp--;

             current =iv_ruleJointTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointTypeReference2061); 

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
    // $ANTLR end "entryRuleJointTypeReference"


    // $ANTLR start "ruleJointTypeReference"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:939:1: ruleJointTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleJointTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:942:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:943:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:943:1: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:944:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:944:1: (otherlv_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:945:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJointTypeReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJointTypeReference2105); 

            		newLeafNode(otherlv_0, grammarAccess.getJointTypeReferenceAccess().getRefJointTypeCrossReference_0()); 
            	

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
    // $ANTLR end "ruleJointTypeReference"


    // $ANTLR start "entryRuleBasicJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:964:1: entryRuleBasicJointType returns [EObject current=null] : iv_ruleBasicJointType= ruleBasicJointType EOF ;
    public final EObject entryRuleBasicJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicJointType = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:965:2: (iv_ruleBasicJointType= ruleBasicJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:966:2: iv_ruleBasicJointType= ruleBasicJointType EOF
            {
             newCompositeNode(grammarAccess.getBasicJointTypeRule()); 
            pushFollow(FOLLOW_ruleBasicJointType_in_entryRuleBasicJointType2140);
            iv_ruleBasicJointType=ruleBasicJointType();

            state._fsp--;

             current =iv_ruleBasicJointType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicJointType2150); 

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
    // $ANTLR end "entryRuleBasicJointType"


    // $ANTLR start "ruleBasicJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:973:1: ruleBasicJointType returns [EObject current=null] : ( ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) ) ) ;
    public final EObject ruleBasicJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_0_0 = null;

        EObject lv_stiffness_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:976:28: ( ( ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:977:1: ( ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:977:1: ( ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:977:2: ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:977:2: ( (lv_type_0_0= ruleJointMovement ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:978:1: (lv_type_0_0= ruleJointMovement )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:978:1: (lv_type_0_0= ruleJointMovement )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:979:3: lv_type_0_0= ruleJointMovement
            {
             
            	        newCompositeNode(grammarAccess.getBasicJointTypeAccess().getTypeJointMovementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleJointMovement_in_ruleBasicJointType2196);
            lv_type_0_0=ruleJointMovement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBasicJointTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"JointMovement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleBasicJointType2208); 

                	newLeafNode(otherlv_1, grammarAccess.getBasicJointTypeAccess().getWithKeyword_1());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:999:1: ( (lv_stiffness_2_0= ruleStiffnessExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1000:1: (lv_stiffness_2_0= ruleStiffnessExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1000:1: (lv_stiffness_2_0= ruleStiffnessExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1001:3: lv_stiffness_2_0= ruleStiffnessExp
            {
             
            	        newCompositeNode(grammarAccess.getBasicJointTypeAccess().getStiffnessStiffnessExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStiffnessExp_in_ruleBasicJointType2229);
            lv_stiffness_2_0=ruleStiffnessExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBasicJointTypeRule());
            	        }
                   		set(
                   			current, 
                   			"stiffness",
                    		lv_stiffness_2_0, 
                    		"StiffnessExp");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleBasicJointType"


    // $ANTLR start "entryRuleJointMovement"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1025:1: entryRuleJointMovement returns [EObject current=null] : iv_ruleJointMovement= ruleJointMovement EOF ;
    public final EObject entryRuleJointMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointMovement = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1026:2: (iv_ruleJointMovement= ruleJointMovement EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1027:2: iv_ruleJointMovement= ruleJointMovement EOF
            {
             newCompositeNode(grammarAccess.getJointMovementRule()); 
            pushFollow(FOLLOW_ruleJointMovement_in_entryRuleJointMovement2265);
            iv_ruleJointMovement=ruleJointMovement();

            state._fsp--;

             current =iv_ruleJointMovement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointMovement2275); 

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
    // $ANTLR end "entryRuleJointMovement"


    // $ANTLR start "ruleJointMovement"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1034:1: ruleJointMovement returns [EObject current=null] : (this_Revolute_0= ruleRevolute | this_Planar_1= rulePlanar ) ;
    public final EObject ruleJointMovement() throws RecognitionException {
        EObject current = null;

        EObject this_Revolute_0 = null;

        EObject this_Planar_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1037:28: ( (this_Revolute_0= ruleRevolute | this_Planar_1= rulePlanar ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1038:1: (this_Revolute_0= ruleRevolute | this_Planar_1= rulePlanar )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1038:1: (this_Revolute_0= ruleRevolute | this_Planar_1= rulePlanar )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1039:5: this_Revolute_0= ruleRevolute
                    {
                     
                            newCompositeNode(grammarAccess.getJointMovementAccess().getRevoluteParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRevolute_in_ruleJointMovement2322);
                    this_Revolute_0=ruleRevolute();

                    state._fsp--;

                     
                            current = this_Revolute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1049:5: this_Planar_1= rulePlanar
                    {
                     
                            newCompositeNode(grammarAccess.getJointMovementAccess().getPlanarParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePlanar_in_ruleJointMovement2349);
                    this_Planar_1=rulePlanar();

                    state._fsp--;

                     
                            current = this_Planar_1; 
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
    // $ANTLR end "ruleJointMovement"


    // $ANTLR start "entryRuleRevolute"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1065:1: entryRuleRevolute returns [EObject current=null] : iv_ruleRevolute= ruleRevolute EOF ;
    public final EObject entryRuleRevolute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRevolute = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1066:2: (iv_ruleRevolute= ruleRevolute EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1067:2: iv_ruleRevolute= ruleRevolute EOF
            {
             newCompositeNode(grammarAccess.getRevoluteRule()); 
            pushFollow(FOLLOW_ruleRevolute_in_entryRuleRevolute2384);
            iv_ruleRevolute=ruleRevolute();

            state._fsp--;

             current =iv_ruleRevolute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRevolute2394); 

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
    // $ANTLR end "entryRuleRevolute"


    // $ANTLR start "ruleRevolute"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1074:1: ruleRevolute returns [EObject current=null] : (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) ) ;
    public final EObject ruleRevolute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_axis_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1077:28: ( (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1078:1: (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1078:1: (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1078:3: otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleRevolute2431); 

                	newLeafNode(otherlv_0, grammarAccess.getRevoluteAccess().getRevoluteKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1082:1: ( (lv_axis_1_0= ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1083:1: (lv_axis_1_0= ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1083:1: (lv_axis_1_0= ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1084:3: lv_axis_1_0= ruleAXIS
            {
             
            	        newCompositeNode(grammarAccess.getRevoluteAccess().getAxisAXISEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAXIS_in_ruleRevolute2452);
            lv_axis_1_0=ruleAXIS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRevoluteRule());
            	        }
                   		set(
                   			current, 
                   			"axis",
                    		lv_axis_1_0, 
                    		"AXIS");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleRevolute"


    // $ANTLR start "entryRulePlanar"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1108:1: entryRulePlanar returns [EObject current=null] : iv_rulePlanar= rulePlanar EOF ;
    public final EObject entryRulePlanar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanar = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1109:2: (iv_rulePlanar= rulePlanar EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1110:2: iv_rulePlanar= rulePlanar EOF
            {
             newCompositeNode(grammarAccess.getPlanarRule()); 
            pushFollow(FOLLOW_rulePlanar_in_entryRulePlanar2488);
            iv_rulePlanar=rulePlanar();

            state._fsp--;

             current =iv_rulePlanar; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanar2498); 

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
    // $ANTLR end "entryRulePlanar"


    // $ANTLR start "rulePlanar"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1117:1: rulePlanar returns [EObject current=null] : (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) ) ;
    public final EObject rulePlanar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_axis_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1120:28: ( (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1121:1: (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1121:1: (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1121:3: otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_rulePlanar2535); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanarAccess().getPlanarKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1125:1: ( (lv_axis_1_0= ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1126:1: (lv_axis_1_0= ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1126:1: (lv_axis_1_0= ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1127:3: lv_axis_1_0= ruleAXIS
            {
             
            	        newCompositeNode(grammarAccess.getPlanarAccess().getAxisAXISEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAXIS_in_rulePlanar2556);
            lv_axis_1_0=ruleAXIS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlanarRule());
            	        }
                   		set(
                   			current, 
                   			"axis",
                    		lv_axis_1_0, 
                    		"AXIS");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "rulePlanar"


    // $ANTLR start "entryRuleStiffnessExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1151:1: entryRuleStiffnessExp returns [EObject current=null] : iv_ruleStiffnessExp= ruleStiffnessExp EOF ;
    public final EObject entryRuleStiffnessExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStiffnessExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1152:2: (iv_ruleStiffnessExp= ruleStiffnessExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1153:2: iv_ruleStiffnessExp= ruleStiffnessExp EOF
            {
             newCompositeNode(grammarAccess.getStiffnessExpRule()); 
            pushFollow(FOLLOW_ruleStiffnessExp_in_entryRuleStiffnessExp2592);
            iv_ruleStiffnessExp=ruleStiffnessExp();

            state._fsp--;

             current =iv_ruleStiffnessExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStiffnessExp2602); 

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
    // $ANTLR end "entryRuleStiffnessExp"


    // $ANTLR start "ruleStiffnessExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1160:1: ruleStiffnessExp returns [EObject current=null] : (this_StiffnessRef_0= ruleStiffnessRef | this_BaseStiffnessExp_1= ruleBaseStiffnessExp ) ;
    public final EObject ruleStiffnessExp() throws RecognitionException {
        EObject current = null;

        EObject this_StiffnessRef_0 = null;

        EObject this_BaseStiffnessExp_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1163:28: ( (this_StiffnessRef_0= ruleStiffnessRef | this_BaseStiffnessExp_1= ruleBaseStiffnessExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1164:1: (this_StiffnessRef_0= ruleStiffnessRef | this_BaseStiffnessExp_1= ruleBaseStiffnessExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1164:1: (this_StiffnessRef_0= ruleStiffnessRef | this_BaseStiffnessExp_1= ruleBaseStiffnessExp )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==13||LA13_0==33) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1165:5: this_StiffnessRef_0= ruleStiffnessRef
                    {
                     
                            newCompositeNode(grammarAccess.getStiffnessExpAccess().getStiffnessRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStiffnessRef_in_ruleStiffnessExp2649);
                    this_StiffnessRef_0=ruleStiffnessRef();

                    state._fsp--;

                     
                            current = this_StiffnessRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1175:5: this_BaseStiffnessExp_1= ruleBaseStiffnessExp
                    {
                     
                            newCompositeNode(grammarAccess.getStiffnessExpAccess().getBaseStiffnessExpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBaseStiffnessExp_in_ruleStiffnessExp2676);
                    this_BaseStiffnessExp_1=ruleBaseStiffnessExp();

                    state._fsp--;

                     
                            current = this_BaseStiffnessExp_1; 
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
    // $ANTLR end "ruleStiffnessExp"


    // $ANTLR start "entryRuleStiffnessRef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1191:1: entryRuleStiffnessRef returns [EObject current=null] : iv_ruleStiffnessRef= ruleStiffnessRef EOF ;
    public final EObject entryRuleStiffnessRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStiffnessRef = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1192:2: (iv_ruleStiffnessRef= ruleStiffnessRef EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1193:2: iv_ruleStiffnessRef= ruleStiffnessRef EOF
            {
             newCompositeNode(grammarAccess.getStiffnessRefRule()); 
            pushFollow(FOLLOW_ruleStiffnessRef_in_entryRuleStiffnessRef2711);
            iv_ruleStiffnessRef=ruleStiffnessRef();

            state._fsp--;

             current =iv_ruleStiffnessRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStiffnessRef2721); 

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
    // $ANTLR end "entryRuleStiffnessRef"


    // $ANTLR start "ruleStiffnessRef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1200:1: ruleStiffnessRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleStiffnessRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1203:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1204:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1204:1: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1205:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1205:1: (otherlv_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1206:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStiffnessRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStiffnessRef2765); 

            		newLeafNode(otherlv_0, grammarAccess.getStiffnessRefAccess().getRefBaseStiffnessExpCrossReference_0()); 
            	

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
    // $ANTLR end "ruleStiffnessRef"


    // $ANTLR start "entryRuleBaseStiffnessExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1225:1: entryRuleBaseStiffnessExp returns [EObject current=null] : iv_ruleBaseStiffnessExp= ruleBaseStiffnessExp EOF ;
    public final EObject entryRuleBaseStiffnessExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseStiffnessExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1226:2: (iv_ruleBaseStiffnessExp= ruleBaseStiffnessExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1227:2: iv_ruleBaseStiffnessExp= ruleBaseStiffnessExp EOF
            {
             newCompositeNode(grammarAccess.getBaseStiffnessExpRule()); 
            pushFollow(FOLLOW_ruleBaseStiffnessExp_in_entryRuleBaseStiffnessExp2800);
            iv_ruleBaseStiffnessExp=ruleBaseStiffnessExp();

            state._fsp--;

             current =iv_ruleBaseStiffnessExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseStiffnessExp2810); 

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
    // $ANTLR end "entryRuleBaseStiffnessExp"


    // $ANTLR start "ruleBaseStiffnessExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1234:1: ruleBaseStiffnessExp returns [EObject current=null] : ( (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}' ) ;
    public final EObject ruleBaseStiffnessExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_springCoeff_4_0 = null;

        EObject lv_springInit_6_0 = null;

        EObject lv_dampViscous_8_0 = null;

        EObject lv_dampCoulomb_10_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1237:28: ( ( (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1238:1: ( (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1238:1: ( (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1238:2: (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}'
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1238:2: (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1238:4: otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleBaseStiffnessExp2848); 

                        	newLeafNode(otherlv_0, grammarAccess.getBaseStiffnessExpAccess().getStiffnessKeyword_0_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1242:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1243:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1243:1: (lv_name_1_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1244:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseStiffnessExp2865); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getBaseStiffnessExpAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseStiffnessExpRule());
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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleBaseStiffnessExp2884); 

                	newLeafNode(otherlv_2, grammarAccess.getBaseStiffnessExpAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleBaseStiffnessExp2896); 

                	newLeafNode(otherlv_3, grammarAccess.getBaseStiffnessExpAccess().getSpringCoeffKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1268:1: ( (lv_springCoeff_4_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1269:1: (lv_springCoeff_4_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1269:1: (lv_springCoeff_4_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1270:3: lv_springCoeff_4_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseStiffnessExpAccess().getSpringCoeffAddExpParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp2917);
            lv_springCoeff_4_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBaseStiffnessExpRule());
            	        }
                   		set(
                   			current, 
                   			"springCoeff",
                    		lv_springCoeff_4_0, 
                    		"AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleBaseStiffnessExp2929); 

                	newLeafNode(otherlv_5, grammarAccess.getBaseStiffnessExpAccess().getSpringInitKeyword_4());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1290:1: ( (lv_springInit_6_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1291:1: (lv_springInit_6_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1291:1: (lv_springInit_6_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1292:3: lv_springInit_6_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseStiffnessExpAccess().getSpringInitAddExpParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp2950);
            lv_springInit_6_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBaseStiffnessExpRule());
            	        }
                   		set(
                   			current, 
                   			"springInit",
                    		lv_springInit_6_0, 
                    		"AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleBaseStiffnessExp2962); 

                	newLeafNode(otherlv_7, grammarAccess.getBaseStiffnessExpAccess().getDampViscousKeyword_6());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1312:1: ( (lv_dampViscous_8_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1313:1: (lv_dampViscous_8_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1313:1: (lv_dampViscous_8_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1314:3: lv_dampViscous_8_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseStiffnessExpAccess().getDampViscousAddExpParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp2983);
            lv_dampViscous_8_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBaseStiffnessExpRule());
            	        }
                   		set(
                   			current, 
                   			"dampViscous",
                    		lv_dampViscous_8_0, 
                    		"AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleBaseStiffnessExp2995); 

                	newLeafNode(otherlv_9, grammarAccess.getBaseStiffnessExpAccess().getDampCoulombKeyword_8());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1334:1: ( (lv_dampCoulomb_10_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1335:1: (lv_dampCoulomb_10_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1335:1: (lv_dampCoulomb_10_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1336:3: lv_dampCoulomb_10_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseStiffnessExpAccess().getDampCoulombAddExpParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp3016);
            lv_dampCoulomb_10_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBaseStiffnessExpRule());
            	        }
                   		set(
                   			current, 
                   			"dampCoulomb",
                    		lv_dampCoulomb_10_0, 
                    		"AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleBaseStiffnessExp3028); 

                	newLeafNode(otherlv_11, grammarAccess.getBaseStiffnessExpAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleBaseStiffnessExp"


    // $ANTLR start "entryRuleRelativeTransformation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1364:1: entryRuleRelativeTransformation returns [EObject current=null] : iv_ruleRelativeTransformation= ruleRelativeTransformation EOF ;
    public final EObject entryRuleRelativeTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeTransformation = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1365:2: (iv_ruleRelativeTransformation= ruleRelativeTransformation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1366:2: iv_ruleRelativeTransformation= ruleRelativeTransformation EOF
            {
             newCompositeNode(grammarAccess.getRelativeTransformationRule()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_entryRuleRelativeTransformation3064);
            iv_ruleRelativeTransformation=ruleRelativeTransformation();

            state._fsp--;

             current =iv_ruleRelativeTransformation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeTransformation3074); 

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
    // $ANTLR end "entryRuleRelativeTransformation"


    // $ANTLR start "ruleRelativeTransformation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1373:1: ruleRelativeTransformation returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' ) ;
    public final EObject ruleRelativeTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_position_4_0 = null;

        EObject lv_reorient_6_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1376:28: ( (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1377:1: (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1377:1: (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1377:3: otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleRelativeTransformation3111); 

                	newLeafNode(otherlv_0, grammarAccess.getRelativeTransformationAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleRelativeTransformation3123); 

                	newLeafNode(otherlv_1, grammarAccess.getRelativeTransformationAccess().getWithKeyword_1());
                
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleRelativeTransformation3135); 

                	newLeafNode(otherlv_2, grammarAccess.getRelativeTransformationAccess().getRelativeKeyword_2());
                
            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleRelativeTransformation3147); 

                	newLeafNode(otherlv_3, grammarAccess.getRelativeTransformationAccess().getTransformationKeyword_3());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1393:1: ( (lv_position_4_0= ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1394:1: (lv_position_4_0= ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1394:1: (lv_position_4_0= ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1395:3: lv_position_4_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getRelativeTransformationAccess().getPositionMatrixParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleRelativeTransformation3168);
            lv_position_4_0=ruleMatrix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelativeTransformationRule());
            	        }
                   		set(
                   			current, 
                   			"position",
                    		lv_position_4_0, 
                    		"Matrix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleRelativeTransformation3180); 

                	newLeafNode(otherlv_5, grammarAccess.getRelativeTransformationAccess().getCommaKeyword_5());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1415:1: ( (lv_reorient_6_0= ruleReorientation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1416:1: (lv_reorient_6_0= ruleReorientation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1416:1: (lv_reorient_6_0= ruleReorientation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1417:3: lv_reorient_6_0= ruleReorientation
            {
             
            	        newCompositeNode(grammarAccess.getRelativeTransformationAccess().getReorientReorientationParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleReorientation_in_ruleRelativeTransformation3201);
            lv_reorient_6_0=ruleReorientation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelativeTransformationRule());
            	        }
                   		set(
                   			current, 
                   			"reorient",
                    		lv_reorient_6_0, 
                    		"Reorientation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleRelativeTransformation3213); 

                	newLeafNode(otherlv_7, grammarAccess.getRelativeTransformationAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleRelativeTransformation"


    // $ANTLR start "entryRuleReorientation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1445:1: entryRuleReorientation returns [EObject current=null] : iv_ruleReorientation= ruleReorientation EOF ;
    public final EObject entryRuleReorientation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReorientation = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1446:2: (iv_ruleReorientation= ruleReorientation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1447:2: iv_ruleReorientation= ruleReorientation EOF
            {
             newCompositeNode(grammarAccess.getReorientationRule()); 
            pushFollow(FOLLOW_ruleReorientation_in_entryRuleReorientation3249);
            iv_ruleReorientation=ruleReorientation();

            state._fsp--;

             current =iv_ruleReorientation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientation3259); 

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
    // $ANTLR end "entryRuleReorientation"


    // $ANTLR start "ruleReorientation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1454:1: ruleReorientation returns [EObject current=null] : ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) ) ;
    public final EObject ruleReorientation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1457:28: ( ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1458:1: ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1458:1: ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1458:2: (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1458:2: (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1458:4: otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleReorientation3297); 

                        	newLeafNode(otherlv_0, grammarAccess.getReorientationAccess().getReorientKeyword_0_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1462:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1463:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1463:1: (lv_name_1_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1464:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReorientation3314); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getReorientationAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReorientationRule());
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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1480:4: ( (lv_exp_2_0= ruleReorientExpression ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1481:1: (lv_exp_2_0= ruleReorientExpression )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1481:1: (lv_exp_2_0= ruleReorientExpression )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1482:3: lv_exp_2_0= ruleReorientExpression
            {
             
            	        newCompositeNode(grammarAccess.getReorientationAccess().getExpReorientExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReorientExpression_in_ruleReorientation3342);
            lv_exp_2_0=ruleReorientExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReorientationRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_2_0, 
                    		"ReorientExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleReorientation"


    // $ANTLR start "entryRuleReorientExpression"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1506:1: entryRuleReorientExpression returns [EObject current=null] : iv_ruleReorientExpression= ruleReorientExpression EOF ;
    public final EObject entryRuleReorientExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReorientExpression = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1507:2: (iv_ruleReorientExpression= ruleReorientExpression EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1508:2: iv_ruleReorientExpression= ruleReorientExpression EOF
            {
             newCompositeNode(grammarAccess.getReorientExpressionRule()); 
            pushFollow(FOLLOW_ruleReorientExpression_in_entryRuleReorientExpression3378);
            iv_ruleReorientExpression=ruleReorientExpression();

            state._fsp--;

             current =iv_ruleReorientExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientExpression3388); 

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
    // $ANTLR end "entryRuleReorientExpression"


    // $ANTLR start "ruleReorientExpression"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1515:1: ruleReorientExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' () (otherlv_3= '(' ( (lv_axis_4_0= ruleAXIS ) ) otherlv_5= ',' ( (lv_value_6_0= ruleAddExp ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_axis_10_0= ruleAXIS ) ) otherlv_11= ',' ( (lv_value_12_0= ruleAddExp ) ) otherlv_13= ')' )* )? otherlv_14= ')' ) ) ;
    public final EObject ruleReorientExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Enumerator lv_axis_4_0 = null;

        EObject lv_value_6_0 = null;

        Enumerator lv_axis_10_0 = null;

        EObject lv_value_12_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1518:28: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' () (otherlv_3= '(' ( (lv_axis_4_0= ruleAXIS ) ) otherlv_5= ',' ( (lv_value_6_0= ruleAddExp ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_axis_10_0= ruleAXIS ) ) otherlv_11= ',' ( (lv_value_12_0= ruleAddExp ) ) otherlv_13= ')' )* )? otherlv_14= ')' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1519:1: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' () (otherlv_3= '(' ( (lv_axis_4_0= ruleAXIS ) ) otherlv_5= ',' ( (lv_value_6_0= ruleAddExp ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_axis_10_0= ruleAXIS ) ) otherlv_11= ',' ( (lv_value_12_0= ruleAddExp ) ) otherlv_13= ')' )* )? otherlv_14= ')' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1519:1: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' () (otherlv_3= '(' ( (lv_axis_4_0= ruleAXIS ) ) otherlv_5= ',' ( (lv_value_6_0= ruleAddExp ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_axis_10_0= ruleAXIS ) ) otherlv_11= ',' ( (lv_value_12_0= ruleAddExp ) ) otherlv_13= ')' )* )? otherlv_14= ')' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==38) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1519:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1519:2: ( (otherlv_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1520:1: (otherlv_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1520:1: (otherlv_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1521:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReorientExpressionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReorientExpression3433); 

                    		newLeafNode(otherlv_0, grammarAccess.getReorientExpressionAccess().getRefReorientationCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1533:6: (otherlv_1= '(' () (otherlv_3= '(' ( (lv_axis_4_0= ruleAXIS ) ) otherlv_5= ',' ( (lv_value_6_0= ruleAddExp ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_axis_10_0= ruleAXIS ) ) otherlv_11= ',' ( (lv_value_12_0= ruleAddExp ) ) otherlv_13= ')' )* )? otherlv_14= ')' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1533:6: (otherlv_1= '(' () (otherlv_3= '(' ( (lv_axis_4_0= ruleAXIS ) ) otherlv_5= ',' ( (lv_value_6_0= ruleAddExp ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_axis_10_0= ruleAXIS ) ) otherlv_11= ',' ( (lv_value_12_0= ruleAddExp ) ) otherlv_13= ')' )* )? otherlv_14= ')' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1533:8: otherlv_1= '(' () (otherlv_3= '(' ( (lv_axis_4_0= ruleAXIS ) ) otherlv_5= ',' ( (lv_value_6_0= ruleAddExp ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_axis_10_0= ruleAXIS ) ) otherlv_11= ',' ( (lv_value_12_0= ruleAddExp ) ) otherlv_13= ')' )* )? otherlv_14= ')'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleReorientExpression3452); 

                        	newLeafNode(otherlv_1, grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1537:1: ()
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1538:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getReorientExpressionAccess().getReorientExpressionAction_1_1(),
                                current);
                        

                    }

                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1543:2: (otherlv_3= '(' ( (lv_axis_4_0= ruleAXIS ) ) otherlv_5= ',' ( (lv_value_6_0= ruleAddExp ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_axis_10_0= ruleAXIS ) ) otherlv_11= ',' ( (lv_value_12_0= ruleAddExp ) ) otherlv_13= ')' )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==38) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1543:4: otherlv_3= '(' ( (lv_axis_4_0= ruleAXIS ) ) otherlv_5= ',' ( (lv_value_6_0= ruleAddExp ) ) otherlv_7= ')' (otherlv_8= ',' otherlv_9= '(' ( (lv_axis_10_0= ruleAXIS ) ) otherlv_11= ',' ( (lv_value_12_0= ruleAddExp ) ) otherlv_13= ')' )*
                            {
                            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleReorientExpression3474); 

                                	newLeafNode(otherlv_3, grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_2_0());
                                
                            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1547:1: ( (lv_axis_4_0= ruleAXIS ) )
                            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1548:1: (lv_axis_4_0= ruleAXIS )
                            {
                            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1548:1: (lv_axis_4_0= ruleAXIS )
                            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1549:3: lv_axis_4_0= ruleAXIS
                            {
                             
                            	        newCompositeNode(grammarAccess.getReorientExpressionAccess().getAxisAXISEnumRuleCall_1_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAXIS_in_ruleReorientExpression3495);
                            lv_axis_4_0=ruleAXIS();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getReorientExpressionRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"axis",
                                    		lv_axis_4_0, 
                                    		"AXIS");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleReorientExpression3507); 

                                	newLeafNode(otherlv_5, grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_2_2());
                                
                            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1569:1: ( (lv_value_6_0= ruleAddExp ) )
                            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1570:1: (lv_value_6_0= ruleAddExp )
                            {
                            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1570:1: (lv_value_6_0= ruleAddExp )
                            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1571:3: lv_value_6_0= ruleAddExp
                            {
                             
                            	        newCompositeNode(grammarAccess.getReorientExpressionAccess().getValueAddExpParserRuleCall_1_2_3_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAddExp_in_ruleReorientExpression3528);
                            lv_value_6_0=ruleAddExp();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getReorientExpressionRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"value",
                                    		lv_value_6_0, 
                                    		"AddExp");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleReorientExpression3540); 

                                	newLeafNode(otherlv_7, grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_2_4());
                                
                            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1591:1: (otherlv_8= ',' otherlv_9= '(' ( (lv_axis_10_0= ruleAXIS ) ) otherlv_11= ',' ( (lv_value_12_0= ruleAddExp ) ) otherlv_13= ')' )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==41) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1591:3: otherlv_8= ',' otherlv_9= '(' ( (lv_axis_10_0= ruleAXIS ) ) otherlv_11= ',' ( (lv_value_12_0= ruleAddExp ) ) otherlv_13= ')'
                            	    {
                            	    otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleReorientExpression3553); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_2_5_0());
                            	        
                            	    otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleReorientExpression3565); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_2_5_1());
                            	        
                            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1599:1: ( (lv_axis_10_0= ruleAXIS ) )
                            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1600:1: (lv_axis_10_0= ruleAXIS )
                            	    {
                            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1600:1: (lv_axis_10_0= ruleAXIS )
                            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1601:3: lv_axis_10_0= ruleAXIS
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getReorientExpressionAccess().getAxisAXISEnumRuleCall_1_2_5_2_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleAXIS_in_ruleReorientExpression3586);
                            	    lv_axis_10_0=ruleAXIS();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getReorientExpressionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"axis",
                            	            		lv_axis_10_0, 
                            	            		"AXIS");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }

                            	    otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleReorientExpression3598); 

                            	        	newLeafNode(otherlv_11, grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_2_5_3());
                            	        
                            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1621:1: ( (lv_value_12_0= ruleAddExp ) )
                            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1622:1: (lv_value_12_0= ruleAddExp )
                            	    {
                            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1622:1: (lv_value_12_0= ruleAddExp )
                            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1623:3: lv_value_12_0= ruleAddExp
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getReorientExpressionAccess().getValueAddExpParserRuleCall_1_2_5_4_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleAddExp_in_ruleReorientExpression3619);
                            	    lv_value_12_0=ruleAddExp();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getReorientExpressionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"value",
                            	            		lv_value_12_0, 
                            	            		"AddExp");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }

                            	    otherlv_13=(Token)match(input,42,FOLLOW_42_in_ruleReorientExpression3631); 

                            	        	newLeafNode(otherlv_13, grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_2_5_5());
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,42,FOLLOW_42_in_ruleReorientExpression3647); 

                        	newLeafNode(otherlv_14, grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_3());
                        

                    }


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
    // $ANTLR end "ruleReorientExpression"


    // $ANTLR start "entryRuleConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1655:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1656:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1657:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint3684);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint3694); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1664:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_body1_5_0 = null;

        EObject lv_relTrans1_6_0 = null;

        EObject lv_body2_8_0 = null;

        EObject lv_relTrans2_9_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1667:28: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1668:1: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1668:1: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1668:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleConstraint3731); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1672:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1673:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1673:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1674:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint3748); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleConstraint3765); 

                	newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getColonKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1694:1: ( (lv_type_3_0= ruleConstraintType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1695:1: (lv_type_3_0= ruleConstraintType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1695:1: (lv_type_3_0= ruleConstraintType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1696:3: lv_type_3_0= ruleConstraintType
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintType_in_ruleConstraint3786);
            lv_type_3_0=ruleConstraintType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"ConstraintType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleConstraint3798); 

                	newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getBetweenKeyword_4());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1716:1: ( (lv_body1_5_0= ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1717:1: (lv_body1_5_0= ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1717:1: (lv_body1_5_0= ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1718:3: lv_body1_5_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getBody1BodyReferenceParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyReference_in_ruleConstraint3819);
            lv_body1_5_0=ruleBodyReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"body1",
                    		lv_body1_5_0, 
                    		"BodyReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1734:2: ( (lv_relTrans1_6_0= ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1735:1: (lv_relTrans1_6_0= ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1735:1: (lv_relTrans1_6_0= ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1736:3: lv_relTrans1_6_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getRelTrans1RelativeTransformationParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleRelativeTransformation_in_ruleConstraint3840);
            lv_relTrans1_6_0=ruleRelativeTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"relTrans1",
                    		lv_relTrans1_6_0, 
                    		"RelativeTransformation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleConstraint3852); 

                	newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getAndKeyword_7());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1756:1: ( (lv_body2_8_0= ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1757:1: (lv_body2_8_0= ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1757:1: (lv_body2_8_0= ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1758:3: lv_body2_8_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getBody2BodyReferenceParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyReference_in_ruleConstraint3873);
            lv_body2_8_0=ruleBodyReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"body2",
                    		lv_body2_8_0, 
                    		"BodyReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1774:2: ( (lv_relTrans2_9_0= ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1775:1: (lv_relTrans2_9_0= ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1775:1: (lv_relTrans2_9_0= ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1776:3: lv_relTrans2_9_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getRelTrans2RelativeTransformationParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleRelativeTransformation_in_ruleConstraint3894);
            lv_relTrans2_9_0=ruleRelativeTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"relTrans2",
                    		lv_relTrans2_9_0, 
                    		"RelativeTransformation");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleExternalLoad"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1800:1: entryRuleExternalLoad returns [EObject current=null] : iv_ruleExternalLoad= ruleExternalLoad EOF ;
    public final EObject entryRuleExternalLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalLoad = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1801:2: (iv_ruleExternalLoad= ruleExternalLoad EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1802:2: iv_ruleExternalLoad= ruleExternalLoad EOF
            {
             newCompositeNode(grammarAccess.getExternalLoadRule()); 
            pushFollow(FOLLOW_ruleExternalLoad_in_entryRuleExternalLoad3930);
            iv_ruleExternalLoad=ruleExternalLoad();

            state._fsp--;

             current =iv_ruleExternalLoad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalLoad3940); 

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
    // $ANTLR end "entryRuleExternalLoad"


    // $ANTLR start "ruleExternalLoad"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1809:1: ruleExternalLoad returns [EObject current=null] : (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')' ) ;
    public final EObject ruleExternalLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_body1_6_0 = null;

        EObject lv_position_11_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1812:28: ( (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1813:1: (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1813:1: (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1813:3: otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleExternalLoad3977); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalLoadAccess().getExternalKeyword_0());
                
            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleExternalLoad3989); 

                	newLeafNode(otherlv_1, grammarAccess.getExternalLoadAccess().getLoadKeyword_1());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1821:1: ( (lv_name_2_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1822:1: (lv_name_2_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1822:1: (lv_name_2_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1823:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalLoad4006); 

            			newLeafNode(lv_name_2_0, grammarAccess.getExternalLoadAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalLoadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleExternalLoad4023); 

                	newLeafNode(otherlv_3, grammarAccess.getExternalLoadAccess().getColonKeyword_3());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1843:1: ( (lv_type_4_0= ruleLoadType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1844:1: (lv_type_4_0= ruleLoadType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1844:1: (lv_type_4_0= ruleLoadType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1845:3: lv_type_4_0= ruleLoadType
            {
             
            	        newCompositeNode(grammarAccess.getExternalLoadAccess().getTypeLoadTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleLoadType_in_ruleExternalLoad4044);
            lv_type_4_0=ruleLoadType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalLoadRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"LoadType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleExternalLoad4056); 

                	newLeafNode(otherlv_5, grammarAccess.getExternalLoadAccess().getAtKeyword_5());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1865:1: ( (lv_body1_6_0= ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1866:1: (lv_body1_6_0= ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1866:1: (lv_body1_6_0= ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1867:3: lv_body1_6_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getExternalLoadAccess().getBody1BodyReferenceParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyReference_in_ruleExternalLoad4077);
            lv_body1_6_0=ruleBodyReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalLoadRule());
            	        }
                   		set(
                   			current, 
                   			"body1",
                    		lv_body1_6_0, 
                    		"BodyReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleExternalLoad4089); 

                	newLeafNode(otherlv_7, grammarAccess.getExternalLoadAccess().getLeftParenthesisKeyword_7());
                
            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleExternalLoad4101); 

                	newLeafNode(otherlv_8, grammarAccess.getExternalLoadAccess().getWithKeyword_8());
                
            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleExternalLoad4113); 

                	newLeafNode(otherlv_9, grammarAccess.getExternalLoadAccess().getRelativeKeyword_9());
                
            otherlv_10=(Token)match(input,40,FOLLOW_40_in_ruleExternalLoad4125); 

                	newLeafNode(otherlv_10, grammarAccess.getExternalLoadAccess().getTransformationKeyword_10());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1899:1: ( (lv_position_11_0= ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1900:1: (lv_position_11_0= ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1900:1: (lv_position_11_0= ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1901:3: lv_position_11_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getExternalLoadAccess().getPositionMatrixParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleExternalLoad4146);
            lv_position_11_0=ruleMatrix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalLoadRule());
            	        }
                   		set(
                   			current, 
                   			"position",
                    		lv_position_11_0, 
                    		"Matrix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,42,FOLLOW_42_in_ruleExternalLoad4158); 

                	newLeafNode(otherlv_12, grammarAccess.getExternalLoadAccess().getRightParenthesisKeyword_12());
                

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
    // $ANTLR end "ruleExternalLoad"


    // $ANTLR start "entryRuleMatrix"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1929:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1930:2: (iv_ruleMatrix= ruleMatrix EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1931:2: iv_ruleMatrix= ruleMatrix EOF
            {
             newCompositeNode(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_ruleMatrix_in_entryRuleMatrix4194);
            iv_ruleMatrix=ruleMatrix();

            state._fsp--;

             current =iv_ruleMatrix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix4204); 

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
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1938:1: ruleMatrix returns [EObject current=null] : (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        EObject this_BaseMatrix_0 = null;

        EObject this_MatrixRef_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1941:28: ( (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1942:1: (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1942:1: (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=48 && LA19_0<=49)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1943:5: this_BaseMatrix_0= ruleBaseMatrix
                    {
                     
                            newCompositeNode(grammarAccess.getMatrixAccess().getBaseMatrixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBaseMatrix_in_ruleMatrix4251);
                    this_BaseMatrix_0=ruleBaseMatrix();

                    state._fsp--;

                     
                            current = this_BaseMatrix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1953:5: this_MatrixRef_1= ruleMatrixRef
                    {
                     
                            newCompositeNode(grammarAccess.getMatrixAccess().getMatrixRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMatrixRef_in_ruleMatrix4278);
                    this_MatrixRef_1=ruleMatrixRef();

                    state._fsp--;

                     
                            current = this_MatrixRef_1; 
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
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleBaseMatrix"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1969:1: entryRuleBaseMatrix returns [EObject current=null] : iv_ruleBaseMatrix= ruleBaseMatrix EOF ;
    public final EObject entryRuleBaseMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseMatrix = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1970:2: (iv_ruleBaseMatrix= ruleBaseMatrix EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1971:2: iv_ruleBaseMatrix= ruleBaseMatrix EOF
            {
             newCompositeNode(grammarAccess.getBaseMatrixRule()); 
            pushFollow(FOLLOW_ruleBaseMatrix_in_entryRuleBaseMatrix4313);
            iv_ruleBaseMatrix=ruleBaseMatrix();

            state._fsp--;

             current =iv_ruleBaseMatrix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseMatrix4323); 

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
    // $ANTLR end "entryRuleBaseMatrix"


    // $ANTLR start "ruleBaseMatrix"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1978:1: ruleBaseMatrix returns [EObject current=null] : ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleBaseMatrix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_values_3_0 = null;

        EObject lv_values_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1981:28: ( ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1982:1: ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1982:1: ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1982:2: (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']'
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1982:2: (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1982:4: otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleBaseMatrix4361); 

                        	newLeafNode(otherlv_0, grammarAccess.getBaseMatrixAccess().getMatrixKeyword_0_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1986:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1987:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1987:1: (lv_name_1_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1988:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseMatrix4378); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getBaseMatrixAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseMatrixRule());
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

            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleBaseMatrix4397); 

                	newLeafNode(otherlv_2, grammarAccess.getBaseMatrixAccess().getLeftSquareBracketKeyword_1());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2008:1: ( (lv_values_3_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2009:1: (lv_values_3_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2009:1: (lv_values_3_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2010:3: lv_values_3_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleBaseMatrix4418);
            lv_values_3_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBaseMatrixRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2026:2: (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==41) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2026:4: otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) )
            	    {
            	    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleBaseMatrix4431); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBaseMatrixAccess().getCommaKeyword_3_0());
            	        
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2030:1: ( (lv_values_5_0= ruleAddExp ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2031:1: (lv_values_5_0= ruleAddExp )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2031:1: (lv_values_5_0= ruleAddExp )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2032:3: lv_values_5_0= ruleAddExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAddExp_in_ruleBaseMatrix4452);
            	    lv_values_5_0=ruleAddExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBaseMatrixRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_5_0, 
            	            		"AddExp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleBaseMatrix4466); 

                	newLeafNode(otherlv_6, grammarAccess.getBaseMatrixAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleBaseMatrix"


    // $ANTLR start "entryRuleMatrixRef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2060:1: entryRuleMatrixRef returns [EObject current=null] : iv_ruleMatrixRef= ruleMatrixRef EOF ;
    public final EObject entryRuleMatrixRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixRef = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2061:2: (iv_ruleMatrixRef= ruleMatrixRef EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2062:2: iv_ruleMatrixRef= ruleMatrixRef EOF
            {
             newCompositeNode(grammarAccess.getMatrixRefRule()); 
            pushFollow(FOLLOW_ruleMatrixRef_in_entryRuleMatrixRef4502);
            iv_ruleMatrixRef=ruleMatrixRef();

            state._fsp--;

             current =iv_ruleMatrixRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrixRef4512); 

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
    // $ANTLR end "entryRuleMatrixRef"


    // $ANTLR start "ruleMatrixRef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2069:1: ruleMatrixRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleMatrixRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2072:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2073:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2073:1: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2074:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2074:1: (otherlv_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2075:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMatrixRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMatrixRef4556); 

            		newLeafNode(otherlv_0, grammarAccess.getMatrixRefAccess().getMatrixBaseMatrixCrossReference_0()); 
            	

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
    // $ANTLR end "ruleMatrixRef"


    // $ANTLR start "entryRuleAddExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2094:1: entryRuleAddExp returns [EObject current=null] : iv_ruleAddExp= ruleAddExp EOF ;
    public final EObject entryRuleAddExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2095:2: (iv_ruleAddExp= ruleAddExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2096:2: iv_ruleAddExp= ruleAddExp EOF
            {
             newCompositeNode(grammarAccess.getAddExpRule()); 
            pushFollow(FOLLOW_ruleAddExp_in_entryRuleAddExp4591);
            iv_ruleAddExp=ruleAddExp();

            state._fsp--;

             current =iv_ruleAddExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExp4601); 

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
    // $ANTLR end "entryRuleAddExp"


    // $ANTLR start "ruleAddExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2103:1: ruleAddExp returns [EObject current=null] : (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* ) ;
    public final EObject ruleAddExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultExp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2106:28: ( (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2107:1: (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2107:1: (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2108:5: this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAddExpAccess().getMultExpParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultExp_in_ruleAddExp4648);
            this_MultExp_0=ruleMultExp();

            state._fsp--;

             
                    current = this_MultExp_0; 
                    afterParserOrEnumRuleCall();
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2116:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29||LA23_0==51) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2116:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2116:2: ()
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2117:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2122:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2123:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2123:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2124:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2124:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==29) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==51) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2125:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,29,FOLLOW_29_in_ruleAddExp4677); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getAddExpAccess().getOpPlusSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAddExpRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2137:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,51,FOLLOW_51_in_ruleAddExp4706); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getAddExpAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAddExpRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2152:2: ( (lv_right_3_0= ruleMultExp ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2153:1: (lv_right_3_0= ruleMultExp )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2153:1: (lv_right_3_0= ruleMultExp )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2154:3: lv_right_3_0= ruleMultExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddExpAccess().getRightMultExpParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultExp_in_ruleAddExp4743);
            	    lv_right_3_0=ruleMultExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAddExpRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"MultExp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
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
    // $ANTLR end "ruleAddExp"


    // $ANTLR start "entryRuleMultExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2178:1: entryRuleMultExp returns [EObject current=null] : iv_ruleMultExp= ruleMultExp EOF ;
    public final EObject entryRuleMultExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2179:2: (iv_ruleMultExp= ruleMultExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2180:2: iv_ruleMultExp= ruleMultExp EOF
            {
             newCompositeNode(grammarAccess.getMultExpRule()); 
            pushFollow(FOLLOW_ruleMultExp_in_entryRuleMultExp4781);
            iv_ruleMultExp=ruleMultExp();

            state._fsp--;

             current =iv_ruleMultExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExp4791); 

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
    // $ANTLR end "entryRuleMultExp"


    // $ANTLR start "ruleMultExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2187:1: ruleMultExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2190:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2191:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2191:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2192:5: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultExpAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleMultExp4838);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2200:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=52 && LA25_0<=53)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2200:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2200:2: ()
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2201:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMultExpAccess().getMultExpLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2206:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2207:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2207:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2208:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2208:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==52) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==53) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2209:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,52,FOLLOW_52_in_ruleMultExp4867); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getMultExpAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultExpRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2221:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,53,FOLLOW_53_in_ruleMultExp4896); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getMultExpAccess().getOpSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultExpRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2236:2: ( (lv_right_3_0= rulePrimary ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2237:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2237:1: (lv_right_3_0= rulePrimary )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2238:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultExpAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleMultExp4933);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultExpRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Primary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
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
    // $ANTLR end "ruleMultExp"


    // $ANTLR start "entryRulePrimary"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2262:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2263:2: (iv_rulePrimary= rulePrimary EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2264:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary4971);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary4981); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2271:1: rulePrimary returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_ParenthesisedExp_1= ruleParenthesisedExp | this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_ParenthesisedExp_1 = null;

        EObject this_ConstantOrFunctionCallExp_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2274:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_ParenthesisedExp_1= ruleParenthesisedExp | this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2275:1: (this_NumberLiteral_0= ruleNumberLiteral | this_ParenthesisedExp_1= ruleParenthesisedExp | this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2275:1: (this_NumberLiteral_0= ruleNumberLiteral | this_ParenthesisedExp_1= ruleParenthesisedExp | this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_REAL:
            case 51:
                {
                alt26=1;
                }
                break;
            case 38:
                {
                alt26=2;
                }
                break;
            case RULE_ID:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2276:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_rulePrimary5028);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2286:5: this_ParenthesisedExp_1= ruleParenthesisedExp
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisedExpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParenthesisedExp_in_rulePrimary5055);
                    this_ParenthesisedExp_1=ruleParenthesisedExp();

                    state._fsp--;

                     
                            current = this_ParenthesisedExp_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2296:5: this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getConstantOrFunctionCallExpParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConstantOrFunctionCallExp_in_rulePrimary5082);
                    this_ConstantOrFunctionCallExp_2=ruleConstantOrFunctionCallExp();

                    state._fsp--;

                     
                            current = this_ConstantOrFunctionCallExp_2; 
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesisedExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2312:1: entryRuleParenthesisedExp returns [EObject current=null] : iv_ruleParenthesisedExp= ruleParenthesisedExp EOF ;
    public final EObject entryRuleParenthesisedExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisedExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2313:2: (iv_ruleParenthesisedExp= ruleParenthesisedExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2314:2: iv_ruleParenthesisedExp= ruleParenthesisedExp EOF
            {
             newCompositeNode(grammarAccess.getParenthesisedExpRule()); 
            pushFollow(FOLLOW_ruleParenthesisedExp_in_entryRuleParenthesisedExp5117);
            iv_ruleParenthesisedExp=ruleParenthesisedExp();

            state._fsp--;

             current =iv_ruleParenthesisedExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisedExp5127); 

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
    // $ANTLR end "entryRuleParenthesisedExp"


    // $ANTLR start "ruleParenthesisedExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2321:1: ruleParenthesisedExp returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesisedExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2324:28: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2325:1: (otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2325:1: (otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2325:3: otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleParenthesisedExp5164); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesisedExpAccess().getLeftParenthesisKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2329:1: ( (lv_exp_1_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2330:1: (lv_exp_1_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2330:1: (lv_exp_1_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2331:3: lv_exp_1_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getParenthesisedExpAccess().getExpAddExpParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleParenthesisedExp5185);
            lv_exp_1_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParenthesisedExpRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_1_0, 
                    		"AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleParenthesisedExp5197); 

                	newLeafNode(otherlv_2, grammarAccess.getParenthesisedExpAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleParenthesisedExp"


    // $ANTLR start "entryRuleConstantOrFunctionCallExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2359:1: entryRuleConstantOrFunctionCallExp returns [EObject current=null] : iv_ruleConstantOrFunctionCallExp= ruleConstantOrFunctionCallExp EOF ;
    public final EObject entryRuleConstantOrFunctionCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantOrFunctionCallExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2360:2: (iv_ruleConstantOrFunctionCallExp= ruleConstantOrFunctionCallExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2361:2: iv_ruleConstantOrFunctionCallExp= ruleConstantOrFunctionCallExp EOF
            {
             newCompositeNode(grammarAccess.getConstantOrFunctionCallExpRule()); 
            pushFollow(FOLLOW_ruleConstantOrFunctionCallExp_in_entryRuleConstantOrFunctionCallExp5233);
            iv_ruleConstantOrFunctionCallExp=ruleConstantOrFunctionCallExp();

            state._fsp--;

             current =iv_ruleConstantOrFunctionCallExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantOrFunctionCallExp5243); 

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
    // $ANTLR end "entryRuleConstantOrFunctionCallExp"


    // $ANTLR start "ruleConstantOrFunctionCallExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2368:1: ruleConstantOrFunctionCallExp returns [EObject current=null] : ( ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleConstantOrFunctionCallExp() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_2_0 = null;

        EObject lv_param_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2371:28: ( ( ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2372:1: ( ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2372:1: ( ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2372:2: ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )?
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2372:2: ( (lv_label_0_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2373:1: (lv_label_0_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2373:1: (lv_label_0_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2374:3: lv_label_0_0= RULE_ID
            {
            lv_label_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantOrFunctionCallExp5285); 

            			newLeafNode(lv_label_0_0, grammarAccess.getConstantOrFunctionCallExpAccess().getLabelIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantOrFunctionCallExpRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_0_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2390:2: (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2390:4: otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleConstantOrFunctionCallExp5303); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstantOrFunctionCallExpAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2394:1: ( (lv_param_2_0= ruleAddExp ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2395:1: (lv_param_2_0= ruleAddExp )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2395:1: (lv_param_2_0= ruleAddExp )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2396:3: lv_param_2_0= ruleAddExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddExp_in_ruleConstantOrFunctionCallExp5324);
                    lv_param_2_0=ruleAddExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantOrFunctionCallExpRule());
                    	        }
                           		add(
                           			current, 
                           			"param",
                            		lv_param_2_0, 
                            		"AddExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2412:2: (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==41) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2412:4: otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) )
                    	    {
                    	    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleConstantOrFunctionCallExp5337); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getConstantOrFunctionCallExpAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2416:1: ( (lv_param_4_0= ruleAddExp ) )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2417:1: (lv_param_4_0= ruleAddExp )
                    	    {
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2417:1: (lv_param_4_0= ruleAddExp )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2418:3: lv_param_4_0= ruleAddExp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddExp_in_ruleConstantOrFunctionCallExp5358);
                    	    lv_param_4_0=ruleAddExp();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstantOrFunctionCallExpRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"param",
                    	            		lv_param_4_0, 
                    	            		"AddExp");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleConstantOrFunctionCallExp5372); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstantOrFunctionCallExpAccess().getRightParenthesisKeyword_1_3());
                        

                    }
                    break;

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
    // $ANTLR end "ruleConstantOrFunctionCallExp"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2446:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2447:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2448:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral5410);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral5420); 

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2455:1: ruleNumberLiteral returns [EObject current=null] : ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_neg_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2458:28: ( ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2459:1: ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2459:1: ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2459:2: ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2459:2: ( (lv_neg_0_0= '-' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2460:1: (lv_neg_0_0= '-' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2460:1: (lv_neg_0_0= '-' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2461:3: lv_neg_0_0= '-'
                    {
                    lv_neg_0_0=(Token)match(input,51,FOLLOW_51_in_ruleNumberLiteral5463); 

                            newLeafNode(lv_neg_0_0, grammarAccess.getNumberLiteralAccess().getNegHyphenMinusKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "neg", true, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2474:3: ( (lv_value_1_0= RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2475:1: (lv_value_1_0= RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2475:1: (lv_value_1_0= RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2476:3: lv_value_1_0= RULE_REAL
            {
            lv_value_1_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleNumberLiteral5494); 

            			newLeafNode(lv_value_1_0, grammarAccess.getNumberLiteralAccess().getValueREALTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"REAL");
            	    

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "ruleAXIS"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2500:1: ruleAXIS returns [Enumerator current=null] : ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) ) ;
    public final Enumerator ruleAXIS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2502:28: ( ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2503:1: ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2503:1: ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt30=1;
                }
                break;
            case 55:
                {
                alt30=2;
                }
                break;
            case 56:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2503:2: (enumLiteral_0= 'x' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2503:2: (enumLiteral_0= 'x' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2503:4: enumLiteral_0= 'x'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleAXIS5549); 

                            current = grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2509:6: (enumLiteral_1= 'y' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2509:6: (enumLiteral_1= 'y' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2509:8: enumLiteral_1= 'y'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleAXIS5566); 

                            current = grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2515:6: (enumLiteral_2= 'z' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2515:6: (enumLiteral_2= 'z' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2515:8: enumLiteral_2= 'z'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleAXIS5583); 

                            current = grammarAccess.getAXISAccess().getZEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAXISAccess().getZEnumLiteralDeclaration_2()); 
                        

                    }


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
    // $ANTLR end "ruleAXIS"


    // $ANTLR start "ruleConstraintType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2525:1: ruleConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) ) ;
    public final Enumerator ruleConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2527:28: ( ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2528:1: ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2528:1: ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==57) ) {
                alt31=1;
            }
            else if ( (LA31_0==58) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2528:2: (enumLiteral_0= 'geometrical' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2528:2: (enumLiteral_0= 'geometrical' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2528:4: enumLiteral_0= 'geometrical'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleConstraintType5628); 

                            current = grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2534:6: (enumLiteral_1= 'velocity' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2534:6: (enumLiteral_1= 'velocity' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2534:8: enumLiteral_1= 'velocity'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleConstraintType5645); 

                            current = grammarAccess.getConstraintTypeAccess().getVELOCITYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConstraintTypeAccess().getVELOCITYEnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleConstraintType"


    // $ANTLR start "ruleLoadType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2544:1: ruleLoadType returns [Enumerator current=null] : ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) ) ;
    public final Enumerator ruleLoadType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2546:28: ( ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2547:1: ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2547:1: ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==59) ) {
                alt32=1;
            }
            else if ( (LA32_0==60) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2547:2: (enumLiteral_0= 'force' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2547:2: (enumLiteral_0= 'force' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2547:4: enumLiteral_0= 'force'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleLoadType5690); 

                            current = grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2553:6: (enumLiteral_1= 'torque' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2553:6: (enumLiteral_1= 'torque' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2553:8: enumLiteral_1= 'torque'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleLoadType5707); 

                            current = grammarAccess.getLoadTypeAccess().getTORQUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLoadTypeAccess().getTORQUEEnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleLoadType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialDefinition_in_ruleModel131 = new BitSet(new long[]{0x0003000380803010L});
    public static final BitSet FOLLOW_ruleEnvironment_in_ruleModel153 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleModel174 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleInitialDefinition_in_entryRuleInitialDefinition211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialDefinition221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_ruleInitialDefinition268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_ruleInitialDefinition295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseStiffnessExp_in_ruleInitialDefinition322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_entryRuleEnvironment357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironment367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEnvironment404 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnvironment416 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnvironment428 = new BitSet(new long[]{0x0003000000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleEnvironment449 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnvironment461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSystem544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem561 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem578 = new BitSet(new long[]{0x0000300000820000L});
    public static final BitSet FOLLOW_ruleSystemElement_in_ruleSystem599 = new BitSet(new long[]{0x0000300000828000L});
    public static final BitSet FOLLOW_15_in_ruleSystem612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemElement_in_entryRuleSystemElement648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemElement658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_ruleSystemElement705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnective_in_ruleSystemElement732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnective_in_entryRuleConnective767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnective777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_ruleConnective824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleConnective851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLoad_in_ruleConnective878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBody960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody977 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBody994 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleMass_in_ruleBody1015 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBody1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_entryRuleBodyReference1063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyReference1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBodyReference1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyReference1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_entryRuleMass1191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMass1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMass1238 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMass1250 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMass1262 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleMass1283 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMass1295 = new BitSet(new long[]{0x0003000000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleMass1316 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMass1328 = new BitSet(new long[]{0x0003000000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleMass1349 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMass1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_entryRuleJoint1397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoint1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleJoint1444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJoint1461 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleJoint1478 = new BitSet(new long[]{0x0000000180800010L});
    public static final BitSet FOLLOW_ruleJointType_in_ruleJoint1499 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleJoint1517 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleJoint1543 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleBodyReference_in_ruleJoint1564 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_ruleJoint1585 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleJoint1597 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleBodyReference_in_ruleJoint1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_entryRuleJointType1654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointType1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleJointType1702 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleJointType1714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJointType1731 = new BitSet(new long[]{0x0000000180800010L});
    public static final BitSet FOLLOW_ruleAdditiveJointType_in_ruleJointType1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveJointType_in_entryRuleAdditiveJointType1795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveJointType1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryJointType_in_ruleAdditiveJointType1852 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAdditiveJointType1864 = new BitSet(new long[]{0x0000000180800010L});
    public static final BitSet FOLLOW_rulePrimaryJointType_in_ruleAdditiveJointType1894 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rulePrimaryJointType_in_entryRulePrimaryJointType1932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryJointType1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointTypeReference_in_rulePrimaryJointType1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicJointType_in_rulePrimaryJointType2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointTypeReference_in_entryRuleJointTypeReference2051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointTypeReference2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJointTypeReference2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicJointType_in_entryRuleBasicJointType2140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicJointType2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointMovement_in_ruleBasicJointType2196 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleBasicJointType2208 = new BitSet(new long[]{0x0003000380803010L});
    public static final BitSet FOLLOW_ruleStiffnessExp_in_ruleBasicJointType2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointMovement_in_entryRuleJointMovement2265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointMovement2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRevolute_in_ruleJointMovement2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanar_in_ruleJointMovement2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRevolute_in_entryRuleRevolute2384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRevolute2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRevolute2431 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_ruleRevolute2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanar_in_entryRulePlanar2488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanar2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePlanar2535 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_rulePlanar2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStiffnessExp_in_entryRuleStiffnessExp2592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStiffnessExp2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStiffnessRef_in_ruleStiffnessExp2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseStiffnessExp_in_ruleStiffnessExp2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStiffnessRef_in_entryRuleStiffnessRef2711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStiffnessRef2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStiffnessRef2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseStiffnessExp_in_entryRuleBaseStiffnessExp2800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseStiffnessExp2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBaseStiffnessExp2848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseStiffnessExp2865 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBaseStiffnessExp2884 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBaseStiffnessExp2896 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp2917 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBaseStiffnessExp2929 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp2950 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleBaseStiffnessExp2962 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp2983 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBaseStiffnessExp2995 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp3016 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBaseStiffnessExp3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_entryRuleRelativeTransformation3064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeTransformation3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRelativeTransformation3111 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRelativeTransformation3123 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRelativeTransformation3135 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleRelativeTransformation3147 = new BitSet(new long[]{0x0003000000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleRelativeTransformation3168 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleRelativeTransformation3180 = new BitSet(new long[]{0x0000084000000010L});
    public static final BitSet FOLLOW_ruleReorientation_in_ruleRelativeTransformation3201 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleRelativeTransformation3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientation_in_entryRuleReorientation3249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientation3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleReorientation3297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReorientation3314 = new BitSet(new long[]{0x0000084000000010L});
    public static final BitSet FOLLOW_ruleReorientExpression_in_ruleReorientation3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientExpression_in_entryRuleReorientExpression3378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientExpression3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReorientExpression3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleReorientExpression3452 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_38_in_ruleReorientExpression3474 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_ruleReorientExpression3495 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleReorientExpression3507 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleReorientExpression3528 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleReorientExpression3540 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_ruleReorientExpression3553 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleReorientExpression3565 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_ruleReorientExpression3586 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleReorientExpression3598 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleReorientExpression3619 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleReorientExpression3631 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_42_in_ruleReorientExpression3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint3684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleConstraint3731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint3748 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConstraint3765 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_ruleConstraintType_in_ruleConstraint3786 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleConstraint3798 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleBodyReference_in_ruleConstraint3819 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_ruleConstraint3840 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleConstraint3852 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleBodyReference_in_ruleConstraint3873 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_ruleConstraint3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLoad_in_entryRuleExternalLoad3930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalLoad3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleExternalLoad3977 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExternalLoad3989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalLoad4006 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleExternalLoad4023 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_ruleLoadType_in_ruleExternalLoad4044 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleExternalLoad4056 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleBodyReference_in_ruleExternalLoad4077 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleExternalLoad4089 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleExternalLoad4101 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleExternalLoad4113 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleExternalLoad4125 = new BitSet(new long[]{0x0003000000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleExternalLoad4146 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleExternalLoad4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_entryRuleMatrix4194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_ruleMatrix4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRef_in_ruleMatrix4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_entryRuleBaseMatrix4313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseMatrix4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBaseMatrix4361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseMatrix4378 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleBaseMatrix4397 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseMatrix4418 = new BitSet(new long[]{0x0004020000000000L});
    public static final BitSet FOLLOW_41_in_ruleBaseMatrix4431 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseMatrix4452 = new BitSet(new long[]{0x0004020000000000L});
    public static final BitSet FOLLOW_50_in_ruleBaseMatrix4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRef_in_entryRuleMatrixRef4502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrixRef4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMatrixRef4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_entryRuleAddExp4591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExp4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_ruleAddExp4648 = new BitSet(new long[]{0x0008000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAddExp4677 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_51_in_ruleAddExp4706 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_ruleMultExp_in_ruleAddExp4743 = new BitSet(new long[]{0x0008000020000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_entryRuleMultExp4781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExp4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMultExp4838 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_52_in_ruleMultExp4867 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_53_in_ruleMultExp4896 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMultExp4933 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary4971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_rulePrimary5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisedExp_in_rulePrimary5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantOrFunctionCallExp_in_rulePrimary5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisedExp_in_entryRuleParenthesisedExp5117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisedExp5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleParenthesisedExp5164 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleParenthesisedExp5185 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleParenthesisedExp5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantOrFunctionCallExp_in_entryRuleConstantOrFunctionCallExp5233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantOrFunctionCallExp5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantOrFunctionCallExp5285 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleConstantOrFunctionCallExp5303 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleConstantOrFunctionCallExp5324 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_ruleConstantOrFunctionCallExp5337 = new BitSet(new long[]{0x0008004000000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleConstantOrFunctionCallExp5358 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_42_in_ruleConstantOrFunctionCallExp5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral5410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNumberLiteral5463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleNumberLiteral5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAXIS5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAXIS5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAXIS5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleConstraintType5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleConstraintType5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleLoadType5690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleLoadType5707 = new BitSet(new long[]{0x0000000000000002L});

}