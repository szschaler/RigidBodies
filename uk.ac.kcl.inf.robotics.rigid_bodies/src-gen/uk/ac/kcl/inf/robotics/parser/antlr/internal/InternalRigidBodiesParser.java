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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'world'", "'{'", "'gravity'", "'}'", "'system'", "'body'", "'base'", "'new'", "'last'", "'repeat'", "'of'", "'mass'", "'value'", "'position'", "'inertia'", "'joint'", "':'", "'start'", "'between'", "'and'", "'type'", "'+'", "'with'", "'revolute'", "'planar'", "'stiffness'", "'springCoeff'", "'springInit'", "'dampViscous'", "'dampCoulomb'", "'('", "'relative'", "'transformation'", "','", "')'", "'reorient'", "'constraint'", "'moves'", "'like'", "'external'", "'load'", "'at'", "'matrix'", "'['", "']'", "'-'", "'*'", "'/'", "'x'", "'y'", "'z'", "'geometrical'", "'velocity'", "'force'", "'torque'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_REAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( (LA1_0==RULE_ID||LA1_0==13||LA1_0==27||(LA1_0>=35 && LA1_0<=37)||(LA1_0>=54 && LA1_0<=55)) ) {
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
            case 54:
            case 55:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
            case 27:
            case 35:
            case 36:
                {
                alt3=2;
                }
                break;
            case 13:
            case 37:
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

                if ( (LA4_0==17||LA4_0==21||LA4_0==27||LA4_0==48||LA4_0==51) ) {
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:326:1: ruleSystemElement returns [EObject current=null] : (this_Body_0= ruleBody | this_Connective_1= ruleConnective | this_BodyRepetition_2= ruleBodyRepetition ) ;
    public final EObject ruleSystemElement() throws RecognitionException {
        EObject current = null;

        EObject this_Body_0 = null;

        EObject this_Connective_1 = null;

        EObject this_BodyRepetition_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:329:28: ( (this_Body_0= ruleBody | this_Connective_1= ruleConnective | this_BodyRepetition_2= ruleBodyRepetition ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:330:1: (this_Body_0= ruleBody | this_Connective_1= ruleConnective | this_BodyRepetition_2= ruleBodyRepetition )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:330:1: (this_Body_0= ruleBody | this_Connective_1= ruleConnective | this_BodyRepetition_2= ruleBodyRepetition )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 27:
            case 48:
            case 51:
                {
                alt5=2;
                }
                break;
            case 21:
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
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:351:5: this_BodyRepetition_2= ruleBodyRepetition
                    {
                     
                            newCompositeNode(grammarAccess.getSystemElementAccess().getBodyRepetitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBodyRepetition_in_ruleSystemElement759);
                    this_BodyRepetition_2=ruleBodyRepetition();

                    state._fsp--;

                     
                            current = this_BodyRepetition_2; 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:367:1: entryRuleConnective returns [EObject current=null] : iv_ruleConnective= ruleConnective EOF ;
    public final EObject entryRuleConnective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnective = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:368:2: (iv_ruleConnective= ruleConnective EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:369:2: iv_ruleConnective= ruleConnective EOF
            {
             newCompositeNode(grammarAccess.getConnectiveRule()); 
            pushFollow(FOLLOW_ruleConnective_in_entryRuleConnective794);
            iv_ruleConnective=ruleConnective();

            state._fsp--;

             current =iv_ruleConnective; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnective804); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:376:1: ruleConnective returns [EObject current=null] : (this_Joint_0= ruleJoint | this_Constraint_1= ruleConstraint | this_ExternalLoad_2= ruleExternalLoad ) ;
    public final EObject ruleConnective() throws RecognitionException {
        EObject current = null;

        EObject this_Joint_0 = null;

        EObject this_Constraint_1 = null;

        EObject this_ExternalLoad_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:379:28: ( (this_Joint_0= ruleJoint | this_Constraint_1= ruleConstraint | this_ExternalLoad_2= ruleExternalLoad ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:380:1: (this_Joint_0= ruleJoint | this_Constraint_1= ruleConstraint | this_ExternalLoad_2= ruleExternalLoad )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:380:1: (this_Joint_0= ruleJoint | this_Constraint_1= ruleConstraint | this_ExternalLoad_2= ruleExternalLoad )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 48:
                {
                alt6=2;
                }
                break;
            case 51:
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:381:5: this_Joint_0= ruleJoint
                    {
                     
                            newCompositeNode(grammarAccess.getConnectiveAccess().getJointParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleJoint_in_ruleConnective851);
                    this_Joint_0=ruleJoint();

                    state._fsp--;

                     
                            current = this_Joint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:391:5: this_Constraint_1= ruleConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConnectiveAccess().getConstraintParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConstraint_in_ruleConnective878);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;

                     
                            current = this_Constraint_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:401:5: this_ExternalLoad_2= ruleExternalLoad
                    {
                     
                            newCompositeNode(grammarAccess.getConnectiveAccess().getExternalLoadParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExternalLoad_in_ruleConnective905);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:417:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:418:2: (iv_ruleBody= ruleBody EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:419:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody940);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody950); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:426:1: ruleBody returns [EObject current=null] : (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mass_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:429:28: ( (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:430:1: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:430:1: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:430:3: otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleBody987); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getBodyKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:434:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:435:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:435:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:436:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody1004); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleBody1021); 

                	newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:456:1: ( (lv_mass_3_0= ruleMass ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:457:1: (lv_mass_3_0= ruleMass )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:457:1: (lv_mass_3_0= ruleMass )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:458:3: lv_mass_3_0= ruleMass
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getMassMassParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMass_in_ruleBody1042);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleBody1054); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:486:1: entryRuleBodyReference returns [EObject current=null] : iv_ruleBodyReference= ruleBodyReference EOF ;
    public final EObject entryRuleBodyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyReference = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:487:2: (iv_ruleBodyReference= ruleBodyReference EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:488:2: iv_ruleBodyReference= ruleBodyReference EOF
            {
             newCompositeNode(grammarAccess.getBodyReferenceRule()); 
            pushFollow(FOLLOW_ruleBodyReference_in_entryRuleBodyReference1090);
            iv_ruleBodyReference=ruleBodyReference();

            state._fsp--;

             current =iv_ruleBodyReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyReference1100); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:495:1: ruleBodyReference returns [EObject current=null] : ( ( (lv_base_0_0= 'base' ) ) | ( (lv_new_1_0= 'new' ) ) | ( ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )? ) | ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleBodyReference() throws RecognitionException {
        EObject current = null;

        Token lv_base_0_0=null;
        Token lv_new_1_0=null;
        Token lv_last_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:498:28: ( ( ( (lv_base_0_0= 'base' ) ) | ( (lv_new_1_0= 'new' ) ) | ( ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )? ) | ( (otherlv_4= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:499:1: ( ( (lv_base_0_0= 'base' ) ) | ( (lv_new_1_0= 'new' ) ) | ( ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )? ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:499:1: ( ( (lv_base_0_0= 'base' ) ) | ( (lv_new_1_0= 'new' ) ) | ( ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )? ) | ( (otherlv_4= RULE_ID ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:499:2: ( (lv_base_0_0= 'base' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:499:2: ( (lv_base_0_0= 'base' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:500:1: (lv_base_0_0= 'base' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:500:1: (lv_base_0_0= 'base' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:501:3: lv_base_0_0= 'base'
                    {
                    lv_base_0_0=(Token)match(input,18,FOLLOW_18_in_ruleBodyReference1143); 

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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:515:6: ( (lv_new_1_0= 'new' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:515:6: ( (lv_new_1_0= 'new' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:516:1: (lv_new_1_0= 'new' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:516:1: (lv_new_1_0= 'new' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:517:3: lv_new_1_0= 'new'
                    {
                    lv_new_1_0=(Token)match(input,19,FOLLOW_19_in_ruleBodyReference1180); 

                            newLeafNode(lv_new_1_0, grammarAccess.getBodyReferenceAccess().getNewNewKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBodyReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "new", true, "new");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:531:6: ( ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )? )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:531:6: ( ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )? )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:531:7: ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )?
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:531:7: ( (lv_last_2_0= 'last' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:532:1: (lv_last_2_0= 'last' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:532:1: (lv_last_2_0= 'last' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:533:3: lv_last_2_0= 'last'
                    {
                    lv_last_2_0=(Token)match(input,20,FOLLOW_20_in_ruleBodyReference1218); 

                            newLeafNode(lv_last_2_0, grammarAccess.getBodyReferenceAccess().getLastLastKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBodyReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "last", true, "last");
                    	    

                    }


                    }

                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:546:2: ( (otherlv_3= RULE_ID ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:547:1: (otherlv_3= RULE_ID )
                            {
                            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:547:1: (otherlv_3= RULE_ID )
                            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:548:3: otherlv_3= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getBodyReferenceRule());
                            	        }
                                    
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyReference1251); 

                            		newLeafNode(otherlv_3, grammarAccess.getBodyReferenceAccess().getRefBodyCrossReference_2_1_0()); 
                            	

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:560:6: ( (otherlv_4= RULE_ID ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:560:6: ( (otherlv_4= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:561:1: (otherlv_4= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:561:1: (otherlv_4= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:562:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBodyReferenceRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyReference1279); 

                    		newLeafNode(otherlv_4, grammarAccess.getBodyReferenceAccess().getRefBodyCrossReference_3_0()); 
                    	

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


    // $ANTLR start "entryRuleBodyRepetition"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:581:1: entryRuleBodyRepetition returns [EObject current=null] : iv_ruleBodyRepetition= ruleBodyRepetition EOF ;
    public final EObject entryRuleBodyRepetition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyRepetition = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:582:2: (iv_ruleBodyRepetition= ruleBodyRepetition EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:583:2: iv_ruleBodyRepetition= ruleBodyRepetition EOF
            {
             newCompositeNode(grammarAccess.getBodyRepetitionRule()); 
            pushFollow(FOLLOW_ruleBodyRepetition_in_entryRuleBodyRepetition1315);
            iv_ruleBodyRepetition=ruleBodyRepetition();

            state._fsp--;

             current =iv_ruleBodyRepetition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyRepetition1325); 

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
    // $ANTLR end "entryRuleBodyRepetition"


    // $ANTLR start "ruleBodyRepetition"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:590:1: ruleBodyRepetition returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_connectionExp_5_0= ruleConnective ) )+ otherlv_6= '}' ) ;
    public final EObject ruleBodyRepetition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_connectionExp_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:593:28: ( (otherlv_0= 'repeat' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_connectionExp_5_0= ruleConnective ) )+ otherlv_6= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:594:1: (otherlv_0= 'repeat' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_connectionExp_5_0= ruleConnective ) )+ otherlv_6= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:594:1: (otherlv_0= 'repeat' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_connectionExp_5_0= ruleConnective ) )+ otherlv_6= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:594:3: otherlv_0= 'repeat' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_connectionExp_5_0= ruleConnective ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleBodyRepetition1362); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyRepetitionAccess().getRepeatKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:598:1: ( (lv_number_1_0= RULE_INT ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:599:1: (lv_number_1_0= RULE_INT )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:599:1: (lv_number_1_0= RULE_INT )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:600:3: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBodyRepetition1379); 

            			newLeafNode(lv_number_1_0, grammarAccess.getBodyRepetitionAccess().getNumberINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBodyRepetitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"number",
                    		lv_number_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleBodyRepetition1396); 

                	newLeafNode(otherlv_2, grammarAccess.getBodyRepetitionAccess().getOfKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:620:1: ( (otherlv_3= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:621:1: (otherlv_3= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:621:1: (otherlv_3= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:622:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBodyRepetitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyRepetition1416); 

            		newLeafNode(otherlv_3, grammarAccess.getBodyRepetitionAccess().getBodyBodyCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleBodyRepetition1428); 

                	newLeafNode(otherlv_4, grammarAccess.getBodyRepetitionAccess().getLeftCurlyBracketKeyword_4());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:637:1: ( (lv_connectionExp_5_0= ruleConnective ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27||LA9_0==48||LA9_0==51) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:638:1: (lv_connectionExp_5_0= ruleConnective )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:638:1: (lv_connectionExp_5_0= ruleConnective )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:639:3: lv_connectionExp_5_0= ruleConnective
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBodyRepetitionAccess().getConnectionExpConnectiveParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnective_in_ruleBodyRepetition1449);
            	    lv_connectionExp_5_0=ruleConnective();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBodyRepetitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"connectionExp",
            	            		lv_connectionExp_5_0, 
            	            		"Connective");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleBodyRepetition1462); 

                	newLeafNode(otherlv_6, grammarAccess.getBodyRepetitionAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleBodyRepetition"


    // $ANTLR start "entryRuleMass"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:667:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:668:2: (iv_ruleMass= ruleMass EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:669:2: iv_ruleMass= ruleMass EOF
            {
             newCompositeNode(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_ruleMass_in_entryRuleMass1498);
            iv_ruleMass=ruleMass();

            state._fsp--;

             current =iv_ruleMass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMass1508); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:676:1: ruleMass returns [EObject current=null] : (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' ) ;
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
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:679:28: ( (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:680:1: (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:680:1: (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:680:3: otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleMass1545); 

                	newLeafNode(otherlv_0, grammarAccess.getMassAccess().getMassKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleMass1557); 

                	newLeafNode(otherlv_1, grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleMass1569); 

                	newLeafNode(otherlv_2, grammarAccess.getMassAccess().getValueKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:692:1: ( (lv_value_3_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:693:1: (lv_value_3_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:693:1: (lv_value_3_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:694:3: lv_value_3_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getValueAddExpParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleMass1590);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleMass1602); 

                	newLeafNode(otherlv_4, grammarAccess.getMassAccess().getPositionKeyword_4());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:714:1: ( (lv_position_5_0= ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:715:1: (lv_position_5_0= ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:715:1: (lv_position_5_0= ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:716:3: lv_position_5_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getPositionMatrixParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleMass1623);
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

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleMass1635); 

                	newLeafNode(otherlv_6, grammarAccess.getMassAccess().getInertiaKeyword_6());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:736:1: ( (lv_inertia_7_0= ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:737:1: (lv_inertia_7_0= ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:737:1: (lv_inertia_7_0= ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:738:3: lv_inertia_7_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getInertiaMatrixParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleMass1656);
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

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleMass1668); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:766:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:767:2: (iv_ruleJoint= ruleJoint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:768:2: iv_ruleJoint= ruleJoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_ruleJoint_in_entryRuleJoint1704);
            iv_ruleJoint=ruleJoint();

            state._fsp--;

             current =iv_ruleJoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoint1714); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:775:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) ) ) ;
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
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:778:28: ( (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:779:1: (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:779:1: (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:779:3: otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleJoint1751); 

                	newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:783:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:784:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:784:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:785:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJoint1768); 

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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleJoint1785); 

                	newLeafNode(otherlv_2, grammarAccess.getJointAccess().getColonKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:805:1: ( (lv_type_3_0= ruleJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:806:1: (lv_type_3_0= ruleJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:806:1: (lv_type_3_0= ruleJointType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:807:3: lv_type_3_0= ruleJointType
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleJointType_in_ruleJoint1806);
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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:823:2: ( (lv_isStart_4_0= 'start' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:824:1: (lv_isStart_4_0= 'start' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:824:1: (lv_isStart_4_0= 'start' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:825:3: lv_isStart_4_0= 'start'
                    {
                    lv_isStart_4_0=(Token)match(input,29,FOLLOW_29_in_ruleJoint1824); 

                            newLeafNode(lv_isStart_4_0, grammarAccess.getJointAccess().getIsStartStartKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJointRule());
                    	        }
                           		setWithLastConsumed(current, "isStart", true, "start");
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleJoint1850); 

                	newLeafNode(otherlv_5, grammarAccess.getJointAccess().getBetweenKeyword_5());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:842:1: ( (lv_body1_6_0= ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:843:1: (lv_body1_6_0= ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:843:1: (lv_body1_6_0= ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:844:3: lv_body1_6_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getBody1BodyReferenceParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyReference_in_ruleJoint1871);
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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:860:2: ( (lv_relTrans1_7_0= ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:861:1: (lv_relTrans1_7_0= ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:861:1: (lv_relTrans1_7_0= ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:862:3: lv_relTrans1_7_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getRelTrans1RelativeTransformationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleRelativeTransformation_in_ruleJoint1892);
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

            otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleJoint1904); 

                	newLeafNode(otherlv_8, grammarAccess.getJointAccess().getAndKeyword_8());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:882:1: ( (lv_body2_9_0= ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:883:1: (lv_body2_9_0= ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:883:1: (lv_body2_9_0= ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:884:3: lv_body2_9_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getBody2BodyReferenceParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyReference_in_ruleJoint1925);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:908:1: entryRuleJointType returns [EObject current=null] : iv_ruleJointType= ruleJointType EOF ;
    public final EObject entryRuleJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointType = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:909:2: (iv_ruleJointType= ruleJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:910:2: iv_ruleJointType= ruleJointType EOF
            {
             newCompositeNode(grammarAccess.getJointTypeRule()); 
            pushFollow(FOLLOW_ruleJointType_in_entryRuleJointType1961);
            iv_ruleJointType=ruleJointType();

            state._fsp--;

             current =iv_ruleJointType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointType1971); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:917:1: ruleJointType returns [EObject current=null] : ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) ) ) ;
    public final EObject ruleJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:920:28: ( ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:921:1: ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:921:1: ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:921:2: (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:921:2: (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:921:4: otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleJointType2009); 

                        	newLeafNode(otherlv_0, grammarAccess.getJointTypeAccess().getJointKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleJointType2021); 

                        	newLeafNode(otherlv_1, grammarAccess.getJointTypeAccess().getTypeKeyword_0_1());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:929:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:930:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:930:1: (lv_name_2_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:931:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJointType2038); 

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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:947:4: ( (lv_exp_3_0= ruleAdditiveJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:948:1: (lv_exp_3_0= ruleAdditiveJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:948:1: (lv_exp_3_0= ruleAdditiveJointType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:949:3: lv_exp_3_0= ruleAdditiveJointType
            {
             
            	        newCompositeNode(grammarAccess.getJointTypeAccess().getExpAdditiveJointTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAdditiveJointType_in_ruleJointType2066);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:973:1: entryRuleAdditiveJointType returns [EObject current=null] : iv_ruleAdditiveJointType= ruleAdditiveJointType EOF ;
    public final EObject entryRuleAdditiveJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveJointType = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:974:2: (iv_ruleAdditiveJointType= ruleAdditiveJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:975:2: iv_ruleAdditiveJointType= ruleAdditiveJointType EOF
            {
             newCompositeNode(grammarAccess.getAdditiveJointTypeRule()); 
            pushFollow(FOLLOW_ruleAdditiveJointType_in_entryRuleAdditiveJointType2102);
            iv_ruleAdditiveJointType=ruleAdditiveJointType();

            state._fsp--;

             current =iv_ruleAdditiveJointType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveJointType2112); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:982:1: ruleAdditiveJointType returns [EObject current=null] : (this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )* ) ;
    public final EObject ruleAdditiveJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PrimaryJointType_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:985:28: ( (this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:986:1: (this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:986:1: (this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:987:5: this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditiveJointTypeAccess().getPrimaryJointTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryJointType_in_ruleAdditiveJointType2159);
            this_PrimaryJointType_0=rulePrimaryJointType();

            state._fsp--;

             
                    current = this_PrimaryJointType_0; 
                    afterParserOrEnumRuleCall();
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:995:1: (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:995:3: otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleAdditiveJointType2171); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAdditiveJointTypeAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:999:1: ()
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1000:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditiveJointTypeAccess().getAdditiveJointTypeLeftAction_1_1(),
            	                current);
            	        

            	    }

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1005:2: ( (lv_right_3_0= rulePrimaryJointType ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1006:1: (lv_right_3_0= rulePrimaryJointType )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1006:1: (lv_right_3_0= rulePrimaryJointType )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1007:3: lv_right_3_0= rulePrimaryJointType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveJointTypeAccess().getRightPrimaryJointTypeParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryJointType_in_ruleAdditiveJointType2201);
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
            	    break loop12;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1031:1: entryRulePrimaryJointType returns [EObject current=null] : iv_rulePrimaryJointType= rulePrimaryJointType EOF ;
    public final EObject entryRulePrimaryJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryJointType = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1032:2: (iv_rulePrimaryJointType= rulePrimaryJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1033:2: iv_rulePrimaryJointType= rulePrimaryJointType EOF
            {
             newCompositeNode(grammarAccess.getPrimaryJointTypeRule()); 
            pushFollow(FOLLOW_rulePrimaryJointType_in_entryRulePrimaryJointType2239);
            iv_rulePrimaryJointType=rulePrimaryJointType();

            state._fsp--;

             current =iv_rulePrimaryJointType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryJointType2249); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1040:1: rulePrimaryJointType returns [EObject current=null] : (this_JointTypeReference_0= ruleJointTypeReference | this_BasicJointType_1= ruleBasicJointType ) ;
    public final EObject rulePrimaryJointType() throws RecognitionException {
        EObject current = null;

        EObject this_JointTypeReference_0 = null;

        EObject this_BasicJointType_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1043:28: ( (this_JointTypeReference_0= ruleJointTypeReference | this_BasicJointType_1= ruleBasicJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1044:1: (this_JointTypeReference_0= ruleJointTypeReference | this_BasicJointType_1= ruleBasicJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1044:1: (this_JointTypeReference_0= ruleJointTypeReference | this_BasicJointType_1= ruleBasicJointType )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=35 && LA13_0<=36)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1045:5: this_JointTypeReference_0= ruleJointTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryJointTypeAccess().getJointTypeReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleJointTypeReference_in_rulePrimaryJointType2296);
                    this_JointTypeReference_0=ruleJointTypeReference();

                    state._fsp--;

                     
                            current = this_JointTypeReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1055:5: this_BasicJointType_1= ruleBasicJointType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryJointTypeAccess().getBasicJointTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBasicJointType_in_rulePrimaryJointType2323);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1071:1: entryRuleJointTypeReference returns [EObject current=null] : iv_ruleJointTypeReference= ruleJointTypeReference EOF ;
    public final EObject entryRuleJointTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointTypeReference = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1072:2: (iv_ruleJointTypeReference= ruleJointTypeReference EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1073:2: iv_ruleJointTypeReference= ruleJointTypeReference EOF
            {
             newCompositeNode(grammarAccess.getJointTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleJointTypeReference_in_entryRuleJointTypeReference2358);
            iv_ruleJointTypeReference=ruleJointTypeReference();

            state._fsp--;

             current =iv_ruleJointTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointTypeReference2368); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1080:1: ruleJointTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleJointTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1083:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1084:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1084:1: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1085:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1085:1: (otherlv_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1086:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJointTypeReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJointTypeReference2412); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1105:1: entryRuleBasicJointType returns [EObject current=null] : iv_ruleBasicJointType= ruleBasicJointType EOF ;
    public final EObject entryRuleBasicJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicJointType = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1106:2: (iv_ruleBasicJointType= ruleBasicJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1107:2: iv_ruleBasicJointType= ruleBasicJointType EOF
            {
             newCompositeNode(grammarAccess.getBasicJointTypeRule()); 
            pushFollow(FOLLOW_ruleBasicJointType_in_entryRuleBasicJointType2447);
            iv_ruleBasicJointType=ruleBasicJointType();

            state._fsp--;

             current =iv_ruleBasicJointType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicJointType2457); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1114:1: ruleBasicJointType returns [EObject current=null] : ( ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) ) ) ;
    public final EObject ruleBasicJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_0_0 = null;

        EObject lv_stiffness_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1117:28: ( ( ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1118:1: ( ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1118:1: ( ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1118:2: ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1118:2: ( (lv_type_0_0= ruleJointMovement ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1119:1: (lv_type_0_0= ruleJointMovement )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1119:1: (lv_type_0_0= ruleJointMovement )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1120:3: lv_type_0_0= ruleJointMovement
            {
             
            	        newCompositeNode(grammarAccess.getBasicJointTypeAccess().getTypeJointMovementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleJointMovement_in_ruleBasicJointType2503);
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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleBasicJointType2515); 

                	newLeafNode(otherlv_1, grammarAccess.getBasicJointTypeAccess().getWithKeyword_1());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1140:1: ( (lv_stiffness_2_0= ruleStiffnessExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1141:1: (lv_stiffness_2_0= ruleStiffnessExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1141:1: (lv_stiffness_2_0= ruleStiffnessExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1142:3: lv_stiffness_2_0= ruleStiffnessExp
            {
             
            	        newCompositeNode(grammarAccess.getBasicJointTypeAccess().getStiffnessStiffnessExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStiffnessExp_in_ruleBasicJointType2536);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1166:1: entryRuleJointMovement returns [EObject current=null] : iv_ruleJointMovement= ruleJointMovement EOF ;
    public final EObject entryRuleJointMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointMovement = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1167:2: (iv_ruleJointMovement= ruleJointMovement EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1168:2: iv_ruleJointMovement= ruleJointMovement EOF
            {
             newCompositeNode(grammarAccess.getJointMovementRule()); 
            pushFollow(FOLLOW_ruleJointMovement_in_entryRuleJointMovement2572);
            iv_ruleJointMovement=ruleJointMovement();

            state._fsp--;

             current =iv_ruleJointMovement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointMovement2582); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1175:1: ruleJointMovement returns [EObject current=null] : (this_Revolute_0= ruleRevolute | this_Planar_1= rulePlanar ) ;
    public final EObject ruleJointMovement() throws RecognitionException {
        EObject current = null;

        EObject this_Revolute_0 = null;

        EObject this_Planar_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1178:28: ( (this_Revolute_0= ruleRevolute | this_Planar_1= rulePlanar ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1179:1: (this_Revolute_0= ruleRevolute | this_Planar_1= rulePlanar )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1179:1: (this_Revolute_0= ruleRevolute | this_Planar_1= rulePlanar )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1180:5: this_Revolute_0= ruleRevolute
                    {
                     
                            newCompositeNode(grammarAccess.getJointMovementAccess().getRevoluteParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRevolute_in_ruleJointMovement2629);
                    this_Revolute_0=ruleRevolute();

                    state._fsp--;

                     
                            current = this_Revolute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1190:5: this_Planar_1= rulePlanar
                    {
                     
                            newCompositeNode(grammarAccess.getJointMovementAccess().getPlanarParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePlanar_in_ruleJointMovement2656);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1206:1: entryRuleRevolute returns [EObject current=null] : iv_ruleRevolute= ruleRevolute EOF ;
    public final EObject entryRuleRevolute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRevolute = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1207:2: (iv_ruleRevolute= ruleRevolute EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1208:2: iv_ruleRevolute= ruleRevolute EOF
            {
             newCompositeNode(grammarAccess.getRevoluteRule()); 
            pushFollow(FOLLOW_ruleRevolute_in_entryRuleRevolute2691);
            iv_ruleRevolute=ruleRevolute();

            state._fsp--;

             current =iv_ruleRevolute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRevolute2701); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1215:1: ruleRevolute returns [EObject current=null] : (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) ) ;
    public final EObject ruleRevolute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_axis_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1218:28: ( (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1219:1: (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1219:1: (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1219:3: otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleRevolute2738); 

                	newLeafNode(otherlv_0, grammarAccess.getRevoluteAccess().getRevoluteKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1223:1: ( (lv_axis_1_0= ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1224:1: (lv_axis_1_0= ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1224:1: (lv_axis_1_0= ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1225:3: lv_axis_1_0= ruleAXIS
            {
             
            	        newCompositeNode(grammarAccess.getRevoluteAccess().getAxisAXISEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAXIS_in_ruleRevolute2759);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1249:1: entryRulePlanar returns [EObject current=null] : iv_rulePlanar= rulePlanar EOF ;
    public final EObject entryRulePlanar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanar = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1250:2: (iv_rulePlanar= rulePlanar EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1251:2: iv_rulePlanar= rulePlanar EOF
            {
             newCompositeNode(grammarAccess.getPlanarRule()); 
            pushFollow(FOLLOW_rulePlanar_in_entryRulePlanar2795);
            iv_rulePlanar=rulePlanar();

            state._fsp--;

             current =iv_rulePlanar; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanar2805); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1258:1: rulePlanar returns [EObject current=null] : (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) ) ;
    public final EObject rulePlanar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_axis_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1261:28: ( (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1262:1: (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1262:1: (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1262:3: otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_rulePlanar2842); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanarAccess().getPlanarKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1266:1: ( (lv_axis_1_0= ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1267:1: (lv_axis_1_0= ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1267:1: (lv_axis_1_0= ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1268:3: lv_axis_1_0= ruleAXIS
            {
             
            	        newCompositeNode(grammarAccess.getPlanarAccess().getAxisAXISEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAXIS_in_rulePlanar2863);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1292:1: entryRuleStiffnessExp returns [EObject current=null] : iv_ruleStiffnessExp= ruleStiffnessExp EOF ;
    public final EObject entryRuleStiffnessExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStiffnessExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1293:2: (iv_ruleStiffnessExp= ruleStiffnessExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1294:2: iv_ruleStiffnessExp= ruleStiffnessExp EOF
            {
             newCompositeNode(grammarAccess.getStiffnessExpRule()); 
            pushFollow(FOLLOW_ruleStiffnessExp_in_entryRuleStiffnessExp2899);
            iv_ruleStiffnessExp=ruleStiffnessExp();

            state._fsp--;

             current =iv_ruleStiffnessExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStiffnessExp2909); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1301:1: ruleStiffnessExp returns [EObject current=null] : (this_StiffnessRef_0= ruleStiffnessRef | this_BaseStiffnessExp_1= ruleBaseStiffnessExp ) ;
    public final EObject ruleStiffnessExp() throws RecognitionException {
        EObject current = null;

        EObject this_StiffnessRef_0 = null;

        EObject this_BaseStiffnessExp_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1304:28: ( (this_StiffnessRef_0= ruleStiffnessRef | this_BaseStiffnessExp_1= ruleBaseStiffnessExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1305:1: (this_StiffnessRef_0= ruleStiffnessRef | this_BaseStiffnessExp_1= ruleBaseStiffnessExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1305:1: (this_StiffnessRef_0= ruleStiffnessRef | this_BaseStiffnessExp_1= ruleBaseStiffnessExp )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==13||LA15_0==37) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1306:5: this_StiffnessRef_0= ruleStiffnessRef
                    {
                     
                            newCompositeNode(grammarAccess.getStiffnessExpAccess().getStiffnessRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStiffnessRef_in_ruleStiffnessExp2956);
                    this_StiffnessRef_0=ruleStiffnessRef();

                    state._fsp--;

                     
                            current = this_StiffnessRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1316:5: this_BaseStiffnessExp_1= ruleBaseStiffnessExp
                    {
                     
                            newCompositeNode(grammarAccess.getStiffnessExpAccess().getBaseStiffnessExpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBaseStiffnessExp_in_ruleStiffnessExp2983);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1332:1: entryRuleStiffnessRef returns [EObject current=null] : iv_ruleStiffnessRef= ruleStiffnessRef EOF ;
    public final EObject entryRuleStiffnessRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStiffnessRef = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1333:2: (iv_ruleStiffnessRef= ruleStiffnessRef EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1334:2: iv_ruleStiffnessRef= ruleStiffnessRef EOF
            {
             newCompositeNode(grammarAccess.getStiffnessRefRule()); 
            pushFollow(FOLLOW_ruleStiffnessRef_in_entryRuleStiffnessRef3018);
            iv_ruleStiffnessRef=ruleStiffnessRef();

            state._fsp--;

             current =iv_ruleStiffnessRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStiffnessRef3028); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1341:1: ruleStiffnessRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleStiffnessRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1344:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1345:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1345:1: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1346:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1346:1: (otherlv_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1347:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStiffnessRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStiffnessRef3072); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1366:1: entryRuleBaseStiffnessExp returns [EObject current=null] : iv_ruleBaseStiffnessExp= ruleBaseStiffnessExp EOF ;
    public final EObject entryRuleBaseStiffnessExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseStiffnessExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1367:2: (iv_ruleBaseStiffnessExp= ruleBaseStiffnessExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1368:2: iv_ruleBaseStiffnessExp= ruleBaseStiffnessExp EOF
            {
             newCompositeNode(grammarAccess.getBaseStiffnessExpRule()); 
            pushFollow(FOLLOW_ruleBaseStiffnessExp_in_entryRuleBaseStiffnessExp3107);
            iv_ruleBaseStiffnessExp=ruleBaseStiffnessExp();

            state._fsp--;

             current =iv_ruleBaseStiffnessExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseStiffnessExp3117); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1375:1: ruleBaseStiffnessExp returns [EObject current=null] : ( (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}' ) ;
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
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1378:28: ( ( (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1379:1: ( (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1379:1: ( (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1379:2: (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}'
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1379:2: (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1379:4: otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleBaseStiffnessExp3155); 

                        	newLeafNode(otherlv_0, grammarAccess.getBaseStiffnessExpAccess().getStiffnessKeyword_0_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1383:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1384:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1384:1: (lv_name_1_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1385:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseStiffnessExp3172); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleBaseStiffnessExp3191); 

                	newLeafNode(otherlv_2, grammarAccess.getBaseStiffnessExpAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleBaseStiffnessExp3203); 

                	newLeafNode(otherlv_3, grammarAccess.getBaseStiffnessExpAccess().getSpringCoeffKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1409:1: ( (lv_springCoeff_4_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1410:1: (lv_springCoeff_4_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1410:1: (lv_springCoeff_4_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1411:3: lv_springCoeff_4_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseStiffnessExpAccess().getSpringCoeffAddExpParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp3224);
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

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleBaseStiffnessExp3236); 

                	newLeafNode(otherlv_5, grammarAccess.getBaseStiffnessExpAccess().getSpringInitKeyword_4());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1431:1: ( (lv_springInit_6_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1432:1: (lv_springInit_6_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1432:1: (lv_springInit_6_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1433:3: lv_springInit_6_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseStiffnessExpAccess().getSpringInitAddExpParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp3257);
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

            otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleBaseStiffnessExp3269); 

                	newLeafNode(otherlv_7, grammarAccess.getBaseStiffnessExpAccess().getDampViscousKeyword_6());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1453:1: ( (lv_dampViscous_8_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1454:1: (lv_dampViscous_8_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1454:1: (lv_dampViscous_8_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1455:3: lv_dampViscous_8_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseStiffnessExpAccess().getDampViscousAddExpParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp3290);
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

            otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleBaseStiffnessExp3302); 

                	newLeafNode(otherlv_9, grammarAccess.getBaseStiffnessExpAccess().getDampCoulombKeyword_8());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1475:1: ( (lv_dampCoulomb_10_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1476:1: (lv_dampCoulomb_10_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1476:1: (lv_dampCoulomb_10_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1477:3: lv_dampCoulomb_10_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseStiffnessExpAccess().getDampCoulombAddExpParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp3323);
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

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleBaseStiffnessExp3335); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1505:1: entryRuleRelativeTransformation returns [EObject current=null] : iv_ruleRelativeTransformation= ruleRelativeTransformation EOF ;
    public final EObject entryRuleRelativeTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeTransformation = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1506:2: (iv_ruleRelativeTransformation= ruleRelativeTransformation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1507:2: iv_ruleRelativeTransformation= ruleRelativeTransformation EOF
            {
             newCompositeNode(grammarAccess.getRelativeTransformationRule()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_entryRuleRelativeTransformation3371);
            iv_ruleRelativeTransformation=ruleRelativeTransformation();

            state._fsp--;

             current =iv_ruleRelativeTransformation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeTransformation3381); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1514:1: ruleRelativeTransformation returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' ) ;
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
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1517:28: ( (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1518:1: (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1518:1: (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1518:3: otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleRelativeTransformation3418); 

                	newLeafNode(otherlv_0, grammarAccess.getRelativeTransformationAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleRelativeTransformation3430); 

                	newLeafNode(otherlv_1, grammarAccess.getRelativeTransformationAccess().getWithKeyword_1());
                
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleRelativeTransformation3442); 

                	newLeafNode(otherlv_2, grammarAccess.getRelativeTransformationAccess().getRelativeKeyword_2());
                
            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleRelativeTransformation3454); 

                	newLeafNode(otherlv_3, grammarAccess.getRelativeTransformationAccess().getTransformationKeyword_3());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1534:1: ( (lv_position_4_0= ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1535:1: (lv_position_4_0= ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1535:1: (lv_position_4_0= ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1536:3: lv_position_4_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getRelativeTransformationAccess().getPositionMatrixParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleRelativeTransformation3475);
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

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleRelativeTransformation3487); 

                	newLeafNode(otherlv_5, grammarAccess.getRelativeTransformationAccess().getCommaKeyword_5());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1556:1: ( (lv_reorient_6_0= ruleReorientation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1557:1: (lv_reorient_6_0= ruleReorientation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1557:1: (lv_reorient_6_0= ruleReorientation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1558:3: lv_reorient_6_0= ruleReorientation
            {
             
            	        newCompositeNode(grammarAccess.getRelativeTransformationAccess().getReorientReorientationParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleReorientation_in_ruleRelativeTransformation3508);
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

            otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleRelativeTransformation3520); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1586:1: entryRuleReorientation returns [EObject current=null] : iv_ruleReorientation= ruleReorientation EOF ;
    public final EObject entryRuleReorientation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReorientation = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1587:2: (iv_ruleReorientation= ruleReorientation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1588:2: iv_ruleReorientation= ruleReorientation EOF
            {
             newCompositeNode(grammarAccess.getReorientationRule()); 
            pushFollow(FOLLOW_ruleReorientation_in_entryRuleReorientation3556);
            iv_ruleReorientation=ruleReorientation();

            state._fsp--;

             current =iv_ruleReorientation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientation3566); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1595:1: ruleReorientation returns [EObject current=null] : ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) ) ;
    public final EObject ruleReorientation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1598:28: ( ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1599:1: ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1599:1: ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1599:2: (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1599:2: (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1599:4: otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleReorientation3604); 

                        	newLeafNode(otherlv_0, grammarAccess.getReorientationAccess().getReorientKeyword_0_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1603:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1604:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1604:1: (lv_name_1_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1605:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReorientation3621); 

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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1621:4: ( (lv_exp_2_0= ruleReorientExpression ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1622:1: (lv_exp_2_0= ruleReorientExpression )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1622:1: (lv_exp_2_0= ruleReorientExpression )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1623:3: lv_exp_2_0= ruleReorientExpression
            {
             
            	        newCompositeNode(grammarAccess.getReorientationAccess().getExpReorientExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReorientExpression_in_ruleReorientation3649);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1647:1: entryRuleReorientExpression returns [EObject current=null] : iv_ruleReorientExpression= ruleReorientExpression EOF ;
    public final EObject entryRuleReorientExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReorientExpression = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1648:2: (iv_ruleReorientExpression= ruleReorientExpression EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1649:2: iv_ruleReorientExpression= ruleReorientExpression EOF
            {
             newCompositeNode(grammarAccess.getReorientExpressionRule()); 
            pushFollow(FOLLOW_ruleReorientExpression_in_entryRuleReorientExpression3685);
            iv_ruleReorientExpression=ruleReorientExpression();

            state._fsp--;

             current =iv_ruleReorientExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientExpression3695); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1656:1: ruleReorientExpression returns [EObject current=null] : (this_ReorientRef_0= ruleReorientRef | this_BasicReorientExpression_1= ruleBasicReorientExpression ) ;
    public final EObject ruleReorientExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ReorientRef_0 = null;

        EObject this_BasicReorientExpression_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1659:28: ( (this_ReorientRef_0= ruleReorientRef | this_BasicReorientExpression_1= ruleBasicReorientExpression ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1660:1: (this_ReorientRef_0= ruleReorientRef | this_BasicReorientExpression_1= ruleBasicReorientExpression )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1660:1: (this_ReorientRef_0= ruleReorientRef | this_BasicReorientExpression_1= ruleBasicReorientExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==42) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1661:5: this_ReorientRef_0= ruleReorientRef
                    {
                     
                            newCompositeNode(grammarAccess.getReorientExpressionAccess().getReorientRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReorientRef_in_ruleReorientExpression3742);
                    this_ReorientRef_0=ruleReorientRef();

                    state._fsp--;

                     
                            current = this_ReorientRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1671:5: this_BasicReorientExpression_1= ruleBasicReorientExpression
                    {
                     
                            newCompositeNode(grammarAccess.getReorientExpressionAccess().getBasicReorientExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBasicReorientExpression_in_ruleReorientExpression3769);
                    this_BasicReorientExpression_1=ruleBasicReorientExpression();

                    state._fsp--;

                     
                            current = this_BasicReorientExpression_1; 
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
    // $ANTLR end "ruleReorientExpression"


    // $ANTLR start "entryRuleReorientRef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1687:1: entryRuleReorientRef returns [EObject current=null] : iv_ruleReorientRef= ruleReorientRef EOF ;
    public final EObject entryRuleReorientRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReorientRef = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1688:2: (iv_ruleReorientRef= ruleReorientRef EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1689:2: iv_ruleReorientRef= ruleReorientRef EOF
            {
             newCompositeNode(grammarAccess.getReorientRefRule()); 
            pushFollow(FOLLOW_ruleReorientRef_in_entryRuleReorientRef3804);
            iv_ruleReorientRef=ruleReorientRef();

            state._fsp--;

             current =iv_ruleReorientRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientRef3814); 

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
    // $ANTLR end "entryRuleReorientRef"


    // $ANTLR start "ruleReorientRef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1696:1: ruleReorientRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleReorientRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1699:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1700:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1700:1: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1701:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1701:1: (otherlv_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1702:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReorientRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReorientRef3858); 

            		newLeafNode(otherlv_0, grammarAccess.getReorientRefAccess().getRefReorientationCrossReference_0()); 
            	

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
    // $ANTLR end "ruleReorientRef"


    // $ANTLR start "entryRuleBasicReorientExpression"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1721:1: entryRuleBasicReorientExpression returns [EObject current=null] : iv_ruleBasicReorientExpression= ruleBasicReorientExpression EOF ;
    public final EObject entryRuleBasicReorientExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicReorientExpression = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1722:2: (iv_ruleBasicReorientExpression= ruleBasicReorientExpression EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1723:2: iv_ruleBasicReorientExpression= ruleBasicReorientExpression EOF
            {
             newCompositeNode(grammarAccess.getBasicReorientExpressionRule()); 
            pushFollow(FOLLOW_ruleBasicReorientExpression_in_entryRuleBasicReorientExpression3893);
            iv_ruleBasicReorientExpression=ruleBasicReorientExpression();

            state._fsp--;

             current =iv_ruleBasicReorientExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicReorientExpression3903); 

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
    // $ANTLR end "entryRuleBasicReorientExpression"


    // $ANTLR start "ruleBasicReorientExpression"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1730:1: ruleBasicReorientExpression returns [EObject current=null] : (otherlv_0= '(' () (otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* )? otherlv_13= ')' ) ;
    public final EObject ruleBasicReorientExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Enumerator lv_axis_3_0 = null;

        EObject lv_value_5_0 = null;

        Enumerator lv_axis_9_0 = null;

        EObject lv_value_11_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1733:28: ( (otherlv_0= '(' () (otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* )? otherlv_13= ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1734:1: (otherlv_0= '(' () (otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* )? otherlv_13= ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1734:1: (otherlv_0= '(' () (otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* )? otherlv_13= ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1734:3: otherlv_0= '(' () (otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* )? otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleBasicReorientExpression3940); 

                	newLeafNode(otherlv_0, grammarAccess.getBasicReorientExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1738:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1739:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBasicReorientExpressionAccess().getBasicReorientExpressionAction_1(),
                        current);
                

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1744:2: (otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1744:4: otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )*
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleBasicReorientExpression3962); 

                        	newLeafNode(otherlv_2, grammarAccess.getBasicReorientExpressionAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1748:1: ( (lv_axis_3_0= ruleAXIS ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1749:1: (lv_axis_3_0= ruleAXIS )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1749:1: (lv_axis_3_0= ruleAXIS )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1750:3: lv_axis_3_0= ruleAXIS
                    {
                     
                    	        newCompositeNode(grammarAccess.getBasicReorientExpressionAccess().getAxisAXISEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAXIS_in_ruleBasicReorientExpression3983);
                    lv_axis_3_0=ruleAXIS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBasicReorientExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"axis",
                            		lv_axis_3_0, 
                            		"AXIS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleBasicReorientExpression3995); 

                        	newLeafNode(otherlv_4, grammarAccess.getBasicReorientExpressionAccess().getCommaKeyword_2_2());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1770:1: ( (lv_value_5_0= ruleAddExp ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1771:1: (lv_value_5_0= ruleAddExp )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1771:1: (lv_value_5_0= ruleAddExp )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1772:3: lv_value_5_0= ruleAddExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getBasicReorientExpressionAccess().getValueAddExpParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddExp_in_ruleBasicReorientExpression4016);
                    lv_value_5_0=ruleAddExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBasicReorientExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"AddExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleBasicReorientExpression4028); 

                        	newLeafNode(otherlv_6, grammarAccess.getBasicReorientExpressionAccess().getRightParenthesisKeyword_2_4());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1792:1: (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==45) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1792:3: otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')'
                    	    {
                    	    otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleBasicReorientExpression4041); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getBasicReorientExpressionAccess().getCommaKeyword_2_5_0());
                    	        
                    	    otherlv_8=(Token)match(input,42,FOLLOW_42_in_ruleBasicReorientExpression4053); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getBasicReorientExpressionAccess().getLeftParenthesisKeyword_2_5_1());
                    	        
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1800:1: ( (lv_axis_9_0= ruleAXIS ) )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1801:1: (lv_axis_9_0= ruleAXIS )
                    	    {
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1801:1: (lv_axis_9_0= ruleAXIS )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1802:3: lv_axis_9_0= ruleAXIS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBasicReorientExpressionAccess().getAxisAXISEnumRuleCall_2_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAXIS_in_ruleBasicReorientExpression4074);
                    	    lv_axis_9_0=ruleAXIS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBasicReorientExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"axis",
                    	            		lv_axis_9_0, 
                    	            		"AXIS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_10=(Token)match(input,45,FOLLOW_45_in_ruleBasicReorientExpression4086); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getBasicReorientExpressionAccess().getCommaKeyword_2_5_3());
                    	        
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1822:1: ( (lv_value_11_0= ruleAddExp ) )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1823:1: (lv_value_11_0= ruleAddExp )
                    	    {
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1823:1: (lv_value_11_0= ruleAddExp )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1824:3: lv_value_11_0= ruleAddExp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBasicReorientExpressionAccess().getValueAddExpParserRuleCall_2_5_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddExp_in_ruleBasicReorientExpression4107);
                    	    lv_value_11_0=ruleAddExp();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBasicReorientExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"value",
                    	            		lv_value_11_0, 
                    	            		"AddExp");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,46,FOLLOW_46_in_ruleBasicReorientExpression4119); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getBasicReorientExpressionAccess().getRightParenthesisKeyword_2_5_5());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,46,FOLLOW_46_in_ruleBasicReorientExpression4135); 

                	newLeafNode(otherlv_13, grammarAccess.getBasicReorientExpressionAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleBasicReorientExpression"


    // $ANTLR start "entryRuleConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1856:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1857:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1858:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint4171);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint4181); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1865:1: ruleConstraint returns [EObject current=null] : (this_BodyConstraint_0= ruleBodyConstraint | this_JointConstraint_1= ruleJointConstraint ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_BodyConstraint_0 = null;

        EObject this_JointConstraint_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1868:28: ( (this_BodyConstraint_0= ruleBodyConstraint | this_JointConstraint_1= ruleJointConstraint ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1869:1: (this_BodyConstraint_0= ruleBodyConstraint | this_JointConstraint_1= ruleJointConstraint )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1869:1: (this_BodyConstraint_0= ruleBodyConstraint | this_JointConstraint_1= ruleJointConstraint )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_ID) ) {
                    int LA21_2 = input.LA(3);

                    if ( (LA21_2==28) ) {
                        int LA21_3 = input.LA(4);

                        if ( ((LA21_3>=63 && LA21_3<=64)) ) {
                            alt21=1;
                        }
                        else if ( (LA21_3==RULE_ID) ) {
                            alt21=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1870:5: this_BodyConstraint_0= ruleBodyConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getBodyConstraintParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBodyConstraint_in_ruleConstraint4228);
                    this_BodyConstraint_0=ruleBodyConstraint();

                    state._fsp--;

                     
                            current = this_BodyConstraint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1880:5: this_JointConstraint_1= ruleJointConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getJointConstraintParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleJointConstraint_in_ruleConstraint4255);
                    this_JointConstraint_1=ruleJointConstraint();

                    state._fsp--;

                     
                            current = this_JointConstraint_1; 
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleBodyConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1896:1: entryRuleBodyConstraint returns [EObject current=null] : iv_ruleBodyConstraint= ruleBodyConstraint EOF ;
    public final EObject entryRuleBodyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyConstraint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1897:2: (iv_ruleBodyConstraint= ruleBodyConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1898:2: iv_ruleBodyConstraint= ruleBodyConstraint EOF
            {
             newCompositeNode(grammarAccess.getBodyConstraintRule()); 
            pushFollow(FOLLOW_ruleBodyConstraint_in_entryRuleBodyConstraint4290);
            iv_ruleBodyConstraint=ruleBodyConstraint();

            state._fsp--;

             current =iv_ruleBodyConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyConstraint4300); 

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
    // $ANTLR end "entryRuleBodyConstraint"


    // $ANTLR start "ruleBodyConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1905:1: ruleBodyConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) ) ;
    public final EObject ruleBodyConstraint() throws RecognitionException {
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
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1908:28: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1909:1: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1909:1: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1909:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleBodyConstraint4337); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyConstraintAccess().getConstraintKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1913:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1914:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1914:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1915:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyConstraint4354); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBodyConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBodyConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleBodyConstraint4371); 

                	newLeafNode(otherlv_2, grammarAccess.getBodyConstraintAccess().getColonKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1935:1: ( (lv_type_3_0= ruleConstraintType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1936:1: (lv_type_3_0= ruleConstraintType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1936:1: (lv_type_3_0= ruleConstraintType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1937:3: lv_type_3_0= ruleConstraintType
            {
             
            	        newCompositeNode(grammarAccess.getBodyConstraintAccess().getTypeConstraintTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintType_in_ruleBodyConstraint4392);
            lv_type_3_0=ruleConstraintType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"ConstraintType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleBodyConstraint4404); 

                	newLeafNode(otherlv_4, grammarAccess.getBodyConstraintAccess().getBetweenKeyword_4());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1957:1: ( (lv_body1_5_0= ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1958:1: (lv_body1_5_0= ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1958:1: (lv_body1_5_0= ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1959:3: lv_body1_5_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getBodyConstraintAccess().getBody1BodyReferenceParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyReference_in_ruleBodyConstraint4425);
            lv_body1_5_0=ruleBodyReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"body1",
                    		lv_body1_5_0, 
                    		"BodyReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1975:2: ( (lv_relTrans1_6_0= ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1976:1: (lv_relTrans1_6_0= ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1976:1: (lv_relTrans1_6_0= ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1977:3: lv_relTrans1_6_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getBodyConstraintAccess().getRelTrans1RelativeTransformationParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleRelativeTransformation_in_ruleBodyConstraint4446);
            lv_relTrans1_6_0=ruleRelativeTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"relTrans1",
                    		lv_relTrans1_6_0, 
                    		"RelativeTransformation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleBodyConstraint4458); 

                	newLeafNode(otherlv_7, grammarAccess.getBodyConstraintAccess().getAndKeyword_7());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1997:1: ( (lv_body2_8_0= ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1998:1: (lv_body2_8_0= ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1998:1: (lv_body2_8_0= ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1999:3: lv_body2_8_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getBodyConstraintAccess().getBody2BodyReferenceParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyReference_in_ruleBodyConstraint4479);
            lv_body2_8_0=ruleBodyReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"body2",
                    		lv_body2_8_0, 
                    		"BodyReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2015:2: ( (lv_relTrans2_9_0= ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2016:1: (lv_relTrans2_9_0= ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2016:1: (lv_relTrans2_9_0= ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2017:3: lv_relTrans2_9_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getBodyConstraintAccess().getRelTrans2RelativeTransformationParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleRelativeTransformation_in_ruleBodyConstraint4500);
            lv_relTrans2_9_0=ruleRelativeTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyConstraintRule());
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
    // $ANTLR end "ruleBodyConstraint"


    // $ANTLR start "entryRuleJointConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2041:1: entryRuleJointConstraint returns [EObject current=null] : iv_ruleJointConstraint= ruleJointConstraint EOF ;
    public final EObject entryRuleJointConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointConstraint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2042:2: (iv_ruleJointConstraint= ruleJointConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2043:2: iv_ruleJointConstraint= ruleJointConstraint EOF
            {
             newCompositeNode(grammarAccess.getJointConstraintRule()); 
            pushFollow(FOLLOW_ruleJointConstraint_in_entryRuleJointConstraint4536);
            iv_ruleJointConstraint=ruleJointConstraint();

            state._fsp--;

             current =iv_ruleJointConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointConstraint4546); 

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
    // $ANTLR end "entryRuleJointConstraint"


    // $ANTLR start "ruleJointConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2050:1: ruleJointConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'moves' otherlv_5= 'like' ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleJointConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2053:28: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'moves' otherlv_5= 'like' ( (otherlv_6= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2054:1: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'moves' otherlv_5= 'like' ( (otherlv_6= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2054:1: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'moves' otherlv_5= 'like' ( (otherlv_6= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2054:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'moves' otherlv_5= 'like' ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleJointConstraint4583); 

                	newLeafNode(otherlv_0, grammarAccess.getJointConstraintAccess().getConstraintKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2058:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2059:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2059:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2060:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJointConstraint4600); 

            			newLeafNode(lv_name_1_0, grammarAccess.getJointConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJointConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleJointConstraint4617); 

                	newLeafNode(otherlv_2, grammarAccess.getJointConstraintAccess().getColonKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2080:1: ( (otherlv_3= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2081:1: (otherlv_3= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2081:1: (otherlv_3= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2082:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJointConstraintRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJointConstraint4637); 

            		newLeafNode(otherlv_3, grammarAccess.getJointConstraintAccess().getJoint1JointCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleJointConstraint4649); 

                	newLeafNode(otherlv_4, grammarAccess.getJointConstraintAccess().getMovesKeyword_4());
                
            otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleJointConstraint4661); 

                	newLeafNode(otherlv_5, grammarAccess.getJointConstraintAccess().getLikeKeyword_5());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2101:1: ( (otherlv_6= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2102:1: (otherlv_6= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2102:1: (otherlv_6= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2103:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJointConstraintRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJointConstraint4681); 

            		newLeafNode(otherlv_6, grammarAccess.getJointConstraintAccess().getJoint2JointCrossReference_6_0()); 
            	

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
    // $ANTLR end "ruleJointConstraint"


    // $ANTLR start "entryRuleExternalLoad"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2122:1: entryRuleExternalLoad returns [EObject current=null] : iv_ruleExternalLoad= ruleExternalLoad EOF ;
    public final EObject entryRuleExternalLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalLoad = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2123:2: (iv_ruleExternalLoad= ruleExternalLoad EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2124:2: iv_ruleExternalLoad= ruleExternalLoad EOF
            {
             newCompositeNode(grammarAccess.getExternalLoadRule()); 
            pushFollow(FOLLOW_ruleExternalLoad_in_entryRuleExternalLoad4717);
            iv_ruleExternalLoad=ruleExternalLoad();

            state._fsp--;

             current =iv_ruleExternalLoad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalLoad4727); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2131:1: ruleExternalLoad returns [EObject current=null] : (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')' ) ;
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
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2134:28: ( (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2135:1: (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2135:1: (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2135:3: otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleExternalLoad4764); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalLoadAccess().getExternalKeyword_0());
                
            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleExternalLoad4776); 

                	newLeafNode(otherlv_1, grammarAccess.getExternalLoadAccess().getLoadKeyword_1());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2143:1: ( (lv_name_2_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2144:1: (lv_name_2_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2144:1: (lv_name_2_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2145:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalLoad4793); 

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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleExternalLoad4810); 

                	newLeafNode(otherlv_3, grammarAccess.getExternalLoadAccess().getColonKeyword_3());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2165:1: ( (lv_type_4_0= ruleLoadType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2166:1: (lv_type_4_0= ruleLoadType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2166:1: (lv_type_4_0= ruleLoadType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2167:3: lv_type_4_0= ruleLoadType
            {
             
            	        newCompositeNode(grammarAccess.getExternalLoadAccess().getTypeLoadTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleLoadType_in_ruleExternalLoad4831);
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

            otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleExternalLoad4843); 

                	newLeafNode(otherlv_5, grammarAccess.getExternalLoadAccess().getAtKeyword_5());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2187:1: ( (lv_body1_6_0= ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2188:1: (lv_body1_6_0= ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2188:1: (lv_body1_6_0= ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2189:3: lv_body1_6_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getExternalLoadAccess().getBody1BodyReferenceParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyReference_in_ruleExternalLoad4864);
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

            otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleExternalLoad4876); 

                	newLeafNode(otherlv_7, grammarAccess.getExternalLoadAccess().getLeftParenthesisKeyword_7());
                
            otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleExternalLoad4888); 

                	newLeafNode(otherlv_8, grammarAccess.getExternalLoadAccess().getWithKeyword_8());
                
            otherlv_9=(Token)match(input,43,FOLLOW_43_in_ruleExternalLoad4900); 

                	newLeafNode(otherlv_9, grammarAccess.getExternalLoadAccess().getRelativeKeyword_9());
                
            otherlv_10=(Token)match(input,44,FOLLOW_44_in_ruleExternalLoad4912); 

                	newLeafNode(otherlv_10, grammarAccess.getExternalLoadAccess().getTransformationKeyword_10());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2221:1: ( (lv_position_11_0= ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2222:1: (lv_position_11_0= ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2222:1: (lv_position_11_0= ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2223:3: lv_position_11_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getExternalLoadAccess().getPositionMatrixParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleExternalLoad4933);
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

            otherlv_12=(Token)match(input,46,FOLLOW_46_in_ruleExternalLoad4945); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2251:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2252:2: (iv_ruleMatrix= ruleMatrix EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2253:2: iv_ruleMatrix= ruleMatrix EOF
            {
             newCompositeNode(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_ruleMatrix_in_entryRuleMatrix4981);
            iv_ruleMatrix=ruleMatrix();

            state._fsp--;

             current =iv_ruleMatrix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix4991); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2260:1: ruleMatrix returns [EObject current=null] : (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        EObject this_BaseMatrix_0 = null;

        EObject this_MatrixRef_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2263:28: ( (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2264:1: (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2264:1: (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=54 && LA22_0<=55)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2265:5: this_BaseMatrix_0= ruleBaseMatrix
                    {
                     
                            newCompositeNode(grammarAccess.getMatrixAccess().getBaseMatrixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBaseMatrix_in_ruleMatrix5038);
                    this_BaseMatrix_0=ruleBaseMatrix();

                    state._fsp--;

                     
                            current = this_BaseMatrix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2275:5: this_MatrixRef_1= ruleMatrixRef
                    {
                     
                            newCompositeNode(grammarAccess.getMatrixAccess().getMatrixRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMatrixRef_in_ruleMatrix5065);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2291:1: entryRuleBaseMatrix returns [EObject current=null] : iv_ruleBaseMatrix= ruleBaseMatrix EOF ;
    public final EObject entryRuleBaseMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseMatrix = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2292:2: (iv_ruleBaseMatrix= ruleBaseMatrix EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2293:2: iv_ruleBaseMatrix= ruleBaseMatrix EOF
            {
             newCompositeNode(grammarAccess.getBaseMatrixRule()); 
            pushFollow(FOLLOW_ruleBaseMatrix_in_entryRuleBaseMatrix5100);
            iv_ruleBaseMatrix=ruleBaseMatrix();

            state._fsp--;

             current =iv_ruleBaseMatrix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseMatrix5110); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2300:1: ruleBaseMatrix returns [EObject current=null] : ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' ) ;
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
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2303:28: ( ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2304:1: ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2304:1: ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2304:2: (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']'
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2304:2: (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2304:4: otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleBaseMatrix5148); 

                        	newLeafNode(otherlv_0, grammarAccess.getBaseMatrixAccess().getMatrixKeyword_0_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2308:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2309:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2309:1: (lv_name_1_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2310:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseMatrix5165); 

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

            otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleBaseMatrix5184); 

                	newLeafNode(otherlv_2, grammarAccess.getBaseMatrixAccess().getLeftSquareBracketKeyword_1());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2330:1: ( (lv_values_3_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2331:1: (lv_values_3_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2331:1: (lv_values_3_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2332:3: lv_values_3_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleBaseMatrix5205);
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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2348:2: (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2348:4: otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) )
            	    {
            	    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleBaseMatrix5218); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBaseMatrixAccess().getCommaKeyword_3_0());
            	        
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2352:1: ( (lv_values_5_0= ruleAddExp ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2353:1: (lv_values_5_0= ruleAddExp )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2353:1: (lv_values_5_0= ruleAddExp )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2354:3: lv_values_5_0= ruleAddExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAddExp_in_ruleBaseMatrix5239);
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
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleBaseMatrix5253); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2382:1: entryRuleMatrixRef returns [EObject current=null] : iv_ruleMatrixRef= ruleMatrixRef EOF ;
    public final EObject entryRuleMatrixRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixRef = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2383:2: (iv_ruleMatrixRef= ruleMatrixRef EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2384:2: iv_ruleMatrixRef= ruleMatrixRef EOF
            {
             newCompositeNode(grammarAccess.getMatrixRefRule()); 
            pushFollow(FOLLOW_ruleMatrixRef_in_entryRuleMatrixRef5289);
            iv_ruleMatrixRef=ruleMatrixRef();

            state._fsp--;

             current =iv_ruleMatrixRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrixRef5299); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2391:1: ruleMatrixRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleMatrixRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2394:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2395:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2395:1: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2396:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2396:1: (otherlv_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2397:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMatrixRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMatrixRef5343); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2416:1: entryRuleAddExp returns [EObject current=null] : iv_ruleAddExp= ruleAddExp EOF ;
    public final EObject entryRuleAddExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2417:2: (iv_ruleAddExp= ruleAddExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2418:2: iv_ruleAddExp= ruleAddExp EOF
            {
             newCompositeNode(grammarAccess.getAddExpRule()); 
            pushFollow(FOLLOW_ruleAddExp_in_entryRuleAddExp5378);
            iv_ruleAddExp=ruleAddExp();

            state._fsp--;

             current =iv_ruleAddExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExp5388); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2425:1: ruleAddExp returns [EObject current=null] : (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* ) ;
    public final EObject ruleAddExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultExp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2428:28: ( (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2429:1: (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2429:1: (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2430:5: this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAddExpAccess().getMultExpParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultExp_in_ruleAddExp5435);
            this_MultExp_0=ruleMultExp();

            state._fsp--;

             
                    current = this_MultExp_0; 
                    afterParserOrEnumRuleCall();
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2438:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33||LA26_0==57) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2438:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2438:2: ()
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2439:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2444:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2445:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2445:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2446:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2446:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==33) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==57) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2447:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,33,FOLLOW_33_in_ruleAddExp5464); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getAddExpAccess().getOpPlusSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAddExpRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2459:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,57,FOLLOW_57_in_ruleAddExp5493); 

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

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2474:2: ( (lv_right_3_0= ruleMultExp ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2475:1: (lv_right_3_0= ruleMultExp )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2475:1: (lv_right_3_0= ruleMultExp )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2476:3: lv_right_3_0= ruleMultExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddExpAccess().getRightMultExpParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultExp_in_ruleAddExp5530);
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
            	    break loop26;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2500:1: entryRuleMultExp returns [EObject current=null] : iv_ruleMultExp= ruleMultExp EOF ;
    public final EObject entryRuleMultExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2501:2: (iv_ruleMultExp= ruleMultExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2502:2: iv_ruleMultExp= ruleMultExp EOF
            {
             newCompositeNode(grammarAccess.getMultExpRule()); 
            pushFollow(FOLLOW_ruleMultExp_in_entryRuleMultExp5568);
            iv_ruleMultExp=ruleMultExp();

            state._fsp--;

             current =iv_ruleMultExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExp5578); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2509:1: ruleMultExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2512:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2513:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2513:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2514:5: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultExpAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleMultExp5625);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2522:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=58 && LA28_0<=59)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2522:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2522:2: ()
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2523:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMultExpAccess().getMultExpLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2528:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2529:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2529:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2530:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2530:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==58) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==59) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2531:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,58,FOLLOW_58_in_ruleMultExp5654); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getMultExpAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultExpRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2543:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,59,FOLLOW_59_in_ruleMultExp5683); 

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

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2558:2: ( (lv_right_3_0= rulePrimary ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2559:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2559:1: (lv_right_3_0= rulePrimary )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2560:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultExpAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleMultExp5720);
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
            	    break loop28;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2584:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2585:2: (iv_rulePrimary= rulePrimary EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2586:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary5758);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary5768); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2593:1: rulePrimary returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_ParenthesisedExp_1= ruleParenthesisedExp | this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_ParenthesisedExp_1 = null;

        EObject this_ConstantOrFunctionCallExp_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2596:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_ParenthesisedExp_1= ruleParenthesisedExp | this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2597:1: (this_NumberLiteral_0= ruleNumberLiteral | this_ParenthesisedExp_1= ruleParenthesisedExp | this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2597:1: (this_NumberLiteral_0= ruleNumberLiteral | this_ParenthesisedExp_1= ruleParenthesisedExp | this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_REAL:
            case 57:
                {
                alt29=1;
                }
                break;
            case 42:
                {
                alt29=2;
                }
                break;
            case RULE_ID:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2598:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_rulePrimary5815);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2608:5: this_ParenthesisedExp_1= ruleParenthesisedExp
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisedExpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParenthesisedExp_in_rulePrimary5842);
                    this_ParenthesisedExp_1=ruleParenthesisedExp();

                    state._fsp--;

                     
                            current = this_ParenthesisedExp_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2618:5: this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getConstantOrFunctionCallExpParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConstantOrFunctionCallExp_in_rulePrimary5869);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2634:1: entryRuleParenthesisedExp returns [EObject current=null] : iv_ruleParenthesisedExp= ruleParenthesisedExp EOF ;
    public final EObject entryRuleParenthesisedExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisedExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2635:2: (iv_ruleParenthesisedExp= ruleParenthesisedExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2636:2: iv_ruleParenthesisedExp= ruleParenthesisedExp EOF
            {
             newCompositeNode(grammarAccess.getParenthesisedExpRule()); 
            pushFollow(FOLLOW_ruleParenthesisedExp_in_entryRuleParenthesisedExp5904);
            iv_ruleParenthesisedExp=ruleParenthesisedExp();

            state._fsp--;

             current =iv_ruleParenthesisedExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisedExp5914); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2643:1: ruleParenthesisedExp returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesisedExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2646:28: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2647:1: (otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2647:1: (otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2647:3: otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleParenthesisedExp5951); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesisedExpAccess().getLeftParenthesisKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2651:1: ( (lv_exp_1_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2652:1: (lv_exp_1_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2652:1: (lv_exp_1_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2653:3: lv_exp_1_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getParenthesisedExpAccess().getExpAddExpParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleParenthesisedExp5972);
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

            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleParenthesisedExp5984); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2681:1: entryRuleConstantOrFunctionCallExp returns [EObject current=null] : iv_ruleConstantOrFunctionCallExp= ruleConstantOrFunctionCallExp EOF ;
    public final EObject entryRuleConstantOrFunctionCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantOrFunctionCallExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2682:2: (iv_ruleConstantOrFunctionCallExp= ruleConstantOrFunctionCallExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2683:2: iv_ruleConstantOrFunctionCallExp= ruleConstantOrFunctionCallExp EOF
            {
             newCompositeNode(grammarAccess.getConstantOrFunctionCallExpRule()); 
            pushFollow(FOLLOW_ruleConstantOrFunctionCallExp_in_entryRuleConstantOrFunctionCallExp6020);
            iv_ruleConstantOrFunctionCallExp=ruleConstantOrFunctionCallExp();

            state._fsp--;

             current =iv_ruleConstantOrFunctionCallExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantOrFunctionCallExp6030); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2690:1: ruleConstantOrFunctionCallExp returns [EObject current=null] : ( ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? ) ;
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
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2693:28: ( ( ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2694:1: ( ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2694:1: ( ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2694:2: ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )?
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2694:2: ( (lv_label_0_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2695:1: (lv_label_0_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2695:1: (lv_label_0_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2696:3: lv_label_0_0= RULE_ID
            {
            lv_label_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantOrFunctionCallExp6072); 

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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2712:2: (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2712:4: otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleConstantOrFunctionCallExp6090); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstantOrFunctionCallExpAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2716:1: ( (lv_param_2_0= ruleAddExp ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2717:1: (lv_param_2_0= ruleAddExp )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2717:1: (lv_param_2_0= ruleAddExp )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2718:3: lv_param_2_0= ruleAddExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddExp_in_ruleConstantOrFunctionCallExp6111);
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

                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2734:2: (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==45) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2734:4: otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) )
                    	    {
                    	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleConstantOrFunctionCallExp6124); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getConstantOrFunctionCallExpAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2738:1: ( (lv_param_4_0= ruleAddExp ) )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2739:1: (lv_param_4_0= ruleAddExp )
                    	    {
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2739:1: (lv_param_4_0= ruleAddExp )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2740:3: lv_param_4_0= ruleAddExp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddExp_in_ruleConstantOrFunctionCallExp6145);
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
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleConstantOrFunctionCallExp6159); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2768:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2769:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2770:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral6197);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral6207); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2777:1: ruleNumberLiteral returns [EObject current=null] : ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_neg_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2780:28: ( ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2781:1: ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2781:1: ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2781:2: ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2781:2: ( (lv_neg_0_0= '-' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==57) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2782:1: (lv_neg_0_0= '-' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2782:1: (lv_neg_0_0= '-' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2783:3: lv_neg_0_0= '-'
                    {
                    lv_neg_0_0=(Token)match(input,57,FOLLOW_57_in_ruleNumberLiteral6250); 

                            newLeafNode(lv_neg_0_0, grammarAccess.getNumberLiteralAccess().getNegHyphenMinusKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "neg", true, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2796:3: ( (lv_value_1_0= RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2797:1: (lv_value_1_0= RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2797:1: (lv_value_1_0= RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2798:3: lv_value_1_0= RULE_REAL
            {
            lv_value_1_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleNumberLiteral6281); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2822:1: ruleAXIS returns [Enumerator current=null] : ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) ) ;
    public final Enumerator ruleAXIS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2824:28: ( ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2825:1: ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2825:1: ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt33=1;
                }
                break;
            case 61:
                {
                alt33=2;
                }
                break;
            case 62:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2825:2: (enumLiteral_0= 'x' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2825:2: (enumLiteral_0= 'x' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2825:4: enumLiteral_0= 'x'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleAXIS6336); 

                            current = grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2831:6: (enumLiteral_1= 'y' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2831:6: (enumLiteral_1= 'y' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2831:8: enumLiteral_1= 'y'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleAXIS6353); 

                            current = grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2837:6: (enumLiteral_2= 'z' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2837:6: (enumLiteral_2= 'z' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2837:8: enumLiteral_2= 'z'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_ruleAXIS6370); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2847:1: ruleConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) ) ;
    public final Enumerator ruleConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2849:28: ( ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2850:1: ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2850:1: ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==63) ) {
                alt34=1;
            }
            else if ( (LA34_0==64) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2850:2: (enumLiteral_0= 'geometrical' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2850:2: (enumLiteral_0= 'geometrical' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2850:4: enumLiteral_0= 'geometrical'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_63_in_ruleConstraintType6415); 

                            current = grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2856:6: (enumLiteral_1= 'velocity' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2856:6: (enumLiteral_1= 'velocity' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2856:8: enumLiteral_1= 'velocity'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleConstraintType6432); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2866:1: ruleLoadType returns [Enumerator current=null] : ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) ) ;
    public final Enumerator ruleLoadType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2868:28: ( ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2869:1: ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2869:1: ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==65) ) {
                alt35=1;
            }
            else if ( (LA35_0==66) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2869:2: (enumLiteral_0= 'force' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2869:2: (enumLiteral_0= 'force' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2869:4: enumLiteral_0= 'force'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleLoadType6477); 

                            current = grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2875:6: (enumLiteral_1= 'torque' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2875:6: (enumLiteral_1= 'torque' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2875:8: enumLiteral_1= 'torque'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleLoadType6494); 

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
    public static final BitSet FOLLOW_ruleInitialDefinition_in_ruleModel131 = new BitSet(new long[]{0x00C0003808003010L});
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
    public static final BitSet FOLLOW_14_in_ruleEnvironment428 = new BitSet(new long[]{0x00C0000000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleEnvironment449 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnvironment461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSystem544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem561 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem578 = new BitSet(new long[]{0x0009000008220000L});
    public static final BitSet FOLLOW_ruleSystemElement_in_ruleSystem599 = new BitSet(new long[]{0x0009000008228000L});
    public static final BitSet FOLLOW_15_in_ruleSystem612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemElement_in_entryRuleSystemElement648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemElement658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_ruleSystemElement705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnective_in_ruleSystemElement732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyRepetition_in_ruleSystemElement759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnective_in_entryRuleConnective794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnective804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_ruleConnective851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleConnective878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLoad_in_ruleConnective905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBody987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody1004 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBody1021 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleMass_in_ruleBody1042 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBody1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_entryRuleBodyReference1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyReference1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBodyReference1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBodyReference1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBodyReference1218 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyReference1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyReference1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyRepetition_in_entryRuleBodyRepetition1315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyRepetition1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBodyRepetition1362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBodyRepetition1379 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBodyRepetition1396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyRepetition1416 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBodyRepetition1428 = new BitSet(new long[]{0x0009000008000000L});
    public static final BitSet FOLLOW_ruleConnective_in_ruleBodyRepetition1449 = new BitSet(new long[]{0x0009000008008000L});
    public static final BitSet FOLLOW_15_in_ruleBodyRepetition1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_entryRuleMass1498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMass1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMass1545 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMass1557 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMass1569 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleMass1590 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMass1602 = new BitSet(new long[]{0x00C0000000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleMass1623 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMass1635 = new BitSet(new long[]{0x00C0000000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleMass1656 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMass1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_entryRuleJoint1704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoint1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleJoint1751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJoint1768 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleJoint1785 = new BitSet(new long[]{0x0000001808000010L});
    public static final BitSet FOLLOW_ruleJointType_in_ruleJoint1806 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleJoint1824 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleJoint1850 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_ruleBodyReference_in_ruleJoint1871 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_ruleJoint1892 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleJoint1904 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_ruleBodyReference_in_ruleJoint1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_entryRuleJointType1961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointType1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleJointType2009 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleJointType2021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJointType2038 = new BitSet(new long[]{0x0000001808000010L});
    public static final BitSet FOLLOW_ruleAdditiveJointType_in_ruleJointType2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveJointType_in_entryRuleAdditiveJointType2102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveJointType2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryJointType_in_ruleAdditiveJointType2159 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleAdditiveJointType2171 = new BitSet(new long[]{0x0000001808000010L});
    public static final BitSet FOLLOW_rulePrimaryJointType_in_ruleAdditiveJointType2201 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rulePrimaryJointType_in_entryRulePrimaryJointType2239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryJointType2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointTypeReference_in_rulePrimaryJointType2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicJointType_in_rulePrimaryJointType2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointTypeReference_in_entryRuleJointTypeReference2358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointTypeReference2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJointTypeReference2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicJointType_in_entryRuleBasicJointType2447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicJointType2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointMovement_in_ruleBasicJointType2503 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBasicJointType2515 = new BitSet(new long[]{0x00C0003808003010L});
    public static final BitSet FOLLOW_ruleStiffnessExp_in_ruleBasicJointType2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointMovement_in_entryRuleJointMovement2572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointMovement2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRevolute_in_ruleJointMovement2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanar_in_ruleJointMovement2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRevolute_in_entryRuleRevolute2691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRevolute2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRevolute2738 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_ruleRevolute2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanar_in_entryRulePlanar2795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanar2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePlanar2842 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_rulePlanar2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStiffnessExp_in_entryRuleStiffnessExp2899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStiffnessExp2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStiffnessRef_in_ruleStiffnessExp2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseStiffnessExp_in_ruleStiffnessExp2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStiffnessRef_in_entryRuleStiffnessRef3018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStiffnessRef3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStiffnessRef3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseStiffnessExp_in_entryRuleBaseStiffnessExp3107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseStiffnessExp3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBaseStiffnessExp3155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseStiffnessExp3172 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBaseStiffnessExp3191 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBaseStiffnessExp3203 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp3224 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleBaseStiffnessExp3236 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp3257 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleBaseStiffnessExp3269 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp3290 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleBaseStiffnessExp3302 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseStiffnessExp3323 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBaseStiffnessExp3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_entryRuleRelativeTransformation3371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeTransformation3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRelativeTransformation3418 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleRelativeTransformation3430 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleRelativeTransformation3442 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleRelativeTransformation3454 = new BitSet(new long[]{0x00C0000000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleRelativeTransformation3475 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleRelativeTransformation3487 = new BitSet(new long[]{0x0000840000000010L});
    public static final BitSet FOLLOW_ruleReorientation_in_ruleRelativeTransformation3508 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleRelativeTransformation3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientation_in_entryRuleReorientation3556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientation3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleReorientation3604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReorientation3621 = new BitSet(new long[]{0x0000840000000010L});
    public static final BitSet FOLLOW_ruleReorientExpression_in_ruleReorientation3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientExpression_in_entryRuleReorientExpression3685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientExpression3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientRef_in_ruleReorientExpression3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicReorientExpression_in_ruleReorientExpression3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientRef_in_entryRuleReorientRef3804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientRef3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReorientRef3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicReorientExpression_in_entryRuleBasicReorientExpression3893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicReorientExpression3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBasicReorientExpression3940 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_ruleBasicReorientExpression3962 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_ruleBasicReorientExpression3983 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleBasicReorientExpression3995 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBasicReorientExpression4016 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleBasicReorientExpression4028 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_ruleBasicReorientExpression4041 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleBasicReorientExpression4053 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_ruleBasicReorientExpression4074 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleBasicReorientExpression4086 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBasicReorientExpression4107 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleBasicReorientExpression4119 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_46_in_ruleBasicReorientExpression4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint4171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyConstraint_in_ruleConstraint4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointConstraint_in_ruleConstraint4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyConstraint_in_entryRuleBodyConstraint4290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyConstraint4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBodyConstraint4337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyConstraint4354 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleBodyConstraint4371 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleConstraintType_in_ruleBodyConstraint4392 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleBodyConstraint4404 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_ruleBodyReference_in_ruleBodyConstraint4425 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_ruleBodyConstraint4446 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBodyConstraint4458 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_ruleBodyReference_in_ruleBodyConstraint4479 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_ruleBodyConstraint4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointConstraint_in_entryRuleJointConstraint4536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointConstraint4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleJointConstraint4583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJointConstraint4600 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleJointConstraint4617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJointConstraint4637 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleJointConstraint4649 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleJointConstraint4661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJointConstraint4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLoad_in_entryRuleExternalLoad4717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalLoad4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleExternalLoad4764 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleExternalLoad4776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalLoad4793 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleExternalLoad4810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleLoadType_in_ruleExternalLoad4831 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleExternalLoad4843 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_ruleBodyReference_in_ruleExternalLoad4864 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleExternalLoad4876 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleExternalLoad4888 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleExternalLoad4900 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleExternalLoad4912 = new BitSet(new long[]{0x00C0000000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleExternalLoad4933 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleExternalLoad4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_entryRuleMatrix4981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_ruleMatrix5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRef_in_ruleMatrix5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_entryRuleBaseMatrix5100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseMatrix5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBaseMatrix5148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseMatrix5165 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleBaseMatrix5184 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseMatrix5205 = new BitSet(new long[]{0x0100200000000000L});
    public static final BitSet FOLLOW_45_in_ruleBaseMatrix5218 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseMatrix5239 = new BitSet(new long[]{0x0100200000000000L});
    public static final BitSet FOLLOW_56_in_ruleBaseMatrix5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRef_in_entryRuleMatrixRef5289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrixRef5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMatrixRef5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_entryRuleAddExp5378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExp5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_ruleAddExp5435 = new BitSet(new long[]{0x0200000200000002L});
    public static final BitSet FOLLOW_33_in_ruleAddExp5464 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_57_in_ruleAddExp5493 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_ruleMultExp_in_ruleAddExp5530 = new BitSet(new long[]{0x0200000200000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_entryRuleMultExp5568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExp5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMultExp5625 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_58_in_ruleMultExp5654 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_59_in_ruleMultExp5683 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMultExp5720 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary5758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_rulePrimary5815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisedExp_in_rulePrimary5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantOrFunctionCallExp_in_rulePrimary5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisedExp_in_entryRuleParenthesisedExp5904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisedExp5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleParenthesisedExp5951 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleParenthesisedExp5972 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleParenthesisedExp5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantOrFunctionCallExp_in_entryRuleConstantOrFunctionCallExp6020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantOrFunctionCallExp6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantOrFunctionCallExp6072 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleConstantOrFunctionCallExp6090 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleConstantOrFunctionCallExp6111 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_ruleConstantOrFunctionCallExp6124 = new BitSet(new long[]{0x0200040000000050L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleConstantOrFunctionCallExp6145 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_46_in_ruleConstantOrFunctionCallExp6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral6197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNumberLiteral6250 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleNumberLiteral6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleAXIS6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleAXIS6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleAXIS6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleConstraintType6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleConstraintType6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleLoadType6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleLoadType6494 = new BitSet(new long[]{0x0000000000000002L});

}