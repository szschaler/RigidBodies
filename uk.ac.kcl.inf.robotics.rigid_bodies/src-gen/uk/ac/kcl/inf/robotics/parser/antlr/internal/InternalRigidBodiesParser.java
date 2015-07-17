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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'world'", "'{'", "'gravity'", "'}'", "'system'", "'body'", "'mass'", "'value'", "'position'", "'inertia'", "'joint'", "':'", "'start'", "'between'", "'and'", "'stiffness'", "'springCoeff'", "'springInit'", "'dampViscous'", "'dampCoulomb'", "'type'", "'revolute'", "'('", "','", "')'", "'planar'", "'with'", "'relative'", "'transformation'", "'reorient'", "'constraint'", "'external'", "'load'", "'matrix'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'x'", "'y'", "'z'", "'geometrical'", "'velocity'", "'force'", "'torque'"
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

                if ( (LA1_0==RULE_ID||LA1_0==22||LA1_0==33||LA1_0==37||(LA1_0>=45 && LA1_0<=46)) ) {
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:152:1: ruleInitialDefinition returns [EObject current=null] : (this_BaseMatrix_0= ruleBaseMatrix | this_JointType_1= ruleJointType ) ;
    public final EObject ruleInitialDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_BaseMatrix_0 = null;

        EObject this_JointType_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:155:28: ( (this_BaseMatrix_0= ruleBaseMatrix | this_JointType_1= ruleJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:156:1: (this_BaseMatrix_0= ruleBaseMatrix | this_JointType_1= ruleJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:156:1: (this_BaseMatrix_0= ruleBaseMatrix | this_JointType_1= ruleJointType )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=45 && LA3_0<=46)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||LA3_0==22||LA3_0==33||LA3_0==37) ) {
                alt3=2;
            }
            else {
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:183:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:184:2: (iv_ruleEnvironment= ruleEnvironment EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:185:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:192:1: ruleEnvironment returns [EObject current=null] : (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_gravity_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:195:28: ( (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:196:1: (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:196:1: (otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:196:3: otherlv_0= 'world' otherlv_1= '{' otherlv_2= 'gravity' ( (lv_gravity_3_0= ruleMatrix ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleEnvironment377); 

                	newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getWorldKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEnvironment389); 

                	newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEnvironment401); 

                	newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getGravityKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:208:1: ( (lv_gravity_3_0= ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:209:1: (lv_gravity_3_0= ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:209:1: (lv_gravity_3_0= ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:210:3: lv_gravity_3_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getEnvironmentAccess().getGravityMatrixParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleEnvironment422);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:238:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:239:2: (iv_ruleSystem= ruleSystem EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:240:2: iv_ruleSystem= ruleSystem EOF
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:247:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:250:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:251:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:251:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:251:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleSystemElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSystem517); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:255:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:256:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:256:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:257:3: lv_name_1_0= RULE_ID
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
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:277:1: ( (lv_elements_3_0= ruleSystemElement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||LA4_0==22||(LA4_0>=42 && LA4_0<=43)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:278:1: (lv_elements_3_0= ruleSystemElement )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:278:1: (lv_elements_3_0= ruleSystemElement )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:279:3: lv_elements_3_0= ruleSystemElement
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:307:1: entryRuleSystemElement returns [EObject current=null] : iv_ruleSystemElement= ruleSystemElement EOF ;
    public final EObject entryRuleSystemElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemElement = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:308:2: (iv_ruleSystemElement= ruleSystemElement EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:309:2: iv_ruleSystemElement= ruleSystemElement EOF
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:316:1: ruleSystemElement returns [EObject current=null] : (this_Body_0= ruleBody | this_Joint_1= ruleJoint | this_Constraint_2= ruleConstraint | this_ExternalLoad_3= ruleExternalLoad ) ;
    public final EObject ruleSystemElement() throws RecognitionException {
        EObject current = null;

        EObject this_Body_0 = null;

        EObject this_Joint_1 = null;

        EObject this_Constraint_2 = null;

        EObject this_ExternalLoad_3 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:319:28: ( (this_Body_0= ruleBody | this_Joint_1= ruleJoint | this_Constraint_2= ruleConstraint | this_ExternalLoad_3= ruleExternalLoad ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:320:1: (this_Body_0= ruleBody | this_Joint_1= ruleJoint | this_Constraint_2= ruleConstraint | this_ExternalLoad_3= ruleExternalLoad )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:320:1: (this_Body_0= ruleBody | this_Joint_1= ruleJoint | this_Constraint_2= ruleConstraint | this_ExternalLoad_3= ruleExternalLoad )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 42:
                {
                alt5=3;
                }
                break;
            case 43:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:321:5: this_Body_0= ruleBody
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:331:5: this_Joint_1= ruleJoint
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:341:5: this_Constraint_2= ruleConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getSystemElementAccess().getConstraintParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConstraint_in_ruleSystemElement732);
                    this_Constraint_2=ruleConstraint();

                    state._fsp--;

                     
                            current = this_Constraint_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:351:5: this_ExternalLoad_3= ruleExternalLoad
                    {
                     
                            newCompositeNode(grammarAccess.getSystemElementAccess().getExternalLoadParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleExternalLoad_in_ruleSystemElement759);
                    this_ExternalLoad_3=ruleExternalLoad();

                    state._fsp--;

                     
                            current = this_ExternalLoad_3; 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:367:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:368:2: (iv_ruleBody= ruleBody EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:369:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody794);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody804); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:376:1: ruleBody returns [EObject current=null] : (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mass_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:379:28: ( (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:380:1: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:380:1: (otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:380:3: otherlv_0= 'body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mass_3_0= ruleMass ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleBody841); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getBodyKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:384:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:385:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:385:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:386:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBody858); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleBody875); 

                	newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:406:1: ( (lv_mass_3_0= ruleMass ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:407:1: (lv_mass_3_0= ruleMass )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:407:1: (lv_mass_3_0= ruleMass )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:408:3: lv_mass_3_0= ruleMass
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getMassMassParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMass_in_ruleBody896);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleBody908); 

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


    // $ANTLR start "entryRuleMass"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:436:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:437:2: (iv_ruleMass= ruleMass EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:438:2: iv_ruleMass= ruleMass EOF
            {
             newCompositeNode(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_ruleMass_in_entryRuleMass944);
            iv_ruleMass=ruleMass();

            state._fsp--;

             current =iv_ruleMass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMass954); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:445:1: ruleMass returns [EObject current=null] : (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' ) ;
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
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:448:28: ( (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:449:1: (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:449:1: (otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:449:3: otherlv_0= 'mass' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleAddExp ) ) otherlv_4= 'position' ( (lv_position_5_0= ruleMatrix ) ) otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleMatrix ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleMass991); 

                	newLeafNode(otherlv_0, grammarAccess.getMassAccess().getMassKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleMass1003); 

                	newLeafNode(otherlv_1, grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleMass1015); 

                	newLeafNode(otherlv_2, grammarAccess.getMassAccess().getValueKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:461:1: ( (lv_value_3_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:462:1: (lv_value_3_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:462:1: (lv_value_3_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:463:3: lv_value_3_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getValueAddExpParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleMass1036);
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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleMass1048); 

                	newLeafNode(otherlv_4, grammarAccess.getMassAccess().getPositionKeyword_4());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:483:1: ( (lv_position_5_0= ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:484:1: (lv_position_5_0= ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:484:1: (lv_position_5_0= ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:485:3: lv_position_5_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getPositionMatrixParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleMass1069);
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

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleMass1081); 

                	newLeafNode(otherlv_6, grammarAccess.getMassAccess().getInertiaKeyword_6());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:505:1: ( (lv_inertia_7_0= ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:506:1: (lv_inertia_7_0= ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:506:1: (lv_inertia_7_0= ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:507:3: lv_inertia_7_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getMassAccess().getInertiaMatrixParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleMass1102);
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

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleMass1114); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:535:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:536:2: (iv_ruleJoint= ruleJoint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:537:2: iv_ruleJoint= ruleJoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_ruleJoint_in_entryRuleJoint1150);
            iv_ruleJoint=ruleJoint();

            state._fsp--;

             current =iv_ruleJoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoint1160); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:544:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (otherlv_6= RULE_ID ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (otherlv_9= RULE_ID ) ) ( (lv_relTrans2_10_0= ruleRelativeTransformation ) ) otherlv_11= 'stiffness' otherlv_12= '{' otherlv_13= 'springCoeff' ( (lv_springCoeff_14_0= ruleAddExp ) ) otherlv_15= 'springInit' ( (lv_springInit_16_0= ruleAddExp ) ) otherlv_17= 'dampViscous' ( (lv_dampViscous_18_0= ruleAddExp ) ) otherlv_19= 'dampCoulomb' ( (lv_dampCoulomb_20_0= ruleAddExp ) ) otherlv_21= '}' ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_isStart_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_type_3_0 = null;

        EObject lv_relTrans1_7_0 = null;

        EObject lv_relTrans2_10_0 = null;

        EObject lv_springCoeff_14_0 = null;

        EObject lv_springInit_16_0 = null;

        EObject lv_dampViscous_18_0 = null;

        EObject lv_dampCoulomb_20_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:547:28: ( (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (otherlv_6= RULE_ID ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (otherlv_9= RULE_ID ) ) ( (lv_relTrans2_10_0= ruleRelativeTransformation ) ) otherlv_11= 'stiffness' otherlv_12= '{' otherlv_13= 'springCoeff' ( (lv_springCoeff_14_0= ruleAddExp ) ) otherlv_15= 'springInit' ( (lv_springInit_16_0= ruleAddExp ) ) otherlv_17= 'dampViscous' ( (lv_dampViscous_18_0= ruleAddExp ) ) otherlv_19= 'dampCoulomb' ( (lv_dampCoulomb_20_0= ruleAddExp ) ) otherlv_21= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:548:1: (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (otherlv_6= RULE_ID ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (otherlv_9= RULE_ID ) ) ( (lv_relTrans2_10_0= ruleRelativeTransformation ) ) otherlv_11= 'stiffness' otherlv_12= '{' otherlv_13= 'springCoeff' ( (lv_springCoeff_14_0= ruleAddExp ) ) otherlv_15= 'springInit' ( (lv_springInit_16_0= ruleAddExp ) ) otherlv_17= 'dampViscous' ( (lv_dampViscous_18_0= ruleAddExp ) ) otherlv_19= 'dampCoulomb' ( (lv_dampCoulomb_20_0= ruleAddExp ) ) otherlv_21= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:548:1: (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (otherlv_6= RULE_ID ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (otherlv_9= RULE_ID ) ) ( (lv_relTrans2_10_0= ruleRelativeTransformation ) ) otherlv_11= 'stiffness' otherlv_12= '{' otherlv_13= 'springCoeff' ( (lv_springCoeff_14_0= ruleAddExp ) ) otherlv_15= 'springInit' ( (lv_springInit_16_0= ruleAddExp ) ) otherlv_17= 'dampViscous' ( (lv_dampViscous_18_0= ruleAddExp ) ) otherlv_19= 'dampCoulomb' ( (lv_dampCoulomb_20_0= ruleAddExp ) ) otherlv_21= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:548:3: otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleJointType ) ) ( (lv_isStart_4_0= 'start' ) )? otherlv_5= 'between' ( (otherlv_6= RULE_ID ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (otherlv_9= RULE_ID ) ) ( (lv_relTrans2_10_0= ruleRelativeTransformation ) ) otherlv_11= 'stiffness' otherlv_12= '{' otherlv_13= 'springCoeff' ( (lv_springCoeff_14_0= ruleAddExp ) ) otherlv_15= 'springInit' ( (lv_springInit_16_0= ruleAddExp ) ) otherlv_17= 'dampViscous' ( (lv_dampViscous_18_0= ruleAddExp ) ) otherlv_19= 'dampCoulomb' ( (lv_dampCoulomb_20_0= ruleAddExp ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleJoint1197); 

                	newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:552:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:553:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:553:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:554:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJoint1214); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleJoint1231); 

                	newLeafNode(otherlv_2, grammarAccess.getJointAccess().getColonKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:574:1: ( (lv_type_3_0= ruleJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:575:1: (lv_type_3_0= ruleJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:575:1: (lv_type_3_0= ruleJointType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:576:3: lv_type_3_0= ruleJointType
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleJointType_in_ruleJoint1252);
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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:592:2: ( (lv_isStart_4_0= 'start' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:593:1: (lv_isStart_4_0= 'start' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:593:1: (lv_isStart_4_0= 'start' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:594:3: lv_isStart_4_0= 'start'
                    {
                    lv_isStart_4_0=(Token)match(input,24,FOLLOW_24_in_ruleJoint1270); 

                            newLeafNode(lv_isStart_4_0, grammarAccess.getJointAccess().getIsStartStartKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJointRule());
                    	        }
                           		setWithLastConsumed(current, "isStart", true, "start");
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleJoint1296); 

                	newLeafNode(otherlv_5, grammarAccess.getJointAccess().getBetweenKeyword_5());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:611:1: ( (otherlv_6= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:612:1: (otherlv_6= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:612:1: (otherlv_6= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:613:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJointRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJoint1316); 

            		newLeafNode(otherlv_6, grammarAccess.getJointAccess().getBody1BodyCrossReference_6_0()); 
            	

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:624:2: ( (lv_relTrans1_7_0= ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:625:1: (lv_relTrans1_7_0= ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:625:1: (lv_relTrans1_7_0= ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:626:3: lv_relTrans1_7_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getRelTrans1RelativeTransformationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleRelativeTransformation_in_ruleJoint1337);
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

            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleJoint1349); 

                	newLeafNode(otherlv_8, grammarAccess.getJointAccess().getAndKeyword_8());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:646:1: ( (otherlv_9= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:647:1: (otherlv_9= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:647:1: (otherlv_9= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:648:3: otherlv_9= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getJointRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJoint1369); 

            		newLeafNode(otherlv_9, grammarAccess.getJointAccess().getBody2BodyCrossReference_9_0()); 
            	

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:659:2: ( (lv_relTrans2_10_0= ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:660:1: (lv_relTrans2_10_0= ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:660:1: (lv_relTrans2_10_0= ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:661:3: lv_relTrans2_10_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getRelTrans2RelativeTransformationParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleRelativeTransformation_in_ruleJoint1390);
            lv_relTrans2_10_0=ruleRelativeTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"relTrans2",
                    		lv_relTrans2_10_0, 
                    		"RelativeTransformation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,27,FOLLOW_27_in_ruleJoint1402); 

                	newLeafNode(otherlv_11, grammarAccess.getJointAccess().getStiffnessKeyword_11());
                
            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleJoint1414); 

                	newLeafNode(otherlv_12, grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_12());
                
            otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleJoint1426); 

                	newLeafNode(otherlv_13, grammarAccess.getJointAccess().getSpringCoeffKeyword_13());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:689:1: ( (lv_springCoeff_14_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:690:1: (lv_springCoeff_14_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:690:1: (lv_springCoeff_14_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:691:3: lv_springCoeff_14_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getSpringCoeffAddExpParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleJoint1447);
            lv_springCoeff_14_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"springCoeff",
                    		lv_springCoeff_14_0, 
                    		"AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,29,FOLLOW_29_in_ruleJoint1459); 

                	newLeafNode(otherlv_15, grammarAccess.getJointAccess().getSpringInitKeyword_15());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:711:1: ( (lv_springInit_16_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:712:1: (lv_springInit_16_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:712:1: (lv_springInit_16_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:713:3: lv_springInit_16_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getSpringInitAddExpParserRuleCall_16_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleJoint1480);
            lv_springInit_16_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"springInit",
                    		lv_springInit_16_0, 
                    		"AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_17=(Token)match(input,30,FOLLOW_30_in_ruleJoint1492); 

                	newLeafNode(otherlv_17, grammarAccess.getJointAccess().getDampViscousKeyword_17());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:733:1: ( (lv_dampViscous_18_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:734:1: (lv_dampViscous_18_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:734:1: (lv_dampViscous_18_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:735:3: lv_dampViscous_18_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getDampViscousAddExpParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleJoint1513);
            lv_dampViscous_18_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"dampViscous",
                    		lv_dampViscous_18_0, 
                    		"AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_19=(Token)match(input,31,FOLLOW_31_in_ruleJoint1525); 

                	newLeafNode(otherlv_19, grammarAccess.getJointAccess().getDampCoulombKeyword_19());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:755:1: ( (lv_dampCoulomb_20_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:756:1: (lv_dampCoulomb_20_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:756:1: (lv_dampCoulomb_20_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:757:3: lv_dampCoulomb_20_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getJointAccess().getDampCoulombAddExpParserRuleCall_20_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleJoint1546);
            lv_dampCoulomb_20_0=ruleAddExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointRule());
            	        }
                   		set(
                   			current, 
                   			"dampCoulomb",
                    		lv_dampCoulomb_20_0, 
                    		"AddExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleJoint1558); 

                	newLeafNode(otherlv_21, grammarAccess.getJointAccess().getRightCurlyBracketKeyword_21());
                

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:785:1: entryRuleJointType returns [EObject current=null] : iv_ruleJointType= ruleJointType EOF ;
    public final EObject entryRuleJointType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointType = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:786:2: (iv_ruleJointType= ruleJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:787:2: iv_ruleJointType= ruleJointType EOF
            {
             newCompositeNode(grammarAccess.getJointTypeRule()); 
            pushFollow(FOLLOW_ruleJointType_in_entryRuleJointType1594);
            iv_ruleJointType=ruleJointType();

            state._fsp--;

             current =iv_ruleJointType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointType1604); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:794:1: ruleJointType returns [EObject current=null] : ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleJointTypeExpression ) ) ) ;
    public final EObject ruleJointType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:797:28: ( ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleJointTypeExpression ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:798:1: ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleJointTypeExpression ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:798:1: ( (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleJointTypeExpression ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:798:2: (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_exp_3_0= ruleJointTypeExpression ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:798:2: (otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:798:4: otherlv_0= 'joint' otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleJointType1642); 

                        	newLeafNode(otherlv_0, grammarAccess.getJointTypeAccess().getJointKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleJointType1654); 

                        	newLeafNode(otherlv_1, grammarAccess.getJointTypeAccess().getTypeKeyword_0_1());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:806:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:807:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:807:1: (lv_name_2_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:808:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJointType1671); 

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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:824:4: ( (lv_exp_3_0= ruleJointTypeExpression ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:825:1: (lv_exp_3_0= ruleJointTypeExpression )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:825:1: (lv_exp_3_0= ruleJointTypeExpression )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:826:3: lv_exp_3_0= ruleJointTypeExpression
            {
             
            	        newCompositeNode(grammarAccess.getJointTypeAccess().getExpJointTypeExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJointTypeExpression_in_ruleJointType1699);
            lv_exp_3_0=ruleJointTypeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJointTypeRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_3_0, 
                    		"JointTypeExpression");
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


    // $ANTLR start "entryRuleJointTypeExpression"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:850:1: entryRuleJointTypeExpression returns [EObject current=null] : iv_ruleJointTypeExpression= ruleJointTypeExpression EOF ;
    public final EObject entryRuleJointTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointTypeExpression = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:851:2: (iv_ruleJointTypeExpression= ruleJointTypeExpression EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:852:2: iv_ruleJointTypeExpression= ruleJointTypeExpression EOF
            {
             newCompositeNode(grammarAccess.getJointTypeExpressionRule()); 
            pushFollow(FOLLOW_ruleJointTypeExpression_in_entryRuleJointTypeExpression1735);
            iv_ruleJointTypeExpression=ruleJointTypeExpression();

            state._fsp--;

             current =iv_ruleJointTypeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointTypeExpression1745); 

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
    // $ANTLR end "entryRuleJointTypeExpression"


    // $ANTLR start "ruleJointTypeExpression"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:859:1: ruleJointTypeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'revolute' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) (otherlv_4= ',' ( (lv_axis_5_0= ruleAXIS ) ) )* otherlv_6= ')' ) | (otherlv_7= 'planar' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) (otherlv_10= ',' ( (lv_axis_11_0= ruleAXIS ) ) )* otherlv_12= ')' ) ) ;
    public final EObject ruleJointTypeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_axis_3_0 = null;

        Enumerator lv_axis_5_0 = null;

        Enumerator lv_axis_9_0 = null;

        Enumerator lv_axis_11_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:862:28: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'revolute' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) (otherlv_4= ',' ( (lv_axis_5_0= ruleAXIS ) ) )* otherlv_6= ')' ) | (otherlv_7= 'planar' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) (otherlv_10= ',' ( (lv_axis_11_0= ruleAXIS ) ) )* otherlv_12= ')' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:863:1: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'revolute' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) (otherlv_4= ',' ( (lv_axis_5_0= ruleAXIS ) ) )* otherlv_6= ')' ) | (otherlv_7= 'planar' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) (otherlv_10= ',' ( (lv_axis_11_0= ruleAXIS ) ) )* otherlv_12= ')' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:863:1: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'revolute' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) (otherlv_4= ',' ( (lv_axis_5_0= ruleAXIS ) ) )* otherlv_6= ')' ) | (otherlv_7= 'planar' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) (otherlv_10= ',' ( (lv_axis_11_0= ruleAXIS ) ) )* otherlv_12= ')' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case 33:
                {
                alt10=2;
                }
                break;
            case 37:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:863:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:863:2: ( (otherlv_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:864:1: (otherlv_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:864:1: (otherlv_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:865:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getJointTypeExpressionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJointTypeExpression1790); 

                    		newLeafNode(otherlv_0, grammarAccess.getJointTypeExpressionAccess().getRefJointTypeCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:877:6: (otherlv_1= 'revolute' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) (otherlv_4= ',' ( (lv_axis_5_0= ruleAXIS ) ) )* otherlv_6= ')' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:877:6: (otherlv_1= 'revolute' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) (otherlv_4= ',' ( (lv_axis_5_0= ruleAXIS ) ) )* otherlv_6= ')' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:877:8: otherlv_1= 'revolute' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) (otherlv_4= ',' ( (lv_axis_5_0= ruleAXIS ) ) )* otherlv_6= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleJointTypeExpression1809); 

                        	newLeafNode(otherlv_1, grammarAccess.getJointTypeExpressionAccess().getRevoluteKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleJointTypeExpression1821); 

                        	newLeafNode(otherlv_2, grammarAccess.getJointTypeExpressionAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:885:1: ( (lv_axis_3_0= ruleAXIS ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:886:1: (lv_axis_3_0= ruleAXIS )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:886:1: (lv_axis_3_0= ruleAXIS )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:887:3: lv_axis_3_0= ruleAXIS
                    {
                     
                    	        newCompositeNode(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAXIS_in_ruleJointTypeExpression1842);
                    lv_axis_3_0=ruleAXIS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJointTypeExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"axis",
                            		lv_axis_3_0, 
                            		"AXIS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:903:2: (otherlv_4= ',' ( (lv_axis_5_0= ruleAXIS ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==35) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:903:4: otherlv_4= ',' ( (lv_axis_5_0= ruleAXIS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleJointTypeExpression1855); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getJointTypeExpressionAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:907:1: ( (lv_axis_5_0= ruleAXIS ) )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:908:1: (lv_axis_5_0= ruleAXIS )
                    	    {
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:908:1: (lv_axis_5_0= ruleAXIS )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:909:3: lv_axis_5_0= ruleAXIS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAXIS_in_ruleJointTypeExpression1876);
                    	    lv_axis_5_0=ruleAXIS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getJointTypeExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"axis",
                    	            		lv_axis_5_0, 
                    	            		"AXIS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleJointTypeExpression1890); 

                        	newLeafNode(otherlv_6, grammarAccess.getJointTypeExpressionAccess().getRightParenthesisKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:930:6: (otherlv_7= 'planar' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) (otherlv_10= ',' ( (lv_axis_11_0= ruleAXIS ) ) )* otherlv_12= ')' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:930:6: (otherlv_7= 'planar' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) (otherlv_10= ',' ( (lv_axis_11_0= ruleAXIS ) ) )* otherlv_12= ')' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:930:8: otherlv_7= 'planar' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) (otherlv_10= ',' ( (lv_axis_11_0= ruleAXIS ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleJointTypeExpression1910); 

                        	newLeafNode(otherlv_7, grammarAccess.getJointTypeExpressionAccess().getPlanarKeyword_2_0());
                        
                    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleJointTypeExpression1922); 

                        	newLeafNode(otherlv_8, grammarAccess.getJointTypeExpressionAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:938:1: ( (lv_axis_9_0= ruleAXIS ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:939:1: (lv_axis_9_0= ruleAXIS )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:939:1: (lv_axis_9_0= ruleAXIS )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:940:3: lv_axis_9_0= ruleAXIS
                    {
                     
                    	        newCompositeNode(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAXIS_in_ruleJointTypeExpression1943);
                    lv_axis_9_0=ruleAXIS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJointTypeExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"axis",
                            		lv_axis_9_0, 
                            		"AXIS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:956:2: (otherlv_10= ',' ( (lv_axis_11_0= ruleAXIS ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==35) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:956:4: otherlv_10= ',' ( (lv_axis_11_0= ruleAXIS ) )
                    	    {
                    	    otherlv_10=(Token)match(input,35,FOLLOW_35_in_ruleJointTypeExpression1956); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getJointTypeExpressionAccess().getCommaKeyword_2_3_0());
                    	        
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:960:1: ( (lv_axis_11_0= ruleAXIS ) )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:961:1: (lv_axis_11_0= ruleAXIS )
                    	    {
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:961:1: (lv_axis_11_0= ruleAXIS )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:962:3: lv_axis_11_0= ruleAXIS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAXIS_in_ruleJointTypeExpression1977);
                    	    lv_axis_11_0=ruleAXIS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getJointTypeExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"axis",
                    	            		lv_axis_11_0, 
                    	            		"AXIS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleJointTypeExpression1991); 

                        	newLeafNode(otherlv_12, grammarAccess.getJointTypeExpressionAccess().getRightParenthesisKeyword_2_4());
                        

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
    // $ANTLR end "ruleJointTypeExpression"


    // $ANTLR start "entryRuleRelativeTransformation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:990:1: entryRuleRelativeTransformation returns [EObject current=null] : iv_ruleRelativeTransformation= ruleRelativeTransformation EOF ;
    public final EObject entryRuleRelativeTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeTransformation = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:991:2: (iv_ruleRelativeTransformation= ruleRelativeTransformation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:992:2: iv_ruleRelativeTransformation= ruleRelativeTransformation EOF
            {
             newCompositeNode(grammarAccess.getRelativeTransformationRule()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_entryRuleRelativeTransformation2028);
            iv_ruleRelativeTransformation=ruleRelativeTransformation();

            state._fsp--;

             current =iv_ruleRelativeTransformation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeTransformation2038); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:999:1: ruleRelativeTransformation returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' ) ;
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
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1002:28: ( (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1003:1: (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1003:1: (otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1003:3: otherlv_0= '(' otherlv_1= 'with' otherlv_2= 'relative' otherlv_3= 'transformation' ( (lv_position_4_0= ruleMatrix ) ) otherlv_5= ',' ( (lv_reorient_6_0= ruleReorientation ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleRelativeTransformation2075); 

                	newLeafNode(otherlv_0, grammarAccess.getRelativeTransformationAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleRelativeTransformation2087); 

                	newLeafNode(otherlv_1, grammarAccess.getRelativeTransformationAccess().getWithKeyword_1());
                
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleRelativeTransformation2099); 

                	newLeafNode(otherlv_2, grammarAccess.getRelativeTransformationAccess().getRelativeKeyword_2());
                
            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleRelativeTransformation2111); 

                	newLeafNode(otherlv_3, grammarAccess.getRelativeTransformationAccess().getTransformationKeyword_3());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1019:1: ( (lv_position_4_0= ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1020:1: (lv_position_4_0= ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1020:1: (lv_position_4_0= ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1021:3: lv_position_4_0= ruleMatrix
            {
             
            	        newCompositeNode(grammarAccess.getRelativeTransformationAccess().getPositionMatrixParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMatrix_in_ruleRelativeTransformation2132);
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

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleRelativeTransformation2144); 

                	newLeafNode(otherlv_5, grammarAccess.getRelativeTransformationAccess().getCommaKeyword_5());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1041:1: ( (lv_reorient_6_0= ruleReorientation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1042:1: (lv_reorient_6_0= ruleReorientation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1042:1: (lv_reorient_6_0= ruleReorientation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1043:3: lv_reorient_6_0= ruleReorientation
            {
             
            	        newCompositeNode(grammarAccess.getRelativeTransformationAccess().getReorientReorientationParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleReorientation_in_ruleRelativeTransformation2165);
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

            otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleRelativeTransformation2177); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1071:1: entryRuleReorientation returns [EObject current=null] : iv_ruleReorientation= ruleReorientation EOF ;
    public final EObject entryRuleReorientation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReorientation = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1072:2: (iv_ruleReorientation= ruleReorientation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1073:2: iv_ruleReorientation= ruleReorientation EOF
            {
             newCompositeNode(grammarAccess.getReorientationRule()); 
            pushFollow(FOLLOW_ruleReorientation_in_entryRuleReorientation2213);
            iv_ruleReorientation=ruleReorientation();

            state._fsp--;

             current =iv_ruleReorientation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientation2223); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1080:1: ruleReorientation returns [EObject current=null] : ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) ) ;
    public final EObject ruleReorientation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1083:28: ( ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1084:1: ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1084:1: ( (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1084:2: (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )? ( (lv_exp_2_0= ruleReorientExpression ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1084:2: (otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1084:4: otherlv_0= 'reorient' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleReorientation2261); 

                        	newLeafNode(otherlv_0, grammarAccess.getReorientationAccess().getReorientKeyword_0_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1088:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1089:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1089:1: (lv_name_1_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1090:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReorientation2278); 

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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1106:4: ( (lv_exp_2_0= ruleReorientExpression ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1107:1: (lv_exp_2_0= ruleReorientExpression )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1107:1: (lv_exp_2_0= ruleReorientExpression )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1108:3: lv_exp_2_0= ruleReorientExpression
            {
             
            	        newCompositeNode(grammarAccess.getReorientationAccess().getExpReorientExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReorientExpression_in_ruleReorientation2306);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1132:1: entryRuleReorientExpression returns [EObject current=null] : iv_ruleReorientExpression= ruleReorientExpression EOF ;
    public final EObject entryRuleReorientExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReorientExpression = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1133:2: (iv_ruleReorientExpression= ruleReorientExpression EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1134:2: iv_ruleReorientExpression= ruleReorientExpression EOF
            {
             newCompositeNode(grammarAccess.getReorientExpressionRule()); 
            pushFollow(FOLLOW_ruleReorientExpression_in_entryRuleReorientExpression2342);
            iv_ruleReorientExpression=ruleReorientExpression();

            state._fsp--;

             current =iv_ruleReorientExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientExpression2352); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1141:1: ruleReorientExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* otherlv_13= ')' ) ) ;
    public final EObject ruleReorientExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
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
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1144:28: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* otherlv_13= ')' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1145:1: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* otherlv_13= ')' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1145:1: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* otherlv_13= ')' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1145:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1145:2: ( (otherlv_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1146:1: (otherlv_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1146:1: (otherlv_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1147:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReorientExpressionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReorientExpression2397); 

                    		newLeafNode(otherlv_0, grammarAccess.getReorientExpressionAccess().getRefReorientationCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1159:6: (otherlv_1= '(' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* otherlv_13= ')' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1159:6: (otherlv_1= '(' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* otherlv_13= ')' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1159:8: otherlv_1= '(' otherlv_2= '(' ( (lv_axis_3_0= ruleAXIS ) ) otherlv_4= ',' ( (lv_value_5_0= ruleAddExp ) ) otherlv_6= ')' (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )* otherlv_13= ')'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleReorientExpression2416); 

                        	newLeafNode(otherlv_1, grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleReorientExpression2428); 

                        	newLeafNode(otherlv_2, grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1167:1: ( (lv_axis_3_0= ruleAXIS ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1168:1: (lv_axis_3_0= ruleAXIS )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1168:1: (lv_axis_3_0= ruleAXIS )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1169:3: lv_axis_3_0= ruleAXIS
                    {
                     
                    	        newCompositeNode(grammarAccess.getReorientExpressionAccess().getAxisAXISEnumRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAXIS_in_ruleReorientExpression2449);
                    lv_axis_3_0=ruleAXIS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReorientExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"axis",
                            		lv_axis_3_0, 
                            		"AXIS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleReorientExpression2461); 

                        	newLeafNode(otherlv_4, grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_3());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1189:1: ( (lv_value_5_0= ruleAddExp ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1190:1: (lv_value_5_0= ruleAddExp )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1190:1: (lv_value_5_0= ruleAddExp )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1191:3: lv_value_5_0= ruleAddExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getReorientExpressionAccess().getValueAddExpParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddExp_in_ruleReorientExpression2482);
                    lv_value_5_0=ruleAddExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReorientExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"AddExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleReorientExpression2494); 

                        	newLeafNode(otherlv_6, grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_5());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1211:1: (otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==35) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1211:3: otherlv_7= ',' otherlv_8= '(' ( (lv_axis_9_0= ruleAXIS ) ) otherlv_10= ',' ( (lv_value_11_0= ruleAddExp ) ) otherlv_12= ')'
                    	    {
                    	    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleReorientExpression2507); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_6_0());
                    	        
                    	    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleReorientExpression2519); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_6_1());
                    	        
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1219:1: ( (lv_axis_9_0= ruleAXIS ) )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1220:1: (lv_axis_9_0= ruleAXIS )
                    	    {
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1220:1: (lv_axis_9_0= ruleAXIS )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1221:3: lv_axis_9_0= ruleAXIS
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getReorientExpressionAccess().getAxisAXISEnumRuleCall_1_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAXIS_in_ruleReorientExpression2540);
                    	    lv_axis_9_0=ruleAXIS();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getReorientExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"axis",
                    	            		lv_axis_9_0, 
                    	            		"AXIS");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_10=(Token)match(input,35,FOLLOW_35_in_ruleReorientExpression2552); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_6_3());
                    	        
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1241:1: ( (lv_value_11_0= ruleAddExp ) )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1242:1: (lv_value_11_0= ruleAddExp )
                    	    {
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1242:1: (lv_value_11_0= ruleAddExp )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1243:3: lv_value_11_0= ruleAddExp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getReorientExpressionAccess().getValueAddExpParserRuleCall_1_6_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddExp_in_ruleReorientExpression2573);
                    	    lv_value_11_0=ruleAddExp();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getReorientExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"value",
                    	            		lv_value_11_0, 
                    	            		"AddExp");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleReorientExpression2585); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_6_5());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,36,FOLLOW_36_in_ruleReorientExpression2599); 

                        	newLeafNode(otherlv_13, grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_7());
                        

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1275:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1276:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1277:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint2636);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint2646); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1284:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (otherlv_5= RULE_ID ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (otherlv_8= RULE_ID ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_relTrans1_6_0 = null;

        EObject lv_relTrans2_9_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1287:28: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (otherlv_5= RULE_ID ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (otherlv_8= RULE_ID ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1288:1: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (otherlv_5= RULE_ID ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (otherlv_8= RULE_ID ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1288:1: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (otherlv_5= RULE_ID ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (otherlv_8= RULE_ID ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1288:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleConstraintType ) ) otherlv_4= 'between' ( (otherlv_5= RULE_ID ) ) ( (lv_relTrans1_6_0= ruleRelativeTransformation ) ) otherlv_7= 'and' ( (otherlv_8= RULE_ID ) ) ( (lv_relTrans2_9_0= ruleRelativeTransformation ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleConstraint2683); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1292:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1293:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1293:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1294:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint2700); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleConstraint2717); 

                	newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getColonKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1314:1: ( (lv_type_3_0= ruleConstraintType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1315:1: (lv_type_3_0= ruleConstraintType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1315:1: (lv_type_3_0= ruleConstraintType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1316:3: lv_type_3_0= ruleConstraintType
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintType_in_ruleConstraint2738);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleConstraint2750); 

                	newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getBetweenKeyword_4());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1336:1: ( (otherlv_5= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1337:1: (otherlv_5= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1337:1: (otherlv_5= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1338:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint2770); 

            		newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getBody1BodyCrossReference_5_0()); 
            	

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1349:2: ( (lv_relTrans1_6_0= ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1350:1: (lv_relTrans1_6_0= ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1350:1: (lv_relTrans1_6_0= ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1351:3: lv_relTrans1_6_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getRelTrans1RelativeTransformationParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleRelativeTransformation_in_ruleConstraint2791);
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

            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleConstraint2803); 

                	newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getAndKeyword_7());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1371:1: ( (otherlv_8= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1372:1: (otherlv_8= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1372:1: (otherlv_8= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1373:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint2823); 

            		newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getBody2BodyCrossReference_8_0()); 
            	

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1384:2: ( (lv_relTrans2_9_0= ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1385:1: (lv_relTrans2_9_0= ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1385:1: (lv_relTrans2_9_0= ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1386:3: lv_relTrans2_9_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getRelTrans2RelativeTransformationParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleRelativeTransformation_in_ruleConstraint2844);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1410:1: entryRuleExternalLoad returns [EObject current=null] : iv_ruleExternalLoad= ruleExternalLoad EOF ;
    public final EObject entryRuleExternalLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalLoad = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1411:2: (iv_ruleExternalLoad= ruleExternalLoad EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1412:2: iv_ruleExternalLoad= ruleExternalLoad EOF
            {
             newCompositeNode(grammarAccess.getExternalLoadRule()); 
            pushFollow(FOLLOW_ruleExternalLoad_in_entryRuleExternalLoad2880);
            iv_ruleExternalLoad=ruleExternalLoad();

            state._fsp--;

             current =iv_ruleExternalLoad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalLoad2890); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1419:1: ruleExternalLoad returns [EObject current=null] : (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'between' ( (otherlv_6= RULE_ID ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (otherlv_9= RULE_ID ) ) ( (lv_relTrans2_10_0= ruleRelativeTransformation ) ) ) ;
    public final EObject ruleExternalLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_relTrans1_7_0 = null;

        EObject lv_relTrans2_10_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1422:28: ( (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'between' ( (otherlv_6= RULE_ID ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (otherlv_9= RULE_ID ) ) ( (lv_relTrans2_10_0= ruleRelativeTransformation ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1423:1: (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'between' ( (otherlv_6= RULE_ID ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (otherlv_9= RULE_ID ) ) ( (lv_relTrans2_10_0= ruleRelativeTransformation ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1423:1: (otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'between' ( (otherlv_6= RULE_ID ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (otherlv_9= RULE_ID ) ) ( (lv_relTrans2_10_0= ruleRelativeTransformation ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1423:3: otherlv_0= 'external' otherlv_1= 'load' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleLoadType ) ) otherlv_5= 'between' ( (otherlv_6= RULE_ID ) ) ( (lv_relTrans1_7_0= ruleRelativeTransformation ) ) otherlv_8= 'and' ( (otherlv_9= RULE_ID ) ) ( (lv_relTrans2_10_0= ruleRelativeTransformation ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleExternalLoad2927); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalLoadAccess().getExternalKeyword_0());
                
            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleExternalLoad2939); 

                	newLeafNode(otherlv_1, grammarAccess.getExternalLoadAccess().getLoadKeyword_1());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1431:1: ( (lv_name_2_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1432:1: (lv_name_2_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1432:1: (lv_name_2_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1433:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalLoad2956); 

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

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleExternalLoad2973); 

                	newLeafNode(otherlv_3, grammarAccess.getExternalLoadAccess().getColonKeyword_3());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1453:1: ( (lv_type_4_0= ruleLoadType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1454:1: (lv_type_4_0= ruleLoadType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1454:1: (lv_type_4_0= ruleLoadType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1455:3: lv_type_4_0= ruleLoadType
            {
             
            	        newCompositeNode(grammarAccess.getExternalLoadAccess().getTypeLoadTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleLoadType_in_ruleExternalLoad2994);
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

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleExternalLoad3006); 

                	newLeafNode(otherlv_5, grammarAccess.getExternalLoadAccess().getBetweenKeyword_5());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1475:1: ( (otherlv_6= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1476:1: (otherlv_6= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1476:1: (otherlv_6= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1477:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalLoadRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalLoad3026); 

            		newLeafNode(otherlv_6, grammarAccess.getExternalLoadAccess().getBody1BodyCrossReference_6_0()); 
            	

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1488:2: ( (lv_relTrans1_7_0= ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1489:1: (lv_relTrans1_7_0= ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1489:1: (lv_relTrans1_7_0= ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1490:3: lv_relTrans1_7_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getExternalLoadAccess().getRelTrans1RelativeTransformationParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleRelativeTransformation_in_ruleExternalLoad3047);
            lv_relTrans1_7_0=ruleRelativeTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalLoadRule());
            	        }
                   		set(
                   			current, 
                   			"relTrans1",
                    		lv_relTrans1_7_0, 
                    		"RelativeTransformation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleExternalLoad3059); 

                	newLeafNode(otherlv_8, grammarAccess.getExternalLoadAccess().getAndKeyword_8());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1510:1: ( (otherlv_9= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1511:1: (otherlv_9= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1511:1: (otherlv_9= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1512:3: otherlv_9= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalLoadRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalLoad3079); 

            		newLeafNode(otherlv_9, grammarAccess.getExternalLoadAccess().getBody2BodyCrossReference_9_0()); 
            	

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1523:2: ( (lv_relTrans2_10_0= ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1524:1: (lv_relTrans2_10_0= ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1524:1: (lv_relTrans2_10_0= ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1525:3: lv_relTrans2_10_0= ruleRelativeTransformation
            {
             
            	        newCompositeNode(grammarAccess.getExternalLoadAccess().getRelTrans2RelativeTransformationParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleRelativeTransformation_in_ruleExternalLoad3100);
            lv_relTrans2_10_0=ruleRelativeTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalLoadRule());
            	        }
                   		set(
                   			current, 
                   			"relTrans2",
                    		lv_relTrans2_10_0, 
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
    // $ANTLR end "ruleExternalLoad"


    // $ANTLR start "entryRuleMatrix"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1549:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1550:2: (iv_ruleMatrix= ruleMatrix EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1551:2: iv_ruleMatrix= ruleMatrix EOF
            {
             newCompositeNode(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_ruleMatrix_in_entryRuleMatrix3136);
            iv_ruleMatrix=ruleMatrix();

            state._fsp--;

             current =iv_ruleMatrix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix3146); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1558:1: ruleMatrix returns [EObject current=null] : (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        EObject this_BaseMatrix_0 = null;

        EObject this_MatrixRef_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1561:28: ( (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1562:1: (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1562:1: (this_BaseMatrix_0= ruleBaseMatrix | this_MatrixRef_1= ruleMatrixRef )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=45 && LA14_0<=46)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1563:5: this_BaseMatrix_0= ruleBaseMatrix
                    {
                     
                            newCompositeNode(grammarAccess.getMatrixAccess().getBaseMatrixParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBaseMatrix_in_ruleMatrix3193);
                    this_BaseMatrix_0=ruleBaseMatrix();

                    state._fsp--;

                     
                            current = this_BaseMatrix_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1573:5: this_MatrixRef_1= ruleMatrixRef
                    {
                     
                            newCompositeNode(grammarAccess.getMatrixAccess().getMatrixRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMatrixRef_in_ruleMatrix3220);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1589:1: entryRuleBaseMatrix returns [EObject current=null] : iv_ruleBaseMatrix= ruleBaseMatrix EOF ;
    public final EObject entryRuleBaseMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseMatrix = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1590:2: (iv_ruleBaseMatrix= ruleBaseMatrix EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1591:2: iv_ruleBaseMatrix= ruleBaseMatrix EOF
            {
             newCompositeNode(grammarAccess.getBaseMatrixRule()); 
            pushFollow(FOLLOW_ruleBaseMatrix_in_entryRuleBaseMatrix3255);
            iv_ruleBaseMatrix=ruleBaseMatrix();

            state._fsp--;

             current =iv_ruleBaseMatrix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseMatrix3265); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1598:1: ruleBaseMatrix returns [EObject current=null] : ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' ) ;
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
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1601:28: ( ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1602:1: ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1602:1: ( (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1602:2: (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= '[' ( (lv_values_3_0= ruleAddExp ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )* otherlv_6= ']'
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1602:2: (otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==45) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1602:4: otherlv_0= 'matrix' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleBaseMatrix3303); 

                        	newLeafNode(otherlv_0, grammarAccess.getBaseMatrixAccess().getMatrixKeyword_0_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1606:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1607:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1607:1: (lv_name_1_0= RULE_ID )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1608:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBaseMatrix3320); 

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

            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleBaseMatrix3339); 

                	newLeafNode(otherlv_2, grammarAccess.getBaseMatrixAccess().getLeftSquareBracketKeyword_1());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1628:1: ( (lv_values_3_0= ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1629:1: (lv_values_3_0= ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1629:1: (lv_values_3_0= ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1630:3: lv_values_3_0= ruleAddExp
            {
             
            	        newCompositeNode(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAddExp_in_ruleBaseMatrix3360);
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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1646:2: (otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1646:4: otherlv_4= ',' ( (lv_values_5_0= ruleAddExp ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleBaseMatrix3373); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBaseMatrixAccess().getCommaKeyword_3_0());
            	        
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1650:1: ( (lv_values_5_0= ruleAddExp ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1651:1: (lv_values_5_0= ruleAddExp )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1651:1: (lv_values_5_0= ruleAddExp )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1652:3: lv_values_5_0= ruleAddExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAddExp_in_ruleBaseMatrix3394);
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
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleBaseMatrix3408); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1680:1: entryRuleMatrixRef returns [EObject current=null] : iv_ruleMatrixRef= ruleMatrixRef EOF ;
    public final EObject entryRuleMatrixRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixRef = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1681:2: (iv_ruleMatrixRef= ruleMatrixRef EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1682:2: iv_ruleMatrixRef= ruleMatrixRef EOF
            {
             newCompositeNode(grammarAccess.getMatrixRefRule()); 
            pushFollow(FOLLOW_ruleMatrixRef_in_entryRuleMatrixRef3444);
            iv_ruleMatrixRef=ruleMatrixRef();

            state._fsp--;

             current =iv_ruleMatrixRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrixRef3454); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1689:1: ruleMatrixRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleMatrixRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1692:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1693:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1693:1: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1694:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1694:1: (otherlv_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1695:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMatrixRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMatrixRef3498); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1714:1: entryRuleAddExp returns [EObject current=null] : iv_ruleAddExp= ruleAddExp EOF ;
    public final EObject entryRuleAddExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1715:2: (iv_ruleAddExp= ruleAddExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1716:2: iv_ruleAddExp= ruleAddExp EOF
            {
             newCompositeNode(grammarAccess.getAddExpRule()); 
            pushFollow(FOLLOW_ruleAddExp_in_entryRuleAddExp3533);
            iv_ruleAddExp=ruleAddExp();

            state._fsp--;

             current =iv_ruleAddExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExp3543); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1723:1: ruleAddExp returns [EObject current=null] : (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* ) ;
    public final EObject ruleAddExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultExp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1726:28: ( (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1727:1: (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1727:1: (this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1728:5: this_MultExp_0= ruleMultExp ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAddExpAccess().getMultExpParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultExp_in_ruleAddExp3590);
            this_MultExp_0=ruleMultExp();

            state._fsp--;

             
                    current = this_MultExp_0; 
                    afterParserOrEnumRuleCall();
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1736:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=48 && LA18_0<=49)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1736:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultExp ) )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1736:2: ()
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1737:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1742:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1743:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1743:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1744:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1744:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==48) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==49) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1745:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,48,FOLLOW_48_in_ruleAddExp3619); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getAddExpAccess().getOpPlusSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAddExpRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1757:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,49,FOLLOW_49_in_ruleAddExp3648); 

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

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1772:2: ( (lv_right_3_0= ruleMultExp ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1773:1: (lv_right_3_0= ruleMultExp )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1773:1: (lv_right_3_0= ruleMultExp )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1774:3: lv_right_3_0= ruleMultExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddExpAccess().getRightMultExpParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultExp_in_ruleAddExp3685);
            	    lv_right_3_0=ruleMultExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAddExpRule());
            	    	        }
            	           		set(
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
            	    break loop18;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1798:1: entryRuleMultExp returns [EObject current=null] : iv_ruleMultExp= ruleMultExp EOF ;
    public final EObject entryRuleMultExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1799:2: (iv_ruleMultExp= ruleMultExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1800:2: iv_ruleMultExp= ruleMultExp EOF
            {
             newCompositeNode(grammarAccess.getMultExpRule()); 
            pushFollow(FOLLOW_ruleMultExp_in_entryRuleMultExp3723);
            iv_ruleMultExp=ruleMultExp();

            state._fsp--;

             current =iv_ruleMultExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExp3733); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1807:1: ruleMultExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1810:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1811:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1811:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1812:5: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultExpAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleMultExp3780);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1820:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=50 && LA20_0<=51)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1820:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1820:2: ()
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1821:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMultExpAccess().getMultExpLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1826:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1827:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1827:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1828:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1828:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==50) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==51) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1829:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,50,FOLLOW_50_in_ruleMultExp3809); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getMultExpAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultExpRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1841:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,51,FOLLOW_51_in_ruleMultExp3838); 

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

            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1856:2: ( (lv_right_3_0= rulePrimary ) )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1857:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1857:1: (lv_right_3_0= rulePrimary )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1858:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultExpAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleMultExp3875);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultExpRule());
            	    	        }
            	           		set(
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
            	    break loop20;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1882:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1883:2: (iv_rulePrimary= rulePrimary EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1884:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary3913);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary3923); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1891:1: rulePrimary returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | (otherlv_1= '(' this_AddExp_2= ruleAddExp otherlv_3= ')' ) | this_ConstantOrFunctionCallExp_4= ruleConstantOrFunctionCallExp ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_NumberLiteral_0 = null;

        EObject this_AddExp_2 = null;

        EObject this_ConstantOrFunctionCallExp_4 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1894:28: ( (this_NumberLiteral_0= ruleNumberLiteral | (otherlv_1= '(' this_AddExp_2= ruleAddExp otherlv_3= ')' ) | this_ConstantOrFunctionCallExp_4= ruleConstantOrFunctionCallExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1895:1: (this_NumberLiteral_0= ruleNumberLiteral | (otherlv_1= '(' this_AddExp_2= ruleAddExp otherlv_3= ')' ) | this_ConstantOrFunctionCallExp_4= ruleConstantOrFunctionCallExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1895:1: (this_NumberLiteral_0= ruleNumberLiteral | (otherlv_1= '(' this_AddExp_2= ruleAddExp otherlv_3= ')' ) | this_ConstantOrFunctionCallExp_4= ruleConstantOrFunctionCallExp )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_REAL:
            case 49:
                {
                alt21=1;
                }
                break;
            case 34:
                {
                alt21=2;
                }
                break;
            case RULE_ID:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1896:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_rulePrimary3970);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1905:6: (otherlv_1= '(' this_AddExp_2= ruleAddExp otherlv_3= ')' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1905:6: (otherlv_1= '(' this_AddExp_2= ruleAddExp otherlv_3= ')' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1905:8: otherlv_1= '(' this_AddExp_2= ruleAddExp otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_rulePrimary3988); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAddExpParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleAddExp_in_rulePrimary4010);
                    this_AddExp_2=ruleAddExp();

                    state._fsp--;

                     
                            current = this_AddExp_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_rulePrimary4021); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1924:5: this_ConstantOrFunctionCallExp_4= ruleConstantOrFunctionCallExp
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getConstantOrFunctionCallExpParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConstantOrFunctionCallExp_in_rulePrimary4050);
                    this_ConstantOrFunctionCallExp_4=ruleConstantOrFunctionCallExp();

                    state._fsp--;

                     
                            current = this_ConstantOrFunctionCallExp_4; 
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


    // $ANTLR start "entryRuleConstantOrFunctionCallExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1940:1: entryRuleConstantOrFunctionCallExp returns [EObject current=null] : iv_ruleConstantOrFunctionCallExp= ruleConstantOrFunctionCallExp EOF ;
    public final EObject entryRuleConstantOrFunctionCallExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantOrFunctionCallExp = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1941:2: (iv_ruleConstantOrFunctionCallExp= ruleConstantOrFunctionCallExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1942:2: iv_ruleConstantOrFunctionCallExp= ruleConstantOrFunctionCallExp EOF
            {
             newCompositeNode(grammarAccess.getConstantOrFunctionCallExpRule()); 
            pushFollow(FOLLOW_ruleConstantOrFunctionCallExp_in_entryRuleConstantOrFunctionCallExp4085);
            iv_ruleConstantOrFunctionCallExp=ruleConstantOrFunctionCallExp();

            state._fsp--;

             current =iv_ruleConstantOrFunctionCallExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantOrFunctionCallExp4095); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1949:1: ruleConstantOrFunctionCallExp returns [EObject current=null] : ( ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? ) ;
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
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1952:28: ( ( ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1953:1: ( ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1953:1: ( ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1953:2: ( (lv_label_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )?
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1953:2: ( (lv_label_0_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1954:1: (lv_label_0_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1954:1: (lv_label_0_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1955:3: lv_label_0_0= RULE_ID
            {
            lv_label_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantOrFunctionCallExp4137); 

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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1971:2: (otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1971:4: otherlv_1= '(' ( (lv_param_2_0= ruleAddExp ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleConstantOrFunctionCallExp4155); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstantOrFunctionCallExpAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1975:1: ( (lv_param_2_0= ruleAddExp ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1976:1: (lv_param_2_0= ruleAddExp )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1976:1: (lv_param_2_0= ruleAddExp )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1977:3: lv_param_2_0= ruleAddExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddExp_in_ruleConstantOrFunctionCallExp4176);
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

                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1993:2: (otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==35) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1993:4: otherlv_3= ',' ( (lv_param_4_0= ruleAddExp ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleConstantOrFunctionCallExp4189); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getConstantOrFunctionCallExpAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1997:1: ( (lv_param_4_0= ruleAddExp ) )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1998:1: (lv_param_4_0= ruleAddExp )
                    	    {
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1998:1: (lv_param_4_0= ruleAddExp )
                    	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:1999:3: lv_param_4_0= ruleAddExp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddExp_in_ruleConstantOrFunctionCallExp4210);
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleConstantOrFunctionCallExp4224); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2027:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2028:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2029:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral4262);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral4272); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2036:1: ruleNumberLiteral returns [EObject current=null] : ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_neg_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2039:28: ( ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2040:1: ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2040:1: ( ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2040:2: ( (lv_neg_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2040:2: ( (lv_neg_0_0= '-' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2041:1: (lv_neg_0_0= '-' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2041:1: (lv_neg_0_0= '-' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2042:3: lv_neg_0_0= '-'
                    {
                    lv_neg_0_0=(Token)match(input,49,FOLLOW_49_in_ruleNumberLiteral4315); 

                            newLeafNode(lv_neg_0_0, grammarAccess.getNumberLiteralAccess().getNegHyphenMinusKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "neg", true, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2055:3: ( (lv_value_1_0= RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2056:1: (lv_value_1_0= RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2056:1: (lv_value_1_0= RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2057:3: lv_value_1_0= RULE_REAL
            {
            lv_value_1_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleNumberLiteral4346); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2081:1: ruleAXIS returns [Enumerator current=null] : ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) ) ;
    public final Enumerator ruleAXIS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2083:28: ( ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2084:1: ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2084:1: ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) | (enumLiteral_2= 'z' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt25=1;
                }
                break;
            case 53:
                {
                alt25=2;
                }
                break;
            case 54:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2084:2: (enumLiteral_0= 'x' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2084:2: (enumLiteral_0= 'x' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2084:4: enumLiteral_0= 'x'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleAXIS4401); 

                            current = grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2090:6: (enumLiteral_1= 'y' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2090:6: (enumLiteral_1= 'y' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2090:8: enumLiteral_1= 'y'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleAXIS4418); 

                            current = grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2096:6: (enumLiteral_2= 'z' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2096:6: (enumLiteral_2= 'z' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2096:8: enumLiteral_2= 'z'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_54_in_ruleAXIS4435); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2106:1: ruleConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) ) ;
    public final Enumerator ruleConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2108:28: ( ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2109:1: ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2109:1: ( (enumLiteral_0= 'geometrical' ) | (enumLiteral_1= 'velocity' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            else if ( (LA26_0==56) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2109:2: (enumLiteral_0= 'geometrical' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2109:2: (enumLiteral_0= 'geometrical' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2109:4: enumLiteral_0= 'geometrical'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleConstraintType4480); 

                            current = grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2115:6: (enumLiteral_1= 'velocity' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2115:6: (enumLiteral_1= 'velocity' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2115:8: enumLiteral_1= 'velocity'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleConstraintType4497); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2125:1: ruleLoadType returns [Enumerator current=null] : ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) ) ;
    public final Enumerator ruleLoadType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2127:28: ( ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2128:1: ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2128:1: ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'torque' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==57) ) {
                alt27=1;
            }
            else if ( (LA27_0==58) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2128:2: (enumLiteral_0= 'force' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2128:2: (enumLiteral_0= 'force' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2128:4: enumLiteral_0= 'force'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleLoadType4542); 

                            current = grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2134:6: (enumLiteral_1= 'torque' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2134:6: (enumLiteral_1= 'torque' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:2134:8: enumLiteral_1= 'torque'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleLoadType4559); 

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
    public static final BitSet FOLLOW_ruleInitialDefinition_in_ruleModel131 = new BitSet(new long[]{0x0000602200401010L});
    public static final BitSet FOLLOW_ruleEnvironment_in_ruleModel153 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleModel174 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleInitialDefinition_in_entryRuleInitialDefinition211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialDefinition221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_ruleInitialDefinition268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_ruleInitialDefinition295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_entryRuleEnvironment330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironment340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEnvironment377 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnvironment389 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnvironment401 = new BitSet(new long[]{0x0000600000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleEnvironment422 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnvironment434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSystem517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem534 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem551 = new BitSet(new long[]{0x00000C0000420000L});
    public static final BitSet FOLLOW_ruleSystemElement_in_ruleSystem572 = new BitSet(new long[]{0x00000C0000428000L});
    public static final BitSet FOLLOW_15_in_ruleSystem585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemElement_in_entryRuleSystemElement621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemElement631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_ruleSystemElement678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_ruleSystemElement705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleSystemElement732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLoad_in_ruleSystemElement759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBody841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBody858 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBody875 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleMass_in_ruleBody896 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBody908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_entryRuleMass944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMass954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMass991 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMass1003 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMass1015 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleMass1036 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMass1048 = new BitSet(new long[]{0x0000600000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleMass1069 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMass1081 = new BitSet(new long[]{0x0000600000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleMass1102 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMass1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_entryRuleJoint1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoint1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleJoint1197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJoint1214 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleJoint1231 = new BitSet(new long[]{0x0000602200401010L});
    public static final BitSet FOLLOW_ruleJointType_in_ruleJoint1252 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleJoint1270 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleJoint1296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJoint1316 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_ruleJoint1337 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleJoint1349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJoint1369 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_ruleJoint1390 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleJoint1402 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleJoint1414 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleJoint1426 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleJoint1447 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleJoint1459 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleJoint1480 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleJoint1492 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleJoint1513 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleJoint1525 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleJoint1546 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleJoint1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_entryRuleJointType1594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointType1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleJointType1642 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleJointType1654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJointType1671 = new BitSet(new long[]{0x0000602200401010L});
    public static final BitSet FOLLOW_ruleJointTypeExpression_in_ruleJointType1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointTypeExpression_in_entryRuleJointTypeExpression1735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointTypeExpression1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJointTypeExpression1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleJointTypeExpression1809 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleJointTypeExpression1821 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_ruleJointTypeExpression1842 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleJointTypeExpression1855 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_ruleJointTypeExpression1876 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36_in_ruleJointTypeExpression1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleJointTypeExpression1910 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleJointTypeExpression1922 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_ruleJointTypeExpression1943 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleJointTypeExpression1956 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_ruleJointTypeExpression1977 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36_in_ruleJointTypeExpression1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_entryRuleRelativeTransformation2028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeTransformation2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRelativeTransformation2075 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRelativeTransformation2087 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRelativeTransformation2099 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleRelativeTransformation2111 = new BitSet(new long[]{0x0000600000000010L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleRelativeTransformation2132 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleRelativeTransformation2144 = new BitSet(new long[]{0x0000020400000010L});
    public static final BitSet FOLLOW_ruleReorientation_in_ruleRelativeTransformation2165 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleRelativeTransformation2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientation_in_entryRuleReorientation2213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientation2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleReorientation2261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReorientation2278 = new BitSet(new long[]{0x0000020400000010L});
    public static final BitSet FOLLOW_ruleReorientExpression_in_ruleReorientation2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientExpression_in_entryRuleReorientExpression2342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientExpression2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReorientExpression2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleReorientExpression2416 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleReorientExpression2428 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_ruleReorientExpression2449 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleReorientExpression2461 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleReorientExpression2482 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleReorientExpression2494 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleReorientExpression2507 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleReorientExpression2519 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_ruleAXIS_in_ruleReorientExpression2540 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleReorientExpression2552 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleReorientExpression2573 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleReorientExpression2585 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36_in_ruleReorientExpression2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint2636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleConstraint2683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint2700 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleConstraint2717 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_ruleConstraintType_in_ruleConstraint2738 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConstraint2750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint2770 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_ruleConstraint2791 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleConstraint2803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint2823 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_ruleConstraint2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLoad_in_entryRuleExternalLoad2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalLoad2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleExternalLoad2927 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleExternalLoad2939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalLoad2956 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleExternalLoad2973 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_ruleLoadType_in_ruleExternalLoad2994 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExternalLoad3006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalLoad3026 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_ruleExternalLoad3047 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExternalLoad3059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalLoad3079 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_ruleExternalLoad3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_entryRuleMatrix3136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_ruleMatrix3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRef_in_ruleMatrix3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_entryRuleBaseMatrix3255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseMatrix3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBaseMatrix3303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBaseMatrix3320 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleBaseMatrix3339 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseMatrix3360 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_35_in_ruleBaseMatrix3373 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleBaseMatrix3394 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_47_in_ruleBaseMatrix3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRef_in_entryRuleMatrixRef3444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrixRef3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMatrixRef3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_entryRuleAddExp3533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExp3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_ruleAddExp3590 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAddExp3619 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_49_in_ruleAddExp3648 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_ruleMultExp_in_ruleAddExp3685 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_entryRuleMultExp3723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExp3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMultExp3780 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleMultExp3809 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_51_in_ruleMultExp3838 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMultExp3875 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary3913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_rulePrimary3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePrimary3988 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_rulePrimary4010 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulePrimary4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantOrFunctionCallExp_in_rulePrimary4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantOrFunctionCallExp_in_entryRuleConstantOrFunctionCallExp4085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantOrFunctionCallExp4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantOrFunctionCallExp4137 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleConstantOrFunctionCallExp4155 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleConstantOrFunctionCallExp4176 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleConstantOrFunctionCallExp4189 = new BitSet(new long[]{0x0002000400000030L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleConstantOrFunctionCallExp4210 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36_in_ruleConstantOrFunctionCallExp4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral4262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNumberLiteral4315 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleNumberLiteral4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAXIS4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAXIS4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAXIS4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleConstraintType4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleConstraintType4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleLoadType4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleLoadType4559 = new BitSet(new long[]{0x0000000000000002L});

}