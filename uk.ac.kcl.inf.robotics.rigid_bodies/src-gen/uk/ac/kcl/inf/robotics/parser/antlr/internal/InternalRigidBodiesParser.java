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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'world'", "'{'", "'gravity'", "'}'", "'system'", "'configurations'", "'instantiate'", "'as'", "'control'", "'.'", "'to'", "','", "'with'", "'gains'", "'P'", "'='", "'I'", "'D'", "'>'", "'<'", "'lock'", "'rotation'", "'translation'", "'+'", "'keep'", "'flexible'", "'revolute'", "'planar'", "'body'", "'base'", "'new'", "'last'", "'['", "']'", "'repeat'", "'of'", "'mass'", "'value'", "'position'", "'inertia'", "'joint'", "':'", "'start'", "'between'", "'and'", "'type'", "'stiffness'", "'springCoeff'", "'springInit'", "'dampViscous'", "'dampCoulomb'", "'('", "'relative'", "'transformation'", "')'", "'reorient'", "'constraint'", "'moves'", "'like'", "'external'", "'load'", "'at'", "'matrix'", "'-'", "'*'", "'/'", "'x'", "'y'", "'z'", "'geometrical'", "'velocity'", "'force'", "'torque'"
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
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
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
    public String getGrammarFileName() { return "InternalRigidBodies.g"; }



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
    // InternalRigidBodies.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRigidBodies.g:69:2: (iv_ruleModel= ruleModel EOF )
            // InternalRigidBodies.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+ ( (lv_configuration_3_0= ruleConfigurationDef ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_defs_0_0 = null;

        EObject lv_world_1_0 = null;

        EObject lv_bodies_2_0 = null;

        EObject lv_configuration_3_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:80:28: ( ( ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+ ( (lv_configuration_3_0= ruleConfigurationDef ) ) ) )
            // InternalRigidBodies.g:81:1: ( ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+ ( (lv_configuration_3_0= ruleConfigurationDef ) ) )
            {
            // InternalRigidBodies.g:81:1: ( ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+ ( (lv_configuration_3_0= ruleConfigurationDef ) ) )
            // InternalRigidBodies.g:81:2: ( (lv_defs_0_0= ruleInitialDefinition ) )* ( (lv_world_1_0= ruleEnvironment ) ) ( (lv_bodies_2_0= ruleSystem ) )+ ( (lv_configuration_3_0= ruleConfigurationDef ) )
            {
            // InternalRigidBodies.g:81:2: ( (lv_defs_0_0= ruleInitialDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13||(LA1_0>=38 && LA1_0<=39)||LA1_0==44||LA1_0==52||LA1_0==58||LA1_0==74) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRigidBodies.g:82:1: (lv_defs_0_0= ruleInitialDefinition )
            	    {
            	    // InternalRigidBodies.g:82:1: (lv_defs_0_0= ruleInitialDefinition )
            	    // InternalRigidBodies.g:83:3: lv_defs_0_0= ruleInitialDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDefsInitialDefinitionParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_defs_0_0=ruleInitialDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"defs",
            	            		lv_defs_0_0, 
            	            		"uk.ac.kcl.inf.robotics.RigidBodies.InitialDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRigidBodies.g:99:3: ( (lv_world_1_0= ruleEnvironment ) )
            // InternalRigidBodies.g:100:1: (lv_world_1_0= ruleEnvironment )
            {
            // InternalRigidBodies.g:100:1: (lv_world_1_0= ruleEnvironment )
            // InternalRigidBodies.g:101:3: lv_world_1_0= ruleEnvironment
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getWorldEnvironmentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_world_1_0=ruleEnvironment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"world",
                    		lv_world_1_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.Environment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRigidBodies.g:117:2: ( (lv_bodies_2_0= ruleSystem ) )+
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
            	    // InternalRigidBodies.g:118:1: (lv_bodies_2_0= ruleSystem )
            	    {
            	    // InternalRigidBodies.g:118:1: (lv_bodies_2_0= ruleSystem )
            	    // InternalRigidBodies.g:119:3: lv_bodies_2_0= ruleSystem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getBodiesSystemParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_bodies_2_0=ruleSystem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bodies",
            	            		lv_bodies_2_0, 
            	            		"uk.ac.kcl.inf.robotics.RigidBodies.System");
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

            // InternalRigidBodies.g:135:3: ( (lv_configuration_3_0= ruleConfigurationDef ) )
            // InternalRigidBodies.g:136:1: (lv_configuration_3_0= ruleConfigurationDef )
            {
            // InternalRigidBodies.g:136:1: (lv_configuration_3_0= ruleConfigurationDef )
            // InternalRigidBodies.g:137:3: lv_configuration_3_0= ruleConfigurationDef
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getConfigurationConfigurationDefParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_configuration_3_0=ruleConfigurationDef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"configuration",
                    		lv_configuration_3_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.ConfigurationDef");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInitialDefinition"
    // InternalRigidBodies.g:161:1: entryRuleInitialDefinition returns [EObject current=null] : iv_ruleInitialDefinition= ruleInitialDefinition EOF ;
    public final EObject entryRuleInitialDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialDefinition = null;


        try {
            // InternalRigidBodies.g:162:2: (iv_ruleInitialDefinition= ruleInitialDefinition EOF )
            // InternalRigidBodies.g:163:2: iv_ruleInitialDefinition= ruleInitialDefinition EOF
            {
             newCompositeNode(grammarAccess.getInitialDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialDefinition=ruleInitialDefinition();

            state._fsp--;

             current =iv_ruleInitialDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:170:1: ruleInitialDefinition returns [EObject current=null] : (this_BaseMatrix_0= ruleBaseMatrix | this_JointType_1= ruleJointType | this_BaseStiffnessExp_2= ruleBaseStiffnessExp ) ;
    public final EObject ruleInitialDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_BaseMatrix_0 = null;

        EObject this_JointType_1 = null;

        EObject this_BaseStiffnessExp_2 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:173:28: ( (this_BaseMatrix_0= ruleBaseMatrix | this_JointType_1= ruleJointType | this_BaseStiffnessExp_2= ruleBaseStiffnessExp ) )
            // InternalRigidBodies.g:174:1: (this_BaseMatrix_0= ruleBaseMatrix | this_JointType_1= ruleJointType | this_BaseStiffnessExp_2= ruleBaseStiffnessExp )
            {
            // InternalRigidBodies.g:174:1: (this_BaseMatrix_0= ruleBaseMatrix | this_JointType_1= ruleJointType | this_BaseStiffnessExp_2= ruleBaseStiffnessExp )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 44:
            case 74:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
            case 38:
            case 39:
            case 52:
                {
                alt3=2;
                }
                break;
            case 13:
            case 58:
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
                    // InternalRigidBodies.g:175:5: this_BaseMatrix_0= ruleBaseMatrix
                    {
                     
                            newCompositeNode(grammarAccess.getInitialDefinitionAccess().getBaseMatrixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_BaseMatrix_0=ruleBaseMatrix();

                    state._fsp--;

                     
                            current = this_BaseMatrix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:185:5: this_JointType_1= ruleJointType
                    {
                     
                            newCompositeNode(grammarAccess.getInitialDefinitionAccess().getJointTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_JointType_1=ruleJointType();

                    state._fsp--;

                     
                            current = this_JointType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalRigidBodies.g:195:5: this_BaseStiffnessExp_2= ruleBaseStiffnessExp
                    {
                     
                            newCompositeNode(grammarAccess.getInitialDefinitionAccess().getBaseStiffnessExpParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalRigidBodies.g:211:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalRigidBodies.g:212:2: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalRigidBodies.g:213:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:220:1: ruleEnvironment returns [EObject current=null] : (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_gravity_3_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:223:28: ( (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}' ) )
            // InternalRigidBodies.g:224:1: (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}' )
            {
            // InternalRigidBodies.g:224:1: (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}' )
            // InternalRigidBodies.g:224:3: otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getWorldKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

                	newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getGravityKeyword_2());
                
            // InternalRigidBodies.g:236:1: ( (lv_gravity_3_0= ruleMatrix ) )
            // InternalRigidBodies.g:237:1: (lv_gravity_3_0= ruleMatrix )
            {
            // InternalRigidBodies.g:237:1: (lv_gravity_3_0= ruleMatrix )
            // InternalRigidBodies.g:238:3: lv_gravity_3_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getEnvironmentAccess().getGravityMatrixParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_9);
            lv_gravity_3_0=ruleMatrix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	        }
                   		set(
                   			current, 
                   			"gravity",
                    		lv_gravity_3_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.Matrix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRigidBodies.g:266:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalRigidBodies.g:267:2: (iv_ruleSystem= ruleSystem EOF )
            // InternalRigidBodies.g:268:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:275:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:278:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' ) )
            // InternalRigidBodies.g:279:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' )
            {
            // InternalRigidBodies.g:279:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' )
            // InternalRigidBodies.g:279:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // InternalRigidBodies.g:283:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalRigidBodies.g:284:1: (lv_name_1_0= RULE_ID )
            {
            // InternalRigidBodies.g:284:1: (lv_name_1_0= RULE_ID )
            // InternalRigidBodies.g:285:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_11); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalRigidBodies.g:305:1: ( (lv_elements_3_0= ruleSystemElement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==40||LA4_0==46||LA4_0==52||LA4_0==68||LA4_0==71) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRigidBodies.g:306:1: (lv_elements_3_0= ruleSystemElement )
            	    {
            	    // InternalRigidBodies.g:306:1: (lv_elements_3_0= ruleSystemElement )
            	    // InternalRigidBodies.g:307:3: lv_elements_3_0= ruleSystemElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getElementsSystemElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_12);
            	    lv_elements_3_0=ruleSystemElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"uk.ac.kcl.inf.robotics.RigidBodies.SystemElement");
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

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleConfigurationDef"
    // InternalRigidBodies.g:335:1: entryRuleConfigurationDef returns [EObject current=null] : iv_ruleConfigurationDef= ruleConfigurationDef EOF ;
    public final EObject entryRuleConfigurationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationDef = null;


        try {
            // InternalRigidBodies.g:336:2: (iv_ruleConfigurationDef= ruleConfigurationDef EOF )
            // InternalRigidBodies.g:337:2: iv_ruleConfigurationDef= ruleConfigurationDef EOF
            {
             newCompositeNode(grammarAccess.getConfigurationDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationDef=ruleConfigurationDef();

            state._fsp--;

             current =iv_ruleConfigurationDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfigurationDef"


    // $ANTLR start "ruleConfigurationDef"
    // InternalRigidBodies.g:344:1: ruleConfigurationDef returns [EObject current=null] : (otherlv_0= 'configurations' otherlv_1= '{' ( (lv_instances_2_0= ruleSystemInstantiation ) )+ ( (lv_configs_3_0= ruleConfiguration ) )+ otherlv_4= '}' ) ;
    public final EObject ruleConfigurationDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_instances_2_0 = null;

        EObject lv_configs_3_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:347:28: ( (otherlv_0= 'configurations' otherlv_1= '{' ( (lv_instances_2_0= ruleSystemInstantiation ) )+ ( (lv_configs_3_0= ruleConfiguration ) )+ otherlv_4= '}' ) )
            // InternalRigidBodies.g:348:1: (otherlv_0= 'configurations' otherlv_1= '{' ( (lv_instances_2_0= ruleSystemInstantiation ) )+ ( (lv_configs_3_0= ruleConfiguration ) )+ otherlv_4= '}' )
            {
            // InternalRigidBodies.g:348:1: (otherlv_0= 'configurations' otherlv_1= '{' ( (lv_instances_2_0= ruleSystemInstantiation ) )+ ( (lv_configs_3_0= ruleConfiguration ) )+ otherlv_4= '}' )
            // InternalRigidBodies.g:348:3: otherlv_0= 'configurations' otherlv_1= '{' ( (lv_instances_2_0= ruleSystemInstantiation ) )+ ( (lv_configs_3_0= ruleConfiguration ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getConfigurationDefAccess().getConfigurationsKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13); 

                	newLeafNode(otherlv_1, grammarAccess.getConfigurationDefAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalRigidBodies.g:356:1: ( (lv_instances_2_0= ruleSystemInstantiation ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRigidBodies.g:357:1: (lv_instances_2_0= ruleSystemInstantiation )
            	    {
            	    // InternalRigidBodies.g:357:1: (lv_instances_2_0= ruleSystemInstantiation )
            	    // InternalRigidBodies.g:358:3: lv_instances_2_0= ruleSystemInstantiation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConfigurationDefAccess().getInstancesSystemInstantiationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_14);
            	    lv_instances_2_0=ruleSystemInstantiation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConfigurationDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instances",
            	            		lv_instances_2_0, 
            	            		"uk.ac.kcl.inf.robotics.RigidBodies.SystemInstantiation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalRigidBodies.g:374:3: ( (lv_configs_3_0= ruleConfiguration ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRigidBodies.g:375:1: (lv_configs_3_0= ruleConfiguration )
            	    {
            	    // InternalRigidBodies.g:375:1: (lv_configs_3_0= ruleConfiguration )
            	    // InternalRigidBodies.g:376:3: lv_configs_3_0= ruleConfiguration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConfigurationDefAccess().getConfigsConfigurationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_15);
            	    lv_configs_3_0=ruleConfiguration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConfigurationDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"configs",
            	            		lv_configs_3_0, 
            	            		"uk.ac.kcl.inf.robotics.RigidBodies.Configuration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getConfigurationDefAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleConfigurationDef"


    // $ANTLR start "entryRuleSystemInstantiation"
    // InternalRigidBodies.g:404:1: entryRuleSystemInstantiation returns [EObject current=null] : iv_ruleSystemInstantiation= ruleSystemInstantiation EOF ;
    public final EObject entryRuleSystemInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemInstantiation = null;


        try {
            // InternalRigidBodies.g:405:2: (iv_ruleSystemInstantiation= ruleSystemInstantiation EOF )
            // InternalRigidBodies.g:406:2: iv_ruleSystemInstantiation= ruleSystemInstantiation EOF
            {
             newCompositeNode(grammarAccess.getSystemInstantiationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemInstantiation=ruleSystemInstantiation();

            state._fsp--;

             current =iv_ruleSystemInstantiation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystemInstantiation"


    // $ANTLR start "ruleSystemInstantiation"
    // InternalRigidBodies.g:413:1: ruleSystemInstantiation returns [EObject current=null] : (otherlv_0= 'instantiate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleSystemInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // InternalRigidBodies.g:416:28: ( (otherlv_0= 'instantiate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalRigidBodies.g:417:1: (otherlv_0= 'instantiate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalRigidBodies.g:417:1: (otherlv_0= 'instantiate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalRigidBodies.g:417:3: otherlv_0= 'instantiate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemInstantiationAccess().getInstantiateKeyword_0());
                
            // InternalRigidBodies.g:421:1: ( (otherlv_1= RULE_ID ) )
            // InternalRigidBodies.g:422:1: (otherlv_1= RULE_ID )
            {
            // InternalRigidBodies.g:422:1: (otherlv_1= RULE_ID )
            // InternalRigidBodies.g:423:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemInstantiationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_16); 

            		newLeafNode(otherlv_1, grammarAccess.getSystemInstantiationAccess().getSystemSystemCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemInstantiationAccess().getAsKeyword_2());
                
            // InternalRigidBodies.g:438:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalRigidBodies.g:439:1: (lv_name_3_0= RULE_ID )
            {
            // InternalRigidBodies.g:439:1: (lv_name_3_0= RULE_ID )
            // InternalRigidBodies.g:440:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(lv_name_3_0, grammarAccess.getSystemInstantiationAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemInstantiationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

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
    // $ANTLR end "ruleSystemInstantiation"


    // $ANTLR start "entryRuleConfiguration"
    // InternalRigidBodies.g:464:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalRigidBodies.g:465:2: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalRigidBodies.g:466:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalRigidBodies.g:473:1: ruleConfiguration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_statements_2_0= ruleConfigurationStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:476:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_statements_2_0= ruleConfigurationStatement ) )* otherlv_3= '}' ) )
            // InternalRigidBodies.g:477:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_statements_2_0= ruleConfigurationStatement ) )* otherlv_3= '}' )
            {
            // InternalRigidBodies.g:477:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_statements_2_0= ruleConfigurationStatement ) )* otherlv_3= '}' )
            // InternalRigidBodies.g:477:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_statements_2_0= ruleConfigurationStatement ) )* otherlv_3= '}'
            {
            // InternalRigidBodies.g:477:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRigidBodies.g:478:1: (lv_name_0_0= RULE_ID )
            {
            // InternalRigidBodies.g:478:1: (lv_name_0_0= RULE_ID )
            // InternalRigidBodies.g:479:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_name_0_0, grammarAccess.getConfigurationAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfigurationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_17); 

                	newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalRigidBodies.g:499:1: ( (lv_statements_2_0= ruleConfigurationStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20||LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRigidBodies.g:500:1: (lv_statements_2_0= ruleConfigurationStatement )
            	    {
            	    // InternalRigidBodies.g:500:1: (lv_statements_2_0= ruleConfigurationStatement )
            	    // InternalRigidBodies.g:501:3: lv_statements_2_0= ruleConfigurationStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConfigurationAccess().getStatementsConfigurationStatementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_17);
            	    lv_statements_2_0=ruleConfigurationStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_2_0, 
            	            		"uk.ac.kcl.inf.robotics.RigidBodies.ConfigurationStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleConfigurationStatement"
    // InternalRigidBodies.g:529:1: entryRuleConfigurationStatement returns [EObject current=null] : iv_ruleConfigurationStatement= ruleConfigurationStatement EOF ;
    public final EObject entryRuleConfigurationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationStatement = null;


        try {
            // InternalRigidBodies.g:530:2: (iv_ruleConfigurationStatement= ruleConfigurationStatement EOF )
            // InternalRigidBodies.g:531:2: iv_ruleConfigurationStatement= ruleConfigurationStatement EOF
            {
             newCompositeNode(grammarAccess.getConfigurationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationStatement=ruleConfigurationStatement();

            state._fsp--;

             current =iv_ruleConfigurationStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfigurationStatement"


    // $ANTLR start "ruleConfigurationStatement"
    // InternalRigidBodies.g:538:1: ruleConfigurationStatement returns [EObject current=null] : (this_ControlStatement_0= ruleControlStatement | this_LockJointStatement_1= ruleLockJointStatement | this_LockDoFStatement_2= ruleLockDoFStatement ) ;
    public final EObject ruleConfigurationStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ControlStatement_0 = null;

        EObject this_LockJointStatement_1 = null;

        EObject this_LockDoFStatement_2 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:541:28: ( (this_ControlStatement_0= ruleControlStatement | this_LockJointStatement_1= ruleLockJointStatement | this_LockDoFStatement_2= ruleLockDoFStatement ) )
            // InternalRigidBodies.g:542:1: (this_ControlStatement_0= ruleControlStatement | this_LockJointStatement_1= ruleLockJointStatement | this_LockDoFStatement_2= ruleLockDoFStatement )
            {
            // InternalRigidBodies.g:542:1: (this_ControlStatement_0= ruleControlStatement | this_LockJointStatement_1= ruleLockJointStatement | this_LockDoFStatement_2= ruleLockDoFStatement )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==32) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==21) ) {
                        int LA8_4 = input.LA(4);

                        if ( (LA8_4==RULE_ID) ) {
                            int LA8_5 = input.LA(5);

                            if ( (LA8_5==22) ) {
                                int LA8_6 = input.LA(6);

                                if ( (LA8_6==36||(LA8_6>=38 && LA8_6<=39)) ) {
                                    alt8=3;
                                }
                                else if ( (LA8_6==33) ) {
                                    alt8=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 8, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRigidBodies.g:543:5: this_ControlStatement_0= ruleControlStatement
                    {
                     
                            newCompositeNode(grammarAccess.getConfigurationStatementAccess().getControlStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ControlStatement_0=ruleControlStatement();

                    state._fsp--;

                     
                            current = this_ControlStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:553:5: this_LockJointStatement_1= ruleLockJointStatement
                    {
                     
                            newCompositeNode(grammarAccess.getConfigurationStatementAccess().getLockJointStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LockJointStatement_1=ruleLockJointStatement();

                    state._fsp--;

                     
                            current = this_LockJointStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalRigidBodies.g:563:5: this_LockDoFStatement_2= ruleLockDoFStatement
                    {
                     
                            newCompositeNode(grammarAccess.getConfigurationStatementAccess().getLockDoFStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LockDoFStatement_2=ruleLockDoFStatement();

                    state._fsp--;

                     
                            current = this_LockDoFStatement_2; 
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
    // $ANTLR end "ruleConfigurationStatement"


    // $ANTLR start "entryRuleControlStatement"
    // InternalRigidBodies.g:579:1: entryRuleControlStatement returns [EObject current=null] : iv_ruleControlStatement= ruleControlStatement EOF ;
    public final EObject entryRuleControlStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlStatement = null;


        try {
            // InternalRigidBodies.g:580:2: (iv_ruleControlStatement= ruleControlStatement EOF )
            // InternalRigidBodies.g:581:2: iv_ruleControlStatement= ruleControlStatement EOF
            {
             newCompositeNode(grammarAccess.getControlStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlStatement=ruleControlStatement();

            state._fsp--;

             current =iv_ruleControlStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleControlStatement"


    // $ANTLR start "ruleControlStatement"
    // InternalRigidBodies.g:588:1: ruleControlStatement returns [EObject current=null] : (otherlv_0= 'control' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_bodyref_3_0= ruleBodyReference ) ) ( (lv_relative_transform_4_0= ruleRelativeTransformation ) ) otherlv_5= 'to' ( (lv_constraints_6_0= ruleConstraintClause ) ) (otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraintClause ) ) )* otherlv_9= 'with' otherlv_10= 'gains' otherlv_11= '{' (otherlv_12= 'P' otherlv_13= '=' ( (lv_P_14_0= ruleAddExp ) ) )? (otherlv_15= 'I' otherlv_16= '=' ( (lv_I_17_0= ruleAddExp ) ) )? (otherlv_18= 'D' otherlv_19= '=' ( (lv_D_20_0= ruleAddExp ) ) )? otherlv_21= '}' ) ;
    public final EObject ruleControlStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_bodyref_3_0 = null;

        EObject lv_relative_transform_4_0 = null;

        EObject lv_constraints_6_0 = null;

        EObject lv_constraints_8_0 = null;

        EObject lv_P_14_0 = null;

        EObject lv_I_17_0 = null;

        EObject lv_D_20_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:591:28: ( (otherlv_0= 'control' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_bodyref_3_0= ruleBodyReference ) ) ( (lv_relative_transform_4_0= ruleRelativeTransformation ) ) otherlv_5= 'to' ( (lv_constraints_6_0= ruleConstraintClause ) ) (otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraintClause ) ) )* otherlv_9= 'with' otherlv_10= 'gains' otherlv_11= '{' (otherlv_12= 'P' otherlv_13= '=' ( (lv_P_14_0= ruleAddExp ) ) )? (otherlv_15= 'I' otherlv_16= '=' ( (lv_I_17_0= ruleAddExp ) ) )? (otherlv_18= 'D' otherlv_19= '=' ( (lv_D_20_0= ruleAddExp ) ) )? otherlv_21= '}' ) )
            // InternalRigidBodies.g:592:1: (otherlv_0= 'control' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_bodyref_3_0= ruleBodyReference ) ) ( (lv_relative_transform_4_0= ruleRelativeTransformation ) ) otherlv_5= 'to' ( (lv_constraints_6_0= ruleConstraintClause ) ) (otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraintClause ) ) )* otherlv_9= 'with' otherlv_10= 'gains' otherlv_11= '{' (otherlv_12= 'P' otherlv_13= '=' ( (lv_P_14_0= ruleAddExp ) ) )? (otherlv_15= 'I' otherlv_16= '=' ( (lv_I_17_0= ruleAddExp ) ) )? (otherlv_18= 'D' otherlv_19= '=' ( (lv_D_20_0= ruleAddExp ) ) )? otherlv_21= '}' )
            {
            // InternalRigidBodies.g:592:1: (otherlv_0= 'control' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_bodyref_3_0= ruleBodyReference ) ) ( (lv_relative_transform_4_0= ruleRelativeTransformation ) ) otherlv_5= 'to' ( (lv_constraints_6_0= ruleConstraintClause ) ) (otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraintClause ) ) )* otherlv_9= 'with' otherlv_10= 'gains' otherlv_11= '{' (otherlv_12= 'P' otherlv_13= '=' ( (lv_P_14_0= ruleAddExp ) ) )? (otherlv_15= 'I' otherlv_16= '=' ( (lv_I_17_0= ruleAddExp ) ) )? (otherlv_18= 'D' otherlv_19= '=' ( (lv_D_20_0= ruleAddExp ) ) )? otherlv_21= '}' )
            // InternalRigidBodies.g:592:3: otherlv_0= 'control' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_bodyref_3_0= ruleBodyReference ) ) ( (lv_relative_transform_4_0= ruleRelativeTransformation ) ) otherlv_5= 'to' ( (lv_constraints_6_0= ruleConstraintClause ) ) (otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraintClause ) ) )* otherlv_9= 'with' otherlv_10= 'gains' otherlv_11= '{' (otherlv_12= 'P' otherlv_13= '=' ( (lv_P_14_0= ruleAddExp ) ) )? (otherlv_15= 'I' otherlv_16= '=' ( (lv_I_17_0= ruleAddExp ) ) )? (otherlv_18= 'D' otherlv_19= '=' ( (lv_D_20_0= ruleAddExp ) ) )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

                	newLeafNode(otherlv_0, grammarAccess.getControlStatementAccess().getControlKeyword_0());
                
            // InternalRigidBodies.g:596:1: ( (otherlv_1= RULE_ID ) )
            // InternalRigidBodies.g:597:1: (otherlv_1= RULE_ID )
            {
            // InternalRigidBodies.g:597:1: (otherlv_1= RULE_ID )
            // InternalRigidBodies.g:598:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getControlStatementRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            		newLeafNode(otherlv_1, grammarAccess.getControlStatementAccess().getSystemSystemInstantiationCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_19); 

                	newLeafNode(otherlv_2, grammarAccess.getControlStatementAccess().getFullStopKeyword_2());
                
            // InternalRigidBodies.g:613:1: ( (lv_bodyref_3_0= ruleBodyReference ) )
            // InternalRigidBodies.g:614:1: (lv_bodyref_3_0= ruleBodyReference )
            {
            // InternalRigidBodies.g:614:1: (lv_bodyref_3_0= ruleBodyReference )
            // InternalRigidBodies.g:615:3: lv_bodyref_3_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getControlStatementAccess().getBodyrefBodyReferenceParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_20);
            lv_bodyref_3_0=ruleBodyReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControlStatementRule());
            	        }
                   		set(
                   			current, 
                   			"bodyref",
                    		lv_bodyref_3_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.BodyReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRigidBodies.g:631:2: ( (lv_relative_transform_4_0= ruleRelativeTransformation ) )
            // InternalRigidBodies.g:632:1: (lv_relative_transform_4_0= ruleRelativeTransformation )
            {
            // InternalRigidBodies.g:632:1: (lv_relative_transform_4_0= ruleRelativeTransformation )
            // InternalRigidBodies.g:633:3: lv_relative_transform_4_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getControlStatementAccess().getRelative_transformRelativeTransformationParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_21);
            lv_relative_transform_4_0=ruleRelativeTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControlStatementRule());
            	        }
                   		set(
                   			current, 
                   			"relative_transform",
                    		lv_relative_transform_4_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.RelativeTransformation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22); 

                	newLeafNode(otherlv_5, grammarAccess.getControlStatementAccess().getToKeyword_5());
                
            // InternalRigidBodies.g:653:1: ( (lv_constraints_6_0= ruleConstraintClause ) )
            // InternalRigidBodies.g:654:1: (lv_constraints_6_0= ruleConstraintClause )
            {
            // InternalRigidBodies.g:654:1: (lv_constraints_6_0= ruleConstraintClause )
            // InternalRigidBodies.g:655:3: lv_constraints_6_0= ruleConstraintClause
            {
             
            	        newCompositeNode(grammarAccess.getControlStatementAccess().getConstraintsConstraintClauseParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_23);
            lv_constraints_6_0=ruleConstraintClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getControlStatementRule());
            	        }
                   		add(
                   			current, 
                   			"constraints",
                    		lv_constraints_6_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.ConstraintClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRigidBodies.g:671:2: (otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraintClause ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRigidBodies.g:671:4: otherlv_7= ',' ( (lv_constraints_8_0= ruleConstraintClause ) )
            	    {
            	    otherlv_7=(Token)match(input,23,FOLLOW_22); 

            	        	newLeafNode(otherlv_7, grammarAccess.getControlStatementAccess().getCommaKeyword_7_0());
            	        
            	    // InternalRigidBodies.g:675:1: ( (lv_constraints_8_0= ruleConstraintClause ) )
            	    // InternalRigidBodies.g:676:1: (lv_constraints_8_0= ruleConstraintClause )
            	    {
            	    // InternalRigidBodies.g:676:1: (lv_constraints_8_0= ruleConstraintClause )
            	    // InternalRigidBodies.g:677:3: lv_constraints_8_0= ruleConstraintClause
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getControlStatementAccess().getConstraintsConstraintClauseParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_23);
            	    lv_constraints_8_0=ruleConstraintClause();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getControlStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_8_0, 
            	            		"uk.ac.kcl.inf.robotics.RigidBodies.ConstraintClause");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_9=(Token)match(input,24,FOLLOW_24); 

                	newLeafNode(otherlv_9, grammarAccess.getControlStatementAccess().getWithKeyword_8());
                
            otherlv_10=(Token)match(input,25,FOLLOW_6); 

                	newLeafNode(otherlv_10, grammarAccess.getControlStatementAccess().getGainsKeyword_9());
                
            otherlv_11=(Token)match(input,13,FOLLOW_25); 

                	newLeafNode(otherlv_11, grammarAccess.getControlStatementAccess().getLeftCurlyBracketKeyword_10());
                
            // InternalRigidBodies.g:705:1: (otherlv_12= 'P' otherlv_13= '=' ( (lv_P_14_0= ruleAddExp ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRigidBodies.g:705:3: otherlv_12= 'P' otherlv_13= '=' ( (lv_P_14_0= ruleAddExp ) )
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_26); 

                        	newLeafNode(otherlv_12, grammarAccess.getControlStatementAccess().getPKeyword_11_0());
                        
                    otherlv_13=(Token)match(input,27,FOLLOW_22); 

                        	newLeafNode(otherlv_13, grammarAccess.getControlStatementAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalRigidBodies.g:713:1: ( (lv_P_14_0= ruleAddExp ) )
                    // InternalRigidBodies.g:714:1: (lv_P_14_0= ruleAddExp )
                    {
                    // InternalRigidBodies.g:714:1: (lv_P_14_0= ruleAddExp )
                    // InternalRigidBodies.g:715:3: lv_P_14_0= ruleAddExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getControlStatementAccess().getPAddExpParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FOLLOW_27);
                    lv_P_14_0=ruleAddExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControlStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"P",
                            		lv_P_14_0, 
                            		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalRigidBodies.g:731:4: (otherlv_15= 'I' otherlv_16= '=' ( (lv_I_17_0= ruleAddExp ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRigidBodies.g:731:6: otherlv_15= 'I' otherlv_16= '=' ( (lv_I_17_0= ruleAddExp ) )
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_26); 

                        	newLeafNode(otherlv_15, grammarAccess.getControlStatementAccess().getIKeyword_12_0());
                        
                    otherlv_16=(Token)match(input,27,FOLLOW_22); 

                        	newLeafNode(otherlv_16, grammarAccess.getControlStatementAccess().getEqualsSignKeyword_12_1());
                        
                    // InternalRigidBodies.g:739:1: ( (lv_I_17_0= ruleAddExp ) )
                    // InternalRigidBodies.g:740:1: (lv_I_17_0= ruleAddExp )
                    {
                    // InternalRigidBodies.g:740:1: (lv_I_17_0= ruleAddExp )
                    // InternalRigidBodies.g:741:3: lv_I_17_0= ruleAddExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getControlStatementAccess().getIAddExpParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FOLLOW_28);
                    lv_I_17_0=ruleAddExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControlStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"I",
                            		lv_I_17_0, 
                            		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalRigidBodies.g:757:4: (otherlv_18= 'D' otherlv_19= '=' ( (lv_D_20_0= ruleAddExp ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRigidBodies.g:757:6: otherlv_18= 'D' otherlv_19= '=' ( (lv_D_20_0= ruleAddExp ) )
                    {
                    otherlv_18=(Token)match(input,29,FOLLOW_26); 

                        	newLeafNode(otherlv_18, grammarAccess.getControlStatementAccess().getDKeyword_13_0());
                        
                    otherlv_19=(Token)match(input,27,FOLLOW_22); 

                        	newLeafNode(otherlv_19, grammarAccess.getControlStatementAccess().getEqualsSignKeyword_13_1());
                        
                    // InternalRigidBodies.g:765:1: ( (lv_D_20_0= ruleAddExp ) )
                    // InternalRigidBodies.g:766:1: (lv_D_20_0= ruleAddExp )
                    {
                    // InternalRigidBodies.g:766:1: (lv_D_20_0= ruleAddExp )
                    // InternalRigidBodies.g:767:3: lv_D_20_0= ruleAddExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getControlStatementAccess().getDAddExpParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_D_20_0=ruleAddExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getControlStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"D",
                            		lv_D_20_0, 
                            		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

                	newLeafNode(otherlv_21, grammarAccess.getControlStatementAccess().getRightCurlyBracketKeyword_14());
                

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
    // $ANTLR end "ruleControlStatement"


    // $ANTLR start "entryRuleConstraintClause"
    // InternalRigidBodies.g:795:1: entryRuleConstraintClause returns [EObject current=null] : iv_ruleConstraintClause= ruleConstraintClause EOF ;
    public final EObject entryRuleConstraintClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintClause = null;


        try {
            // InternalRigidBodies.g:796:2: (iv_ruleConstraintClause= ruleConstraintClause EOF )
            // InternalRigidBodies.g:797:2: iv_ruleConstraintClause= ruleConstraintClause EOF
            {
             newCompositeNode(grammarAccess.getConstraintClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintClause=ruleConstraintClause();

            state._fsp--;

             current =iv_ruleConstraintClause; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraintClause"


    // $ANTLR start "ruleConstraintClause"
    // InternalRigidBodies.g:804:1: ruleConstraintClause returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleAddExp ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '>' | lv_op_1_3= '<' ) ) ) ( (lv_rhs_2_0= ruleAddExp ) ) ) ;
    public final EObject ruleConstraintClause() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:807:28: ( ( ( (lv_lhs_0_0= ruleAddExp ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '>' | lv_op_1_3= '<' ) ) ) ( (lv_rhs_2_0= ruleAddExp ) ) ) )
            // InternalRigidBodies.g:808:1: ( ( (lv_lhs_0_0= ruleAddExp ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '>' | lv_op_1_3= '<' ) ) ) ( (lv_rhs_2_0= ruleAddExp ) ) )
            {
            // InternalRigidBodies.g:808:1: ( ( (lv_lhs_0_0= ruleAddExp ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '>' | lv_op_1_3= '<' ) ) ) ( (lv_rhs_2_0= ruleAddExp ) ) )
            // InternalRigidBodies.g:808:2: ( (lv_lhs_0_0= ruleAddExp ) ) ( ( (lv_op_1_1= '=' | lv_op_1_2= '>' | lv_op_1_3= '<' ) ) ) ( (lv_rhs_2_0= ruleAddExp ) )
            {
            // InternalRigidBodies.g:808:2: ( (lv_lhs_0_0= ruleAddExp ) )
            // InternalRigidBodies.g:809:1: (lv_lhs_0_0= ruleAddExp )
            {
            // InternalRigidBodies.g:809:1: (lv_lhs_0_0= ruleAddExp )
            // InternalRigidBodies.g:810:3: lv_lhs_0_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getConstraintClauseAccess().getLhsAddExpParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_29);
            lv_lhs_0_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintClauseRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_0_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRigidBodies.g:826:2: ( ( (lv_op_1_1= '=' | lv_op_1_2= '>' | lv_op_1_3= '<' ) ) )
            // InternalRigidBodies.g:827:1: ( (lv_op_1_1= '=' | lv_op_1_2= '>' | lv_op_1_3= '<' ) )
            {
            // InternalRigidBodies.g:827:1: ( (lv_op_1_1= '=' | lv_op_1_2= '>' | lv_op_1_3= '<' ) )
            // InternalRigidBodies.g:828:1: (lv_op_1_1= '=' | lv_op_1_2= '>' | lv_op_1_3= '<' )
            {
            // InternalRigidBodies.g:828:1: (lv_op_1_1= '=' | lv_op_1_2= '>' | lv_op_1_3= '<' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRigidBodies.g:829:3: lv_op_1_1= '='
                    {
                    lv_op_1_1=(Token)match(input,27,FOLLOW_22); 

                            newLeafNode(lv_op_1_1, grammarAccess.getConstraintClauseAccess().getOpEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintClauseRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:841:8: lv_op_1_2= '>'
                    {
                    lv_op_1_2=(Token)match(input,30,FOLLOW_22); 

                            newLeafNode(lv_op_1_2, grammarAccess.getConstraintClauseAccess().getOpGreaterThanSignKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintClauseRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalRigidBodies.g:853:8: lv_op_1_3= '<'
                    {
                    lv_op_1_3=(Token)match(input,31,FOLLOW_22); 

                            newLeafNode(lv_op_1_3, grammarAccess.getConstraintClauseAccess().getOpLessThanSignKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintClauseRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_1_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // InternalRigidBodies.g:868:2: ( (lv_rhs_2_0= ruleAddExp ) )
            // InternalRigidBodies.g:869:1: (lv_rhs_2_0= ruleAddExp )
            {
            // InternalRigidBodies.g:869:1: (lv_rhs_2_0= ruleAddExp )
            // InternalRigidBodies.g:870:3: lv_rhs_2_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getConstraintClauseAccess().getRhsAddExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_rhs_2_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintClauseRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_2_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
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
    // $ANTLR end "ruleConstraintClause"


    // $ANTLR start "entryRuleLockJointStatement"
    // InternalRigidBodies.g:894:1: entryRuleLockJointStatement returns [EObject current=null] : iv_ruleLockJointStatement= ruleLockJointStatement EOF ;
    public final EObject entryRuleLockJointStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLockJointStatement = null;


        try {
            // InternalRigidBodies.g:895:2: (iv_ruleLockJointStatement= ruleLockJointStatement EOF )
            // InternalRigidBodies.g:896:2: iv_ruleLockJointStatement= ruleLockJointStatement EOF
            {
             newCompositeNode(grammarAccess.getLockJointStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLockJointStatement=ruleLockJointStatement();

            state._fsp--;

             current =iv_ruleLockJointStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLockJointStatement"


    // $ANTLR start "ruleLockJointStatement"
    // InternalRigidBodies.g:903:1: ruleLockJointStatement returns [EObject current=null] : (otherlv_0= 'lock' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' otherlv_5= 'rotation' ( (lv_rotation_6_0= ruleMatrix ) ) otherlv_7= 'translation' ( (lv_translation_8_0= ruleMatrix ) ) ) ;
    public final EObject ruleLockJointStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_rotation_6_0 = null;

        EObject lv_translation_8_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:906:28: ( (otherlv_0= 'lock' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' otherlv_5= 'rotation' ( (lv_rotation_6_0= ruleMatrix ) ) otherlv_7= 'translation' ( (lv_translation_8_0= ruleMatrix ) ) ) )
            // InternalRigidBodies.g:907:1: (otherlv_0= 'lock' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' otherlv_5= 'rotation' ( (lv_rotation_6_0= ruleMatrix ) ) otherlv_7= 'translation' ( (lv_translation_8_0= ruleMatrix ) ) )
            {
            // InternalRigidBodies.g:907:1: (otherlv_0= 'lock' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' otherlv_5= 'rotation' ( (lv_rotation_6_0= ruleMatrix ) ) otherlv_7= 'translation' ( (lv_translation_8_0= ruleMatrix ) ) )
            // InternalRigidBodies.g:907:3: otherlv_0= 'lock' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' otherlv_5= 'rotation' ( (lv_rotation_6_0= ruleMatrix ) ) otherlv_7= 'translation' ( (lv_translation_8_0= ruleMatrix ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_10); 

                	newLeafNode(otherlv_0, grammarAccess.getLockJointStatementAccess().getLockKeyword_0());
                
            // InternalRigidBodies.g:911:1: ( (otherlv_1= RULE_ID ) )
            // InternalRigidBodies.g:912:1: (otherlv_1= RULE_ID )
            {
            // InternalRigidBodies.g:912:1: (otherlv_1= RULE_ID )
            // InternalRigidBodies.g:913:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLockJointStatementRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            		newLeafNode(otherlv_1, grammarAccess.getLockJointStatementAccess().getSystemSystemInstantiationCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_10); 

                	newLeafNode(otherlv_2, grammarAccess.getLockJointStatementAccess().getFullStopKeyword_2());
                
            // InternalRigidBodies.g:928:1: ( (otherlv_3= RULE_ID ) )
            // InternalRigidBodies.g:929:1: (otherlv_3= RULE_ID )
            {
            // InternalRigidBodies.g:929:1: (otherlv_3= RULE_ID )
            // InternalRigidBodies.g:930:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLockJointStatementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_21); 

            		newLeafNode(otherlv_3, grammarAccess.getLockJointStatementAccess().getJointJointCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_30); 

                	newLeafNode(otherlv_4, grammarAccess.getLockJointStatementAccess().getToKeyword_4());
                
            otherlv_5=(Token)match(input,33,FOLLOW_8); 

                	newLeafNode(otherlv_5, grammarAccess.getLockJointStatementAccess().getRotationKeyword_5());
                
            // InternalRigidBodies.g:949:1: ( (lv_rotation_6_0= ruleMatrix ) )
            // InternalRigidBodies.g:950:1: (lv_rotation_6_0= ruleMatrix )
            {
            // InternalRigidBodies.g:950:1: (lv_rotation_6_0= ruleMatrix )
            // InternalRigidBodies.g:951:3: lv_rotation_6_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getLockJointStatementAccess().getRotationMatrixParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_31);
            lv_rotation_6_0=ruleMatrix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLockJointStatementRule());
            	        }
                   		set(
                   			current, 
                   			"rotation",
                    		lv_rotation_6_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.Matrix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_8); 

                	newLeafNode(otherlv_7, grammarAccess.getLockJointStatementAccess().getTranslationKeyword_7());
                
            // InternalRigidBodies.g:971:1: ( (lv_translation_8_0= ruleMatrix ) )
            // InternalRigidBodies.g:972:1: (lv_translation_8_0= ruleMatrix )
            {
            // InternalRigidBodies.g:972:1: (lv_translation_8_0= ruleMatrix )
            // InternalRigidBodies.g:973:3: lv_translation_8_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getLockJointStatementAccess().getTranslationMatrixParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_translation_8_0=ruleMatrix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLockJointStatementRule());
            	        }
                   		set(
                   			current, 
                   			"translation",
                    		lv_translation_8_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.Matrix");
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
    // $ANTLR end "ruleLockJointStatement"


    // $ANTLR start "entryRuleLockDoFStatement"
    // InternalRigidBodies.g:997:1: entryRuleLockDoFStatement returns [EObject current=null] : iv_ruleLockDoFStatement= ruleLockDoFStatement EOF ;
    public final EObject entryRuleLockDoFStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLockDoFStatement = null;


        try {
            // InternalRigidBodies.g:998:2: (iv_ruleLockDoFStatement= ruleLockDoFStatement EOF )
            // InternalRigidBodies.g:999:2: iv_ruleLockDoFStatement= ruleLockDoFStatement EOF
            {
             newCompositeNode(grammarAccess.getLockDoFStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLockDoFStatement=ruleLockDoFStatement();

            state._fsp--;

             current =iv_ruleLockDoFStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLockDoFStatement"


    // $ANTLR start "ruleLockDoFStatement"
    // InternalRigidBodies.g:1006:1: ruleLockDoFStatement returns [EObject current=null] : (otherlv_0= 'lock' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_lockedType_5_0= ruleAdditiveLockedJointType ) ) ) ;
    public final EObject ruleLockDoFStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_lockedType_5_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:1009:28: ( (otherlv_0= 'lock' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_lockedType_5_0= ruleAdditiveLockedJointType ) ) ) )
            // InternalRigidBodies.g:1010:1: (otherlv_0= 'lock' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_lockedType_5_0= ruleAdditiveLockedJointType ) ) )
            {
            // InternalRigidBodies.g:1010:1: (otherlv_0= 'lock' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_lockedType_5_0= ruleAdditiveLockedJointType ) ) )
            // InternalRigidBodies.g:1010:3: otherlv_0= 'lock' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_lockedType_5_0= ruleAdditiveLockedJointType ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_10); 

                	newLeafNode(otherlv_0, grammarAccess.getLockDoFStatementAccess().getLockKeyword_0());
                
            // InternalRigidBodies.g:1014:1: ( (otherlv_1= RULE_ID ) )
            // InternalRigidBodies.g:1015:1: (otherlv_1= RULE_ID )
            {
            // InternalRigidBodies.g:1015:1: (otherlv_1= RULE_ID )
            // InternalRigidBodies.g:1016:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLockDoFStatementRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            		newLeafNode(otherlv_1, grammarAccess.getLockDoFStatementAccess().getSystemSystemInstantiationCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_10); 

                	newLeafNode(otherlv_2, grammarAccess.getLockDoFStatementAccess().getFullStopKeyword_2());
                
            // InternalRigidBodies.g:1031:1: ( (otherlv_3= RULE_ID ) )
            // InternalRigidBodies.g:1032:1: (otherlv_3= RULE_ID )
            {
            // InternalRigidBodies.g:1032:1: (otherlv_3= RULE_ID )
            // InternalRigidBodies.g:1033:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLockDoFStatementRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_21); 

            		newLeafNode(otherlv_3, grammarAccess.getLockDoFStatementAccess().getJointJointCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_32); 

                	newLeafNode(otherlv_4, grammarAccess.getLockDoFStatementAccess().getToKeyword_4());
                
            // InternalRigidBodies.g:1048:1: ( (lv_lockedType_5_0= ruleAdditiveLockedJointType ) )
            // InternalRigidBodies.g:1049:1: (lv_lockedType_5_0= ruleAdditiveLockedJointType )
            {
            // InternalRigidBodies.g:1049:1: (lv_lockedType_5_0= ruleAdditiveLockedJointType )
            // InternalRigidBodies.g:1050:3: lv_lockedType_5_0= ruleAdditiveLockedJointType
            {
             
            	        newCompositeNode(grammarAccess.getLockDoFStatementAccess().getLockedTypeAdditiveLockedJointTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_lockedType_5_0=ruleAdditiveLockedJointType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLockDoFStatementRule());
            	        }
                   		set(
                   			current, 
                   			"lockedType",
                    		lv_lockedType_5_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AdditiveLockedJointType");
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
    // $ANTLR end "ruleLockDoFStatement"


    // $ANTLR start "entryRuleAdditiveLockedJointType"
    // InternalRigidBodies.g:1074:1: entryRuleAdditiveLockedJointType returns [EObject current=null] : iv_ruleAdditiveLockedJointType= ruleAdditiveLockedJointType EOF ;
    public final EObject entryRuleAdditiveLockedJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveLockedJointType = null;


        try {
            // InternalRigidBodies.g:1075:2: (iv_ruleAdditiveLockedJointType= ruleAdditiveLockedJointType EOF )
            // InternalRigidBodies.g:1076:2: iv_ruleAdditiveLockedJointType= ruleAdditiveLockedJointType EOF
            {
             newCompositeNode(grammarAccess.getAdditiveLockedJointTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveLockedJointType=ruleAdditiveLockedJointType();

            state._fsp--;

             current =iv_ruleAdditiveLockedJointType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdditiveLockedJointType"


    // $ANTLR start "ruleAdditiveLockedJointType"
    // InternalRigidBodies.g:1083:1: ruleAdditiveLockedJointType returns [EObject current=null] : (this_PrimaryLockedJointType_0= rulePrimaryLockedJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryLockedJointType ) ) )* ) ;
    public final EObject ruleAdditiveLockedJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PrimaryLockedJointType_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:1086:28: ( (this_PrimaryLockedJointType_0= rulePrimaryLockedJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryLockedJointType ) ) )* ) )
            // InternalRigidBodies.g:1087:1: (this_PrimaryLockedJointType_0= rulePrimaryLockedJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryLockedJointType ) ) )* )
            {
            // InternalRigidBodies.g:1087:1: (this_PrimaryLockedJointType_0= rulePrimaryLockedJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryLockedJointType ) ) )* )
            // InternalRigidBodies.g:1088:5: this_PrimaryLockedJointType_0= rulePrimaryLockedJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryLockedJointType ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditiveLockedJointTypeAccess().getPrimaryLockedJointTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_33);
            this_PrimaryLockedJointType_0=rulePrimaryLockedJointType();

            state._fsp--;

             
                    current = this_PrimaryLockedJointType_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalRigidBodies.g:1096:1: (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryLockedJointType ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRigidBodies.g:1096:3: otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryLockedJointType ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_32); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAdditiveLockedJointTypeAccess().getPlusSignKeyword_1_0());
            	        
            	    // InternalRigidBodies.g:1100:1: ()
            	    // InternalRigidBodies.g:1101:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditiveLockedJointTypeAccess().getAdditiveLockedJointTypeLeftAction_1_1(),
            	                current);
            	        

            	    }

            	    // InternalRigidBodies.g:1106:2: ( (lv_right_3_0= rulePrimaryLockedJointType ) )
            	    // InternalRigidBodies.g:1107:1: (lv_right_3_0= rulePrimaryLockedJointType )
            	    {
            	    // InternalRigidBodies.g:1107:1: (lv_right_3_0= rulePrimaryLockedJointType )
            	    // InternalRigidBodies.g:1108:3: lv_right_3_0= rulePrimaryLockedJointType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveLockedJointTypeAccess().getRightPrimaryLockedJointTypeParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=rulePrimaryLockedJointType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveLockedJointTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"uk.ac.kcl.inf.robotics.RigidBodies.PrimaryLockedJointType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleAdditiveLockedJointType"


    // $ANTLR start "entryRulePrimaryLockedJointType"
    // InternalRigidBodies.g:1132:1: entryRulePrimaryLockedJointType returns [EObject current=null] : iv_rulePrimaryLockedJointType= rulePrimaryLockedJointType EOF ;
    public final EObject entryRulePrimaryLockedJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryLockedJointType = null;


        try {
            // InternalRigidBodies.g:1133:2: (iv_rulePrimaryLockedJointType= rulePrimaryLockedJointType EOF )
            // InternalRigidBodies.g:1134:2: iv_rulePrimaryLockedJointType= rulePrimaryLockedJointType EOF
            {
             newCompositeNode(grammarAccess.getPrimaryLockedJointTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryLockedJointType=rulePrimaryLockedJointType();

            state._fsp--;

             current =iv_rulePrimaryLockedJointType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimaryLockedJointType"


    // $ANTLR start "rulePrimaryLockedJointType"
    // InternalRigidBodies.g:1141:1: rulePrimaryLockedJointType returns [EObject current=null] : (this_KeepUnlockedJointType_0= ruleKeepUnlockedJointType | this_BasicLockedJointType_1= ruleBasicLockedJointType ) ;
    public final EObject rulePrimaryLockedJointType() throws RecognitionException {
        EObject current = null;

        EObject this_KeepUnlockedJointType_0 = null;

        EObject this_BasicLockedJointType_1 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:1144:28: ( (this_KeepUnlockedJointType_0= ruleKeepUnlockedJointType | this_BasicLockedJointType_1= ruleBasicLockedJointType ) )
            // InternalRigidBodies.g:1145:1: (this_KeepUnlockedJointType_0= ruleKeepUnlockedJointType | this_BasicLockedJointType_1= ruleBasicLockedJointType )
            {
            // InternalRigidBodies.g:1145:1: (this_KeepUnlockedJointType_0= ruleKeepUnlockedJointType | this_BasicLockedJointType_1= ruleBasicLockedJointType )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=38 && LA15_0<=39)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRigidBodies.g:1146:5: this_KeepUnlockedJointType_0= ruleKeepUnlockedJointType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryLockedJointTypeAccess().getKeepUnlockedJointTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_KeepUnlockedJointType_0=ruleKeepUnlockedJointType();

                    state._fsp--;

                     
                            current = this_KeepUnlockedJointType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:1156:5: this_BasicLockedJointType_1= ruleBasicLockedJointType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryLockedJointTypeAccess().getBasicLockedJointTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_BasicLockedJointType_1=ruleBasicLockedJointType();

                    state._fsp--;

                     
                            current = this_BasicLockedJointType_1; 
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
    // $ANTLR end "rulePrimaryLockedJointType"


    // $ANTLR start "entryRuleKeepUnlockedJointType"
    // InternalRigidBodies.g:1172:1: entryRuleKeepUnlockedJointType returns [EObject current=null] : iv_ruleKeepUnlockedJointType= ruleKeepUnlockedJointType EOF ;
    public final EObject entryRuleKeepUnlockedJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeepUnlockedJointType = null;


        try {
            // InternalRigidBodies.g:1173:2: (iv_ruleKeepUnlockedJointType= ruleKeepUnlockedJointType EOF )
            // InternalRigidBodies.g:1174:2: iv_ruleKeepUnlockedJointType= ruleKeepUnlockedJointType EOF
            {
             newCompositeNode(grammarAccess.getKeepUnlockedJointTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeepUnlockedJointType=ruleKeepUnlockedJointType();

            state._fsp--;

             current =iv_ruleKeepUnlockedJointType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKeepUnlockedJointType"


    // $ANTLR start "ruleKeepUnlockedJointType"
    // InternalRigidBodies.g:1181:1: ruleKeepUnlockedJointType returns [EObject current=null] : (otherlv_0= 'keep' otherlv_1= 'flexible' () ) ;
    public final EObject ruleKeepUnlockedJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalRigidBodies.g:1184:28: ( (otherlv_0= 'keep' otherlv_1= 'flexible' () ) )
            // InternalRigidBodies.g:1185:1: (otherlv_0= 'keep' otherlv_1= 'flexible' () )
            {
            // InternalRigidBodies.g:1185:1: (otherlv_0= 'keep' otherlv_1= 'flexible' () )
            // InternalRigidBodies.g:1185:3: otherlv_0= 'keep' otherlv_1= 'flexible' ()
            {
            otherlv_0=(Token)match(input,36,FOLLOW_34); 

                	newLeafNode(otherlv_0, grammarAccess.getKeepUnlockedJointTypeAccess().getKeepKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getKeepUnlockedJointTypeAccess().getFlexibleKeyword_1());
                
            // InternalRigidBodies.g:1193:1: ()
            // InternalRigidBodies.g:1194:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKeepUnlockedJointTypeAccess().getKeepUnlockedJointTypeAction_2(),
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
    // $ANTLR end "ruleKeepUnlockedJointType"


    // $ANTLR start "entryRuleBasicLockedJointType"
    // InternalRigidBodies.g:1207:1: entryRuleBasicLockedJointType returns [EObject current=null] : iv_ruleBasicLockedJointType= ruleBasicLockedJointType EOF ;
    public final EObject entryRuleBasicLockedJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicLockedJointType = null;


        try {
            // InternalRigidBodies.g:1208:2: (iv_ruleBasicLockedJointType= ruleBasicLockedJointType EOF )
            // InternalRigidBodies.g:1209:2: iv_ruleBasicLockedJointType= ruleBasicLockedJointType EOF
            {
             newCompositeNode(grammarAccess.getBasicLockedJointTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicLockedJointType=ruleBasicLockedJointType();

            state._fsp--;

             current =iv_ruleBasicLockedJointType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBasicLockedJointType"


    // $ANTLR start "ruleBasicLockedJointType"
    // InternalRigidBodies.g:1216:1: ruleBasicLockedJointType returns [EObject current=null] : ( (lv_type_0_0= ruleLockedJointMovement ) ) ;
    public final EObject ruleBasicLockedJointType() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:1219:28: ( ( (lv_type_0_0= ruleLockedJointMovement ) ) )
            // InternalRigidBodies.g:1220:1: ( (lv_type_0_0= ruleLockedJointMovement ) )
            {
            // InternalRigidBodies.g:1220:1: ( (lv_type_0_0= ruleLockedJointMovement ) )
            // InternalRigidBodies.g:1221:1: (lv_type_0_0= ruleLockedJointMovement )
            {
            // InternalRigidBodies.g:1221:1: (lv_type_0_0= ruleLockedJointMovement )
            // InternalRigidBodies.g:1222:3: lv_type_0_0= ruleLockedJointMovement
            {
             
            	        newCompositeNode(grammarAccess.getBasicLockedJointTypeAccess().getTypeLockedJointMovementParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleLockedJointMovement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBasicLockedJointTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.LockedJointMovement");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleBasicLockedJointType"


    // $ANTLR start "entryRuleLockedJointMovement"
    // InternalRigidBodies.g:1246:1: entryRuleLockedJointMovement returns [EObject current=null] : iv_ruleLockedJointMovement= ruleLockedJointMovement EOF ;
    public final EObject entryRuleLockedJointMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLockedJointMovement = null;


        try {
            // InternalRigidBodies.g:1247:2: (iv_ruleLockedJointMovement= ruleLockedJointMovement EOF )
            // InternalRigidBodies.g:1248:2: iv_ruleLockedJointMovement= ruleLockedJointMovement EOF
            {
             newCompositeNode(grammarAccess.getLockedJointMovementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLockedJointMovement=ruleLockedJointMovement();

            state._fsp--;

             current =iv_ruleLockedJointMovement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLockedJointMovement"


    // $ANTLR start "ruleLockedJointMovement"
    // InternalRigidBodies.g:1255:1: ruleLockedJointMovement returns [EObject current=null] : (this_LockedRevolute_0= ruleLockedRevolute | this_LockedPlanar_1= ruleLockedPlanar ) ;
    public final EObject ruleLockedJointMovement() throws RecognitionException {
        EObject current = null;

        EObject this_LockedRevolute_0 = null;

        EObject this_LockedPlanar_1 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:1258:28: ( (this_LockedRevolute_0= ruleLockedRevolute | this_LockedPlanar_1= ruleLockedPlanar ) )
            // InternalRigidBodies.g:1259:1: (this_LockedRevolute_0= ruleLockedRevolute | this_LockedPlanar_1= ruleLockedPlanar )
            {
            // InternalRigidBodies.g:1259:1: (this_LockedRevolute_0= ruleLockedRevolute | this_LockedPlanar_1= ruleLockedPlanar )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            else if ( (LA16_0==39) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRigidBodies.g:1260:5: this_LockedRevolute_0= ruleLockedRevolute
                    {
                     
                            newCompositeNode(grammarAccess.getLockedJointMovementAccess().getLockedRevoluteParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LockedRevolute_0=ruleLockedRevolute();

                    state._fsp--;

                     
                            current = this_LockedRevolute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:1270:5: this_LockedPlanar_1= ruleLockedPlanar
                    {
                     
                            newCompositeNode(grammarAccess.getLockedJointMovementAccess().getLockedPlanarParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LockedPlanar_1=ruleLockedPlanar();

                    state._fsp--;

                     
                            current = this_LockedPlanar_1; 
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
    // $ANTLR end "ruleLockedJointMovement"


    // $ANTLR start "entryRuleLockedRevolute"
    // InternalRigidBodies.g:1286:1: entryRuleLockedRevolute returns [EObject current=null] : iv_ruleLockedRevolute= ruleLockedRevolute EOF ;
    public final EObject entryRuleLockedRevolute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLockedRevolute = null;


        try {
            // InternalRigidBodies.g:1287:2: (iv_ruleLockedRevolute= ruleLockedRevolute EOF )
            // InternalRigidBodies.g:1288:2: iv_ruleLockedRevolute= ruleLockedRevolute EOF
            {
             newCompositeNode(grammarAccess.getLockedRevoluteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLockedRevolute=ruleLockedRevolute();

            state._fsp--;

             current =iv_ruleLockedRevolute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLockedRevolute"


    // $ANTLR start "ruleLockedRevolute"
    // InternalRigidBodies.g:1295:1: ruleLockedRevolute returns [EObject current=null] : (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleAddExp ) ) ) ;
    public final EObject ruleLockedRevolute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_axis_1_0 = null;

        EObject lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:1298:28: ( (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleAddExp ) ) ) )
            // InternalRigidBodies.g:1299:1: (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleAddExp ) ) )
            {
            // InternalRigidBodies.g:1299:1: (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleAddExp ) ) )
            // InternalRigidBodies.g:1299:3: otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleAddExp ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_35); 

                	newLeafNode(otherlv_0, grammarAccess.getLockedRevoluteAccess().getRevoluteKeyword_0());
                
            // InternalRigidBodies.g:1303:1: ( (lv_axis_1_0= ruleAXIS ) )
            // InternalRigidBodies.g:1304:1: (lv_axis_1_0= ruleAXIS )
            {
            // InternalRigidBodies.g:1304:1: (lv_axis_1_0= ruleAXIS )
            // InternalRigidBodies.g:1305:3: lv_axis_1_0= ruleAXIS
            {
             
            	        newCompositeNode(grammarAccess.getLockedRevoluteAccess().getAxisAXISEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_26);
            lv_axis_1_0=ruleAXIS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLockedRevoluteRule());
            	        }
                   		set(
                   			current, 
                   			"axis",
                    		lv_axis_1_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AXIS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_22); 

                	newLeafNode(otherlv_2, grammarAccess.getLockedRevoluteAccess().getEqualsSignKeyword_2());
                
            // InternalRigidBodies.g:1325:1: ( (lv_exp_3_0= ruleAddExp ) )
            // InternalRigidBodies.g:1326:1: (lv_exp_3_0= ruleAddExp )
            {
            // InternalRigidBodies.g:1326:1: (lv_exp_3_0= ruleAddExp )
            // InternalRigidBodies.g:1327:3: lv_exp_3_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getLockedRevoluteAccess().getExpAddExpParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLockedRevoluteRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_3_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
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
    // $ANTLR end "ruleLockedRevolute"


    // $ANTLR start "entryRuleLockedPlanar"
    // InternalRigidBodies.g:1351:1: entryRuleLockedPlanar returns [EObject current=null] : iv_ruleLockedPlanar= ruleLockedPlanar EOF ;
    public final EObject entryRuleLockedPlanar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLockedPlanar = null;


        try {
            // InternalRigidBodies.g:1352:2: (iv_ruleLockedPlanar= ruleLockedPlanar EOF )
            // InternalRigidBodies.g:1353:2: iv_ruleLockedPlanar= ruleLockedPlanar EOF
            {
             newCompositeNode(grammarAccess.getLockedPlanarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLockedPlanar=ruleLockedPlanar();

            state._fsp--;

             current =iv_ruleLockedPlanar; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLockedPlanar"


    // $ANTLR start "ruleLockedPlanar"
    // InternalRigidBodies.g:1360:1: ruleLockedPlanar returns [EObject current=null] : (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleAddExp ) ) ) ;
    public final EObject ruleLockedPlanar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_axis_1_0 = null;

        EObject lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:1363:28: ( (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleAddExp ) ) ) )
            // InternalRigidBodies.g:1364:1: (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleAddExp ) ) )
            {
            // InternalRigidBodies.g:1364:1: (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleAddExp ) ) )
            // InternalRigidBodies.g:1364:3: otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleAddExp ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_35); 

                	newLeafNode(otherlv_0, grammarAccess.getLockedPlanarAccess().getPlanarKeyword_0());
                
            // InternalRigidBodies.g:1368:1: ( (lv_axis_1_0= ruleAXIS ) )
            // InternalRigidBodies.g:1369:1: (lv_axis_1_0= ruleAXIS )
            {
            // InternalRigidBodies.g:1369:1: (lv_axis_1_0= ruleAXIS )
            // InternalRigidBodies.g:1370:3: lv_axis_1_0= ruleAXIS
            {
             
            	        newCompositeNode(grammarAccess.getLockedPlanarAccess().getAxisAXISEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_26);
            lv_axis_1_0=ruleAXIS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLockedPlanarRule());
            	        }
                   		set(
                   			current, 
                   			"axis",
                    		lv_axis_1_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AXIS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_22); 

                	newLeafNode(otherlv_2, grammarAccess.getLockedPlanarAccess().getEqualsSignKeyword_2());
                
            // InternalRigidBodies.g:1390:1: ( (lv_exp_3_0= ruleAddExp ) )
            // InternalRigidBodies.g:1391:1: (lv_exp_3_0= ruleAddExp )
            {
            // InternalRigidBodies.g:1391:1: (lv_exp_3_0= ruleAddExp )
            // InternalRigidBodies.g:1392:3: lv_exp_3_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getLockedPlanarAccess().getExpAddExpParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLockedPlanarRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_3_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
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
    // $ANTLR end "ruleLockedPlanar"


    // $ANTLR start "entryRuleSystemElement"
    // InternalRigidBodies.g:1416:1: entryRuleSystemElement returns [EObject current=null] : iv_ruleSystemElement= ruleSystemElement EOF ;
    public final EObject entryRuleSystemElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemElement = null;


        try {
            // InternalRigidBodies.g:1417:2: (iv_ruleSystemElement= ruleSystemElement EOF )
            // InternalRigidBodies.g:1418:2: iv_ruleSystemElement= ruleSystemElement EOF
            {
             newCompositeNode(grammarAccess.getSystemElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemElement=ruleSystemElement();

            state._fsp--;

             current =iv_ruleSystemElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:1425:1: ruleSystemElement returns [EObject current=null] : (this_Body_0= ruleBody | this_Connective_1= ruleConnective | this_BodyRepetition_2= ruleBodyRepetition | this_JointConstraint_3= ruleJointConstraint ) ;
    public final EObject ruleSystemElement() throws RecognitionException {
        EObject current = null;

        EObject this_Body_0 = null;

        EObject this_Connective_1 = null;

        EObject this_BodyRepetition_2 = null;

        EObject this_JointConstraint_3 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:1428:28: ( (this_Body_0= ruleBody | this_Connective_1= ruleConnective | this_BodyRepetition_2= ruleBodyRepetition | this_JointConstraint_3= ruleJointConstraint ) )
            // InternalRigidBodies.g:1429:1: (this_Body_0= ruleBody | this_Connective_1= ruleConnective | this_BodyRepetition_2= ruleBodyRepetition | this_JointConstraint_3= ruleJointConstraint )
            {
            // InternalRigidBodies.g:1429:1: (this_Body_0= ruleBody | this_Connective_1= ruleConnective | this_BodyRepetition_2= ruleBodyRepetition | this_JointConstraint_3= ruleJointConstraint )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt17=1;
                }
                break;
            case 52:
            case 71:
                {
                alt17=2;
                }
                break;
            case 68:
                {
                int LA17_3 = input.LA(2);

                if ( (LA17_3==RULE_ID) ) {
                    int LA17_5 = input.LA(3);

                    if ( (LA17_5==53) ) {
                        int LA17_6 = input.LA(4);

                        if ( ((LA17_6>=81 && LA17_6<=82)) ) {
                            alt17=2;
                        }
                        else if ( (LA17_6==RULE_ID) ) {
                            alt17=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalRigidBodies.g:1430:5: this_Body_0= ruleBody
                    {
                     
                            newCompositeNode(grammarAccess.getSystemElementAccess().getBodyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Body_0=ruleBody();

                    state._fsp--;

                     
                            current = this_Body_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:1440:5: this_Connective_1= ruleConnective
                    {
                     
                            newCompositeNode(grammarAccess.getSystemElementAccess().getConnectiveParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Connective_1=ruleConnective();

                    state._fsp--;

                     
                            current = this_Connective_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalRigidBodies.g:1450:5: this_BodyRepetition_2= ruleBodyRepetition
                    {
                     
                            newCompositeNode(grammarAccess.getSystemElementAccess().getBodyRepetitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_BodyRepetition_2=ruleBodyRepetition();

                    state._fsp--;

                     
                            current = this_BodyRepetition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalRigidBodies.g:1460:5: this_JointConstraint_3= ruleJointConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getSystemElementAccess().getJointConstraintParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_JointConstraint_3=ruleJointConstraint();

                    state._fsp--;

                     
                            current = this_JointConstraint_3; 
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
    // InternalRigidBodies.g:1476:1: entryRuleConnective returns [EObject current=null] : iv_ruleConnective= ruleConnective EOF ;
    public final EObject entryRuleConnective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnective = null;


        try {
            // InternalRigidBodies.g:1477:2: (iv_ruleConnective= ruleConnective EOF )
            // InternalRigidBodies.g:1478:2: iv_ruleConnective= ruleConnective EOF
            {
             newCompositeNode(grammarAccess.getConnectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnective=ruleConnective();

            state._fsp--;

             current =iv_ruleConnective; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:1485:1: ruleConnective returns [EObject current=null] : (this_Joint_0= ruleJoint | this_Constraint_1= ruleConstraint | this_ExternalLoad_2= ruleExternalLoad ) ;
    public final EObject ruleConnective() throws RecognitionException {
        EObject current = null;

        EObject this_Joint_0 = null;

        EObject this_Constraint_1 = null;

        EObject this_ExternalLoad_2 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:1488:28: ( (this_Joint_0= ruleJoint | this_Constraint_1= ruleConstraint | this_ExternalLoad_2= ruleExternalLoad ) )
            // InternalRigidBodies.g:1489:1: (this_Joint_0= ruleJoint | this_Constraint_1= ruleConstraint | this_ExternalLoad_2= ruleExternalLoad )
            {
            // InternalRigidBodies.g:1489:1: (this_Joint_0= ruleJoint | this_Constraint_1= ruleConstraint | this_ExternalLoad_2= ruleExternalLoad )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt18=1;
                }
                break;
            case 68:
                {
                alt18=2;
                }
                break;
            case 71:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalRigidBodies.g:1490:5: this_Joint_0= ruleJoint
                    {
                     
                            newCompositeNode(grammarAccess.getConnectiveAccess().getJointParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Joint_0=ruleJoint();

                    state._fsp--;

                     
                            current = this_Joint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:1500:5: this_Constraint_1= ruleConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConnectiveAccess().getConstraintParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;

                     
                            current = this_Constraint_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalRigidBodies.g:1510:5: this_ExternalLoad_2= ruleExternalLoad
                    {
                     
                            newCompositeNode(grammarAccess.getConnectiveAccess().getExternalLoadParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalRigidBodies.g:1526:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalRigidBodies.g:1527:2: (iv_ruleBody= ruleBody EOF )
            // InternalRigidBodies.g:1528:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:1535:1: ruleBody returns [EObject current=null] : (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mass_3_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:1538:28: ( (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' ) )
            // InternalRigidBodies.g:1539:1: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' )
            {
            // InternalRigidBodies.g:1539:1: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' )
            // InternalRigidBodies.g:1539:3: otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_10); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getBodyKeyword_0());
                
            // InternalRigidBodies.g:1543:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalRigidBodies.g:1544:1: (lv_name_1_0= RULE_ID )
            {
            // InternalRigidBodies.g:1544:1: (lv_name_1_0= RULE_ID )
            // InternalRigidBodies.g:1545:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBodyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_36); 

                	newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalRigidBodies.g:1565:1: ( (lv_mass_3_0= ruleMass ) )
            // InternalRigidBodies.g:1566:1: (lv_mass_3_0= ruleMass )
            {
            // InternalRigidBodies.g:1566:1: (lv_mass_3_0= ruleMass )
            // InternalRigidBodies.g:1567:3: lv_mass_3_0= ruleMass
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getMassMassParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_9);
            lv_mass_3_0=ruleMass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		set(
                   			current, 
                   			"mass",
                    		lv_mass_3_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.Mass");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRigidBodies.g:1595:1: entryRuleBodyReference returns [EObject current=null] : iv_ruleBodyReference= ruleBodyReference EOF ;
    public final EObject entryRuleBodyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyReference = null;


        try {
            // InternalRigidBodies.g:1596:2: (iv_ruleBodyReference= ruleBodyReference EOF )
            // InternalRigidBodies.g:1597:2: iv_ruleBodyReference= ruleBodyReference EOF
            {
             newCompositeNode(grammarAccess.getBodyReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyReference=ruleBodyReference();

            state._fsp--;

             current =iv_ruleBodyReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:1604:1: ruleBodyReference returns [EObject current=null] : ( ( (lv_base_0_0= 'base' ) ) | ( (lv_new_1_0= 'new' ) ) | ( ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )? ) | ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_idx_6_0= RULE_INT ) ) otherlv_7= ']' )? ) ) ;
    public final EObject ruleBodyReference() throws RecognitionException {
        EObject current = null;

        Token lv_base_0_0=null;
        Token lv_new_1_0=null;
        Token lv_last_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_idx_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // InternalRigidBodies.g:1607:28: ( ( ( (lv_base_0_0= 'base' ) ) | ( (lv_new_1_0= 'new' ) ) | ( ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )? ) | ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_idx_6_0= RULE_INT ) ) otherlv_7= ']' )? ) ) )
            // InternalRigidBodies.g:1608:1: ( ( (lv_base_0_0= 'base' ) ) | ( (lv_new_1_0= 'new' ) ) | ( ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )? ) | ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_idx_6_0= RULE_INT ) ) otherlv_7= ']' )? ) )
            {
            // InternalRigidBodies.g:1608:1: ( ( (lv_base_0_0= 'base' ) ) | ( (lv_new_1_0= 'new' ) ) | ( ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )? ) | ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_idx_6_0= RULE_INT ) ) otherlv_7= ']' )? ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt21=1;
                }
                break;
            case 42:
                {
                alt21=2;
                }
                break;
            case 43:
                {
                alt21=3;
                }
                break;
            case RULE_ID:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalRigidBodies.g:1608:2: ( (lv_base_0_0= 'base' ) )
                    {
                    // InternalRigidBodies.g:1608:2: ( (lv_base_0_0= 'base' ) )
                    // InternalRigidBodies.g:1609:1: (lv_base_0_0= 'base' )
                    {
                    // InternalRigidBodies.g:1609:1: (lv_base_0_0= 'base' )
                    // InternalRigidBodies.g:1610:3: lv_base_0_0= 'base'
                    {
                    lv_base_0_0=(Token)match(input,41,FOLLOW_2); 

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
                    // InternalRigidBodies.g:1624:6: ( (lv_new_1_0= 'new' ) )
                    {
                    // InternalRigidBodies.g:1624:6: ( (lv_new_1_0= 'new' ) )
                    // InternalRigidBodies.g:1625:1: (lv_new_1_0= 'new' )
                    {
                    // InternalRigidBodies.g:1625:1: (lv_new_1_0= 'new' )
                    // InternalRigidBodies.g:1626:3: lv_new_1_0= 'new'
                    {
                    lv_new_1_0=(Token)match(input,42,FOLLOW_2); 

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
                    // InternalRigidBodies.g:1640:6: ( ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )? )
                    {
                    // InternalRigidBodies.g:1640:6: ( ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )? )
                    // InternalRigidBodies.g:1640:7: ( (lv_last_2_0= 'last' ) ) ( (otherlv_3= RULE_ID ) )?
                    {
                    // InternalRigidBodies.g:1640:7: ( (lv_last_2_0= 'last' ) )
                    // InternalRigidBodies.g:1641:1: (lv_last_2_0= 'last' )
                    {
                    // InternalRigidBodies.g:1641:1: (lv_last_2_0= 'last' )
                    // InternalRigidBodies.g:1642:3: lv_last_2_0= 'last'
                    {
                    lv_last_2_0=(Token)match(input,43,FOLLOW_37); 

                            newLeafNode(lv_last_2_0, grammarAccess.getBodyReferenceAccess().getLastLastKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBodyReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "last", true, "last");
                    	    

                    }


                    }

                    // InternalRigidBodies.g:1655:2: ( (otherlv_3= RULE_ID ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalRigidBodies.g:1656:1: (otherlv_3= RULE_ID )
                            {
                            // InternalRigidBodies.g:1656:1: (otherlv_3= RULE_ID )
                            // InternalRigidBodies.g:1657:3: otherlv_3= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getBodyReferenceRule());
                            	        }
                                    
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                            		newLeafNode(otherlv_3, grammarAccess.getBodyReferenceAccess().getRefBodyCrossReference_2_1_0()); 
                            	

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRigidBodies.g:1669:6: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_idx_6_0= RULE_INT ) ) otherlv_7= ']' )? )
                    {
                    // InternalRigidBodies.g:1669:6: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_idx_6_0= RULE_INT ) ) otherlv_7= ']' )? )
                    // InternalRigidBodies.g:1669:7: ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_idx_6_0= RULE_INT ) ) otherlv_7= ']' )?
                    {
                    // InternalRigidBodies.g:1669:7: ( (otherlv_4= RULE_ID ) )
                    // InternalRigidBodies.g:1670:1: (otherlv_4= RULE_ID )
                    {
                    // InternalRigidBodies.g:1670:1: (otherlv_4= RULE_ID )
                    // InternalRigidBodies.g:1671:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBodyReferenceRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_38); 

                    		newLeafNode(otherlv_4, grammarAccess.getBodyReferenceAccess().getRefBodyCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // InternalRigidBodies.g:1682:2: (otherlv_5= '[' ( (lv_idx_6_0= RULE_INT ) ) otherlv_7= ']' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==44) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalRigidBodies.g:1682:4: otherlv_5= '[' ( (lv_idx_6_0= RULE_INT ) ) otherlv_7= ']'
                            {
                            otherlv_5=(Token)match(input,44,FOLLOW_39); 

                                	newLeafNode(otherlv_5, grammarAccess.getBodyReferenceAccess().getLeftSquareBracketKeyword_3_1_0());
                                
                            // InternalRigidBodies.g:1686:1: ( (lv_idx_6_0= RULE_INT ) )
                            // InternalRigidBodies.g:1687:1: (lv_idx_6_0= RULE_INT )
                            {
                            // InternalRigidBodies.g:1687:1: (lv_idx_6_0= RULE_INT )
                            // InternalRigidBodies.g:1688:3: lv_idx_6_0= RULE_INT
                            {
                            lv_idx_6_0=(Token)match(input,RULE_INT,FOLLOW_40); 

                            			newLeafNode(lv_idx_6_0, grammarAccess.getBodyReferenceAccess().getIdxINTTerminalRuleCall_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBodyReferenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"idx",
                                    		lv_idx_6_0, 
                                    		"org.eclipse.xtext.common.Terminals.INT");
                            	    

                            }


                            }

                            otherlv_7=(Token)match(input,45,FOLLOW_2); 

                                	newLeafNode(otherlv_7, grammarAccess.getBodyReferenceAccess().getRightSquareBracketKeyword_3_1_2());
                                

                            }
                            break;

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
    // InternalRigidBodies.g:1716:1: entryRuleBodyRepetition returns [EObject current=null] : iv_ruleBodyRepetition= ruleBodyRepetition EOF ;
    public final EObject entryRuleBodyRepetition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyRepetition = null;


        try {
            // InternalRigidBodies.g:1717:2: (iv_ruleBodyRepetition= ruleBodyRepetition EOF )
            // InternalRigidBodies.g:1718:2: iv_ruleBodyRepetition= ruleBodyRepetition EOF
            {
             newCompositeNode(grammarAccess.getBodyRepetitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyRepetition=ruleBodyRepetition();

            state._fsp--;

             current =iv_ruleBodyRepetition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:1725:1: ruleBodyRepetition returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_connectionExp_5_1= ruleConnective | lv_connectionExp_5_2= ruleJointConstraint ) ) )+ otherlv_6= '}' ) ;
    public final EObject ruleBodyRepetition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_connectionExp_5_1 = null;

        EObject lv_connectionExp_5_2 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:1728:28: ( (otherlv_0= 'repeat' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_connectionExp_5_1= ruleConnective | lv_connectionExp_5_2= ruleJointConstraint ) ) )+ otherlv_6= '}' ) )
            // InternalRigidBodies.g:1729:1: (otherlv_0= 'repeat' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_connectionExp_5_1= ruleConnective | lv_connectionExp_5_2= ruleJointConstraint ) ) )+ otherlv_6= '}' )
            {
            // InternalRigidBodies.g:1729:1: (otherlv_0= 'repeat' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_connectionExp_5_1= ruleConnective | lv_connectionExp_5_2= ruleJointConstraint ) ) )+ otherlv_6= '}' )
            // InternalRigidBodies.g:1729:3: otherlv_0= 'repeat' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_connectionExp_5_1= ruleConnective | lv_connectionExp_5_2= ruleJointConstraint ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_39); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyRepetitionAccess().getRepeatKeyword_0());
                
            // InternalRigidBodies.g:1733:1: ( (lv_number_1_0= RULE_INT ) )
            // InternalRigidBodies.g:1734:1: (lv_number_1_0= RULE_INT )
            {
            // InternalRigidBodies.g:1734:1: (lv_number_1_0= RULE_INT )
            // InternalRigidBodies.g:1735:3: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_41); 

            			newLeafNode(lv_number_1_0, grammarAccess.getBodyRepetitionAccess().getNumberINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBodyRepetitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"number",
                    		lv_number_1_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_10); 

                	newLeafNode(otherlv_2, grammarAccess.getBodyRepetitionAccess().getOfKeyword_2());
                
            // InternalRigidBodies.g:1755:1: ( (otherlv_3= RULE_ID ) )
            // InternalRigidBodies.g:1756:1: (otherlv_3= RULE_ID )
            {
            // InternalRigidBodies.g:1756:1: (otherlv_3= RULE_ID )
            // InternalRigidBodies.g:1757:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBodyRepetitionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            		newLeafNode(otherlv_3, grammarAccess.getBodyRepetitionAccess().getBodyBodyCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_11); 

                	newLeafNode(otherlv_4, grammarAccess.getBodyRepetitionAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalRigidBodies.g:1772:1: ( ( (lv_connectionExp_5_1= ruleConnective | lv_connectionExp_5_2= ruleJointConstraint ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==52||LA23_0==68||LA23_0==71) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRigidBodies.g:1773:1: ( (lv_connectionExp_5_1= ruleConnective | lv_connectionExp_5_2= ruleJointConstraint ) )
            	    {
            	    // InternalRigidBodies.g:1773:1: ( (lv_connectionExp_5_1= ruleConnective | lv_connectionExp_5_2= ruleJointConstraint ) )
            	    // InternalRigidBodies.g:1774:1: (lv_connectionExp_5_1= ruleConnective | lv_connectionExp_5_2= ruleJointConstraint )
            	    {
            	    // InternalRigidBodies.g:1774:1: (lv_connectionExp_5_1= ruleConnective | lv_connectionExp_5_2= ruleJointConstraint )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==52||LA22_0==71) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==68) ) {
            	        int LA22_2 = input.LA(2);

            	        if ( (LA22_2==RULE_ID) ) {
            	            int LA22_3 = input.LA(3);

            	            if ( (LA22_3==53) ) {
            	                int LA22_4 = input.LA(4);

            	                if ( (LA22_4==RULE_ID) ) {
            	                    alt22=2;
            	                }
            	                else if ( ((LA22_4>=81 && LA22_4<=82)) ) {
            	                    alt22=1;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 22, 4, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 22, 3, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 22, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalRigidBodies.g:1775:3: lv_connectionExp_5_1= ruleConnective
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBodyRepetitionAccess().getConnectionExpConnectiveParserRuleCall_5_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_12);
            	            lv_connectionExp_5_1=ruleConnective();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBodyRepetitionRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"connectionExp",
            	                    		lv_connectionExp_5_1, 
            	                    		"uk.ac.kcl.inf.robotics.RigidBodies.Connective");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // InternalRigidBodies.g:1790:8: lv_connectionExp_5_2= ruleJointConstraint
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBodyRepetitionAccess().getConnectionExpJointConstraintParserRuleCall_5_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_12);
            	            lv_connectionExp_5_2=ruleJointConstraint();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBodyRepetitionRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"connectionExp",
            	                    		lv_connectionExp_5_2, 
            	                    		"uk.ac.kcl.inf.robotics.RigidBodies.JointConstraint");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRigidBodies.g:1820:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalRigidBodies.g:1821:2: (iv_ruleMass= ruleMass EOF )
            // InternalRigidBodies.g:1822:2: iv_ruleMass= ruleMass EOF
            {
             newCompositeNode(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMass=ruleMass();

            state._fsp--;

             current =iv_ruleMass; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:1829:1: ruleMass returns [EObject current=null] : (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' ) ;
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
            // InternalRigidBodies.g:1832:28: ( (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' ) )
            // InternalRigidBodies.g:1833:1: (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' )
            {
            // InternalRigidBodies.g:1833:1: (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' )
            // InternalRigidBodies.g:1833:3: otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getMassAccess().getMassKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_42); 

                	newLeafNode(otherlv_1, grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,49,FOLLOW_22); 

                	newLeafNode(otherlv_2, grammarAccess.getMassAccess().getValueKeyword_2());
                
            // InternalRigidBodies.g:1845:1: ( (lv_value_3_0= ruleAddExp ) )
            // InternalRigidBodies.g:1846:1: (lv_value_3_0= ruleAddExp )
            {
            // InternalRigidBodies.g:1846:1: (lv_value_3_0= ruleAddExp )
            // InternalRigidBodies.g:1847:3: lv_value_3_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getValueAddExpParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_43);
            lv_value_3_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMassRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_8); 

                	newLeafNode(otherlv_4, grammarAccess.getMassAccess().getPositionKeyword_4());
                
            // InternalRigidBodies.g:1867:1: ( (lv_position_5_0= ruleMatrix ) )
            // InternalRigidBodies.g:1868:1: (lv_position_5_0= ruleMatrix )
            {
            // InternalRigidBodies.g:1868:1: (lv_position_5_0= ruleMatrix )
            // InternalRigidBodies.g:1869:3: lv_position_5_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getPositionMatrixParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_44);
            lv_position_5_0=ruleMatrix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMassRule());
            	        }
                   		set(
                   			current, 
                   			"position",
                    		lv_position_5_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.Matrix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,51,FOLLOW_8); 

                	newLeafNode(otherlv_6, grammarAccess.getMassAccess().getInertiaKeyword_6());
                
            // InternalRigidBodies.g:1889:1: ( (lv_inertia_7_0= ruleMatrix ) )
            // InternalRigidBodies.g:1890:1: (lv_inertia_7_0= ruleMatrix )
            {
            // InternalRigidBodies.g:1890:1: (lv_inertia_7_0= ruleMatrix )
            // InternalRigidBodies.g:1891:3: lv_inertia_7_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getInertiaMatrixParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_9);
            lv_inertia_7_0=ruleMatrix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMassRule());
            	        }
                   		set(
                   			current, 
                   			"inertia",
                    		lv_inertia_7_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.Matrix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRigidBodies.g:1919:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalRigidBodies.g:1920:2: (iv_ruleJoint= ruleJoint EOF )
            // InternalRigidBodies.g:1921:2: iv_ruleJoint= ruleJoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoint=ruleJoint();

            state._fsp--;

             current =iv_ruleJoint; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:1928:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) ) ) ;
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
            // InternalRigidBodies.g:1931:28: ( (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) ) ) )
            // InternalRigidBodies.g:1932:1: (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) ) )
            {
            // InternalRigidBodies.g:1932:1: (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) ) )
            // InternalRigidBodies.g:1932:3: otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (lv_body1_6_0= ruleBodyReference ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (lv_body2_9_0= ruleBodyReference ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_10); 

                	newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
                
            // InternalRigidBodies.g:1936:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalRigidBodies.g:1937:1: (lv_name_1_0= RULE_ID )
            {
            // InternalRigidBodies.g:1937:1: (lv_name_1_0= RULE_ID )
            // InternalRigidBodies.g:1938:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            			newLeafNode(lv_name_1_0, grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_46); 

                	newLeafNode(otherlv_2, grammarAccess.getJointAccess().getColonKeyword_2());
                
            // InternalRigidBodies.g:1958:1: ( (lv_type_3_0= ruleJointType ) )
            // InternalRigidBodies.g:1959:1: (lv_type_3_0= ruleJointType )
            {
            // InternalRigidBodies.g:1959:1: (lv_type_3_0= ruleJointType )
            // InternalRigidBodies.g:1960:3: lv_type_3_0= ruleJointType
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_47);
            lv_type_3_0=ruleJointType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.JointType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRigidBodies.g:1976:2: ( (lv_isStart_4_0= 'start' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRigidBodies.g:1977:1: (lv_isStart_4_0= 'start' )
                    {
                    // InternalRigidBodies.g:1977:1: (lv_isStart_4_0= 'start' )
                    // InternalRigidBodies.g:1978:3: lv_isStart_4_0= 'start'
                    {
                    lv_isStart_4_0=(Token)match(input,54,FOLLOW_48); 

                            newLeafNode(lv_isStart_4_0, grammarAccess.getJointAccess().getIsStartStartKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJointRule());
                    	        }
                           		setWithLastConsumed(current, "isStart", true, "start");
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,55,FOLLOW_19); 

                	newLeafNode(otherlv_5, grammarAccess.getJointAccess().getBetweenKeyword_5());
                
            // InternalRigidBodies.g:1995:1: ( (lv_body1_6_0= ruleBodyReference ) )
            // InternalRigidBodies.g:1996:1: (lv_body1_6_0= ruleBodyReference )
            {
            // InternalRigidBodies.g:1996:1: (lv_body1_6_0= ruleBodyReference )
            // InternalRigidBodies.g:1997:3: lv_body1_6_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getBody1BodyReferenceParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_20);
            lv_body1_6_0=ruleBodyReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"body1",
                    		lv_body1_6_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.BodyReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRigidBodies.g:2013:2: ( (lv_relTrans1_7_0= ruleRelativeTransformation ) )
            // InternalRigidBodies.g:2014:1: (lv_relTrans1_7_0= ruleRelativeTransformation )
            {
            // InternalRigidBodies.g:2014:1: (lv_relTrans1_7_0= ruleRelativeTransformation )
            // InternalRigidBodies.g:2015:3: lv_relTrans1_7_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getRelTrans1RelativeTransformationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_49);
            lv_relTrans1_7_0=ruleRelativeTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"relTrans1",
                    		lv_relTrans1_7_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.RelativeTransformation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,56,FOLLOW_19); 

                	newLeafNode(otherlv_8, grammarAccess.getJointAccess().getAndKeyword_8());
                
            // InternalRigidBodies.g:2035:1: ( (lv_body2_9_0= ruleBodyReference ) )
            // InternalRigidBodies.g:2036:1: (lv_body2_9_0= ruleBodyReference )
            {
            // InternalRigidBodies.g:2036:1: (lv_body2_9_0= ruleBodyReference )
            // InternalRigidBodies.g:2037:3: lv_body2_9_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getBody2BodyReferenceParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_body2_9_0=ruleBodyReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"body2",
                    		lv_body2_9_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.BodyReference");
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
    // InternalRigidBodies.g:2061:1: entryRuleJointType returns [EObject current=null] : iv_ruleJointType= ruleJointType EOF ;
    public final EObject entryRuleJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointType = null;


        try {
            // InternalRigidBodies.g:2062:2: (iv_ruleJointType= ruleJointType EOF )
            // InternalRigidBodies.g:2063:2: iv_ruleJointType= ruleJointType EOF
            {
             newCompositeNode(grammarAccess.getJointTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJointType=ruleJointType();

            state._fsp--;

             current =iv_ruleJointType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2070:1: ruleJointType returns [EObject current=null] : ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) ) ) ;
    public final EObject ruleJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:2073:28: ( ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) ) ) )
            // InternalRigidBodies.g:2074:1: ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) ) )
            {
            // InternalRigidBodies.g:2074:1: ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) ) )
            // InternalRigidBodies.g:2074:2: (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleAdditiveJointType ) )
            {
            // InternalRigidBodies.g:2074:2: (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRigidBodies.g:2074:4: otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,52,FOLLOW_50); 

                        	newLeafNode(otherlv_0, grammarAccess.getJointTypeAccess().getJointKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,57,FOLLOW_10); 

                        	newLeafNode(otherlv_1, grammarAccess.getJointTypeAccess().getTypeKeyword_0_1());
                        
                    // InternalRigidBodies.g:2082:1: ( (lv_name_2_0= RULE_ID ) )
                    // InternalRigidBodies.g:2083:1: (lv_name_2_0= RULE_ID )
                    {
                    // InternalRigidBodies.g:2083:1: (lv_name_2_0= RULE_ID )
                    // InternalRigidBodies.g:2084:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_46); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getJointTypeAccess().getNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJointTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalRigidBodies.g:2100:4: ( (lv_exp_3_0= ruleAdditiveJointType ) )
            // InternalRigidBodies.g:2101:1: (lv_exp_3_0= ruleAdditiveJointType )
            {
            // InternalRigidBodies.g:2101:1: (lv_exp_3_0= ruleAdditiveJointType )
            // InternalRigidBodies.g:2102:3: lv_exp_3_0= ruleAdditiveJointType
            {
             
            	        newCompositeNode(grammarAccess.getJointTypeAccess().getExpAdditiveJointTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleAdditiveJointType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointTypeRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_3_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AdditiveJointType");
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
    // InternalRigidBodies.g:2126:1: entryRuleAdditiveJointType returns [EObject current=null] : iv_ruleAdditiveJointType= ruleAdditiveJointType EOF ;
    public final EObject entryRuleAdditiveJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveJointType = null;


        try {
            // InternalRigidBodies.g:2127:2: (iv_ruleAdditiveJointType= ruleAdditiveJointType EOF )
            // InternalRigidBodies.g:2128:2: iv_ruleAdditiveJointType= ruleAdditiveJointType EOF
            {
             newCompositeNode(grammarAccess.getAdditiveJointTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveJointType=ruleAdditiveJointType();

            state._fsp--;

             current =iv_ruleAdditiveJointType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2135:1: ruleAdditiveJointType returns [EObject current=null] : (this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )* ) ;
    public final EObject ruleAdditiveJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PrimaryJointType_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:2138:28: ( (this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )* ) )
            // InternalRigidBodies.g:2139:1: (this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )* )
            {
            // InternalRigidBodies.g:2139:1: (this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )* )
            // InternalRigidBodies.g:2140:5: this_PrimaryJointType_0= rulePrimaryJointType (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditiveJointTypeAccess().getPrimaryJointTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_33);
            this_PrimaryJointType_0=rulePrimaryJointType();

            state._fsp--;

             
                    current = this_PrimaryJointType_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalRigidBodies.g:2148:1: (otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRigidBodies.g:2148:3: otherlv_1= '+' () ( (lv_right_3_0= rulePrimaryJointType ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_46); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAdditiveJointTypeAccess().getPlusSignKeyword_1_0());
            	        
            	    // InternalRigidBodies.g:2152:1: ()
            	    // InternalRigidBodies.g:2153:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditiveJointTypeAccess().getAdditiveJointTypeLeftAction_1_1(),
            	                current);
            	        

            	    }

            	    // InternalRigidBodies.g:2158:2: ( (lv_right_3_0= rulePrimaryJointType ) )
            	    // InternalRigidBodies.g:2159:1: (lv_right_3_0= rulePrimaryJointType )
            	    {
            	    // InternalRigidBodies.g:2159:1: (lv_right_3_0= rulePrimaryJointType )
            	    // InternalRigidBodies.g:2160:3: lv_right_3_0= rulePrimaryJointType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveJointTypeAccess().getRightPrimaryJointTypeParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=rulePrimaryJointType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveJointTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"uk.ac.kcl.inf.robotics.RigidBodies.PrimaryJointType");
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
    // $ANTLR end "ruleAdditiveJointType"


    // $ANTLR start "entryRulePrimaryJointType"
    // InternalRigidBodies.g:2184:1: entryRulePrimaryJointType returns [EObject current=null] : iv_rulePrimaryJointType= rulePrimaryJointType EOF ;
    public final EObject entryRulePrimaryJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryJointType = null;


        try {
            // InternalRigidBodies.g:2185:2: (iv_rulePrimaryJointType= rulePrimaryJointType EOF )
            // InternalRigidBodies.g:2186:2: iv_rulePrimaryJointType= rulePrimaryJointType EOF
            {
             newCompositeNode(grammarAccess.getPrimaryJointTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryJointType=rulePrimaryJointType();

            state._fsp--;

             current =iv_rulePrimaryJointType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2193:1: rulePrimaryJointType returns [EObject current=null] : (this_JointTypeReference_0= ruleJointTypeReference | this_BasicJointType_1= ruleBasicJointType ) ;
    public final EObject rulePrimaryJointType() throws RecognitionException {
        EObject current = null;

        EObject this_JointTypeReference_0 = null;

        EObject this_BasicJointType_1 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:2196:28: ( (this_JointTypeReference_0= ruleJointTypeReference | this_BasicJointType_1= ruleBasicJointType ) )
            // InternalRigidBodies.g:2197:1: (this_JointTypeReference_0= ruleJointTypeReference | this_BasicJointType_1= ruleBasicJointType )
            {
            // InternalRigidBodies.g:2197:1: (this_JointTypeReference_0= ruleJointTypeReference | this_BasicJointType_1= ruleBasicJointType )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=38 && LA27_0<=39)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalRigidBodies.g:2198:5: this_JointTypeReference_0= ruleJointTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryJointTypeAccess().getJointTypeReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_JointTypeReference_0=ruleJointTypeReference();

                    state._fsp--;

                     
                            current = this_JointTypeReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:2208:5: this_BasicJointType_1= ruleBasicJointType
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryJointTypeAccess().getBasicJointTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalRigidBodies.g:2224:1: entryRuleJointTypeReference returns [EObject current=null] : iv_ruleJointTypeReference= ruleJointTypeReference EOF ;
    public final EObject entryRuleJointTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointTypeReference = null;


        try {
            // InternalRigidBodies.g:2225:2: (iv_ruleJointTypeReference= ruleJointTypeReference EOF )
            // InternalRigidBodies.g:2226:2: iv_ruleJointTypeReference= ruleJointTypeReference EOF
            {
             newCompositeNode(grammarAccess.getJointTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJointTypeReference=ruleJointTypeReference();

            state._fsp--;

             current =iv_ruleJointTypeReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2233:1: ruleJointTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleJointTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalRigidBodies.g:2236:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRigidBodies.g:2237:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRigidBodies.g:2237:1: ( (otherlv_0= RULE_ID ) )
            // InternalRigidBodies.g:2238:1: (otherlv_0= RULE_ID )
            {
            // InternalRigidBodies.g:2238:1: (otherlv_0= RULE_ID )
            // InternalRigidBodies.g:2239:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJointTypeReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalRigidBodies.g:2258:1: entryRuleBasicJointType returns [EObject current=null] : iv_ruleBasicJointType= ruleBasicJointType EOF ;
    public final EObject entryRuleBasicJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicJointType = null;


        try {
            // InternalRigidBodies.g:2259:2: (iv_ruleBasicJointType= ruleBasicJointType EOF )
            // InternalRigidBodies.g:2260:2: iv_ruleBasicJointType= ruleBasicJointType EOF
            {
             newCompositeNode(grammarAccess.getBasicJointTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicJointType=ruleBasicJointType();

            state._fsp--;

             current =iv_ruleBasicJointType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2267:1: ruleBasicJointType returns [EObject current=null] : ( ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) ) ) ;
    public final EObject ruleBasicJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_0_0 = null;

        EObject lv_stiffness_2_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:2270:28: ( ( ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) ) ) )
            // InternalRigidBodies.g:2271:1: ( ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) ) )
            {
            // InternalRigidBodies.g:2271:1: ( ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) ) )
            // InternalRigidBodies.g:2271:2: ( (lv_type_0_0= ruleJointMovement ) ) otherlv_1= 'with' ( (lv_stiffness_2_0= ruleStiffnessExp ) )
            {
            // InternalRigidBodies.g:2271:2: ( (lv_type_0_0= ruleJointMovement ) )
            // InternalRigidBodies.g:2272:1: (lv_type_0_0= ruleJointMovement )
            {
            // InternalRigidBodies.g:2272:1: (lv_type_0_0= ruleJointMovement )
            // InternalRigidBodies.g:2273:3: lv_type_0_0= ruleJointMovement
            {
             
            	        newCompositeNode(grammarAccess.getBasicJointTypeAccess().getTypeJointMovementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_51);
            lv_type_0_0=ruleJointMovement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBasicJointTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.JointMovement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getBasicJointTypeAccess().getWithKeyword_1());
                
            // InternalRigidBodies.g:2293:1: ( (lv_stiffness_2_0= ruleStiffnessExp ) )
            // InternalRigidBodies.g:2294:1: (lv_stiffness_2_0= ruleStiffnessExp )
            {
            // InternalRigidBodies.g:2294:1: (lv_stiffness_2_0= ruleStiffnessExp )
            // InternalRigidBodies.g:2295:3: lv_stiffness_2_0= ruleStiffnessExp
            {
             
            	        newCompositeNode(grammarAccess.getBasicJointTypeAccess().getStiffnessStiffnessExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_stiffness_2_0=ruleStiffnessExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBasicJointTypeRule());
            	        }
                   		set(
                   			current, 
                   			"stiffness",
                    		lv_stiffness_2_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.StiffnessExp");
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
    // InternalRigidBodies.g:2319:1: entryRuleJointMovement returns [EObject current=null] : iv_ruleJointMovement= ruleJointMovement EOF ;
    public final EObject entryRuleJointMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointMovement = null;


        try {
            // InternalRigidBodies.g:2320:2: (iv_ruleJointMovement= ruleJointMovement EOF )
            // InternalRigidBodies.g:2321:2: iv_ruleJointMovement= ruleJointMovement EOF
            {
             newCompositeNode(grammarAccess.getJointMovementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJointMovement=ruleJointMovement();

            state._fsp--;

             current =iv_ruleJointMovement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2328:1: ruleJointMovement returns [EObject current=null] : (this_Revolute_0= ruleRevolute | this_Planar_1= rulePlanar ) ;
    public final EObject ruleJointMovement() throws RecognitionException {
        EObject current = null;

        EObject this_Revolute_0 = null;

        EObject this_Planar_1 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:2331:28: ( (this_Revolute_0= ruleRevolute | this_Planar_1= rulePlanar ) )
            // InternalRigidBodies.g:2332:1: (this_Revolute_0= ruleRevolute | this_Planar_1= rulePlanar )
            {
            // InternalRigidBodies.g:2332:1: (this_Revolute_0= ruleRevolute | this_Planar_1= rulePlanar )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            else if ( (LA28_0==39) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalRigidBodies.g:2333:5: this_Revolute_0= ruleRevolute
                    {
                     
                            newCompositeNode(grammarAccess.getJointMovementAccess().getRevoluteParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Revolute_0=ruleRevolute();

                    state._fsp--;

                     
                            current = this_Revolute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:2343:5: this_Planar_1= rulePlanar
                    {
                     
                            newCompositeNode(grammarAccess.getJointMovementAccess().getPlanarParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalRigidBodies.g:2359:1: entryRuleRevolute returns [EObject current=null] : iv_ruleRevolute= ruleRevolute EOF ;
    public final EObject entryRuleRevolute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRevolute = null;


        try {
            // InternalRigidBodies.g:2360:2: (iv_ruleRevolute= ruleRevolute EOF )
            // InternalRigidBodies.g:2361:2: iv_ruleRevolute= ruleRevolute EOF
            {
             newCompositeNode(grammarAccess.getRevoluteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRevolute=ruleRevolute();

            state._fsp--;

             current =iv_ruleRevolute; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2368:1: ruleRevolute returns [EObject current=null] : (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) ) ;
    public final EObject ruleRevolute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_axis_1_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:2371:28: ( (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) ) )
            // InternalRigidBodies.g:2372:1: (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) )
            {
            // InternalRigidBodies.g:2372:1: (otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) ) )
            // InternalRigidBodies.g:2372:3: otherlv_0= 'revolute' ( (lv_axis_1_0= ruleAXIS ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_35); 

                	newLeafNode(otherlv_0, grammarAccess.getRevoluteAccess().getRevoluteKeyword_0());
                
            // InternalRigidBodies.g:2376:1: ( (lv_axis_1_0= ruleAXIS ) )
            // InternalRigidBodies.g:2377:1: (lv_axis_1_0= ruleAXIS )
            {
            // InternalRigidBodies.g:2377:1: (lv_axis_1_0= ruleAXIS )
            // InternalRigidBodies.g:2378:3: lv_axis_1_0= ruleAXIS
            {
             
            	        newCompositeNode(grammarAccess.getRevoluteAccess().getAxisAXISEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_axis_1_0=ruleAXIS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRevoluteRule());
            	        }
                   		set(
                   			current, 
                   			"axis",
                    		lv_axis_1_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AXIS");
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
    // InternalRigidBodies.g:2402:1: entryRulePlanar returns [EObject current=null] : iv_rulePlanar= rulePlanar EOF ;
    public final EObject entryRulePlanar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanar = null;


        try {
            // InternalRigidBodies.g:2403:2: (iv_rulePlanar= rulePlanar EOF )
            // InternalRigidBodies.g:2404:2: iv_rulePlanar= rulePlanar EOF
            {
             newCompositeNode(grammarAccess.getPlanarRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlanar=rulePlanar();

            state._fsp--;

             current =iv_rulePlanar; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2411:1: rulePlanar returns [EObject current=null] : (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) ) ;
    public final EObject rulePlanar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_axis_1_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:2414:28: ( (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) ) )
            // InternalRigidBodies.g:2415:1: (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) )
            {
            // InternalRigidBodies.g:2415:1: (otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) ) )
            // InternalRigidBodies.g:2415:3: otherlv_0= 'planar' ( (lv_axis_1_0= ruleAXIS ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_35); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanarAccess().getPlanarKeyword_0());
                
            // InternalRigidBodies.g:2419:1: ( (lv_axis_1_0= ruleAXIS ) )
            // InternalRigidBodies.g:2420:1: (lv_axis_1_0= ruleAXIS )
            {
            // InternalRigidBodies.g:2420:1: (lv_axis_1_0= ruleAXIS )
            // InternalRigidBodies.g:2421:3: lv_axis_1_0= ruleAXIS
            {
             
            	        newCompositeNode(grammarAccess.getPlanarAccess().getAxisAXISEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_axis_1_0=ruleAXIS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlanarRule());
            	        }
                   		set(
                   			current, 
                   			"axis",
                    		lv_axis_1_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AXIS");
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
    // InternalRigidBodies.g:2445:1: entryRuleStiffnessExp returns [EObject current=null] : iv_ruleStiffnessExp= ruleStiffnessExp EOF ;
    public final EObject entryRuleStiffnessExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStiffnessExp = null;


        try {
            // InternalRigidBodies.g:2446:2: (iv_ruleStiffnessExp= ruleStiffnessExp EOF )
            // InternalRigidBodies.g:2447:2: iv_ruleStiffnessExp= ruleStiffnessExp EOF
            {
             newCompositeNode(grammarAccess.getStiffnessExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStiffnessExp=ruleStiffnessExp();

            state._fsp--;

             current =iv_ruleStiffnessExp; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2454:1: ruleStiffnessExp returns [EObject current=null] : (this_StiffnessRef_0= ruleStiffnessRef | this_BaseStiffnessExp_1= ruleBaseStiffnessExp ) ;
    public final EObject ruleStiffnessExp() throws RecognitionException {
        EObject current = null;

        EObject this_StiffnessRef_0 = null;

        EObject this_BaseStiffnessExp_1 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:2457:28: ( (this_StiffnessRef_0= ruleStiffnessRef | this_BaseStiffnessExp_1= ruleBaseStiffnessExp ) )
            // InternalRigidBodies.g:2458:1: (this_StiffnessRef_0= ruleStiffnessRef | this_BaseStiffnessExp_1= ruleBaseStiffnessExp )
            {
            // InternalRigidBodies.g:2458:1: (this_StiffnessRef_0= ruleStiffnessRef | this_BaseStiffnessExp_1= ruleBaseStiffnessExp )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==13||LA29_0==58) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalRigidBodies.g:2459:5: this_StiffnessRef_0= ruleStiffnessRef
                    {
                     
                            newCompositeNode(grammarAccess.getStiffnessExpAccess().getStiffnessRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_StiffnessRef_0=ruleStiffnessRef();

                    state._fsp--;

                     
                            current = this_StiffnessRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:2469:5: this_BaseStiffnessExp_1= ruleBaseStiffnessExp
                    {
                     
                            newCompositeNode(grammarAccess.getStiffnessExpAccess().getBaseStiffnessExpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalRigidBodies.g:2485:1: entryRuleStiffnessRef returns [EObject current=null] : iv_ruleStiffnessRef= ruleStiffnessRef EOF ;
    public final EObject entryRuleStiffnessRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStiffnessRef = null;


        try {
            // InternalRigidBodies.g:2486:2: (iv_ruleStiffnessRef= ruleStiffnessRef EOF )
            // InternalRigidBodies.g:2487:2: iv_ruleStiffnessRef= ruleStiffnessRef EOF
            {
             newCompositeNode(grammarAccess.getStiffnessRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStiffnessRef=ruleStiffnessRef();

            state._fsp--;

             current =iv_ruleStiffnessRef; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2494:1: ruleStiffnessRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleStiffnessRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalRigidBodies.g:2497:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRigidBodies.g:2498:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRigidBodies.g:2498:1: ( (otherlv_0= RULE_ID ) )
            // InternalRigidBodies.g:2499:1: (otherlv_0= RULE_ID )
            {
            // InternalRigidBodies.g:2499:1: (otherlv_0= RULE_ID )
            // InternalRigidBodies.g:2500:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStiffnessRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalRigidBodies.g:2519:1: entryRuleBaseStiffnessExp returns [EObject current=null] : iv_ruleBaseStiffnessExp= ruleBaseStiffnessExp EOF ;
    public final EObject entryRuleBaseStiffnessExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseStiffnessExp = null;


        try {
            // InternalRigidBodies.g:2520:2: (iv_ruleBaseStiffnessExp= ruleBaseStiffnessExp EOF )
            // InternalRigidBodies.g:2521:2: iv_ruleBaseStiffnessExp= ruleBaseStiffnessExp EOF
            {
             newCompositeNode(grammarAccess.getBaseStiffnessExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseStiffnessExp=ruleBaseStiffnessExp();

            state._fsp--;

             current =iv_ruleBaseStiffnessExp; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2528:1: ruleBaseStiffnessExp returns [EObject current=null] : ( (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}' ) ;
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
            // InternalRigidBodies.g:2531:28: ( ( (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}' ) )
            // InternalRigidBodies.g:2532:1: ( (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}' )
            {
            // InternalRigidBodies.g:2532:1: ( (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}' )
            // InternalRigidBodies.g:2532:2: (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '{' otherlv_3= 'springCoeff' ( (lv_springCoeff_4_0= ruleAddExp ) ) otherlv_5= 'springInit' ( (lv_springInit_6_0= ruleAddExp ) ) otherlv_7= 'dampViscous' ( (lv_dampViscous_8_0= ruleAddExp ) ) otherlv_9= 'dampCoulomb' ( (lv_dampCoulomb_10_0= ruleAddExp ) ) otherlv_11= '}'
            {
            // InternalRigidBodies.g:2532:2: (otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==58) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRigidBodies.g:2532:4: otherlv_0= 'stiffness' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,58,FOLLOW_10); 

                        	newLeafNode(otherlv_0, grammarAccess.getBaseStiffnessExpAccess().getStiffnessKeyword_0_0());
                        
                    // InternalRigidBodies.g:2536:1: ( (lv_name_1_0= RULE_ID ) )
                    // InternalRigidBodies.g:2537:1: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRigidBodies.g:2537:1: (lv_name_1_0= RULE_ID )
                    // InternalRigidBodies.g:2538:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getBaseStiffnessExpAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseStiffnessExpRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_52); 

                	newLeafNode(otherlv_2, grammarAccess.getBaseStiffnessExpAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_3=(Token)match(input,59,FOLLOW_22); 

                	newLeafNode(otherlv_3, grammarAccess.getBaseStiffnessExpAccess().getSpringCoeffKeyword_2());
                
            // InternalRigidBodies.g:2562:1: ( (lv_springCoeff_4_0= ruleAddExp ) )
            // InternalRigidBodies.g:2563:1: (lv_springCoeff_4_0= ruleAddExp )
            {
            // InternalRigidBodies.g:2563:1: (lv_springCoeff_4_0= ruleAddExp )
            // InternalRigidBodies.g:2564:3: lv_springCoeff_4_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseStiffnessExpAccess().getSpringCoeffAddExpParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_53);
            lv_springCoeff_4_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBaseStiffnessExpRule());
            	        }
                   		set(
                   			current, 
                   			"springCoeff",
                    		lv_springCoeff_4_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,60,FOLLOW_22); 

                	newLeafNode(otherlv_5, grammarAccess.getBaseStiffnessExpAccess().getSpringInitKeyword_4());
                
            // InternalRigidBodies.g:2584:1: ( (lv_springInit_6_0= ruleAddExp ) )
            // InternalRigidBodies.g:2585:1: (lv_springInit_6_0= ruleAddExp )
            {
            // InternalRigidBodies.g:2585:1: (lv_springInit_6_0= ruleAddExp )
            // InternalRigidBodies.g:2586:3: lv_springInit_6_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseStiffnessExpAccess().getSpringInitAddExpParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_54);
            lv_springInit_6_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBaseStiffnessExpRule());
            	        }
                   		set(
                   			current, 
                   			"springInit",
                    		lv_springInit_6_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,61,FOLLOW_22); 

                	newLeafNode(otherlv_7, grammarAccess.getBaseStiffnessExpAccess().getDampViscousKeyword_6());
                
            // InternalRigidBodies.g:2606:1: ( (lv_dampViscous_8_0= ruleAddExp ) )
            // InternalRigidBodies.g:2607:1: (lv_dampViscous_8_0= ruleAddExp )
            {
            // InternalRigidBodies.g:2607:1: (lv_dampViscous_8_0= ruleAddExp )
            // InternalRigidBodies.g:2608:3: lv_dampViscous_8_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseStiffnessExpAccess().getDampViscousAddExpParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_55);
            lv_dampViscous_8_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBaseStiffnessExpRule());
            	        }
                   		set(
                   			current, 
                   			"dampViscous",
                    		lv_dampViscous_8_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,62,FOLLOW_22); 

                	newLeafNode(otherlv_9, grammarAccess.getBaseStiffnessExpAccess().getDampCoulombKeyword_8());
                
            // InternalRigidBodies.g:2628:1: ( (lv_dampCoulomb_10_0= ruleAddExp ) )
            // InternalRigidBodies.g:2629:1: (lv_dampCoulomb_10_0= ruleAddExp )
            {
            // InternalRigidBodies.g:2629:1: (lv_dampCoulomb_10_0= ruleAddExp )
            // InternalRigidBodies.g:2630:3: lv_dampCoulomb_10_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseStiffnessExpAccess().getDampCoulombAddExpParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_9);
            lv_dampCoulomb_10_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBaseStiffnessExpRule());
            	        }
                   		set(
                   			current, 
                   			"dampCoulomb",
                    		lv_dampCoulomb_10_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRigidBodies.g:2658:1: entryRuleRelativeTransformation returns [EObject current=null] : iv_ruleRelativeTransformation= ruleRelativeTransformation EOF ;
    public final EObject entryRuleRelativeTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeTransformation = null;


        try {
            // InternalRigidBodies.g:2659:2: (iv_ruleRelativeTransformation= ruleRelativeTransformation EOF )
            // InternalRigidBodies.g:2660:2: iv_ruleRelativeTransformation= ruleRelativeTransformation EOF
            {
             newCompositeNode(grammarAccess.getRelativeTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeTransformation=ruleRelativeTransformation();

            state._fsp--;

             current =iv_ruleRelativeTransformation; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2667:1: ruleRelativeTransformation returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' ) ;
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
            // InternalRigidBodies.g:2670:28: ( (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' ) )
            // InternalRigidBodies.g:2671:1: (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' )
            {
            // InternalRigidBodies.g:2671:1: (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' )
            // InternalRigidBodies.g:2671:3: otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_51); 

                	newLeafNode(otherlv_0, grammarAccess.getRelativeTransformationAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_56); 

                	newLeafNode(otherlv_1, grammarAccess.getRelativeTransformationAccess().getWithKeyword_1());
                
            otherlv_2=(Token)match(input,64,FOLLOW_57); 

                	newLeafNode(otherlv_2, grammarAccess.getRelativeTransformationAccess().getRelativeKeyword_2());
                
            otherlv_3=(Token)match(input,65,FOLLOW_8); 

                	newLeafNode(otherlv_3, grammarAccess.getRelativeTransformationAccess().getTransformationKeyword_3());
                
            // InternalRigidBodies.g:2687:1: ( (lv_position_4_0= ruleMatrix ) )
            // InternalRigidBodies.g:2688:1: (lv_position_4_0= ruleMatrix )
            {
            // InternalRigidBodies.g:2688:1: (lv_position_4_0= ruleMatrix )
            // InternalRigidBodies.g:2689:3: lv_position_4_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getRelativeTransformationAccess().getPositionMatrixParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_58);
            lv_position_4_0=ruleMatrix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelativeTransformationRule());
            	        }
                   		set(
                   			current, 
                   			"position",
                    		lv_position_4_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.Matrix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_59); 

                	newLeafNode(otherlv_5, grammarAccess.getRelativeTransformationAccess().getCommaKeyword_5());
                
            // InternalRigidBodies.g:2709:1: ( (lv_reorient_6_0= ruleReorientation ) )
            // InternalRigidBodies.g:2710:1: (lv_reorient_6_0= ruleReorientation )
            {
            // InternalRigidBodies.g:2710:1: (lv_reorient_6_0= ruleReorientation )
            // InternalRigidBodies.g:2711:3: lv_reorient_6_0= ruleReorientation
            {
             
            	        newCompositeNode(grammarAccess.getRelativeTransformationAccess().getReorientReorientationParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_60);
            lv_reorient_6_0=ruleReorientation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelativeTransformationRule());
            	        }
                   		set(
                   			current, 
                   			"reorient",
                    		lv_reorient_6_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.Reorientation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,66,FOLLOW_2); 

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
    // InternalRigidBodies.g:2739:1: entryRuleReorientation returns [EObject current=null] : iv_ruleReorientation= ruleReorientation EOF ;
    public final EObject entryRuleReorientation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReorientation = null;


        try {
            // InternalRigidBodies.g:2740:2: (iv_ruleReorientation= ruleReorientation EOF )
            // InternalRigidBodies.g:2741:2: iv_ruleReorientation= ruleReorientation EOF
            {
             newCompositeNode(grammarAccess.getReorientationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReorientation=ruleReorientation();

            state._fsp--;

             current =iv_ruleReorientation; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2748:1: ruleReorientation returns [EObject current=null] : ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) ) ;
    public final EObject ruleReorientation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:2751:28: ( ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) ) )
            // InternalRigidBodies.g:2752:1: ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) )
            {
            // InternalRigidBodies.g:2752:1: ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) )
            // InternalRigidBodies.g:2752:2: (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) )
            {
            // InternalRigidBodies.g:2752:2: (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==67) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRigidBodies.g:2752:4: otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,67,FOLLOW_10); 

                        	newLeafNode(otherlv_0, grammarAccess.getReorientationAccess().getReorientKeyword_0_0());
                        
                    // InternalRigidBodies.g:2756:1: ( (lv_name_1_0= RULE_ID ) )
                    // InternalRigidBodies.g:2757:1: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRigidBodies.g:2757:1: (lv_name_1_0= RULE_ID )
                    // InternalRigidBodies.g:2758:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_59); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getReorientationAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReorientationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalRigidBodies.g:2774:4: ( (lv_exp_2_0= ruleReorientExpression ) )
            // InternalRigidBodies.g:2775:1: (lv_exp_2_0= ruleReorientExpression )
            {
            // InternalRigidBodies.g:2775:1: (lv_exp_2_0= ruleReorientExpression )
            // InternalRigidBodies.g:2776:3: lv_exp_2_0= ruleReorientExpression
            {
             
            	        newCompositeNode(grammarAccess.getReorientationAccess().getExpReorientExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleReorientExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReorientationRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_2_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.ReorientExpression");
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
    // InternalRigidBodies.g:2800:1: entryRuleReorientExpression returns [EObject current=null] : iv_ruleReorientExpression= ruleReorientExpression EOF ;
    public final EObject entryRuleReorientExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReorientExpression = null;


        try {
            // InternalRigidBodies.g:2801:2: (iv_ruleReorientExpression= ruleReorientExpression EOF )
            // InternalRigidBodies.g:2802:2: iv_ruleReorientExpression= ruleReorientExpression EOF
            {
             newCompositeNode(grammarAccess.getReorientExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReorientExpression=ruleReorientExpression();

            state._fsp--;

             current =iv_ruleReorientExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2809:1: ruleReorientExpression returns [EObject current=null] : (this_ReorientRef_0= ruleReorientRef | this_BasicReorientExpression_1= ruleBasicReorientExpression ) ;
    public final EObject ruleReorientExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ReorientRef_0 = null;

        EObject this_BasicReorientExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:2812:28: ( (this_ReorientRef_0= ruleReorientRef | this_BasicReorientExpression_1= ruleBasicReorientExpression ) )
            // InternalRigidBodies.g:2813:1: (this_ReorientRef_0= ruleReorientRef | this_BasicReorientExpression_1= ruleBasicReorientExpression )
            {
            // InternalRigidBodies.g:2813:1: (this_ReorientRef_0= ruleReorientRef | this_BasicReorientExpression_1= ruleBasicReorientExpression )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==63) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalRigidBodies.g:2814:5: this_ReorientRef_0= ruleReorientRef
                    {
                     
                            newCompositeNode(grammarAccess.getReorientExpressionAccess().getReorientRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ReorientRef_0=ruleReorientRef();

                    state._fsp--;

                     
                            current = this_ReorientRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:2824:5: this_BasicReorientExpression_1= ruleBasicReorientExpression
                    {
                     
                            newCompositeNode(grammarAccess.getReorientExpressionAccess().getBasicReorientExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalRigidBodies.g:2840:1: entryRuleReorientRef returns [EObject current=null] : iv_ruleReorientRef= ruleReorientRef EOF ;
    public final EObject entryRuleReorientRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReorientRef = null;


        try {
            // InternalRigidBodies.g:2841:2: (iv_ruleReorientRef= ruleReorientRef EOF )
            // InternalRigidBodies.g:2842:2: iv_ruleReorientRef= ruleReorientRef EOF
            {
             newCompositeNode(grammarAccess.getReorientRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReorientRef=ruleReorientRef();

            state._fsp--;

             current =iv_ruleReorientRef; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2849:1: ruleReorientRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleReorientRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalRigidBodies.g:2852:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRigidBodies.g:2853:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRigidBodies.g:2853:1: ( (otherlv_0= RULE_ID ) )
            // InternalRigidBodies.g:2854:1: (otherlv_0= RULE_ID )
            {
            // InternalRigidBodies.g:2854:1: (otherlv_0= RULE_ID )
            // InternalRigidBodies.g:2855:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReorientRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalRigidBodies.g:2874:1: entryRuleBasicReorientExpression returns [EObject current=null] : iv_ruleBasicReorientExpression= ruleBasicReorientExpression EOF ;
    public final EObject entryRuleBasicReorientExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicReorientExpression = null;


        try {
            // InternalRigidBodies.g:2875:2: (iv_ruleBasicReorientExpression= ruleBasicReorientExpression EOF )
            // InternalRigidBodies.g:2876:2: iv_ruleBasicReorientExpression= ruleBasicReorientExpression EOF
            {
             newCompositeNode(grammarAccess.getBasicReorientExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicReorientExpression=ruleBasicReorientExpression();

            state._fsp--;

             current =iv_ruleBasicReorientExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:2883:1: ruleBasicReorientExpression returns [EObject current=null] : (otherlv_0= '(' () (otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* )? otherlv_13= ')' ) ;
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
            // InternalRigidBodies.g:2886:28: ( (otherlv_0= '(' () (otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* )? otherlv_13= ')' ) )
            // InternalRigidBodies.g:2887:1: (otherlv_0= '(' () (otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* )? otherlv_13= ')' )
            {
            // InternalRigidBodies.g:2887:1: (otherlv_0= '(' () (otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* )? otherlv_13= ')' )
            // InternalRigidBodies.g:2887:3: otherlv_0= '(' () (otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* )? otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_61); 

                	newLeafNode(otherlv_0, grammarAccess.getBasicReorientExpressionAccess().getLeftParenthesisKeyword_0());
                
            // InternalRigidBodies.g:2891:1: ()
            // InternalRigidBodies.g:2892:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBasicReorientExpressionAccess().getBasicReorientExpressionAction_1(),
                        current);
                

            }

            // InternalRigidBodies.g:2897:2: (otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==63) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRigidBodies.g:2897:4: otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )*
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_35); 

                        	newLeafNode(otherlv_2, grammarAccess.getBasicReorientExpressionAccess().getLeftParenthesisKeyword_2_0());
                        
                    // InternalRigidBodies.g:2901:1: ( (lv_axis_3_0= ruleAXIS ) )
                    // InternalRigidBodies.g:2902:1: (lv_axis_3_0= ruleAXIS )
                    {
                    // InternalRigidBodies.g:2902:1: (lv_axis_3_0= ruleAXIS )
                    // InternalRigidBodies.g:2903:3: lv_axis_3_0= ruleAXIS
                    {
                     
                    	        newCompositeNode(grammarAccess.getBasicReorientExpressionAccess().getAxisAXISEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_58);
                    lv_axis_3_0=ruleAXIS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBasicReorientExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"axis",
                            		lv_axis_3_0, 
                            		"uk.ac.kcl.inf.robotics.RigidBodies.AXIS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_22); 

                        	newLeafNode(otherlv_4, grammarAccess.getBasicReorientExpressionAccess().getCommaKeyword_2_2());
                        
                    // InternalRigidBodies.g:2923:1: ( (lv_value_5_0= ruleAddExp ) )
                    // InternalRigidBodies.g:2924:1: (lv_value_5_0= ruleAddExp )
                    {
                    // InternalRigidBodies.g:2924:1: (lv_value_5_0= ruleAddExp )
                    // InternalRigidBodies.g:2925:3: lv_value_5_0= ruleAddExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getBasicReorientExpressionAccess().getValueAddExpParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_60);
                    lv_value_5_0=ruleAddExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBasicReorientExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,66,FOLLOW_62); 

                        	newLeafNode(otherlv_6, grammarAccess.getBasicReorientExpressionAccess().getRightParenthesisKeyword_2_4());
                        
                    // InternalRigidBodies.g:2945:1: (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==23) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalRigidBodies.g:2945:3: otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')'
                    	    {
                    	    otherlv_7=(Token)match(input,23,FOLLOW_20); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getBasicReorientExpressionAccess().getCommaKeyword_2_5_0());
                    	        
                    	    otherlv_8=(Token)match(input,63,FOLLOW_35); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getBasicReorientExpressionAccess().getLeftParenthesisKeyword_2_5_1());
                    	        
                    	    // InternalRigidBodies.g:2953:1: ( (lv_axis_9_0= ruleAXIS ) )
                    	    // InternalRigidBodies.g:2954:1: (lv_axis_9_0= ruleAXIS )
                    	    {
                    	    // InternalRigidBodies.g:2954:1: (lv_axis_9_0= ruleAXIS )
                    	    // InternalRigidBodies.g:2955:3: lv_axis_9_0= ruleAXIS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBasicReorientExpressionAccess().getAxisAXISEnumRuleCall_2_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_axis_9_0=ruleAXIS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBasicReorientExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"axis",
                    	            		lv_axis_9_0, 
                    	            		"uk.ac.kcl.inf.robotics.RigidBodies.AXIS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_10=(Token)match(input,23,FOLLOW_22); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getBasicReorientExpressionAccess().getCommaKeyword_2_5_3());
                    	        
                    	    // InternalRigidBodies.g:2975:1: ( (lv_value_11_0= ruleAddExp ) )
                    	    // InternalRigidBodies.g:2976:1: (lv_value_11_0= ruleAddExp )
                    	    {
                    	    // InternalRigidBodies.g:2976:1: (lv_value_11_0= ruleAddExp )
                    	    // InternalRigidBodies.g:2977:3: lv_value_11_0= ruleAddExp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBasicReorientExpressionAccess().getValueAddExpParserRuleCall_2_5_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_60);
                    	    lv_value_11_0=ruleAddExp();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBasicReorientExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"value",
                    	            		lv_value_11_0, 
                    	            		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,66,FOLLOW_62); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getBasicReorientExpressionAccess().getRightParenthesisKeyword_2_5_5());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,66,FOLLOW_2); 

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
    // InternalRigidBodies.g:3009:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalRigidBodies.g:3010:2: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalRigidBodies.g:3011:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:3018:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) ) ;
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
            // InternalRigidBodies.g:3021:28: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) ) )
            // InternalRigidBodies.g:3022:1: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) )
            {
            // InternalRigidBodies.g:3022:1: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) )
            // InternalRigidBodies.g:3022:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (lv_body1_5_0= ruleBodyReference ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (lv_body2_8_0= ruleBodyReference ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_10); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
                
            // InternalRigidBodies.g:3026:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalRigidBodies.g:3027:1: (lv_name_1_0= RULE_ID )
            {
            // InternalRigidBodies.g:3027:1: (lv_name_1_0= RULE_ID )
            // InternalRigidBodies.g:3028:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_63); 

                	newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getColonKeyword_2());
                
            // InternalRigidBodies.g:3048:1: ( (lv_type_3_0= ruleConstraintType ) )
            // InternalRigidBodies.g:3049:1: (lv_type_3_0= ruleConstraintType )
            {
            // InternalRigidBodies.g:3049:1: (lv_type_3_0= ruleConstraintType )
            // InternalRigidBodies.g:3050:3: lv_type_3_0= ruleConstraintType
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_48);
            lv_type_3_0=ruleConstraintType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.ConstraintType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_19); 

                	newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getBetweenKeyword_4());
                
            // InternalRigidBodies.g:3070:1: ( (lv_body1_5_0= ruleBodyReference ) )
            // InternalRigidBodies.g:3071:1: (lv_body1_5_0= ruleBodyReference )
            {
            // InternalRigidBodies.g:3071:1: (lv_body1_5_0= ruleBodyReference )
            // InternalRigidBodies.g:3072:3: lv_body1_5_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getBody1BodyReferenceParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_20);
            lv_body1_5_0=ruleBodyReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"body1",
                    		lv_body1_5_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.BodyReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRigidBodies.g:3088:2: ( (lv_relTrans1_6_0= ruleRelativeTransformation ) )
            // InternalRigidBodies.g:3089:1: (lv_relTrans1_6_0= ruleRelativeTransformation )
            {
            // InternalRigidBodies.g:3089:1: (lv_relTrans1_6_0= ruleRelativeTransformation )
            // InternalRigidBodies.g:3090:3: lv_relTrans1_6_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getRelTrans1RelativeTransformationParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_49);
            lv_relTrans1_6_0=ruleRelativeTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"relTrans1",
                    		lv_relTrans1_6_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.RelativeTransformation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,56,FOLLOW_19); 

                	newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getAndKeyword_7());
                
            // InternalRigidBodies.g:3110:1: ( (lv_body2_8_0= ruleBodyReference ) )
            // InternalRigidBodies.g:3111:1: (lv_body2_8_0= ruleBodyReference )
            {
            // InternalRigidBodies.g:3111:1: (lv_body2_8_0= ruleBodyReference )
            // InternalRigidBodies.g:3112:3: lv_body2_8_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getBody2BodyReferenceParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_20);
            lv_body2_8_0=ruleBodyReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"body2",
                    		lv_body2_8_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.BodyReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRigidBodies.g:3128:2: ( (lv_relTrans2_9_0= ruleRelativeTransformation ) )
            // InternalRigidBodies.g:3129:1: (lv_relTrans2_9_0= ruleRelativeTransformation )
            {
            // InternalRigidBodies.g:3129:1: (lv_relTrans2_9_0= ruleRelativeTransformation )
            // InternalRigidBodies.g:3130:3: lv_relTrans2_9_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getRelTrans2RelativeTransformationParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_relTrans2_9_0=ruleRelativeTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"relTrans2",
                    		lv_relTrans2_9_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.RelativeTransformation");
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


    // $ANTLR start "entryRuleJointConstraint"
    // InternalRigidBodies.g:3154:1: entryRuleJointConstraint returns [EObject current=null] : iv_ruleJointConstraint= ruleJointConstraint EOF ;
    public final EObject entryRuleJointConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointConstraint = null;


        try {
            // InternalRigidBodies.g:3155:2: (iv_ruleJointConstraint= ruleJointConstraint EOF )
            // InternalRigidBodies.g:3156:2: iv_ruleJointConstraint= ruleJointConstraint EOF
            {
             newCompositeNode(grammarAccess.getJointConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJointConstraint=ruleJointConstraint();

            state._fsp--;

             current =iv_ruleJointConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:3163:1: ruleJointConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'moves' otherlv_5= 'like' ( (otherlv_6= RULE_ID ) ) ) ;
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
            // InternalRigidBodies.g:3166:28: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'moves' otherlv_5= 'like' ( (otherlv_6= RULE_ID ) ) ) )
            // InternalRigidBodies.g:3167:1: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'moves' otherlv_5= 'like' ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalRigidBodies.g:3167:1: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'moves' otherlv_5= 'like' ( (otherlv_6= RULE_ID ) ) )
            // InternalRigidBodies.g:3167:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'moves' otherlv_5= 'like' ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_10); 

                	newLeafNode(otherlv_0, grammarAccess.getJointConstraintAccess().getConstraintKeyword_0());
                
            // InternalRigidBodies.g:3171:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalRigidBodies.g:3172:1: (lv_name_1_0= RULE_ID )
            {
            // InternalRigidBodies.g:3172:1: (lv_name_1_0= RULE_ID )
            // InternalRigidBodies.g:3173:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            			newLeafNode(lv_name_1_0, grammarAccess.getJointConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJointConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_10); 

                	newLeafNode(otherlv_2, grammarAccess.getJointConstraintAccess().getColonKeyword_2());
                
            // InternalRigidBodies.g:3193:1: ( (otherlv_3= RULE_ID ) )
            // InternalRigidBodies.g:3194:1: (otherlv_3= RULE_ID )
            {
            // InternalRigidBodies.g:3194:1: (otherlv_3= RULE_ID )
            // InternalRigidBodies.g:3195:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJointConstraintRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_64); 

            		newLeafNode(otherlv_3, grammarAccess.getJointConstraintAccess().getJoint1JointCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,69,FOLLOW_65); 

                	newLeafNode(otherlv_4, grammarAccess.getJointConstraintAccess().getMovesKeyword_4());
                
            otherlv_5=(Token)match(input,70,FOLLOW_10); 

                	newLeafNode(otherlv_5, grammarAccess.getJointConstraintAccess().getLikeKeyword_5());
                
            // InternalRigidBodies.g:3214:1: ( (otherlv_6= RULE_ID ) )
            // InternalRigidBodies.g:3215:1: (otherlv_6= RULE_ID )
            {
            // InternalRigidBodies.g:3215:1: (otherlv_6= RULE_ID )
            // InternalRigidBodies.g:3216:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJointConstraintRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalRigidBodies.g:3235:1: entryRuleExternalLoad returns [EObject current=null] : iv_ruleExternalLoad= ruleExternalLoad EOF ;
    public final EObject entryRuleExternalLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalLoad = null;


        try {
            // InternalRigidBodies.g:3236:2: (iv_ruleExternalLoad= ruleExternalLoad EOF )
            // InternalRigidBodies.g:3237:2: iv_ruleExternalLoad= ruleExternalLoad EOF
            {
             newCompositeNode(grammarAccess.getExternalLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalLoad=ruleExternalLoad();

            state._fsp--;

             current =iv_ruleExternalLoad; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:3244:1: ruleExternalLoad returns [EObject current=null] : (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')' ) ;
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
            // InternalRigidBodies.g:3247:28: ( (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')' ) )
            // InternalRigidBodies.g:3248:1: (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')' )
            {
            // InternalRigidBodies.g:3248:1: (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')' )
            // InternalRigidBodies.g:3248:3: otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'at' ( (lv_body1_6_0= ruleBodyReference ) ) otherlv_7= '(' otherlv_8= 'with' otherlv_9= 'relative' otherlv_10= 'transformation' ( (lv_position_11_0= ruleMatrix ) ) otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_66); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalLoadAccess().getExternalKeyword_0());
                
            otherlv_1=(Token)match(input,72,FOLLOW_10); 

                	newLeafNode(otherlv_1, grammarAccess.getExternalLoadAccess().getLoadKeyword_1());
                
            // InternalRigidBodies.g:3256:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalRigidBodies.g:3257:1: (lv_name_2_0= RULE_ID )
            {
            // InternalRigidBodies.g:3257:1: (lv_name_2_0= RULE_ID )
            // InternalRigidBodies.g:3258:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            			newLeafNode(lv_name_2_0, grammarAccess.getExternalLoadAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalLoadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,53,FOLLOW_67); 

                	newLeafNode(otherlv_3, grammarAccess.getExternalLoadAccess().getColonKeyword_3());
                
            // InternalRigidBodies.g:3278:1: ( (lv_type_4_0= ruleLoadType ) )
            // InternalRigidBodies.g:3279:1: (lv_type_4_0= ruleLoadType )
            {
            // InternalRigidBodies.g:3279:1: (lv_type_4_0= ruleLoadType )
            // InternalRigidBodies.g:3280:3: lv_type_4_0= ruleLoadType
            {
             
            	        newCompositeNode(grammarAccess.getExternalLoadAccess().getTypeLoadTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_68);
            lv_type_4_0=ruleLoadType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalLoadRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.LoadType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,73,FOLLOW_19); 

                	newLeafNode(otherlv_5, grammarAccess.getExternalLoadAccess().getAtKeyword_5());
                
            // InternalRigidBodies.g:3300:1: ( (lv_body1_6_0= ruleBodyReference ) )
            // InternalRigidBodies.g:3301:1: (lv_body1_6_0= ruleBodyReference )
            {
            // InternalRigidBodies.g:3301:1: (lv_body1_6_0= ruleBodyReference )
            // InternalRigidBodies.g:3302:3: lv_body1_6_0= ruleBodyReference
            {
             
            	        newCompositeNode(grammarAccess.getExternalLoadAccess().getBody1BodyReferenceParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_20);
            lv_body1_6_0=ruleBodyReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalLoadRule());
            	        }
                   		set(
                   			current, 
                   			"body1",
                    		lv_body1_6_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.BodyReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,63,FOLLOW_51); 

                	newLeafNode(otherlv_7, grammarAccess.getExternalLoadAccess().getLeftParenthesisKeyword_7());
                
            otherlv_8=(Token)match(input,24,FOLLOW_56); 

                	newLeafNode(otherlv_8, grammarAccess.getExternalLoadAccess().getWithKeyword_8());
                
            otherlv_9=(Token)match(input,64,FOLLOW_57); 

                	newLeafNode(otherlv_9, grammarAccess.getExternalLoadAccess().getRelativeKeyword_9());
                
            otherlv_10=(Token)match(input,65,FOLLOW_8); 

                	newLeafNode(otherlv_10, grammarAccess.getExternalLoadAccess().getTransformationKeyword_10());
                
            // InternalRigidBodies.g:3334:1: ( (lv_position_11_0= ruleMatrix ) )
            // InternalRigidBodies.g:3335:1: (lv_position_11_0= ruleMatrix )
            {
            // InternalRigidBodies.g:3335:1: (lv_position_11_0= ruleMatrix )
            // InternalRigidBodies.g:3336:3: lv_position_11_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getExternalLoadAccess().getPositionMatrixParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_60);
            lv_position_11_0=ruleMatrix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalLoadRule());
            	        }
                   		set(
                   			current, 
                   			"position",
                    		lv_position_11_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.Matrix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,66,FOLLOW_2); 

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
    // InternalRigidBodies.g:3364:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // InternalRigidBodies.g:3365:2: (iv_ruleMatrix= ruleMatrix EOF )
            // InternalRigidBodies.g:3366:2: iv_ruleMatrix= ruleMatrix EOF
            {
             newCompositeNode(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatrix=ruleMatrix();

            state._fsp--;

             current =iv_ruleMatrix; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:3373:1: ruleMatrix returns [EObject current=null] : (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        EObject this_BaseMatrix_0 = null;

        EObject this_MatrixRef_1 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:3376:28: ( (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef ) )
            // InternalRigidBodies.g:3377:1: (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef )
            {
            // InternalRigidBodies.g:3377:1: (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44||LA35_0==74) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalRigidBodies.g:3378:5: this_BaseMatrix_0= ruleBaseMatrix
                    {
                     
                            newCompositeNode(grammarAccess.getMatrixAccess().getBaseMatrixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_BaseMatrix_0=ruleBaseMatrix();

                    state._fsp--;

                     
                            current = this_BaseMatrix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:3388:5: this_MatrixRef_1= ruleMatrixRef
                    {
                     
                            newCompositeNode(grammarAccess.getMatrixAccess().getMatrixRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalRigidBodies.g:3404:1: entryRuleBaseMatrix returns [EObject current=null] : iv_ruleBaseMatrix= ruleBaseMatrix EOF ;
    public final EObject entryRuleBaseMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseMatrix = null;


        try {
            // InternalRigidBodies.g:3405:2: (iv_ruleBaseMatrix= ruleBaseMatrix EOF )
            // InternalRigidBodies.g:3406:2: iv_ruleBaseMatrix= ruleBaseMatrix EOF
            {
             newCompositeNode(grammarAccess.getBaseMatrixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseMatrix=ruleBaseMatrix();

            state._fsp--;

             current =iv_ruleBaseMatrix; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:3413:1: ruleBaseMatrix returns [EObject current=null] : ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' ) ;
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
            // InternalRigidBodies.g:3416:28: ( ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' ) )
            // InternalRigidBodies.g:3417:1: ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' )
            {
            // InternalRigidBodies.g:3417:1: ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' )
            // InternalRigidBodies.g:3417:2: (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']'
            {
            // InternalRigidBodies.g:3417:2: (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==74) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRigidBodies.g:3417:4: otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,74,FOLLOW_10); 

                        	newLeafNode(otherlv_0, grammarAccess.getBaseMatrixAccess().getMatrixKeyword_0_0());
                        
                    // InternalRigidBodies.g:3421:1: ( (lv_name_1_0= RULE_ID ) )
                    // InternalRigidBodies.g:3422:1: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRigidBodies.g:3422:1: (lv_name_1_0= RULE_ID )
                    // InternalRigidBodies.g:3423:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_69); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getBaseMatrixAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseMatrixRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,44,FOLLOW_22); 

                	newLeafNode(otherlv_2, grammarAccess.getBaseMatrixAccess().getLeftSquareBracketKeyword_1());
                
            // InternalRigidBodies.g:3443:1: ( (lv_values_3_0= ruleAddExp ) )
            // InternalRigidBodies.g:3444:1: (lv_values_3_0= ruleAddExp )
            {
            // InternalRigidBodies.g:3444:1: (lv_values_3_0= ruleAddExp )
            // InternalRigidBodies.g:3445:3: lv_values_3_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_70);
            lv_values_3_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBaseMatrixRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRigidBodies.g:3461:2: (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==23) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRigidBodies.g:3461:4: otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_22); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBaseMatrixAccess().getCommaKeyword_3_0());
            	        
            	    // InternalRigidBodies.g:3465:1: ( (lv_values_5_0= ruleAddExp ) )
            	    // InternalRigidBodies.g:3466:1: (lv_values_5_0= ruleAddExp )
            	    {
            	    // InternalRigidBodies.g:3466:1: (lv_values_5_0= ruleAddExp )
            	    // InternalRigidBodies.g:3467:3: lv_values_5_0= ruleAddExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_70);
            	    lv_values_5_0=ruleAddExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBaseMatrixRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_5_0, 
            	            		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_6=(Token)match(input,45,FOLLOW_2); 

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
    // InternalRigidBodies.g:3495:1: entryRuleMatrixRef returns [EObject current=null] : iv_ruleMatrixRef= ruleMatrixRef EOF ;
    public final EObject entryRuleMatrixRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixRef = null;


        try {
            // InternalRigidBodies.g:3496:2: (iv_ruleMatrixRef= ruleMatrixRef EOF )
            // InternalRigidBodies.g:3497:2: iv_ruleMatrixRef= ruleMatrixRef EOF
            {
             newCompositeNode(grammarAccess.getMatrixRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatrixRef=ruleMatrixRef();

            state._fsp--;

             current =iv_ruleMatrixRef; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:3504:1: ruleMatrixRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleMatrixRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalRigidBodies.g:3507:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRigidBodies.g:3508:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRigidBodies.g:3508:1: ( (otherlv_0= RULE_ID ) )
            // InternalRigidBodies.g:3509:1: (otherlv_0= RULE_ID )
            {
            // InternalRigidBodies.g:3509:1: (otherlv_0= RULE_ID )
            // InternalRigidBodies.g:3510:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMatrixRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalRigidBodies.g:3529:1: entryRuleAddExp returns [EObject current=null] : iv_ruleAddExp= ruleAddExp EOF ;
    public final EObject entryRuleAddExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExp = null;


        try {
            // InternalRigidBodies.g:3530:2: (iv_ruleAddExp= ruleAddExp EOF )
            // InternalRigidBodies.g:3531:2: iv_ruleAddExp= ruleAddExp EOF
            {
             newCompositeNode(grammarAccess.getAddExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddExp=ruleAddExp();

            state._fsp--;

             current =iv_ruleAddExp; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:3538:1: ruleAddExp returns [EObject current=null] : (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* ) ;
    public final EObject ruleAddExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultExp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:3541:28: ( (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* ) )
            // InternalRigidBodies.g:3542:1: (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* )
            {
            // InternalRigidBodies.g:3542:1: (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* )
            // InternalRigidBodies.g:3543:5: this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAddExpAccess().getMultExpParserRuleCall_0()); 
                
            pushFollow(FOLLOW_71);
            this_MultExp_0=ruleMultExp();

            state._fsp--;

             
                    current = this_MultExp_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalRigidBodies.g:3551:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==35) ) {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==RULE_ID||LA39_2==RULE_REAL||LA39_2==63||LA39_2==75||(LA39_2>=78 && LA39_2<=80)) ) {
                        alt39=1;
                    }


                }
                else if ( (LA39_0==75) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRigidBodies.g:3551:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) )
            	    {
            	    // InternalRigidBodies.g:3551:2: ()
            	    // InternalRigidBodies.g:3552:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalRigidBodies.g:3557:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalRigidBodies.g:3558:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalRigidBodies.g:3558:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalRigidBodies.g:3559:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalRigidBodies.g:3559:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==35) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==75) ) {
            	        alt38=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalRigidBodies.g:3560:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,35,FOLLOW_22); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getAddExpAccess().getOpPlusSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAddExpRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // InternalRigidBodies.g:3572:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,75,FOLLOW_22); 

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

            	    // InternalRigidBodies.g:3587:2: ( (lv_right_3_0= ruleMultExp ) )
            	    // InternalRigidBodies.g:3588:1: (lv_right_3_0= ruleMultExp )
            	    {
            	    // InternalRigidBodies.g:3588:1: (lv_right_3_0= ruleMultExp )
            	    // InternalRigidBodies.g:3589:3: lv_right_3_0= ruleMultExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddExpAccess().getRightMultExpParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_71);
            	    lv_right_3_0=ruleMultExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAddExpRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"uk.ac.kcl.inf.robotics.RigidBodies.MultExp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalRigidBodies.g:3613:1: entryRuleMultExp returns [EObject current=null] : iv_ruleMultExp= ruleMultExp EOF ;
    public final EObject entryRuleMultExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExp = null;


        try {
            // InternalRigidBodies.g:3614:2: (iv_ruleMultExp= ruleMultExp EOF )
            // InternalRigidBodies.g:3615:2: iv_ruleMultExp= ruleMultExp EOF
            {
             newCompositeNode(grammarAccess.getMultExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultExp=ruleMultExp();

            state._fsp--;

             current =iv_ruleMultExp; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:3622:1: ruleMultExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:3625:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalRigidBodies.g:3626:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalRigidBodies.g:3626:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalRigidBodies.g:3627:5: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultExpAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_72);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalRigidBodies.g:3635:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=76 && LA41_0<=77)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalRigidBodies.g:3635:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalRigidBodies.g:3635:2: ()
            	    // InternalRigidBodies.g:3636:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMultExpAccess().getMultExpLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalRigidBodies.g:3641:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalRigidBodies.g:3642:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalRigidBodies.g:3642:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalRigidBodies.g:3643:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalRigidBodies.g:3643:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==76) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==77) ) {
            	        alt40=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalRigidBodies.g:3644:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,76,FOLLOW_22); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getMultExpAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultExpRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // InternalRigidBodies.g:3656:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,77,FOLLOW_22); 

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

            	    // InternalRigidBodies.g:3671:2: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalRigidBodies.g:3672:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalRigidBodies.g:3672:1: (lv_right_3_0= rulePrimary )
            	    // InternalRigidBodies.g:3673:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultExpAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_72);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultExpRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"uk.ac.kcl.inf.robotics.RigidBodies.Primary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalRigidBodies.g:3697:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalRigidBodies.g:3698:2: (iv_rulePrimary= rulePrimary EOF )
            // InternalRigidBodies.g:3699:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:3706:1: rulePrimary returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_ParenthesisedExp_1= ruleParenthesisedExp | this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_ParenthesisedExp_1 = null;

        EObject this_ConstantOrFunctionCallExp_2 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:3709:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_ParenthesisedExp_1= ruleParenthesisedExp | this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp ) )
            // InternalRigidBodies.g:3710:1: (this_NumberLiteral_0= ruleNumberLiteral | this_ParenthesisedExp_1= ruleParenthesisedExp | this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp )
            {
            // InternalRigidBodies.g:3710:1: (this_NumberLiteral_0= ruleNumberLiteral | this_ParenthesisedExp_1= ruleParenthesisedExp | this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp )
            int alt42=3;
            switch ( input.LA(1) ) {
            case RULE_REAL:
            case 75:
                {
                alt42=1;
                }
                break;
            case 63:
                {
                alt42=2;
                }
                break;
            case RULE_ID:
            case 78:
            case 79:
            case 80:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalRigidBodies.g:3711:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:3721:5: this_ParenthesisedExp_1= ruleParenthesisedExp
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisedExpParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ParenthesisedExp_1=ruleParenthesisedExp();

                    state._fsp--;

                     
                            current = this_ParenthesisedExp_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalRigidBodies.g:3731:5: this_ConstantOrFunctionCallExp_2= ruleConstantOrFunctionCallExp
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getConstantOrFunctionCallExpParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalRigidBodies.g:3747:1: entryRuleParenthesisedExp returns [EObject current=null] : iv_ruleParenthesisedExp= ruleParenthesisedExp EOF ;
    public final EObject entryRuleParenthesisedExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisedExp = null;


        try {
            // InternalRigidBodies.g:3748:2: (iv_ruleParenthesisedExp= ruleParenthesisedExp EOF )
            // InternalRigidBodies.g:3749:2: iv_ruleParenthesisedExp= ruleParenthesisedExp EOF
            {
             newCompositeNode(grammarAccess.getParenthesisedExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesisedExp=ruleParenthesisedExp();

            state._fsp--;

             current =iv_ruleParenthesisedExp; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:3756:1: ruleParenthesisedExp returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesisedExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:3759:28: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')' ) )
            // InternalRigidBodies.g:3760:1: (otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')' )
            {
            // InternalRigidBodies.g:3760:1: (otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')' )
            // InternalRigidBodies.g:3760:3: otherlv_0= '(' ( (lv_exp_1_0= ruleAddExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_22); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesisedExpAccess().getLeftParenthesisKeyword_0());
                
            // InternalRigidBodies.g:3764:1: ( (lv_exp_1_0= ruleAddExp ) )
            // InternalRigidBodies.g:3765:1: (lv_exp_1_0= ruleAddExp )
            {
            // InternalRigidBodies.g:3765:1: (lv_exp_1_0= ruleAddExp )
            // InternalRigidBodies.g:3766:3: lv_exp_1_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getParenthesisedExpAccess().getExpAddExpParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_60);
            lv_exp_1_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParenthesisedExpRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_1_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,66,FOLLOW_2); 

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
    // InternalRigidBodies.g:3794:1: entryRuleConstantOrFunctionCallExp returns [EObject current=null] : iv_ruleConstantOrFunctionCallExp= ruleConstantOrFunctionCallExp EOF ;
    public final EObject entryRuleConstantOrFunctionCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantOrFunctionCallExp = null;


        try {
            // InternalRigidBodies.g:3795:2: (iv_ruleConstantOrFunctionCallExp= ruleConstantOrFunctionCallExp EOF )
            // InternalRigidBodies.g:3796:2: iv_ruleConstantOrFunctionCallExp= ruleConstantOrFunctionCallExp EOF
            {
             newCompositeNode(grammarAccess.getConstantOrFunctionCallExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantOrFunctionCallExp=ruleConstantOrFunctionCallExp();

            state._fsp--;

             current =iv_ruleConstantOrFunctionCallExp; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:3803:1: ruleConstantOrFunctionCallExp returns [EObject current=null] : ( ( ( (lv_label_0_1= RULE_ID | lv_label_0_2= 'x' | lv_label_0_3= 'y' | lv_label_0_4= 'z' ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleConstantOrFunctionCallExp() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_1=null;
        Token lv_label_0_2=null;
        Token lv_label_0_3=null;
        Token lv_label_0_4=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_2_0 = null;

        EObject lv_param_4_0 = null;


         enterRule(); 
            
        try {
            // InternalRigidBodies.g:3806:28: ( ( ( ( (lv_label_0_1= RULE_ID | lv_label_0_2= 'x' | lv_label_0_3= 'y' | lv_label_0_4= 'z' ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? ) )
            // InternalRigidBodies.g:3807:1: ( ( ( (lv_label_0_1= RULE_ID | lv_label_0_2= 'x' | lv_label_0_3= 'y' | lv_label_0_4= 'z' ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? )
            {
            // InternalRigidBodies.g:3807:1: ( ( ( (lv_label_0_1= RULE_ID | lv_label_0_2= 'x' | lv_label_0_3= 'y' | lv_label_0_4= 'z' ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? )
            // InternalRigidBodies.g:3807:2: ( ( (lv_label_0_1= RULE_ID | lv_label_0_2= 'x' | lv_label_0_3= 'y' | lv_label_0_4= 'z' ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )?
            {
            // InternalRigidBodies.g:3807:2: ( ( (lv_label_0_1= RULE_ID | lv_label_0_2= 'x' | lv_label_0_3= 'y' | lv_label_0_4= 'z' ) ) )
            // InternalRigidBodies.g:3808:1: ( (lv_label_0_1= RULE_ID | lv_label_0_2= 'x' | lv_label_0_3= 'y' | lv_label_0_4= 'z' ) )
            {
            // InternalRigidBodies.g:3808:1: ( (lv_label_0_1= RULE_ID | lv_label_0_2= 'x' | lv_label_0_3= 'y' | lv_label_0_4= 'z' ) )
            // InternalRigidBodies.g:3809:1: (lv_label_0_1= RULE_ID | lv_label_0_2= 'x' | lv_label_0_3= 'y' | lv_label_0_4= 'z' )
            {
            // InternalRigidBodies.g:3809:1: (lv_label_0_1= RULE_ID | lv_label_0_2= 'x' | lv_label_0_3= 'y' | lv_label_0_4= 'z' )
            int alt43=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt43=1;
                }
                break;
            case 78:
                {
                alt43=2;
                }
                break;
            case 79:
                {
                alt43=3;
                }
                break;
            case 80:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalRigidBodies.g:3810:3: lv_label_0_1= RULE_ID
                    {
                    lv_label_0_1=(Token)match(input,RULE_ID,FOLLOW_73); 

                    			newLeafNode(lv_label_0_1, grammarAccess.getConstantOrFunctionCallExpAccess().getLabelIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantOrFunctionCallExpRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_0_1, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:3825:8: lv_label_0_2= 'x'
                    {
                    lv_label_0_2=(Token)match(input,78,FOLLOW_73); 

                            newLeafNode(lv_label_0_2, grammarAccess.getConstantOrFunctionCallExpAccess().getLabelXKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantOrFunctionCallExpRule());
                    	        }
                           		setWithLastConsumed(current, "label", lv_label_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // InternalRigidBodies.g:3837:8: lv_label_0_3= 'y'
                    {
                    lv_label_0_3=(Token)match(input,79,FOLLOW_73); 

                            newLeafNode(lv_label_0_3, grammarAccess.getConstantOrFunctionCallExpAccess().getLabelYKeyword_0_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantOrFunctionCallExpRule());
                    	        }
                           		setWithLastConsumed(current, "label", lv_label_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // InternalRigidBodies.g:3849:8: lv_label_0_4= 'z'
                    {
                    lv_label_0_4=(Token)match(input,80,FOLLOW_73); 

                            newLeafNode(lv_label_0_4, grammarAccess.getConstantOrFunctionCallExpAccess().getLabelZKeyword_0_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantOrFunctionCallExpRule());
                    	        }
                           		setWithLastConsumed(current, "label", lv_label_0_4, null);
                    	    

                    }
                    break;

            }


            }


            }

            // InternalRigidBodies.g:3864:2: (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==63) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRigidBodies.g:3864:4: otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_22); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstantOrFunctionCallExpAccess().getLeftParenthesisKeyword_1_0());
                        
                    // InternalRigidBodies.g:3868:1: ( (lv_param_2_0= ruleAddExp ) )
                    // InternalRigidBodies.g:3869:1: (lv_param_2_0= ruleAddExp )
                    {
                    // InternalRigidBodies.g:3869:1: (lv_param_2_0= ruleAddExp )
                    // InternalRigidBodies.g:3870:3: lv_param_2_0= ruleAddExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_62);
                    lv_param_2_0=ruleAddExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantOrFunctionCallExpRule());
                    	        }
                           		add(
                           			current, 
                           			"param",
                            		lv_param_2_0, 
                            		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalRigidBodies.g:3886:2: (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==23) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalRigidBodies.g:3886:4: otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_22); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getConstantOrFunctionCallExpAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // InternalRigidBodies.g:3890:1: ( (lv_param_4_0= ruleAddExp ) )
                    	    // InternalRigidBodies.g:3891:1: (lv_param_4_0= ruleAddExp )
                    	    {
                    	    // InternalRigidBodies.g:3891:1: (lv_param_4_0= ruleAddExp )
                    	    // InternalRigidBodies.g:3892:3: lv_param_4_0= ruleAddExp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_62);
                    	    lv_param_4_0=ruleAddExp();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstantOrFunctionCallExpRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"param",
                    	            		lv_param_4_0, 
                    	            		"uk.ac.kcl.inf.robotics.RigidBodies.AddExp");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,66,FOLLOW_2); 

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
    // InternalRigidBodies.g:3920:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalRigidBodies.g:3921:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalRigidBodies.g:3922:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRigidBodies.g:3929:1: ruleNumberLiteral returns [EObject current=null] : ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_neg_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // InternalRigidBodies.g:3932:28: ( ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) )
            // InternalRigidBodies.g:3933:1: ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // InternalRigidBodies.g:3933:1: ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            // InternalRigidBodies.g:3933:2: ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) )
            {
            // InternalRigidBodies.g:3933:2: ( (lv_neg_0_0= '-' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==75) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRigidBodies.g:3934:1: (lv_neg_0_0= '-' )
                    {
                    // InternalRigidBodies.g:3934:1: (lv_neg_0_0= '-' )
                    // InternalRigidBodies.g:3935:3: lv_neg_0_0= '-'
                    {
                    lv_neg_0_0=(Token)match(input,75,FOLLOW_74); 

                            newLeafNode(lv_neg_0_0, grammarAccess.getNumberLiteralAccess().getNegHyphenMinusKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "neg", true, "-");
                    	    

                    }


                    }
                    break;

            }

            // InternalRigidBodies.g:3948:3: ( (lv_value_1_0= RULE_REAL ) )
            // InternalRigidBodies.g:3949:1: (lv_value_1_0= RULE_REAL )
            {
            // InternalRigidBodies.g:3949:1: (lv_value_1_0= RULE_REAL )
            // InternalRigidBodies.g:3950:3: lv_value_1_0= RULE_REAL
            {
            lv_value_1_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

            			newLeafNode(lv_value_1_0, grammarAccess.getNumberLiteralAccess().getValueREALTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"uk.ac.kcl.inf.robotics.RigidBodies.REAL");
            	    

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
    // InternalRigidBodies.g:3974:1: ruleAXIS returns [Enumerator current=null] : ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) ) ;
    public final Enumerator ruleAXIS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalRigidBodies.g:3976:28: ( ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) ) )
            // InternalRigidBodies.g:3977:1: ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) )
            {
            // InternalRigidBodies.g:3977:1: ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt47=1;
                }
                break;
            case 79:
                {
                alt47=2;
                }
                break;
            case 80:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalRigidBodies.g:3977:2: (enumLiteral_0= 'x' )
                    {
                    // InternalRigidBodies.g:3977:2: (enumLiteral_0= 'x' )
                    // InternalRigidBodies.g:3977:4: enumLiteral_0= 'x'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                            current = grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:3983:6: (enumLiteral_1= 'y' )
                    {
                    // InternalRigidBodies.g:3983:6: (enumLiteral_1= 'y' )
                    // InternalRigidBodies.g:3983:8: enumLiteral_1= 'y'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                            current = grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalRigidBodies.g:3989:6: (enumLiteral_2= 'z' )
                    {
                    // InternalRigidBodies.g:3989:6: (enumLiteral_2= 'z' )
                    // InternalRigidBodies.g:3989:8: enumLiteral_2= 'z'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_2); 

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
    // InternalRigidBodies.g:3999:1: ruleConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) ) ;
    public final Enumerator ruleConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalRigidBodies.g:4001:28: ( ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) ) )
            // InternalRigidBodies.g:4002:1: ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) )
            {
            // InternalRigidBodies.g:4002:1: ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==81) ) {
                alt48=1;
            }
            else if ( (LA48_0==82) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalRigidBodies.g:4002:2: (enumLiteral_0= 'geometrical' )
                    {
                    // InternalRigidBodies.g:4002:2: (enumLiteral_0= 'geometrical' )
                    // InternalRigidBodies.g:4002:4: enumLiteral_0= 'geometrical'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); 

                            current = grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:4008:6: (enumLiteral_1= 'velocity' )
                    {
                    // InternalRigidBodies.g:4008:6: (enumLiteral_1= 'velocity' )
                    // InternalRigidBodies.g:4008:8: enumLiteral_1= 'velocity'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); 

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
    // InternalRigidBodies.g:4018:1: ruleLoadType returns [Enumerator current=null] : ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) ) ;
    public final Enumerator ruleLoadType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalRigidBodies.g:4020:28: ( ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) ) )
            // InternalRigidBodies.g:4021:1: ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) )
            {
            // InternalRigidBodies.g:4021:1: ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==83) ) {
                alt49=1;
            }
            else if ( (LA49_0==84) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalRigidBodies.g:4021:2: (enumLiteral_0= 'force' )
                    {
                    // InternalRigidBodies.g:4021:2: (enumLiteral_0= 'force' )
                    // InternalRigidBodies.g:4021:4: enumLiteral_0= 'force'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

                            current = grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalRigidBodies.g:4027:6: (enumLiteral_1= 'torque' )
                    {
                    // InternalRigidBodies.g:4027:6: (enumLiteral_1= 'torque' )
                    // InternalRigidBodies.g:4027:8: enumLiteral_1= 'torque'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x041010C000003010L,0x0000000000000400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0010410000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0010410000008000L,0x0000000000000090L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100108000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000E0000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x8000000000000050L,0x000000000001C800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000034008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000030008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000C8000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000D000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x001000C000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x8000000000000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000200000800000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000800000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000040L});

}