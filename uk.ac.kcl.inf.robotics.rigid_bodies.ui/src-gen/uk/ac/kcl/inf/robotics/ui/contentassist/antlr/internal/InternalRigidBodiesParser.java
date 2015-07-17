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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'x'", "'y'", "'z'", "'geometrical'", "'velocity'", "'force'", "'torque'", "'world'", "'{'", "'gravity'", "'}'", "'system'", "'body'", "'mass'", "'value'", "'position'", "'inertia'", "'joint'", "':'", "'between'", "'and'", "'stiffness'", "'springCoeff'", "'springInit'", "'dampViscous'", "'dampCoulomb'", "'type'", "'revolute'", "'('", "')'", "','", "'planar'", "'with'", "'relative'", "'transformation'", "'reorient'", "'constraint'", "'external'", "'load'", "'['", "']'", "'matrix'"
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:76:1: ( rule__Model__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleInitialDefinition"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:88:1: entryRuleInitialDefinition : ruleInitialDefinition EOF ;
    public final void entryRuleInitialDefinition() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:89:1: ( ruleInitialDefinition EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:90:1: ruleInitialDefinition EOF
            {
             before(grammarAccess.getInitialDefinitionRule()); 
            pushFollow(FOLLOW_ruleInitialDefinition_in_entryRuleInitialDefinition121);
            ruleInitialDefinition();

            state._fsp--;

             after(grammarAccess.getInitialDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialDefinition128); 

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
    // $ANTLR end "entryRuleInitialDefinition"


    // $ANTLR start "ruleInitialDefinition"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:97:1: ruleInitialDefinition : ( ( rule__InitialDefinition__Alternatives ) ) ;
    public final void ruleInitialDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:101:2: ( ( ( rule__InitialDefinition__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:102:1: ( ( rule__InitialDefinition__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:102:1: ( ( rule__InitialDefinition__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:103:1: ( rule__InitialDefinition__Alternatives )
            {
             before(grammarAccess.getInitialDefinitionAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:104:1: ( rule__InitialDefinition__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:104:2: rule__InitialDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__InitialDefinition__Alternatives_in_ruleInitialDefinition154);
            rule__InitialDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInitialDefinitionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInitialDefinition"


    // $ANTLR start "entryRuleEnvironment"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:116:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:117:1: ( ruleEnvironment EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:118:1: ruleEnvironment EOF
            {
             before(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_ruleEnvironment_in_entryRuleEnvironment181);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getEnvironmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironment188); 

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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:125:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:129:2: ( ( ( rule__Environment__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:130:1: ( ( rule__Environment__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:130:1: ( ( rule__Environment__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:131:1: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:132:1: ( rule__Environment__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:132:2: rule__Environment__Group__0
            {
            pushFollow(FOLLOW_rule__Environment__Group__0_in_ruleEnvironment214);
            rule__Environment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getGroup()); 

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleSystem"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:144:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:145:1: ( ruleSystem EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:146:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem241);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem248); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:153:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:157:2: ( ( ( rule__System__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:158:1: ( ( rule__System__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:158:1: ( ( rule__System__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:159:1: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:160:1: ( rule__System__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:160:2: rule__System__Group__0
            {
            pushFollow(FOLLOW_rule__System__Group__0_in_ruleSystem274);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleSystemElement"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:172:1: entryRuleSystemElement : ruleSystemElement EOF ;
    public final void entryRuleSystemElement() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:173:1: ( ruleSystemElement EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:174:1: ruleSystemElement EOF
            {
             before(grammarAccess.getSystemElementRule()); 
            pushFollow(FOLLOW_ruleSystemElement_in_entryRuleSystemElement301);
            ruleSystemElement();

            state._fsp--;

             after(grammarAccess.getSystemElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemElement308); 

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
    // $ANTLR end "entryRuleSystemElement"


    // $ANTLR start "ruleSystemElement"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:181:1: ruleSystemElement : ( ( rule__SystemElement__Alternatives ) ) ;
    public final void ruleSystemElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:185:2: ( ( ( rule__SystemElement__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:186:1: ( ( rule__SystemElement__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:186:1: ( ( rule__SystemElement__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:187:1: ( rule__SystemElement__Alternatives )
            {
             before(grammarAccess.getSystemElementAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:188:1: ( rule__SystemElement__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:188:2: rule__SystemElement__Alternatives
            {
            pushFollow(FOLLOW_rule__SystemElement__Alternatives_in_ruleSystemElement334);
            rule__SystemElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSystemElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSystemElement"


    // $ANTLR start "entryRuleBody"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:200:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:201:1: ( ruleBody EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:202:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody361);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody368); 

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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:209:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:213:2: ( ( ( rule__Body__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:214:1: ( ( rule__Body__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:214:1: ( ( rule__Body__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:215:1: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:216:1: ( rule__Body__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:216:2: rule__Body__Group__0
            {
            pushFollow(FOLLOW_rule__Body__Group__0_in_ruleBody394);
            rule__Body__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getGroup()); 

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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleMass"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:228:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:229:1: ( ruleMass EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:230:1: ruleMass EOF
            {
             before(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_ruleMass_in_entryRuleMass421);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getMassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMass428); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:237:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:241:2: ( ( ( rule__Mass__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:242:1: ( ( rule__Mass__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:242:1: ( ( rule__Mass__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:243:1: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:244:1: ( rule__Mass__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:244:2: rule__Mass__Group__0
            {
            pushFollow(FOLLOW_rule__Mass__Group__0_in_ruleMass454);
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


    // $ANTLR start "entryRuleJoint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:256:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:257:1: ( ruleJoint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:258:1: ruleJoint EOF
            {
             before(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_ruleJoint_in_entryRuleJoint481);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getJointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoint488); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:265:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:269:2: ( ( ( rule__Joint__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:270:1: ( ( rule__Joint__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:270:1: ( ( rule__Joint__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:271:1: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:272:1: ( rule__Joint__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:272:2: rule__Joint__Group__0
            {
            pushFollow(FOLLOW_rule__Joint__Group__0_in_ruleJoint514);
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


    // $ANTLR start "entryRuleJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:284:1: entryRuleJointType : ruleJointType EOF ;
    public final void entryRuleJointType() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:285:1: ( ruleJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:286:1: ruleJointType EOF
            {
             before(grammarAccess.getJointTypeRule()); 
            pushFollow(FOLLOW_ruleJointType_in_entryRuleJointType541);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointType548); 

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
    // $ANTLR end "entryRuleJointType"


    // $ANTLR start "ruleJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:293:1: ruleJointType : ( ( rule__JointType__Group__0 ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:297:2: ( ( ( rule__JointType__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:298:1: ( ( rule__JointType__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:298:1: ( ( rule__JointType__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:299:1: ( rule__JointType__Group__0 )
            {
             before(grammarAccess.getJointTypeAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:300:1: ( rule__JointType__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:300:2: rule__JointType__Group__0
            {
            pushFollow(FOLLOW_rule__JointType__Group__0_in_ruleJointType574);
            rule__JointType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleJointType"


    // $ANTLR start "entryRuleJointTypeExpression"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:312:1: entryRuleJointTypeExpression : ruleJointTypeExpression EOF ;
    public final void entryRuleJointTypeExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:313:1: ( ruleJointTypeExpression EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:314:1: ruleJointTypeExpression EOF
            {
             before(grammarAccess.getJointTypeExpressionRule()); 
            pushFollow(FOLLOW_ruleJointTypeExpression_in_entryRuleJointTypeExpression601);
            ruleJointTypeExpression();

            state._fsp--;

             after(grammarAccess.getJointTypeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointTypeExpression608); 

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
    // $ANTLR end "entryRuleJointTypeExpression"


    // $ANTLR start "ruleJointTypeExpression"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:321:1: ruleJointTypeExpression : ( ( rule__JointTypeExpression__Alternatives ) ) ;
    public final void ruleJointTypeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:325:2: ( ( ( rule__JointTypeExpression__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:326:1: ( ( rule__JointTypeExpression__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:326:1: ( ( rule__JointTypeExpression__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:327:1: ( rule__JointTypeExpression__Alternatives )
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:328:1: ( rule__JointTypeExpression__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:328:2: rule__JointTypeExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Alternatives_in_ruleJointTypeExpression634);
            rule__JointTypeExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleJointTypeExpression"


    // $ANTLR start "entryRuleRelativeTransformation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:340:1: entryRuleRelativeTransformation : ruleRelativeTransformation EOF ;
    public final void entryRuleRelativeTransformation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:341:1: ( ruleRelativeTransformation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:342:1: ruleRelativeTransformation EOF
            {
             before(grammarAccess.getRelativeTransformationRule()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_entryRuleRelativeTransformation661);
            ruleRelativeTransformation();

            state._fsp--;

             after(grammarAccess.getRelativeTransformationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeTransformation668); 

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
    // $ANTLR end "entryRuleRelativeTransformation"


    // $ANTLR start "ruleRelativeTransformation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:349:1: ruleRelativeTransformation : ( ( rule__RelativeTransformation__Group__0 ) ) ;
    public final void ruleRelativeTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:353:2: ( ( ( rule__RelativeTransformation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:354:1: ( ( rule__RelativeTransformation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:354:1: ( ( rule__RelativeTransformation__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:355:1: ( rule__RelativeTransformation__Group__0 )
            {
             before(grammarAccess.getRelativeTransformationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:356:1: ( rule__RelativeTransformation__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:356:2: rule__RelativeTransformation__Group__0
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__0_in_ruleRelativeTransformation694);
            rule__RelativeTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelativeTransformationAccess().getGroup()); 

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
    // $ANTLR end "ruleRelativeTransformation"


    // $ANTLR start "entryRuleReorientation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:368:1: entryRuleReorientation : ruleReorientation EOF ;
    public final void entryRuleReorientation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:369:1: ( ruleReorientation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:370:1: ruleReorientation EOF
            {
             before(grammarAccess.getReorientationRule()); 
            pushFollow(FOLLOW_ruleReorientation_in_entryRuleReorientation721);
            ruleReorientation();

            state._fsp--;

             after(grammarAccess.getReorientationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientation728); 

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
    // $ANTLR end "entryRuleReorientation"


    // $ANTLR start "ruleReorientation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:377:1: ruleReorientation : ( ( rule__Reorientation__Group__0 ) ) ;
    public final void ruleReorientation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:381:2: ( ( ( rule__Reorientation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:382:1: ( ( rule__Reorientation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:382:1: ( ( rule__Reorientation__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:383:1: ( rule__Reorientation__Group__0 )
            {
             before(grammarAccess.getReorientationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:384:1: ( rule__Reorientation__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:384:2: rule__Reorientation__Group__0
            {
            pushFollow(FOLLOW_rule__Reorientation__Group__0_in_ruleReorientation754);
            rule__Reorientation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReorientationAccess().getGroup()); 

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
    // $ANTLR end "ruleReorientation"


    // $ANTLR start "entryRuleReorientExpression"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:396:1: entryRuleReorientExpression : ruleReorientExpression EOF ;
    public final void entryRuleReorientExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:397:1: ( ruleReorientExpression EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:398:1: ruleReorientExpression EOF
            {
             before(grammarAccess.getReorientExpressionRule()); 
            pushFollow(FOLLOW_ruleReorientExpression_in_entryRuleReorientExpression781);
            ruleReorientExpression();

            state._fsp--;

             after(grammarAccess.getReorientExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientExpression788); 

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
    // $ANTLR end "entryRuleReorientExpression"


    // $ANTLR start "ruleReorientExpression"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:405:1: ruleReorientExpression : ( ( rule__ReorientExpression__Alternatives ) ) ;
    public final void ruleReorientExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:409:2: ( ( ( rule__ReorientExpression__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:410:1: ( ( rule__ReorientExpression__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:410:1: ( ( rule__ReorientExpression__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:411:1: ( rule__ReorientExpression__Alternatives )
            {
             before(grammarAccess.getReorientExpressionAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:412:1: ( rule__ReorientExpression__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:412:2: rule__ReorientExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Alternatives_in_ruleReorientExpression814);
            rule__ReorientExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReorientExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleReorientExpression"


    // $ANTLR start "entryRuleConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:424:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:425:1: ( ruleConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:426:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint841);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint848); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:433:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:437:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:438:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:438:1: ( ( rule__Constraint__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:439:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:440:1: ( rule__Constraint__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:440:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint874);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

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


    // $ANTLR start "entryRuleExternalLoad"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:452:1: entryRuleExternalLoad : ruleExternalLoad EOF ;
    public final void entryRuleExternalLoad() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:453:1: ( ruleExternalLoad EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:454:1: ruleExternalLoad EOF
            {
             before(grammarAccess.getExternalLoadRule()); 
            pushFollow(FOLLOW_ruleExternalLoad_in_entryRuleExternalLoad901);
            ruleExternalLoad();

            state._fsp--;

             after(grammarAccess.getExternalLoadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalLoad908); 

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
    // $ANTLR end "entryRuleExternalLoad"


    // $ANTLR start "ruleExternalLoad"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:461:1: ruleExternalLoad : ( ( rule__ExternalLoad__Group__0 ) ) ;
    public final void ruleExternalLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:465:2: ( ( ( rule__ExternalLoad__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:466:1: ( ( rule__ExternalLoad__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:466:1: ( ( rule__ExternalLoad__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:467:1: ( rule__ExternalLoad__Group__0 )
            {
             before(grammarAccess.getExternalLoadAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:468:1: ( rule__ExternalLoad__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:468:2: rule__ExternalLoad__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__0_in_ruleExternalLoad934);
            rule__ExternalLoad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalLoadAccess().getGroup()); 

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
    // $ANTLR end "ruleExternalLoad"


    // $ANTLR start "entryRuleMatrix"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:480:1: entryRuleMatrix : ruleMatrix EOF ;
    public final void entryRuleMatrix() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:481:1: ( ruleMatrix EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:482:1: ruleMatrix EOF
            {
             before(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_ruleMatrix_in_entryRuleMatrix961);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getMatrixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix968); 

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
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:489:1: ruleMatrix : ( ( rule__Matrix__Alternatives ) ) ;
    public final void ruleMatrix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:493:2: ( ( ( rule__Matrix__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:494:1: ( ( rule__Matrix__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:494:1: ( ( rule__Matrix__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:495:1: ( rule__Matrix__Alternatives )
            {
             before(grammarAccess.getMatrixAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:496:1: ( rule__Matrix__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:496:2: rule__Matrix__Alternatives
            {
            pushFollow(FOLLOW_rule__Matrix__Alternatives_in_ruleMatrix994);
            rule__Matrix__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleBaseMatrix"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:508:1: entryRuleBaseMatrix : ruleBaseMatrix EOF ;
    public final void entryRuleBaseMatrix() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:509:1: ( ruleBaseMatrix EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:510:1: ruleBaseMatrix EOF
            {
             before(grammarAccess.getBaseMatrixRule()); 
            pushFollow(FOLLOW_ruleBaseMatrix_in_entryRuleBaseMatrix1021);
            ruleBaseMatrix();

            state._fsp--;

             after(grammarAccess.getBaseMatrixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseMatrix1028); 

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
    // $ANTLR end "entryRuleBaseMatrix"


    // $ANTLR start "ruleBaseMatrix"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:517:1: ruleBaseMatrix : ( ( rule__BaseMatrix__Group__0 ) ) ;
    public final void ruleBaseMatrix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:521:2: ( ( ( rule__BaseMatrix__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:522:1: ( ( rule__BaseMatrix__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:522:1: ( ( rule__BaseMatrix__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:523:1: ( rule__BaseMatrix__Group__0 )
            {
             before(grammarAccess.getBaseMatrixAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:524:1: ( rule__BaseMatrix__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:524:2: rule__BaseMatrix__Group__0
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__0_in_ruleBaseMatrix1054);
            rule__BaseMatrix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseMatrixAccess().getGroup()); 

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
    // $ANTLR end "ruleBaseMatrix"


    // $ANTLR start "entryRuleMatrixRef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:536:1: entryRuleMatrixRef : ruleMatrixRef EOF ;
    public final void entryRuleMatrixRef() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:537:1: ( ruleMatrixRef EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:538:1: ruleMatrixRef EOF
            {
             before(grammarAccess.getMatrixRefRule()); 
            pushFollow(FOLLOW_ruleMatrixRef_in_entryRuleMatrixRef1081);
            ruleMatrixRef();

            state._fsp--;

             after(grammarAccess.getMatrixRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrixRef1088); 

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
    // $ANTLR end "entryRuleMatrixRef"


    // $ANTLR start "ruleMatrixRef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:545:1: ruleMatrixRef : ( ( rule__MatrixRef__MatrixAssignment ) ) ;
    public final void ruleMatrixRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:549:2: ( ( ( rule__MatrixRef__MatrixAssignment ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:550:1: ( ( rule__MatrixRef__MatrixAssignment ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:550:1: ( ( rule__MatrixRef__MatrixAssignment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:551:1: ( rule__MatrixRef__MatrixAssignment )
            {
             before(grammarAccess.getMatrixRefAccess().getMatrixAssignment()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:552:1: ( rule__MatrixRef__MatrixAssignment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:552:2: rule__MatrixRef__MatrixAssignment
            {
            pushFollow(FOLLOW_rule__MatrixRef__MatrixAssignment_in_ruleMatrixRef1114);
            rule__MatrixRef__MatrixAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMatrixRefAccess().getMatrixAssignment()); 

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
    // $ANTLR end "ruleMatrixRef"


    // $ANTLR start "entryRuleAddExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:564:1: entryRuleAddExp : ruleAddExp EOF ;
    public final void entryRuleAddExp() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:565:1: ( ruleAddExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:566:1: ruleAddExp EOF
            {
             before(grammarAccess.getAddExpRule()); 
            pushFollow(FOLLOW_ruleAddExp_in_entryRuleAddExp1141);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getAddExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExp1148); 

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
    // $ANTLR end "entryRuleAddExp"


    // $ANTLR start "ruleAddExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:573:1: ruleAddExp : ( ( rule__AddExp__Group__0 ) ) ;
    public final void ruleAddExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:577:2: ( ( ( rule__AddExp__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:578:1: ( ( rule__AddExp__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:578:1: ( ( rule__AddExp__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:579:1: ( rule__AddExp__Group__0 )
            {
             before(grammarAccess.getAddExpAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:580:1: ( rule__AddExp__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:580:2: rule__AddExp__Group__0
            {
            pushFollow(FOLLOW_rule__AddExp__Group__0_in_ruleAddExp1174);
            rule__AddExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddExpAccess().getGroup()); 

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
    // $ANTLR end "ruleAddExp"


    // $ANTLR start "entryRuleMultExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:592:1: entryRuleMultExp : ruleMultExp EOF ;
    public final void entryRuleMultExp() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:593:1: ( ruleMultExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:594:1: ruleMultExp EOF
            {
             before(grammarAccess.getMultExpRule()); 
            pushFollow(FOLLOW_ruleMultExp_in_entryRuleMultExp1201);
            ruleMultExp();

            state._fsp--;

             after(grammarAccess.getMultExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExp1208); 

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
    // $ANTLR end "entryRuleMultExp"


    // $ANTLR start "ruleMultExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:601:1: ruleMultExp : ( ( rule__MultExp__Group__0 ) ) ;
    public final void ruleMultExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:605:2: ( ( ( rule__MultExp__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:606:1: ( ( rule__MultExp__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:606:1: ( ( rule__MultExp__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:607:1: ( rule__MultExp__Group__0 )
            {
             before(grammarAccess.getMultExpAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:608:1: ( rule__MultExp__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:608:2: rule__MultExp__Group__0
            {
            pushFollow(FOLLOW_rule__MultExp__Group__0_in_ruleMultExp1234);
            rule__MultExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultExpAccess().getGroup()); 

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
    // $ANTLR end "ruleMultExp"


    // $ANTLR start "entryRulePrimary"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:620:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:621:1: ( rulePrimary EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:622:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1261);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1268); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:629:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:633:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:634:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:634:1: ( ( rule__Primary__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:635:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:636:1: ( rule__Primary__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:636:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary1294);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleConstantOrFunctionCallExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:648:1: entryRuleConstantOrFunctionCallExp : ruleConstantOrFunctionCallExp EOF ;
    public final void entryRuleConstantOrFunctionCallExp() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:649:1: ( ruleConstantOrFunctionCallExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:650:1: ruleConstantOrFunctionCallExp EOF
            {
             before(grammarAccess.getConstantOrFunctionCallExpRule()); 
            pushFollow(FOLLOW_ruleConstantOrFunctionCallExp_in_entryRuleConstantOrFunctionCallExp1321);
            ruleConstantOrFunctionCallExp();

            state._fsp--;

             after(grammarAccess.getConstantOrFunctionCallExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantOrFunctionCallExp1328); 

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
    // $ANTLR end "entryRuleConstantOrFunctionCallExp"


    // $ANTLR start "ruleConstantOrFunctionCallExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:657:1: ruleConstantOrFunctionCallExp : ( ( rule__ConstantOrFunctionCallExp__Group__0 ) ) ;
    public final void ruleConstantOrFunctionCallExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:661:2: ( ( ( rule__ConstantOrFunctionCallExp__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:662:1: ( ( rule__ConstantOrFunctionCallExp__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:662:1: ( ( rule__ConstantOrFunctionCallExp__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:663:1: ( rule__ConstantOrFunctionCallExp__Group__0 )
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:664:1: ( rule__ConstantOrFunctionCallExp__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:664:2: rule__ConstantOrFunctionCallExp__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group__0_in_ruleConstantOrFunctionCallExp1354);
            rule__ConstantOrFunctionCallExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup()); 

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
    // $ANTLR end "ruleConstantOrFunctionCallExp"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:676:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:677:1: ( ruleNumberLiteral EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:678:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1381);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral1388); 

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:685:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:689:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:690:1: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:690:1: ( ( rule__NumberLiteral__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:691:1: ( rule__NumberLiteral__Group__0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:692:1: ( rule__NumberLiteral__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:692:2: rule__NumberLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__0_in_ruleNumberLiteral1414);
            rule__NumberLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "ruleAXIS"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:705:1: ruleAXIS : ( ( rule__AXIS__Alternatives ) ) ;
    public final void ruleAXIS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:709:1: ( ( ( rule__AXIS__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:710:1: ( ( rule__AXIS__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:710:1: ( ( rule__AXIS__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:711:1: ( rule__AXIS__Alternatives )
            {
             before(grammarAccess.getAXISAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:712:1: ( rule__AXIS__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:712:2: rule__AXIS__Alternatives
            {
            pushFollow(FOLLOW_rule__AXIS__Alternatives_in_ruleAXIS1451);
            rule__AXIS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAXISAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAXIS"


    // $ANTLR start "ruleConstraintType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:724:1: ruleConstraintType : ( ( rule__ConstraintType__Alternatives ) ) ;
    public final void ruleConstraintType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:728:1: ( ( ( rule__ConstraintType__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:729:1: ( ( rule__ConstraintType__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:729:1: ( ( rule__ConstraintType__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:730:1: ( rule__ConstraintType__Alternatives )
            {
             before(grammarAccess.getConstraintTypeAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:731:1: ( rule__ConstraintType__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:731:2: rule__ConstraintType__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstraintType__Alternatives_in_ruleConstraintType1487);
            rule__ConstraintType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConstraintType"


    // $ANTLR start "ruleLoadType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:743:1: ruleLoadType : ( ( rule__LoadType__Alternatives ) ) ;
    public final void ruleLoadType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:747:1: ( ( ( rule__LoadType__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:748:1: ( ( rule__LoadType__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:748:1: ( ( rule__LoadType__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:749:1: ( rule__LoadType__Alternatives )
            {
             before(grammarAccess.getLoadTypeAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:750:1: ( rule__LoadType__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:750:2: rule__LoadType__Alternatives
            {
            pushFollow(FOLLOW_rule__LoadType__Alternatives_in_ruleLoadType1523);
            rule__LoadType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLoadTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLoadType"


    // $ANTLR start "rule__InitialDefinition__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:761:1: rule__InitialDefinition__Alternatives : ( ( ruleBaseMatrix ) | ( ruleJointType ) );
    public final void rule__InitialDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:765:1: ( ( ruleBaseMatrix ) | ( ruleJointType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==55||LA1_0==57) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID||LA1_0==33||LA1_0==43||LA1_0==47) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:766:1: ( ruleBaseMatrix )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:766:1: ( ruleBaseMatrix )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:767:1: ruleBaseMatrix
                    {
                     before(grammarAccess.getInitialDefinitionAccess().getBaseMatrixParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBaseMatrix_in_rule__InitialDefinition__Alternatives1558);
                    ruleBaseMatrix();

                    state._fsp--;

                     after(grammarAccess.getInitialDefinitionAccess().getBaseMatrixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:772:6: ( ruleJointType )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:772:6: ( ruleJointType )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:773:1: ruleJointType
                    {
                     before(grammarAccess.getInitialDefinitionAccess().getJointTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleJointType_in_rule__InitialDefinition__Alternatives1575);
                    ruleJointType();

                    state._fsp--;

                     after(grammarAccess.getInitialDefinitionAccess().getJointTypeParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__InitialDefinition__Alternatives"


    // $ANTLR start "rule__SystemElement__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:783:1: rule__SystemElement__Alternatives : ( ( ruleBody ) | ( ruleJoint ) | ( ruleConstraint ) | ( ruleExternalLoad ) );
    public final void rule__SystemElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:787:1: ( ( ruleBody ) | ( ruleJoint ) | ( ruleConstraint ) | ( ruleExternalLoad ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 52:
                {
                alt2=3;
                }
                break;
            case 53:
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:788:1: ( ruleBody )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:788:1: ( ruleBody )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:789:1: ruleBody
                    {
                     before(grammarAccess.getSystemElementAccess().getBodyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBody_in_rule__SystemElement__Alternatives1607);
                    ruleBody();

                    state._fsp--;

                     after(grammarAccess.getSystemElementAccess().getBodyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:794:6: ( ruleJoint )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:794:6: ( ruleJoint )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:795:1: ruleJoint
                    {
                     before(grammarAccess.getSystemElementAccess().getJointParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleJoint_in_rule__SystemElement__Alternatives1624);
                    ruleJoint();

                    state._fsp--;

                     after(grammarAccess.getSystemElementAccess().getJointParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:800:6: ( ruleConstraint )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:800:6: ( ruleConstraint )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:801:1: ruleConstraint
                    {
                     before(grammarAccess.getSystemElementAccess().getConstraintParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleConstraint_in_rule__SystemElement__Alternatives1641);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getSystemElementAccess().getConstraintParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:806:6: ( ruleExternalLoad )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:806:6: ( ruleExternalLoad )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:807:1: ruleExternalLoad
                    {
                     before(grammarAccess.getSystemElementAccess().getExternalLoadParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleExternalLoad_in_rule__SystemElement__Alternatives1658);
                    ruleExternalLoad();

                    state._fsp--;

                     after(grammarAccess.getSystemElementAccess().getExternalLoadParserRuleCall_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__SystemElement__Alternatives"


    // $ANTLR start "rule__JointTypeExpression__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:817:1: rule__JointTypeExpression__Alternatives : ( ( ( rule__JointTypeExpression__RefAssignment_0 ) ) | ( ( rule__JointTypeExpression__Group_1__0 ) ) | ( ( rule__JointTypeExpression__Group_2__0 ) ) );
    public final void rule__JointTypeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:821:1: ( ( ( rule__JointTypeExpression__RefAssignment_0 ) ) | ( ( rule__JointTypeExpression__Group_1__0 ) ) | ( ( rule__JointTypeExpression__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 43:
                {
                alt3=2;
                }
                break;
            case 47:
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:822:1: ( ( rule__JointTypeExpression__RefAssignment_0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:822:1: ( ( rule__JointTypeExpression__RefAssignment_0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:823:1: ( rule__JointTypeExpression__RefAssignment_0 )
                    {
                     before(grammarAccess.getJointTypeExpressionAccess().getRefAssignment_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:824:1: ( rule__JointTypeExpression__RefAssignment_0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:824:2: rule__JointTypeExpression__RefAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JointTypeExpression__RefAssignment_0_in_rule__JointTypeExpression__Alternatives1690);
                    rule__JointTypeExpression__RefAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointTypeExpressionAccess().getRefAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:828:6: ( ( rule__JointTypeExpression__Group_1__0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:828:6: ( ( rule__JointTypeExpression__Group_1__0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:829:1: ( rule__JointTypeExpression__Group_1__0 )
                    {
                     before(grammarAccess.getJointTypeExpressionAccess().getGroup_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:830:1: ( rule__JointTypeExpression__Group_1__0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:830:2: rule__JointTypeExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__0_in_rule__JointTypeExpression__Alternatives1708);
                    rule__JointTypeExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointTypeExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:834:6: ( ( rule__JointTypeExpression__Group_2__0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:834:6: ( ( rule__JointTypeExpression__Group_2__0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:835:1: ( rule__JointTypeExpression__Group_2__0 )
                    {
                     before(grammarAccess.getJointTypeExpressionAccess().getGroup_2()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:836:1: ( rule__JointTypeExpression__Group_2__0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:836:2: rule__JointTypeExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__0_in_rule__JointTypeExpression__Alternatives1726);
                    rule__JointTypeExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointTypeExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__JointTypeExpression__Alternatives"


    // $ANTLR start "rule__ReorientExpression__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:845:1: rule__ReorientExpression__Alternatives : ( ( ( rule__ReorientExpression__RefAssignment_0 ) ) | ( ( rule__ReorientExpression__Group_1__0 ) ) );
    public final void rule__ReorientExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:849:1: ( ( ( rule__ReorientExpression__RefAssignment_0 ) ) | ( ( rule__ReorientExpression__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==44) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:850:1: ( ( rule__ReorientExpression__RefAssignment_0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:850:1: ( ( rule__ReorientExpression__RefAssignment_0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:851:1: ( rule__ReorientExpression__RefAssignment_0 )
                    {
                     before(grammarAccess.getReorientExpressionAccess().getRefAssignment_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:852:1: ( rule__ReorientExpression__RefAssignment_0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:852:2: rule__ReorientExpression__RefAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ReorientExpression__RefAssignment_0_in_rule__ReorientExpression__Alternatives1759);
                    rule__ReorientExpression__RefAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReorientExpressionAccess().getRefAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:856:6: ( ( rule__ReorientExpression__Group_1__0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:856:6: ( ( rule__ReorientExpression__Group_1__0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:857:1: ( rule__ReorientExpression__Group_1__0 )
                    {
                     before(grammarAccess.getReorientExpressionAccess().getGroup_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:858:1: ( rule__ReorientExpression__Group_1__0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:858:2: rule__ReorientExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ReorientExpression__Group_1__0_in_rule__ReorientExpression__Alternatives1777);
                    rule__ReorientExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReorientExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ReorientExpression__Alternatives"


    // $ANTLR start "rule__Matrix__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:867:1: rule__Matrix__Alternatives : ( ( ruleBaseMatrix ) | ( ruleMatrixRef ) );
    public final void rule__Matrix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:871:1: ( ( ruleBaseMatrix ) | ( ruleMatrixRef ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==55||LA5_0==57) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:872:1: ( ruleBaseMatrix )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:872:1: ( ruleBaseMatrix )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:873:1: ruleBaseMatrix
                    {
                     before(grammarAccess.getMatrixAccess().getBaseMatrixParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBaseMatrix_in_rule__Matrix__Alternatives1810);
                    ruleBaseMatrix();

                    state._fsp--;

                     after(grammarAccess.getMatrixAccess().getBaseMatrixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:878:6: ( ruleMatrixRef )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:878:6: ( ruleMatrixRef )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:879:1: ruleMatrixRef
                    {
                     before(grammarAccess.getMatrixAccess().getMatrixRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMatrixRef_in_rule__Matrix__Alternatives1827);
                    ruleMatrixRef();

                    state._fsp--;

                     after(grammarAccess.getMatrixAccess().getMatrixRefParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Matrix__Alternatives"


    // $ANTLR start "rule__AddExp__OpAlternatives_1_1_0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:889:1: rule__AddExp__OpAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AddExp__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:893:1: ( ( '+' ) | ( '-' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:894:1: ( '+' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:894:1: ( '+' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:895:1: '+'
                    {
                     before(grammarAccess.getAddExpAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__AddExp__OpAlternatives_1_1_01860); 
                     after(grammarAccess.getAddExpAccess().getOpPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:902:6: ( '-' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:902:6: ( '-' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:903:1: '-'
                    {
                     before(grammarAccess.getAddExpAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__AddExp__OpAlternatives_1_1_01880); 
                     after(grammarAccess.getAddExpAccess().getOpHyphenMinusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__AddExp__OpAlternatives_1_1_0"


    // $ANTLR start "rule__MultExp__OpAlternatives_1_1_0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:915:1: rule__MultExp__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MultExp__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:919:1: ( ( '*' ) | ( '/' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:920:1: ( '*' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:920:1: ( '*' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:921:1: '*'
                    {
                     before(grammarAccess.getMultExpAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__MultExp__OpAlternatives_1_1_01915); 
                     after(grammarAccess.getMultExpAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:928:6: ( '/' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:928:6: ( '/' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:929:1: '/'
                    {
                     before(grammarAccess.getMultExpAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__MultExp__OpAlternatives_1_1_01935); 
                     after(grammarAccess.getMultExpAccess().getOpSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__MultExp__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:941:1: rule__Primary__Alternatives : ( ( ruleNumberLiteral ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleConstantOrFunctionCallExp ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:945:1: ( ( ruleNumberLiteral ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleConstantOrFunctionCallExp ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_REAL:
            case 13:
                {
                alt8=1;
                }
                break;
            case 44:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:946:1: ( ruleNumberLiteral )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:946:1: ( ruleNumberLiteral )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:947:1: ruleNumberLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumberLiteral_in_rule__Primary__Alternatives1969);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:952:6: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:952:6: ( ( rule__Primary__Group_1__0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:953:1: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:954:1: ( rule__Primary__Group_1__0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:954:2: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1986);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:958:6: ( ruleConstantOrFunctionCallExp )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:958:6: ( ruleConstantOrFunctionCallExp )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:959:1: ruleConstantOrFunctionCallExp
                    {
                     before(grammarAccess.getPrimaryAccess().getConstantOrFunctionCallExpParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleConstantOrFunctionCallExp_in_rule__Primary__Alternatives2004);
                    ruleConstantOrFunctionCallExp();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getConstantOrFunctionCallExpParserRuleCall_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__AXIS__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:969:1: rule__AXIS__Alternatives : ( ( ( 'x' ) ) | ( ( 'y' ) ) | ( ( 'z' ) ) );
    public final void rule__AXIS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:973:1: ( ( ( 'x' ) ) | ( ( 'y' ) ) | ( ( 'z' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:974:1: ( ( 'x' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:974:1: ( ( 'x' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:975:1: ( 'x' )
                    {
                     before(grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:976:1: ( 'x' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:976:3: 'x'
                    {
                    match(input,16,FOLLOW_16_in_rule__AXIS__Alternatives2037); 

                    }

                     after(grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:981:6: ( ( 'y' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:981:6: ( ( 'y' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:982:1: ( 'y' )
                    {
                     before(grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:983:1: ( 'y' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:983:3: 'y'
                    {
                    match(input,17,FOLLOW_17_in_rule__AXIS__Alternatives2058); 

                    }

                     after(grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:988:6: ( ( 'z' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:988:6: ( ( 'z' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:989:1: ( 'z' )
                    {
                     before(grammarAccess.getAXISAccess().getZEnumLiteralDeclaration_2()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:990:1: ( 'z' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:990:3: 'z'
                    {
                    match(input,18,FOLLOW_18_in_rule__AXIS__Alternatives2079); 

                    }

                     after(grammarAccess.getAXISAccess().getZEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__AXIS__Alternatives"


    // $ANTLR start "rule__ConstraintType__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1000:1: rule__ConstraintType__Alternatives : ( ( ( 'geometrical' ) ) | ( ( 'velocity' ) ) );
    public final void rule__ConstraintType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1004:1: ( ( ( 'geometrical' ) ) | ( ( 'velocity' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1005:1: ( ( 'geometrical' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1005:1: ( ( 'geometrical' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1006:1: ( 'geometrical' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1007:1: ( 'geometrical' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1007:3: 'geometrical'
                    {
                    match(input,19,FOLLOW_19_in_rule__ConstraintType__Alternatives2115); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1012:6: ( ( 'velocity' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1012:6: ( ( 'velocity' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1013:1: ( 'velocity' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getVELOCITYEnumLiteralDeclaration_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1014:1: ( 'velocity' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1014:3: 'velocity'
                    {
                    match(input,20,FOLLOW_20_in_rule__ConstraintType__Alternatives2136); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getVELOCITYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ConstraintType__Alternatives"


    // $ANTLR start "rule__LoadType__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1024:1: rule__LoadType__Alternatives : ( ( ( 'force' ) ) | ( ( 'torque' ) ) );
    public final void rule__LoadType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1028:1: ( ( ( 'force' ) ) | ( ( 'torque' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1029:1: ( ( 'force' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1029:1: ( ( 'force' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1030:1: ( 'force' )
                    {
                     before(grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1031:1: ( 'force' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1031:3: 'force'
                    {
                    match(input,21,FOLLOW_21_in_rule__LoadType__Alternatives2172); 

                    }

                     after(grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1036:6: ( ( 'torque' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1036:6: ( ( 'torque' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1037:1: ( 'torque' )
                    {
                     before(grammarAccess.getLoadTypeAccess().getTORQUEEnumLiteralDeclaration_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1038:1: ( 'torque' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1038:3: 'torque'
                    {
                    match(input,22,FOLLOW_22_in_rule__LoadType__Alternatives2193); 

                    }

                     after(grammarAccess.getLoadTypeAccess().getTORQUEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__LoadType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1050:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1054:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1055:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02226);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02229);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1062:1: rule__Model__Group__0__Impl : ( ( rule__Model__DefsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1066:1: ( ( ( rule__Model__DefsAssignment_0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1067:1: ( ( rule__Model__DefsAssignment_0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1067:1: ( ( rule__Model__DefsAssignment_0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1068:1: ( rule__Model__DefsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getDefsAssignment_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1069:1: ( rule__Model__DefsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==33||LA12_0==43||LA12_0==47||LA12_0==55||LA12_0==57) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1069:2: rule__Model__DefsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__DefsAssignment_0_in_rule__Model__Group__0__Impl2256);
            	    rule__Model__DefsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDefsAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1079:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1083:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1084:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12287);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12290);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1091:1: rule__Model__Group__1__Impl : ( ( rule__Model__WorldAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1095:1: ( ( ( rule__Model__WorldAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1096:1: ( ( rule__Model__WorldAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1096:1: ( ( rule__Model__WorldAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1097:1: ( rule__Model__WorldAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getWorldAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1098:1: ( rule__Model__WorldAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1098:2: rule__Model__WorldAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__WorldAssignment_1_in_rule__Model__Group__1__Impl2317);
            rule__Model__WorldAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getWorldAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1108:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1112:1: ( rule__Model__Group__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1113:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22347);
            rule__Model__Group__2__Impl();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1119:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1123:1: ( ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1124:1: ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1124:1: ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1125:1: ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1125:1: ( ( rule__Model__BodiesAssignment_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1126:1: ( rule__Model__BodiesAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getBodiesAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1127:1: ( rule__Model__BodiesAssignment_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1127:2: rule__Model__BodiesAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl2376);
            rule__Model__BodiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBodiesAssignment_2()); 

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1130:1: ( ( rule__Model__BodiesAssignment_2 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1131:1: ( rule__Model__BodiesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getBodiesAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1132:1: ( rule__Model__BodiesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1132:2: rule__Model__BodiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl2388);
            	    rule__Model__BodiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getBodiesAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1149:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1153:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1154:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_rule__Environment__Group__0__Impl_in_rule__Environment__Group__02427);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__1_in_rule__Environment__Group__02430);
            rule__Environment__Group__1();

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
    // $ANTLR end "rule__Environment__Group__0"


    // $ANTLR start "rule__Environment__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1161:1: rule__Environment__Group__0__Impl : ( 'world' ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1165:1: ( ( 'world' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1166:1: ( 'world' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1166:1: ( 'world' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1167:1: 'world'
            {
             before(grammarAccess.getEnvironmentAccess().getWorldKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Environment__Group__0__Impl2458); 
             after(grammarAccess.getEnvironmentAccess().getWorldKeyword_0()); 

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
    // $ANTLR end "rule__Environment__Group__0__Impl"


    // $ANTLR start "rule__Environment__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1180:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1184:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1185:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_rule__Environment__Group__1__Impl_in_rule__Environment__Group__12489);
            rule__Environment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__2_in_rule__Environment__Group__12492);
            rule__Environment__Group__2();

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
    // $ANTLR end "rule__Environment__Group__1"


    // $ANTLR start "rule__Environment__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1192:1: rule__Environment__Group__1__Impl : ( '{' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1196:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1197:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1197:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1198:1: '{'
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Environment__Group__1__Impl2520); 
             after(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Environment__Group__1__Impl"


    // $ANTLR start "rule__Environment__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1211:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1215:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1216:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_rule__Environment__Group__2__Impl_in_rule__Environment__Group__22551);
            rule__Environment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__3_in_rule__Environment__Group__22554);
            rule__Environment__Group__3();

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
    // $ANTLR end "rule__Environment__Group__2"


    // $ANTLR start "rule__Environment__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1223:1: rule__Environment__Group__2__Impl : ( 'gravity' ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1227:1: ( ( 'gravity' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1228:1: ( 'gravity' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1228:1: ( 'gravity' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1229:1: 'gravity'
            {
             before(grammarAccess.getEnvironmentAccess().getGravityKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Environment__Group__2__Impl2582); 
             after(grammarAccess.getEnvironmentAccess().getGravityKeyword_2()); 

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
    // $ANTLR end "rule__Environment__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1242:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl rule__Environment__Group__4 ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1246:1: ( rule__Environment__Group__3__Impl rule__Environment__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1247:2: rule__Environment__Group__3__Impl rule__Environment__Group__4
            {
            pushFollow(FOLLOW_rule__Environment__Group__3__Impl_in_rule__Environment__Group__32613);
            rule__Environment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__4_in_rule__Environment__Group__32616);
            rule__Environment__Group__4();

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
    // $ANTLR end "rule__Environment__Group__3"


    // $ANTLR start "rule__Environment__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1254:1: rule__Environment__Group__3__Impl : ( ( rule__Environment__GravityAssignment_3 ) ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1258:1: ( ( ( rule__Environment__GravityAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1259:1: ( ( rule__Environment__GravityAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1259:1: ( ( rule__Environment__GravityAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1260:1: ( rule__Environment__GravityAssignment_3 )
            {
             before(grammarAccess.getEnvironmentAccess().getGravityAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1261:1: ( rule__Environment__GravityAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1261:2: rule__Environment__GravityAssignment_3
            {
            pushFollow(FOLLOW_rule__Environment__GravityAssignment_3_in_rule__Environment__Group__3__Impl2643);
            rule__Environment__GravityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getGravityAssignment_3()); 

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
    // $ANTLR end "rule__Environment__Group__3__Impl"


    // $ANTLR start "rule__Environment__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1271:1: rule__Environment__Group__4 : rule__Environment__Group__4__Impl ;
    public final void rule__Environment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1275:1: ( rule__Environment__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1276:2: rule__Environment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Environment__Group__4__Impl_in_rule__Environment__Group__42673);
            rule__Environment__Group__4__Impl();

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
    // $ANTLR end "rule__Environment__Group__4"


    // $ANTLR start "rule__Environment__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1282:1: rule__Environment__Group__4__Impl : ( '}' ) ;
    public final void rule__Environment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1286:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1287:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1287:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1288:1: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Environment__Group__4__Impl2701); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Environment__Group__4__Impl"


    // $ANTLR start "rule__System__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1311:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1315:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1316:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__02742);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__02745);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1323:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1327:1: ( ( 'system' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1328:1: ( 'system' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1328:1: ( 'system' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1329:1: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__System__Group__0__Impl2773); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1342:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1346:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1347:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__12804);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__12807);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1354:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1358:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1359:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1359:1: ( ( rule__System__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1360:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1361:1: ( rule__System__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1361:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl2834);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1371:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1375:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1376:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__22864);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__22867);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1383:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1387:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1388:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1388:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1389:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__System__Group__2__Impl2895); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1402:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1406:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1407:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__32926);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__32929);
            rule__System__Group__4();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1414:1: rule__System__Group__3__Impl : ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1418:1: ( ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1419:1: ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1419:1: ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1420:1: ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1420:1: ( ( rule__System__ElementsAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1421:1: ( rule__System__ElementsAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getElementsAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1422:1: ( rule__System__ElementsAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1422:2: rule__System__ElementsAssignment_3
            {
            pushFollow(FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl2958);
            rule__System__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getElementsAssignment_3()); 

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1425:1: ( ( rule__System__ElementsAssignment_3 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1426:1: ( rule__System__ElementsAssignment_3 )*
            {
             before(grammarAccess.getSystemAccess().getElementsAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1427:1: ( rule__System__ElementsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28||LA14_0==33||(LA14_0>=52 && LA14_0<=53)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1427:2: rule__System__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl2970);
            	    rule__System__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1438:1: rule__System__Group__4 : rule__System__Group__4__Impl ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1442:1: ( rule__System__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1443:2: rule__System__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__43003);
            rule__System__Group__4__Impl();

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
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1449:1: rule__System__Group__4__Impl : ( '}' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1453:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1454:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1454:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1455:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__System__Group__4__Impl3031); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__Body__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1478:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1482:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1483:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__03072);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__03075);
            rule__Body__Group__1();

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
    // $ANTLR end "rule__Body__Group__0"


    // $ANTLR start "rule__Body__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1490:1: rule__Body__Group__0__Impl : ( 'body' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1494:1: ( ( 'body' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1495:1: ( 'body' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1495:1: ( 'body' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1496:1: 'body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Body__Group__0__Impl3103); 
             after(grammarAccess.getBodyAccess().getBodyKeyword_0()); 

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
    // $ANTLR end "rule__Body__Group__0__Impl"


    // $ANTLR start "rule__Body__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1509:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1513:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1514:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__13134);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__13137);
            rule__Body__Group__2();

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
    // $ANTLR end "rule__Body__Group__1"


    // $ANTLR start "rule__Body__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1521:1: rule__Body__Group__1__Impl : ( ( rule__Body__NameAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1525:1: ( ( ( rule__Body__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1526:1: ( ( rule__Body__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1526:1: ( ( rule__Body__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1527:1: ( rule__Body__NameAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1528:1: ( rule__Body__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1528:2: rule__Body__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__NameAssignment_1_in_rule__Body__Group__1__Impl3164);
            rule__Body__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Body__Group__1__Impl"


    // $ANTLR start "rule__Body__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1538:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1542:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1543:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__23194);
            rule__Body__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__23197);
            rule__Body__Group__3();

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
    // $ANTLR end "rule__Body__Group__2"


    // $ANTLR start "rule__Body__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1550:1: rule__Body__Group__2__Impl : ( '{' ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1554:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1555:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1555:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1556:1: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Body__Group__2__Impl3225); 
             after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Body__Group__2__Impl"


    // $ANTLR start "rule__Body__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1569:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1573:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1574:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__33256);
            rule__Body__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__4_in_rule__Body__Group__33259);
            rule__Body__Group__4();

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
    // $ANTLR end "rule__Body__Group__3"


    // $ANTLR start "rule__Body__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1581:1: rule__Body__Group__3__Impl : ( ( rule__Body__MassAssignment_3 ) ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1585:1: ( ( ( rule__Body__MassAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1586:1: ( ( rule__Body__MassAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1586:1: ( ( rule__Body__MassAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1587:1: ( rule__Body__MassAssignment_3 )
            {
             before(grammarAccess.getBodyAccess().getMassAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1588:1: ( rule__Body__MassAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1588:2: rule__Body__MassAssignment_3
            {
            pushFollow(FOLLOW_rule__Body__MassAssignment_3_in_rule__Body__Group__3__Impl3286);
            rule__Body__MassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getMassAssignment_3()); 

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
    // $ANTLR end "rule__Body__Group__3__Impl"


    // $ANTLR start "rule__Body__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1598:1: rule__Body__Group__4 : rule__Body__Group__4__Impl ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1602:1: ( rule__Body__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1603:2: rule__Body__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__43316);
            rule__Body__Group__4__Impl();

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
    // $ANTLR end "rule__Body__Group__4"


    // $ANTLR start "rule__Body__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1609:1: rule__Body__Group__4__Impl : ( '}' ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1613:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1614:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1614:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1615:1: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Body__Group__4__Impl3344); 
             after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Body__Group__4__Impl"


    // $ANTLR start "rule__Mass__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1638:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1642:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1643:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_rule__Mass__Group__0__Impl_in_rule__Mass__Group__03385);
            rule__Mass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__1_in_rule__Mass__Group__03388);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1650:1: rule__Mass__Group__0__Impl : ( 'mass' ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1654:1: ( ( 'mass' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1655:1: ( 'mass' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1655:1: ( 'mass' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1656:1: 'mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Mass__Group__0__Impl3416); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1669:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1673:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1674:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_rule__Mass__Group__1__Impl_in_rule__Mass__Group__13447);
            rule__Mass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__2_in_rule__Mass__Group__13450);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1681:1: rule__Mass__Group__1__Impl : ( '{' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1685:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1686:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1686:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1687:1: '{'
            {
             before(grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Mass__Group__1__Impl3478); 
             after(grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_1()); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1700:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1704:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1705:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_rule__Mass__Group__2__Impl_in_rule__Mass__Group__23509);
            rule__Mass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__3_in_rule__Mass__Group__23512);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1712:1: rule__Mass__Group__2__Impl : ( 'value' ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1716:1: ( ( 'value' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1717:1: ( 'value' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1717:1: ( 'value' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1718:1: 'value'
            {
             before(grammarAccess.getMassAccess().getValueKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Mass__Group__2__Impl3540); 
             after(grammarAccess.getMassAccess().getValueKeyword_2()); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1731:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1735:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1736:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
            {
            pushFollow(FOLLOW_rule__Mass__Group__3__Impl_in_rule__Mass__Group__33571);
            rule__Mass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__4_in_rule__Mass__Group__33574);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1743:1: rule__Mass__Group__3__Impl : ( ( rule__Mass__ValueAssignment_3 ) ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1747:1: ( ( ( rule__Mass__ValueAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1748:1: ( ( rule__Mass__ValueAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1748:1: ( ( rule__Mass__ValueAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1749:1: ( rule__Mass__ValueAssignment_3 )
            {
             before(grammarAccess.getMassAccess().getValueAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1750:1: ( rule__Mass__ValueAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1750:2: rule__Mass__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Mass__ValueAssignment_3_in_rule__Mass__Group__3__Impl3601);
            rule__Mass__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getValueAssignment_3()); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1760:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl rule__Mass__Group__5 ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1764:1: ( rule__Mass__Group__4__Impl rule__Mass__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1765:2: rule__Mass__Group__4__Impl rule__Mass__Group__5
            {
            pushFollow(FOLLOW_rule__Mass__Group__4__Impl_in_rule__Mass__Group__43631);
            rule__Mass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__5_in_rule__Mass__Group__43634);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1772:1: rule__Mass__Group__4__Impl : ( 'position' ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1776:1: ( ( 'position' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1777:1: ( 'position' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1777:1: ( 'position' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1778:1: 'position'
            {
             before(grammarAccess.getMassAccess().getPositionKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__Mass__Group__4__Impl3662); 
             after(grammarAccess.getMassAccess().getPositionKeyword_4()); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1791:1: rule__Mass__Group__5 : rule__Mass__Group__5__Impl rule__Mass__Group__6 ;
    public final void rule__Mass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1795:1: ( rule__Mass__Group__5__Impl rule__Mass__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1796:2: rule__Mass__Group__5__Impl rule__Mass__Group__6
            {
            pushFollow(FOLLOW_rule__Mass__Group__5__Impl_in_rule__Mass__Group__53693);
            rule__Mass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__6_in_rule__Mass__Group__53696);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1803:1: rule__Mass__Group__5__Impl : ( ( rule__Mass__PositionAssignment_5 ) ) ;
    public final void rule__Mass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1807:1: ( ( ( rule__Mass__PositionAssignment_5 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1808:1: ( ( rule__Mass__PositionAssignment_5 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1808:1: ( ( rule__Mass__PositionAssignment_5 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1809:1: ( rule__Mass__PositionAssignment_5 )
            {
             before(grammarAccess.getMassAccess().getPositionAssignment_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1810:1: ( rule__Mass__PositionAssignment_5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1810:2: rule__Mass__PositionAssignment_5
            {
            pushFollow(FOLLOW_rule__Mass__PositionAssignment_5_in_rule__Mass__Group__5__Impl3723);
            rule__Mass__PositionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getPositionAssignment_5()); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1820:1: rule__Mass__Group__6 : rule__Mass__Group__6__Impl rule__Mass__Group__7 ;
    public final void rule__Mass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1824:1: ( rule__Mass__Group__6__Impl rule__Mass__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1825:2: rule__Mass__Group__6__Impl rule__Mass__Group__7
            {
            pushFollow(FOLLOW_rule__Mass__Group__6__Impl_in_rule__Mass__Group__63753);
            rule__Mass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__7_in_rule__Mass__Group__63756);
            rule__Mass__Group__7();

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1832:1: rule__Mass__Group__6__Impl : ( 'inertia' ) ;
    public final void rule__Mass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1836:1: ( ( 'inertia' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1837:1: ( 'inertia' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1837:1: ( 'inertia' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1838:1: 'inertia'
            {
             before(grammarAccess.getMassAccess().getInertiaKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__Mass__Group__6__Impl3784); 
             after(grammarAccess.getMassAccess().getInertiaKeyword_6()); 

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


    // $ANTLR start "rule__Mass__Group__7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1851:1: rule__Mass__Group__7 : rule__Mass__Group__7__Impl rule__Mass__Group__8 ;
    public final void rule__Mass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1855:1: ( rule__Mass__Group__7__Impl rule__Mass__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1856:2: rule__Mass__Group__7__Impl rule__Mass__Group__8
            {
            pushFollow(FOLLOW_rule__Mass__Group__7__Impl_in_rule__Mass__Group__73815);
            rule__Mass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__8_in_rule__Mass__Group__73818);
            rule__Mass__Group__8();

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
    // $ANTLR end "rule__Mass__Group__7"


    // $ANTLR start "rule__Mass__Group__7__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1863:1: rule__Mass__Group__7__Impl : ( ( rule__Mass__InertiaAssignment_7 ) ) ;
    public final void rule__Mass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1867:1: ( ( ( rule__Mass__InertiaAssignment_7 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1868:1: ( ( rule__Mass__InertiaAssignment_7 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1868:1: ( ( rule__Mass__InertiaAssignment_7 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1869:1: ( rule__Mass__InertiaAssignment_7 )
            {
             before(grammarAccess.getMassAccess().getInertiaAssignment_7()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1870:1: ( rule__Mass__InertiaAssignment_7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1870:2: rule__Mass__InertiaAssignment_7
            {
            pushFollow(FOLLOW_rule__Mass__InertiaAssignment_7_in_rule__Mass__Group__7__Impl3845);
            rule__Mass__InertiaAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getInertiaAssignment_7()); 

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
    // $ANTLR end "rule__Mass__Group__7__Impl"


    // $ANTLR start "rule__Mass__Group__8"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1880:1: rule__Mass__Group__8 : rule__Mass__Group__8__Impl ;
    public final void rule__Mass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1884:1: ( rule__Mass__Group__8__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1885:2: rule__Mass__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Mass__Group__8__Impl_in_rule__Mass__Group__83875);
            rule__Mass__Group__8__Impl();

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
    // $ANTLR end "rule__Mass__Group__8"


    // $ANTLR start "rule__Mass__Group__8__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1891:1: rule__Mass__Group__8__Impl : ( '}' ) ;
    public final void rule__Mass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1895:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1896:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1896:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1897:1: '}'
            {
             before(grammarAccess.getMassAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__Mass__Group__8__Impl3903); 
             after(grammarAccess.getMassAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Mass__Group__8__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1928:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1932:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1933:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_rule__Joint__Group__0__Impl_in_rule__Joint__Group__03952);
            rule__Joint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__1_in_rule__Joint__Group__03955);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1940:1: rule__Joint__Group__0__Impl : ( 'joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1944:1: ( ( 'joint' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1945:1: ( 'joint' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1945:1: ( 'joint' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1946:1: 'joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Joint__Group__0__Impl3983); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1959:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1963:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1964:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_rule__Joint__Group__1__Impl_in_rule__Joint__Group__14014);
            rule__Joint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__2_in_rule__Joint__Group__14017);
            rule__Joint__Group__2();

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1971:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1975:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1976:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1976:1: ( ( rule__Joint__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1977:1: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1978:1: ( rule__Joint__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1978:2: rule__Joint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Joint__NameAssignment_1_in_rule__Joint__Group__1__Impl4044);
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


    // $ANTLR start "rule__Joint__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1988:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1992:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1993:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_rule__Joint__Group__2__Impl_in_rule__Joint__Group__24074);
            rule__Joint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__3_in_rule__Joint__Group__24077);
            rule__Joint__Group__3();

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
    // $ANTLR end "rule__Joint__Group__2"


    // $ANTLR start "rule__Joint__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2000:1: rule__Joint__Group__2__Impl : ( ':' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2004:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2005:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2005:1: ( ':' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2006:1: ':'
            {
             before(grammarAccess.getJointAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Joint__Group__2__Impl4105); 
             after(grammarAccess.getJointAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Joint__Group__2__Impl"


    // $ANTLR start "rule__Joint__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2019:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2023:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2024:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_rule__Joint__Group__3__Impl_in_rule__Joint__Group__34136);
            rule__Joint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__4_in_rule__Joint__Group__34139);
            rule__Joint__Group__4();

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
    // $ANTLR end "rule__Joint__Group__3"


    // $ANTLR start "rule__Joint__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2031:1: rule__Joint__Group__3__Impl : ( ( rule__Joint__TypeAssignment_3 ) ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2035:1: ( ( ( rule__Joint__TypeAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2036:1: ( ( rule__Joint__TypeAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2036:1: ( ( rule__Joint__TypeAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2037:1: ( rule__Joint__TypeAssignment_3 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2038:1: ( rule__Joint__TypeAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2038:2: rule__Joint__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Joint__TypeAssignment_3_in_rule__Joint__Group__3__Impl4166);
            rule__Joint__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Joint__Group__3__Impl"


    // $ANTLR start "rule__Joint__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2048:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2052:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2053:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_rule__Joint__Group__4__Impl_in_rule__Joint__Group__44196);
            rule__Joint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__5_in_rule__Joint__Group__44199);
            rule__Joint__Group__5();

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
    // $ANTLR end "rule__Joint__Group__4"


    // $ANTLR start "rule__Joint__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2060:1: rule__Joint__Group__4__Impl : ( 'between' ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2064:1: ( ( 'between' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2065:1: ( 'between' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2065:1: ( 'between' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2066:1: 'between'
            {
             before(grammarAccess.getJointAccess().getBetweenKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__Joint__Group__4__Impl4227); 
             after(grammarAccess.getJointAccess().getBetweenKeyword_4()); 

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
    // $ANTLR end "rule__Joint__Group__4__Impl"


    // $ANTLR start "rule__Joint__Group__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2079:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2083:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2084:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_rule__Joint__Group__5__Impl_in_rule__Joint__Group__54258);
            rule__Joint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__6_in_rule__Joint__Group__54261);
            rule__Joint__Group__6();

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
    // $ANTLR end "rule__Joint__Group__5"


    // $ANTLR start "rule__Joint__Group__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2091:1: rule__Joint__Group__5__Impl : ( ( rule__Joint__Body1Assignment_5 ) ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2095:1: ( ( ( rule__Joint__Body1Assignment_5 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2096:1: ( ( rule__Joint__Body1Assignment_5 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2096:1: ( ( rule__Joint__Body1Assignment_5 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2097:1: ( rule__Joint__Body1Assignment_5 )
            {
             before(grammarAccess.getJointAccess().getBody1Assignment_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2098:1: ( rule__Joint__Body1Assignment_5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2098:2: rule__Joint__Body1Assignment_5
            {
            pushFollow(FOLLOW_rule__Joint__Body1Assignment_5_in_rule__Joint__Group__5__Impl4288);
            rule__Joint__Body1Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getBody1Assignment_5()); 

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
    // $ANTLR end "rule__Joint__Group__5__Impl"


    // $ANTLR start "rule__Joint__Group__6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2108:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2112:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2113:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_rule__Joint__Group__6__Impl_in_rule__Joint__Group__64318);
            rule__Joint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__7_in_rule__Joint__Group__64321);
            rule__Joint__Group__7();

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
    // $ANTLR end "rule__Joint__Group__6"


    // $ANTLR start "rule__Joint__Group__6__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2120:1: rule__Joint__Group__6__Impl : ( ( rule__Joint__RelTrans1Assignment_6 ) ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2124:1: ( ( ( rule__Joint__RelTrans1Assignment_6 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2125:1: ( ( rule__Joint__RelTrans1Assignment_6 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2125:1: ( ( rule__Joint__RelTrans1Assignment_6 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2126:1: ( rule__Joint__RelTrans1Assignment_6 )
            {
             before(grammarAccess.getJointAccess().getRelTrans1Assignment_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2127:1: ( rule__Joint__RelTrans1Assignment_6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2127:2: rule__Joint__RelTrans1Assignment_6
            {
            pushFollow(FOLLOW_rule__Joint__RelTrans1Assignment_6_in_rule__Joint__Group__6__Impl4348);
            rule__Joint__RelTrans1Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getRelTrans1Assignment_6()); 

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
    // $ANTLR end "rule__Joint__Group__6__Impl"


    // $ANTLR start "rule__Joint__Group__7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2137:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2141:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2142:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_rule__Joint__Group__7__Impl_in_rule__Joint__Group__74378);
            rule__Joint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__8_in_rule__Joint__Group__74381);
            rule__Joint__Group__8();

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
    // $ANTLR end "rule__Joint__Group__7"


    // $ANTLR start "rule__Joint__Group__7__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2149:1: rule__Joint__Group__7__Impl : ( 'and' ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2153:1: ( ( 'and' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2154:1: ( 'and' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2154:1: ( 'and' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2155:1: 'and'
            {
             before(grammarAccess.getJointAccess().getAndKeyword_7()); 
            match(input,36,FOLLOW_36_in_rule__Joint__Group__7__Impl4409); 
             after(grammarAccess.getJointAccess().getAndKeyword_7()); 

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
    // $ANTLR end "rule__Joint__Group__7__Impl"


    // $ANTLR start "rule__Joint__Group__8"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2168:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2172:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2173:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_rule__Joint__Group__8__Impl_in_rule__Joint__Group__84440);
            rule__Joint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__9_in_rule__Joint__Group__84443);
            rule__Joint__Group__9();

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
    // $ANTLR end "rule__Joint__Group__8"


    // $ANTLR start "rule__Joint__Group__8__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2180:1: rule__Joint__Group__8__Impl : ( ( rule__Joint__Body2Assignment_8 ) ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2184:1: ( ( ( rule__Joint__Body2Assignment_8 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2185:1: ( ( rule__Joint__Body2Assignment_8 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2185:1: ( ( rule__Joint__Body2Assignment_8 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2186:1: ( rule__Joint__Body2Assignment_8 )
            {
             before(grammarAccess.getJointAccess().getBody2Assignment_8()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2187:1: ( rule__Joint__Body2Assignment_8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2187:2: rule__Joint__Body2Assignment_8
            {
            pushFollow(FOLLOW_rule__Joint__Body2Assignment_8_in_rule__Joint__Group__8__Impl4470);
            rule__Joint__Body2Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getBody2Assignment_8()); 

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
    // $ANTLR end "rule__Joint__Group__8__Impl"


    // $ANTLR start "rule__Joint__Group__9"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2197:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2201:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2202:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_rule__Joint__Group__9__Impl_in_rule__Joint__Group__94500);
            rule__Joint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__10_in_rule__Joint__Group__94503);
            rule__Joint__Group__10();

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
    // $ANTLR end "rule__Joint__Group__9"


    // $ANTLR start "rule__Joint__Group__9__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2209:1: rule__Joint__Group__9__Impl : ( ( rule__Joint__RelTrans2Assignment_9 ) ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2213:1: ( ( ( rule__Joint__RelTrans2Assignment_9 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2214:1: ( ( rule__Joint__RelTrans2Assignment_9 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2214:1: ( ( rule__Joint__RelTrans2Assignment_9 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2215:1: ( rule__Joint__RelTrans2Assignment_9 )
            {
             before(grammarAccess.getJointAccess().getRelTrans2Assignment_9()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2216:1: ( rule__Joint__RelTrans2Assignment_9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2216:2: rule__Joint__RelTrans2Assignment_9
            {
            pushFollow(FOLLOW_rule__Joint__RelTrans2Assignment_9_in_rule__Joint__Group__9__Impl4530);
            rule__Joint__RelTrans2Assignment_9();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getRelTrans2Assignment_9()); 

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
    // $ANTLR end "rule__Joint__Group__9__Impl"


    // $ANTLR start "rule__Joint__Group__10"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2226:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl rule__Joint__Group__11 ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2230:1: ( rule__Joint__Group__10__Impl rule__Joint__Group__11 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2231:2: rule__Joint__Group__10__Impl rule__Joint__Group__11
            {
            pushFollow(FOLLOW_rule__Joint__Group__10__Impl_in_rule__Joint__Group__104560);
            rule__Joint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__11_in_rule__Joint__Group__104563);
            rule__Joint__Group__11();

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
    // $ANTLR end "rule__Joint__Group__10"


    // $ANTLR start "rule__Joint__Group__10__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2238:1: rule__Joint__Group__10__Impl : ( 'stiffness' ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2242:1: ( ( 'stiffness' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2243:1: ( 'stiffness' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2243:1: ( 'stiffness' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2244:1: 'stiffness'
            {
             before(grammarAccess.getJointAccess().getStiffnessKeyword_10()); 
            match(input,37,FOLLOW_37_in_rule__Joint__Group__10__Impl4591); 
             after(grammarAccess.getJointAccess().getStiffnessKeyword_10()); 

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
    // $ANTLR end "rule__Joint__Group__10__Impl"


    // $ANTLR start "rule__Joint__Group__11"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2257:1: rule__Joint__Group__11 : rule__Joint__Group__11__Impl rule__Joint__Group__12 ;
    public final void rule__Joint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2261:1: ( rule__Joint__Group__11__Impl rule__Joint__Group__12 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2262:2: rule__Joint__Group__11__Impl rule__Joint__Group__12
            {
            pushFollow(FOLLOW_rule__Joint__Group__11__Impl_in_rule__Joint__Group__114622);
            rule__Joint__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__12_in_rule__Joint__Group__114625);
            rule__Joint__Group__12();

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
    // $ANTLR end "rule__Joint__Group__11"


    // $ANTLR start "rule__Joint__Group__11__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2269:1: rule__Joint__Group__11__Impl : ( '{' ) ;
    public final void rule__Joint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2273:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2274:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2274:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2275:1: '{'
            {
             before(grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,24,FOLLOW_24_in_rule__Joint__Group__11__Impl4653); 
             after(grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Joint__Group__11__Impl"


    // $ANTLR start "rule__Joint__Group__12"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2288:1: rule__Joint__Group__12 : rule__Joint__Group__12__Impl rule__Joint__Group__13 ;
    public final void rule__Joint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2292:1: ( rule__Joint__Group__12__Impl rule__Joint__Group__13 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2293:2: rule__Joint__Group__12__Impl rule__Joint__Group__13
            {
            pushFollow(FOLLOW_rule__Joint__Group__12__Impl_in_rule__Joint__Group__124684);
            rule__Joint__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__13_in_rule__Joint__Group__124687);
            rule__Joint__Group__13();

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
    // $ANTLR end "rule__Joint__Group__12"


    // $ANTLR start "rule__Joint__Group__12__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2300:1: rule__Joint__Group__12__Impl : ( 'springCoeff' ) ;
    public final void rule__Joint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2304:1: ( ( 'springCoeff' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2305:1: ( 'springCoeff' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2305:1: ( 'springCoeff' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2306:1: 'springCoeff'
            {
             before(grammarAccess.getJointAccess().getSpringCoeffKeyword_12()); 
            match(input,38,FOLLOW_38_in_rule__Joint__Group__12__Impl4715); 
             after(grammarAccess.getJointAccess().getSpringCoeffKeyword_12()); 

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
    // $ANTLR end "rule__Joint__Group__12__Impl"


    // $ANTLR start "rule__Joint__Group__13"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2319:1: rule__Joint__Group__13 : rule__Joint__Group__13__Impl rule__Joint__Group__14 ;
    public final void rule__Joint__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2323:1: ( rule__Joint__Group__13__Impl rule__Joint__Group__14 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2324:2: rule__Joint__Group__13__Impl rule__Joint__Group__14
            {
            pushFollow(FOLLOW_rule__Joint__Group__13__Impl_in_rule__Joint__Group__134746);
            rule__Joint__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__14_in_rule__Joint__Group__134749);
            rule__Joint__Group__14();

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
    // $ANTLR end "rule__Joint__Group__13"


    // $ANTLR start "rule__Joint__Group__13__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2331:1: rule__Joint__Group__13__Impl : ( ( rule__Joint__SpringCoeffAssignment_13 ) ) ;
    public final void rule__Joint__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2335:1: ( ( ( rule__Joint__SpringCoeffAssignment_13 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2336:1: ( ( rule__Joint__SpringCoeffAssignment_13 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2336:1: ( ( rule__Joint__SpringCoeffAssignment_13 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2337:1: ( rule__Joint__SpringCoeffAssignment_13 )
            {
             before(grammarAccess.getJointAccess().getSpringCoeffAssignment_13()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2338:1: ( rule__Joint__SpringCoeffAssignment_13 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2338:2: rule__Joint__SpringCoeffAssignment_13
            {
            pushFollow(FOLLOW_rule__Joint__SpringCoeffAssignment_13_in_rule__Joint__Group__13__Impl4776);
            rule__Joint__SpringCoeffAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getSpringCoeffAssignment_13()); 

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
    // $ANTLR end "rule__Joint__Group__13__Impl"


    // $ANTLR start "rule__Joint__Group__14"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2348:1: rule__Joint__Group__14 : rule__Joint__Group__14__Impl rule__Joint__Group__15 ;
    public final void rule__Joint__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2352:1: ( rule__Joint__Group__14__Impl rule__Joint__Group__15 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2353:2: rule__Joint__Group__14__Impl rule__Joint__Group__15
            {
            pushFollow(FOLLOW_rule__Joint__Group__14__Impl_in_rule__Joint__Group__144806);
            rule__Joint__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__15_in_rule__Joint__Group__144809);
            rule__Joint__Group__15();

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
    // $ANTLR end "rule__Joint__Group__14"


    // $ANTLR start "rule__Joint__Group__14__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2360:1: rule__Joint__Group__14__Impl : ( 'springInit' ) ;
    public final void rule__Joint__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2364:1: ( ( 'springInit' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2365:1: ( 'springInit' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2365:1: ( 'springInit' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2366:1: 'springInit'
            {
             before(grammarAccess.getJointAccess().getSpringInitKeyword_14()); 
            match(input,39,FOLLOW_39_in_rule__Joint__Group__14__Impl4837); 
             after(grammarAccess.getJointAccess().getSpringInitKeyword_14()); 

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
    // $ANTLR end "rule__Joint__Group__14__Impl"


    // $ANTLR start "rule__Joint__Group__15"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2379:1: rule__Joint__Group__15 : rule__Joint__Group__15__Impl rule__Joint__Group__16 ;
    public final void rule__Joint__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2383:1: ( rule__Joint__Group__15__Impl rule__Joint__Group__16 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2384:2: rule__Joint__Group__15__Impl rule__Joint__Group__16
            {
            pushFollow(FOLLOW_rule__Joint__Group__15__Impl_in_rule__Joint__Group__154868);
            rule__Joint__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__16_in_rule__Joint__Group__154871);
            rule__Joint__Group__16();

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
    // $ANTLR end "rule__Joint__Group__15"


    // $ANTLR start "rule__Joint__Group__15__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2391:1: rule__Joint__Group__15__Impl : ( ( rule__Joint__SpringInitAssignment_15 ) ) ;
    public final void rule__Joint__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2395:1: ( ( ( rule__Joint__SpringInitAssignment_15 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2396:1: ( ( rule__Joint__SpringInitAssignment_15 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2396:1: ( ( rule__Joint__SpringInitAssignment_15 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2397:1: ( rule__Joint__SpringInitAssignment_15 )
            {
             before(grammarAccess.getJointAccess().getSpringInitAssignment_15()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2398:1: ( rule__Joint__SpringInitAssignment_15 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2398:2: rule__Joint__SpringInitAssignment_15
            {
            pushFollow(FOLLOW_rule__Joint__SpringInitAssignment_15_in_rule__Joint__Group__15__Impl4898);
            rule__Joint__SpringInitAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getSpringInitAssignment_15()); 

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
    // $ANTLR end "rule__Joint__Group__15__Impl"


    // $ANTLR start "rule__Joint__Group__16"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2408:1: rule__Joint__Group__16 : rule__Joint__Group__16__Impl rule__Joint__Group__17 ;
    public final void rule__Joint__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2412:1: ( rule__Joint__Group__16__Impl rule__Joint__Group__17 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2413:2: rule__Joint__Group__16__Impl rule__Joint__Group__17
            {
            pushFollow(FOLLOW_rule__Joint__Group__16__Impl_in_rule__Joint__Group__164928);
            rule__Joint__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__17_in_rule__Joint__Group__164931);
            rule__Joint__Group__17();

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
    // $ANTLR end "rule__Joint__Group__16"


    // $ANTLR start "rule__Joint__Group__16__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2420:1: rule__Joint__Group__16__Impl : ( 'dampViscous' ) ;
    public final void rule__Joint__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2424:1: ( ( 'dampViscous' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2425:1: ( 'dampViscous' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2425:1: ( 'dampViscous' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2426:1: 'dampViscous'
            {
             before(grammarAccess.getJointAccess().getDampViscousKeyword_16()); 
            match(input,40,FOLLOW_40_in_rule__Joint__Group__16__Impl4959); 
             after(grammarAccess.getJointAccess().getDampViscousKeyword_16()); 

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
    // $ANTLR end "rule__Joint__Group__16__Impl"


    // $ANTLR start "rule__Joint__Group__17"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2439:1: rule__Joint__Group__17 : rule__Joint__Group__17__Impl rule__Joint__Group__18 ;
    public final void rule__Joint__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2443:1: ( rule__Joint__Group__17__Impl rule__Joint__Group__18 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2444:2: rule__Joint__Group__17__Impl rule__Joint__Group__18
            {
            pushFollow(FOLLOW_rule__Joint__Group__17__Impl_in_rule__Joint__Group__174990);
            rule__Joint__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__18_in_rule__Joint__Group__174993);
            rule__Joint__Group__18();

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
    // $ANTLR end "rule__Joint__Group__17"


    // $ANTLR start "rule__Joint__Group__17__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2451:1: rule__Joint__Group__17__Impl : ( ( rule__Joint__DampViscousAssignment_17 ) ) ;
    public final void rule__Joint__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2455:1: ( ( ( rule__Joint__DampViscousAssignment_17 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2456:1: ( ( rule__Joint__DampViscousAssignment_17 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2456:1: ( ( rule__Joint__DampViscousAssignment_17 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2457:1: ( rule__Joint__DampViscousAssignment_17 )
            {
             before(grammarAccess.getJointAccess().getDampViscousAssignment_17()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2458:1: ( rule__Joint__DampViscousAssignment_17 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2458:2: rule__Joint__DampViscousAssignment_17
            {
            pushFollow(FOLLOW_rule__Joint__DampViscousAssignment_17_in_rule__Joint__Group__17__Impl5020);
            rule__Joint__DampViscousAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getDampViscousAssignment_17()); 

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
    // $ANTLR end "rule__Joint__Group__17__Impl"


    // $ANTLR start "rule__Joint__Group__18"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2468:1: rule__Joint__Group__18 : rule__Joint__Group__18__Impl rule__Joint__Group__19 ;
    public final void rule__Joint__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2472:1: ( rule__Joint__Group__18__Impl rule__Joint__Group__19 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2473:2: rule__Joint__Group__18__Impl rule__Joint__Group__19
            {
            pushFollow(FOLLOW_rule__Joint__Group__18__Impl_in_rule__Joint__Group__185050);
            rule__Joint__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__19_in_rule__Joint__Group__185053);
            rule__Joint__Group__19();

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
    // $ANTLR end "rule__Joint__Group__18"


    // $ANTLR start "rule__Joint__Group__18__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2480:1: rule__Joint__Group__18__Impl : ( 'dampCoulomb' ) ;
    public final void rule__Joint__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2484:1: ( ( 'dampCoulomb' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2485:1: ( 'dampCoulomb' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2485:1: ( 'dampCoulomb' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2486:1: 'dampCoulomb'
            {
             before(grammarAccess.getJointAccess().getDampCoulombKeyword_18()); 
            match(input,41,FOLLOW_41_in_rule__Joint__Group__18__Impl5081); 
             after(grammarAccess.getJointAccess().getDampCoulombKeyword_18()); 

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
    // $ANTLR end "rule__Joint__Group__18__Impl"


    // $ANTLR start "rule__Joint__Group__19"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2499:1: rule__Joint__Group__19 : rule__Joint__Group__19__Impl rule__Joint__Group__20 ;
    public final void rule__Joint__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2503:1: ( rule__Joint__Group__19__Impl rule__Joint__Group__20 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2504:2: rule__Joint__Group__19__Impl rule__Joint__Group__20
            {
            pushFollow(FOLLOW_rule__Joint__Group__19__Impl_in_rule__Joint__Group__195112);
            rule__Joint__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__20_in_rule__Joint__Group__195115);
            rule__Joint__Group__20();

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
    // $ANTLR end "rule__Joint__Group__19"


    // $ANTLR start "rule__Joint__Group__19__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2511:1: rule__Joint__Group__19__Impl : ( ( rule__Joint__DampCoulombAssignment_19 ) ) ;
    public final void rule__Joint__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2515:1: ( ( ( rule__Joint__DampCoulombAssignment_19 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2516:1: ( ( rule__Joint__DampCoulombAssignment_19 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2516:1: ( ( rule__Joint__DampCoulombAssignment_19 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2517:1: ( rule__Joint__DampCoulombAssignment_19 )
            {
             before(grammarAccess.getJointAccess().getDampCoulombAssignment_19()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2518:1: ( rule__Joint__DampCoulombAssignment_19 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2518:2: rule__Joint__DampCoulombAssignment_19
            {
            pushFollow(FOLLOW_rule__Joint__DampCoulombAssignment_19_in_rule__Joint__Group__19__Impl5142);
            rule__Joint__DampCoulombAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getDampCoulombAssignment_19()); 

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
    // $ANTLR end "rule__Joint__Group__19__Impl"


    // $ANTLR start "rule__Joint__Group__20"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2528:1: rule__Joint__Group__20 : rule__Joint__Group__20__Impl ;
    public final void rule__Joint__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2532:1: ( rule__Joint__Group__20__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2533:2: rule__Joint__Group__20__Impl
            {
            pushFollow(FOLLOW_rule__Joint__Group__20__Impl_in_rule__Joint__Group__205172);
            rule__Joint__Group__20__Impl();

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
    // $ANTLR end "rule__Joint__Group__20"


    // $ANTLR start "rule__Joint__Group__20__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2539:1: rule__Joint__Group__20__Impl : ( '}' ) ;
    public final void rule__Joint__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2543:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2544:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2544:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2545:1: '}'
            {
             before(grammarAccess.getJointAccess().getRightCurlyBracketKeyword_20()); 
            match(input,26,FOLLOW_26_in_rule__Joint__Group__20__Impl5200); 
             after(grammarAccess.getJointAccess().getRightCurlyBracketKeyword_20()); 

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
    // $ANTLR end "rule__Joint__Group__20__Impl"


    // $ANTLR start "rule__JointType__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2600:1: rule__JointType__Group__0 : rule__JointType__Group__0__Impl rule__JointType__Group__1 ;
    public final void rule__JointType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2604:1: ( rule__JointType__Group__0__Impl rule__JointType__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2605:2: rule__JointType__Group__0__Impl rule__JointType__Group__1
            {
            pushFollow(FOLLOW_rule__JointType__Group__0__Impl_in_rule__JointType__Group__05273);
            rule__JointType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointType__Group__1_in_rule__JointType__Group__05276);
            rule__JointType__Group__1();

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
    // $ANTLR end "rule__JointType__Group__0"


    // $ANTLR start "rule__JointType__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2612:1: rule__JointType__Group__0__Impl : ( ( rule__JointType__Group_0__0 )? ) ;
    public final void rule__JointType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2616:1: ( ( ( rule__JointType__Group_0__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2617:1: ( ( rule__JointType__Group_0__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2617:1: ( ( rule__JointType__Group_0__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2618:1: ( rule__JointType__Group_0__0 )?
            {
             before(grammarAccess.getJointTypeAccess().getGroup_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2619:1: ( rule__JointType__Group_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2619:2: rule__JointType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JointType__Group_0__0_in_rule__JointType__Group__0__Impl5303);
                    rule__JointType__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointTypeAccess().getGroup_0()); 

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
    // $ANTLR end "rule__JointType__Group__0__Impl"


    // $ANTLR start "rule__JointType__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2629:1: rule__JointType__Group__1 : rule__JointType__Group__1__Impl ;
    public final void rule__JointType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2633:1: ( rule__JointType__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2634:2: rule__JointType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__JointType__Group__1__Impl_in_rule__JointType__Group__15334);
            rule__JointType__Group__1__Impl();

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
    // $ANTLR end "rule__JointType__Group__1"


    // $ANTLR start "rule__JointType__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2640:1: rule__JointType__Group__1__Impl : ( ( rule__JointType__ExpAssignment_1 ) ) ;
    public final void rule__JointType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2644:1: ( ( ( rule__JointType__ExpAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2645:1: ( ( rule__JointType__ExpAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2645:1: ( ( rule__JointType__ExpAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2646:1: ( rule__JointType__ExpAssignment_1 )
            {
             before(grammarAccess.getJointTypeAccess().getExpAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2647:1: ( rule__JointType__ExpAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2647:2: rule__JointType__ExpAssignment_1
            {
            pushFollow(FOLLOW_rule__JointType__ExpAssignment_1_in_rule__JointType__Group__1__Impl5361);
            rule__JointType__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeAccess().getExpAssignment_1()); 

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
    // $ANTLR end "rule__JointType__Group__1__Impl"


    // $ANTLR start "rule__JointType__Group_0__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2661:1: rule__JointType__Group_0__0 : rule__JointType__Group_0__0__Impl rule__JointType__Group_0__1 ;
    public final void rule__JointType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2665:1: ( rule__JointType__Group_0__0__Impl rule__JointType__Group_0__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2666:2: rule__JointType__Group_0__0__Impl rule__JointType__Group_0__1
            {
            pushFollow(FOLLOW_rule__JointType__Group_0__0__Impl_in_rule__JointType__Group_0__05395);
            rule__JointType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointType__Group_0__1_in_rule__JointType__Group_0__05398);
            rule__JointType__Group_0__1();

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
    // $ANTLR end "rule__JointType__Group_0__0"


    // $ANTLR start "rule__JointType__Group_0__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2673:1: rule__JointType__Group_0__0__Impl : ( 'joint' ) ;
    public final void rule__JointType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2677:1: ( ( 'joint' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2678:1: ( 'joint' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2678:1: ( 'joint' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2679:1: 'joint'
            {
             before(grammarAccess.getJointTypeAccess().getJointKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__JointType__Group_0__0__Impl5426); 
             after(grammarAccess.getJointTypeAccess().getJointKeyword_0_0()); 

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
    // $ANTLR end "rule__JointType__Group_0__0__Impl"


    // $ANTLR start "rule__JointType__Group_0__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2692:1: rule__JointType__Group_0__1 : rule__JointType__Group_0__1__Impl rule__JointType__Group_0__2 ;
    public final void rule__JointType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2696:1: ( rule__JointType__Group_0__1__Impl rule__JointType__Group_0__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2697:2: rule__JointType__Group_0__1__Impl rule__JointType__Group_0__2
            {
            pushFollow(FOLLOW_rule__JointType__Group_0__1__Impl_in_rule__JointType__Group_0__15457);
            rule__JointType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointType__Group_0__2_in_rule__JointType__Group_0__15460);
            rule__JointType__Group_0__2();

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
    // $ANTLR end "rule__JointType__Group_0__1"


    // $ANTLR start "rule__JointType__Group_0__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2704:1: rule__JointType__Group_0__1__Impl : ( 'type' ) ;
    public final void rule__JointType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2708:1: ( ( 'type' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2709:1: ( 'type' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2709:1: ( 'type' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2710:1: 'type'
            {
             before(grammarAccess.getJointTypeAccess().getTypeKeyword_0_1()); 
            match(input,42,FOLLOW_42_in_rule__JointType__Group_0__1__Impl5488); 
             after(grammarAccess.getJointTypeAccess().getTypeKeyword_0_1()); 

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
    // $ANTLR end "rule__JointType__Group_0__1__Impl"


    // $ANTLR start "rule__JointType__Group_0__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2723:1: rule__JointType__Group_0__2 : rule__JointType__Group_0__2__Impl ;
    public final void rule__JointType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2727:1: ( rule__JointType__Group_0__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2728:2: rule__JointType__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__JointType__Group_0__2__Impl_in_rule__JointType__Group_0__25519);
            rule__JointType__Group_0__2__Impl();

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
    // $ANTLR end "rule__JointType__Group_0__2"


    // $ANTLR start "rule__JointType__Group_0__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2734:1: rule__JointType__Group_0__2__Impl : ( ( rule__JointType__NameAssignment_0_2 ) ) ;
    public final void rule__JointType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2738:1: ( ( ( rule__JointType__NameAssignment_0_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2739:1: ( ( rule__JointType__NameAssignment_0_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2739:1: ( ( rule__JointType__NameAssignment_0_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2740:1: ( rule__JointType__NameAssignment_0_2 )
            {
             before(grammarAccess.getJointTypeAccess().getNameAssignment_0_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2741:1: ( rule__JointType__NameAssignment_0_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2741:2: rule__JointType__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__JointType__NameAssignment_0_2_in_rule__JointType__Group_0__2__Impl5546);
            rule__JointType__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeAccess().getNameAssignment_0_2()); 

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
    // $ANTLR end "rule__JointType__Group_0__2__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_1__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2757:1: rule__JointTypeExpression__Group_1__0 : rule__JointTypeExpression__Group_1__0__Impl rule__JointTypeExpression__Group_1__1 ;
    public final void rule__JointTypeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2761:1: ( rule__JointTypeExpression__Group_1__0__Impl rule__JointTypeExpression__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2762:2: rule__JointTypeExpression__Group_1__0__Impl rule__JointTypeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__0__Impl_in_rule__JointTypeExpression__Group_1__05582);
            rule__JointTypeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__1_in_rule__JointTypeExpression__Group_1__05585);
            rule__JointTypeExpression__Group_1__1();

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
    // $ANTLR end "rule__JointTypeExpression__Group_1__0"


    // $ANTLR start "rule__JointTypeExpression__Group_1__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2769:1: rule__JointTypeExpression__Group_1__0__Impl : ( 'revolute' ) ;
    public final void rule__JointTypeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2773:1: ( ( 'revolute' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2774:1: ( 'revolute' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2774:1: ( 'revolute' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2775:1: 'revolute'
            {
             before(grammarAccess.getJointTypeExpressionAccess().getRevoluteKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__JointTypeExpression__Group_1__0__Impl5613); 
             after(grammarAccess.getJointTypeExpressionAccess().getRevoluteKeyword_1_0()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_1__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2788:1: rule__JointTypeExpression__Group_1__1 : rule__JointTypeExpression__Group_1__1__Impl rule__JointTypeExpression__Group_1__2 ;
    public final void rule__JointTypeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2792:1: ( rule__JointTypeExpression__Group_1__1__Impl rule__JointTypeExpression__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2793:2: rule__JointTypeExpression__Group_1__1__Impl rule__JointTypeExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__1__Impl_in_rule__JointTypeExpression__Group_1__15644);
            rule__JointTypeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__2_in_rule__JointTypeExpression__Group_1__15647);
            rule__JointTypeExpression__Group_1__2();

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
    // $ANTLR end "rule__JointTypeExpression__Group_1__1"


    // $ANTLR start "rule__JointTypeExpression__Group_1__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2800:1: rule__JointTypeExpression__Group_1__1__Impl : ( '(' ) ;
    public final void rule__JointTypeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2804:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2805:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2805:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2806:1: '('
            {
             before(grammarAccess.getJointTypeExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,44,FOLLOW_44_in_rule__JointTypeExpression__Group_1__1__Impl5675); 
             after(grammarAccess.getJointTypeExpressionAccess().getLeftParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_1__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2819:1: rule__JointTypeExpression__Group_1__2 : rule__JointTypeExpression__Group_1__2__Impl rule__JointTypeExpression__Group_1__3 ;
    public final void rule__JointTypeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2823:1: ( rule__JointTypeExpression__Group_1__2__Impl rule__JointTypeExpression__Group_1__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2824:2: rule__JointTypeExpression__Group_1__2__Impl rule__JointTypeExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__2__Impl_in_rule__JointTypeExpression__Group_1__25706);
            rule__JointTypeExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__3_in_rule__JointTypeExpression__Group_1__25709);
            rule__JointTypeExpression__Group_1__3();

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
    // $ANTLR end "rule__JointTypeExpression__Group_1__2"


    // $ANTLR start "rule__JointTypeExpression__Group_1__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2831:1: rule__JointTypeExpression__Group_1__2__Impl : ( ( rule__JointTypeExpression__AxisAssignment_1_2 ) ) ;
    public final void rule__JointTypeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2835:1: ( ( ( rule__JointTypeExpression__AxisAssignment_1_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2836:1: ( ( rule__JointTypeExpression__AxisAssignment_1_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2836:1: ( ( rule__JointTypeExpression__AxisAssignment_1_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2837:1: ( rule__JointTypeExpression__AxisAssignment_1_2 )
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2838:1: ( rule__JointTypeExpression__AxisAssignment_1_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2838:2: rule__JointTypeExpression__AxisAssignment_1_2
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__AxisAssignment_1_2_in_rule__JointTypeExpression__Group_1__2__Impl5736);
            rule__JointTypeExpression__AxisAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_1_2()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_1__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2848:1: rule__JointTypeExpression__Group_1__3 : rule__JointTypeExpression__Group_1__3__Impl rule__JointTypeExpression__Group_1__4 ;
    public final void rule__JointTypeExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2852:1: ( rule__JointTypeExpression__Group_1__3__Impl rule__JointTypeExpression__Group_1__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2853:2: rule__JointTypeExpression__Group_1__3__Impl rule__JointTypeExpression__Group_1__4
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__3__Impl_in_rule__JointTypeExpression__Group_1__35766);
            rule__JointTypeExpression__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__4_in_rule__JointTypeExpression__Group_1__35769);
            rule__JointTypeExpression__Group_1__4();

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
    // $ANTLR end "rule__JointTypeExpression__Group_1__3"


    // $ANTLR start "rule__JointTypeExpression__Group_1__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2860:1: rule__JointTypeExpression__Group_1__3__Impl : ( ( rule__JointTypeExpression__Group_1_3__0 )* ) ;
    public final void rule__JointTypeExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2864:1: ( ( ( rule__JointTypeExpression__Group_1_3__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2865:1: ( ( rule__JointTypeExpression__Group_1_3__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2865:1: ( ( rule__JointTypeExpression__Group_1_3__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2866:1: ( rule__JointTypeExpression__Group_1_3__0 )*
            {
             before(grammarAccess.getJointTypeExpressionAccess().getGroup_1_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2867:1: ( rule__JointTypeExpression__Group_1_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==46) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2867:2: rule__JointTypeExpression__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__JointTypeExpression__Group_1_3__0_in_rule__JointTypeExpression__Group_1__3__Impl5796);
            	    rule__JointTypeExpression__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getJointTypeExpressionAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_1__3__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_1__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2877:1: rule__JointTypeExpression__Group_1__4 : rule__JointTypeExpression__Group_1__4__Impl ;
    public final void rule__JointTypeExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2881:1: ( rule__JointTypeExpression__Group_1__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2882:2: rule__JointTypeExpression__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__4__Impl_in_rule__JointTypeExpression__Group_1__45827);
            rule__JointTypeExpression__Group_1__4__Impl();

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
    // $ANTLR end "rule__JointTypeExpression__Group_1__4"


    // $ANTLR start "rule__JointTypeExpression__Group_1__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2888:1: rule__JointTypeExpression__Group_1__4__Impl : ( ')' ) ;
    public final void rule__JointTypeExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2892:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2893:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2893:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2894:1: ')'
            {
             before(grammarAccess.getJointTypeExpressionAccess().getRightParenthesisKeyword_1_4()); 
            match(input,45,FOLLOW_45_in_rule__JointTypeExpression__Group_1__4__Impl5855); 
             after(grammarAccess.getJointTypeExpressionAccess().getRightParenthesisKeyword_1_4()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_1__4__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_1_3__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2917:1: rule__JointTypeExpression__Group_1_3__0 : rule__JointTypeExpression__Group_1_3__0__Impl rule__JointTypeExpression__Group_1_3__1 ;
    public final void rule__JointTypeExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2921:1: ( rule__JointTypeExpression__Group_1_3__0__Impl rule__JointTypeExpression__Group_1_3__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2922:2: rule__JointTypeExpression__Group_1_3__0__Impl rule__JointTypeExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1_3__0__Impl_in_rule__JointTypeExpression__Group_1_3__05896);
            rule__JointTypeExpression__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1_3__1_in_rule__JointTypeExpression__Group_1_3__05899);
            rule__JointTypeExpression__Group_1_3__1();

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
    // $ANTLR end "rule__JointTypeExpression__Group_1_3__0"


    // $ANTLR start "rule__JointTypeExpression__Group_1_3__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2929:1: rule__JointTypeExpression__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__JointTypeExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2933:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2934:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2934:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2935:1: ','
            {
             before(grammarAccess.getJointTypeExpressionAccess().getCommaKeyword_1_3_0()); 
            match(input,46,FOLLOW_46_in_rule__JointTypeExpression__Group_1_3__0__Impl5927); 
             after(grammarAccess.getJointTypeExpressionAccess().getCommaKeyword_1_3_0()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_1_3__0__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_1_3__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2948:1: rule__JointTypeExpression__Group_1_3__1 : rule__JointTypeExpression__Group_1_3__1__Impl ;
    public final void rule__JointTypeExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2952:1: ( rule__JointTypeExpression__Group_1_3__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2953:2: rule__JointTypeExpression__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1_3__1__Impl_in_rule__JointTypeExpression__Group_1_3__15958);
            rule__JointTypeExpression__Group_1_3__1__Impl();

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
    // $ANTLR end "rule__JointTypeExpression__Group_1_3__1"


    // $ANTLR start "rule__JointTypeExpression__Group_1_3__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2959:1: rule__JointTypeExpression__Group_1_3__1__Impl : ( ( rule__JointTypeExpression__AxisAssignment_1_3_1 ) ) ;
    public final void rule__JointTypeExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2963:1: ( ( ( rule__JointTypeExpression__AxisAssignment_1_3_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2964:1: ( ( rule__JointTypeExpression__AxisAssignment_1_3_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2964:1: ( ( rule__JointTypeExpression__AxisAssignment_1_3_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2965:1: ( rule__JointTypeExpression__AxisAssignment_1_3_1 )
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_1_3_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2966:1: ( rule__JointTypeExpression__AxisAssignment_1_3_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2966:2: rule__JointTypeExpression__AxisAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__AxisAssignment_1_3_1_in_rule__JointTypeExpression__Group_1_3__1__Impl5985);
            rule__JointTypeExpression__AxisAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_1_3_1()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_1_3__1__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_2__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2980:1: rule__JointTypeExpression__Group_2__0 : rule__JointTypeExpression__Group_2__0__Impl rule__JointTypeExpression__Group_2__1 ;
    public final void rule__JointTypeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2984:1: ( rule__JointTypeExpression__Group_2__0__Impl rule__JointTypeExpression__Group_2__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2985:2: rule__JointTypeExpression__Group_2__0__Impl rule__JointTypeExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__0__Impl_in_rule__JointTypeExpression__Group_2__06019);
            rule__JointTypeExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__1_in_rule__JointTypeExpression__Group_2__06022);
            rule__JointTypeExpression__Group_2__1();

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
    // $ANTLR end "rule__JointTypeExpression__Group_2__0"


    // $ANTLR start "rule__JointTypeExpression__Group_2__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2992:1: rule__JointTypeExpression__Group_2__0__Impl : ( 'planar' ) ;
    public final void rule__JointTypeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2996:1: ( ( 'planar' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2997:1: ( 'planar' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2997:1: ( 'planar' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2998:1: 'planar'
            {
             before(grammarAccess.getJointTypeExpressionAccess().getPlanarKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__JointTypeExpression__Group_2__0__Impl6050); 
             after(grammarAccess.getJointTypeExpressionAccess().getPlanarKeyword_2_0()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_2__0__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_2__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3011:1: rule__JointTypeExpression__Group_2__1 : rule__JointTypeExpression__Group_2__1__Impl rule__JointTypeExpression__Group_2__2 ;
    public final void rule__JointTypeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3015:1: ( rule__JointTypeExpression__Group_2__1__Impl rule__JointTypeExpression__Group_2__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3016:2: rule__JointTypeExpression__Group_2__1__Impl rule__JointTypeExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__1__Impl_in_rule__JointTypeExpression__Group_2__16081);
            rule__JointTypeExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__2_in_rule__JointTypeExpression__Group_2__16084);
            rule__JointTypeExpression__Group_2__2();

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
    // $ANTLR end "rule__JointTypeExpression__Group_2__1"


    // $ANTLR start "rule__JointTypeExpression__Group_2__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3023:1: rule__JointTypeExpression__Group_2__1__Impl : ( '(' ) ;
    public final void rule__JointTypeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3027:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3028:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3028:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3029:1: '('
            {
             before(grammarAccess.getJointTypeExpressionAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,44,FOLLOW_44_in_rule__JointTypeExpression__Group_2__1__Impl6112); 
             after(grammarAccess.getJointTypeExpressionAccess().getLeftParenthesisKeyword_2_1()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_2__1__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_2__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3042:1: rule__JointTypeExpression__Group_2__2 : rule__JointTypeExpression__Group_2__2__Impl rule__JointTypeExpression__Group_2__3 ;
    public final void rule__JointTypeExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3046:1: ( rule__JointTypeExpression__Group_2__2__Impl rule__JointTypeExpression__Group_2__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3047:2: rule__JointTypeExpression__Group_2__2__Impl rule__JointTypeExpression__Group_2__3
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__2__Impl_in_rule__JointTypeExpression__Group_2__26143);
            rule__JointTypeExpression__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__3_in_rule__JointTypeExpression__Group_2__26146);
            rule__JointTypeExpression__Group_2__3();

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
    // $ANTLR end "rule__JointTypeExpression__Group_2__2"


    // $ANTLR start "rule__JointTypeExpression__Group_2__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3054:1: rule__JointTypeExpression__Group_2__2__Impl : ( ( rule__JointTypeExpression__AxisAssignment_2_2 ) ) ;
    public final void rule__JointTypeExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3058:1: ( ( ( rule__JointTypeExpression__AxisAssignment_2_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3059:1: ( ( rule__JointTypeExpression__AxisAssignment_2_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3059:1: ( ( rule__JointTypeExpression__AxisAssignment_2_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3060:1: ( rule__JointTypeExpression__AxisAssignment_2_2 )
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_2_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3061:1: ( rule__JointTypeExpression__AxisAssignment_2_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3061:2: rule__JointTypeExpression__AxisAssignment_2_2
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__AxisAssignment_2_2_in_rule__JointTypeExpression__Group_2__2__Impl6173);
            rule__JointTypeExpression__AxisAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_2_2()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_2__2__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_2__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3071:1: rule__JointTypeExpression__Group_2__3 : rule__JointTypeExpression__Group_2__3__Impl rule__JointTypeExpression__Group_2__4 ;
    public final void rule__JointTypeExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3075:1: ( rule__JointTypeExpression__Group_2__3__Impl rule__JointTypeExpression__Group_2__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3076:2: rule__JointTypeExpression__Group_2__3__Impl rule__JointTypeExpression__Group_2__4
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__3__Impl_in_rule__JointTypeExpression__Group_2__36203);
            rule__JointTypeExpression__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__4_in_rule__JointTypeExpression__Group_2__36206);
            rule__JointTypeExpression__Group_2__4();

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
    // $ANTLR end "rule__JointTypeExpression__Group_2__3"


    // $ANTLR start "rule__JointTypeExpression__Group_2__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3083:1: rule__JointTypeExpression__Group_2__3__Impl : ( ( rule__JointTypeExpression__Group_2_3__0 )* ) ;
    public final void rule__JointTypeExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3087:1: ( ( ( rule__JointTypeExpression__Group_2_3__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3088:1: ( ( rule__JointTypeExpression__Group_2_3__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3088:1: ( ( rule__JointTypeExpression__Group_2_3__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3089:1: ( rule__JointTypeExpression__Group_2_3__0 )*
            {
             before(grammarAccess.getJointTypeExpressionAccess().getGroup_2_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3090:1: ( rule__JointTypeExpression__Group_2_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3090:2: rule__JointTypeExpression__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_rule__JointTypeExpression__Group_2_3__0_in_rule__JointTypeExpression__Group_2__3__Impl6233);
            	    rule__JointTypeExpression__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getJointTypeExpressionAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_2__3__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_2__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3100:1: rule__JointTypeExpression__Group_2__4 : rule__JointTypeExpression__Group_2__4__Impl ;
    public final void rule__JointTypeExpression__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3104:1: ( rule__JointTypeExpression__Group_2__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3105:2: rule__JointTypeExpression__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__4__Impl_in_rule__JointTypeExpression__Group_2__46264);
            rule__JointTypeExpression__Group_2__4__Impl();

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
    // $ANTLR end "rule__JointTypeExpression__Group_2__4"


    // $ANTLR start "rule__JointTypeExpression__Group_2__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3111:1: rule__JointTypeExpression__Group_2__4__Impl : ( ')' ) ;
    public final void rule__JointTypeExpression__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3115:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3116:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3116:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3117:1: ')'
            {
             before(grammarAccess.getJointTypeExpressionAccess().getRightParenthesisKeyword_2_4()); 
            match(input,45,FOLLOW_45_in_rule__JointTypeExpression__Group_2__4__Impl6292); 
             after(grammarAccess.getJointTypeExpressionAccess().getRightParenthesisKeyword_2_4()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_2__4__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_2_3__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3140:1: rule__JointTypeExpression__Group_2_3__0 : rule__JointTypeExpression__Group_2_3__0__Impl rule__JointTypeExpression__Group_2_3__1 ;
    public final void rule__JointTypeExpression__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3144:1: ( rule__JointTypeExpression__Group_2_3__0__Impl rule__JointTypeExpression__Group_2_3__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3145:2: rule__JointTypeExpression__Group_2_3__0__Impl rule__JointTypeExpression__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2_3__0__Impl_in_rule__JointTypeExpression__Group_2_3__06333);
            rule__JointTypeExpression__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2_3__1_in_rule__JointTypeExpression__Group_2_3__06336);
            rule__JointTypeExpression__Group_2_3__1();

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
    // $ANTLR end "rule__JointTypeExpression__Group_2_3__0"


    // $ANTLR start "rule__JointTypeExpression__Group_2_3__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3152:1: rule__JointTypeExpression__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__JointTypeExpression__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3156:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3157:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3157:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3158:1: ','
            {
             before(grammarAccess.getJointTypeExpressionAccess().getCommaKeyword_2_3_0()); 
            match(input,46,FOLLOW_46_in_rule__JointTypeExpression__Group_2_3__0__Impl6364); 
             after(grammarAccess.getJointTypeExpressionAccess().getCommaKeyword_2_3_0()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_2_3__0__Impl"


    // $ANTLR start "rule__JointTypeExpression__Group_2_3__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3171:1: rule__JointTypeExpression__Group_2_3__1 : rule__JointTypeExpression__Group_2_3__1__Impl ;
    public final void rule__JointTypeExpression__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3175:1: ( rule__JointTypeExpression__Group_2_3__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3176:2: rule__JointTypeExpression__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2_3__1__Impl_in_rule__JointTypeExpression__Group_2_3__16395);
            rule__JointTypeExpression__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__JointTypeExpression__Group_2_3__1"


    // $ANTLR start "rule__JointTypeExpression__Group_2_3__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3182:1: rule__JointTypeExpression__Group_2_3__1__Impl : ( ( rule__JointTypeExpression__AxisAssignment_2_3_1 ) ) ;
    public final void rule__JointTypeExpression__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3186:1: ( ( ( rule__JointTypeExpression__AxisAssignment_2_3_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3187:1: ( ( rule__JointTypeExpression__AxisAssignment_2_3_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3187:1: ( ( rule__JointTypeExpression__AxisAssignment_2_3_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3188:1: ( rule__JointTypeExpression__AxisAssignment_2_3_1 )
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_2_3_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3189:1: ( rule__JointTypeExpression__AxisAssignment_2_3_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3189:2: rule__JointTypeExpression__AxisAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__AxisAssignment_2_3_1_in_rule__JointTypeExpression__Group_2_3__1__Impl6422);
            rule__JointTypeExpression__AxisAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_2_3_1()); 

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
    // $ANTLR end "rule__JointTypeExpression__Group_2_3__1__Impl"


    // $ANTLR start "rule__RelativeTransformation__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3203:1: rule__RelativeTransformation__Group__0 : rule__RelativeTransformation__Group__0__Impl rule__RelativeTransformation__Group__1 ;
    public final void rule__RelativeTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3207:1: ( rule__RelativeTransformation__Group__0__Impl rule__RelativeTransformation__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3208:2: rule__RelativeTransformation__Group__0__Impl rule__RelativeTransformation__Group__1
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__0__Impl_in_rule__RelativeTransformation__Group__06456);
            rule__RelativeTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__1_in_rule__RelativeTransformation__Group__06459);
            rule__RelativeTransformation__Group__1();

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
    // $ANTLR end "rule__RelativeTransformation__Group__0"


    // $ANTLR start "rule__RelativeTransformation__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3215:1: rule__RelativeTransformation__Group__0__Impl : ( '(' ) ;
    public final void rule__RelativeTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3219:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3220:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3220:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3221:1: '('
            {
             before(grammarAccess.getRelativeTransformationAccess().getLeftParenthesisKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__RelativeTransformation__Group__0__Impl6487); 
             after(grammarAccess.getRelativeTransformationAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__RelativeTransformation__Group__0__Impl"


    // $ANTLR start "rule__RelativeTransformation__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3234:1: rule__RelativeTransformation__Group__1 : rule__RelativeTransformation__Group__1__Impl rule__RelativeTransformation__Group__2 ;
    public final void rule__RelativeTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3238:1: ( rule__RelativeTransformation__Group__1__Impl rule__RelativeTransformation__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3239:2: rule__RelativeTransformation__Group__1__Impl rule__RelativeTransformation__Group__2
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__1__Impl_in_rule__RelativeTransformation__Group__16518);
            rule__RelativeTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__2_in_rule__RelativeTransformation__Group__16521);
            rule__RelativeTransformation__Group__2();

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
    // $ANTLR end "rule__RelativeTransformation__Group__1"


    // $ANTLR start "rule__RelativeTransformation__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3246:1: rule__RelativeTransformation__Group__1__Impl : ( 'with' ) ;
    public final void rule__RelativeTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3250:1: ( ( 'with' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3251:1: ( 'with' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3251:1: ( 'with' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3252:1: 'with'
            {
             before(grammarAccess.getRelativeTransformationAccess().getWithKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__RelativeTransformation__Group__1__Impl6549); 
             after(grammarAccess.getRelativeTransformationAccess().getWithKeyword_1()); 

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
    // $ANTLR end "rule__RelativeTransformation__Group__1__Impl"


    // $ANTLR start "rule__RelativeTransformation__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3265:1: rule__RelativeTransformation__Group__2 : rule__RelativeTransformation__Group__2__Impl rule__RelativeTransformation__Group__3 ;
    public final void rule__RelativeTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3269:1: ( rule__RelativeTransformation__Group__2__Impl rule__RelativeTransformation__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3270:2: rule__RelativeTransformation__Group__2__Impl rule__RelativeTransformation__Group__3
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__2__Impl_in_rule__RelativeTransformation__Group__26580);
            rule__RelativeTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__3_in_rule__RelativeTransformation__Group__26583);
            rule__RelativeTransformation__Group__3();

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
    // $ANTLR end "rule__RelativeTransformation__Group__2"


    // $ANTLR start "rule__RelativeTransformation__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3277:1: rule__RelativeTransformation__Group__2__Impl : ( 'relative' ) ;
    public final void rule__RelativeTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3281:1: ( ( 'relative' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3282:1: ( 'relative' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3282:1: ( 'relative' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3283:1: 'relative'
            {
             before(grammarAccess.getRelativeTransformationAccess().getRelativeKeyword_2()); 
            match(input,49,FOLLOW_49_in_rule__RelativeTransformation__Group__2__Impl6611); 
             after(grammarAccess.getRelativeTransformationAccess().getRelativeKeyword_2()); 

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
    // $ANTLR end "rule__RelativeTransformation__Group__2__Impl"


    // $ANTLR start "rule__RelativeTransformation__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3296:1: rule__RelativeTransformation__Group__3 : rule__RelativeTransformation__Group__3__Impl rule__RelativeTransformation__Group__4 ;
    public final void rule__RelativeTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3300:1: ( rule__RelativeTransformation__Group__3__Impl rule__RelativeTransformation__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3301:2: rule__RelativeTransformation__Group__3__Impl rule__RelativeTransformation__Group__4
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__3__Impl_in_rule__RelativeTransformation__Group__36642);
            rule__RelativeTransformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__4_in_rule__RelativeTransformation__Group__36645);
            rule__RelativeTransformation__Group__4();

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
    // $ANTLR end "rule__RelativeTransformation__Group__3"


    // $ANTLR start "rule__RelativeTransformation__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3308:1: rule__RelativeTransformation__Group__3__Impl : ( 'transformation' ) ;
    public final void rule__RelativeTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3312:1: ( ( 'transformation' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3313:1: ( 'transformation' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3313:1: ( 'transformation' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3314:1: 'transformation'
            {
             before(grammarAccess.getRelativeTransformationAccess().getTransformationKeyword_3()); 
            match(input,50,FOLLOW_50_in_rule__RelativeTransformation__Group__3__Impl6673); 
             after(grammarAccess.getRelativeTransformationAccess().getTransformationKeyword_3()); 

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
    // $ANTLR end "rule__RelativeTransformation__Group__3__Impl"


    // $ANTLR start "rule__RelativeTransformation__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3327:1: rule__RelativeTransformation__Group__4 : rule__RelativeTransformation__Group__4__Impl rule__RelativeTransformation__Group__5 ;
    public final void rule__RelativeTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3331:1: ( rule__RelativeTransformation__Group__4__Impl rule__RelativeTransformation__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3332:2: rule__RelativeTransformation__Group__4__Impl rule__RelativeTransformation__Group__5
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__4__Impl_in_rule__RelativeTransformation__Group__46704);
            rule__RelativeTransformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__5_in_rule__RelativeTransformation__Group__46707);
            rule__RelativeTransformation__Group__5();

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
    // $ANTLR end "rule__RelativeTransformation__Group__4"


    // $ANTLR start "rule__RelativeTransformation__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3339:1: rule__RelativeTransformation__Group__4__Impl : ( ( rule__RelativeTransformation__PositionAssignment_4 ) ) ;
    public final void rule__RelativeTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3343:1: ( ( ( rule__RelativeTransformation__PositionAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3344:1: ( ( rule__RelativeTransformation__PositionAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3344:1: ( ( rule__RelativeTransformation__PositionAssignment_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3345:1: ( rule__RelativeTransformation__PositionAssignment_4 )
            {
             before(grammarAccess.getRelativeTransformationAccess().getPositionAssignment_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3346:1: ( rule__RelativeTransformation__PositionAssignment_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3346:2: rule__RelativeTransformation__PositionAssignment_4
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__PositionAssignment_4_in_rule__RelativeTransformation__Group__4__Impl6734);
            rule__RelativeTransformation__PositionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelativeTransformationAccess().getPositionAssignment_4()); 

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
    // $ANTLR end "rule__RelativeTransformation__Group__4__Impl"


    // $ANTLR start "rule__RelativeTransformation__Group__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3356:1: rule__RelativeTransformation__Group__5 : rule__RelativeTransformation__Group__5__Impl rule__RelativeTransformation__Group__6 ;
    public final void rule__RelativeTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3360:1: ( rule__RelativeTransformation__Group__5__Impl rule__RelativeTransformation__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3361:2: rule__RelativeTransformation__Group__5__Impl rule__RelativeTransformation__Group__6
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__5__Impl_in_rule__RelativeTransformation__Group__56764);
            rule__RelativeTransformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__6_in_rule__RelativeTransformation__Group__56767);
            rule__RelativeTransformation__Group__6();

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
    // $ANTLR end "rule__RelativeTransformation__Group__5"


    // $ANTLR start "rule__RelativeTransformation__Group__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3368:1: rule__RelativeTransformation__Group__5__Impl : ( ',' ) ;
    public final void rule__RelativeTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3372:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3373:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3373:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3374:1: ','
            {
             before(grammarAccess.getRelativeTransformationAccess().getCommaKeyword_5()); 
            match(input,46,FOLLOW_46_in_rule__RelativeTransformation__Group__5__Impl6795); 
             after(grammarAccess.getRelativeTransformationAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__RelativeTransformation__Group__5__Impl"


    // $ANTLR start "rule__RelativeTransformation__Group__6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3387:1: rule__RelativeTransformation__Group__6 : rule__RelativeTransformation__Group__6__Impl rule__RelativeTransformation__Group__7 ;
    public final void rule__RelativeTransformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3391:1: ( rule__RelativeTransformation__Group__6__Impl rule__RelativeTransformation__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3392:2: rule__RelativeTransformation__Group__6__Impl rule__RelativeTransformation__Group__7
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__6__Impl_in_rule__RelativeTransformation__Group__66826);
            rule__RelativeTransformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__7_in_rule__RelativeTransformation__Group__66829);
            rule__RelativeTransformation__Group__7();

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
    // $ANTLR end "rule__RelativeTransformation__Group__6"


    // $ANTLR start "rule__RelativeTransformation__Group__6__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3399:1: rule__RelativeTransformation__Group__6__Impl : ( ( rule__RelativeTransformation__ReorientAssignment_6 ) ) ;
    public final void rule__RelativeTransformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3403:1: ( ( ( rule__RelativeTransformation__ReorientAssignment_6 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3404:1: ( ( rule__RelativeTransformation__ReorientAssignment_6 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3404:1: ( ( rule__RelativeTransformation__ReorientAssignment_6 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3405:1: ( rule__RelativeTransformation__ReorientAssignment_6 )
            {
             before(grammarAccess.getRelativeTransformationAccess().getReorientAssignment_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3406:1: ( rule__RelativeTransformation__ReorientAssignment_6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3406:2: rule__RelativeTransformation__ReorientAssignment_6
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__ReorientAssignment_6_in_rule__RelativeTransformation__Group__6__Impl6856);
            rule__RelativeTransformation__ReorientAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRelativeTransformationAccess().getReorientAssignment_6()); 

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
    // $ANTLR end "rule__RelativeTransformation__Group__6__Impl"


    // $ANTLR start "rule__RelativeTransformation__Group__7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3416:1: rule__RelativeTransformation__Group__7 : rule__RelativeTransformation__Group__7__Impl ;
    public final void rule__RelativeTransformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3420:1: ( rule__RelativeTransformation__Group__7__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3421:2: rule__RelativeTransformation__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__7__Impl_in_rule__RelativeTransformation__Group__76886);
            rule__RelativeTransformation__Group__7__Impl();

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
    // $ANTLR end "rule__RelativeTransformation__Group__7"


    // $ANTLR start "rule__RelativeTransformation__Group__7__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3427:1: rule__RelativeTransformation__Group__7__Impl : ( ')' ) ;
    public final void rule__RelativeTransformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3431:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3432:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3432:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3433:1: ')'
            {
             before(grammarAccess.getRelativeTransformationAccess().getRightParenthesisKeyword_7()); 
            match(input,45,FOLLOW_45_in_rule__RelativeTransformation__Group__7__Impl6914); 
             after(grammarAccess.getRelativeTransformationAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__RelativeTransformation__Group__7__Impl"


    // $ANTLR start "rule__Reorientation__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3462:1: rule__Reorientation__Group__0 : rule__Reorientation__Group__0__Impl rule__Reorientation__Group__1 ;
    public final void rule__Reorientation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3466:1: ( rule__Reorientation__Group__0__Impl rule__Reorientation__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3467:2: rule__Reorientation__Group__0__Impl rule__Reorientation__Group__1
            {
            pushFollow(FOLLOW_rule__Reorientation__Group__0__Impl_in_rule__Reorientation__Group__06961);
            rule__Reorientation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reorientation__Group__1_in_rule__Reorientation__Group__06964);
            rule__Reorientation__Group__1();

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
    // $ANTLR end "rule__Reorientation__Group__0"


    // $ANTLR start "rule__Reorientation__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3474:1: rule__Reorientation__Group__0__Impl : ( ( rule__Reorientation__Group_0__0 )? ) ;
    public final void rule__Reorientation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3478:1: ( ( ( rule__Reorientation__Group_0__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3479:1: ( ( rule__Reorientation__Group_0__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3479:1: ( ( rule__Reorientation__Group_0__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3480:1: ( rule__Reorientation__Group_0__0 )?
            {
             before(grammarAccess.getReorientationAccess().getGroup_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3481:1: ( rule__Reorientation__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==51) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3481:2: rule__Reorientation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Reorientation__Group_0__0_in_rule__Reorientation__Group__0__Impl6991);
                    rule__Reorientation__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReorientationAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Reorientation__Group__0__Impl"


    // $ANTLR start "rule__Reorientation__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3491:1: rule__Reorientation__Group__1 : rule__Reorientation__Group__1__Impl ;
    public final void rule__Reorientation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3495:1: ( rule__Reorientation__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3496:2: rule__Reorientation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reorientation__Group__1__Impl_in_rule__Reorientation__Group__17022);
            rule__Reorientation__Group__1__Impl();

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
    // $ANTLR end "rule__Reorientation__Group__1"


    // $ANTLR start "rule__Reorientation__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3502:1: rule__Reorientation__Group__1__Impl : ( ( rule__Reorientation__ExpAssignment_1 ) ) ;
    public final void rule__Reorientation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3506:1: ( ( ( rule__Reorientation__ExpAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3507:1: ( ( rule__Reorientation__ExpAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3507:1: ( ( rule__Reorientation__ExpAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3508:1: ( rule__Reorientation__ExpAssignment_1 )
            {
             before(grammarAccess.getReorientationAccess().getExpAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3509:1: ( rule__Reorientation__ExpAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3509:2: rule__Reorientation__ExpAssignment_1
            {
            pushFollow(FOLLOW_rule__Reorientation__ExpAssignment_1_in_rule__Reorientation__Group__1__Impl7049);
            rule__Reorientation__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReorientationAccess().getExpAssignment_1()); 

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
    // $ANTLR end "rule__Reorientation__Group__1__Impl"


    // $ANTLR start "rule__Reorientation__Group_0__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3523:1: rule__Reorientation__Group_0__0 : rule__Reorientation__Group_0__0__Impl rule__Reorientation__Group_0__1 ;
    public final void rule__Reorientation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3527:1: ( rule__Reorientation__Group_0__0__Impl rule__Reorientation__Group_0__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3528:2: rule__Reorientation__Group_0__0__Impl rule__Reorientation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Reorientation__Group_0__0__Impl_in_rule__Reorientation__Group_0__07083);
            rule__Reorientation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reorientation__Group_0__1_in_rule__Reorientation__Group_0__07086);
            rule__Reorientation__Group_0__1();

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
    // $ANTLR end "rule__Reorientation__Group_0__0"


    // $ANTLR start "rule__Reorientation__Group_0__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3535:1: rule__Reorientation__Group_0__0__Impl : ( 'reorient' ) ;
    public final void rule__Reorientation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3539:1: ( ( 'reorient' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3540:1: ( 'reorient' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3540:1: ( 'reorient' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3541:1: 'reorient'
            {
             before(grammarAccess.getReorientationAccess().getReorientKeyword_0_0()); 
            match(input,51,FOLLOW_51_in_rule__Reorientation__Group_0__0__Impl7114); 
             after(grammarAccess.getReorientationAccess().getReorientKeyword_0_0()); 

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
    // $ANTLR end "rule__Reorientation__Group_0__0__Impl"


    // $ANTLR start "rule__Reorientation__Group_0__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3554:1: rule__Reorientation__Group_0__1 : rule__Reorientation__Group_0__1__Impl ;
    public final void rule__Reorientation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3558:1: ( rule__Reorientation__Group_0__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3559:2: rule__Reorientation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Reorientation__Group_0__1__Impl_in_rule__Reorientation__Group_0__17145);
            rule__Reorientation__Group_0__1__Impl();

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
    // $ANTLR end "rule__Reorientation__Group_0__1"


    // $ANTLR start "rule__Reorientation__Group_0__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3565:1: rule__Reorientation__Group_0__1__Impl : ( ( rule__Reorientation__NameAssignment_0_1 ) ) ;
    public final void rule__Reorientation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3569:1: ( ( ( rule__Reorientation__NameAssignment_0_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3570:1: ( ( rule__Reorientation__NameAssignment_0_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3570:1: ( ( rule__Reorientation__NameAssignment_0_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3571:1: ( rule__Reorientation__NameAssignment_0_1 )
            {
             before(grammarAccess.getReorientationAccess().getNameAssignment_0_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3572:1: ( rule__Reorientation__NameAssignment_0_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3572:2: rule__Reorientation__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Reorientation__NameAssignment_0_1_in_rule__Reorientation__Group_0__1__Impl7172);
            rule__Reorientation__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getReorientationAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__Reorientation__Group_0__1__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3586:1: rule__ReorientExpression__Group_1__0 : rule__ReorientExpression__Group_1__0__Impl rule__ReorientExpression__Group_1__1 ;
    public final void rule__ReorientExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3590:1: ( rule__ReorientExpression__Group_1__0__Impl rule__ReorientExpression__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3591:2: rule__ReorientExpression__Group_1__0__Impl rule__ReorientExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__0__Impl_in_rule__ReorientExpression__Group_1__07206);
            rule__ReorientExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__1_in_rule__ReorientExpression__Group_1__07209);
            rule__ReorientExpression__Group_1__1();

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
    // $ANTLR end "rule__ReorientExpression__Group_1__0"


    // $ANTLR start "rule__ReorientExpression__Group_1__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3598:1: rule__ReorientExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ReorientExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3602:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3603:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3603:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3604:1: '('
            {
             before(grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__ReorientExpression__Group_1__0__Impl7237); 
             after(grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3617:1: rule__ReorientExpression__Group_1__1 : rule__ReorientExpression__Group_1__1__Impl rule__ReorientExpression__Group_1__2 ;
    public final void rule__ReorientExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3621:1: ( rule__ReorientExpression__Group_1__1__Impl rule__ReorientExpression__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3622:2: rule__ReorientExpression__Group_1__1__Impl rule__ReorientExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__1__Impl_in_rule__ReorientExpression__Group_1__17268);
            rule__ReorientExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__2_in_rule__ReorientExpression__Group_1__17271);
            rule__ReorientExpression__Group_1__2();

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
    // $ANTLR end "rule__ReorientExpression__Group_1__1"


    // $ANTLR start "rule__ReorientExpression__Group_1__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3629:1: rule__ReorientExpression__Group_1__1__Impl : ( '(' ) ;
    public final void rule__ReorientExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3633:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3634:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3634:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3635:1: '('
            {
             before(grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,44,FOLLOW_44_in_rule__ReorientExpression__Group_1__1__Impl7299); 
             after(grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3648:1: rule__ReorientExpression__Group_1__2 : rule__ReorientExpression__Group_1__2__Impl rule__ReorientExpression__Group_1__3 ;
    public final void rule__ReorientExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3652:1: ( rule__ReorientExpression__Group_1__2__Impl rule__ReorientExpression__Group_1__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3653:2: rule__ReorientExpression__Group_1__2__Impl rule__ReorientExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__2__Impl_in_rule__ReorientExpression__Group_1__27330);
            rule__ReorientExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__3_in_rule__ReorientExpression__Group_1__27333);
            rule__ReorientExpression__Group_1__3();

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
    // $ANTLR end "rule__ReorientExpression__Group_1__2"


    // $ANTLR start "rule__ReorientExpression__Group_1__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3660:1: rule__ReorientExpression__Group_1__2__Impl : ( ( rule__ReorientExpression__AxisAssignment_1_2 ) ) ;
    public final void rule__ReorientExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3664:1: ( ( ( rule__ReorientExpression__AxisAssignment_1_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3665:1: ( ( rule__ReorientExpression__AxisAssignment_1_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3665:1: ( ( rule__ReorientExpression__AxisAssignment_1_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3666:1: ( rule__ReorientExpression__AxisAssignment_1_2 )
            {
             before(grammarAccess.getReorientExpressionAccess().getAxisAssignment_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3667:1: ( rule__ReorientExpression__AxisAssignment_1_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3667:2: rule__ReorientExpression__AxisAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ReorientExpression__AxisAssignment_1_2_in_rule__ReorientExpression__Group_1__2__Impl7360);
            rule__ReorientExpression__AxisAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getReorientExpressionAccess().getAxisAssignment_1_2()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3677:1: rule__ReorientExpression__Group_1__3 : rule__ReorientExpression__Group_1__3__Impl rule__ReorientExpression__Group_1__4 ;
    public final void rule__ReorientExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3681:1: ( rule__ReorientExpression__Group_1__3__Impl rule__ReorientExpression__Group_1__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3682:2: rule__ReorientExpression__Group_1__3__Impl rule__ReorientExpression__Group_1__4
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__3__Impl_in_rule__ReorientExpression__Group_1__37390);
            rule__ReorientExpression__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__4_in_rule__ReorientExpression__Group_1__37393);
            rule__ReorientExpression__Group_1__4();

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
    // $ANTLR end "rule__ReorientExpression__Group_1__3"


    // $ANTLR start "rule__ReorientExpression__Group_1__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3689:1: rule__ReorientExpression__Group_1__3__Impl : ( ',' ) ;
    public final void rule__ReorientExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3693:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3694:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3694:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3695:1: ','
            {
             before(grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_3()); 
            match(input,46,FOLLOW_46_in_rule__ReorientExpression__Group_1__3__Impl7421); 
             after(grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_3()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1__3__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3708:1: rule__ReorientExpression__Group_1__4 : rule__ReorientExpression__Group_1__4__Impl rule__ReorientExpression__Group_1__5 ;
    public final void rule__ReorientExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3712:1: ( rule__ReorientExpression__Group_1__4__Impl rule__ReorientExpression__Group_1__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3713:2: rule__ReorientExpression__Group_1__4__Impl rule__ReorientExpression__Group_1__5
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__4__Impl_in_rule__ReorientExpression__Group_1__47452);
            rule__ReorientExpression__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__5_in_rule__ReorientExpression__Group_1__47455);
            rule__ReorientExpression__Group_1__5();

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
    // $ANTLR end "rule__ReorientExpression__Group_1__4"


    // $ANTLR start "rule__ReorientExpression__Group_1__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3720:1: rule__ReorientExpression__Group_1__4__Impl : ( ( rule__ReorientExpression__ValueAssignment_1_4 ) ) ;
    public final void rule__ReorientExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3724:1: ( ( ( rule__ReorientExpression__ValueAssignment_1_4 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3725:1: ( ( rule__ReorientExpression__ValueAssignment_1_4 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3725:1: ( ( rule__ReorientExpression__ValueAssignment_1_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3726:1: ( rule__ReorientExpression__ValueAssignment_1_4 )
            {
             before(grammarAccess.getReorientExpressionAccess().getValueAssignment_1_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3727:1: ( rule__ReorientExpression__ValueAssignment_1_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3727:2: rule__ReorientExpression__ValueAssignment_1_4
            {
            pushFollow(FOLLOW_rule__ReorientExpression__ValueAssignment_1_4_in_rule__ReorientExpression__Group_1__4__Impl7482);
            rule__ReorientExpression__ValueAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getReorientExpressionAccess().getValueAssignment_1_4()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1__4__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3737:1: rule__ReorientExpression__Group_1__5 : rule__ReorientExpression__Group_1__5__Impl rule__ReorientExpression__Group_1__6 ;
    public final void rule__ReorientExpression__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3741:1: ( rule__ReorientExpression__Group_1__5__Impl rule__ReorientExpression__Group_1__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3742:2: rule__ReorientExpression__Group_1__5__Impl rule__ReorientExpression__Group_1__6
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__5__Impl_in_rule__ReorientExpression__Group_1__57512);
            rule__ReorientExpression__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__6_in_rule__ReorientExpression__Group_1__57515);
            rule__ReorientExpression__Group_1__6();

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
    // $ANTLR end "rule__ReorientExpression__Group_1__5"


    // $ANTLR start "rule__ReorientExpression__Group_1__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3749:1: rule__ReorientExpression__Group_1__5__Impl : ( ')' ) ;
    public final void rule__ReorientExpression__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3753:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3754:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3754:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3755:1: ')'
            {
             before(grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_5()); 
            match(input,45,FOLLOW_45_in_rule__ReorientExpression__Group_1__5__Impl7543); 
             after(grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_5()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1__5__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1__6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3768:1: rule__ReorientExpression__Group_1__6 : rule__ReorientExpression__Group_1__6__Impl rule__ReorientExpression__Group_1__7 ;
    public final void rule__ReorientExpression__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3772:1: ( rule__ReorientExpression__Group_1__6__Impl rule__ReorientExpression__Group_1__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3773:2: rule__ReorientExpression__Group_1__6__Impl rule__ReorientExpression__Group_1__7
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__6__Impl_in_rule__ReorientExpression__Group_1__67574);
            rule__ReorientExpression__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__7_in_rule__ReorientExpression__Group_1__67577);
            rule__ReorientExpression__Group_1__7();

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
    // $ANTLR end "rule__ReorientExpression__Group_1__6"


    // $ANTLR start "rule__ReorientExpression__Group_1__6__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3780:1: rule__ReorientExpression__Group_1__6__Impl : ( ( rule__ReorientExpression__Group_1_6__0 )* ) ;
    public final void rule__ReorientExpression__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3784:1: ( ( ( rule__ReorientExpression__Group_1_6__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3785:1: ( ( rule__ReorientExpression__Group_1_6__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3785:1: ( ( rule__ReorientExpression__Group_1_6__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3786:1: ( rule__ReorientExpression__Group_1_6__0 )*
            {
             before(grammarAccess.getReorientExpressionAccess().getGroup_1_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3787:1: ( rule__ReorientExpression__Group_1_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==46) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3787:2: rule__ReorientExpression__Group_1_6__0
            	    {
            	    pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__0_in_rule__ReorientExpression__Group_1__6__Impl7604);
            	    rule__ReorientExpression__Group_1_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getReorientExpressionAccess().getGroup_1_6()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1__6__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1__7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3797:1: rule__ReorientExpression__Group_1__7 : rule__ReorientExpression__Group_1__7__Impl ;
    public final void rule__ReorientExpression__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3801:1: ( rule__ReorientExpression__Group_1__7__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3802:2: rule__ReorientExpression__Group_1__7__Impl
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__7__Impl_in_rule__ReorientExpression__Group_1__77635);
            rule__ReorientExpression__Group_1__7__Impl();

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
    // $ANTLR end "rule__ReorientExpression__Group_1__7"


    // $ANTLR start "rule__ReorientExpression__Group_1__7__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3808:1: rule__ReorientExpression__Group_1__7__Impl : ( ')' ) ;
    public final void rule__ReorientExpression__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3812:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3813:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3813:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3814:1: ')'
            {
             before(grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_7()); 
            match(input,45,FOLLOW_45_in_rule__ReorientExpression__Group_1__7__Impl7663); 
             after(grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_7()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1__7__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1_6__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3843:1: rule__ReorientExpression__Group_1_6__0 : rule__ReorientExpression__Group_1_6__0__Impl rule__ReorientExpression__Group_1_6__1 ;
    public final void rule__ReorientExpression__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3847:1: ( rule__ReorientExpression__Group_1_6__0__Impl rule__ReorientExpression__Group_1_6__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3848:2: rule__ReorientExpression__Group_1_6__0__Impl rule__ReorientExpression__Group_1_6__1
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__0__Impl_in_rule__ReorientExpression__Group_1_6__07710);
            rule__ReorientExpression__Group_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__1_in_rule__ReorientExpression__Group_1_6__07713);
            rule__ReorientExpression__Group_1_6__1();

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
    // $ANTLR end "rule__ReorientExpression__Group_1_6__0"


    // $ANTLR start "rule__ReorientExpression__Group_1_6__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3855:1: rule__ReorientExpression__Group_1_6__0__Impl : ( ',' ) ;
    public final void rule__ReorientExpression__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3859:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3860:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3860:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3861:1: ','
            {
             before(grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_6_0()); 
            match(input,46,FOLLOW_46_in_rule__ReorientExpression__Group_1_6__0__Impl7741); 
             after(grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_6_0()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1_6__0__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1_6__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3874:1: rule__ReorientExpression__Group_1_6__1 : rule__ReorientExpression__Group_1_6__1__Impl rule__ReorientExpression__Group_1_6__2 ;
    public final void rule__ReorientExpression__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3878:1: ( rule__ReorientExpression__Group_1_6__1__Impl rule__ReorientExpression__Group_1_6__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3879:2: rule__ReorientExpression__Group_1_6__1__Impl rule__ReorientExpression__Group_1_6__2
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__1__Impl_in_rule__ReorientExpression__Group_1_6__17772);
            rule__ReorientExpression__Group_1_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__2_in_rule__ReorientExpression__Group_1_6__17775);
            rule__ReorientExpression__Group_1_6__2();

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
    // $ANTLR end "rule__ReorientExpression__Group_1_6__1"


    // $ANTLR start "rule__ReorientExpression__Group_1_6__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3886:1: rule__ReorientExpression__Group_1_6__1__Impl : ( '(' ) ;
    public final void rule__ReorientExpression__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3890:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3891:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3891:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3892:1: '('
            {
             before(grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_6_1()); 
            match(input,44,FOLLOW_44_in_rule__ReorientExpression__Group_1_6__1__Impl7803); 
             after(grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_6_1()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1_6__1__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1_6__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3905:1: rule__ReorientExpression__Group_1_6__2 : rule__ReorientExpression__Group_1_6__2__Impl rule__ReorientExpression__Group_1_6__3 ;
    public final void rule__ReorientExpression__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3909:1: ( rule__ReorientExpression__Group_1_6__2__Impl rule__ReorientExpression__Group_1_6__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3910:2: rule__ReorientExpression__Group_1_6__2__Impl rule__ReorientExpression__Group_1_6__3
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__2__Impl_in_rule__ReorientExpression__Group_1_6__27834);
            rule__ReorientExpression__Group_1_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__3_in_rule__ReorientExpression__Group_1_6__27837);
            rule__ReorientExpression__Group_1_6__3();

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
    // $ANTLR end "rule__ReorientExpression__Group_1_6__2"


    // $ANTLR start "rule__ReorientExpression__Group_1_6__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3917:1: rule__ReorientExpression__Group_1_6__2__Impl : ( ( rule__ReorientExpression__AxisAssignment_1_6_2 ) ) ;
    public final void rule__ReorientExpression__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3921:1: ( ( ( rule__ReorientExpression__AxisAssignment_1_6_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3922:1: ( ( rule__ReorientExpression__AxisAssignment_1_6_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3922:1: ( ( rule__ReorientExpression__AxisAssignment_1_6_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3923:1: ( rule__ReorientExpression__AxisAssignment_1_6_2 )
            {
             before(grammarAccess.getReorientExpressionAccess().getAxisAssignment_1_6_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3924:1: ( rule__ReorientExpression__AxisAssignment_1_6_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3924:2: rule__ReorientExpression__AxisAssignment_1_6_2
            {
            pushFollow(FOLLOW_rule__ReorientExpression__AxisAssignment_1_6_2_in_rule__ReorientExpression__Group_1_6__2__Impl7864);
            rule__ReorientExpression__AxisAssignment_1_6_2();

            state._fsp--;


            }

             after(grammarAccess.getReorientExpressionAccess().getAxisAssignment_1_6_2()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1_6__2__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1_6__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3934:1: rule__ReorientExpression__Group_1_6__3 : rule__ReorientExpression__Group_1_6__3__Impl rule__ReorientExpression__Group_1_6__4 ;
    public final void rule__ReorientExpression__Group_1_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3938:1: ( rule__ReorientExpression__Group_1_6__3__Impl rule__ReorientExpression__Group_1_6__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3939:2: rule__ReorientExpression__Group_1_6__3__Impl rule__ReorientExpression__Group_1_6__4
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__3__Impl_in_rule__ReorientExpression__Group_1_6__37894);
            rule__ReorientExpression__Group_1_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__4_in_rule__ReorientExpression__Group_1_6__37897);
            rule__ReorientExpression__Group_1_6__4();

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
    // $ANTLR end "rule__ReorientExpression__Group_1_6__3"


    // $ANTLR start "rule__ReorientExpression__Group_1_6__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3946:1: rule__ReorientExpression__Group_1_6__3__Impl : ( ',' ) ;
    public final void rule__ReorientExpression__Group_1_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3950:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3951:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3951:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3952:1: ','
            {
             before(grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_6_3()); 
            match(input,46,FOLLOW_46_in_rule__ReorientExpression__Group_1_6__3__Impl7925); 
             after(grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_6_3()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1_6__3__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1_6__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3965:1: rule__ReorientExpression__Group_1_6__4 : rule__ReorientExpression__Group_1_6__4__Impl rule__ReorientExpression__Group_1_6__5 ;
    public final void rule__ReorientExpression__Group_1_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3969:1: ( rule__ReorientExpression__Group_1_6__4__Impl rule__ReorientExpression__Group_1_6__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3970:2: rule__ReorientExpression__Group_1_6__4__Impl rule__ReorientExpression__Group_1_6__5
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__4__Impl_in_rule__ReorientExpression__Group_1_6__47956);
            rule__ReorientExpression__Group_1_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__5_in_rule__ReorientExpression__Group_1_6__47959);
            rule__ReorientExpression__Group_1_6__5();

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
    // $ANTLR end "rule__ReorientExpression__Group_1_6__4"


    // $ANTLR start "rule__ReorientExpression__Group_1_6__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3977:1: rule__ReorientExpression__Group_1_6__4__Impl : ( ( rule__ReorientExpression__ValueAssignment_1_6_4 ) ) ;
    public final void rule__ReorientExpression__Group_1_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3981:1: ( ( ( rule__ReorientExpression__ValueAssignment_1_6_4 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3982:1: ( ( rule__ReorientExpression__ValueAssignment_1_6_4 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3982:1: ( ( rule__ReorientExpression__ValueAssignment_1_6_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3983:1: ( rule__ReorientExpression__ValueAssignment_1_6_4 )
            {
             before(grammarAccess.getReorientExpressionAccess().getValueAssignment_1_6_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3984:1: ( rule__ReorientExpression__ValueAssignment_1_6_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3984:2: rule__ReorientExpression__ValueAssignment_1_6_4
            {
            pushFollow(FOLLOW_rule__ReorientExpression__ValueAssignment_1_6_4_in_rule__ReorientExpression__Group_1_6__4__Impl7986);
            rule__ReorientExpression__ValueAssignment_1_6_4();

            state._fsp--;


            }

             after(grammarAccess.getReorientExpressionAccess().getValueAssignment_1_6_4()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1_6__4__Impl"


    // $ANTLR start "rule__ReorientExpression__Group_1_6__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3994:1: rule__ReorientExpression__Group_1_6__5 : rule__ReorientExpression__Group_1_6__5__Impl ;
    public final void rule__ReorientExpression__Group_1_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3998:1: ( rule__ReorientExpression__Group_1_6__5__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3999:2: rule__ReorientExpression__Group_1_6__5__Impl
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__5__Impl_in_rule__ReorientExpression__Group_1_6__58016);
            rule__ReorientExpression__Group_1_6__5__Impl();

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
    // $ANTLR end "rule__ReorientExpression__Group_1_6__5"


    // $ANTLR start "rule__ReorientExpression__Group_1_6__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4005:1: rule__ReorientExpression__Group_1_6__5__Impl : ( ')' ) ;
    public final void rule__ReorientExpression__Group_1_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4009:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4010:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4010:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4011:1: ')'
            {
             before(grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_6_5()); 
            match(input,45,FOLLOW_45_in_rule__ReorientExpression__Group_1_6__5__Impl8044); 
             after(grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_6_5()); 

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
    // $ANTLR end "rule__ReorientExpression__Group_1_6__5__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4036:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4040:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4041:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__08087);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__08090);
            rule__Constraint__Group__1();

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
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4048:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4052:1: ( ( 'constraint' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4053:1: ( 'constraint' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4053:1: ( 'constraint' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4054:1: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__Constraint__Group__0__Impl8118); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 

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
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4067:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4071:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4072:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__18149);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__18152);
            rule__Constraint__Group__2();

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
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4079:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4083:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4084:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4084:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4085:1: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4086:1: ( rule__Constraint__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4086:2: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constraint__NameAssignment_1_in_rule__Constraint__Group__1__Impl8179);
            rule__Constraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4096:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4100:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4101:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__28209);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__28212);
            rule__Constraint__Group__3();

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
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4108:1: rule__Constraint__Group__2__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4112:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4113:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4113:1: ( ':' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4114:1: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Constraint__Group__2__Impl8240); 
             after(grammarAccess.getConstraintAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4127:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4131:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4132:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__38271);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__38274);
            rule__Constraint__Group__4();

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
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4139:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__TypeAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4143:1: ( ( ( rule__Constraint__TypeAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4144:1: ( ( rule__Constraint__TypeAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4144:1: ( ( rule__Constraint__TypeAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4145:1: ( rule__Constraint__TypeAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getTypeAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4146:1: ( rule__Constraint__TypeAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4146:2: rule__Constraint__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Constraint__TypeAssignment_3_in_rule__Constraint__Group__3__Impl8301);
            rule__Constraint__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4156:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4160:1: ( rule__Constraint__Group__4__Impl rule__Constraint__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4161:2: rule__Constraint__Group__4__Impl rule__Constraint__Group__5
            {
            pushFollow(FOLLOW_rule__Constraint__Group__4__Impl_in_rule__Constraint__Group__48331);
            rule__Constraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__48334);
            rule__Constraint__Group__5();

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
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4168:1: rule__Constraint__Group__4__Impl : ( 'between' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4172:1: ( ( 'between' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4173:1: ( 'between' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4173:1: ( 'between' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4174:1: 'between'
            {
             before(grammarAccess.getConstraintAccess().getBetweenKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__Constraint__Group__4__Impl8362); 
             after(grammarAccess.getConstraintAccess().getBetweenKeyword_4()); 

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
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Constraint__Group__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4187:1: rule__Constraint__Group__5 : rule__Constraint__Group__5__Impl rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4191:1: ( rule__Constraint__Group__5__Impl rule__Constraint__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4192:2: rule__Constraint__Group__5__Impl rule__Constraint__Group__6
            {
            pushFollow(FOLLOW_rule__Constraint__Group__5__Impl_in_rule__Constraint__Group__58393);
            rule__Constraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__58396);
            rule__Constraint__Group__6();

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
    // $ANTLR end "rule__Constraint__Group__5"


    // $ANTLR start "rule__Constraint__Group__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4199:1: rule__Constraint__Group__5__Impl : ( ( rule__Constraint__Body1Assignment_5 ) ) ;
    public final void rule__Constraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4203:1: ( ( ( rule__Constraint__Body1Assignment_5 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4204:1: ( ( rule__Constraint__Body1Assignment_5 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4204:1: ( ( rule__Constraint__Body1Assignment_5 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4205:1: ( rule__Constraint__Body1Assignment_5 )
            {
             before(grammarAccess.getConstraintAccess().getBody1Assignment_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4206:1: ( rule__Constraint__Body1Assignment_5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4206:2: rule__Constraint__Body1Assignment_5
            {
            pushFollow(FOLLOW_rule__Constraint__Body1Assignment_5_in_rule__Constraint__Group__5__Impl8423);
            rule__Constraint__Body1Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getBody1Assignment_5()); 

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
    // $ANTLR end "rule__Constraint__Group__5__Impl"


    // $ANTLR start "rule__Constraint__Group__6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4216:1: rule__Constraint__Group__6 : rule__Constraint__Group__6__Impl rule__Constraint__Group__7 ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4220:1: ( rule__Constraint__Group__6__Impl rule__Constraint__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4221:2: rule__Constraint__Group__6__Impl rule__Constraint__Group__7
            {
            pushFollow(FOLLOW_rule__Constraint__Group__6__Impl_in_rule__Constraint__Group__68453);
            rule__Constraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__68456);
            rule__Constraint__Group__7();

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
    // $ANTLR end "rule__Constraint__Group__6"


    // $ANTLR start "rule__Constraint__Group__6__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4228:1: rule__Constraint__Group__6__Impl : ( ( rule__Constraint__RelTrans1Assignment_6 ) ) ;
    public final void rule__Constraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4232:1: ( ( ( rule__Constraint__RelTrans1Assignment_6 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4233:1: ( ( rule__Constraint__RelTrans1Assignment_6 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4233:1: ( ( rule__Constraint__RelTrans1Assignment_6 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4234:1: ( rule__Constraint__RelTrans1Assignment_6 )
            {
             before(grammarAccess.getConstraintAccess().getRelTrans1Assignment_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4235:1: ( rule__Constraint__RelTrans1Assignment_6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4235:2: rule__Constraint__RelTrans1Assignment_6
            {
            pushFollow(FOLLOW_rule__Constraint__RelTrans1Assignment_6_in_rule__Constraint__Group__6__Impl8483);
            rule__Constraint__RelTrans1Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getRelTrans1Assignment_6()); 

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
    // $ANTLR end "rule__Constraint__Group__6__Impl"


    // $ANTLR start "rule__Constraint__Group__7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4245:1: rule__Constraint__Group__7 : rule__Constraint__Group__7__Impl rule__Constraint__Group__8 ;
    public final void rule__Constraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4249:1: ( rule__Constraint__Group__7__Impl rule__Constraint__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4250:2: rule__Constraint__Group__7__Impl rule__Constraint__Group__8
            {
            pushFollow(FOLLOW_rule__Constraint__Group__7__Impl_in_rule__Constraint__Group__78513);
            rule__Constraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__8_in_rule__Constraint__Group__78516);
            rule__Constraint__Group__8();

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
    // $ANTLR end "rule__Constraint__Group__7"


    // $ANTLR start "rule__Constraint__Group__7__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4257:1: rule__Constraint__Group__7__Impl : ( 'and' ) ;
    public final void rule__Constraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4261:1: ( ( 'and' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4262:1: ( 'and' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4262:1: ( 'and' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4263:1: 'and'
            {
             before(grammarAccess.getConstraintAccess().getAndKeyword_7()); 
            match(input,36,FOLLOW_36_in_rule__Constraint__Group__7__Impl8544); 
             after(grammarAccess.getConstraintAccess().getAndKeyword_7()); 

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
    // $ANTLR end "rule__Constraint__Group__7__Impl"


    // $ANTLR start "rule__Constraint__Group__8"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4276:1: rule__Constraint__Group__8 : rule__Constraint__Group__8__Impl rule__Constraint__Group__9 ;
    public final void rule__Constraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4280:1: ( rule__Constraint__Group__8__Impl rule__Constraint__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4281:2: rule__Constraint__Group__8__Impl rule__Constraint__Group__9
            {
            pushFollow(FOLLOW_rule__Constraint__Group__8__Impl_in_rule__Constraint__Group__88575);
            rule__Constraint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__9_in_rule__Constraint__Group__88578);
            rule__Constraint__Group__9();

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
    // $ANTLR end "rule__Constraint__Group__8"


    // $ANTLR start "rule__Constraint__Group__8__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4288:1: rule__Constraint__Group__8__Impl : ( ( rule__Constraint__Body2Assignment_8 ) ) ;
    public final void rule__Constraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4292:1: ( ( ( rule__Constraint__Body2Assignment_8 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4293:1: ( ( rule__Constraint__Body2Assignment_8 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4293:1: ( ( rule__Constraint__Body2Assignment_8 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4294:1: ( rule__Constraint__Body2Assignment_8 )
            {
             before(grammarAccess.getConstraintAccess().getBody2Assignment_8()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4295:1: ( rule__Constraint__Body2Assignment_8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4295:2: rule__Constraint__Body2Assignment_8
            {
            pushFollow(FOLLOW_rule__Constraint__Body2Assignment_8_in_rule__Constraint__Group__8__Impl8605);
            rule__Constraint__Body2Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getBody2Assignment_8()); 

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
    // $ANTLR end "rule__Constraint__Group__8__Impl"


    // $ANTLR start "rule__Constraint__Group__9"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4305:1: rule__Constraint__Group__9 : rule__Constraint__Group__9__Impl ;
    public final void rule__Constraint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4309:1: ( rule__Constraint__Group__9__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4310:2: rule__Constraint__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__9__Impl_in_rule__Constraint__Group__98635);
            rule__Constraint__Group__9__Impl();

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
    // $ANTLR end "rule__Constraint__Group__9"


    // $ANTLR start "rule__Constraint__Group__9__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4316:1: rule__Constraint__Group__9__Impl : ( ( rule__Constraint__RelTrans2Assignment_9 ) ) ;
    public final void rule__Constraint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4320:1: ( ( ( rule__Constraint__RelTrans2Assignment_9 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4321:1: ( ( rule__Constraint__RelTrans2Assignment_9 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4321:1: ( ( rule__Constraint__RelTrans2Assignment_9 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4322:1: ( rule__Constraint__RelTrans2Assignment_9 )
            {
             before(grammarAccess.getConstraintAccess().getRelTrans2Assignment_9()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4323:1: ( rule__Constraint__RelTrans2Assignment_9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4323:2: rule__Constraint__RelTrans2Assignment_9
            {
            pushFollow(FOLLOW_rule__Constraint__RelTrans2Assignment_9_in_rule__Constraint__Group__9__Impl8662);
            rule__Constraint__RelTrans2Assignment_9();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getRelTrans2Assignment_9()); 

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
    // $ANTLR end "rule__Constraint__Group__9__Impl"


    // $ANTLR start "rule__ExternalLoad__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4353:1: rule__ExternalLoad__Group__0 : rule__ExternalLoad__Group__0__Impl rule__ExternalLoad__Group__1 ;
    public final void rule__ExternalLoad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4357:1: ( rule__ExternalLoad__Group__0__Impl rule__ExternalLoad__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4358:2: rule__ExternalLoad__Group__0__Impl rule__ExternalLoad__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__0__Impl_in_rule__ExternalLoad__Group__08712);
            rule__ExternalLoad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__1_in_rule__ExternalLoad__Group__08715);
            rule__ExternalLoad__Group__1();

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
    // $ANTLR end "rule__ExternalLoad__Group__0"


    // $ANTLR start "rule__ExternalLoad__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4365:1: rule__ExternalLoad__Group__0__Impl : ( 'external' ) ;
    public final void rule__ExternalLoad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4369:1: ( ( 'external' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4370:1: ( 'external' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4370:1: ( 'external' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4371:1: 'external'
            {
             before(grammarAccess.getExternalLoadAccess().getExternalKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__ExternalLoad__Group__0__Impl8743); 
             after(grammarAccess.getExternalLoadAccess().getExternalKeyword_0()); 

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
    // $ANTLR end "rule__ExternalLoad__Group__0__Impl"


    // $ANTLR start "rule__ExternalLoad__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4384:1: rule__ExternalLoad__Group__1 : rule__ExternalLoad__Group__1__Impl rule__ExternalLoad__Group__2 ;
    public final void rule__ExternalLoad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4388:1: ( rule__ExternalLoad__Group__1__Impl rule__ExternalLoad__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4389:2: rule__ExternalLoad__Group__1__Impl rule__ExternalLoad__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__1__Impl_in_rule__ExternalLoad__Group__18774);
            rule__ExternalLoad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__2_in_rule__ExternalLoad__Group__18777);
            rule__ExternalLoad__Group__2();

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
    // $ANTLR end "rule__ExternalLoad__Group__1"


    // $ANTLR start "rule__ExternalLoad__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4396:1: rule__ExternalLoad__Group__1__Impl : ( 'load' ) ;
    public final void rule__ExternalLoad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4400:1: ( ( 'load' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4401:1: ( 'load' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4401:1: ( 'load' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4402:1: 'load'
            {
             before(grammarAccess.getExternalLoadAccess().getLoadKeyword_1()); 
            match(input,54,FOLLOW_54_in_rule__ExternalLoad__Group__1__Impl8805); 
             after(grammarAccess.getExternalLoadAccess().getLoadKeyword_1()); 

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
    // $ANTLR end "rule__ExternalLoad__Group__1__Impl"


    // $ANTLR start "rule__ExternalLoad__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4415:1: rule__ExternalLoad__Group__2 : rule__ExternalLoad__Group__2__Impl rule__ExternalLoad__Group__3 ;
    public final void rule__ExternalLoad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4419:1: ( rule__ExternalLoad__Group__2__Impl rule__ExternalLoad__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4420:2: rule__ExternalLoad__Group__2__Impl rule__ExternalLoad__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__2__Impl_in_rule__ExternalLoad__Group__28836);
            rule__ExternalLoad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__3_in_rule__ExternalLoad__Group__28839);
            rule__ExternalLoad__Group__3();

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
    // $ANTLR end "rule__ExternalLoad__Group__2"


    // $ANTLR start "rule__ExternalLoad__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4427:1: rule__ExternalLoad__Group__2__Impl : ( ( rule__ExternalLoad__NameAssignment_2 ) ) ;
    public final void rule__ExternalLoad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4431:1: ( ( ( rule__ExternalLoad__NameAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4432:1: ( ( rule__ExternalLoad__NameAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4432:1: ( ( rule__ExternalLoad__NameAssignment_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4433:1: ( rule__ExternalLoad__NameAssignment_2 )
            {
             before(grammarAccess.getExternalLoadAccess().getNameAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4434:1: ( rule__ExternalLoad__NameAssignment_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4434:2: rule__ExternalLoad__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ExternalLoad__NameAssignment_2_in_rule__ExternalLoad__Group__2__Impl8866);
            rule__ExternalLoad__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalLoadAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ExternalLoad__Group__2__Impl"


    // $ANTLR start "rule__ExternalLoad__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4444:1: rule__ExternalLoad__Group__3 : rule__ExternalLoad__Group__3__Impl rule__ExternalLoad__Group__4 ;
    public final void rule__ExternalLoad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4448:1: ( rule__ExternalLoad__Group__3__Impl rule__ExternalLoad__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4449:2: rule__ExternalLoad__Group__3__Impl rule__ExternalLoad__Group__4
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__3__Impl_in_rule__ExternalLoad__Group__38896);
            rule__ExternalLoad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__4_in_rule__ExternalLoad__Group__38899);
            rule__ExternalLoad__Group__4();

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
    // $ANTLR end "rule__ExternalLoad__Group__3"


    // $ANTLR start "rule__ExternalLoad__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4456:1: rule__ExternalLoad__Group__3__Impl : ( ':' ) ;
    public final void rule__ExternalLoad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4460:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4461:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4461:1: ( ':' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4462:1: ':'
            {
             before(grammarAccess.getExternalLoadAccess().getColonKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__ExternalLoad__Group__3__Impl8927); 
             after(grammarAccess.getExternalLoadAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__ExternalLoad__Group__3__Impl"


    // $ANTLR start "rule__ExternalLoad__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4475:1: rule__ExternalLoad__Group__4 : rule__ExternalLoad__Group__4__Impl rule__ExternalLoad__Group__5 ;
    public final void rule__ExternalLoad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4479:1: ( rule__ExternalLoad__Group__4__Impl rule__ExternalLoad__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4480:2: rule__ExternalLoad__Group__4__Impl rule__ExternalLoad__Group__5
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__4__Impl_in_rule__ExternalLoad__Group__48958);
            rule__ExternalLoad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__5_in_rule__ExternalLoad__Group__48961);
            rule__ExternalLoad__Group__5();

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
    // $ANTLR end "rule__ExternalLoad__Group__4"


    // $ANTLR start "rule__ExternalLoad__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4487:1: rule__ExternalLoad__Group__4__Impl : ( ( rule__ExternalLoad__TypeAssignment_4 ) ) ;
    public final void rule__ExternalLoad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4491:1: ( ( ( rule__ExternalLoad__TypeAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4492:1: ( ( rule__ExternalLoad__TypeAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4492:1: ( ( rule__ExternalLoad__TypeAssignment_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4493:1: ( rule__ExternalLoad__TypeAssignment_4 )
            {
             before(grammarAccess.getExternalLoadAccess().getTypeAssignment_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4494:1: ( rule__ExternalLoad__TypeAssignment_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4494:2: rule__ExternalLoad__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__ExternalLoad__TypeAssignment_4_in_rule__ExternalLoad__Group__4__Impl8988);
            rule__ExternalLoad__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExternalLoadAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__ExternalLoad__Group__4__Impl"


    // $ANTLR start "rule__ExternalLoad__Group__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4504:1: rule__ExternalLoad__Group__5 : rule__ExternalLoad__Group__5__Impl rule__ExternalLoad__Group__6 ;
    public final void rule__ExternalLoad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4508:1: ( rule__ExternalLoad__Group__5__Impl rule__ExternalLoad__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4509:2: rule__ExternalLoad__Group__5__Impl rule__ExternalLoad__Group__6
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__5__Impl_in_rule__ExternalLoad__Group__59018);
            rule__ExternalLoad__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__6_in_rule__ExternalLoad__Group__59021);
            rule__ExternalLoad__Group__6();

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
    // $ANTLR end "rule__ExternalLoad__Group__5"


    // $ANTLR start "rule__ExternalLoad__Group__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4516:1: rule__ExternalLoad__Group__5__Impl : ( 'between' ) ;
    public final void rule__ExternalLoad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4520:1: ( ( 'between' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4521:1: ( 'between' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4521:1: ( 'between' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4522:1: 'between'
            {
             before(grammarAccess.getExternalLoadAccess().getBetweenKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__ExternalLoad__Group__5__Impl9049); 
             after(grammarAccess.getExternalLoadAccess().getBetweenKeyword_5()); 

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
    // $ANTLR end "rule__ExternalLoad__Group__5__Impl"


    // $ANTLR start "rule__ExternalLoad__Group__6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4535:1: rule__ExternalLoad__Group__6 : rule__ExternalLoad__Group__6__Impl rule__ExternalLoad__Group__7 ;
    public final void rule__ExternalLoad__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4539:1: ( rule__ExternalLoad__Group__6__Impl rule__ExternalLoad__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4540:2: rule__ExternalLoad__Group__6__Impl rule__ExternalLoad__Group__7
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__6__Impl_in_rule__ExternalLoad__Group__69080);
            rule__ExternalLoad__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__7_in_rule__ExternalLoad__Group__69083);
            rule__ExternalLoad__Group__7();

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
    // $ANTLR end "rule__ExternalLoad__Group__6"


    // $ANTLR start "rule__ExternalLoad__Group__6__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4547:1: rule__ExternalLoad__Group__6__Impl : ( ( rule__ExternalLoad__Body1Assignment_6 ) ) ;
    public final void rule__ExternalLoad__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4551:1: ( ( ( rule__ExternalLoad__Body1Assignment_6 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4552:1: ( ( rule__ExternalLoad__Body1Assignment_6 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4552:1: ( ( rule__ExternalLoad__Body1Assignment_6 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4553:1: ( rule__ExternalLoad__Body1Assignment_6 )
            {
             before(grammarAccess.getExternalLoadAccess().getBody1Assignment_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4554:1: ( rule__ExternalLoad__Body1Assignment_6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4554:2: rule__ExternalLoad__Body1Assignment_6
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Body1Assignment_6_in_rule__ExternalLoad__Group__6__Impl9110);
            rule__ExternalLoad__Body1Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExternalLoadAccess().getBody1Assignment_6()); 

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
    // $ANTLR end "rule__ExternalLoad__Group__6__Impl"


    // $ANTLR start "rule__ExternalLoad__Group__7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4564:1: rule__ExternalLoad__Group__7 : rule__ExternalLoad__Group__7__Impl rule__ExternalLoad__Group__8 ;
    public final void rule__ExternalLoad__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4568:1: ( rule__ExternalLoad__Group__7__Impl rule__ExternalLoad__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4569:2: rule__ExternalLoad__Group__7__Impl rule__ExternalLoad__Group__8
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__7__Impl_in_rule__ExternalLoad__Group__79140);
            rule__ExternalLoad__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__8_in_rule__ExternalLoad__Group__79143);
            rule__ExternalLoad__Group__8();

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
    // $ANTLR end "rule__ExternalLoad__Group__7"


    // $ANTLR start "rule__ExternalLoad__Group__7__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4576:1: rule__ExternalLoad__Group__7__Impl : ( ( rule__ExternalLoad__RelTrans1Assignment_7 ) ) ;
    public final void rule__ExternalLoad__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4580:1: ( ( ( rule__ExternalLoad__RelTrans1Assignment_7 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4581:1: ( ( rule__ExternalLoad__RelTrans1Assignment_7 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4581:1: ( ( rule__ExternalLoad__RelTrans1Assignment_7 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4582:1: ( rule__ExternalLoad__RelTrans1Assignment_7 )
            {
             before(grammarAccess.getExternalLoadAccess().getRelTrans1Assignment_7()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4583:1: ( rule__ExternalLoad__RelTrans1Assignment_7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4583:2: rule__ExternalLoad__RelTrans1Assignment_7
            {
            pushFollow(FOLLOW_rule__ExternalLoad__RelTrans1Assignment_7_in_rule__ExternalLoad__Group__7__Impl9170);
            rule__ExternalLoad__RelTrans1Assignment_7();

            state._fsp--;


            }

             after(grammarAccess.getExternalLoadAccess().getRelTrans1Assignment_7()); 

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
    // $ANTLR end "rule__ExternalLoad__Group__7__Impl"


    // $ANTLR start "rule__ExternalLoad__Group__8"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4593:1: rule__ExternalLoad__Group__8 : rule__ExternalLoad__Group__8__Impl rule__ExternalLoad__Group__9 ;
    public final void rule__ExternalLoad__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4597:1: ( rule__ExternalLoad__Group__8__Impl rule__ExternalLoad__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4598:2: rule__ExternalLoad__Group__8__Impl rule__ExternalLoad__Group__9
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__8__Impl_in_rule__ExternalLoad__Group__89200);
            rule__ExternalLoad__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__9_in_rule__ExternalLoad__Group__89203);
            rule__ExternalLoad__Group__9();

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
    // $ANTLR end "rule__ExternalLoad__Group__8"


    // $ANTLR start "rule__ExternalLoad__Group__8__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4605:1: rule__ExternalLoad__Group__8__Impl : ( 'and' ) ;
    public final void rule__ExternalLoad__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4609:1: ( ( 'and' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4610:1: ( 'and' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4610:1: ( 'and' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4611:1: 'and'
            {
             before(grammarAccess.getExternalLoadAccess().getAndKeyword_8()); 
            match(input,36,FOLLOW_36_in_rule__ExternalLoad__Group__8__Impl9231); 
             after(grammarAccess.getExternalLoadAccess().getAndKeyword_8()); 

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
    // $ANTLR end "rule__ExternalLoad__Group__8__Impl"


    // $ANTLR start "rule__ExternalLoad__Group__9"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4624:1: rule__ExternalLoad__Group__9 : rule__ExternalLoad__Group__9__Impl rule__ExternalLoad__Group__10 ;
    public final void rule__ExternalLoad__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4628:1: ( rule__ExternalLoad__Group__9__Impl rule__ExternalLoad__Group__10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4629:2: rule__ExternalLoad__Group__9__Impl rule__ExternalLoad__Group__10
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__9__Impl_in_rule__ExternalLoad__Group__99262);
            rule__ExternalLoad__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__10_in_rule__ExternalLoad__Group__99265);
            rule__ExternalLoad__Group__10();

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
    // $ANTLR end "rule__ExternalLoad__Group__9"


    // $ANTLR start "rule__ExternalLoad__Group__9__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4636:1: rule__ExternalLoad__Group__9__Impl : ( ( rule__ExternalLoad__Body2Assignment_9 ) ) ;
    public final void rule__ExternalLoad__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4640:1: ( ( ( rule__ExternalLoad__Body2Assignment_9 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4641:1: ( ( rule__ExternalLoad__Body2Assignment_9 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4641:1: ( ( rule__ExternalLoad__Body2Assignment_9 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4642:1: ( rule__ExternalLoad__Body2Assignment_9 )
            {
             before(grammarAccess.getExternalLoadAccess().getBody2Assignment_9()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4643:1: ( rule__ExternalLoad__Body2Assignment_9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4643:2: rule__ExternalLoad__Body2Assignment_9
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Body2Assignment_9_in_rule__ExternalLoad__Group__9__Impl9292);
            rule__ExternalLoad__Body2Assignment_9();

            state._fsp--;


            }

             after(grammarAccess.getExternalLoadAccess().getBody2Assignment_9()); 

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
    // $ANTLR end "rule__ExternalLoad__Group__9__Impl"


    // $ANTLR start "rule__ExternalLoad__Group__10"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4653:1: rule__ExternalLoad__Group__10 : rule__ExternalLoad__Group__10__Impl ;
    public final void rule__ExternalLoad__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4657:1: ( rule__ExternalLoad__Group__10__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4658:2: rule__ExternalLoad__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__10__Impl_in_rule__ExternalLoad__Group__109322);
            rule__ExternalLoad__Group__10__Impl();

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
    // $ANTLR end "rule__ExternalLoad__Group__10"


    // $ANTLR start "rule__ExternalLoad__Group__10__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4664:1: rule__ExternalLoad__Group__10__Impl : ( ( rule__ExternalLoad__RelTrans2Assignment_10 ) ) ;
    public final void rule__ExternalLoad__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4668:1: ( ( ( rule__ExternalLoad__RelTrans2Assignment_10 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4669:1: ( ( rule__ExternalLoad__RelTrans2Assignment_10 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4669:1: ( ( rule__ExternalLoad__RelTrans2Assignment_10 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4670:1: ( rule__ExternalLoad__RelTrans2Assignment_10 )
            {
             before(grammarAccess.getExternalLoadAccess().getRelTrans2Assignment_10()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4671:1: ( rule__ExternalLoad__RelTrans2Assignment_10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4671:2: rule__ExternalLoad__RelTrans2Assignment_10
            {
            pushFollow(FOLLOW_rule__ExternalLoad__RelTrans2Assignment_10_in_rule__ExternalLoad__Group__10__Impl9349);
            rule__ExternalLoad__RelTrans2Assignment_10();

            state._fsp--;


            }

             after(grammarAccess.getExternalLoadAccess().getRelTrans2Assignment_10()); 

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
    // $ANTLR end "rule__ExternalLoad__Group__10__Impl"


    // $ANTLR start "rule__BaseMatrix__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4703:1: rule__BaseMatrix__Group__0 : rule__BaseMatrix__Group__0__Impl rule__BaseMatrix__Group__1 ;
    public final void rule__BaseMatrix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4707:1: ( rule__BaseMatrix__Group__0__Impl rule__BaseMatrix__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4708:2: rule__BaseMatrix__Group__0__Impl rule__BaseMatrix__Group__1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__0__Impl_in_rule__BaseMatrix__Group__09401);
            rule__BaseMatrix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group__1_in_rule__BaseMatrix__Group__09404);
            rule__BaseMatrix__Group__1();

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
    // $ANTLR end "rule__BaseMatrix__Group__0"


    // $ANTLR start "rule__BaseMatrix__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4715:1: rule__BaseMatrix__Group__0__Impl : ( ( rule__BaseMatrix__Group_0__0 )? ) ;
    public final void rule__BaseMatrix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4719:1: ( ( ( rule__BaseMatrix__Group_0__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4720:1: ( ( rule__BaseMatrix__Group_0__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4720:1: ( ( rule__BaseMatrix__Group_0__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4721:1: ( rule__BaseMatrix__Group_0__0 )?
            {
             before(grammarAccess.getBaseMatrixAccess().getGroup_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4722:1: ( rule__BaseMatrix__Group_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==57) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4722:2: rule__BaseMatrix__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BaseMatrix__Group_0__0_in_rule__BaseMatrix__Group__0__Impl9431);
                    rule__BaseMatrix__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseMatrixAccess().getGroup_0()); 

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
    // $ANTLR end "rule__BaseMatrix__Group__0__Impl"


    // $ANTLR start "rule__BaseMatrix__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4732:1: rule__BaseMatrix__Group__1 : rule__BaseMatrix__Group__1__Impl rule__BaseMatrix__Group__2 ;
    public final void rule__BaseMatrix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4736:1: ( rule__BaseMatrix__Group__1__Impl rule__BaseMatrix__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4737:2: rule__BaseMatrix__Group__1__Impl rule__BaseMatrix__Group__2
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__1__Impl_in_rule__BaseMatrix__Group__19462);
            rule__BaseMatrix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group__2_in_rule__BaseMatrix__Group__19465);
            rule__BaseMatrix__Group__2();

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
    // $ANTLR end "rule__BaseMatrix__Group__1"


    // $ANTLR start "rule__BaseMatrix__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4744:1: rule__BaseMatrix__Group__1__Impl : ( '[' ) ;
    public final void rule__BaseMatrix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4748:1: ( ( '[' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4749:1: ( '[' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4749:1: ( '[' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4750:1: '['
            {
             before(grammarAccess.getBaseMatrixAccess().getLeftSquareBracketKeyword_1()); 
            match(input,55,FOLLOW_55_in_rule__BaseMatrix__Group__1__Impl9493); 
             after(grammarAccess.getBaseMatrixAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__BaseMatrix__Group__1__Impl"


    // $ANTLR start "rule__BaseMatrix__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4763:1: rule__BaseMatrix__Group__2 : rule__BaseMatrix__Group__2__Impl rule__BaseMatrix__Group__3 ;
    public final void rule__BaseMatrix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4767:1: ( rule__BaseMatrix__Group__2__Impl rule__BaseMatrix__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4768:2: rule__BaseMatrix__Group__2__Impl rule__BaseMatrix__Group__3
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__2__Impl_in_rule__BaseMatrix__Group__29524);
            rule__BaseMatrix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group__3_in_rule__BaseMatrix__Group__29527);
            rule__BaseMatrix__Group__3();

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
    // $ANTLR end "rule__BaseMatrix__Group__2"


    // $ANTLR start "rule__BaseMatrix__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4775:1: rule__BaseMatrix__Group__2__Impl : ( ( rule__BaseMatrix__ValuesAssignment_2 ) ) ;
    public final void rule__BaseMatrix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4779:1: ( ( ( rule__BaseMatrix__ValuesAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4780:1: ( ( rule__BaseMatrix__ValuesAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4780:1: ( ( rule__BaseMatrix__ValuesAssignment_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4781:1: ( rule__BaseMatrix__ValuesAssignment_2 )
            {
             before(grammarAccess.getBaseMatrixAccess().getValuesAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4782:1: ( rule__BaseMatrix__ValuesAssignment_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4782:2: rule__BaseMatrix__ValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__BaseMatrix__ValuesAssignment_2_in_rule__BaseMatrix__Group__2__Impl9554);
            rule__BaseMatrix__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBaseMatrixAccess().getValuesAssignment_2()); 

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
    // $ANTLR end "rule__BaseMatrix__Group__2__Impl"


    // $ANTLR start "rule__BaseMatrix__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4792:1: rule__BaseMatrix__Group__3 : rule__BaseMatrix__Group__3__Impl rule__BaseMatrix__Group__4 ;
    public final void rule__BaseMatrix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4796:1: ( rule__BaseMatrix__Group__3__Impl rule__BaseMatrix__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4797:2: rule__BaseMatrix__Group__3__Impl rule__BaseMatrix__Group__4
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__3__Impl_in_rule__BaseMatrix__Group__39584);
            rule__BaseMatrix__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group__4_in_rule__BaseMatrix__Group__39587);
            rule__BaseMatrix__Group__4();

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
    // $ANTLR end "rule__BaseMatrix__Group__3"


    // $ANTLR start "rule__BaseMatrix__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4804:1: rule__BaseMatrix__Group__3__Impl : ( ( rule__BaseMatrix__Group_3__0 )* ) ;
    public final void rule__BaseMatrix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4808:1: ( ( ( rule__BaseMatrix__Group_3__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4809:1: ( ( rule__BaseMatrix__Group_3__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4809:1: ( ( rule__BaseMatrix__Group_3__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4810:1: ( rule__BaseMatrix__Group_3__0 )*
            {
             before(grammarAccess.getBaseMatrixAccess().getGroup_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4811:1: ( rule__BaseMatrix__Group_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==46) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4811:2: rule__BaseMatrix__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__BaseMatrix__Group_3__0_in_rule__BaseMatrix__Group__3__Impl9614);
            	    rule__BaseMatrix__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getBaseMatrixAccess().getGroup_3()); 

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
    // $ANTLR end "rule__BaseMatrix__Group__3__Impl"


    // $ANTLR start "rule__BaseMatrix__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4821:1: rule__BaseMatrix__Group__4 : rule__BaseMatrix__Group__4__Impl ;
    public final void rule__BaseMatrix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4825:1: ( rule__BaseMatrix__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4826:2: rule__BaseMatrix__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__4__Impl_in_rule__BaseMatrix__Group__49645);
            rule__BaseMatrix__Group__4__Impl();

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
    // $ANTLR end "rule__BaseMatrix__Group__4"


    // $ANTLR start "rule__BaseMatrix__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4832:1: rule__BaseMatrix__Group__4__Impl : ( ']' ) ;
    public final void rule__BaseMatrix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4836:1: ( ( ']' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4837:1: ( ']' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4837:1: ( ']' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4838:1: ']'
            {
             before(grammarAccess.getBaseMatrixAccess().getRightSquareBracketKeyword_4()); 
            match(input,56,FOLLOW_56_in_rule__BaseMatrix__Group__4__Impl9673); 
             after(grammarAccess.getBaseMatrixAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__BaseMatrix__Group__4__Impl"


    // $ANTLR start "rule__BaseMatrix__Group_0__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4861:1: rule__BaseMatrix__Group_0__0 : rule__BaseMatrix__Group_0__0__Impl rule__BaseMatrix__Group_0__1 ;
    public final void rule__BaseMatrix__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4865:1: ( rule__BaseMatrix__Group_0__0__Impl rule__BaseMatrix__Group_0__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4866:2: rule__BaseMatrix__Group_0__0__Impl rule__BaseMatrix__Group_0__1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group_0__0__Impl_in_rule__BaseMatrix__Group_0__09714);
            rule__BaseMatrix__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group_0__1_in_rule__BaseMatrix__Group_0__09717);
            rule__BaseMatrix__Group_0__1();

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
    // $ANTLR end "rule__BaseMatrix__Group_0__0"


    // $ANTLR start "rule__BaseMatrix__Group_0__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4873:1: rule__BaseMatrix__Group_0__0__Impl : ( 'matrix' ) ;
    public final void rule__BaseMatrix__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4877:1: ( ( 'matrix' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4878:1: ( 'matrix' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4878:1: ( 'matrix' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4879:1: 'matrix'
            {
             before(grammarAccess.getBaseMatrixAccess().getMatrixKeyword_0_0()); 
            match(input,57,FOLLOW_57_in_rule__BaseMatrix__Group_0__0__Impl9745); 
             after(grammarAccess.getBaseMatrixAccess().getMatrixKeyword_0_0()); 

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
    // $ANTLR end "rule__BaseMatrix__Group_0__0__Impl"


    // $ANTLR start "rule__BaseMatrix__Group_0__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4892:1: rule__BaseMatrix__Group_0__1 : rule__BaseMatrix__Group_0__1__Impl ;
    public final void rule__BaseMatrix__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4896:1: ( rule__BaseMatrix__Group_0__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4897:2: rule__BaseMatrix__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group_0__1__Impl_in_rule__BaseMatrix__Group_0__19776);
            rule__BaseMatrix__Group_0__1__Impl();

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
    // $ANTLR end "rule__BaseMatrix__Group_0__1"


    // $ANTLR start "rule__BaseMatrix__Group_0__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4903:1: rule__BaseMatrix__Group_0__1__Impl : ( ( rule__BaseMatrix__NameAssignment_0_1 ) ) ;
    public final void rule__BaseMatrix__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4907:1: ( ( ( rule__BaseMatrix__NameAssignment_0_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4908:1: ( ( rule__BaseMatrix__NameAssignment_0_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4908:1: ( ( rule__BaseMatrix__NameAssignment_0_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4909:1: ( rule__BaseMatrix__NameAssignment_0_1 )
            {
             before(grammarAccess.getBaseMatrixAccess().getNameAssignment_0_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4910:1: ( rule__BaseMatrix__NameAssignment_0_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4910:2: rule__BaseMatrix__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__NameAssignment_0_1_in_rule__BaseMatrix__Group_0__1__Impl9803);
            rule__BaseMatrix__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseMatrixAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__BaseMatrix__Group_0__1__Impl"


    // $ANTLR start "rule__BaseMatrix__Group_3__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4924:1: rule__BaseMatrix__Group_3__0 : rule__BaseMatrix__Group_3__0__Impl rule__BaseMatrix__Group_3__1 ;
    public final void rule__BaseMatrix__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4928:1: ( rule__BaseMatrix__Group_3__0__Impl rule__BaseMatrix__Group_3__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4929:2: rule__BaseMatrix__Group_3__0__Impl rule__BaseMatrix__Group_3__1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group_3__0__Impl_in_rule__BaseMatrix__Group_3__09837);
            rule__BaseMatrix__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group_3__1_in_rule__BaseMatrix__Group_3__09840);
            rule__BaseMatrix__Group_3__1();

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
    // $ANTLR end "rule__BaseMatrix__Group_3__0"


    // $ANTLR start "rule__BaseMatrix__Group_3__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4936:1: rule__BaseMatrix__Group_3__0__Impl : ( ',' ) ;
    public final void rule__BaseMatrix__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4940:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4941:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4941:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4942:1: ','
            {
             before(grammarAccess.getBaseMatrixAccess().getCommaKeyword_3_0()); 
            match(input,46,FOLLOW_46_in_rule__BaseMatrix__Group_3__0__Impl9868); 
             after(grammarAccess.getBaseMatrixAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__BaseMatrix__Group_3__0__Impl"


    // $ANTLR start "rule__BaseMatrix__Group_3__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4955:1: rule__BaseMatrix__Group_3__1 : rule__BaseMatrix__Group_3__1__Impl ;
    public final void rule__BaseMatrix__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4959:1: ( rule__BaseMatrix__Group_3__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4960:2: rule__BaseMatrix__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group_3__1__Impl_in_rule__BaseMatrix__Group_3__19899);
            rule__BaseMatrix__Group_3__1__Impl();

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
    // $ANTLR end "rule__BaseMatrix__Group_3__1"


    // $ANTLR start "rule__BaseMatrix__Group_3__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4966:1: rule__BaseMatrix__Group_3__1__Impl : ( ( rule__BaseMatrix__ValuesAssignment_3_1 ) ) ;
    public final void rule__BaseMatrix__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4970:1: ( ( ( rule__BaseMatrix__ValuesAssignment_3_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4971:1: ( ( rule__BaseMatrix__ValuesAssignment_3_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4971:1: ( ( rule__BaseMatrix__ValuesAssignment_3_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4972:1: ( rule__BaseMatrix__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getBaseMatrixAccess().getValuesAssignment_3_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4973:1: ( rule__BaseMatrix__ValuesAssignment_3_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4973:2: rule__BaseMatrix__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__ValuesAssignment_3_1_in_rule__BaseMatrix__Group_3__1__Impl9926);
            rule__BaseMatrix__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseMatrixAccess().getValuesAssignment_3_1()); 

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
    // $ANTLR end "rule__BaseMatrix__Group_3__1__Impl"


    // $ANTLR start "rule__AddExp__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4987:1: rule__AddExp__Group__0 : rule__AddExp__Group__0__Impl rule__AddExp__Group__1 ;
    public final void rule__AddExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4991:1: ( rule__AddExp__Group__0__Impl rule__AddExp__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4992:2: rule__AddExp__Group__0__Impl rule__AddExp__Group__1
            {
            pushFollow(FOLLOW_rule__AddExp__Group__0__Impl_in_rule__AddExp__Group__09960);
            rule__AddExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddExp__Group__1_in_rule__AddExp__Group__09963);
            rule__AddExp__Group__1();

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
    // $ANTLR end "rule__AddExp__Group__0"


    // $ANTLR start "rule__AddExp__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4999:1: rule__AddExp__Group__0__Impl : ( ruleMultExp ) ;
    public final void rule__AddExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5003:1: ( ( ruleMultExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5004:1: ( ruleMultExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5004:1: ( ruleMultExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5005:1: ruleMultExp
            {
             before(grammarAccess.getAddExpAccess().getMultExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultExp_in_rule__AddExp__Group__0__Impl9990);
            ruleMultExp();

            state._fsp--;

             after(grammarAccess.getAddExpAccess().getMultExpParserRuleCall_0()); 

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
    // $ANTLR end "rule__AddExp__Group__0__Impl"


    // $ANTLR start "rule__AddExp__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5016:1: rule__AddExp__Group__1 : rule__AddExp__Group__1__Impl ;
    public final void rule__AddExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5020:1: ( rule__AddExp__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5021:2: rule__AddExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AddExp__Group__1__Impl_in_rule__AddExp__Group__110019);
            rule__AddExp__Group__1__Impl();

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
    // $ANTLR end "rule__AddExp__Group__1"


    // $ANTLR start "rule__AddExp__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5027:1: rule__AddExp__Group__1__Impl : ( ( rule__AddExp__Group_1__0 )* ) ;
    public final void rule__AddExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5031:1: ( ( ( rule__AddExp__Group_1__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5032:1: ( ( rule__AddExp__Group_1__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5032:1: ( ( rule__AddExp__Group_1__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5033:1: ( rule__AddExp__Group_1__0 )*
            {
             before(grammarAccess.getAddExpAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5034:1: ( rule__AddExp__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=12 && LA22_0<=13)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5034:2: rule__AddExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AddExp__Group_1__0_in_rule__AddExp__Group__1__Impl10046);
            	    rule__AddExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAddExpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AddExp__Group__1__Impl"


    // $ANTLR start "rule__AddExp__Group_1__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5048:1: rule__AddExp__Group_1__0 : rule__AddExp__Group_1__0__Impl rule__AddExp__Group_1__1 ;
    public final void rule__AddExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5052:1: ( rule__AddExp__Group_1__0__Impl rule__AddExp__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5053:2: rule__AddExp__Group_1__0__Impl rule__AddExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AddExp__Group_1__0__Impl_in_rule__AddExp__Group_1__010081);
            rule__AddExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddExp__Group_1__1_in_rule__AddExp__Group_1__010084);
            rule__AddExp__Group_1__1();

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
    // $ANTLR end "rule__AddExp__Group_1__0"


    // $ANTLR start "rule__AddExp__Group_1__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5060:1: rule__AddExp__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5064:1: ( ( () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5065:1: ( () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5065:1: ( () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5066:1: ()
            {
             before(grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5067:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5069:1: 
            {
            }

             after(grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExp__Group_1__0__Impl"


    // $ANTLR start "rule__AddExp__Group_1__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5079:1: rule__AddExp__Group_1__1 : rule__AddExp__Group_1__1__Impl rule__AddExp__Group_1__2 ;
    public final void rule__AddExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5083:1: ( rule__AddExp__Group_1__1__Impl rule__AddExp__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5084:2: rule__AddExp__Group_1__1__Impl rule__AddExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__AddExp__Group_1__1__Impl_in_rule__AddExp__Group_1__110142);
            rule__AddExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddExp__Group_1__2_in_rule__AddExp__Group_1__110145);
            rule__AddExp__Group_1__2();

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
    // $ANTLR end "rule__AddExp__Group_1__1"


    // $ANTLR start "rule__AddExp__Group_1__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5091:1: rule__AddExp__Group_1__1__Impl : ( ( rule__AddExp__OpAssignment_1_1 ) ) ;
    public final void rule__AddExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5095:1: ( ( ( rule__AddExp__OpAssignment_1_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5096:1: ( ( rule__AddExp__OpAssignment_1_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5096:1: ( ( rule__AddExp__OpAssignment_1_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5097:1: ( rule__AddExp__OpAssignment_1_1 )
            {
             before(grammarAccess.getAddExpAccess().getOpAssignment_1_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5098:1: ( rule__AddExp__OpAssignment_1_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5098:2: rule__AddExp__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AddExp__OpAssignment_1_1_in_rule__AddExp__Group_1__1__Impl10172);
            rule__AddExp__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddExpAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__AddExp__Group_1__1__Impl"


    // $ANTLR start "rule__AddExp__Group_1__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5108:1: rule__AddExp__Group_1__2 : rule__AddExp__Group_1__2__Impl ;
    public final void rule__AddExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5112:1: ( rule__AddExp__Group_1__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5113:2: rule__AddExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AddExp__Group_1__2__Impl_in_rule__AddExp__Group_1__210202);
            rule__AddExp__Group_1__2__Impl();

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
    // $ANTLR end "rule__AddExp__Group_1__2"


    // $ANTLR start "rule__AddExp__Group_1__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5119:1: rule__AddExp__Group_1__2__Impl : ( ( rule__AddExp__RightAssignment_1_2 ) ) ;
    public final void rule__AddExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5123:1: ( ( ( rule__AddExp__RightAssignment_1_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5124:1: ( ( rule__AddExp__RightAssignment_1_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5124:1: ( ( rule__AddExp__RightAssignment_1_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5125:1: ( rule__AddExp__RightAssignment_1_2 )
            {
             before(grammarAccess.getAddExpAccess().getRightAssignment_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5126:1: ( rule__AddExp__RightAssignment_1_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5126:2: rule__AddExp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AddExp__RightAssignment_1_2_in_rule__AddExp__Group_1__2__Impl10229);
            rule__AddExp__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAddExpAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AddExp__Group_1__2__Impl"


    // $ANTLR start "rule__MultExp__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5142:1: rule__MultExp__Group__0 : rule__MultExp__Group__0__Impl rule__MultExp__Group__1 ;
    public final void rule__MultExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5146:1: ( rule__MultExp__Group__0__Impl rule__MultExp__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5147:2: rule__MultExp__Group__0__Impl rule__MultExp__Group__1
            {
            pushFollow(FOLLOW_rule__MultExp__Group__0__Impl_in_rule__MultExp__Group__010265);
            rule__MultExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultExp__Group__1_in_rule__MultExp__Group__010268);
            rule__MultExp__Group__1();

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
    // $ANTLR end "rule__MultExp__Group__0"


    // $ANTLR start "rule__MultExp__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5154:1: rule__MultExp__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MultExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5158:1: ( ( rulePrimary ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5159:1: ( rulePrimary )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5159:1: ( rulePrimary )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5160:1: rulePrimary
            {
             before(grammarAccess.getMultExpAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MultExp__Group__0__Impl10295);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultExpAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__MultExp__Group__0__Impl"


    // $ANTLR start "rule__MultExp__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5171:1: rule__MultExp__Group__1 : rule__MultExp__Group__1__Impl ;
    public final void rule__MultExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5175:1: ( rule__MultExp__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5176:2: rule__MultExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultExp__Group__1__Impl_in_rule__MultExp__Group__110324);
            rule__MultExp__Group__1__Impl();

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
    // $ANTLR end "rule__MultExp__Group__1"


    // $ANTLR start "rule__MultExp__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5182:1: rule__MultExp__Group__1__Impl : ( ( rule__MultExp__Group_1__0 )* ) ;
    public final void rule__MultExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5186:1: ( ( ( rule__MultExp__Group_1__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5187:1: ( ( rule__MultExp__Group_1__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5187:1: ( ( rule__MultExp__Group_1__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5188:1: ( rule__MultExp__Group_1__0 )*
            {
             before(grammarAccess.getMultExpAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5189:1: ( rule__MultExp__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=14 && LA23_0<=15)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5189:2: rule__MultExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultExp__Group_1__0_in_rule__MultExp__Group__1__Impl10351);
            	    rule__MultExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMultExpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MultExp__Group__1__Impl"


    // $ANTLR start "rule__MultExp__Group_1__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5203:1: rule__MultExp__Group_1__0 : rule__MultExp__Group_1__0__Impl rule__MultExp__Group_1__1 ;
    public final void rule__MultExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5207:1: ( rule__MultExp__Group_1__0__Impl rule__MultExp__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5208:2: rule__MultExp__Group_1__0__Impl rule__MultExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultExp__Group_1__0__Impl_in_rule__MultExp__Group_1__010386);
            rule__MultExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultExp__Group_1__1_in_rule__MultExp__Group_1__010389);
            rule__MultExp__Group_1__1();

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
    // $ANTLR end "rule__MultExp__Group_1__0"


    // $ANTLR start "rule__MultExp__Group_1__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5215:1: rule__MultExp__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5219:1: ( ( () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5220:1: ( () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5220:1: ( () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5221:1: ()
            {
             before(grammarAccess.getMultExpAccess().getMultExpLeftAction_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5222:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5224:1: 
            {
            }

             after(grammarAccess.getMultExpAccess().getMultExpLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExp__Group_1__0__Impl"


    // $ANTLR start "rule__MultExp__Group_1__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5234:1: rule__MultExp__Group_1__1 : rule__MultExp__Group_1__1__Impl rule__MultExp__Group_1__2 ;
    public final void rule__MultExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5238:1: ( rule__MultExp__Group_1__1__Impl rule__MultExp__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5239:2: rule__MultExp__Group_1__1__Impl rule__MultExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultExp__Group_1__1__Impl_in_rule__MultExp__Group_1__110447);
            rule__MultExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultExp__Group_1__2_in_rule__MultExp__Group_1__110450);
            rule__MultExp__Group_1__2();

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
    // $ANTLR end "rule__MultExp__Group_1__1"


    // $ANTLR start "rule__MultExp__Group_1__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5246:1: rule__MultExp__Group_1__1__Impl : ( ( rule__MultExp__OpAssignment_1_1 ) ) ;
    public final void rule__MultExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5250:1: ( ( ( rule__MultExp__OpAssignment_1_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5251:1: ( ( rule__MultExp__OpAssignment_1_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5251:1: ( ( rule__MultExp__OpAssignment_1_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5252:1: ( rule__MultExp__OpAssignment_1_1 )
            {
             before(grammarAccess.getMultExpAccess().getOpAssignment_1_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5253:1: ( rule__MultExp__OpAssignment_1_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5253:2: rule__MultExp__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultExp__OpAssignment_1_1_in_rule__MultExp__Group_1__1__Impl10477);
            rule__MultExp__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultExpAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__MultExp__Group_1__1__Impl"


    // $ANTLR start "rule__MultExp__Group_1__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5263:1: rule__MultExp__Group_1__2 : rule__MultExp__Group_1__2__Impl ;
    public final void rule__MultExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5267:1: ( rule__MultExp__Group_1__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5268:2: rule__MultExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultExp__Group_1__2__Impl_in_rule__MultExp__Group_1__210507);
            rule__MultExp__Group_1__2__Impl();

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
    // $ANTLR end "rule__MultExp__Group_1__2"


    // $ANTLR start "rule__MultExp__Group_1__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5274:1: rule__MultExp__Group_1__2__Impl : ( ( rule__MultExp__RightAssignment_1_2 ) ) ;
    public final void rule__MultExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5278:1: ( ( ( rule__MultExp__RightAssignment_1_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5279:1: ( ( rule__MultExp__RightAssignment_1_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5279:1: ( ( rule__MultExp__RightAssignment_1_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5280:1: ( rule__MultExp__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultExpAccess().getRightAssignment_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5281:1: ( rule__MultExp__RightAssignment_1_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5281:2: rule__MultExp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MultExp__RightAssignment_1_2_in_rule__MultExp__Group_1__2__Impl10534);
            rule__MultExp__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultExpAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__MultExp__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5297:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5301:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5302:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__010570);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__010573);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5309:1: rule__Primary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5313:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5314:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5314:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5315:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Primary__Group_1__0__Impl10601); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5328:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5332:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5333:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__110632);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__110635);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5340:1: rule__Primary__Group_1__1__Impl : ( ruleAddExp ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5344:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5345:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5345:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5346:1: ruleAddExp
            {
             before(grammarAccess.getPrimaryAccess().getAddExpParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__Primary__Group_1__1__Impl10662);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAddExpParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5357:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5361:1: ( rule__Primary__Group_1__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5362:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__210691);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5368:1: rule__Primary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5372:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5373:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5373:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5374:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,45,FOLLOW_45_in_rule__Primary__Group_1__2__Impl10719); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5393:1: rule__ConstantOrFunctionCallExp__Group__0 : rule__ConstantOrFunctionCallExp__Group__0__Impl rule__ConstantOrFunctionCallExp__Group__1 ;
    public final void rule__ConstantOrFunctionCallExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5397:1: ( rule__ConstantOrFunctionCallExp__Group__0__Impl rule__ConstantOrFunctionCallExp__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5398:2: rule__ConstantOrFunctionCallExp__Group__0__Impl rule__ConstantOrFunctionCallExp__Group__1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group__0__Impl_in_rule__ConstantOrFunctionCallExp__Group__010756);
            rule__ConstantOrFunctionCallExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group__1_in_rule__ConstantOrFunctionCallExp__Group__010759);
            rule__ConstantOrFunctionCallExp__Group__1();

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group__0"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5405:1: rule__ConstantOrFunctionCallExp__Group__0__Impl : ( ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 ) ) ;
    public final void rule__ConstantOrFunctionCallExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5409:1: ( ( ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5410:1: ( ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5410:1: ( ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5411:1: ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 )
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getLabelAssignment_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5412:1: ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5412:2: rule__ConstantOrFunctionCallExp__LabelAssignment_0
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__LabelAssignment_0_in_rule__ConstantOrFunctionCallExp__Group__0__Impl10786);
            rule__ConstantOrFunctionCallExp__LabelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstantOrFunctionCallExpAccess().getLabelAssignment_0()); 

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group__0__Impl"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5422:1: rule__ConstantOrFunctionCallExp__Group__1 : rule__ConstantOrFunctionCallExp__Group__1__Impl ;
    public final void rule__ConstantOrFunctionCallExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5426:1: ( rule__ConstantOrFunctionCallExp__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5427:2: rule__ConstantOrFunctionCallExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group__1__Impl_in_rule__ConstantOrFunctionCallExp__Group__110816);
            rule__ConstantOrFunctionCallExp__Group__1__Impl();

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group__1"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5433:1: rule__ConstantOrFunctionCallExp__Group__1__Impl : ( ( rule__ConstantOrFunctionCallExp__Group_1__0 )? ) ;
    public final void rule__ConstantOrFunctionCallExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5437:1: ( ( ( rule__ConstantOrFunctionCallExp__Group_1__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5438:1: ( ( rule__ConstantOrFunctionCallExp__Group_1__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5438:1: ( ( rule__ConstantOrFunctionCallExp__Group_1__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5439:1: ( rule__ConstantOrFunctionCallExp__Group_1__0 )?
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5440:1: ( rule__ConstantOrFunctionCallExp__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5440:2: rule__ConstantOrFunctionCallExp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__0_in_rule__ConstantOrFunctionCallExp__Group__1__Impl10843);
                    rule__ConstantOrFunctionCallExp__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group__1__Impl"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group_1__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5454:1: rule__ConstantOrFunctionCallExp__Group_1__0 : rule__ConstantOrFunctionCallExp__Group_1__0__Impl rule__ConstantOrFunctionCallExp__Group_1__1 ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5458:1: ( rule__ConstantOrFunctionCallExp__Group_1__0__Impl rule__ConstantOrFunctionCallExp__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5459:2: rule__ConstantOrFunctionCallExp__Group_1__0__Impl rule__ConstantOrFunctionCallExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__0__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__010878);
            rule__ConstantOrFunctionCallExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__1_in_rule__ConstantOrFunctionCallExp__Group_1__010881);
            rule__ConstantOrFunctionCallExp__Group_1__1();

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group_1__0"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group_1__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5466:1: rule__ConstantOrFunctionCallExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5470:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5471:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5471:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5472:1: '('
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__ConstantOrFunctionCallExp__Group_1__0__Impl10909); 
             after(grammarAccess.getConstantOrFunctionCallExpAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group_1__0__Impl"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group_1__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5485:1: rule__ConstantOrFunctionCallExp__Group_1__1 : rule__ConstantOrFunctionCallExp__Group_1__1__Impl rule__ConstantOrFunctionCallExp__Group_1__2 ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5489:1: ( rule__ConstantOrFunctionCallExp__Group_1__1__Impl rule__ConstantOrFunctionCallExp__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5490:2: rule__ConstantOrFunctionCallExp__Group_1__1__Impl rule__ConstantOrFunctionCallExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__1__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__110940);
            rule__ConstantOrFunctionCallExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__2_in_rule__ConstantOrFunctionCallExp__Group_1__110943);
            rule__ConstantOrFunctionCallExp__Group_1__2();

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group_1__1"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group_1__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5497:1: rule__ConstantOrFunctionCallExp__Group_1__1__Impl : ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 ) ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5501:1: ( ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5502:1: ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5502:1: ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5503:1: ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 )
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAssignment_1_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5504:1: ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5504:2: rule__ConstantOrFunctionCallExp__ParamAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__ParamAssignment_1_1_in_rule__ConstantOrFunctionCallExp__Group_1__1__Impl10970);
            rule__ConstantOrFunctionCallExp__ParamAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAssignment_1_1()); 

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group_1__1__Impl"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group_1__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5514:1: rule__ConstantOrFunctionCallExp__Group_1__2 : rule__ConstantOrFunctionCallExp__Group_1__2__Impl rule__ConstantOrFunctionCallExp__Group_1__3 ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5518:1: ( rule__ConstantOrFunctionCallExp__Group_1__2__Impl rule__ConstantOrFunctionCallExp__Group_1__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5519:2: rule__ConstantOrFunctionCallExp__Group_1__2__Impl rule__ConstantOrFunctionCallExp__Group_1__3
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__2__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__211000);
            rule__ConstantOrFunctionCallExp__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__3_in_rule__ConstantOrFunctionCallExp__Group_1__211003);
            rule__ConstantOrFunctionCallExp__Group_1__3();

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group_1__2"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group_1__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5526:1: rule__ConstantOrFunctionCallExp__Group_1__2__Impl : ( ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )* ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5530:1: ( ( ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5531:1: ( ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5531:1: ( ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5532:1: ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )*
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5533:1: ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==46) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5533:2: rule__ConstantOrFunctionCallExp__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__0_in_rule__ConstantOrFunctionCallExp__Group_1__2__Impl11030);
            	    rule__ConstantOrFunctionCallExp__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group_1__2__Impl"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group_1__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5543:1: rule__ConstantOrFunctionCallExp__Group_1__3 : rule__ConstantOrFunctionCallExp__Group_1__3__Impl ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5547:1: ( rule__ConstantOrFunctionCallExp__Group_1__3__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5548:2: rule__ConstantOrFunctionCallExp__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__3__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__311061);
            rule__ConstantOrFunctionCallExp__Group_1__3__Impl();

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group_1__3"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group_1__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5554:1: rule__ConstantOrFunctionCallExp__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5558:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5559:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5559:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5560:1: ')'
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getRightParenthesisKeyword_1_3()); 
            match(input,45,FOLLOW_45_in_rule__ConstantOrFunctionCallExp__Group_1__3__Impl11089); 
             after(grammarAccess.getConstantOrFunctionCallExpAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group_1__3__Impl"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group_1_2__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5581:1: rule__ConstantOrFunctionCallExp__Group_1_2__0 : rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl rule__ConstantOrFunctionCallExp__Group_1_2__1 ;
    public final void rule__ConstantOrFunctionCallExp__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5585:1: ( rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl rule__ConstantOrFunctionCallExp__Group_1_2__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5586:2: rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl rule__ConstantOrFunctionCallExp__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl_in_rule__ConstantOrFunctionCallExp__Group_1_2__011128);
            rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__1_in_rule__ConstantOrFunctionCallExp__Group_1_2__011131);
            rule__ConstantOrFunctionCallExp__Group_1_2__1();

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group_1_2__0"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5593:1: rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5597:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5598:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5598:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5599:1: ','
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getCommaKeyword_1_2_0()); 
            match(input,46,FOLLOW_46_in_rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl11159); 
             after(grammarAccess.getConstantOrFunctionCallExpAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group_1_2__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5612:1: rule__ConstantOrFunctionCallExp__Group_1_2__1 : rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl ;
    public final void rule__ConstantOrFunctionCallExp__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5616:1: ( rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5617:2: rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl_in_rule__ConstantOrFunctionCallExp__Group_1_2__111190);
            rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group_1_2__1"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5623:1: rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl : ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 ) ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5627:1: ( ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5628:1: ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5628:1: ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5629:1: ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 )
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAssignment_1_2_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5630:1: ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5630:2: rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1_in_rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl11217);
            rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAssignment_1_2_1()); 

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5644:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5648:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5649:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__0__Impl_in_rule__NumberLiteral__Group__011251);
            rule__NumberLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberLiteral__Group__1_in_rule__NumberLiteral__Group__011254);
            rule__NumberLiteral__Group__1();

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
    // $ANTLR end "rule__NumberLiteral__Group__0"


    // $ANTLR start "rule__NumberLiteral__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5656:1: rule__NumberLiteral__Group__0__Impl : ( ( rule__NumberLiteral__NegAssignment_0 )? ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5660:1: ( ( ( rule__NumberLiteral__NegAssignment_0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5661:1: ( ( rule__NumberLiteral__NegAssignment_0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5661:1: ( ( rule__NumberLiteral__NegAssignment_0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5662:1: ( rule__NumberLiteral__NegAssignment_0 )?
            {
             before(grammarAccess.getNumberLiteralAccess().getNegAssignment_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5663:1: ( rule__NumberLiteral__NegAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5663:2: rule__NumberLiteral__NegAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NumberLiteral__NegAssignment_0_in_rule__NumberLiteral__Group__0__Impl11281);
                    rule__NumberLiteral__NegAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberLiteralAccess().getNegAssignment_0()); 

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
    // $ANTLR end "rule__NumberLiteral__Group__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5673:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5677:1: ( rule__NumberLiteral__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5678:2: rule__NumberLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__1__Impl_in_rule__NumberLiteral__Group__111312);
            rule__NumberLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__NumberLiteral__Group__1"


    // $ANTLR start "rule__NumberLiteral__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5684:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5688:1: ( ( ( rule__NumberLiteral__ValueAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5689:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5689:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5690:1: ( rule__NumberLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5691:1: ( rule__NumberLiteral__ValueAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5691:2: rule__NumberLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NumberLiteral__ValueAssignment_1_in_rule__NumberLiteral__Group__1__Impl11339);
            rule__NumberLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__NumberLiteral__Group__1__Impl"


    // $ANTLR start "rule__Model__DefsAssignment_0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5706:1: rule__Model__DefsAssignment_0 : ( ruleInitialDefinition ) ;
    public final void rule__Model__DefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5710:1: ( ( ruleInitialDefinition ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5711:1: ( ruleInitialDefinition )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5711:1: ( ruleInitialDefinition )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5712:1: ruleInitialDefinition
            {
             before(grammarAccess.getModelAccess().getDefsInitialDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInitialDefinition_in_rule__Model__DefsAssignment_011378);
            ruleInitialDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDefsInitialDefinitionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__DefsAssignment_0"


    // $ANTLR start "rule__Model__WorldAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5721:1: rule__Model__WorldAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__Model__WorldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5725:1: ( ( ruleEnvironment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5726:1: ( ruleEnvironment )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5726:1: ( ruleEnvironment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5727:1: ruleEnvironment
            {
             before(grammarAccess.getModelAccess().getWorldEnvironmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnvironment_in_rule__Model__WorldAssignment_111409);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getModelAccess().getWorldEnvironmentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__WorldAssignment_1"


    // $ANTLR start "rule__Model__BodiesAssignment_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5736:1: rule__Model__BodiesAssignment_2 : ( ruleSystem ) ;
    public final void rule__Model__BodiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5740:1: ( ( ruleSystem ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5741:1: ( ruleSystem )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5741:1: ( ruleSystem )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5742:1: ruleSystem
            {
             before(grammarAccess.getModelAccess().getBodiesSystemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSystem_in_rule__Model__BodiesAssignment_211440);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBodiesSystemParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__BodiesAssignment_2"


    // $ANTLR start "rule__Environment__GravityAssignment_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5751:1: rule__Environment__GravityAssignment_3 : ( ruleMatrix ) ;
    public final void rule__Environment__GravityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5755:1: ( ( ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5756:1: ( ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5756:1: ( ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5757:1: ruleMatrix
            {
             before(grammarAccess.getEnvironmentAccess().getGravityMatrixParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__Environment__GravityAssignment_311471);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getGravityMatrixParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Environment__GravityAssignment_3"


    // $ANTLR start "rule__System__NameAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5766:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5770:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5771:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5771:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5772:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__NameAssignment_111502); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__ElementsAssignment_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5781:1: rule__System__ElementsAssignment_3 : ( ruleSystemElement ) ;
    public final void rule__System__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5785:1: ( ( ruleSystemElement ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5786:1: ( ruleSystemElement )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5786:1: ( ruleSystemElement )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5787:1: ruleSystemElement
            {
             before(grammarAccess.getSystemAccess().getElementsSystemElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSystemElement_in_rule__System__ElementsAssignment_311533);
            ruleSystemElement();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getElementsSystemElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__System__ElementsAssignment_3"


    // $ANTLR start "rule__Body__NameAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5796:1: rule__Body__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Body__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5800:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5801:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5801:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5802:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__NameAssignment_111564); 
             after(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Body__NameAssignment_1"


    // $ANTLR start "rule__Body__MassAssignment_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5811:1: rule__Body__MassAssignment_3 : ( ruleMass ) ;
    public final void rule__Body__MassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5815:1: ( ( ruleMass ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5816:1: ( ruleMass )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5816:1: ( ruleMass )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5817:1: ruleMass
            {
             before(grammarAccess.getBodyAccess().getMassMassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMass_in_rule__Body__MassAssignment_311595);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getMassMassParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Body__MassAssignment_3"


    // $ANTLR start "rule__Mass__ValueAssignment_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5826:1: rule__Mass__ValueAssignment_3 : ( ruleAddExp ) ;
    public final void rule__Mass__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5830:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5831:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5831:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5832:1: ruleAddExp
            {
             before(grammarAccess.getMassAccess().getValueAddExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__Mass__ValueAssignment_311626);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getMassAccess().getValueAddExpParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Mass__ValueAssignment_3"


    // $ANTLR start "rule__Mass__PositionAssignment_5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5841:1: rule__Mass__PositionAssignment_5 : ( ruleMatrix ) ;
    public final void rule__Mass__PositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5845:1: ( ( ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5846:1: ( ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5846:1: ( ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5847:1: ruleMatrix
            {
             before(grammarAccess.getMassAccess().getPositionMatrixParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__Mass__PositionAssignment_511657);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getMassAccess().getPositionMatrixParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Mass__PositionAssignment_5"


    // $ANTLR start "rule__Mass__InertiaAssignment_7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5856:1: rule__Mass__InertiaAssignment_7 : ( ruleMatrix ) ;
    public final void rule__Mass__InertiaAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5860:1: ( ( ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5861:1: ( ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5861:1: ( ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5862:1: ruleMatrix
            {
             before(grammarAccess.getMassAccess().getInertiaMatrixParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__Mass__InertiaAssignment_711688);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getMassAccess().getInertiaMatrixParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Mass__InertiaAssignment_7"


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5871:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5875:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5876:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5876:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5877:1: RULE_ID
            {
             before(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Joint__NameAssignment_111719); 
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


    // $ANTLR start "rule__Joint__TypeAssignment_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5886:1: rule__Joint__TypeAssignment_3 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5890:1: ( ( ruleJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5891:1: ( ruleJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5891:1: ( ruleJointType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5892:1: ruleJointType
            {
             before(grammarAccess.getJointAccess().getTypeJointTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleJointType_in_rule__Joint__TypeAssignment_311750);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointAccess().getTypeJointTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Joint__TypeAssignment_3"


    // $ANTLR start "rule__Joint__Body1Assignment_5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5901:1: rule__Joint__Body1Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__Body1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5905:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5906:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5906:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5907:1: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getBody1BodyCrossReference_5_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5908:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5909:1: RULE_ID
            {
             before(grammarAccess.getJointAccess().getBody1BodyIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Joint__Body1Assignment_511785); 
             after(grammarAccess.getJointAccess().getBody1BodyIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getJointAccess().getBody1BodyCrossReference_5_0()); 

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
    // $ANTLR end "rule__Joint__Body1Assignment_5"


    // $ANTLR start "rule__Joint__RelTrans1Assignment_6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5920:1: rule__Joint__RelTrans1Assignment_6 : ( ruleRelativeTransformation ) ;
    public final void rule__Joint__RelTrans1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5924:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5925:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5925:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5926:1: ruleRelativeTransformation
            {
             before(grammarAccess.getJointAccess().getRelTrans1RelativeTransformationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__Joint__RelTrans1Assignment_611820);
            ruleRelativeTransformation();

            state._fsp--;

             after(grammarAccess.getJointAccess().getRelTrans1RelativeTransformationParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Joint__RelTrans1Assignment_6"


    // $ANTLR start "rule__Joint__Body2Assignment_8"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5935:1: rule__Joint__Body2Assignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__Body2Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5939:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5940:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5940:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5941:1: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getBody2BodyCrossReference_8_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5942:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5943:1: RULE_ID
            {
             before(grammarAccess.getJointAccess().getBody2BodyIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Joint__Body2Assignment_811855); 
             after(grammarAccess.getJointAccess().getBody2BodyIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getJointAccess().getBody2BodyCrossReference_8_0()); 

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
    // $ANTLR end "rule__Joint__Body2Assignment_8"


    // $ANTLR start "rule__Joint__RelTrans2Assignment_9"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5954:1: rule__Joint__RelTrans2Assignment_9 : ( ruleRelativeTransformation ) ;
    public final void rule__Joint__RelTrans2Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5958:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5959:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5959:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5960:1: ruleRelativeTransformation
            {
             before(grammarAccess.getJointAccess().getRelTrans2RelativeTransformationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__Joint__RelTrans2Assignment_911890);
            ruleRelativeTransformation();

            state._fsp--;

             after(grammarAccess.getJointAccess().getRelTrans2RelativeTransformationParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Joint__RelTrans2Assignment_9"


    // $ANTLR start "rule__Joint__SpringCoeffAssignment_13"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5969:1: rule__Joint__SpringCoeffAssignment_13 : ( ruleAddExp ) ;
    public final void rule__Joint__SpringCoeffAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5973:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5974:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5974:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5975:1: ruleAddExp
            {
             before(grammarAccess.getJointAccess().getSpringCoeffAddExpParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__Joint__SpringCoeffAssignment_1311921);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getJointAccess().getSpringCoeffAddExpParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__Joint__SpringCoeffAssignment_13"


    // $ANTLR start "rule__Joint__SpringInitAssignment_15"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5984:1: rule__Joint__SpringInitAssignment_15 : ( ruleAddExp ) ;
    public final void rule__Joint__SpringInitAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5988:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5989:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5989:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5990:1: ruleAddExp
            {
             before(grammarAccess.getJointAccess().getSpringInitAddExpParserRuleCall_15_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__Joint__SpringInitAssignment_1511952);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getJointAccess().getSpringInitAddExpParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__Joint__SpringInitAssignment_15"


    // $ANTLR start "rule__Joint__DampViscousAssignment_17"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5999:1: rule__Joint__DampViscousAssignment_17 : ( ruleAddExp ) ;
    public final void rule__Joint__DampViscousAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6003:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6004:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6004:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6005:1: ruleAddExp
            {
             before(grammarAccess.getJointAccess().getDampViscousAddExpParserRuleCall_17_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__Joint__DampViscousAssignment_1711983);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getJointAccess().getDampViscousAddExpParserRuleCall_17_0()); 

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
    // $ANTLR end "rule__Joint__DampViscousAssignment_17"


    // $ANTLR start "rule__Joint__DampCoulombAssignment_19"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6014:1: rule__Joint__DampCoulombAssignment_19 : ( ruleAddExp ) ;
    public final void rule__Joint__DampCoulombAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6018:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6019:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6019:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6020:1: ruleAddExp
            {
             before(grammarAccess.getJointAccess().getDampCoulombAddExpParserRuleCall_19_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__Joint__DampCoulombAssignment_1912014);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getJointAccess().getDampCoulombAddExpParserRuleCall_19_0()); 

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
    // $ANTLR end "rule__Joint__DampCoulombAssignment_19"


    // $ANTLR start "rule__JointType__NameAssignment_0_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6029:1: rule__JointType__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__JointType__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6033:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6034:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6034:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6035:1: RULE_ID
            {
             before(grammarAccess.getJointTypeAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JointType__NameAssignment_0_212045); 
             after(grammarAccess.getJointTypeAccess().getNameIDTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__JointType__NameAssignment_0_2"


    // $ANTLR start "rule__JointType__ExpAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6044:1: rule__JointType__ExpAssignment_1 : ( ruleJointTypeExpression ) ;
    public final void rule__JointType__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6048:1: ( ( ruleJointTypeExpression ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6049:1: ( ruleJointTypeExpression )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6049:1: ( ruleJointTypeExpression )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6050:1: ruleJointTypeExpression
            {
             before(grammarAccess.getJointTypeAccess().getExpJointTypeExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJointTypeExpression_in_rule__JointType__ExpAssignment_112076);
            ruleJointTypeExpression();

            state._fsp--;

             after(grammarAccess.getJointTypeAccess().getExpJointTypeExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__JointType__ExpAssignment_1"


    // $ANTLR start "rule__JointTypeExpression__RefAssignment_0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6059:1: rule__JointTypeExpression__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__JointTypeExpression__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6063:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6064:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6064:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6065:1: ( RULE_ID )
            {
             before(grammarAccess.getJointTypeExpressionAccess().getRefJointTypeCrossReference_0_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6066:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6067:1: RULE_ID
            {
             before(grammarAccess.getJointTypeExpressionAccess().getRefJointTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JointTypeExpression__RefAssignment_012111); 
             after(grammarAccess.getJointTypeExpressionAccess().getRefJointTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getJointTypeExpressionAccess().getRefJointTypeCrossReference_0_0()); 

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
    // $ANTLR end "rule__JointTypeExpression__RefAssignment_0"


    // $ANTLR start "rule__JointTypeExpression__AxisAssignment_1_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6078:1: rule__JointTypeExpression__AxisAssignment_1_2 : ( ruleAXIS ) ;
    public final void rule__JointTypeExpression__AxisAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6082:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6083:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6083:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6084:1: ruleAXIS
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_1_212146);
            ruleAXIS();

            state._fsp--;

             after(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__JointTypeExpression__AxisAssignment_1_2"


    // $ANTLR start "rule__JointTypeExpression__AxisAssignment_1_3_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6093:1: rule__JointTypeExpression__AxisAssignment_1_3_1 : ( ruleAXIS ) ;
    public final void rule__JointTypeExpression__AxisAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6097:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6098:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6098:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6099:1: ruleAXIS
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_1_3_112177);
            ruleAXIS();

            state._fsp--;

             after(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_1_3_1_0()); 

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
    // $ANTLR end "rule__JointTypeExpression__AxisAssignment_1_3_1"


    // $ANTLR start "rule__JointTypeExpression__AxisAssignment_2_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6108:1: rule__JointTypeExpression__AxisAssignment_2_2 : ( ruleAXIS ) ;
    public final void rule__JointTypeExpression__AxisAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6112:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6113:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6113:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6114:1: ruleAXIS
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_2_212208);
            ruleAXIS();

            state._fsp--;

             after(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__JointTypeExpression__AxisAssignment_2_2"


    // $ANTLR start "rule__JointTypeExpression__AxisAssignment_2_3_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6123:1: rule__JointTypeExpression__AxisAssignment_2_3_1 : ( ruleAXIS ) ;
    public final void rule__JointTypeExpression__AxisAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6127:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6128:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6128:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6129:1: ruleAXIS
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_2_3_112239);
            ruleAXIS();

            state._fsp--;

             after(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_2_3_1_0()); 

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
    // $ANTLR end "rule__JointTypeExpression__AxisAssignment_2_3_1"


    // $ANTLR start "rule__RelativeTransformation__PositionAssignment_4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6138:1: rule__RelativeTransformation__PositionAssignment_4 : ( ruleMatrix ) ;
    public final void rule__RelativeTransformation__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6142:1: ( ( ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6143:1: ( ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6143:1: ( ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6144:1: ruleMatrix
            {
             before(grammarAccess.getRelativeTransformationAccess().getPositionMatrixParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__RelativeTransformation__PositionAssignment_412270);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getRelativeTransformationAccess().getPositionMatrixParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RelativeTransformation__PositionAssignment_4"


    // $ANTLR start "rule__RelativeTransformation__ReorientAssignment_6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6153:1: rule__RelativeTransformation__ReorientAssignment_6 : ( ruleReorientation ) ;
    public final void rule__RelativeTransformation__ReorientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6157:1: ( ( ruleReorientation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6158:1: ( ruleReorientation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6158:1: ( ruleReorientation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6159:1: ruleReorientation
            {
             before(grammarAccess.getRelativeTransformationAccess().getReorientReorientationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleReorientation_in_rule__RelativeTransformation__ReorientAssignment_612301);
            ruleReorientation();

            state._fsp--;

             after(grammarAccess.getRelativeTransformationAccess().getReorientReorientationParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__RelativeTransformation__ReorientAssignment_6"


    // $ANTLR start "rule__Reorientation__NameAssignment_0_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6168:1: rule__Reorientation__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Reorientation__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6172:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6173:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6173:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6174:1: RULE_ID
            {
             before(grammarAccess.getReorientationAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reorientation__NameAssignment_0_112332); 
             after(grammarAccess.getReorientationAccess().getNameIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Reorientation__NameAssignment_0_1"


    // $ANTLR start "rule__Reorientation__ExpAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6183:1: rule__Reorientation__ExpAssignment_1 : ( ruleReorientExpression ) ;
    public final void rule__Reorientation__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6187:1: ( ( ruleReorientExpression ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6188:1: ( ruleReorientExpression )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6188:1: ( ruleReorientExpression )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6189:1: ruleReorientExpression
            {
             before(grammarAccess.getReorientationAccess().getExpReorientExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReorientExpression_in_rule__Reorientation__ExpAssignment_112363);
            ruleReorientExpression();

            state._fsp--;

             after(grammarAccess.getReorientationAccess().getExpReorientExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Reorientation__ExpAssignment_1"


    // $ANTLR start "rule__ReorientExpression__RefAssignment_0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6198:1: rule__ReorientExpression__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReorientExpression__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6202:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6203:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6203:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6204:1: ( RULE_ID )
            {
             before(grammarAccess.getReorientExpressionAccess().getRefReorientationCrossReference_0_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6205:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6206:1: RULE_ID
            {
             before(grammarAccess.getReorientExpressionAccess().getRefReorientationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReorientExpression__RefAssignment_012398); 
             after(grammarAccess.getReorientExpressionAccess().getRefReorientationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getReorientExpressionAccess().getRefReorientationCrossReference_0_0()); 

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
    // $ANTLR end "rule__ReorientExpression__RefAssignment_0"


    // $ANTLR start "rule__ReorientExpression__AxisAssignment_1_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6217:1: rule__ReorientExpression__AxisAssignment_1_2 : ( ruleAXIS ) ;
    public final void rule__ReorientExpression__AxisAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6221:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6222:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6222:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6223:1: ruleAXIS
            {
             before(grammarAccess.getReorientExpressionAccess().getAxisAXISEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__ReorientExpression__AxisAssignment_1_212433);
            ruleAXIS();

            state._fsp--;

             after(grammarAccess.getReorientExpressionAccess().getAxisAXISEnumRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ReorientExpression__AxisAssignment_1_2"


    // $ANTLR start "rule__ReorientExpression__ValueAssignment_1_4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6232:1: rule__ReorientExpression__ValueAssignment_1_4 : ( ruleAddExp ) ;
    public final void rule__ReorientExpression__ValueAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6236:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6237:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6237:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6238:1: ruleAddExp
            {
             before(grammarAccess.getReorientExpressionAccess().getValueAddExpParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__ReorientExpression__ValueAssignment_1_412464);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getReorientExpressionAccess().getValueAddExpParserRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__ReorientExpression__ValueAssignment_1_4"


    // $ANTLR start "rule__ReorientExpression__AxisAssignment_1_6_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6247:1: rule__ReorientExpression__AxisAssignment_1_6_2 : ( ruleAXIS ) ;
    public final void rule__ReorientExpression__AxisAssignment_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6251:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6252:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6252:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6253:1: ruleAXIS
            {
             before(grammarAccess.getReorientExpressionAccess().getAxisAXISEnumRuleCall_1_6_2_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__ReorientExpression__AxisAssignment_1_6_212495);
            ruleAXIS();

            state._fsp--;

             after(grammarAccess.getReorientExpressionAccess().getAxisAXISEnumRuleCall_1_6_2_0()); 

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
    // $ANTLR end "rule__ReorientExpression__AxisAssignment_1_6_2"


    // $ANTLR start "rule__ReorientExpression__ValueAssignment_1_6_4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6262:1: rule__ReorientExpression__ValueAssignment_1_6_4 : ( ruleAddExp ) ;
    public final void rule__ReorientExpression__ValueAssignment_1_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6266:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6267:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6267:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6268:1: ruleAddExp
            {
             before(grammarAccess.getReorientExpressionAccess().getValueAddExpParserRuleCall_1_6_4_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__ReorientExpression__ValueAssignment_1_6_412526);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getReorientExpressionAccess().getValueAddExpParserRuleCall_1_6_4_0()); 

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
    // $ANTLR end "rule__ReorientExpression__ValueAssignment_1_6_4"


    // $ANTLR start "rule__Constraint__NameAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6277:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6281:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6282:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6282:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6283:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constraint__NameAssignment_112557); 
             after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Constraint__NameAssignment_1"


    // $ANTLR start "rule__Constraint__TypeAssignment_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6292:1: rule__Constraint__TypeAssignment_3 : ( ruleConstraintType ) ;
    public final void rule__Constraint__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6296:1: ( ( ruleConstraintType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6297:1: ( ruleConstraintType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6297:1: ( ruleConstraintType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6298:1: ruleConstraintType
            {
             before(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConstraintType_in_rule__Constraint__TypeAssignment_312588);
            ruleConstraintType();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Constraint__TypeAssignment_3"


    // $ANTLR start "rule__Constraint__Body1Assignment_5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6307:1: rule__Constraint__Body1Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__Body1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6311:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6312:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6312:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6313:1: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getBody1BodyCrossReference_5_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6314:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6315:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getBody1BodyIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constraint__Body1Assignment_512623); 
             after(grammarAccess.getConstraintAccess().getBody1BodyIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getBody1BodyCrossReference_5_0()); 

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
    // $ANTLR end "rule__Constraint__Body1Assignment_5"


    // $ANTLR start "rule__Constraint__RelTrans1Assignment_6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6326:1: rule__Constraint__RelTrans1Assignment_6 : ( ruleRelativeTransformation ) ;
    public final void rule__Constraint__RelTrans1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6330:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6331:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6331:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6332:1: ruleRelativeTransformation
            {
             before(grammarAccess.getConstraintAccess().getRelTrans1RelativeTransformationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__Constraint__RelTrans1Assignment_612658);
            ruleRelativeTransformation();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getRelTrans1RelativeTransformationParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Constraint__RelTrans1Assignment_6"


    // $ANTLR start "rule__Constraint__Body2Assignment_8"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6341:1: rule__Constraint__Body2Assignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__Body2Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6345:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6346:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6346:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6347:1: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getBody2BodyCrossReference_8_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6348:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6349:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getBody2BodyIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constraint__Body2Assignment_812693); 
             after(grammarAccess.getConstraintAccess().getBody2BodyIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getBody2BodyCrossReference_8_0()); 

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
    // $ANTLR end "rule__Constraint__Body2Assignment_8"


    // $ANTLR start "rule__Constraint__RelTrans2Assignment_9"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6360:1: rule__Constraint__RelTrans2Assignment_9 : ( ruleRelativeTransformation ) ;
    public final void rule__Constraint__RelTrans2Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6364:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6365:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6365:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6366:1: ruleRelativeTransformation
            {
             before(grammarAccess.getConstraintAccess().getRelTrans2RelativeTransformationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__Constraint__RelTrans2Assignment_912728);
            ruleRelativeTransformation();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getRelTrans2RelativeTransformationParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Constraint__RelTrans2Assignment_9"


    // $ANTLR start "rule__ExternalLoad__NameAssignment_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6375:1: rule__ExternalLoad__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExternalLoad__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6379:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6380:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6380:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6381:1: RULE_ID
            {
             before(grammarAccess.getExternalLoadAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalLoad__NameAssignment_212759); 
             after(grammarAccess.getExternalLoadAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExternalLoad__NameAssignment_2"


    // $ANTLR start "rule__ExternalLoad__TypeAssignment_4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6390:1: rule__ExternalLoad__TypeAssignment_4 : ( ruleLoadType ) ;
    public final void rule__ExternalLoad__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6394:1: ( ( ruleLoadType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6395:1: ( ruleLoadType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6395:1: ( ruleLoadType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6396:1: ruleLoadType
            {
             before(grammarAccess.getExternalLoadAccess().getTypeLoadTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleLoadType_in_rule__ExternalLoad__TypeAssignment_412790);
            ruleLoadType();

            state._fsp--;

             after(grammarAccess.getExternalLoadAccess().getTypeLoadTypeEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__ExternalLoad__TypeAssignment_4"


    // $ANTLR start "rule__ExternalLoad__Body1Assignment_6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6405:1: rule__ExternalLoad__Body1Assignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ExternalLoad__Body1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6409:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6410:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6410:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6411:1: ( RULE_ID )
            {
             before(grammarAccess.getExternalLoadAccess().getBody1BodyCrossReference_6_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6412:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6413:1: RULE_ID
            {
             before(grammarAccess.getExternalLoadAccess().getBody1BodyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalLoad__Body1Assignment_612825); 
             after(grammarAccess.getExternalLoadAccess().getBody1BodyIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getExternalLoadAccess().getBody1BodyCrossReference_6_0()); 

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
    // $ANTLR end "rule__ExternalLoad__Body1Assignment_6"


    // $ANTLR start "rule__ExternalLoad__RelTrans1Assignment_7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6424:1: rule__ExternalLoad__RelTrans1Assignment_7 : ( ruleRelativeTransformation ) ;
    public final void rule__ExternalLoad__RelTrans1Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6428:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6429:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6429:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6430:1: ruleRelativeTransformation
            {
             before(grammarAccess.getExternalLoadAccess().getRelTrans1RelativeTransformationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__ExternalLoad__RelTrans1Assignment_712860);
            ruleRelativeTransformation();

            state._fsp--;

             after(grammarAccess.getExternalLoadAccess().getRelTrans1RelativeTransformationParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ExternalLoad__RelTrans1Assignment_7"


    // $ANTLR start "rule__ExternalLoad__Body2Assignment_9"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6439:1: rule__ExternalLoad__Body2Assignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__ExternalLoad__Body2Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6443:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6444:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6444:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6445:1: ( RULE_ID )
            {
             before(grammarAccess.getExternalLoadAccess().getBody2BodyCrossReference_9_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6446:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6447:1: RULE_ID
            {
             before(grammarAccess.getExternalLoadAccess().getBody2BodyIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalLoad__Body2Assignment_912895); 
             after(grammarAccess.getExternalLoadAccess().getBody2BodyIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getExternalLoadAccess().getBody2BodyCrossReference_9_0()); 

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
    // $ANTLR end "rule__ExternalLoad__Body2Assignment_9"


    // $ANTLR start "rule__ExternalLoad__RelTrans2Assignment_10"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6458:1: rule__ExternalLoad__RelTrans2Assignment_10 : ( ruleRelativeTransformation ) ;
    public final void rule__ExternalLoad__RelTrans2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6462:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6463:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6463:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6464:1: ruleRelativeTransformation
            {
             before(grammarAccess.getExternalLoadAccess().getRelTrans2RelativeTransformationParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__ExternalLoad__RelTrans2Assignment_1012930);
            ruleRelativeTransformation();

            state._fsp--;

             after(grammarAccess.getExternalLoadAccess().getRelTrans2RelativeTransformationParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__ExternalLoad__RelTrans2Assignment_10"


    // $ANTLR start "rule__BaseMatrix__NameAssignment_0_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6473:1: rule__BaseMatrix__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__BaseMatrix__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6477:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6478:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6478:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6479:1: RULE_ID
            {
             before(grammarAccess.getBaseMatrixAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BaseMatrix__NameAssignment_0_112961); 
             after(grammarAccess.getBaseMatrixAccess().getNameIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__BaseMatrix__NameAssignment_0_1"


    // $ANTLR start "rule__BaseMatrix__ValuesAssignment_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6488:1: rule__BaseMatrix__ValuesAssignment_2 : ( ruleAddExp ) ;
    public final void rule__BaseMatrix__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6492:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6493:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6493:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6494:1: ruleAddExp
            {
             before(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__BaseMatrix__ValuesAssignment_212992);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BaseMatrix__ValuesAssignment_2"


    // $ANTLR start "rule__BaseMatrix__ValuesAssignment_3_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6503:1: rule__BaseMatrix__ValuesAssignment_3_1 : ( ruleAddExp ) ;
    public final void rule__BaseMatrix__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6507:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6508:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6508:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6509:1: ruleAddExp
            {
             before(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__BaseMatrix__ValuesAssignment_3_113023);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__BaseMatrix__ValuesAssignment_3_1"


    // $ANTLR start "rule__MatrixRef__MatrixAssignment"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6518:1: rule__MatrixRef__MatrixAssignment : ( ( RULE_ID ) ) ;
    public final void rule__MatrixRef__MatrixAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6522:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6523:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6523:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6524:1: ( RULE_ID )
            {
             before(grammarAccess.getMatrixRefAccess().getMatrixBaseMatrixCrossReference_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6525:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6526:1: RULE_ID
            {
             before(grammarAccess.getMatrixRefAccess().getMatrixBaseMatrixIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MatrixRef__MatrixAssignment13058); 
             after(grammarAccess.getMatrixRefAccess().getMatrixBaseMatrixIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getMatrixRefAccess().getMatrixBaseMatrixCrossReference_0()); 

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
    // $ANTLR end "rule__MatrixRef__MatrixAssignment"


    // $ANTLR start "rule__AddExp__OpAssignment_1_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6537:1: rule__AddExp__OpAssignment_1_1 : ( ( rule__AddExp__OpAlternatives_1_1_0 ) ) ;
    public final void rule__AddExp__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6541:1: ( ( ( rule__AddExp__OpAlternatives_1_1_0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6542:1: ( ( rule__AddExp__OpAlternatives_1_1_0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6542:1: ( ( rule__AddExp__OpAlternatives_1_1_0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6543:1: ( rule__AddExp__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getAddExpAccess().getOpAlternatives_1_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6544:1: ( rule__AddExp__OpAlternatives_1_1_0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6544:2: rule__AddExp__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__AddExp__OpAlternatives_1_1_0_in_rule__AddExp__OpAssignment_1_113093);
            rule__AddExp__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAddExpAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__AddExp__OpAssignment_1_1"


    // $ANTLR start "rule__AddExp__RightAssignment_1_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6553:1: rule__AddExp__RightAssignment_1_2 : ( ruleMultExp ) ;
    public final void rule__AddExp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6557:1: ( ( ruleMultExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6558:1: ( ruleMultExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6558:1: ( ruleMultExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6559:1: ruleMultExp
            {
             before(grammarAccess.getAddExpAccess().getRightMultExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultExp_in_rule__AddExp__RightAssignment_1_213126);
            ruleMultExp();

            state._fsp--;

             after(grammarAccess.getAddExpAccess().getRightMultExpParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AddExp__RightAssignment_1_2"


    // $ANTLR start "rule__MultExp__OpAssignment_1_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6568:1: rule__MultExp__OpAssignment_1_1 : ( ( rule__MultExp__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MultExp__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6572:1: ( ( ( rule__MultExp__OpAlternatives_1_1_0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6573:1: ( ( rule__MultExp__OpAlternatives_1_1_0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6573:1: ( ( rule__MultExp__OpAlternatives_1_1_0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6574:1: ( rule__MultExp__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultExpAccess().getOpAlternatives_1_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6575:1: ( rule__MultExp__OpAlternatives_1_1_0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6575:2: rule__MultExp__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__MultExp__OpAlternatives_1_1_0_in_rule__MultExp__OpAssignment_1_113157);
            rule__MultExp__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultExpAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__MultExp__OpAssignment_1_1"


    // $ANTLR start "rule__MultExp__RightAssignment_1_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6584:1: rule__MultExp__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MultExp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6588:1: ( ( rulePrimary ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6589:1: ( rulePrimary )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6589:1: ( rulePrimary )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6590:1: rulePrimary
            {
             before(grammarAccess.getMultExpAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MultExp__RightAssignment_1_213190);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultExpAccess().getRightPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__MultExp__RightAssignment_1_2"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__LabelAssignment_0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6599:1: rule__ConstantOrFunctionCallExp__LabelAssignment_0 : ( RULE_ID ) ;
    public final void rule__ConstantOrFunctionCallExp__LabelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6603:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6604:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6604:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6605:1: RULE_ID
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getLabelIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantOrFunctionCallExp__LabelAssignment_013221); 
             after(grammarAccess.getConstantOrFunctionCallExpAccess().getLabelIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__LabelAssignment_0"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__ParamAssignment_1_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6614:1: rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 : ( ruleAddExp ) ;
    public final void rule__ConstantOrFunctionCallExp__ParamAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6618:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6619:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6619:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6620:1: ruleAddExp
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__ConstantOrFunctionCallExp__ParamAssignment_1_113252);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__ParamAssignment_1_1"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6629:1: rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 : ( ruleAddExp ) ;
    public final void rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6633:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6634:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6634:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6635:1: ruleAddExp
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_113283);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1"


    // $ANTLR start "rule__NumberLiteral__NegAssignment_0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6644:1: rule__NumberLiteral__NegAssignment_0 : ( ( '-' ) ) ;
    public final void rule__NumberLiteral__NegAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6648:1: ( ( ( '-' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6649:1: ( ( '-' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6649:1: ( ( '-' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6650:1: ( '-' )
            {
             before(grammarAccess.getNumberLiteralAccess().getNegHyphenMinusKeyword_0_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6651:1: ( '-' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6652:1: '-'
            {
             before(grammarAccess.getNumberLiteralAccess().getNegHyphenMinusKeyword_0_0()); 
            match(input,13,FOLLOW_13_in_rule__NumberLiteral__NegAssignment_013319); 
             after(grammarAccess.getNumberLiteralAccess().getNegHyphenMinusKeyword_0_0()); 

            }

             after(grammarAccess.getNumberLiteralAccess().getNegHyphenMinusKeyword_0_0()); 

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
    // $ANTLR end "rule__NumberLiteral__NegAssignment_0"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6667:1: rule__NumberLiteral__ValueAssignment_1 : ( RULE_REAL ) ;
    public final void rule__NumberLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6671:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6672:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6672:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6673:1: RULE_REAL
            {
             before(grammarAccess.getNumberLiteralAccess().getValueREALTerminalRuleCall_1_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__NumberLiteral__ValueAssignment_113358); 
             after(grammarAccess.getNumberLiteralAccess().getValueREALTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NumberLiteral__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialDefinition_in_entryRuleInitialDefinition121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialDefinition128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitialDefinition__Alternatives_in_ruleInitialDefinition154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_entryRuleEnvironment181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironment188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__0_in_ruleEnvironment214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0_in_ruleSystem274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemElement_in_entryRuleSystemElement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemElement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemElement__Alternatives_in_ruleSystemElement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0_in_ruleBody394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_entryRuleMass421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMass428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__0_in_ruleMass454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_entryRuleJoint481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoint488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__0_in_ruleJoint514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_entryRuleJointType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group__0_in_ruleJointType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointTypeExpression_in_entryRuleJointTypeExpression601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointTypeExpression608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Alternatives_in_ruleJointTypeExpression634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_entryRuleRelativeTransformation661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeTransformation668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__0_in_ruleRelativeTransformation694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientation_in_entryRuleReorientation721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientation728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group__0_in_ruleReorientation754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientExpression_in_entryRuleReorientExpression781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientExpression788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Alternatives_in_ruleReorientExpression814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLoad_in_entryRuleExternalLoad901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalLoad908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__0_in_ruleExternalLoad934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_entryRuleMatrix961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Alternatives_in_ruleMatrix994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_entryRuleBaseMatrix1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseMatrix1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__0_in_ruleBaseMatrix1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRef_in_entryRuleMatrixRef1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrixRef1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixRef__MatrixAssignment_in_ruleMatrixRef1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_entryRuleAddExp1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExp1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group__0_in_ruleAddExp1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_entryRuleMultExp1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExp1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group__0_in_ruleMultExp1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantOrFunctionCallExp_in_entryRuleConstantOrFunctionCallExp1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantOrFunctionCallExp1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group__0_in_ruleConstantOrFunctionCallExp1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__0_in_ruleNumberLiteral1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AXIS__Alternatives_in_ruleAXIS1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintType__Alternatives_in_ruleConstraintType1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadType__Alternatives_in_ruleLoadType1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_rule__InitialDefinition__Alternatives1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_rule__InitialDefinition__Alternatives1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__SystemElement__Alternatives1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_rule__SystemElement__Alternatives1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__SystemElement__Alternatives1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLoad_in_rule__SystemElement__Alternatives1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__RefAssignment_0_in_rule__JointTypeExpression__Alternatives1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__0_in_rule__JointTypeExpression__Alternatives1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__0_in_rule__JointTypeExpression__Alternatives1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__RefAssignment_0_in_rule__ReorientExpression__Alternatives1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__0_in_rule__ReorientExpression__Alternatives1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_rule__Matrix__Alternatives1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRef_in_rule__Matrix__Alternatives1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AddExp__OpAlternatives_1_1_01860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AddExp__OpAlternatives_1_1_01880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MultExp__OpAlternatives_1_1_01915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MultExp__OpAlternatives_1_1_01935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_rule__Primary__Alternatives1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantOrFunctionCallExp_in_rule__Primary__Alternatives2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AXIS__Alternatives2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AXIS__Alternatives2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AXIS__Alternatives2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ConstraintType__Alternatives2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ConstraintType__Alternatives2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LoadType__Alternatives2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LoadType__Alternatives2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02226 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DefsAssignment_0_in_rule__Model__Group__0__Impl2256 = new BitSet(new long[]{0x0280880200000012L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12287 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WorldAssignment_1_in_rule__Model__Group__1__Impl2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl2376 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl2388 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__0__Impl_in_rule__Environment__Group__02427 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Environment__Group__1_in_rule__Environment__Group__02430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Environment__Group__0__Impl2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__1__Impl_in_rule__Environment__Group__12489 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Environment__Group__2_in_rule__Environment__Group__12492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Environment__Group__1__Impl2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__2__Impl_in_rule__Environment__Group__22551 = new BitSet(new long[]{0x0280000000000010L});
    public static final BitSet FOLLOW_rule__Environment__Group__3_in_rule__Environment__Group__22554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Environment__Group__2__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__3__Impl_in_rule__Environment__Group__32613 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Environment__Group__4_in_rule__Environment__Group__32616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__GravityAssignment_3_in_rule__Environment__Group__3__Impl2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__4__Impl_in_rule__Environment__Group__42673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Environment__Group__4__Impl2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__02742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__02745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__System__Group__0__Impl2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__12804 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__12807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__22864 = new BitSet(new long[]{0x0030000210000000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__22867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__System__Group__2__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__32926 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__32929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl2958 = new BitSet(new long[]{0x0030000210000002L});
    public static final BitSet FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl2970 = new BitSet(new long[]{0x0030000210000002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__43003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__System__Group__4__Impl3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__03072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__03075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Body__Group__0__Impl3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__13134 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__13137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__NameAssignment_1_in_rule__Body__Group__1__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__23194 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__23197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Body__Group__2__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__33256 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Body__Group__4_in_rule__Body__Group__33259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__MassAssignment_3_in_rule__Body__Group__3__Impl3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__43316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Body__Group__4__Impl3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__0__Impl_in_rule__Mass__Group__03385 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__1_in_rule__Mass__Group__03388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Mass__Group__0__Impl3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__1__Impl_in_rule__Mass__Group__13447 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__2_in_rule__Mass__Group__13450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Mass__Group__1__Impl3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__2__Impl_in_rule__Mass__Group__23509 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__Mass__Group__3_in_rule__Mass__Group__23512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Mass__Group__2__Impl3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__3__Impl_in_rule__Mass__Group__33571 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__4_in_rule__Mass__Group__33574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__ValueAssignment_3_in_rule__Mass__Group__3__Impl3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__4__Impl_in_rule__Mass__Group__43631 = new BitSet(new long[]{0x0280000000000010L});
    public static final BitSet FOLLOW_rule__Mass__Group__5_in_rule__Mass__Group__43634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Mass__Group__4__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__5__Impl_in_rule__Mass__Group__53693 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__6_in_rule__Mass__Group__53696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__PositionAssignment_5_in_rule__Mass__Group__5__Impl3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__6__Impl_in_rule__Mass__Group__63753 = new BitSet(new long[]{0x0280000000000010L});
    public static final BitSet FOLLOW_rule__Mass__Group__7_in_rule__Mass__Group__63756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Mass__Group__6__Impl3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__7__Impl_in_rule__Mass__Group__73815 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__8_in_rule__Mass__Group__73818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__InertiaAssignment_7_in_rule__Mass__Group__7__Impl3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__8__Impl_in_rule__Mass__Group__83875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Mass__Group__8__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__0__Impl_in_rule__Joint__Group__03952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Joint__Group__1_in_rule__Joint__Group__03955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Joint__Group__0__Impl3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__1__Impl_in_rule__Joint__Group__14014 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__2_in_rule__Joint__Group__14017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__NameAssignment_1_in_rule__Joint__Group__1__Impl4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__2__Impl_in_rule__Joint__Group__24074 = new BitSet(new long[]{0x0280880200000010L});
    public static final BitSet FOLLOW_rule__Joint__Group__3_in_rule__Joint__Group__24077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Joint__Group__2__Impl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__3__Impl_in_rule__Joint__Group__34136 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__4_in_rule__Joint__Group__34139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__TypeAssignment_3_in_rule__Joint__Group__3__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__4__Impl_in_rule__Joint__Group__44196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Joint__Group__5_in_rule__Joint__Group__44199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Joint__Group__4__Impl4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__5__Impl_in_rule__Joint__Group__54258 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__6_in_rule__Joint__Group__54261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Body1Assignment_5_in_rule__Joint__Group__5__Impl4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__6__Impl_in_rule__Joint__Group__64318 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__7_in_rule__Joint__Group__64321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__RelTrans1Assignment_6_in_rule__Joint__Group__6__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__7__Impl_in_rule__Joint__Group__74378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Joint__Group__8_in_rule__Joint__Group__74381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Joint__Group__7__Impl4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__8__Impl_in_rule__Joint__Group__84440 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__9_in_rule__Joint__Group__84443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Body2Assignment_8_in_rule__Joint__Group__8__Impl4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__9__Impl_in_rule__Joint__Group__94500 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__10_in_rule__Joint__Group__94503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__RelTrans2Assignment_9_in_rule__Joint__Group__9__Impl4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__10__Impl_in_rule__Joint__Group__104560 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__11_in_rule__Joint__Group__104563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Joint__Group__10__Impl4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__11__Impl_in_rule__Joint__Group__114622 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__12_in_rule__Joint__Group__114625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Joint__Group__11__Impl4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__12__Impl_in_rule__Joint__Group__124684 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__Joint__Group__13_in_rule__Joint__Group__124687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Joint__Group__12__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__13__Impl_in_rule__Joint__Group__134746 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__14_in_rule__Joint__Group__134749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__SpringCoeffAssignment_13_in_rule__Joint__Group__13__Impl4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__14__Impl_in_rule__Joint__Group__144806 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__Joint__Group__15_in_rule__Joint__Group__144809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Joint__Group__14__Impl4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__15__Impl_in_rule__Joint__Group__154868 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__16_in_rule__Joint__Group__154871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__SpringInitAssignment_15_in_rule__Joint__Group__15__Impl4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__16__Impl_in_rule__Joint__Group__164928 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__Joint__Group__17_in_rule__Joint__Group__164931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Joint__Group__16__Impl4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__17__Impl_in_rule__Joint__Group__174990 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__18_in_rule__Joint__Group__174993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__DampViscousAssignment_17_in_rule__Joint__Group__17__Impl5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__18__Impl_in_rule__Joint__Group__185050 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__Joint__Group__19_in_rule__Joint__Group__185053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Joint__Group__18__Impl5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__19__Impl_in_rule__Joint__Group__195112 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__20_in_rule__Joint__Group__195115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__DampCoulombAssignment_19_in_rule__Joint__Group__19__Impl5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__20__Impl_in_rule__Joint__Group__205172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Joint__Group__20__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group__0__Impl_in_rule__JointType__Group__05273 = new BitSet(new long[]{0x0280880200000010L});
    public static final BitSet FOLLOW_rule__JointType__Group__1_in_rule__JointType__Group__05276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__0_in_rule__JointType__Group__0__Impl5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group__1__Impl_in_rule__JointType__Group__15334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__ExpAssignment_1_in_rule__JointType__Group__1__Impl5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__0__Impl_in_rule__JointType__Group_0__05395 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__1_in_rule__JointType__Group_0__05398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__JointType__Group_0__0__Impl5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__1__Impl_in_rule__JointType__Group_0__15457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__2_in_rule__JointType__Group_0__15460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__JointType__Group_0__1__Impl5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__2__Impl_in_rule__JointType__Group_0__25519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__NameAssignment_0_2_in_rule__JointType__Group_0__2__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__0__Impl_in_rule__JointTypeExpression__Group_1__05582 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__1_in_rule__JointTypeExpression__Group_1__05585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__JointTypeExpression__Group_1__0__Impl5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__1__Impl_in_rule__JointTypeExpression__Group_1__15644 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__2_in_rule__JointTypeExpression__Group_1__15647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__JointTypeExpression__Group_1__1__Impl5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__2__Impl_in_rule__JointTypeExpression__Group_1__25706 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__3_in_rule__JointTypeExpression__Group_1__25709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__AxisAssignment_1_2_in_rule__JointTypeExpression__Group_1__2__Impl5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__3__Impl_in_rule__JointTypeExpression__Group_1__35766 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__4_in_rule__JointTypeExpression__Group_1__35769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1_3__0_in_rule__JointTypeExpression__Group_1__3__Impl5796 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__4__Impl_in_rule__JointTypeExpression__Group_1__45827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__JointTypeExpression__Group_1__4__Impl5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1_3__0__Impl_in_rule__JointTypeExpression__Group_1_3__05896 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1_3__1_in_rule__JointTypeExpression__Group_1_3__05899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__JointTypeExpression__Group_1_3__0__Impl5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1_3__1__Impl_in_rule__JointTypeExpression__Group_1_3__15958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__AxisAssignment_1_3_1_in_rule__JointTypeExpression__Group_1_3__1__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__0__Impl_in_rule__JointTypeExpression__Group_2__06019 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__1_in_rule__JointTypeExpression__Group_2__06022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__JointTypeExpression__Group_2__0__Impl6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__1__Impl_in_rule__JointTypeExpression__Group_2__16081 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__2_in_rule__JointTypeExpression__Group_2__16084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__JointTypeExpression__Group_2__1__Impl6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__2__Impl_in_rule__JointTypeExpression__Group_2__26143 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__3_in_rule__JointTypeExpression__Group_2__26146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__AxisAssignment_2_2_in_rule__JointTypeExpression__Group_2__2__Impl6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__3__Impl_in_rule__JointTypeExpression__Group_2__36203 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__4_in_rule__JointTypeExpression__Group_2__36206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2_3__0_in_rule__JointTypeExpression__Group_2__3__Impl6233 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__4__Impl_in_rule__JointTypeExpression__Group_2__46264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__JointTypeExpression__Group_2__4__Impl6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2_3__0__Impl_in_rule__JointTypeExpression__Group_2_3__06333 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2_3__1_in_rule__JointTypeExpression__Group_2_3__06336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__JointTypeExpression__Group_2_3__0__Impl6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2_3__1__Impl_in_rule__JointTypeExpression__Group_2_3__16395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__AxisAssignment_2_3_1_in_rule__JointTypeExpression__Group_2_3__1__Impl6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__0__Impl_in_rule__RelativeTransformation__Group__06456 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__1_in_rule__RelativeTransformation__Group__06459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__RelativeTransformation__Group__0__Impl6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__1__Impl_in_rule__RelativeTransformation__Group__16518 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__2_in_rule__RelativeTransformation__Group__16521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__RelativeTransformation__Group__1__Impl6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__2__Impl_in_rule__RelativeTransformation__Group__26580 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__3_in_rule__RelativeTransformation__Group__26583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__RelativeTransformation__Group__2__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__3__Impl_in_rule__RelativeTransformation__Group__36642 = new BitSet(new long[]{0x0280000000000010L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__4_in_rule__RelativeTransformation__Group__36645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__RelativeTransformation__Group__3__Impl6673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__4__Impl_in_rule__RelativeTransformation__Group__46704 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__5_in_rule__RelativeTransformation__Group__46707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__PositionAssignment_4_in_rule__RelativeTransformation__Group__4__Impl6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__5__Impl_in_rule__RelativeTransformation__Group__56764 = new BitSet(new long[]{0x0008100000000010L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__6_in_rule__RelativeTransformation__Group__56767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__RelativeTransformation__Group__5__Impl6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__6__Impl_in_rule__RelativeTransformation__Group__66826 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__7_in_rule__RelativeTransformation__Group__66829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__ReorientAssignment_6_in_rule__RelativeTransformation__Group__6__Impl6856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__7__Impl_in_rule__RelativeTransformation__Group__76886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__RelativeTransformation__Group__7__Impl6914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group__0__Impl_in_rule__Reorientation__Group__06961 = new BitSet(new long[]{0x0008100000000010L});
    public static final BitSet FOLLOW_rule__Reorientation__Group__1_in_rule__Reorientation__Group__06964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group_0__0_in_rule__Reorientation__Group__0__Impl6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group__1__Impl_in_rule__Reorientation__Group__17022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__ExpAssignment_1_in_rule__Reorientation__Group__1__Impl7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group_0__0__Impl_in_rule__Reorientation__Group_0__07083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reorientation__Group_0__1_in_rule__Reorientation__Group_0__07086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Reorientation__Group_0__0__Impl7114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group_0__1__Impl_in_rule__Reorientation__Group_0__17145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__NameAssignment_0_1_in_rule__Reorientation__Group_0__1__Impl7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__0__Impl_in_rule__ReorientExpression__Group_1__07206 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__1_in_rule__ReorientExpression__Group_1__07209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ReorientExpression__Group_1__0__Impl7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__1__Impl_in_rule__ReorientExpression__Group_1__17268 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__2_in_rule__ReorientExpression__Group_1__17271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ReorientExpression__Group_1__1__Impl7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__2__Impl_in_rule__ReorientExpression__Group_1__27330 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__3_in_rule__ReorientExpression__Group_1__27333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__AxisAssignment_1_2_in_rule__ReorientExpression__Group_1__2__Impl7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__3__Impl_in_rule__ReorientExpression__Group_1__37390 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__4_in_rule__ReorientExpression__Group_1__37393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ReorientExpression__Group_1__3__Impl7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__4__Impl_in_rule__ReorientExpression__Group_1__47452 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__5_in_rule__ReorientExpression__Group_1__47455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__ValueAssignment_1_4_in_rule__ReorientExpression__Group_1__4__Impl7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__5__Impl_in_rule__ReorientExpression__Group_1__57512 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__6_in_rule__ReorientExpression__Group_1__57515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ReorientExpression__Group_1__5__Impl7543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__6__Impl_in_rule__ReorientExpression__Group_1__67574 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__7_in_rule__ReorientExpression__Group_1__67577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__0_in_rule__ReorientExpression__Group_1__6__Impl7604 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__7__Impl_in_rule__ReorientExpression__Group_1__77635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ReorientExpression__Group_1__7__Impl7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__0__Impl_in_rule__ReorientExpression__Group_1_6__07710 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__1_in_rule__ReorientExpression__Group_1_6__07713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ReorientExpression__Group_1_6__0__Impl7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__1__Impl_in_rule__ReorientExpression__Group_1_6__17772 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__2_in_rule__ReorientExpression__Group_1_6__17775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ReorientExpression__Group_1_6__1__Impl7803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__2__Impl_in_rule__ReorientExpression__Group_1_6__27834 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__3_in_rule__ReorientExpression__Group_1_6__27837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__AxisAssignment_1_6_2_in_rule__ReorientExpression__Group_1_6__2__Impl7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__3__Impl_in_rule__ReorientExpression__Group_1_6__37894 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__4_in_rule__ReorientExpression__Group_1_6__37897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ReorientExpression__Group_1_6__3__Impl7925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__4__Impl_in_rule__ReorientExpression__Group_1_6__47956 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__5_in_rule__ReorientExpression__Group_1_6__47959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__ValueAssignment_1_6_4_in_rule__ReorientExpression__Group_1_6__4__Impl7986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__5__Impl_in_rule__ReorientExpression__Group_1_6__58016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ReorientExpression__Group_1_6__5__Impl8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__08087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__08090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Constraint__Group__0__Impl8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__18149 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__18152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__NameAssignment_1_in_rule__Constraint__Group__1__Impl8179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__28209 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__28212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Constraint__Group__2__Impl8240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__38271 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__38274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__TypeAssignment_3_in_rule__Constraint__Group__3__Impl8301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4__Impl_in_rule__Constraint__Group__48331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__48334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Constraint__Group__4__Impl8362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5__Impl_in_rule__Constraint__Group__58393 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__58396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Body1Assignment_5_in_rule__Constraint__Group__5__Impl8423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6__Impl_in_rule__Constraint__Group__68453 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__68456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__RelTrans1Assignment_6_in_rule__Constraint__Group__6__Impl8483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__7__Impl_in_rule__Constraint__Group__78513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__8_in_rule__Constraint__Group__78516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Constraint__Group__7__Impl8544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__8__Impl_in_rule__Constraint__Group__88575 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__9_in_rule__Constraint__Group__88578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Body2Assignment_8_in_rule__Constraint__Group__8__Impl8605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__9__Impl_in_rule__Constraint__Group__98635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__RelTrans2Assignment_9_in_rule__Constraint__Group__9__Impl8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__0__Impl_in_rule__ExternalLoad__Group__08712 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__1_in_rule__ExternalLoad__Group__08715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ExternalLoad__Group__0__Impl8743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__1__Impl_in_rule__ExternalLoad__Group__18774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__2_in_rule__ExternalLoad__Group__18777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ExternalLoad__Group__1__Impl8805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__2__Impl_in_rule__ExternalLoad__Group__28836 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__3_in_rule__ExternalLoad__Group__28839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__NameAssignment_2_in_rule__ExternalLoad__Group__2__Impl8866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__3__Impl_in_rule__ExternalLoad__Group__38896 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__4_in_rule__ExternalLoad__Group__38899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ExternalLoad__Group__3__Impl8927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__4__Impl_in_rule__ExternalLoad__Group__48958 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__5_in_rule__ExternalLoad__Group__48961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__TypeAssignment_4_in_rule__ExternalLoad__Group__4__Impl8988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__5__Impl_in_rule__ExternalLoad__Group__59018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__6_in_rule__ExternalLoad__Group__59021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ExternalLoad__Group__5__Impl9049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__6__Impl_in_rule__ExternalLoad__Group__69080 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__7_in_rule__ExternalLoad__Group__69083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Body1Assignment_6_in_rule__ExternalLoad__Group__6__Impl9110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__7__Impl_in_rule__ExternalLoad__Group__79140 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__8_in_rule__ExternalLoad__Group__79143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__RelTrans1Assignment_7_in_rule__ExternalLoad__Group__7__Impl9170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__8__Impl_in_rule__ExternalLoad__Group__89200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__9_in_rule__ExternalLoad__Group__89203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExternalLoad__Group__8__Impl9231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__9__Impl_in_rule__ExternalLoad__Group__99262 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__10_in_rule__ExternalLoad__Group__99265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Body2Assignment_9_in_rule__ExternalLoad__Group__9__Impl9292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__10__Impl_in_rule__ExternalLoad__Group__109322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__RelTrans2Assignment_10_in_rule__ExternalLoad__Group__10__Impl9349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__0__Impl_in_rule__BaseMatrix__Group__09401 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__1_in_rule__BaseMatrix__Group__09404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_0__0_in_rule__BaseMatrix__Group__0__Impl9431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__1__Impl_in_rule__BaseMatrix__Group__19462 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__2_in_rule__BaseMatrix__Group__19465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__BaseMatrix__Group__1__Impl9493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__2__Impl_in_rule__BaseMatrix__Group__29524 = new BitSet(new long[]{0x0100400000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__3_in_rule__BaseMatrix__Group__29527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__ValuesAssignment_2_in_rule__BaseMatrix__Group__2__Impl9554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__3__Impl_in_rule__BaseMatrix__Group__39584 = new BitSet(new long[]{0x0100400000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__4_in_rule__BaseMatrix__Group__39587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_3__0_in_rule__BaseMatrix__Group__3__Impl9614 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__4__Impl_in_rule__BaseMatrix__Group__49645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__BaseMatrix__Group__4__Impl9673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_0__0__Impl_in_rule__BaseMatrix__Group_0__09714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_0__1_in_rule__BaseMatrix__Group_0__09717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__BaseMatrix__Group_0__0__Impl9745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_0__1__Impl_in_rule__BaseMatrix__Group_0__19776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__NameAssignment_0_1_in_rule__BaseMatrix__Group_0__1__Impl9803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_3__0__Impl_in_rule__BaseMatrix__Group_3__09837 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_3__1_in_rule__BaseMatrix__Group_3__09840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__BaseMatrix__Group_3__0__Impl9868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_3__1__Impl_in_rule__BaseMatrix__Group_3__19899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__ValuesAssignment_3_1_in_rule__BaseMatrix__Group_3__1__Impl9926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group__0__Impl_in_rule__AddExp__Group__09960 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__AddExp__Group__1_in_rule__AddExp__Group__09963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_rule__AddExp__Group__0__Impl9990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group__1__Impl_in_rule__AddExp__Group__110019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__0_in_rule__AddExp__Group__1__Impl10046 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__0__Impl_in_rule__AddExp__Group_1__010081 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__1_in_rule__AddExp__Group_1__010084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__1__Impl_in_rule__AddExp__Group_1__110142 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__2_in_rule__AddExp__Group_1__110145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__OpAssignment_1_1_in_rule__AddExp__Group_1__1__Impl10172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__2__Impl_in_rule__AddExp__Group_1__210202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__RightAssignment_1_2_in_rule__AddExp__Group_1__2__Impl10229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group__0__Impl_in_rule__MultExp__Group__010265 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__MultExp__Group__1_in_rule__MultExp__Group__010268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MultExp__Group__0__Impl10295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group__1__Impl_in_rule__MultExp__Group__110324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__0_in_rule__MultExp__Group__1__Impl10351 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__0__Impl_in_rule__MultExp__Group_1__010386 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__1_in_rule__MultExp__Group_1__010389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__1__Impl_in_rule__MultExp__Group_1__110447 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__2_in_rule__MultExp__Group_1__110450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__OpAssignment_1_1_in_rule__MultExp__Group_1__1__Impl10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__2__Impl_in_rule__MultExp__Group_1__210507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__RightAssignment_1_2_in_rule__MultExp__Group_1__2__Impl10534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__010570 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__010573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Primary__Group_1__0__Impl10601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__110632 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__110635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__Primary__Group_1__1__Impl10662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__210691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Primary__Group_1__2__Impl10719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group__0__Impl_in_rule__ConstantOrFunctionCallExp__Group__010756 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group__1_in_rule__ConstantOrFunctionCallExp__Group__010759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__LabelAssignment_0_in_rule__ConstantOrFunctionCallExp__Group__0__Impl10786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group__1__Impl_in_rule__ConstantOrFunctionCallExp__Group__110816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__0_in_rule__ConstantOrFunctionCallExp__Group__1__Impl10843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__0__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__010878 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__1_in_rule__ConstantOrFunctionCallExp__Group_1__010881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ConstantOrFunctionCallExp__Group_1__0__Impl10909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__1__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__110940 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__2_in_rule__ConstantOrFunctionCallExp__Group_1__110943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__ParamAssignment_1_1_in_rule__ConstantOrFunctionCallExp__Group_1__1__Impl10970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__2__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__211000 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__3_in_rule__ConstantOrFunctionCallExp__Group_1__211003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__0_in_rule__ConstantOrFunctionCallExp__Group_1__2__Impl11030 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__3__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__311061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ConstantOrFunctionCallExp__Group_1__3__Impl11089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl_in_rule__ConstantOrFunctionCallExp__Group_1_2__011128 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__1_in_rule__ConstantOrFunctionCallExp__Group_1_2__011131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl11159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl_in_rule__ConstantOrFunctionCallExp__Group_1_2__111190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1_in_rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl11217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__0__Impl_in_rule__NumberLiteral__Group__011251 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__1_in_rule__NumberLiteral__Group__011254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__NegAssignment_0_in_rule__NumberLiteral__Group__0__Impl11281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__1__Impl_in_rule__NumberLiteral__Group__111312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__ValueAssignment_1_in_rule__NumberLiteral__Group__1__Impl11339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialDefinition_in_rule__Model__DefsAssignment_011378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_rule__Model__WorldAssignment_111409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Model__BodiesAssignment_211440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Environment__GravityAssignment_311471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__NameAssignment_111502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemElement_in_rule__System__ElementsAssignment_311533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__NameAssignment_111564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_rule__Body__MassAssignment_311595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__Mass__ValueAssignment_311626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Mass__PositionAssignment_511657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Mass__InertiaAssignment_711688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Joint__NameAssignment_111719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_rule__Joint__TypeAssignment_311750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Joint__Body1Assignment_511785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__Joint__RelTrans1Assignment_611820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Joint__Body2Assignment_811855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__Joint__RelTrans2Assignment_911890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__Joint__SpringCoeffAssignment_1311921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__Joint__SpringInitAssignment_1511952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__Joint__DampViscousAssignment_1711983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__Joint__DampCoulombAssignment_1912014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JointType__NameAssignment_0_212045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointTypeExpression_in_rule__JointType__ExpAssignment_112076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JointTypeExpression__RefAssignment_012111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_1_212146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_1_3_112177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_2_212208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_2_3_112239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__RelativeTransformation__PositionAssignment_412270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientation_in_rule__RelativeTransformation__ReorientAssignment_612301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reorientation__NameAssignment_0_112332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientExpression_in_rule__Reorientation__ExpAssignment_112363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReorientExpression__RefAssignment_012398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__ReorientExpression__AxisAssignment_1_212433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__ReorientExpression__ValueAssignment_1_412464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__ReorientExpression__AxisAssignment_1_6_212495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__ReorientExpression__ValueAssignment_1_6_412526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constraint__NameAssignment_112557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintType_in_rule__Constraint__TypeAssignment_312588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constraint__Body1Assignment_512623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__Constraint__RelTrans1Assignment_612658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constraint__Body2Assignment_812693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__Constraint__RelTrans2Assignment_912728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalLoad__NameAssignment_212759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadType_in_rule__ExternalLoad__TypeAssignment_412790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalLoad__Body1Assignment_612825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__ExternalLoad__RelTrans1Assignment_712860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalLoad__Body2Assignment_912895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__ExternalLoad__RelTrans2Assignment_1012930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BaseMatrix__NameAssignment_0_112961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__BaseMatrix__ValuesAssignment_212992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__BaseMatrix__ValuesAssignment_3_113023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MatrixRef__MatrixAssignment13058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__OpAlternatives_1_1_0_in_rule__AddExp__OpAssignment_1_113093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_rule__AddExp__RightAssignment_1_213126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__OpAlternatives_1_1_0_in_rule__MultExp__OpAssignment_1_113157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MultExp__RightAssignment_1_213190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantOrFunctionCallExp__LabelAssignment_013221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__ConstantOrFunctionCallExp__ParamAssignment_1_113252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_113283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NumberLiteral__NegAssignment_013319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__NumberLiteral__ValueAssignment_113358 = new BitSet(new long[]{0x0000000000000002L});

}