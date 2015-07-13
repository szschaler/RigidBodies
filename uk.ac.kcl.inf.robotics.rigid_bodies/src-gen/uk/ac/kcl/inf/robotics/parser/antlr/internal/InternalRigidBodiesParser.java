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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rigid_body'", "'{'", "'}'", "'joint'", "'mass'", "'kg'", "'transformation'", "'relative'", "'to'", "'('", "','", "';'", "')'", "'colocate'", "'with'"
    };
    public static final int RULE_ID=4;
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
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:76:1: ruleModel returns [EObject current=null] : ( (lv_rigidBodies_0_0= ruleRigidBody ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_rigidBodies_0_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:79:28: ( ( (lv_rigidBodies_0_0= ruleRigidBody ) )+ )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:80:1: ( (lv_rigidBodies_0_0= ruleRigidBody ) )+
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:80:1: ( (lv_rigidBodies_0_0= ruleRigidBody ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:81:1: (lv_rigidBodies_0_0= ruleRigidBody )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:81:1: (lv_rigidBodies_0_0= ruleRigidBody )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:82:3: lv_rigidBodies_0_0= ruleRigidBody
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getRigidBodiesRigidBodyParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRigidBody_in_ruleModel130);
            	    lv_rigidBodies_0_0=ruleRigidBody();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rigidBodies",
            	            		lv_rigidBodies_0_0, 
            	            		"RigidBody");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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


    // $ANTLR start "entryRuleRigidBody"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:106:1: entryRuleRigidBody returns [EObject current=null] : iv_ruleRigidBody= ruleRigidBody EOF ;
    public final EObject entryRuleRigidBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRigidBody = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:107:2: (iv_ruleRigidBody= ruleRigidBody EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:108:2: iv_ruleRigidBody= ruleRigidBody EOF
            {
             newCompositeNode(grammarAccess.getRigidBodyRule()); 
            pushFollow(FOLLOW_ruleRigidBody_in_entryRuleRigidBody166);
            iv_ruleRigidBody=ruleRigidBody();

            state._fsp--;

             current =iv_ruleRigidBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRigidBody176); 

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
    // $ANTLR end "entryRuleRigidBody"


    // $ANTLR start "ruleRigidBody"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:115:1: ruleRigidBody returns [EObject current=null] : (otherlv_0= 'rigid_body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_joints_3_0= ruleJoint ) )+ ( (lv_masses_4_0= ruleMass ) )+ ( (lv_constraints_5_0= ruleConstraint ) )* otherlv_6= '}' ) ;
    public final EObject ruleRigidBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_joints_3_0 = null;

        EObject lv_masses_4_0 = null;

        EObject lv_constraints_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:118:28: ( (otherlv_0= 'rigid_body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_joints_3_0= ruleJoint ) )+ ( (lv_masses_4_0= ruleMass ) )+ ( (lv_constraints_5_0= ruleConstraint ) )* otherlv_6= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:119:1: (otherlv_0= 'rigid_body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_joints_3_0= ruleJoint ) )+ ( (lv_masses_4_0= ruleMass ) )+ ( (lv_constraints_5_0= ruleConstraint ) )* otherlv_6= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:119:1: (otherlv_0= 'rigid_body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_joints_3_0= ruleJoint ) )+ ( (lv_masses_4_0= ruleMass ) )+ ( (lv_constraints_5_0= ruleConstraint ) )* otherlv_6= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:119:3: otherlv_0= 'rigid_body' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_joints_3_0= ruleJoint ) )+ ( (lv_masses_4_0= ruleMass ) )+ ( (lv_constraints_5_0= ruleConstraint ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleRigidBody213); 

                	newLeafNode(otherlv_0, grammarAccess.getRigidBodyAccess().getRigid_bodyKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:124:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRigidBody230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRigidBodyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRigidBodyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleRigidBody247); 

                	newLeafNode(otherlv_2, grammarAccess.getRigidBodyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:145:1: ( (lv_joints_3_0= ruleJoint ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:146:1: (lv_joints_3_0= ruleJoint )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:146:1: (lv_joints_3_0= ruleJoint )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:147:3: lv_joints_3_0= ruleJoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRigidBodyAccess().getJointsJointParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJoint_in_ruleRigidBody268);
            	    lv_joints_3_0=ruleJoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRigidBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"joints",
            	            		lv_joints_3_0, 
            	            		"Joint");
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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:163:3: ( (lv_masses_4_0= ruleMass ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:164:1: (lv_masses_4_0= ruleMass )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:164:1: (lv_masses_4_0= ruleMass )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:165:3: lv_masses_4_0= ruleMass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRigidBodyAccess().getMassesMassParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMass_in_ruleRigidBody290);
            	    lv_masses_4_0=ruleMass();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRigidBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"masses",
            	            		lv_masses_4_0, 
            	            		"Mass");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:181:3: ( (lv_constraints_5_0= ruleConstraint ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:182:1: (lv_constraints_5_0= ruleConstraint )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:182:1: (lv_constraints_5_0= ruleConstraint )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:183:3: lv_constraints_5_0= ruleConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRigidBodyAccess().getConstraintsConstraintParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraint_in_ruleRigidBody312);
            	    lv_constraints_5_0=ruleConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRigidBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_5_0, 
            	            		"Constraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleRigidBody325); 

                	newLeafNode(otherlv_6, grammarAccess.getRigidBodyAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleRigidBody"


    // $ANTLR start "entryRuleJoint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:211:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:212:2: (iv_ruleJoint= ruleJoint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:213:2: iv_ruleJoint= ruleJoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_ruleJoint_in_entryRuleJoint361);
            iv_ruleJoint=ruleJoint();

            state._fsp--;

             current =iv_ruleJoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoint371); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:220:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:223:28: ( (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:224:1: (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:224:1: (otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:224:3: otherlv_0= 'joint' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleJoint408); 

                	newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:228:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:229:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:229:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:230:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJoint425); 

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


    // $ANTLR start "entryRuleMass"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:254:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:255:2: (iv_ruleMass= ruleMass EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:256:2: iv_ruleMass= ruleMass EOF
            {
             newCompositeNode(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_ruleMass_in_entryRuleMass466);
            iv_ruleMass=ruleMass();

            state._fsp--;

             current =iv_ruleMass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMass476); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:263:1: ruleMass returns [EObject current=null] : (otherlv_0= 'mass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_REAL ) ) otherlv_3= 'kg' otherlv_4= '{' ( (lv_transformations_5_0= ruleTransformation ) )+ otherlv_6= '}' ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_transformations_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:266:28: ( (otherlv_0= 'mass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_REAL ) ) otherlv_3= 'kg' otherlv_4= '{' ( (lv_transformations_5_0= ruleTransformation ) )+ otherlv_6= '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:267:1: (otherlv_0= 'mass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_REAL ) ) otherlv_3= 'kg' otherlv_4= '{' ( (lv_transformations_5_0= ruleTransformation ) )+ otherlv_6= '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:267:1: (otherlv_0= 'mass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_REAL ) ) otherlv_3= 'kg' otherlv_4= '{' ( (lv_transformations_5_0= ruleTransformation ) )+ otherlv_6= '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:267:3: otherlv_0= 'mass' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_REAL ) ) otherlv_3= 'kg' otherlv_4= '{' ( (lv_transformations_5_0= ruleTransformation ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleMass513); 

                	newLeafNode(otherlv_0, grammarAccess.getMassAccess().getMassKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:271:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:272:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:272:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:273:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMass530); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:289:2: ( (lv_value_2_0= RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:290:1: (lv_value_2_0= RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:290:1: (lv_value_2_0= RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:291:3: lv_value_2_0= RULE_REAL
            {
            lv_value_2_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleMass552); 

            			newLeafNode(lv_value_2_0, grammarAccess.getMassAccess().getValueREALTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"REAL");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleMass569); 

                	newLeafNode(otherlv_3, grammarAccess.getMassAccess().getKgKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleMass581); 

                	newLeafNode(otherlv_4, grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_4());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:315:1: ( (lv_transformations_5_0= ruleTransformation ) )+
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
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:316:1: (lv_transformations_5_0= ruleTransformation )
            	    {
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:316:1: (lv_transformations_5_0= ruleTransformation )
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:317:3: lv_transformations_5_0= ruleTransformation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMassAccess().getTransformationsTransformationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransformation_in_ruleMass602);
            	    lv_transformations_5_0=ruleTransformation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transformations",
            	            		lv_transformations_5_0, 
            	            		"Transformation");
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

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleMass615); 

                	newLeafNode(otherlv_6, grammarAccess.getMassAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleTransformation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:345:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:346:2: (iv_ruleTransformation= ruleTransformation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:347:2: iv_ruleTransformation= ruleTransformation EOF
            {
             newCompositeNode(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_ruleTransformation_in_entryRuleTransformation651);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;

             current =iv_ruleTransformation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransformation661); 

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
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:354:1: ruleTransformation returns [EObject current=null] : (otherlv_0= 'transformation' otherlv_1= 'relative' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' this_REAL_5= RULE_REAL otherlv_6= ',' this_REAL_7= RULE_REAL otherlv_8= ',' this_REAL_9= RULE_REAL otherlv_10= ';' this_REAL_11= RULE_REAL otherlv_12= ',' this_REAL_13= RULE_REAL otherlv_14= ',' this_REAL_15= RULE_REAL otherlv_16= ';' this_REAL_17= RULE_REAL otherlv_18= ',' this_REAL_19= RULE_REAL otherlv_20= ',' this_REAL_21= RULE_REAL otherlv_22= ')' ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_REAL_5=null;
        Token otherlv_6=null;
        Token this_REAL_7=null;
        Token otherlv_8=null;
        Token this_REAL_9=null;
        Token otherlv_10=null;
        Token this_REAL_11=null;
        Token otherlv_12=null;
        Token this_REAL_13=null;
        Token otherlv_14=null;
        Token this_REAL_15=null;
        Token otherlv_16=null;
        Token this_REAL_17=null;
        Token otherlv_18=null;
        Token this_REAL_19=null;
        Token otherlv_20=null;
        Token this_REAL_21=null;
        Token otherlv_22=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:357:28: ( (otherlv_0= 'transformation' otherlv_1= 'relative' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' this_REAL_5= RULE_REAL otherlv_6= ',' this_REAL_7= RULE_REAL otherlv_8= ',' this_REAL_9= RULE_REAL otherlv_10= ';' this_REAL_11= RULE_REAL otherlv_12= ',' this_REAL_13= RULE_REAL otherlv_14= ',' this_REAL_15= RULE_REAL otherlv_16= ';' this_REAL_17= RULE_REAL otherlv_18= ',' this_REAL_19= RULE_REAL otherlv_20= ',' this_REAL_21= RULE_REAL otherlv_22= ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:358:1: (otherlv_0= 'transformation' otherlv_1= 'relative' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' this_REAL_5= RULE_REAL otherlv_6= ',' this_REAL_7= RULE_REAL otherlv_8= ',' this_REAL_9= RULE_REAL otherlv_10= ';' this_REAL_11= RULE_REAL otherlv_12= ',' this_REAL_13= RULE_REAL otherlv_14= ',' this_REAL_15= RULE_REAL otherlv_16= ';' this_REAL_17= RULE_REAL otherlv_18= ',' this_REAL_19= RULE_REAL otherlv_20= ',' this_REAL_21= RULE_REAL otherlv_22= ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:358:1: (otherlv_0= 'transformation' otherlv_1= 'relative' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' this_REAL_5= RULE_REAL otherlv_6= ',' this_REAL_7= RULE_REAL otherlv_8= ',' this_REAL_9= RULE_REAL otherlv_10= ';' this_REAL_11= RULE_REAL otherlv_12= ',' this_REAL_13= RULE_REAL otherlv_14= ',' this_REAL_15= RULE_REAL otherlv_16= ';' this_REAL_17= RULE_REAL otherlv_18= ',' this_REAL_19= RULE_REAL otherlv_20= ',' this_REAL_21= RULE_REAL otherlv_22= ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:358:3: otherlv_0= 'transformation' otherlv_1= 'relative' otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' this_REAL_5= RULE_REAL otherlv_6= ',' this_REAL_7= RULE_REAL otherlv_8= ',' this_REAL_9= RULE_REAL otherlv_10= ';' this_REAL_11= RULE_REAL otherlv_12= ',' this_REAL_13= RULE_REAL otherlv_14= ',' this_REAL_15= RULE_REAL otherlv_16= ';' this_REAL_17= RULE_REAL otherlv_18= ',' this_REAL_19= RULE_REAL otherlv_20= ',' this_REAL_21= RULE_REAL otherlv_22= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTransformation698); 

                	newLeafNode(otherlv_0, grammarAccess.getTransformationAccess().getTransformationKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleTransformation710); 

                	newLeafNode(otherlv_1, grammarAccess.getTransformationAccess().getRelativeKeyword_1());
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTransformation722); 

                	newLeafNode(otherlv_2, grammarAccess.getTransformationAccess().getToKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:370:1: ( (otherlv_3= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:371:1: (otherlv_3= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:371:1: (otherlv_3= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:372:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransformationRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransformation742); 

            		newLeafNode(otherlv_3, grammarAccess.getTransformationAccess().getJointJointCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleTransformation754); 

                	newLeafNode(otherlv_4, grammarAccess.getTransformationAccess().getLeftParenthesisKeyword_4());
                
            this_REAL_5=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleTransformation765); 
             
                newLeafNode(this_REAL_5, grammarAccess.getTransformationAccess().getREALTerminalRuleCall_5()); 
                
            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleTransformation776); 

                	newLeafNode(otherlv_6, grammarAccess.getTransformationAccess().getCommaKeyword_6());
                
            this_REAL_7=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleTransformation787); 
             
                newLeafNode(this_REAL_7, grammarAccess.getTransformationAccess().getREALTerminalRuleCall_7()); 
                
            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleTransformation798); 

                	newLeafNode(otherlv_8, grammarAccess.getTransformationAccess().getCommaKeyword_8());
                
            this_REAL_9=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleTransformation809); 
             
                newLeafNode(this_REAL_9, grammarAccess.getTransformationAccess().getREALTerminalRuleCall_9()); 
                
            otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleTransformation820); 

                	newLeafNode(otherlv_10, grammarAccess.getTransformationAccess().getSemicolonKeyword_10());
                
            this_REAL_11=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleTransformation831); 
             
                newLeafNode(this_REAL_11, grammarAccess.getTransformationAccess().getREALTerminalRuleCall_11()); 
                
            otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleTransformation842); 

                	newLeafNode(otherlv_12, grammarAccess.getTransformationAccess().getCommaKeyword_12());
                
            this_REAL_13=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleTransformation853); 
             
                newLeafNode(this_REAL_13, grammarAccess.getTransformationAccess().getREALTerminalRuleCall_13()); 
                
            otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleTransformation864); 

                	newLeafNode(otherlv_14, grammarAccess.getTransformationAccess().getCommaKeyword_14());
                
            this_REAL_15=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleTransformation875); 
             
                newLeafNode(this_REAL_15, grammarAccess.getTransformationAccess().getREALTerminalRuleCall_15()); 
                
            otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleTransformation886); 

                	newLeafNode(otherlv_16, grammarAccess.getTransformationAccess().getSemicolonKeyword_16());
                
            this_REAL_17=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleTransformation897); 
             
                newLeafNode(this_REAL_17, grammarAccess.getTransformationAccess().getREALTerminalRuleCall_17()); 
                
            otherlv_18=(Token)match(input,22,FOLLOW_22_in_ruleTransformation908); 

                	newLeafNode(otherlv_18, grammarAccess.getTransformationAccess().getCommaKeyword_18());
                
            this_REAL_19=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleTransformation919); 
             
                newLeafNode(this_REAL_19, grammarAccess.getTransformationAccess().getREALTerminalRuleCall_19()); 
                
            otherlv_20=(Token)match(input,22,FOLLOW_22_in_ruleTransformation930); 

                	newLeafNode(otherlv_20, grammarAccess.getTransformationAccess().getCommaKeyword_20());
                
            this_REAL_21=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleTransformation941); 
             
                newLeafNode(this_REAL_21, grammarAccess.getTransformationAccess().getREALTerminalRuleCall_21()); 
                
            otherlv_22=(Token)match(input,24,FOLLOW_24_in_ruleTransformation952); 

                	newLeafNode(otherlv_22, grammarAccess.getTransformationAccess().getRightParenthesisKeyword_22());
                

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
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:467:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:468:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:469:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint988);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint998); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:476:1: ruleConstraint returns [EObject current=null] : this_ColocationConstraint_0= ruleColocationConstraint ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ColocationConstraint_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:479:28: (this_ColocationConstraint_0= ruleColocationConstraint )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:481:5: this_ColocationConstraint_0= ruleColocationConstraint
            {
             
                    newCompositeNode(grammarAccess.getConstraintAccess().getColocationConstraintParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleColocationConstraint_in_ruleConstraint1044);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:497:1: entryRuleColocationConstraint returns [EObject current=null] : iv_ruleColocationConstraint= ruleColocationConstraint EOF ;
    public final EObject entryRuleColocationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColocationConstraint = null;


        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:498:2: (iv_ruleColocationConstraint= ruleColocationConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:499:2: iv_ruleColocationConstraint= ruleColocationConstraint EOF
            {
             newCompositeNode(grammarAccess.getColocationConstraintRule()); 
            pushFollow(FOLLOW_ruleColocationConstraint_in_entryRuleColocationConstraint1078);
            iv_ruleColocationConstraint=ruleColocationConstraint();

            state._fsp--;

             current =iv_ruleColocationConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColocationConstraint1088); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:506:1: ruleColocationConstraint returns [EObject current=null] : (otherlv_0= 'colocate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleColocationConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:509:28: ( (otherlv_0= 'colocate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:510:1: (otherlv_0= 'colocate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:510:1: (otherlv_0= 'colocate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:510:3: otherlv_0= 'colocate' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleColocationConstraint1125); 

                	newLeafNode(otherlv_0, grammarAccess.getColocationConstraintAccess().getColocateKeyword_0());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:514:1: ( (otherlv_1= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:515:1: (otherlv_1= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:515:1: (otherlv_1= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:516:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getColocationConstraintRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocationConstraint1145); 

            		newLeafNode(otherlv_1, grammarAccess.getColocationConstraintAccess().getJoint1JointCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleColocationConstraint1157); 

                	newLeafNode(otherlv_2, grammarAccess.getColocationConstraintAccess().getWithKeyword_2());
                
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:531:1: ( (otherlv_3= RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:532:1: (otherlv_3= RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:532:1: (otherlv_3= RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies/src-gen/uk/ac/kcl/inf/robotics/parser/antlr/internal/InternalRigidBodies.g:533:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getColocationConstraintRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColocationConstraint1177); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRigidBody_in_ruleModel130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleRigidBody_in_entryRuleRigidBody166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRigidBody176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleRigidBody213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRigidBody230 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRigidBody247 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJoint_in_ruleRigidBody268 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleMass_in_ruleRigidBody290 = new BitSet(new long[]{0x0000000002014000L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleRigidBody312 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_14_in_ruleRigidBody325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_entryRuleJoint361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoint371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleJoint408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJoint425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_entryRuleMass466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMass476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMass513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMass530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleMass552 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMass569 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMass581 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleTransformation_in_ruleMass602 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_14_in_ruleMass615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformation661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTransformation698 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTransformation710 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTransformation722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransformation742 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTransformation754 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleTransformation765 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransformation776 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleTransformation787 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransformation798 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleTransformation809 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTransformation820 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleTransformation831 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransformation842 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleTransformation853 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransformation864 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleTransformation875 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTransformation886 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleTransformation897 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransformation908 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleTransformation919 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransformation930 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleTransformation941 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTransformation952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColocationConstraint_in_ruleConstraint1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColocationConstraint_in_entryRuleColocationConstraint1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColocationConstraint1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleColocationConstraint1125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocationConstraint1145 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleColocationConstraint1157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColocationConstraint1177 = new BitSet(new long[]{0x0000000000000002L});

}