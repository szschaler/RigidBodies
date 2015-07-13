package uk.ac.kcl.inf.robotics.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.robotics.services.RigidBodiesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRigidBodiesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_REAL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rigid_body'", "'{'", "'}'", "'joint'", "'mass'", "'kg'", "'transformation'", "'relative'", "'to'", "'('", "','", "';'", "')'", "'colocate'", "'with'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_REAL=4;
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
    public String getGrammarFileName() { return "../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g"; }


     
     	private RigidBodiesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RigidBodiesGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:61:1: ( ruleModel EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:69:1: ruleModel : ( ( ( rule__Model__RigidBodiesAssignment ) ) ( ( rule__Model__RigidBodiesAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:73:2: ( ( ( ( rule__Model__RigidBodiesAssignment ) ) ( ( rule__Model__RigidBodiesAssignment )* ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:74:1: ( ( ( rule__Model__RigidBodiesAssignment ) ) ( ( rule__Model__RigidBodiesAssignment )* ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:74:1: ( ( ( rule__Model__RigidBodiesAssignment ) ) ( ( rule__Model__RigidBodiesAssignment )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:75:1: ( ( rule__Model__RigidBodiesAssignment ) ) ( ( rule__Model__RigidBodiesAssignment )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:75:1: ( ( rule__Model__RigidBodiesAssignment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:76:1: ( rule__Model__RigidBodiesAssignment )
            {
             before(grammarAccess.getModelAccess().getRigidBodiesAssignment()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:77:1: ( rule__Model__RigidBodiesAssignment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:77:2: rule__Model__RigidBodiesAssignment
            {
            pushFollow(FOLLOW_rule__Model__RigidBodiesAssignment_in_ruleModel96);
            rule__Model__RigidBodiesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRigidBodiesAssignment()); 

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:80:1: ( ( rule__Model__RigidBodiesAssignment )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:81:1: ( rule__Model__RigidBodiesAssignment )*
            {
             before(grammarAccess.getModelAccess().getRigidBodiesAssignment()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:82:1: ( rule__Model__RigidBodiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:82:2: rule__Model__RigidBodiesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__RigidBodiesAssignment_in_ruleModel108);
            	    rule__Model__RigidBodiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRigidBodiesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRigidBody"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:95:1: entryRuleRigidBody : ruleRigidBody EOF ;
    public final void entryRuleRigidBody() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:96:1: ( ruleRigidBody EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:97:1: ruleRigidBody EOF
            {
             before(grammarAccess.getRigidBodyRule()); 
            pushFollow(FOLLOW_ruleRigidBody_in_entryRuleRigidBody138);
            ruleRigidBody();

            state._fsp--;

             after(grammarAccess.getRigidBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRigidBody145); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRigidBody"


    // $ANTLR start "ruleRigidBody"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:104:1: ruleRigidBody : ( ( rule__RigidBody__Group__0 ) ) ;
    public final void ruleRigidBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:108:2: ( ( ( rule__RigidBody__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:109:1: ( ( rule__RigidBody__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:109:1: ( ( rule__RigidBody__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:110:1: ( rule__RigidBody__Group__0 )
            {
             before(grammarAccess.getRigidBodyAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:111:1: ( rule__RigidBody__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:111:2: rule__RigidBody__Group__0
            {
            pushFollow(FOLLOW_rule__RigidBody__Group__0_in_ruleRigidBody171);
            rule__RigidBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRigidBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRigidBody"


    // $ANTLR start "entryRuleJoint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:123:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:124:1: ( ruleJoint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:125:1: ruleJoint EOF
            {
             before(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_ruleJoint_in_entryRuleJoint198);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getJointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoint205); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:132:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:136:2: ( ( ( rule__Joint__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:137:1: ( ( rule__Joint__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:137:1: ( ( rule__Joint__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:138:1: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:139:1: ( rule__Joint__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:139:2: rule__Joint__Group__0
            {
            pushFollow(FOLLOW_rule__Joint__Group__0_in_ruleJoint231);
            rule__Joint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleMass"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:151:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:152:1: ( ruleMass EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:153:1: ruleMass EOF
            {
             before(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_ruleMass_in_entryRuleMass258);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getMassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMass265); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:160:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:164:2: ( ( ( rule__Mass__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:165:1: ( ( rule__Mass__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:165:1: ( ( rule__Mass__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:166:1: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:167:1: ( rule__Mass__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:167:2: rule__Mass__Group__0
            {
            pushFollow(FOLLOW_rule__Mass__Group__0_in_ruleMass291);
            rule__Mass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleTransformation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:179:1: entryRuleTransformation : ruleTransformation EOF ;
    public final void entryRuleTransformation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:180:1: ( ruleTransformation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:181:1: ruleTransformation EOF
            {
             before(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_ruleTransformation_in_entryRuleTransformation318);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getTransformationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransformation325); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:188:1: ruleTransformation : ( ( rule__Transformation__Group__0 ) ) ;
    public final void ruleTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:192:2: ( ( ( rule__Transformation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:193:1: ( ( rule__Transformation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:193:1: ( ( rule__Transformation__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:194:1: ( rule__Transformation__Group__0 )
            {
             before(grammarAccess.getTransformationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:195:1: ( rule__Transformation__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:195:2: rule__Transformation__Group__0
            {
            pushFollow(FOLLOW_rule__Transformation__Group__0_in_ruleTransformation351);
            rule__Transformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:207:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:208:1: ( ruleConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:209:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint378);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint385); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:216:1: ruleConstraint : ( ruleColocationConstraint ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:220:2: ( ( ruleColocationConstraint ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:221:1: ( ruleColocationConstraint )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:221:1: ( ruleColocationConstraint )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:222:1: ruleColocationConstraint
            {
             before(grammarAccess.getConstraintAccess().getColocationConstraintParserRuleCall()); 
            pushFollow(FOLLOW_ruleColocationConstraint_in_ruleConstraint411);
            ruleColocationConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getColocationConstraintParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleColocationConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:235:1: entryRuleColocationConstraint : ruleColocationConstraint EOF ;
    public final void entryRuleColocationConstraint() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:236:1: ( ruleColocationConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:237:1: ruleColocationConstraint EOF
            {
             before(grammarAccess.getColocationConstraintRule()); 
            pushFollow(FOLLOW_ruleColocationConstraint_in_entryRuleColocationConstraint437);
            ruleColocationConstraint();

            state._fsp--;

             after(grammarAccess.getColocationConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColocationConstraint444); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColocationConstraint"


    // $ANTLR start "ruleColocationConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:244:1: ruleColocationConstraint : ( ( rule__ColocationConstraint__Group__0 ) ) ;
    public final void ruleColocationConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:248:2: ( ( ( rule__ColocationConstraint__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:249:1: ( ( rule__ColocationConstraint__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:249:1: ( ( rule__ColocationConstraint__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:250:1: ( rule__ColocationConstraint__Group__0 )
            {
             before(grammarAccess.getColocationConstraintAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:251:1: ( rule__ColocationConstraint__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:251:2: rule__ColocationConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Group__0_in_ruleColocationConstraint470);
            rule__ColocationConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColocationConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColocationConstraint"


    // $ANTLR start "rule__RigidBody__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:265:1: rule__RigidBody__Group__0 : rule__RigidBody__Group__0__Impl rule__RigidBody__Group__1 ;
    public final void rule__RigidBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:269:1: ( rule__RigidBody__Group__0__Impl rule__RigidBody__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:270:2: rule__RigidBody__Group__0__Impl rule__RigidBody__Group__1
            {
            pushFollow(FOLLOW_rule__RigidBody__Group__0__Impl_in_rule__RigidBody__Group__0504);
            rule__RigidBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RigidBody__Group__1_in_rule__RigidBody__Group__0507);
            rule__RigidBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__0"


    // $ANTLR start "rule__RigidBody__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:277:1: rule__RigidBody__Group__0__Impl : ( 'rigid_body' ) ;
    public final void rule__RigidBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:281:1: ( ( 'rigid_body' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:282:1: ( 'rigid_body' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:282:1: ( 'rigid_body' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:283:1: 'rigid_body'
            {
             before(grammarAccess.getRigidBodyAccess().getRigid_bodyKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__RigidBody__Group__0__Impl535); 
             after(grammarAccess.getRigidBodyAccess().getRigid_bodyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__0__Impl"


    // $ANTLR start "rule__RigidBody__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:296:1: rule__RigidBody__Group__1 : rule__RigidBody__Group__1__Impl rule__RigidBody__Group__2 ;
    public final void rule__RigidBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:300:1: ( rule__RigidBody__Group__1__Impl rule__RigidBody__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:301:2: rule__RigidBody__Group__1__Impl rule__RigidBody__Group__2
            {
            pushFollow(FOLLOW_rule__RigidBody__Group__1__Impl_in_rule__RigidBody__Group__1566);
            rule__RigidBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RigidBody__Group__2_in_rule__RigidBody__Group__1569);
            rule__RigidBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__1"


    // $ANTLR start "rule__RigidBody__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:308:1: rule__RigidBody__Group__1__Impl : ( ( rule__RigidBody__NameAssignment_1 ) ) ;
    public final void rule__RigidBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:312:1: ( ( ( rule__RigidBody__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:313:1: ( ( rule__RigidBody__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:313:1: ( ( rule__RigidBody__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:314:1: ( rule__RigidBody__NameAssignment_1 )
            {
             before(grammarAccess.getRigidBodyAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:315:1: ( rule__RigidBody__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:315:2: rule__RigidBody__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RigidBody__NameAssignment_1_in_rule__RigidBody__Group__1__Impl596);
            rule__RigidBody__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRigidBodyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__1__Impl"


    // $ANTLR start "rule__RigidBody__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:325:1: rule__RigidBody__Group__2 : rule__RigidBody__Group__2__Impl rule__RigidBody__Group__3 ;
    public final void rule__RigidBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:329:1: ( rule__RigidBody__Group__2__Impl rule__RigidBody__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:330:2: rule__RigidBody__Group__2__Impl rule__RigidBody__Group__3
            {
            pushFollow(FOLLOW_rule__RigidBody__Group__2__Impl_in_rule__RigidBody__Group__2626);
            rule__RigidBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RigidBody__Group__3_in_rule__RigidBody__Group__2629);
            rule__RigidBody__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__2"


    // $ANTLR start "rule__RigidBody__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:337:1: rule__RigidBody__Group__2__Impl : ( '{' ) ;
    public final void rule__RigidBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:341:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:342:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:342:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:343:1: '{'
            {
             before(grammarAccess.getRigidBodyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__RigidBody__Group__2__Impl657); 
             after(grammarAccess.getRigidBodyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__2__Impl"


    // $ANTLR start "rule__RigidBody__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:356:1: rule__RigidBody__Group__3 : rule__RigidBody__Group__3__Impl rule__RigidBody__Group__4 ;
    public final void rule__RigidBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:360:1: ( rule__RigidBody__Group__3__Impl rule__RigidBody__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:361:2: rule__RigidBody__Group__3__Impl rule__RigidBody__Group__4
            {
            pushFollow(FOLLOW_rule__RigidBody__Group__3__Impl_in_rule__RigidBody__Group__3688);
            rule__RigidBody__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RigidBody__Group__4_in_rule__RigidBody__Group__3691);
            rule__RigidBody__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__3"


    // $ANTLR start "rule__RigidBody__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:368:1: rule__RigidBody__Group__3__Impl : ( ( ( rule__RigidBody__JointsAssignment_3 ) ) ( ( rule__RigidBody__JointsAssignment_3 )* ) ) ;
    public final void rule__RigidBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:372:1: ( ( ( ( rule__RigidBody__JointsAssignment_3 ) ) ( ( rule__RigidBody__JointsAssignment_3 )* ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:373:1: ( ( ( rule__RigidBody__JointsAssignment_3 ) ) ( ( rule__RigidBody__JointsAssignment_3 )* ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:373:1: ( ( ( rule__RigidBody__JointsAssignment_3 ) ) ( ( rule__RigidBody__JointsAssignment_3 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:374:1: ( ( rule__RigidBody__JointsAssignment_3 ) ) ( ( rule__RigidBody__JointsAssignment_3 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:374:1: ( ( rule__RigidBody__JointsAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:375:1: ( rule__RigidBody__JointsAssignment_3 )
            {
             before(grammarAccess.getRigidBodyAccess().getJointsAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:376:1: ( rule__RigidBody__JointsAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:376:2: rule__RigidBody__JointsAssignment_3
            {
            pushFollow(FOLLOW_rule__RigidBody__JointsAssignment_3_in_rule__RigidBody__Group__3__Impl720);
            rule__RigidBody__JointsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRigidBodyAccess().getJointsAssignment_3()); 

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:379:1: ( ( rule__RigidBody__JointsAssignment_3 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:380:1: ( rule__RigidBody__JointsAssignment_3 )*
            {
             before(grammarAccess.getRigidBodyAccess().getJointsAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:381:1: ( rule__RigidBody__JointsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:381:2: rule__RigidBody__JointsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__RigidBody__JointsAssignment_3_in_rule__RigidBody__Group__3__Impl732);
            	    rule__RigidBody__JointsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getRigidBodyAccess().getJointsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__3__Impl"


    // $ANTLR start "rule__RigidBody__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:392:1: rule__RigidBody__Group__4 : rule__RigidBody__Group__4__Impl rule__RigidBody__Group__5 ;
    public final void rule__RigidBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:396:1: ( rule__RigidBody__Group__4__Impl rule__RigidBody__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:397:2: rule__RigidBody__Group__4__Impl rule__RigidBody__Group__5
            {
            pushFollow(FOLLOW_rule__RigidBody__Group__4__Impl_in_rule__RigidBody__Group__4765);
            rule__RigidBody__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RigidBody__Group__5_in_rule__RigidBody__Group__4768);
            rule__RigidBody__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__4"


    // $ANTLR start "rule__RigidBody__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:404:1: rule__RigidBody__Group__4__Impl : ( ( ( rule__RigidBody__MassesAssignment_4 ) ) ( ( rule__RigidBody__MassesAssignment_4 )* ) ) ;
    public final void rule__RigidBody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:408:1: ( ( ( ( rule__RigidBody__MassesAssignment_4 ) ) ( ( rule__RigidBody__MassesAssignment_4 )* ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:409:1: ( ( ( rule__RigidBody__MassesAssignment_4 ) ) ( ( rule__RigidBody__MassesAssignment_4 )* ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:409:1: ( ( ( rule__RigidBody__MassesAssignment_4 ) ) ( ( rule__RigidBody__MassesAssignment_4 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:410:1: ( ( rule__RigidBody__MassesAssignment_4 ) ) ( ( rule__RigidBody__MassesAssignment_4 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:410:1: ( ( rule__RigidBody__MassesAssignment_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:411:1: ( rule__RigidBody__MassesAssignment_4 )
            {
             before(grammarAccess.getRigidBodyAccess().getMassesAssignment_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:412:1: ( rule__RigidBody__MassesAssignment_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:412:2: rule__RigidBody__MassesAssignment_4
            {
            pushFollow(FOLLOW_rule__RigidBody__MassesAssignment_4_in_rule__RigidBody__Group__4__Impl797);
            rule__RigidBody__MassesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRigidBodyAccess().getMassesAssignment_4()); 

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:415:1: ( ( rule__RigidBody__MassesAssignment_4 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:416:1: ( rule__RigidBody__MassesAssignment_4 )*
            {
             before(grammarAccess.getRigidBodyAccess().getMassesAssignment_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:417:1: ( rule__RigidBody__MassesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:417:2: rule__RigidBody__MassesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__RigidBody__MassesAssignment_4_in_rule__RigidBody__Group__4__Impl809);
            	    rule__RigidBody__MassesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRigidBodyAccess().getMassesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__4__Impl"


    // $ANTLR start "rule__RigidBody__Group__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:428:1: rule__RigidBody__Group__5 : rule__RigidBody__Group__5__Impl rule__RigidBody__Group__6 ;
    public final void rule__RigidBody__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:432:1: ( rule__RigidBody__Group__5__Impl rule__RigidBody__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:433:2: rule__RigidBody__Group__5__Impl rule__RigidBody__Group__6
            {
            pushFollow(FOLLOW_rule__RigidBody__Group__5__Impl_in_rule__RigidBody__Group__5842);
            rule__RigidBody__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RigidBody__Group__6_in_rule__RigidBody__Group__5845);
            rule__RigidBody__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__5"


    // $ANTLR start "rule__RigidBody__Group__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:440:1: rule__RigidBody__Group__5__Impl : ( ( rule__RigidBody__ConstraintsAssignment_5 )* ) ;
    public final void rule__RigidBody__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:444:1: ( ( ( rule__RigidBody__ConstraintsAssignment_5 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:445:1: ( ( rule__RigidBody__ConstraintsAssignment_5 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:445:1: ( ( rule__RigidBody__ConstraintsAssignment_5 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:446:1: ( rule__RigidBody__ConstraintsAssignment_5 )*
            {
             before(grammarAccess.getRigidBodyAccess().getConstraintsAssignment_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:447:1: ( rule__RigidBody__ConstraintsAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:447:2: rule__RigidBody__ConstraintsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__RigidBody__ConstraintsAssignment_5_in_rule__RigidBody__Group__5__Impl872);
            	    rule__RigidBody__ConstraintsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRigidBodyAccess().getConstraintsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__5__Impl"


    // $ANTLR start "rule__RigidBody__Group__6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:457:1: rule__RigidBody__Group__6 : rule__RigidBody__Group__6__Impl ;
    public final void rule__RigidBody__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:461:1: ( rule__RigidBody__Group__6__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:462:2: rule__RigidBody__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__RigidBody__Group__6__Impl_in_rule__RigidBody__Group__6903);
            rule__RigidBody__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__6"


    // $ANTLR start "rule__RigidBody__Group__6__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:468:1: rule__RigidBody__Group__6__Impl : ( '}' ) ;
    public final void rule__RigidBody__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:472:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:473:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:473:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:474:1: '}'
            {
             before(grammarAccess.getRigidBodyAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__RigidBody__Group__6__Impl931); 
             after(grammarAccess.getRigidBodyAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__Group__6__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:501:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:505:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:506:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_rule__Joint__Group__0__Impl_in_rule__Joint__Group__0976);
            rule__Joint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__1_in_rule__Joint__Group__0979);
            rule__Joint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0"


    // $ANTLR start "rule__Joint__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:513:1: rule__Joint__Group__0__Impl : ( 'joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:517:1: ( ( 'joint' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:518:1: ( 'joint' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:518:1: ( 'joint' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:519:1: 'joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Joint__Group__0__Impl1007); 
             after(grammarAccess.getJointAccess().getJointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0__Impl"


    // $ANTLR start "rule__Joint__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:532:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:536:1: ( rule__Joint__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:537:2: rule__Joint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Joint__Group__1__Impl_in_rule__Joint__Group__11038);
            rule__Joint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1"


    // $ANTLR start "rule__Joint__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:543:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:547:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:548:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:548:1: ( ( rule__Joint__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:549:1: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:550:1: ( rule__Joint__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:550:2: rule__Joint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Joint__NameAssignment_1_in_rule__Joint__Group__1__Impl1065);
            rule__Joint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1__Impl"


    // $ANTLR start "rule__Mass__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:564:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:568:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:569:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_rule__Mass__Group__0__Impl_in_rule__Mass__Group__01099);
            rule__Mass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__1_in_rule__Mass__Group__01102);
            rule__Mass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0"


    // $ANTLR start "rule__Mass__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:576:1: rule__Mass__Group__0__Impl : ( 'mass' ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:580:1: ( ( 'mass' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:581:1: ( 'mass' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:581:1: ( 'mass' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:582:1: 'mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Mass__Group__0__Impl1130); 
             after(grammarAccess.getMassAccess().getMassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0__Impl"


    // $ANTLR start "rule__Mass__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:595:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:599:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:600:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_rule__Mass__Group__1__Impl_in_rule__Mass__Group__11161);
            rule__Mass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__2_in_rule__Mass__Group__11164);
            rule__Mass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__1"


    // $ANTLR start "rule__Mass__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:607:1: rule__Mass__Group__1__Impl : ( ( rule__Mass__NameAssignment_1 ) ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:611:1: ( ( ( rule__Mass__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:612:1: ( ( rule__Mass__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:612:1: ( ( rule__Mass__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:613:1: ( rule__Mass__NameAssignment_1 )
            {
             before(grammarAccess.getMassAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:614:1: ( rule__Mass__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:614:2: rule__Mass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Mass__NameAssignment_1_in_rule__Mass__Group__1__Impl1191);
            rule__Mass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__1__Impl"


    // $ANTLR start "rule__Mass__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:624:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:628:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:629:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_rule__Mass__Group__2__Impl_in_rule__Mass__Group__21221);
            rule__Mass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__3_in_rule__Mass__Group__21224);
            rule__Mass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__2"


    // $ANTLR start "rule__Mass__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:636:1: rule__Mass__Group__2__Impl : ( ( rule__Mass__ValueAssignment_2 ) ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:640:1: ( ( ( rule__Mass__ValueAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:641:1: ( ( rule__Mass__ValueAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:641:1: ( ( rule__Mass__ValueAssignment_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:642:1: ( rule__Mass__ValueAssignment_2 )
            {
             before(grammarAccess.getMassAccess().getValueAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:643:1: ( rule__Mass__ValueAssignment_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:643:2: rule__Mass__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Mass__ValueAssignment_2_in_rule__Mass__Group__2__Impl1251);
            rule__Mass__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__2__Impl"


    // $ANTLR start "rule__Mass__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:653:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:657:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:658:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
            {
            pushFollow(FOLLOW_rule__Mass__Group__3__Impl_in_rule__Mass__Group__31281);
            rule__Mass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__4_in_rule__Mass__Group__31284);
            rule__Mass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__3"


    // $ANTLR start "rule__Mass__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:665:1: rule__Mass__Group__3__Impl : ( 'kg' ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:669:1: ( ( 'kg' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:670:1: ( 'kg' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:670:1: ( 'kg' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:671:1: 'kg'
            {
             before(grammarAccess.getMassAccess().getKgKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Mass__Group__3__Impl1312); 
             after(grammarAccess.getMassAccess().getKgKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__3__Impl"


    // $ANTLR start "rule__Mass__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:684:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl rule__Mass__Group__5 ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:688:1: ( rule__Mass__Group__4__Impl rule__Mass__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:689:2: rule__Mass__Group__4__Impl rule__Mass__Group__5
            {
            pushFollow(FOLLOW_rule__Mass__Group__4__Impl_in_rule__Mass__Group__41343);
            rule__Mass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__5_in_rule__Mass__Group__41346);
            rule__Mass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__4"


    // $ANTLR start "rule__Mass__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:696:1: rule__Mass__Group__4__Impl : ( '{' ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:700:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:701:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:701:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:702:1: '{'
            {
             before(grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Mass__Group__4__Impl1374); 
             after(grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__4__Impl"


    // $ANTLR start "rule__Mass__Group__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:715:1: rule__Mass__Group__5 : rule__Mass__Group__5__Impl rule__Mass__Group__6 ;
    public final void rule__Mass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:719:1: ( rule__Mass__Group__5__Impl rule__Mass__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:720:2: rule__Mass__Group__5__Impl rule__Mass__Group__6
            {
            pushFollow(FOLLOW_rule__Mass__Group__5__Impl_in_rule__Mass__Group__51405);
            rule__Mass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__6_in_rule__Mass__Group__51408);
            rule__Mass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__5"


    // $ANTLR start "rule__Mass__Group__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:727:1: rule__Mass__Group__5__Impl : ( ( ( rule__Mass__TransformationsAssignment_5 ) ) ( ( rule__Mass__TransformationsAssignment_5 )* ) ) ;
    public final void rule__Mass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:731:1: ( ( ( ( rule__Mass__TransformationsAssignment_5 ) ) ( ( rule__Mass__TransformationsAssignment_5 )* ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:732:1: ( ( ( rule__Mass__TransformationsAssignment_5 ) ) ( ( rule__Mass__TransformationsAssignment_5 )* ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:732:1: ( ( ( rule__Mass__TransformationsAssignment_5 ) ) ( ( rule__Mass__TransformationsAssignment_5 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:733:1: ( ( rule__Mass__TransformationsAssignment_5 ) ) ( ( rule__Mass__TransformationsAssignment_5 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:733:1: ( ( rule__Mass__TransformationsAssignment_5 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:734:1: ( rule__Mass__TransformationsAssignment_5 )
            {
             before(grammarAccess.getMassAccess().getTransformationsAssignment_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:735:1: ( rule__Mass__TransformationsAssignment_5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:735:2: rule__Mass__TransformationsAssignment_5
            {
            pushFollow(FOLLOW_rule__Mass__TransformationsAssignment_5_in_rule__Mass__Group__5__Impl1437);
            rule__Mass__TransformationsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getTransformationsAssignment_5()); 

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:738:1: ( ( rule__Mass__TransformationsAssignment_5 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:739:1: ( rule__Mass__TransformationsAssignment_5 )*
            {
             before(grammarAccess.getMassAccess().getTransformationsAssignment_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:740:1: ( rule__Mass__TransformationsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:740:2: rule__Mass__TransformationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Mass__TransformationsAssignment_5_in_rule__Mass__Group__5__Impl1449);
            	    rule__Mass__TransformationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMassAccess().getTransformationsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__5__Impl"


    // $ANTLR start "rule__Mass__Group__6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:751:1: rule__Mass__Group__6 : rule__Mass__Group__6__Impl ;
    public final void rule__Mass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:755:1: ( rule__Mass__Group__6__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:756:2: rule__Mass__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Mass__Group__6__Impl_in_rule__Mass__Group__61482);
            rule__Mass__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__6"


    // $ANTLR start "rule__Mass__Group__6__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:762:1: rule__Mass__Group__6__Impl : ( '}' ) ;
    public final void rule__Mass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:766:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:767:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:767:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:768:1: '}'
            {
             before(grammarAccess.getMassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Mass__Group__6__Impl1510); 
             after(grammarAccess.getMassAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__6__Impl"


    // $ANTLR start "rule__Transformation__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:795:1: rule__Transformation__Group__0 : rule__Transformation__Group__0__Impl rule__Transformation__Group__1 ;
    public final void rule__Transformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:799:1: ( rule__Transformation__Group__0__Impl rule__Transformation__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:800:2: rule__Transformation__Group__0__Impl rule__Transformation__Group__1
            {
            pushFollow(FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__01555);
            rule__Transformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__01558);
            rule__Transformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__0"


    // $ANTLR start "rule__Transformation__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:807:1: rule__Transformation__Group__0__Impl : ( 'transformation' ) ;
    public final void rule__Transformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:811:1: ( ( 'transformation' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:812:1: ( 'transformation' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:812:1: ( 'transformation' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:813:1: 'transformation'
            {
             before(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Transformation__Group__0__Impl1586); 
             after(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__0__Impl"


    // $ANTLR start "rule__Transformation__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:826:1: rule__Transformation__Group__1 : rule__Transformation__Group__1__Impl rule__Transformation__Group__2 ;
    public final void rule__Transformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:830:1: ( rule__Transformation__Group__1__Impl rule__Transformation__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:831:2: rule__Transformation__Group__1__Impl rule__Transformation__Group__2
            {
            pushFollow(FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__11617);
            rule__Transformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__11620);
            rule__Transformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__1"


    // $ANTLR start "rule__Transformation__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:838:1: rule__Transformation__Group__1__Impl : ( 'relative' ) ;
    public final void rule__Transformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:842:1: ( ( 'relative' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:843:1: ( 'relative' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:843:1: ( 'relative' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:844:1: 'relative'
            {
             before(grammarAccess.getTransformationAccess().getRelativeKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Transformation__Group__1__Impl1648); 
             after(grammarAccess.getTransformationAccess().getRelativeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__1__Impl"


    // $ANTLR start "rule__Transformation__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:857:1: rule__Transformation__Group__2 : rule__Transformation__Group__2__Impl rule__Transformation__Group__3 ;
    public final void rule__Transformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:861:1: ( rule__Transformation__Group__2__Impl rule__Transformation__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:862:2: rule__Transformation__Group__2__Impl rule__Transformation__Group__3
            {
            pushFollow(FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__21679);
            rule__Transformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__21682);
            rule__Transformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__2"


    // $ANTLR start "rule__Transformation__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:869:1: rule__Transformation__Group__2__Impl : ( 'to' ) ;
    public final void rule__Transformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:873:1: ( ( 'to' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:874:1: ( 'to' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:874:1: ( 'to' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:875:1: 'to'
            {
             before(grammarAccess.getTransformationAccess().getToKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Transformation__Group__2__Impl1710); 
             after(grammarAccess.getTransformationAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__2__Impl"


    // $ANTLR start "rule__Transformation__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:888:1: rule__Transformation__Group__3 : rule__Transformation__Group__3__Impl rule__Transformation__Group__4 ;
    public final void rule__Transformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:892:1: ( rule__Transformation__Group__3__Impl rule__Transformation__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:893:2: rule__Transformation__Group__3__Impl rule__Transformation__Group__4
            {
            pushFollow(FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__31741);
            rule__Transformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__31744);
            rule__Transformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__3"


    // $ANTLR start "rule__Transformation__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:900:1: rule__Transformation__Group__3__Impl : ( ( rule__Transformation__JointAssignment_3 ) ) ;
    public final void rule__Transformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:904:1: ( ( ( rule__Transformation__JointAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:905:1: ( ( rule__Transformation__JointAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:905:1: ( ( rule__Transformation__JointAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:906:1: ( rule__Transformation__JointAssignment_3 )
            {
             before(grammarAccess.getTransformationAccess().getJointAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:907:1: ( rule__Transformation__JointAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:907:2: rule__Transformation__JointAssignment_3
            {
            pushFollow(FOLLOW_rule__Transformation__JointAssignment_3_in_rule__Transformation__Group__3__Impl1771);
            rule__Transformation__JointAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getJointAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__3__Impl"


    // $ANTLR start "rule__Transformation__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:917:1: rule__Transformation__Group__4 : rule__Transformation__Group__4__Impl rule__Transformation__Group__5 ;
    public final void rule__Transformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:921:1: ( rule__Transformation__Group__4__Impl rule__Transformation__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:922:2: rule__Transformation__Group__4__Impl rule__Transformation__Group__5
            {
            pushFollow(FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__41801);
            rule__Transformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__5_in_rule__Transformation__Group__41804);
            rule__Transformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__4"


    // $ANTLR start "rule__Transformation__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:929:1: rule__Transformation__Group__4__Impl : ( '(' ) ;
    public final void rule__Transformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:933:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:934:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:934:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:935:1: '('
            {
             before(grammarAccess.getTransformationAccess().getLeftParenthesisKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Transformation__Group__4__Impl1832); 
             after(grammarAccess.getTransformationAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__4__Impl"


    // $ANTLR start "rule__Transformation__Group__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:948:1: rule__Transformation__Group__5 : rule__Transformation__Group__5__Impl rule__Transformation__Group__6 ;
    public final void rule__Transformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:952:1: ( rule__Transformation__Group__5__Impl rule__Transformation__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:953:2: rule__Transformation__Group__5__Impl rule__Transformation__Group__6
            {
            pushFollow(FOLLOW_rule__Transformation__Group__5__Impl_in_rule__Transformation__Group__51863);
            rule__Transformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__6_in_rule__Transformation__Group__51866);
            rule__Transformation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__5"


    // $ANTLR start "rule__Transformation__Group__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:960:1: rule__Transformation__Group__5__Impl : ( RULE_REAL ) ;
    public final void rule__Transformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:964:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:965:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:965:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:966:1: RULE_REAL
            {
             before(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_5()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Transformation__Group__5__Impl1893); 
             after(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__5__Impl"


    // $ANTLR start "rule__Transformation__Group__6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:977:1: rule__Transformation__Group__6 : rule__Transformation__Group__6__Impl rule__Transformation__Group__7 ;
    public final void rule__Transformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:981:1: ( rule__Transformation__Group__6__Impl rule__Transformation__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:982:2: rule__Transformation__Group__6__Impl rule__Transformation__Group__7
            {
            pushFollow(FOLLOW_rule__Transformation__Group__6__Impl_in_rule__Transformation__Group__61922);
            rule__Transformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__7_in_rule__Transformation__Group__61925);
            rule__Transformation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__6"


    // $ANTLR start "rule__Transformation__Group__6__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:989:1: rule__Transformation__Group__6__Impl : ( ',' ) ;
    public final void rule__Transformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:993:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:994:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:994:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:995:1: ','
            {
             before(grammarAccess.getTransformationAccess().getCommaKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__Transformation__Group__6__Impl1953); 
             after(grammarAccess.getTransformationAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__6__Impl"


    // $ANTLR start "rule__Transformation__Group__7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1008:1: rule__Transformation__Group__7 : rule__Transformation__Group__7__Impl rule__Transformation__Group__8 ;
    public final void rule__Transformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1012:1: ( rule__Transformation__Group__7__Impl rule__Transformation__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1013:2: rule__Transformation__Group__7__Impl rule__Transformation__Group__8
            {
            pushFollow(FOLLOW_rule__Transformation__Group__7__Impl_in_rule__Transformation__Group__71984);
            rule__Transformation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__8_in_rule__Transformation__Group__71987);
            rule__Transformation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__7"


    // $ANTLR start "rule__Transformation__Group__7__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1020:1: rule__Transformation__Group__7__Impl : ( RULE_REAL ) ;
    public final void rule__Transformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1024:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1025:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1025:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1026:1: RULE_REAL
            {
             before(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_7()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Transformation__Group__7__Impl2014); 
             after(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__7__Impl"


    // $ANTLR start "rule__Transformation__Group__8"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1037:1: rule__Transformation__Group__8 : rule__Transformation__Group__8__Impl rule__Transformation__Group__9 ;
    public final void rule__Transformation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1041:1: ( rule__Transformation__Group__8__Impl rule__Transformation__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1042:2: rule__Transformation__Group__8__Impl rule__Transformation__Group__9
            {
            pushFollow(FOLLOW_rule__Transformation__Group__8__Impl_in_rule__Transformation__Group__82043);
            rule__Transformation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__9_in_rule__Transformation__Group__82046);
            rule__Transformation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__8"


    // $ANTLR start "rule__Transformation__Group__8__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1049:1: rule__Transformation__Group__8__Impl : ( ',' ) ;
    public final void rule__Transformation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1053:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1054:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1054:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1055:1: ','
            {
             before(grammarAccess.getTransformationAccess().getCommaKeyword_8()); 
            match(input,22,FOLLOW_22_in_rule__Transformation__Group__8__Impl2074); 
             after(grammarAccess.getTransformationAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__8__Impl"


    // $ANTLR start "rule__Transformation__Group__9"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1068:1: rule__Transformation__Group__9 : rule__Transformation__Group__9__Impl rule__Transformation__Group__10 ;
    public final void rule__Transformation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1072:1: ( rule__Transformation__Group__9__Impl rule__Transformation__Group__10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1073:2: rule__Transformation__Group__9__Impl rule__Transformation__Group__10
            {
            pushFollow(FOLLOW_rule__Transformation__Group__9__Impl_in_rule__Transformation__Group__92105);
            rule__Transformation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__10_in_rule__Transformation__Group__92108);
            rule__Transformation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__9"


    // $ANTLR start "rule__Transformation__Group__9__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1080:1: rule__Transformation__Group__9__Impl : ( RULE_REAL ) ;
    public final void rule__Transformation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1084:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1085:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1085:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1086:1: RULE_REAL
            {
             before(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_9()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Transformation__Group__9__Impl2135); 
             after(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__9__Impl"


    // $ANTLR start "rule__Transformation__Group__10"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1097:1: rule__Transformation__Group__10 : rule__Transformation__Group__10__Impl rule__Transformation__Group__11 ;
    public final void rule__Transformation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1101:1: ( rule__Transformation__Group__10__Impl rule__Transformation__Group__11 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1102:2: rule__Transformation__Group__10__Impl rule__Transformation__Group__11
            {
            pushFollow(FOLLOW_rule__Transformation__Group__10__Impl_in_rule__Transformation__Group__102164);
            rule__Transformation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__11_in_rule__Transformation__Group__102167);
            rule__Transformation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__10"


    // $ANTLR start "rule__Transformation__Group__10__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1109:1: rule__Transformation__Group__10__Impl : ( ';' ) ;
    public final void rule__Transformation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1113:1: ( ( ';' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1114:1: ( ';' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1114:1: ( ';' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1115:1: ';'
            {
             before(grammarAccess.getTransformationAccess().getSemicolonKeyword_10()); 
            match(input,23,FOLLOW_23_in_rule__Transformation__Group__10__Impl2195); 
             after(grammarAccess.getTransformationAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__10__Impl"


    // $ANTLR start "rule__Transformation__Group__11"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1128:1: rule__Transformation__Group__11 : rule__Transformation__Group__11__Impl rule__Transformation__Group__12 ;
    public final void rule__Transformation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1132:1: ( rule__Transformation__Group__11__Impl rule__Transformation__Group__12 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1133:2: rule__Transformation__Group__11__Impl rule__Transformation__Group__12
            {
            pushFollow(FOLLOW_rule__Transformation__Group__11__Impl_in_rule__Transformation__Group__112226);
            rule__Transformation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__12_in_rule__Transformation__Group__112229);
            rule__Transformation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__11"


    // $ANTLR start "rule__Transformation__Group__11__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1140:1: rule__Transformation__Group__11__Impl : ( RULE_REAL ) ;
    public final void rule__Transformation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1144:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1145:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1145:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1146:1: RULE_REAL
            {
             before(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_11()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Transformation__Group__11__Impl2256); 
             after(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__11__Impl"


    // $ANTLR start "rule__Transformation__Group__12"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1157:1: rule__Transformation__Group__12 : rule__Transformation__Group__12__Impl rule__Transformation__Group__13 ;
    public final void rule__Transformation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1161:1: ( rule__Transformation__Group__12__Impl rule__Transformation__Group__13 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1162:2: rule__Transformation__Group__12__Impl rule__Transformation__Group__13
            {
            pushFollow(FOLLOW_rule__Transformation__Group__12__Impl_in_rule__Transformation__Group__122285);
            rule__Transformation__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__13_in_rule__Transformation__Group__122288);
            rule__Transformation__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__12"


    // $ANTLR start "rule__Transformation__Group__12__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1169:1: rule__Transformation__Group__12__Impl : ( ',' ) ;
    public final void rule__Transformation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1173:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1174:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1174:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1175:1: ','
            {
             before(grammarAccess.getTransformationAccess().getCommaKeyword_12()); 
            match(input,22,FOLLOW_22_in_rule__Transformation__Group__12__Impl2316); 
             after(grammarAccess.getTransformationAccess().getCommaKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__12__Impl"


    // $ANTLR start "rule__Transformation__Group__13"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1188:1: rule__Transformation__Group__13 : rule__Transformation__Group__13__Impl rule__Transformation__Group__14 ;
    public final void rule__Transformation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1192:1: ( rule__Transformation__Group__13__Impl rule__Transformation__Group__14 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1193:2: rule__Transformation__Group__13__Impl rule__Transformation__Group__14
            {
            pushFollow(FOLLOW_rule__Transformation__Group__13__Impl_in_rule__Transformation__Group__132347);
            rule__Transformation__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__14_in_rule__Transformation__Group__132350);
            rule__Transformation__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__13"


    // $ANTLR start "rule__Transformation__Group__13__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1200:1: rule__Transformation__Group__13__Impl : ( RULE_REAL ) ;
    public final void rule__Transformation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1204:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1205:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1205:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1206:1: RULE_REAL
            {
             before(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_13()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Transformation__Group__13__Impl2377); 
             after(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__13__Impl"


    // $ANTLR start "rule__Transformation__Group__14"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1217:1: rule__Transformation__Group__14 : rule__Transformation__Group__14__Impl rule__Transformation__Group__15 ;
    public final void rule__Transformation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1221:1: ( rule__Transformation__Group__14__Impl rule__Transformation__Group__15 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1222:2: rule__Transformation__Group__14__Impl rule__Transformation__Group__15
            {
            pushFollow(FOLLOW_rule__Transformation__Group__14__Impl_in_rule__Transformation__Group__142406);
            rule__Transformation__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__15_in_rule__Transformation__Group__142409);
            rule__Transformation__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__14"


    // $ANTLR start "rule__Transformation__Group__14__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1229:1: rule__Transformation__Group__14__Impl : ( ',' ) ;
    public final void rule__Transformation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1233:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1234:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1234:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1235:1: ','
            {
             before(grammarAccess.getTransformationAccess().getCommaKeyword_14()); 
            match(input,22,FOLLOW_22_in_rule__Transformation__Group__14__Impl2437); 
             after(grammarAccess.getTransformationAccess().getCommaKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__14__Impl"


    // $ANTLR start "rule__Transformation__Group__15"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1248:1: rule__Transformation__Group__15 : rule__Transformation__Group__15__Impl rule__Transformation__Group__16 ;
    public final void rule__Transformation__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1252:1: ( rule__Transformation__Group__15__Impl rule__Transformation__Group__16 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1253:2: rule__Transformation__Group__15__Impl rule__Transformation__Group__16
            {
            pushFollow(FOLLOW_rule__Transformation__Group__15__Impl_in_rule__Transformation__Group__152468);
            rule__Transformation__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__16_in_rule__Transformation__Group__152471);
            rule__Transformation__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__15"


    // $ANTLR start "rule__Transformation__Group__15__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1260:1: rule__Transformation__Group__15__Impl : ( RULE_REAL ) ;
    public final void rule__Transformation__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1264:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1265:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1265:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1266:1: RULE_REAL
            {
             before(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_15()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Transformation__Group__15__Impl2498); 
             after(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__15__Impl"


    // $ANTLR start "rule__Transformation__Group__16"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1277:1: rule__Transformation__Group__16 : rule__Transformation__Group__16__Impl rule__Transformation__Group__17 ;
    public final void rule__Transformation__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1281:1: ( rule__Transformation__Group__16__Impl rule__Transformation__Group__17 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1282:2: rule__Transformation__Group__16__Impl rule__Transformation__Group__17
            {
            pushFollow(FOLLOW_rule__Transformation__Group__16__Impl_in_rule__Transformation__Group__162527);
            rule__Transformation__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__17_in_rule__Transformation__Group__162530);
            rule__Transformation__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__16"


    // $ANTLR start "rule__Transformation__Group__16__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1289:1: rule__Transformation__Group__16__Impl : ( ';' ) ;
    public final void rule__Transformation__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1293:1: ( ( ';' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1294:1: ( ';' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1294:1: ( ';' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1295:1: ';'
            {
             before(grammarAccess.getTransformationAccess().getSemicolonKeyword_16()); 
            match(input,23,FOLLOW_23_in_rule__Transformation__Group__16__Impl2558); 
             after(grammarAccess.getTransformationAccess().getSemicolonKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__16__Impl"


    // $ANTLR start "rule__Transformation__Group__17"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1308:1: rule__Transformation__Group__17 : rule__Transformation__Group__17__Impl rule__Transformation__Group__18 ;
    public final void rule__Transformation__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1312:1: ( rule__Transformation__Group__17__Impl rule__Transformation__Group__18 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1313:2: rule__Transformation__Group__17__Impl rule__Transformation__Group__18
            {
            pushFollow(FOLLOW_rule__Transformation__Group__17__Impl_in_rule__Transformation__Group__172589);
            rule__Transformation__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__18_in_rule__Transformation__Group__172592);
            rule__Transformation__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__17"


    // $ANTLR start "rule__Transformation__Group__17__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1320:1: rule__Transformation__Group__17__Impl : ( RULE_REAL ) ;
    public final void rule__Transformation__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1324:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1325:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1325:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1326:1: RULE_REAL
            {
             before(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_17()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Transformation__Group__17__Impl2619); 
             after(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__17__Impl"


    // $ANTLR start "rule__Transformation__Group__18"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1337:1: rule__Transformation__Group__18 : rule__Transformation__Group__18__Impl rule__Transformation__Group__19 ;
    public final void rule__Transformation__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1341:1: ( rule__Transformation__Group__18__Impl rule__Transformation__Group__19 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1342:2: rule__Transformation__Group__18__Impl rule__Transformation__Group__19
            {
            pushFollow(FOLLOW_rule__Transformation__Group__18__Impl_in_rule__Transformation__Group__182648);
            rule__Transformation__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__19_in_rule__Transformation__Group__182651);
            rule__Transformation__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__18"


    // $ANTLR start "rule__Transformation__Group__18__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1349:1: rule__Transformation__Group__18__Impl : ( ',' ) ;
    public final void rule__Transformation__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1353:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1354:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1354:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1355:1: ','
            {
             before(grammarAccess.getTransformationAccess().getCommaKeyword_18()); 
            match(input,22,FOLLOW_22_in_rule__Transformation__Group__18__Impl2679); 
             after(grammarAccess.getTransformationAccess().getCommaKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__18__Impl"


    // $ANTLR start "rule__Transformation__Group__19"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1368:1: rule__Transformation__Group__19 : rule__Transformation__Group__19__Impl rule__Transformation__Group__20 ;
    public final void rule__Transformation__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1372:1: ( rule__Transformation__Group__19__Impl rule__Transformation__Group__20 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1373:2: rule__Transformation__Group__19__Impl rule__Transformation__Group__20
            {
            pushFollow(FOLLOW_rule__Transformation__Group__19__Impl_in_rule__Transformation__Group__192710);
            rule__Transformation__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__20_in_rule__Transformation__Group__192713);
            rule__Transformation__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__19"


    // $ANTLR start "rule__Transformation__Group__19__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1380:1: rule__Transformation__Group__19__Impl : ( RULE_REAL ) ;
    public final void rule__Transformation__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1384:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1385:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1385:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1386:1: RULE_REAL
            {
             before(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_19()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Transformation__Group__19__Impl2740); 
             after(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__19__Impl"


    // $ANTLR start "rule__Transformation__Group__20"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1397:1: rule__Transformation__Group__20 : rule__Transformation__Group__20__Impl rule__Transformation__Group__21 ;
    public final void rule__Transformation__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1401:1: ( rule__Transformation__Group__20__Impl rule__Transformation__Group__21 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1402:2: rule__Transformation__Group__20__Impl rule__Transformation__Group__21
            {
            pushFollow(FOLLOW_rule__Transformation__Group__20__Impl_in_rule__Transformation__Group__202769);
            rule__Transformation__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__21_in_rule__Transformation__Group__202772);
            rule__Transformation__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__20"


    // $ANTLR start "rule__Transformation__Group__20__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1409:1: rule__Transformation__Group__20__Impl : ( ',' ) ;
    public final void rule__Transformation__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1413:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1414:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1414:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1415:1: ','
            {
             before(grammarAccess.getTransformationAccess().getCommaKeyword_20()); 
            match(input,22,FOLLOW_22_in_rule__Transformation__Group__20__Impl2800); 
             after(grammarAccess.getTransformationAccess().getCommaKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__20__Impl"


    // $ANTLR start "rule__Transformation__Group__21"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1428:1: rule__Transformation__Group__21 : rule__Transformation__Group__21__Impl rule__Transformation__Group__22 ;
    public final void rule__Transformation__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1432:1: ( rule__Transformation__Group__21__Impl rule__Transformation__Group__22 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1433:2: rule__Transformation__Group__21__Impl rule__Transformation__Group__22
            {
            pushFollow(FOLLOW_rule__Transformation__Group__21__Impl_in_rule__Transformation__Group__212831);
            rule__Transformation__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__22_in_rule__Transformation__Group__212834);
            rule__Transformation__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__21"


    // $ANTLR start "rule__Transformation__Group__21__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1440:1: rule__Transformation__Group__21__Impl : ( RULE_REAL ) ;
    public final void rule__Transformation__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1444:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1445:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1445:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1446:1: RULE_REAL
            {
             before(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_21()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Transformation__Group__21__Impl2861); 
             after(grammarAccess.getTransformationAccess().getREALTerminalRuleCall_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__21__Impl"


    // $ANTLR start "rule__Transformation__Group__22"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1457:1: rule__Transformation__Group__22 : rule__Transformation__Group__22__Impl ;
    public final void rule__Transformation__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1461:1: ( rule__Transformation__Group__22__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1462:2: rule__Transformation__Group__22__Impl
            {
            pushFollow(FOLLOW_rule__Transformation__Group__22__Impl_in_rule__Transformation__Group__222890);
            rule__Transformation__Group__22__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__22"


    // $ANTLR start "rule__Transformation__Group__22__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1468:1: rule__Transformation__Group__22__Impl : ( ')' ) ;
    public final void rule__Transformation__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1472:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1473:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1473:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1474:1: ')'
            {
             before(grammarAccess.getTransformationAccess().getRightParenthesisKeyword_22()); 
            match(input,24,FOLLOW_24_in_rule__Transformation__Group__22__Impl2918); 
             after(grammarAccess.getTransformationAccess().getRightParenthesisKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Group__22__Impl"


    // $ANTLR start "rule__ColocationConstraint__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1533:1: rule__ColocationConstraint__Group__0 : rule__ColocationConstraint__Group__0__Impl rule__ColocationConstraint__Group__1 ;
    public final void rule__ColocationConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1537:1: ( rule__ColocationConstraint__Group__0__Impl rule__ColocationConstraint__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1538:2: rule__ColocationConstraint__Group__0__Impl rule__ColocationConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Group__0__Impl_in_rule__ColocationConstraint__Group__02995);
            rule__ColocationConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColocationConstraint__Group__1_in_rule__ColocationConstraint__Group__02998);
            rule__ColocationConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColocationConstraint__Group__0"


    // $ANTLR start "rule__ColocationConstraint__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1545:1: rule__ColocationConstraint__Group__0__Impl : ( 'colocate' ) ;
    public final void rule__ColocationConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1549:1: ( ( 'colocate' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1550:1: ( 'colocate' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1550:1: ( 'colocate' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1551:1: 'colocate'
            {
             before(grammarAccess.getColocationConstraintAccess().getColocateKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ColocationConstraint__Group__0__Impl3026); 
             after(grammarAccess.getColocationConstraintAccess().getColocateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColocationConstraint__Group__0__Impl"


    // $ANTLR start "rule__ColocationConstraint__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1564:1: rule__ColocationConstraint__Group__1 : rule__ColocationConstraint__Group__1__Impl rule__ColocationConstraint__Group__2 ;
    public final void rule__ColocationConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1568:1: ( rule__ColocationConstraint__Group__1__Impl rule__ColocationConstraint__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1569:2: rule__ColocationConstraint__Group__1__Impl rule__ColocationConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Group__1__Impl_in_rule__ColocationConstraint__Group__13057);
            rule__ColocationConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColocationConstraint__Group__2_in_rule__ColocationConstraint__Group__13060);
            rule__ColocationConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColocationConstraint__Group__1"


    // $ANTLR start "rule__ColocationConstraint__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1576:1: rule__ColocationConstraint__Group__1__Impl : ( ( rule__ColocationConstraint__Joint1Assignment_1 ) ) ;
    public final void rule__ColocationConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1580:1: ( ( ( rule__ColocationConstraint__Joint1Assignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1581:1: ( ( rule__ColocationConstraint__Joint1Assignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1581:1: ( ( rule__ColocationConstraint__Joint1Assignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1582:1: ( rule__ColocationConstraint__Joint1Assignment_1 )
            {
             before(grammarAccess.getColocationConstraintAccess().getJoint1Assignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1583:1: ( rule__ColocationConstraint__Joint1Assignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1583:2: rule__ColocationConstraint__Joint1Assignment_1
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Joint1Assignment_1_in_rule__ColocationConstraint__Group__1__Impl3087);
            rule__ColocationConstraint__Joint1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColocationConstraintAccess().getJoint1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColocationConstraint__Group__1__Impl"


    // $ANTLR start "rule__ColocationConstraint__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1593:1: rule__ColocationConstraint__Group__2 : rule__ColocationConstraint__Group__2__Impl rule__ColocationConstraint__Group__3 ;
    public final void rule__ColocationConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1597:1: ( rule__ColocationConstraint__Group__2__Impl rule__ColocationConstraint__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1598:2: rule__ColocationConstraint__Group__2__Impl rule__ColocationConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Group__2__Impl_in_rule__ColocationConstraint__Group__23117);
            rule__ColocationConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColocationConstraint__Group__3_in_rule__ColocationConstraint__Group__23120);
            rule__ColocationConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColocationConstraint__Group__2"


    // $ANTLR start "rule__ColocationConstraint__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1605:1: rule__ColocationConstraint__Group__2__Impl : ( 'with' ) ;
    public final void rule__ColocationConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1609:1: ( ( 'with' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1610:1: ( 'with' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1610:1: ( 'with' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1611:1: 'with'
            {
             before(grammarAccess.getColocationConstraintAccess().getWithKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__ColocationConstraint__Group__2__Impl3148); 
             after(grammarAccess.getColocationConstraintAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColocationConstraint__Group__2__Impl"


    // $ANTLR start "rule__ColocationConstraint__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1624:1: rule__ColocationConstraint__Group__3 : rule__ColocationConstraint__Group__3__Impl ;
    public final void rule__ColocationConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1628:1: ( rule__ColocationConstraint__Group__3__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1629:2: rule__ColocationConstraint__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Group__3__Impl_in_rule__ColocationConstraint__Group__33179);
            rule__ColocationConstraint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColocationConstraint__Group__3"


    // $ANTLR start "rule__ColocationConstraint__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1635:1: rule__ColocationConstraint__Group__3__Impl : ( ( rule__ColocationConstraint__Joint2Assignment_3 ) ) ;
    public final void rule__ColocationConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1639:1: ( ( ( rule__ColocationConstraint__Joint2Assignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1640:1: ( ( rule__ColocationConstraint__Joint2Assignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1640:1: ( ( rule__ColocationConstraint__Joint2Assignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1641:1: ( rule__ColocationConstraint__Joint2Assignment_3 )
            {
             before(grammarAccess.getColocationConstraintAccess().getJoint2Assignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1642:1: ( rule__ColocationConstraint__Joint2Assignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1642:2: rule__ColocationConstraint__Joint2Assignment_3
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Joint2Assignment_3_in_rule__ColocationConstraint__Group__3__Impl3206);
            rule__ColocationConstraint__Joint2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getColocationConstraintAccess().getJoint2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColocationConstraint__Group__3__Impl"


    // $ANTLR start "rule__Model__RigidBodiesAssignment"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1661:1: rule__Model__RigidBodiesAssignment : ( ruleRigidBody ) ;
    public final void rule__Model__RigidBodiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1665:1: ( ( ruleRigidBody ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1666:1: ( ruleRigidBody )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1666:1: ( ruleRigidBody )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1667:1: ruleRigidBody
            {
             before(grammarAccess.getModelAccess().getRigidBodiesRigidBodyParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRigidBody_in_rule__Model__RigidBodiesAssignment3249);
            ruleRigidBody();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRigidBodiesRigidBodyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RigidBodiesAssignment"


    // $ANTLR start "rule__RigidBody__NameAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1676:1: rule__RigidBody__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RigidBody__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1680:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1681:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1681:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1682:1: RULE_ID
            {
             before(grammarAccess.getRigidBodyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RigidBody__NameAssignment_13280); 
             after(grammarAccess.getRigidBodyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__NameAssignment_1"


    // $ANTLR start "rule__RigidBody__JointsAssignment_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1691:1: rule__RigidBody__JointsAssignment_3 : ( ruleJoint ) ;
    public final void rule__RigidBody__JointsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1695:1: ( ( ruleJoint ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1696:1: ( ruleJoint )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1696:1: ( ruleJoint )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1697:1: ruleJoint
            {
             before(grammarAccess.getRigidBodyAccess().getJointsJointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleJoint_in_rule__RigidBody__JointsAssignment_33311);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getRigidBodyAccess().getJointsJointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__JointsAssignment_3"


    // $ANTLR start "rule__RigidBody__MassesAssignment_4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1706:1: rule__RigidBody__MassesAssignment_4 : ( ruleMass ) ;
    public final void rule__RigidBody__MassesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1710:1: ( ( ruleMass ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1711:1: ( ruleMass )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1711:1: ( ruleMass )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1712:1: ruleMass
            {
             before(grammarAccess.getRigidBodyAccess().getMassesMassParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMass_in_rule__RigidBody__MassesAssignment_43342);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getRigidBodyAccess().getMassesMassParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__MassesAssignment_4"


    // $ANTLR start "rule__RigidBody__ConstraintsAssignment_5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1721:1: rule__RigidBody__ConstraintsAssignment_5 : ( ruleConstraint ) ;
    public final void rule__RigidBody__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1725:1: ( ( ruleConstraint ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1726:1: ( ruleConstraint )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1726:1: ( ruleConstraint )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1727:1: ruleConstraint
            {
             before(grammarAccess.getRigidBodyAccess().getConstraintsConstraintParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__RigidBody__ConstraintsAssignment_53373);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getRigidBodyAccess().getConstraintsConstraintParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RigidBody__ConstraintsAssignment_5"


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1736:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1740:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1741:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1741:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1742:1: RULE_ID
            {
             before(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Joint__NameAssignment_13404); 
             after(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__NameAssignment_1"


    // $ANTLR start "rule__Mass__NameAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1751:1: rule__Mass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1755:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1756:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1756:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1757:1: RULE_ID
            {
             before(grammarAccess.getMassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mass__NameAssignment_13435); 
             after(grammarAccess.getMassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__NameAssignment_1"


    // $ANTLR start "rule__Mass__ValueAssignment_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1766:1: rule__Mass__ValueAssignment_2 : ( RULE_REAL ) ;
    public final void rule__Mass__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1770:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1771:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1771:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1772:1: RULE_REAL
            {
             before(grammarAccess.getMassAccess().getValueREALTerminalRuleCall_2_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Mass__ValueAssignment_23466); 
             after(grammarAccess.getMassAccess().getValueREALTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__ValueAssignment_2"


    // $ANTLR start "rule__Mass__TransformationsAssignment_5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1781:1: rule__Mass__TransformationsAssignment_5 : ( ruleTransformation ) ;
    public final void rule__Mass__TransformationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1785:1: ( ( ruleTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1786:1: ( ruleTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1786:1: ( ruleTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1787:1: ruleTransformation
            {
             before(grammarAccess.getMassAccess().getTransformationsTransformationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTransformation_in_rule__Mass__TransformationsAssignment_53497);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getMassAccess().getTransformationsTransformationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__TransformationsAssignment_5"


    // $ANTLR start "rule__Transformation__JointAssignment_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1796:1: rule__Transformation__JointAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Transformation__JointAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1800:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1801:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1801:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1802:1: ( RULE_ID )
            {
             before(grammarAccess.getTransformationAccess().getJointJointCrossReference_3_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1803:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1804:1: RULE_ID
            {
             before(grammarAccess.getTransformationAccess().getJointJointIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transformation__JointAssignment_33532); 
             after(grammarAccess.getTransformationAccess().getJointJointIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTransformationAccess().getJointJointCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__JointAssignment_3"


    // $ANTLR start "rule__ColocationConstraint__Joint1Assignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1815:1: rule__ColocationConstraint__Joint1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ColocationConstraint__Joint1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1819:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1820:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1820:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1821:1: ( RULE_ID )
            {
             before(grammarAccess.getColocationConstraintAccess().getJoint1JointCrossReference_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1822:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1823:1: RULE_ID
            {
             before(grammarAccess.getColocationConstraintAccess().getJoint1JointIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColocationConstraint__Joint1Assignment_13571); 
             after(grammarAccess.getColocationConstraintAccess().getJoint1JointIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getColocationConstraintAccess().getJoint1JointCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColocationConstraint__Joint1Assignment_1"


    // $ANTLR start "rule__ColocationConstraint__Joint2Assignment_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1834:1: rule__ColocationConstraint__Joint2Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ColocationConstraint__Joint2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1838:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1839:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1839:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1840:1: ( RULE_ID )
            {
             before(grammarAccess.getColocationConstraintAccess().getJoint2JointCrossReference_3_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1841:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1842:1: RULE_ID
            {
             before(grammarAccess.getColocationConstraintAccess().getJoint2JointIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColocationConstraint__Joint2Assignment_33610); 
             after(grammarAccess.getColocationConstraintAccess().getJoint2JointIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getColocationConstraintAccess().getJoint2JointCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColocationConstraint__Joint2Assignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RigidBodiesAssignment_in_ruleModel96 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Model__RigidBodiesAssignment_in_ruleModel108 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleRigidBody_in_entryRuleRigidBody138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRigidBody145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__0_in_ruleRigidBody171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_entryRuleJoint198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoint205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__0_in_ruleJoint231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_entryRuleMass258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMass265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__0_in_ruleMass291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformation325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__0_in_ruleTransformation351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColocationConstraint_in_ruleConstraint411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColocationConstraint_in_entryRuleColocationConstraint437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColocationConstraint444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__0_in_ruleColocationConstraint470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__0__Impl_in_rule__RigidBody__Group__0504 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__1_in_rule__RigidBody__Group__0507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RigidBody__Group__0__Impl535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__1__Impl_in_rule__RigidBody__Group__1566 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__2_in_rule__RigidBody__Group__1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RigidBody__NameAssignment_1_in_rule__RigidBody__Group__1__Impl596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__2__Impl_in_rule__RigidBody__Group__2626 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__3_in_rule__RigidBody__Group__2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RigidBody__Group__2__Impl657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__3__Impl_in_rule__RigidBody__Group__3688 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__4_in_rule__RigidBody__Group__3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RigidBody__JointsAssignment_3_in_rule__RigidBody__Group__3__Impl720 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__RigidBody__JointsAssignment_3_in_rule__RigidBody__Group__3__Impl732 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__4__Impl_in_rule__RigidBody__Group__4765 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__5_in_rule__RigidBody__Group__4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RigidBody__MassesAssignment_4_in_rule__RigidBody__Group__4__Impl797 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__RigidBody__MassesAssignment_4_in_rule__RigidBody__Group__4__Impl809 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__5__Impl_in_rule__RigidBody__Group__5842 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__6_in_rule__RigidBody__Group__5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RigidBody__ConstraintsAssignment_5_in_rule__RigidBody__Group__5__Impl872 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__RigidBody__Group__6__Impl_in_rule__RigidBody__Group__6903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RigidBody__Group__6__Impl931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__0__Impl_in_rule__Joint__Group__0976 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Joint__Group__1_in_rule__Joint__Group__0979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Joint__Group__0__Impl1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__1__Impl_in_rule__Joint__Group__11038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__NameAssignment_1_in_rule__Joint__Group__1__Impl1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__0__Impl_in_rule__Mass__Group__01099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Mass__Group__1_in_rule__Mass__Group__01102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Mass__Group__0__Impl1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__1__Impl_in_rule__Mass__Group__11161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mass__Group__2_in_rule__Mass__Group__11164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__NameAssignment_1_in_rule__Mass__Group__1__Impl1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__2__Impl_in_rule__Mass__Group__21221 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Mass__Group__3_in_rule__Mass__Group__21224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__ValueAssignment_2_in_rule__Mass__Group__2__Impl1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__3__Impl_in_rule__Mass__Group__31281 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Mass__Group__4_in_rule__Mass__Group__31284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Mass__Group__3__Impl1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__4__Impl_in_rule__Mass__Group__41343 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Mass__Group__5_in_rule__Mass__Group__41346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Mass__Group__4__Impl1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__5__Impl_in_rule__Mass__Group__51405 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Mass__Group__6_in_rule__Mass__Group__51408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__TransformationsAssignment_5_in_rule__Mass__Group__5__Impl1437 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Mass__TransformationsAssignment_5_in_rule__Mass__Group__5__Impl1449 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Mass__Group__6__Impl_in_rule__Mass__Group__61482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Mass__Group__6__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__01555 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__01558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Transformation__Group__0__Impl1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__11617 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__11620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Transformation__Group__1__Impl1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__21679 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__21682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Transformation__Group__2__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__31741 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__31744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__JointAssignment_3_in_rule__Transformation__Group__3__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__41801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__5_in_rule__Transformation__Group__41804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Transformation__Group__4__Impl1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__5__Impl_in_rule__Transformation__Group__51863 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__6_in_rule__Transformation__Group__51866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Transformation__Group__5__Impl1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__6__Impl_in_rule__Transformation__Group__61922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__7_in_rule__Transformation__Group__61925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Transformation__Group__6__Impl1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__7__Impl_in_rule__Transformation__Group__71984 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__8_in_rule__Transformation__Group__71987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Transformation__Group__7__Impl2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__8__Impl_in_rule__Transformation__Group__82043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__9_in_rule__Transformation__Group__82046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Transformation__Group__8__Impl2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__9__Impl_in_rule__Transformation__Group__92105 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__10_in_rule__Transformation__Group__92108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Transformation__Group__9__Impl2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__10__Impl_in_rule__Transformation__Group__102164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__11_in_rule__Transformation__Group__102167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Transformation__Group__10__Impl2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__11__Impl_in_rule__Transformation__Group__112226 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__12_in_rule__Transformation__Group__112229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Transformation__Group__11__Impl2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__12__Impl_in_rule__Transformation__Group__122285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__13_in_rule__Transformation__Group__122288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Transformation__Group__12__Impl2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__13__Impl_in_rule__Transformation__Group__132347 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__14_in_rule__Transformation__Group__132350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Transformation__Group__13__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__14__Impl_in_rule__Transformation__Group__142406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__15_in_rule__Transformation__Group__142409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Transformation__Group__14__Impl2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__15__Impl_in_rule__Transformation__Group__152468 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__16_in_rule__Transformation__Group__152471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Transformation__Group__15__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__16__Impl_in_rule__Transformation__Group__162527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__17_in_rule__Transformation__Group__162530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Transformation__Group__16__Impl2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__17__Impl_in_rule__Transformation__Group__172589 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__18_in_rule__Transformation__Group__172592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Transformation__Group__17__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__18__Impl_in_rule__Transformation__Group__182648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__19_in_rule__Transformation__Group__182651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Transformation__Group__18__Impl2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__19__Impl_in_rule__Transformation__Group__192710 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__20_in_rule__Transformation__Group__192713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Transformation__Group__19__Impl2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__20__Impl_in_rule__Transformation__Group__202769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__21_in_rule__Transformation__Group__202772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Transformation__Group__20__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__21__Impl_in_rule__Transformation__Group__212831 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__22_in_rule__Transformation__Group__212834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Transformation__Group__21__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__22__Impl_in_rule__Transformation__Group__222890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Transformation__Group__22__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__0__Impl_in_rule__ColocationConstraint__Group__02995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__1_in_rule__ColocationConstraint__Group__02998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ColocationConstraint__Group__0__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__1__Impl_in_rule__ColocationConstraint__Group__13057 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__2_in_rule__ColocationConstraint__Group__13060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Joint1Assignment_1_in_rule__ColocationConstraint__Group__1__Impl3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__2__Impl_in_rule__ColocationConstraint__Group__23117 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__3_in_rule__ColocationConstraint__Group__23120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ColocationConstraint__Group__2__Impl3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__3__Impl_in_rule__ColocationConstraint__Group__33179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Joint2Assignment_3_in_rule__ColocationConstraint__Group__3__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRigidBody_in_rule__Model__RigidBodiesAssignment3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RigidBody__NameAssignment_13280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_rule__RigidBody__JointsAssignment_33311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_rule__RigidBody__MassesAssignment_43342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__RigidBody__ConstraintsAssignment_53373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Joint__NameAssignment_13404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mass__NameAssignment_13435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Mass__ValueAssignment_23466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransformation_in_rule__Mass__TransformationsAssignment_53497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transformation__JointAssignment_33532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColocationConstraint__Joint1Assignment_13571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColocationConstraint__Joint2Assignment_33610 = new BitSet(new long[]{0x0000000000000002L});

}