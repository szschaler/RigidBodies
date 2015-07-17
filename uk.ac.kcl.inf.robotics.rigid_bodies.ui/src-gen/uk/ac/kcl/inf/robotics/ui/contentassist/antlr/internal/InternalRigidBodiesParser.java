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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'x'", "'y'", "'z'", "'geometrical'", "'velocity'", "'force'", "'torque'", "'world'", "'{'", "'gravity'", "'}'", "'system'", "'body'", "'mass'", "'value'", "'position'", "'inertia'", "'joint'", "':'", "'between'", "'and'", "'stiffness'", "'springCoeff'", "'springInit'", "'dampViscous'", "'dampCoulomb'", "'type'", "'revolute'", "'('", "')'", "','", "'planar'", "'with'", "'relative'", "'transformation'", "'reorient'", "'constraint'", "'external'", "'load'", "'['", "']'", "'matrix'", "'base'", "'start'"
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


    // $ANTLR start "entryRuleBodyReference"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:228:1: entryRuleBodyReference : ruleBodyReference EOF ;
    public final void entryRuleBodyReference() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:229:1: ( ruleBodyReference EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:230:1: ruleBodyReference EOF
            {
             before(grammarAccess.getBodyReferenceRule()); 
            pushFollow(FOLLOW_ruleBodyReference_in_entryRuleBodyReference421);
            ruleBodyReference();

            state._fsp--;

             after(grammarAccess.getBodyReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyReference428); 

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
    // $ANTLR end "entryRuleBodyReference"


    // $ANTLR start "ruleBodyReference"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:237:1: ruleBodyReference : ( ( rule__BodyReference__Alternatives ) ) ;
    public final void ruleBodyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:241:2: ( ( ( rule__BodyReference__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:242:1: ( ( rule__BodyReference__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:242:1: ( ( rule__BodyReference__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:243:1: ( rule__BodyReference__Alternatives )
            {
             before(grammarAccess.getBodyReferenceAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:244:1: ( rule__BodyReference__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:244:2: rule__BodyReference__Alternatives
            {
            pushFollow(FOLLOW_rule__BodyReference__Alternatives_in_ruleBodyReference454);
            rule__BodyReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBodyReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBodyReference"


    // $ANTLR start "entryRuleMass"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:256:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:257:1: ( ruleMass EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:258:1: ruleMass EOF
            {
             before(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_ruleMass_in_entryRuleMass481);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getMassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMass488); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:265:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:269:2: ( ( ( rule__Mass__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:270:1: ( ( rule__Mass__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:270:1: ( ( rule__Mass__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:271:1: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:272:1: ( rule__Mass__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:272:2: rule__Mass__Group__0
            {
            pushFollow(FOLLOW_rule__Mass__Group__0_in_ruleMass514);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:284:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:285:1: ( ruleJoint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:286:1: ruleJoint EOF
            {
             before(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_ruleJoint_in_entryRuleJoint541);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getJointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoint548); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:293:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:297:2: ( ( ( rule__Joint__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:298:1: ( ( rule__Joint__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:298:1: ( ( rule__Joint__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:299:1: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:300:1: ( rule__Joint__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:300:2: rule__Joint__Group__0
            {
            pushFollow(FOLLOW_rule__Joint__Group__0_in_ruleJoint574);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:312:1: entryRuleJointType : ruleJointType EOF ;
    public final void entryRuleJointType() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:313:1: ( ruleJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:314:1: ruleJointType EOF
            {
             before(grammarAccess.getJointTypeRule()); 
            pushFollow(FOLLOW_ruleJointType_in_entryRuleJointType601);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointType608); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:321:1: ruleJointType : ( ( rule__JointType__Group__0 ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:325:2: ( ( ( rule__JointType__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:326:1: ( ( rule__JointType__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:326:1: ( ( rule__JointType__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:327:1: ( rule__JointType__Group__0 )
            {
             before(grammarAccess.getJointTypeAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:328:1: ( rule__JointType__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:328:2: rule__JointType__Group__0
            {
            pushFollow(FOLLOW_rule__JointType__Group__0_in_ruleJointType634);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:340:1: entryRuleJointTypeExpression : ruleJointTypeExpression EOF ;
    public final void entryRuleJointTypeExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:341:1: ( ruleJointTypeExpression EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:342:1: ruleJointTypeExpression EOF
            {
             before(grammarAccess.getJointTypeExpressionRule()); 
            pushFollow(FOLLOW_ruleJointTypeExpression_in_entryRuleJointTypeExpression661);
            ruleJointTypeExpression();

            state._fsp--;

             after(grammarAccess.getJointTypeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointTypeExpression668); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:349:1: ruleJointTypeExpression : ( ( rule__JointTypeExpression__Alternatives ) ) ;
    public final void ruleJointTypeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:353:2: ( ( ( rule__JointTypeExpression__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:354:1: ( ( rule__JointTypeExpression__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:354:1: ( ( rule__JointTypeExpression__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:355:1: ( rule__JointTypeExpression__Alternatives )
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:356:1: ( rule__JointTypeExpression__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:356:2: rule__JointTypeExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Alternatives_in_ruleJointTypeExpression694);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:368:1: entryRuleRelativeTransformation : ruleRelativeTransformation EOF ;
    public final void entryRuleRelativeTransformation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:369:1: ( ruleRelativeTransformation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:370:1: ruleRelativeTransformation EOF
            {
             before(grammarAccess.getRelativeTransformationRule()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_entryRuleRelativeTransformation721);
            ruleRelativeTransformation();

            state._fsp--;

             after(grammarAccess.getRelativeTransformationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeTransformation728); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:377:1: ruleRelativeTransformation : ( ( rule__RelativeTransformation__Group__0 ) ) ;
    public final void ruleRelativeTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:381:2: ( ( ( rule__RelativeTransformation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:382:1: ( ( rule__RelativeTransformation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:382:1: ( ( rule__RelativeTransformation__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:383:1: ( rule__RelativeTransformation__Group__0 )
            {
             before(grammarAccess.getRelativeTransformationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:384:1: ( rule__RelativeTransformation__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:384:2: rule__RelativeTransformation__Group__0
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__0_in_ruleRelativeTransformation754);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:396:1: entryRuleReorientation : ruleReorientation EOF ;
    public final void entryRuleReorientation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:397:1: ( ruleReorientation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:398:1: ruleReorientation EOF
            {
             before(grammarAccess.getReorientationRule()); 
            pushFollow(FOLLOW_ruleReorientation_in_entryRuleReorientation781);
            ruleReorientation();

            state._fsp--;

             after(grammarAccess.getReorientationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientation788); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:405:1: ruleReorientation : ( ( rule__Reorientation__Group__0 ) ) ;
    public final void ruleReorientation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:409:2: ( ( ( rule__Reorientation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:410:1: ( ( rule__Reorientation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:410:1: ( ( rule__Reorientation__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:411:1: ( rule__Reorientation__Group__0 )
            {
             before(grammarAccess.getReorientationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:412:1: ( rule__Reorientation__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:412:2: rule__Reorientation__Group__0
            {
            pushFollow(FOLLOW_rule__Reorientation__Group__0_in_ruleReorientation814);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:424:1: entryRuleReorientExpression : ruleReorientExpression EOF ;
    public final void entryRuleReorientExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:425:1: ( ruleReorientExpression EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:426:1: ruleReorientExpression EOF
            {
             before(grammarAccess.getReorientExpressionRule()); 
            pushFollow(FOLLOW_ruleReorientExpression_in_entryRuleReorientExpression841);
            ruleReorientExpression();

            state._fsp--;

             after(grammarAccess.getReorientExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientExpression848); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:433:1: ruleReorientExpression : ( ( rule__ReorientExpression__Alternatives ) ) ;
    public final void ruleReorientExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:437:2: ( ( ( rule__ReorientExpression__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:438:1: ( ( rule__ReorientExpression__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:438:1: ( ( rule__ReorientExpression__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:439:1: ( rule__ReorientExpression__Alternatives )
            {
             before(grammarAccess.getReorientExpressionAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:440:1: ( rule__ReorientExpression__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:440:2: rule__ReorientExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Alternatives_in_ruleReorientExpression874);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:452:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:453:1: ( ruleConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:454:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint901);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint908); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:461:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:465:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:466:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:466:1: ( ( rule__Constraint__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:467:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:468:1: ( rule__Constraint__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:468:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint934);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:480:1: entryRuleExternalLoad : ruleExternalLoad EOF ;
    public final void entryRuleExternalLoad() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:481:1: ( ruleExternalLoad EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:482:1: ruleExternalLoad EOF
            {
             before(grammarAccess.getExternalLoadRule()); 
            pushFollow(FOLLOW_ruleExternalLoad_in_entryRuleExternalLoad961);
            ruleExternalLoad();

            state._fsp--;

             after(grammarAccess.getExternalLoadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalLoad968); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:489:1: ruleExternalLoad : ( ( rule__ExternalLoad__Group__0 ) ) ;
    public final void ruleExternalLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:493:2: ( ( ( rule__ExternalLoad__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:494:1: ( ( rule__ExternalLoad__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:494:1: ( ( rule__ExternalLoad__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:495:1: ( rule__ExternalLoad__Group__0 )
            {
             before(grammarAccess.getExternalLoadAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:496:1: ( rule__ExternalLoad__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:496:2: rule__ExternalLoad__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__0_in_ruleExternalLoad994);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:508:1: entryRuleMatrix : ruleMatrix EOF ;
    public final void entryRuleMatrix() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:509:1: ( ruleMatrix EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:510:1: ruleMatrix EOF
            {
             before(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_ruleMatrix_in_entryRuleMatrix1021);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getMatrixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix1028); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:517:1: ruleMatrix : ( ( rule__Matrix__Alternatives ) ) ;
    public final void ruleMatrix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:521:2: ( ( ( rule__Matrix__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:522:1: ( ( rule__Matrix__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:522:1: ( ( rule__Matrix__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:523:1: ( rule__Matrix__Alternatives )
            {
             before(grammarAccess.getMatrixAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:524:1: ( rule__Matrix__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:524:2: rule__Matrix__Alternatives
            {
            pushFollow(FOLLOW_rule__Matrix__Alternatives_in_ruleMatrix1054);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:536:1: entryRuleBaseMatrix : ruleBaseMatrix EOF ;
    public final void entryRuleBaseMatrix() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:537:1: ( ruleBaseMatrix EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:538:1: ruleBaseMatrix EOF
            {
             before(grammarAccess.getBaseMatrixRule()); 
            pushFollow(FOLLOW_ruleBaseMatrix_in_entryRuleBaseMatrix1081);
            ruleBaseMatrix();

            state._fsp--;

             after(grammarAccess.getBaseMatrixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseMatrix1088); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:545:1: ruleBaseMatrix : ( ( rule__BaseMatrix__Group__0 ) ) ;
    public final void ruleBaseMatrix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:549:2: ( ( ( rule__BaseMatrix__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:550:1: ( ( rule__BaseMatrix__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:550:1: ( ( rule__BaseMatrix__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:551:1: ( rule__BaseMatrix__Group__0 )
            {
             before(grammarAccess.getBaseMatrixAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:552:1: ( rule__BaseMatrix__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:552:2: rule__BaseMatrix__Group__0
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__0_in_ruleBaseMatrix1114);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:564:1: entryRuleMatrixRef : ruleMatrixRef EOF ;
    public final void entryRuleMatrixRef() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:565:1: ( ruleMatrixRef EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:566:1: ruleMatrixRef EOF
            {
             before(grammarAccess.getMatrixRefRule()); 
            pushFollow(FOLLOW_ruleMatrixRef_in_entryRuleMatrixRef1141);
            ruleMatrixRef();

            state._fsp--;

             after(grammarAccess.getMatrixRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrixRef1148); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:573:1: ruleMatrixRef : ( ( rule__MatrixRef__MatrixAssignment ) ) ;
    public final void ruleMatrixRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:577:2: ( ( ( rule__MatrixRef__MatrixAssignment ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:578:1: ( ( rule__MatrixRef__MatrixAssignment ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:578:1: ( ( rule__MatrixRef__MatrixAssignment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:579:1: ( rule__MatrixRef__MatrixAssignment )
            {
             before(grammarAccess.getMatrixRefAccess().getMatrixAssignment()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:580:1: ( rule__MatrixRef__MatrixAssignment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:580:2: rule__MatrixRef__MatrixAssignment
            {
            pushFollow(FOLLOW_rule__MatrixRef__MatrixAssignment_in_ruleMatrixRef1174);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:592:1: entryRuleAddExp : ruleAddExp EOF ;
    public final void entryRuleAddExp() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:593:1: ( ruleAddExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:594:1: ruleAddExp EOF
            {
             before(grammarAccess.getAddExpRule()); 
            pushFollow(FOLLOW_ruleAddExp_in_entryRuleAddExp1201);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getAddExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExp1208); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:601:1: ruleAddExp : ( ( rule__AddExp__Group__0 ) ) ;
    public final void ruleAddExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:605:2: ( ( ( rule__AddExp__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:606:1: ( ( rule__AddExp__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:606:1: ( ( rule__AddExp__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:607:1: ( rule__AddExp__Group__0 )
            {
             before(grammarAccess.getAddExpAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:608:1: ( rule__AddExp__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:608:2: rule__AddExp__Group__0
            {
            pushFollow(FOLLOW_rule__AddExp__Group__0_in_ruleAddExp1234);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:620:1: entryRuleMultExp : ruleMultExp EOF ;
    public final void entryRuleMultExp() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:621:1: ( ruleMultExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:622:1: ruleMultExp EOF
            {
             before(grammarAccess.getMultExpRule()); 
            pushFollow(FOLLOW_ruleMultExp_in_entryRuleMultExp1261);
            ruleMultExp();

            state._fsp--;

             after(grammarAccess.getMultExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExp1268); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:629:1: ruleMultExp : ( ( rule__MultExp__Group__0 ) ) ;
    public final void ruleMultExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:633:2: ( ( ( rule__MultExp__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:634:1: ( ( rule__MultExp__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:634:1: ( ( rule__MultExp__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:635:1: ( rule__MultExp__Group__0 )
            {
             before(grammarAccess.getMultExpAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:636:1: ( rule__MultExp__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:636:2: rule__MultExp__Group__0
            {
            pushFollow(FOLLOW_rule__MultExp__Group__0_in_ruleMultExp1294);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:648:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:649:1: ( rulePrimary EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:650:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1321);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1328); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:657:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:661:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:662:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:662:1: ( ( rule__Primary__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:663:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:664:1: ( rule__Primary__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:664:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary1354);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:676:1: entryRuleConstantOrFunctionCallExp : ruleConstantOrFunctionCallExp EOF ;
    public final void entryRuleConstantOrFunctionCallExp() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:677:1: ( ruleConstantOrFunctionCallExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:678:1: ruleConstantOrFunctionCallExp EOF
            {
             before(grammarAccess.getConstantOrFunctionCallExpRule()); 
            pushFollow(FOLLOW_ruleConstantOrFunctionCallExp_in_entryRuleConstantOrFunctionCallExp1381);
            ruleConstantOrFunctionCallExp();

            state._fsp--;

             after(grammarAccess.getConstantOrFunctionCallExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantOrFunctionCallExp1388); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:685:1: ruleConstantOrFunctionCallExp : ( ( rule__ConstantOrFunctionCallExp__Group__0 ) ) ;
    public final void ruleConstantOrFunctionCallExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:689:2: ( ( ( rule__ConstantOrFunctionCallExp__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:690:1: ( ( rule__ConstantOrFunctionCallExp__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:690:1: ( ( rule__ConstantOrFunctionCallExp__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:691:1: ( rule__ConstantOrFunctionCallExp__Group__0 )
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:692:1: ( rule__ConstantOrFunctionCallExp__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:692:2: rule__ConstantOrFunctionCallExp__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group__0_in_ruleConstantOrFunctionCallExp1414);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:704:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:705:1: ( ruleNumberLiteral EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:706:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1441);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral1448); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:713:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:717:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:718:1: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:718:1: ( ( rule__NumberLiteral__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:719:1: ( rule__NumberLiteral__Group__0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:720:1: ( rule__NumberLiteral__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:720:2: rule__NumberLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__0_in_ruleNumberLiteral1474);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:733:1: ruleAXIS : ( ( rule__AXIS__Alternatives ) ) ;
    public final void ruleAXIS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:737:1: ( ( ( rule__AXIS__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:738:1: ( ( rule__AXIS__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:738:1: ( ( rule__AXIS__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:739:1: ( rule__AXIS__Alternatives )
            {
             before(grammarAccess.getAXISAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:740:1: ( rule__AXIS__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:740:2: rule__AXIS__Alternatives
            {
            pushFollow(FOLLOW_rule__AXIS__Alternatives_in_ruleAXIS1511);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:752:1: ruleConstraintType : ( ( rule__ConstraintType__Alternatives ) ) ;
    public final void ruleConstraintType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:756:1: ( ( ( rule__ConstraintType__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:757:1: ( ( rule__ConstraintType__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:757:1: ( ( rule__ConstraintType__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:758:1: ( rule__ConstraintType__Alternatives )
            {
             before(grammarAccess.getConstraintTypeAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:759:1: ( rule__ConstraintType__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:759:2: rule__ConstraintType__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstraintType__Alternatives_in_ruleConstraintType1547);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:771:1: ruleLoadType : ( ( rule__LoadType__Alternatives ) ) ;
    public final void ruleLoadType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:775:1: ( ( ( rule__LoadType__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:776:1: ( ( rule__LoadType__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:776:1: ( ( rule__LoadType__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:777:1: ( rule__LoadType__Alternatives )
            {
             before(grammarAccess.getLoadTypeAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:778:1: ( rule__LoadType__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:778:2: rule__LoadType__Alternatives
            {
            pushFollow(FOLLOW_rule__LoadType__Alternatives_in_ruleLoadType1583);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:789:1: rule__InitialDefinition__Alternatives : ( ( ruleBaseMatrix ) | ( ruleJointType ) );
    public final void rule__InitialDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:793:1: ( ( ruleBaseMatrix ) | ( ruleJointType ) )
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:794:1: ( ruleBaseMatrix )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:794:1: ( ruleBaseMatrix )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:795:1: ruleBaseMatrix
                    {
                     before(grammarAccess.getInitialDefinitionAccess().getBaseMatrixParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBaseMatrix_in_rule__InitialDefinition__Alternatives1618);
                    ruleBaseMatrix();

                    state._fsp--;

                     after(grammarAccess.getInitialDefinitionAccess().getBaseMatrixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:800:6: ( ruleJointType )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:800:6: ( ruleJointType )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:801:1: ruleJointType
                    {
                     before(grammarAccess.getInitialDefinitionAccess().getJointTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleJointType_in_rule__InitialDefinition__Alternatives1635);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:811:1: rule__SystemElement__Alternatives : ( ( ruleBody ) | ( ruleJoint ) | ( ruleConstraint ) | ( ruleExternalLoad ) );
    public final void rule__SystemElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:815:1: ( ( ruleBody ) | ( ruleJoint ) | ( ruleConstraint ) | ( ruleExternalLoad ) )
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:816:1: ( ruleBody )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:816:1: ( ruleBody )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:817:1: ruleBody
                    {
                     before(grammarAccess.getSystemElementAccess().getBodyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBody_in_rule__SystemElement__Alternatives1667);
                    ruleBody();

                    state._fsp--;

                     after(grammarAccess.getSystemElementAccess().getBodyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:822:6: ( ruleJoint )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:822:6: ( ruleJoint )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:823:1: ruleJoint
                    {
                     before(grammarAccess.getSystemElementAccess().getJointParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleJoint_in_rule__SystemElement__Alternatives1684);
                    ruleJoint();

                    state._fsp--;

                     after(grammarAccess.getSystemElementAccess().getJointParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:828:6: ( ruleConstraint )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:828:6: ( ruleConstraint )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:829:1: ruleConstraint
                    {
                     before(grammarAccess.getSystemElementAccess().getConstraintParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleConstraint_in_rule__SystemElement__Alternatives1701);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getSystemElementAccess().getConstraintParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:834:6: ( ruleExternalLoad )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:834:6: ( ruleExternalLoad )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:835:1: ruleExternalLoad
                    {
                     before(grammarAccess.getSystemElementAccess().getExternalLoadParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleExternalLoad_in_rule__SystemElement__Alternatives1718);
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


    // $ANTLR start "rule__BodyReference__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:845:1: rule__BodyReference__Alternatives : ( ( ( rule__BodyReference__BaseAssignment_0 ) ) | ( ( rule__BodyReference__RefAssignment_1 ) ) );
    public final void rule__BodyReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:849:1: ( ( ( rule__BodyReference__BaseAssignment_0 ) ) | ( ( rule__BodyReference__RefAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==58) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:850:1: ( ( rule__BodyReference__BaseAssignment_0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:850:1: ( ( rule__BodyReference__BaseAssignment_0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:851:1: ( rule__BodyReference__BaseAssignment_0 )
                    {
                     before(grammarAccess.getBodyReferenceAccess().getBaseAssignment_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:852:1: ( rule__BodyReference__BaseAssignment_0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:852:2: rule__BodyReference__BaseAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BodyReference__BaseAssignment_0_in_rule__BodyReference__Alternatives1750);
                    rule__BodyReference__BaseAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyReferenceAccess().getBaseAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:856:6: ( ( rule__BodyReference__RefAssignment_1 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:856:6: ( ( rule__BodyReference__RefAssignment_1 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:857:1: ( rule__BodyReference__RefAssignment_1 )
                    {
                     before(grammarAccess.getBodyReferenceAccess().getRefAssignment_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:858:1: ( rule__BodyReference__RefAssignment_1 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:858:2: rule__BodyReference__RefAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BodyReference__RefAssignment_1_in_rule__BodyReference__Alternatives1768);
                    rule__BodyReference__RefAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyReferenceAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__BodyReference__Alternatives"


    // $ANTLR start "rule__JointTypeExpression__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:867:1: rule__JointTypeExpression__Alternatives : ( ( ( rule__JointTypeExpression__RefAssignment_0 ) ) | ( ( rule__JointTypeExpression__Group_1__0 ) ) | ( ( rule__JointTypeExpression__Group_2__0 ) ) );
    public final void rule__JointTypeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:871:1: ( ( ( rule__JointTypeExpression__RefAssignment_0 ) ) | ( ( rule__JointTypeExpression__Group_1__0 ) ) | ( ( rule__JointTypeExpression__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 43:
                {
                alt4=2;
                }
                break;
            case 47:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:872:1: ( ( rule__JointTypeExpression__RefAssignment_0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:872:1: ( ( rule__JointTypeExpression__RefAssignment_0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:873:1: ( rule__JointTypeExpression__RefAssignment_0 )
                    {
                     before(grammarAccess.getJointTypeExpressionAccess().getRefAssignment_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:874:1: ( rule__JointTypeExpression__RefAssignment_0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:874:2: rule__JointTypeExpression__RefAssignment_0
                    {
                    pushFollow(FOLLOW_rule__JointTypeExpression__RefAssignment_0_in_rule__JointTypeExpression__Alternatives1801);
                    rule__JointTypeExpression__RefAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointTypeExpressionAccess().getRefAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:878:6: ( ( rule__JointTypeExpression__Group_1__0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:878:6: ( ( rule__JointTypeExpression__Group_1__0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:879:1: ( rule__JointTypeExpression__Group_1__0 )
                    {
                     before(grammarAccess.getJointTypeExpressionAccess().getGroup_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:880:1: ( rule__JointTypeExpression__Group_1__0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:880:2: rule__JointTypeExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__0_in_rule__JointTypeExpression__Alternatives1819);
                    rule__JointTypeExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointTypeExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:884:6: ( ( rule__JointTypeExpression__Group_2__0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:884:6: ( ( rule__JointTypeExpression__Group_2__0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:885:1: ( rule__JointTypeExpression__Group_2__0 )
                    {
                     before(grammarAccess.getJointTypeExpressionAccess().getGroup_2()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:886:1: ( rule__JointTypeExpression__Group_2__0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:886:2: rule__JointTypeExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__0_in_rule__JointTypeExpression__Alternatives1837);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:895:1: rule__ReorientExpression__Alternatives : ( ( ( rule__ReorientExpression__RefAssignment_0 ) ) | ( ( rule__ReorientExpression__Group_1__0 ) ) );
    public final void rule__ReorientExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:899:1: ( ( ( rule__ReorientExpression__RefAssignment_0 ) ) | ( ( rule__ReorientExpression__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==44) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:900:1: ( ( rule__ReorientExpression__RefAssignment_0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:900:1: ( ( rule__ReorientExpression__RefAssignment_0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:901:1: ( rule__ReorientExpression__RefAssignment_0 )
                    {
                     before(grammarAccess.getReorientExpressionAccess().getRefAssignment_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:902:1: ( rule__ReorientExpression__RefAssignment_0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:902:2: rule__ReorientExpression__RefAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ReorientExpression__RefAssignment_0_in_rule__ReorientExpression__Alternatives1870);
                    rule__ReorientExpression__RefAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReorientExpressionAccess().getRefAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:906:6: ( ( rule__ReorientExpression__Group_1__0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:906:6: ( ( rule__ReorientExpression__Group_1__0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:907:1: ( rule__ReorientExpression__Group_1__0 )
                    {
                     before(grammarAccess.getReorientExpressionAccess().getGroup_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:908:1: ( rule__ReorientExpression__Group_1__0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:908:2: rule__ReorientExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ReorientExpression__Group_1__0_in_rule__ReorientExpression__Alternatives1888);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:917:1: rule__Matrix__Alternatives : ( ( ruleBaseMatrix ) | ( ruleMatrixRef ) );
    public final void rule__Matrix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:921:1: ( ( ruleBaseMatrix ) | ( ruleMatrixRef ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==55||LA6_0==57) ) {
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:922:1: ( ruleBaseMatrix )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:922:1: ( ruleBaseMatrix )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:923:1: ruleBaseMatrix
                    {
                     before(grammarAccess.getMatrixAccess().getBaseMatrixParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBaseMatrix_in_rule__Matrix__Alternatives1921);
                    ruleBaseMatrix();

                    state._fsp--;

                     after(grammarAccess.getMatrixAccess().getBaseMatrixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:928:6: ( ruleMatrixRef )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:928:6: ( ruleMatrixRef )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:929:1: ruleMatrixRef
                    {
                     before(grammarAccess.getMatrixAccess().getMatrixRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMatrixRef_in_rule__Matrix__Alternatives1938);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:939:1: rule__AddExp__OpAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AddExp__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:943:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:944:1: ( '+' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:944:1: ( '+' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:945:1: '+'
                    {
                     before(grammarAccess.getAddExpAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__AddExp__OpAlternatives_1_1_01971); 
                     after(grammarAccess.getAddExpAccess().getOpPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:952:6: ( '-' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:952:6: ( '-' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:953:1: '-'
                    {
                     before(grammarAccess.getAddExpAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__AddExp__OpAlternatives_1_1_01991); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:965:1: rule__MultExp__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MultExp__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:969:1: ( ( '*' ) | ( '/' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:970:1: ( '*' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:970:1: ( '*' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:971:1: '*'
                    {
                     before(grammarAccess.getMultExpAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__MultExp__OpAlternatives_1_1_02026); 
                     after(grammarAccess.getMultExpAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:978:6: ( '/' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:978:6: ( '/' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:979:1: '/'
                    {
                     before(grammarAccess.getMultExpAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__MultExp__OpAlternatives_1_1_02046); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:991:1: rule__Primary__Alternatives : ( ( ruleNumberLiteral ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleConstantOrFunctionCallExp ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:995:1: ( ( ruleNumberLiteral ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleConstantOrFunctionCallExp ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_REAL:
            case 13:
                {
                alt9=1;
                }
                break;
            case 44:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:996:1: ( ruleNumberLiteral )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:996:1: ( ruleNumberLiteral )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:997:1: ruleNumberLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumberLiteral_in_rule__Primary__Alternatives2080);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1002:6: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1002:6: ( ( rule__Primary__Group_1__0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1003:1: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1004:1: ( rule__Primary__Group_1__0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1004:2: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives2097);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1008:6: ( ruleConstantOrFunctionCallExp )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1008:6: ( ruleConstantOrFunctionCallExp )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1009:1: ruleConstantOrFunctionCallExp
                    {
                     before(grammarAccess.getPrimaryAccess().getConstantOrFunctionCallExpParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleConstantOrFunctionCallExp_in_rule__Primary__Alternatives2115);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1019:1: rule__AXIS__Alternatives : ( ( ( 'x' ) ) | ( ( 'y' ) ) | ( ( 'z' ) ) );
    public final void rule__AXIS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1023:1: ( ( ( 'x' ) ) | ( ( 'y' ) ) | ( ( 'z' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1024:1: ( ( 'x' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1024:1: ( ( 'x' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1025:1: ( 'x' )
                    {
                     before(grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1026:1: ( 'x' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1026:3: 'x'
                    {
                    match(input,16,FOLLOW_16_in_rule__AXIS__Alternatives2148); 

                    }

                     after(grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1031:6: ( ( 'y' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1031:6: ( ( 'y' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1032:1: ( 'y' )
                    {
                     before(grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1033:1: ( 'y' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1033:3: 'y'
                    {
                    match(input,17,FOLLOW_17_in_rule__AXIS__Alternatives2169); 

                    }

                     after(grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1038:6: ( ( 'z' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1038:6: ( ( 'z' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1039:1: ( 'z' )
                    {
                     before(grammarAccess.getAXISAccess().getZEnumLiteralDeclaration_2()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1040:1: ( 'z' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1040:3: 'z'
                    {
                    match(input,18,FOLLOW_18_in_rule__AXIS__Alternatives2190); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1050:1: rule__ConstraintType__Alternatives : ( ( ( 'geometrical' ) ) | ( ( 'velocity' ) ) );
    public final void rule__ConstraintType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1054:1: ( ( ( 'geometrical' ) ) | ( ( 'velocity' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            else if ( (LA11_0==20) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1055:1: ( ( 'geometrical' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1055:1: ( ( 'geometrical' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1056:1: ( 'geometrical' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1057:1: ( 'geometrical' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1057:3: 'geometrical'
                    {
                    match(input,19,FOLLOW_19_in_rule__ConstraintType__Alternatives2226); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1062:6: ( ( 'velocity' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1062:6: ( ( 'velocity' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1063:1: ( 'velocity' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getVELOCITYEnumLiteralDeclaration_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1064:1: ( 'velocity' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1064:3: 'velocity'
                    {
                    match(input,20,FOLLOW_20_in_rule__ConstraintType__Alternatives2247); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1074:1: rule__LoadType__Alternatives : ( ( ( 'force' ) ) | ( ( 'torque' ) ) );
    public final void rule__LoadType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1078:1: ( ( ( 'force' ) ) | ( ( 'torque' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1079:1: ( ( 'force' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1079:1: ( ( 'force' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1080:1: ( 'force' )
                    {
                     before(grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1081:1: ( 'force' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1081:3: 'force'
                    {
                    match(input,21,FOLLOW_21_in_rule__LoadType__Alternatives2283); 

                    }

                     after(grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1086:6: ( ( 'torque' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1086:6: ( ( 'torque' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1087:1: ( 'torque' )
                    {
                     before(grammarAccess.getLoadTypeAccess().getTORQUEEnumLiteralDeclaration_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1088:1: ( 'torque' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1088:3: 'torque'
                    {
                    match(input,22,FOLLOW_22_in_rule__LoadType__Alternatives2304); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1100:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1104:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1105:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02337);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02340);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1112:1: rule__Model__Group__0__Impl : ( ( rule__Model__DefsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1116:1: ( ( ( rule__Model__DefsAssignment_0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1117:1: ( ( rule__Model__DefsAssignment_0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1117:1: ( ( rule__Model__DefsAssignment_0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1118:1: ( rule__Model__DefsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getDefsAssignment_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1119:1: ( rule__Model__DefsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==33||LA13_0==43||LA13_0==47||LA13_0==55||LA13_0==57) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1119:2: rule__Model__DefsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__DefsAssignment_0_in_rule__Model__Group__0__Impl2367);
            	    rule__Model__DefsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1129:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1133:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1134:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12398);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12401);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1141:1: rule__Model__Group__1__Impl : ( ( rule__Model__WorldAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1145:1: ( ( ( rule__Model__WorldAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1146:1: ( ( rule__Model__WorldAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1146:1: ( ( rule__Model__WorldAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1147:1: ( rule__Model__WorldAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getWorldAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1148:1: ( rule__Model__WorldAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1148:2: rule__Model__WorldAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__WorldAssignment_1_in_rule__Model__Group__1__Impl2428);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1158:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1162:1: ( rule__Model__Group__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1163:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22458);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1169:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1173:1: ( ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1174:1: ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1174:1: ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1175:1: ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1175:1: ( ( rule__Model__BodiesAssignment_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1176:1: ( rule__Model__BodiesAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getBodiesAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1177:1: ( rule__Model__BodiesAssignment_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1177:2: rule__Model__BodiesAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl2487);
            rule__Model__BodiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBodiesAssignment_2()); 

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1180:1: ( ( rule__Model__BodiesAssignment_2 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1181:1: ( rule__Model__BodiesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getBodiesAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1182:1: ( rule__Model__BodiesAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1182:2: rule__Model__BodiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl2499);
            	    rule__Model__BodiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1199:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1203:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1204:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_rule__Environment__Group__0__Impl_in_rule__Environment__Group__02538);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__1_in_rule__Environment__Group__02541);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1211:1: rule__Environment__Group__0__Impl : ( 'world' ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1215:1: ( ( 'world' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1216:1: ( 'world' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1216:1: ( 'world' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1217:1: 'world'
            {
             before(grammarAccess.getEnvironmentAccess().getWorldKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Environment__Group__0__Impl2569); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1230:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1234:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1235:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_rule__Environment__Group__1__Impl_in_rule__Environment__Group__12600);
            rule__Environment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__2_in_rule__Environment__Group__12603);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1242:1: rule__Environment__Group__1__Impl : ( '{' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1246:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1247:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1247:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1248:1: '{'
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Environment__Group__1__Impl2631); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1261:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1265:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1266:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_rule__Environment__Group__2__Impl_in_rule__Environment__Group__22662);
            rule__Environment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__3_in_rule__Environment__Group__22665);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1273:1: rule__Environment__Group__2__Impl : ( 'gravity' ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1277:1: ( ( 'gravity' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1278:1: ( 'gravity' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1278:1: ( 'gravity' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1279:1: 'gravity'
            {
             before(grammarAccess.getEnvironmentAccess().getGravityKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Environment__Group__2__Impl2693); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1292:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl rule__Environment__Group__4 ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1296:1: ( rule__Environment__Group__3__Impl rule__Environment__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1297:2: rule__Environment__Group__3__Impl rule__Environment__Group__4
            {
            pushFollow(FOLLOW_rule__Environment__Group__3__Impl_in_rule__Environment__Group__32724);
            rule__Environment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__4_in_rule__Environment__Group__32727);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1304:1: rule__Environment__Group__3__Impl : ( ( rule__Environment__GravityAssignment_3 ) ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1308:1: ( ( ( rule__Environment__GravityAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1309:1: ( ( rule__Environment__GravityAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1309:1: ( ( rule__Environment__GravityAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1310:1: ( rule__Environment__GravityAssignment_3 )
            {
             before(grammarAccess.getEnvironmentAccess().getGravityAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1311:1: ( rule__Environment__GravityAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1311:2: rule__Environment__GravityAssignment_3
            {
            pushFollow(FOLLOW_rule__Environment__GravityAssignment_3_in_rule__Environment__Group__3__Impl2754);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1321:1: rule__Environment__Group__4 : rule__Environment__Group__4__Impl ;
    public final void rule__Environment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1325:1: ( rule__Environment__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1326:2: rule__Environment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Environment__Group__4__Impl_in_rule__Environment__Group__42784);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1332:1: rule__Environment__Group__4__Impl : ( '}' ) ;
    public final void rule__Environment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1336:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1337:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1337:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1338:1: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Environment__Group__4__Impl2812); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1361:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1365:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1366:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__02853);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__02856);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1373:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1377:1: ( ( 'system' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1378:1: ( 'system' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1378:1: ( 'system' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1379:1: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__System__Group__0__Impl2884); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1392:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1396:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1397:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__12915);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__12918);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1404:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1408:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1409:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1409:1: ( ( rule__System__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1410:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1411:1: ( rule__System__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1411:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl2945);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1421:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1425:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1426:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__22975);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__22978);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1433:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1437:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1438:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1438:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1439:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__System__Group__2__Impl3006); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1452:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1456:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1457:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__33037);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__33040);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1464:1: rule__System__Group__3__Impl : ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1468:1: ( ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1469:1: ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1469:1: ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1470:1: ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1470:1: ( ( rule__System__ElementsAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1471:1: ( rule__System__ElementsAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getElementsAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1472:1: ( rule__System__ElementsAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1472:2: rule__System__ElementsAssignment_3
            {
            pushFollow(FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl3069);
            rule__System__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getElementsAssignment_3()); 

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1475:1: ( ( rule__System__ElementsAssignment_3 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1476:1: ( rule__System__ElementsAssignment_3 )*
            {
             before(grammarAccess.getSystemAccess().getElementsAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1477:1: ( rule__System__ElementsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28||LA15_0==33||(LA15_0>=52 && LA15_0<=53)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1477:2: rule__System__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl3081);
            	    rule__System__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1488:1: rule__System__Group__4 : rule__System__Group__4__Impl ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1492:1: ( rule__System__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1493:2: rule__System__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__43114);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1499:1: rule__System__Group__4__Impl : ( '}' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1503:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1504:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1504:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1505:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__System__Group__4__Impl3142); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1528:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1532:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1533:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__03183);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__03186);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1540:1: rule__Body__Group__0__Impl : ( 'body' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1544:1: ( ( 'body' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1545:1: ( 'body' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1545:1: ( 'body' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1546:1: 'body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Body__Group__0__Impl3214); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1559:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1563:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1564:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__13245);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__13248);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1571:1: rule__Body__Group__1__Impl : ( ( rule__Body__NameAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1575:1: ( ( ( rule__Body__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1576:1: ( ( rule__Body__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1576:1: ( ( rule__Body__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1577:1: ( rule__Body__NameAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1578:1: ( rule__Body__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1578:2: rule__Body__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__NameAssignment_1_in_rule__Body__Group__1__Impl3275);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1588:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1592:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1593:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__23305);
            rule__Body__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__23308);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1600:1: rule__Body__Group__2__Impl : ( '{' ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1604:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1605:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1605:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1606:1: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Body__Group__2__Impl3336); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1619:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1623:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1624:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__33367);
            rule__Body__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__4_in_rule__Body__Group__33370);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1631:1: rule__Body__Group__3__Impl : ( ( rule__Body__MassAssignment_3 ) ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1635:1: ( ( ( rule__Body__MassAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1636:1: ( ( rule__Body__MassAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1636:1: ( ( rule__Body__MassAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1637:1: ( rule__Body__MassAssignment_3 )
            {
             before(grammarAccess.getBodyAccess().getMassAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1638:1: ( rule__Body__MassAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1638:2: rule__Body__MassAssignment_3
            {
            pushFollow(FOLLOW_rule__Body__MassAssignment_3_in_rule__Body__Group__3__Impl3397);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1648:1: rule__Body__Group__4 : rule__Body__Group__4__Impl ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1652:1: ( rule__Body__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1653:2: rule__Body__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__43427);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1659:1: rule__Body__Group__4__Impl : ( '}' ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1663:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1664:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1664:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1665:1: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Body__Group__4__Impl3455); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1688:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1692:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1693:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_rule__Mass__Group__0__Impl_in_rule__Mass__Group__03496);
            rule__Mass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__1_in_rule__Mass__Group__03499);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1700:1: rule__Mass__Group__0__Impl : ( 'mass' ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1704:1: ( ( 'mass' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1705:1: ( 'mass' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1705:1: ( 'mass' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1706:1: 'mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Mass__Group__0__Impl3527); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1719:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1723:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1724:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_rule__Mass__Group__1__Impl_in_rule__Mass__Group__13558);
            rule__Mass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__2_in_rule__Mass__Group__13561);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1731:1: rule__Mass__Group__1__Impl : ( '{' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1735:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1736:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1736:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1737:1: '{'
            {
             before(grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Mass__Group__1__Impl3589); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1750:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1754:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1755:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_rule__Mass__Group__2__Impl_in_rule__Mass__Group__23620);
            rule__Mass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__3_in_rule__Mass__Group__23623);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1762:1: rule__Mass__Group__2__Impl : ( 'value' ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1766:1: ( ( 'value' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1767:1: ( 'value' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1767:1: ( 'value' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1768:1: 'value'
            {
             before(grammarAccess.getMassAccess().getValueKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Mass__Group__2__Impl3651); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1781:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1785:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1786:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
            {
            pushFollow(FOLLOW_rule__Mass__Group__3__Impl_in_rule__Mass__Group__33682);
            rule__Mass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__4_in_rule__Mass__Group__33685);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1793:1: rule__Mass__Group__3__Impl : ( ( rule__Mass__ValueAssignment_3 ) ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1797:1: ( ( ( rule__Mass__ValueAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1798:1: ( ( rule__Mass__ValueAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1798:1: ( ( rule__Mass__ValueAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1799:1: ( rule__Mass__ValueAssignment_3 )
            {
             before(grammarAccess.getMassAccess().getValueAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1800:1: ( rule__Mass__ValueAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1800:2: rule__Mass__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Mass__ValueAssignment_3_in_rule__Mass__Group__3__Impl3712);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1810:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl rule__Mass__Group__5 ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1814:1: ( rule__Mass__Group__4__Impl rule__Mass__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1815:2: rule__Mass__Group__4__Impl rule__Mass__Group__5
            {
            pushFollow(FOLLOW_rule__Mass__Group__4__Impl_in_rule__Mass__Group__43742);
            rule__Mass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__5_in_rule__Mass__Group__43745);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1822:1: rule__Mass__Group__4__Impl : ( 'position' ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1826:1: ( ( 'position' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1827:1: ( 'position' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1827:1: ( 'position' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1828:1: 'position'
            {
             before(grammarAccess.getMassAccess().getPositionKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__Mass__Group__4__Impl3773); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1841:1: rule__Mass__Group__5 : rule__Mass__Group__5__Impl rule__Mass__Group__6 ;
    public final void rule__Mass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1845:1: ( rule__Mass__Group__5__Impl rule__Mass__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1846:2: rule__Mass__Group__5__Impl rule__Mass__Group__6
            {
            pushFollow(FOLLOW_rule__Mass__Group__5__Impl_in_rule__Mass__Group__53804);
            rule__Mass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__6_in_rule__Mass__Group__53807);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1853:1: rule__Mass__Group__5__Impl : ( ( rule__Mass__PositionAssignment_5 ) ) ;
    public final void rule__Mass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1857:1: ( ( ( rule__Mass__PositionAssignment_5 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1858:1: ( ( rule__Mass__PositionAssignment_5 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1858:1: ( ( rule__Mass__PositionAssignment_5 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1859:1: ( rule__Mass__PositionAssignment_5 )
            {
             before(grammarAccess.getMassAccess().getPositionAssignment_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1860:1: ( rule__Mass__PositionAssignment_5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1860:2: rule__Mass__PositionAssignment_5
            {
            pushFollow(FOLLOW_rule__Mass__PositionAssignment_5_in_rule__Mass__Group__5__Impl3834);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1870:1: rule__Mass__Group__6 : rule__Mass__Group__6__Impl rule__Mass__Group__7 ;
    public final void rule__Mass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1874:1: ( rule__Mass__Group__6__Impl rule__Mass__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1875:2: rule__Mass__Group__6__Impl rule__Mass__Group__7
            {
            pushFollow(FOLLOW_rule__Mass__Group__6__Impl_in_rule__Mass__Group__63864);
            rule__Mass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__7_in_rule__Mass__Group__63867);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1882:1: rule__Mass__Group__6__Impl : ( 'inertia' ) ;
    public final void rule__Mass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1886:1: ( ( 'inertia' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1887:1: ( 'inertia' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1887:1: ( 'inertia' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1888:1: 'inertia'
            {
             before(grammarAccess.getMassAccess().getInertiaKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__Mass__Group__6__Impl3895); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1901:1: rule__Mass__Group__7 : rule__Mass__Group__7__Impl rule__Mass__Group__8 ;
    public final void rule__Mass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1905:1: ( rule__Mass__Group__7__Impl rule__Mass__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1906:2: rule__Mass__Group__7__Impl rule__Mass__Group__8
            {
            pushFollow(FOLLOW_rule__Mass__Group__7__Impl_in_rule__Mass__Group__73926);
            rule__Mass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__8_in_rule__Mass__Group__73929);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1913:1: rule__Mass__Group__7__Impl : ( ( rule__Mass__InertiaAssignment_7 ) ) ;
    public final void rule__Mass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1917:1: ( ( ( rule__Mass__InertiaAssignment_7 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1918:1: ( ( rule__Mass__InertiaAssignment_7 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1918:1: ( ( rule__Mass__InertiaAssignment_7 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1919:1: ( rule__Mass__InertiaAssignment_7 )
            {
             before(grammarAccess.getMassAccess().getInertiaAssignment_7()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1920:1: ( rule__Mass__InertiaAssignment_7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1920:2: rule__Mass__InertiaAssignment_7
            {
            pushFollow(FOLLOW_rule__Mass__InertiaAssignment_7_in_rule__Mass__Group__7__Impl3956);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1930:1: rule__Mass__Group__8 : rule__Mass__Group__8__Impl ;
    public final void rule__Mass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1934:1: ( rule__Mass__Group__8__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1935:2: rule__Mass__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Mass__Group__8__Impl_in_rule__Mass__Group__83986);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1941:1: rule__Mass__Group__8__Impl : ( '}' ) ;
    public final void rule__Mass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1945:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1946:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1946:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1947:1: '}'
            {
             before(grammarAccess.getMassAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__Mass__Group__8__Impl4014); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1978:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1982:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1983:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_rule__Joint__Group__0__Impl_in_rule__Joint__Group__04063);
            rule__Joint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__1_in_rule__Joint__Group__04066);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1990:1: rule__Joint__Group__0__Impl : ( 'joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1994:1: ( ( 'joint' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1995:1: ( 'joint' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1995:1: ( 'joint' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1996:1: 'joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Joint__Group__0__Impl4094); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2009:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2013:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2014:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_rule__Joint__Group__1__Impl_in_rule__Joint__Group__14125);
            rule__Joint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__2_in_rule__Joint__Group__14128);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2021:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2025:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2026:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2026:1: ( ( rule__Joint__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2027:1: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2028:1: ( rule__Joint__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2028:2: rule__Joint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Joint__NameAssignment_1_in_rule__Joint__Group__1__Impl4155);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2038:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2042:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2043:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_rule__Joint__Group__2__Impl_in_rule__Joint__Group__24185);
            rule__Joint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__3_in_rule__Joint__Group__24188);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2050:1: rule__Joint__Group__2__Impl : ( ':' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2054:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2055:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2055:1: ( ':' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2056:1: ':'
            {
             before(grammarAccess.getJointAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Joint__Group__2__Impl4216); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2069:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2073:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2074:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_rule__Joint__Group__3__Impl_in_rule__Joint__Group__34247);
            rule__Joint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__4_in_rule__Joint__Group__34250);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2081:1: rule__Joint__Group__3__Impl : ( ( rule__Joint__TypeAssignment_3 ) ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2085:1: ( ( ( rule__Joint__TypeAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2086:1: ( ( rule__Joint__TypeAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2086:1: ( ( rule__Joint__TypeAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2087:1: ( rule__Joint__TypeAssignment_3 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2088:1: ( rule__Joint__TypeAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2088:2: rule__Joint__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Joint__TypeAssignment_3_in_rule__Joint__Group__3__Impl4277);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2098:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2102:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2103:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_rule__Joint__Group__4__Impl_in_rule__Joint__Group__44307);
            rule__Joint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__5_in_rule__Joint__Group__44310);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2110:1: rule__Joint__Group__4__Impl : ( ( rule__Joint__IsStartAssignment_4 )? ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2114:1: ( ( ( rule__Joint__IsStartAssignment_4 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2115:1: ( ( rule__Joint__IsStartAssignment_4 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2115:1: ( ( rule__Joint__IsStartAssignment_4 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2116:1: ( rule__Joint__IsStartAssignment_4 )?
            {
             before(grammarAccess.getJointAccess().getIsStartAssignment_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2117:1: ( rule__Joint__IsStartAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==59) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2117:2: rule__Joint__IsStartAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Joint__IsStartAssignment_4_in_rule__Joint__Group__4__Impl4337);
                    rule__Joint__IsStartAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getIsStartAssignment_4()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2127:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2131:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2132:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_rule__Joint__Group__5__Impl_in_rule__Joint__Group__54368);
            rule__Joint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__6_in_rule__Joint__Group__54371);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2139:1: rule__Joint__Group__5__Impl : ( 'between' ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2143:1: ( ( 'between' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2144:1: ( 'between' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2144:1: ( 'between' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2145:1: 'between'
            {
             before(grammarAccess.getJointAccess().getBetweenKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__Joint__Group__5__Impl4399); 
             after(grammarAccess.getJointAccess().getBetweenKeyword_5()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2158:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2162:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2163:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_rule__Joint__Group__6__Impl_in_rule__Joint__Group__64430);
            rule__Joint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__7_in_rule__Joint__Group__64433);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2170:1: rule__Joint__Group__6__Impl : ( ( rule__Joint__Body1Assignment_6 ) ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2174:1: ( ( ( rule__Joint__Body1Assignment_6 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2175:1: ( ( rule__Joint__Body1Assignment_6 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2175:1: ( ( rule__Joint__Body1Assignment_6 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2176:1: ( rule__Joint__Body1Assignment_6 )
            {
             before(grammarAccess.getJointAccess().getBody1Assignment_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2177:1: ( rule__Joint__Body1Assignment_6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2177:2: rule__Joint__Body1Assignment_6
            {
            pushFollow(FOLLOW_rule__Joint__Body1Assignment_6_in_rule__Joint__Group__6__Impl4460);
            rule__Joint__Body1Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getBody1Assignment_6()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2187:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2191:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2192:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_rule__Joint__Group__7__Impl_in_rule__Joint__Group__74490);
            rule__Joint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__8_in_rule__Joint__Group__74493);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2199:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__RelTrans1Assignment_7 ) ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2203:1: ( ( ( rule__Joint__RelTrans1Assignment_7 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2204:1: ( ( rule__Joint__RelTrans1Assignment_7 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2204:1: ( ( rule__Joint__RelTrans1Assignment_7 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2205:1: ( rule__Joint__RelTrans1Assignment_7 )
            {
             before(grammarAccess.getJointAccess().getRelTrans1Assignment_7()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2206:1: ( rule__Joint__RelTrans1Assignment_7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2206:2: rule__Joint__RelTrans1Assignment_7
            {
            pushFollow(FOLLOW_rule__Joint__RelTrans1Assignment_7_in_rule__Joint__Group__7__Impl4520);
            rule__Joint__RelTrans1Assignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getRelTrans1Assignment_7()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2216:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2220:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2221:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_rule__Joint__Group__8__Impl_in_rule__Joint__Group__84550);
            rule__Joint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__9_in_rule__Joint__Group__84553);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2228:1: rule__Joint__Group__8__Impl : ( 'and' ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2232:1: ( ( 'and' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2233:1: ( 'and' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2233:1: ( 'and' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2234:1: 'and'
            {
             before(grammarAccess.getJointAccess().getAndKeyword_8()); 
            match(input,36,FOLLOW_36_in_rule__Joint__Group__8__Impl4581); 
             after(grammarAccess.getJointAccess().getAndKeyword_8()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2247:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2251:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2252:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_rule__Joint__Group__9__Impl_in_rule__Joint__Group__94612);
            rule__Joint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__10_in_rule__Joint__Group__94615);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2259:1: rule__Joint__Group__9__Impl : ( ( rule__Joint__Body2Assignment_9 ) ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2263:1: ( ( ( rule__Joint__Body2Assignment_9 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2264:1: ( ( rule__Joint__Body2Assignment_9 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2264:1: ( ( rule__Joint__Body2Assignment_9 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2265:1: ( rule__Joint__Body2Assignment_9 )
            {
             before(grammarAccess.getJointAccess().getBody2Assignment_9()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2266:1: ( rule__Joint__Body2Assignment_9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2266:2: rule__Joint__Body2Assignment_9
            {
            pushFollow(FOLLOW_rule__Joint__Body2Assignment_9_in_rule__Joint__Group__9__Impl4642);
            rule__Joint__Body2Assignment_9();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getBody2Assignment_9()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2276:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl rule__Joint__Group__11 ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2280:1: ( rule__Joint__Group__10__Impl rule__Joint__Group__11 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2281:2: rule__Joint__Group__10__Impl rule__Joint__Group__11
            {
            pushFollow(FOLLOW_rule__Joint__Group__10__Impl_in_rule__Joint__Group__104672);
            rule__Joint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__11_in_rule__Joint__Group__104675);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2288:1: rule__Joint__Group__10__Impl : ( ( rule__Joint__RelTrans2Assignment_10 ) ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2292:1: ( ( ( rule__Joint__RelTrans2Assignment_10 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2293:1: ( ( rule__Joint__RelTrans2Assignment_10 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2293:1: ( ( rule__Joint__RelTrans2Assignment_10 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2294:1: ( rule__Joint__RelTrans2Assignment_10 )
            {
             before(grammarAccess.getJointAccess().getRelTrans2Assignment_10()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2295:1: ( rule__Joint__RelTrans2Assignment_10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2295:2: rule__Joint__RelTrans2Assignment_10
            {
            pushFollow(FOLLOW_rule__Joint__RelTrans2Assignment_10_in_rule__Joint__Group__10__Impl4702);
            rule__Joint__RelTrans2Assignment_10();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getRelTrans2Assignment_10()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2305:1: rule__Joint__Group__11 : rule__Joint__Group__11__Impl rule__Joint__Group__12 ;
    public final void rule__Joint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2309:1: ( rule__Joint__Group__11__Impl rule__Joint__Group__12 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2310:2: rule__Joint__Group__11__Impl rule__Joint__Group__12
            {
            pushFollow(FOLLOW_rule__Joint__Group__11__Impl_in_rule__Joint__Group__114732);
            rule__Joint__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__12_in_rule__Joint__Group__114735);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2317:1: rule__Joint__Group__11__Impl : ( 'stiffness' ) ;
    public final void rule__Joint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2321:1: ( ( 'stiffness' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2322:1: ( 'stiffness' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2322:1: ( 'stiffness' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2323:1: 'stiffness'
            {
             before(grammarAccess.getJointAccess().getStiffnessKeyword_11()); 
            match(input,37,FOLLOW_37_in_rule__Joint__Group__11__Impl4763); 
             after(grammarAccess.getJointAccess().getStiffnessKeyword_11()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2336:1: rule__Joint__Group__12 : rule__Joint__Group__12__Impl rule__Joint__Group__13 ;
    public final void rule__Joint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2340:1: ( rule__Joint__Group__12__Impl rule__Joint__Group__13 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2341:2: rule__Joint__Group__12__Impl rule__Joint__Group__13
            {
            pushFollow(FOLLOW_rule__Joint__Group__12__Impl_in_rule__Joint__Group__124794);
            rule__Joint__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__13_in_rule__Joint__Group__124797);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2348:1: rule__Joint__Group__12__Impl : ( '{' ) ;
    public final void rule__Joint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2352:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2353:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2353:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2354:1: '{'
            {
             before(grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,24,FOLLOW_24_in_rule__Joint__Group__12__Impl4825); 
             after(grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2367:1: rule__Joint__Group__13 : rule__Joint__Group__13__Impl rule__Joint__Group__14 ;
    public final void rule__Joint__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2371:1: ( rule__Joint__Group__13__Impl rule__Joint__Group__14 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2372:2: rule__Joint__Group__13__Impl rule__Joint__Group__14
            {
            pushFollow(FOLLOW_rule__Joint__Group__13__Impl_in_rule__Joint__Group__134856);
            rule__Joint__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__14_in_rule__Joint__Group__134859);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2379:1: rule__Joint__Group__13__Impl : ( 'springCoeff' ) ;
    public final void rule__Joint__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2383:1: ( ( 'springCoeff' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2384:1: ( 'springCoeff' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2384:1: ( 'springCoeff' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2385:1: 'springCoeff'
            {
             before(grammarAccess.getJointAccess().getSpringCoeffKeyword_13()); 
            match(input,38,FOLLOW_38_in_rule__Joint__Group__13__Impl4887); 
             after(grammarAccess.getJointAccess().getSpringCoeffKeyword_13()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2398:1: rule__Joint__Group__14 : rule__Joint__Group__14__Impl rule__Joint__Group__15 ;
    public final void rule__Joint__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2402:1: ( rule__Joint__Group__14__Impl rule__Joint__Group__15 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2403:2: rule__Joint__Group__14__Impl rule__Joint__Group__15
            {
            pushFollow(FOLLOW_rule__Joint__Group__14__Impl_in_rule__Joint__Group__144918);
            rule__Joint__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__15_in_rule__Joint__Group__144921);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2410:1: rule__Joint__Group__14__Impl : ( ( rule__Joint__SpringCoeffAssignment_14 ) ) ;
    public final void rule__Joint__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2414:1: ( ( ( rule__Joint__SpringCoeffAssignment_14 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2415:1: ( ( rule__Joint__SpringCoeffAssignment_14 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2415:1: ( ( rule__Joint__SpringCoeffAssignment_14 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2416:1: ( rule__Joint__SpringCoeffAssignment_14 )
            {
             before(grammarAccess.getJointAccess().getSpringCoeffAssignment_14()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2417:1: ( rule__Joint__SpringCoeffAssignment_14 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2417:2: rule__Joint__SpringCoeffAssignment_14
            {
            pushFollow(FOLLOW_rule__Joint__SpringCoeffAssignment_14_in_rule__Joint__Group__14__Impl4948);
            rule__Joint__SpringCoeffAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getSpringCoeffAssignment_14()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2427:1: rule__Joint__Group__15 : rule__Joint__Group__15__Impl rule__Joint__Group__16 ;
    public final void rule__Joint__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2431:1: ( rule__Joint__Group__15__Impl rule__Joint__Group__16 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2432:2: rule__Joint__Group__15__Impl rule__Joint__Group__16
            {
            pushFollow(FOLLOW_rule__Joint__Group__15__Impl_in_rule__Joint__Group__154978);
            rule__Joint__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__16_in_rule__Joint__Group__154981);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2439:1: rule__Joint__Group__15__Impl : ( 'springInit' ) ;
    public final void rule__Joint__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2443:1: ( ( 'springInit' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2444:1: ( 'springInit' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2444:1: ( 'springInit' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2445:1: 'springInit'
            {
             before(grammarAccess.getJointAccess().getSpringInitKeyword_15()); 
            match(input,39,FOLLOW_39_in_rule__Joint__Group__15__Impl5009); 
             after(grammarAccess.getJointAccess().getSpringInitKeyword_15()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2458:1: rule__Joint__Group__16 : rule__Joint__Group__16__Impl rule__Joint__Group__17 ;
    public final void rule__Joint__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2462:1: ( rule__Joint__Group__16__Impl rule__Joint__Group__17 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2463:2: rule__Joint__Group__16__Impl rule__Joint__Group__17
            {
            pushFollow(FOLLOW_rule__Joint__Group__16__Impl_in_rule__Joint__Group__165040);
            rule__Joint__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__17_in_rule__Joint__Group__165043);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2470:1: rule__Joint__Group__16__Impl : ( ( rule__Joint__SpringInitAssignment_16 ) ) ;
    public final void rule__Joint__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2474:1: ( ( ( rule__Joint__SpringInitAssignment_16 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2475:1: ( ( rule__Joint__SpringInitAssignment_16 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2475:1: ( ( rule__Joint__SpringInitAssignment_16 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2476:1: ( rule__Joint__SpringInitAssignment_16 )
            {
             before(grammarAccess.getJointAccess().getSpringInitAssignment_16()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2477:1: ( rule__Joint__SpringInitAssignment_16 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2477:2: rule__Joint__SpringInitAssignment_16
            {
            pushFollow(FOLLOW_rule__Joint__SpringInitAssignment_16_in_rule__Joint__Group__16__Impl5070);
            rule__Joint__SpringInitAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getSpringInitAssignment_16()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2487:1: rule__Joint__Group__17 : rule__Joint__Group__17__Impl rule__Joint__Group__18 ;
    public final void rule__Joint__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2491:1: ( rule__Joint__Group__17__Impl rule__Joint__Group__18 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2492:2: rule__Joint__Group__17__Impl rule__Joint__Group__18
            {
            pushFollow(FOLLOW_rule__Joint__Group__17__Impl_in_rule__Joint__Group__175100);
            rule__Joint__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__18_in_rule__Joint__Group__175103);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2499:1: rule__Joint__Group__17__Impl : ( 'dampViscous' ) ;
    public final void rule__Joint__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2503:1: ( ( 'dampViscous' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2504:1: ( 'dampViscous' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2504:1: ( 'dampViscous' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2505:1: 'dampViscous'
            {
             before(grammarAccess.getJointAccess().getDampViscousKeyword_17()); 
            match(input,40,FOLLOW_40_in_rule__Joint__Group__17__Impl5131); 
             after(grammarAccess.getJointAccess().getDampViscousKeyword_17()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2518:1: rule__Joint__Group__18 : rule__Joint__Group__18__Impl rule__Joint__Group__19 ;
    public final void rule__Joint__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2522:1: ( rule__Joint__Group__18__Impl rule__Joint__Group__19 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2523:2: rule__Joint__Group__18__Impl rule__Joint__Group__19
            {
            pushFollow(FOLLOW_rule__Joint__Group__18__Impl_in_rule__Joint__Group__185162);
            rule__Joint__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__19_in_rule__Joint__Group__185165);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2530:1: rule__Joint__Group__18__Impl : ( ( rule__Joint__DampViscousAssignment_18 ) ) ;
    public final void rule__Joint__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2534:1: ( ( ( rule__Joint__DampViscousAssignment_18 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2535:1: ( ( rule__Joint__DampViscousAssignment_18 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2535:1: ( ( rule__Joint__DampViscousAssignment_18 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2536:1: ( rule__Joint__DampViscousAssignment_18 )
            {
             before(grammarAccess.getJointAccess().getDampViscousAssignment_18()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2537:1: ( rule__Joint__DampViscousAssignment_18 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2537:2: rule__Joint__DampViscousAssignment_18
            {
            pushFollow(FOLLOW_rule__Joint__DampViscousAssignment_18_in_rule__Joint__Group__18__Impl5192);
            rule__Joint__DampViscousAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getDampViscousAssignment_18()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2547:1: rule__Joint__Group__19 : rule__Joint__Group__19__Impl rule__Joint__Group__20 ;
    public final void rule__Joint__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2551:1: ( rule__Joint__Group__19__Impl rule__Joint__Group__20 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2552:2: rule__Joint__Group__19__Impl rule__Joint__Group__20
            {
            pushFollow(FOLLOW_rule__Joint__Group__19__Impl_in_rule__Joint__Group__195222);
            rule__Joint__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__20_in_rule__Joint__Group__195225);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2559:1: rule__Joint__Group__19__Impl : ( 'dampCoulomb' ) ;
    public final void rule__Joint__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2563:1: ( ( 'dampCoulomb' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2564:1: ( 'dampCoulomb' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2564:1: ( 'dampCoulomb' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2565:1: 'dampCoulomb'
            {
             before(grammarAccess.getJointAccess().getDampCoulombKeyword_19()); 
            match(input,41,FOLLOW_41_in_rule__Joint__Group__19__Impl5253); 
             after(grammarAccess.getJointAccess().getDampCoulombKeyword_19()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2578:1: rule__Joint__Group__20 : rule__Joint__Group__20__Impl rule__Joint__Group__21 ;
    public final void rule__Joint__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2582:1: ( rule__Joint__Group__20__Impl rule__Joint__Group__21 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2583:2: rule__Joint__Group__20__Impl rule__Joint__Group__21
            {
            pushFollow(FOLLOW_rule__Joint__Group__20__Impl_in_rule__Joint__Group__205284);
            rule__Joint__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__21_in_rule__Joint__Group__205287);
            rule__Joint__Group__21();

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2590:1: rule__Joint__Group__20__Impl : ( ( rule__Joint__DampCoulombAssignment_20 ) ) ;
    public final void rule__Joint__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2594:1: ( ( ( rule__Joint__DampCoulombAssignment_20 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2595:1: ( ( rule__Joint__DampCoulombAssignment_20 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2595:1: ( ( rule__Joint__DampCoulombAssignment_20 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2596:1: ( rule__Joint__DampCoulombAssignment_20 )
            {
             before(grammarAccess.getJointAccess().getDampCoulombAssignment_20()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2597:1: ( rule__Joint__DampCoulombAssignment_20 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2597:2: rule__Joint__DampCoulombAssignment_20
            {
            pushFollow(FOLLOW_rule__Joint__DampCoulombAssignment_20_in_rule__Joint__Group__20__Impl5314);
            rule__Joint__DampCoulombAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getDampCoulombAssignment_20()); 

            }


            }

        }
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


    // $ANTLR start "rule__Joint__Group__21"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2607:1: rule__Joint__Group__21 : rule__Joint__Group__21__Impl ;
    public final void rule__Joint__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2611:1: ( rule__Joint__Group__21__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2612:2: rule__Joint__Group__21__Impl
            {
            pushFollow(FOLLOW_rule__Joint__Group__21__Impl_in_rule__Joint__Group__215344);
            rule__Joint__Group__21__Impl();

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
    // $ANTLR end "rule__Joint__Group__21"


    // $ANTLR start "rule__Joint__Group__21__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2618:1: rule__Joint__Group__21__Impl : ( '}' ) ;
    public final void rule__Joint__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2622:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2623:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2623:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2624:1: '}'
            {
             before(grammarAccess.getJointAccess().getRightCurlyBracketKeyword_21()); 
            match(input,26,FOLLOW_26_in_rule__Joint__Group__21__Impl5372); 
             after(grammarAccess.getJointAccess().getRightCurlyBracketKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__21__Impl"


    // $ANTLR start "rule__JointType__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2681:1: rule__JointType__Group__0 : rule__JointType__Group__0__Impl rule__JointType__Group__1 ;
    public final void rule__JointType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2685:1: ( rule__JointType__Group__0__Impl rule__JointType__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2686:2: rule__JointType__Group__0__Impl rule__JointType__Group__1
            {
            pushFollow(FOLLOW_rule__JointType__Group__0__Impl_in_rule__JointType__Group__05447);
            rule__JointType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointType__Group__1_in_rule__JointType__Group__05450);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2693:1: rule__JointType__Group__0__Impl : ( ( rule__JointType__Group_0__0 )? ) ;
    public final void rule__JointType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2697:1: ( ( ( rule__JointType__Group_0__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2698:1: ( ( rule__JointType__Group_0__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2698:1: ( ( rule__JointType__Group_0__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2699:1: ( rule__JointType__Group_0__0 )?
            {
             before(grammarAccess.getJointTypeAccess().getGroup_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2700:1: ( rule__JointType__Group_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2700:2: rule__JointType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JointType__Group_0__0_in_rule__JointType__Group__0__Impl5477);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2710:1: rule__JointType__Group__1 : rule__JointType__Group__1__Impl ;
    public final void rule__JointType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2714:1: ( rule__JointType__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2715:2: rule__JointType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__JointType__Group__1__Impl_in_rule__JointType__Group__15508);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2721:1: rule__JointType__Group__1__Impl : ( ( rule__JointType__ExpAssignment_1 ) ) ;
    public final void rule__JointType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2725:1: ( ( ( rule__JointType__ExpAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2726:1: ( ( rule__JointType__ExpAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2726:1: ( ( rule__JointType__ExpAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2727:1: ( rule__JointType__ExpAssignment_1 )
            {
             before(grammarAccess.getJointTypeAccess().getExpAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2728:1: ( rule__JointType__ExpAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2728:2: rule__JointType__ExpAssignment_1
            {
            pushFollow(FOLLOW_rule__JointType__ExpAssignment_1_in_rule__JointType__Group__1__Impl5535);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2742:1: rule__JointType__Group_0__0 : rule__JointType__Group_0__0__Impl rule__JointType__Group_0__1 ;
    public final void rule__JointType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2746:1: ( rule__JointType__Group_0__0__Impl rule__JointType__Group_0__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2747:2: rule__JointType__Group_0__0__Impl rule__JointType__Group_0__1
            {
            pushFollow(FOLLOW_rule__JointType__Group_0__0__Impl_in_rule__JointType__Group_0__05569);
            rule__JointType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointType__Group_0__1_in_rule__JointType__Group_0__05572);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2754:1: rule__JointType__Group_0__0__Impl : ( 'joint' ) ;
    public final void rule__JointType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2758:1: ( ( 'joint' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2759:1: ( 'joint' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2759:1: ( 'joint' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2760:1: 'joint'
            {
             before(grammarAccess.getJointTypeAccess().getJointKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__JointType__Group_0__0__Impl5600); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2773:1: rule__JointType__Group_0__1 : rule__JointType__Group_0__1__Impl rule__JointType__Group_0__2 ;
    public final void rule__JointType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2777:1: ( rule__JointType__Group_0__1__Impl rule__JointType__Group_0__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2778:2: rule__JointType__Group_0__1__Impl rule__JointType__Group_0__2
            {
            pushFollow(FOLLOW_rule__JointType__Group_0__1__Impl_in_rule__JointType__Group_0__15631);
            rule__JointType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointType__Group_0__2_in_rule__JointType__Group_0__15634);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2785:1: rule__JointType__Group_0__1__Impl : ( 'type' ) ;
    public final void rule__JointType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2789:1: ( ( 'type' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2790:1: ( 'type' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2790:1: ( 'type' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2791:1: 'type'
            {
             before(grammarAccess.getJointTypeAccess().getTypeKeyword_0_1()); 
            match(input,42,FOLLOW_42_in_rule__JointType__Group_0__1__Impl5662); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2804:1: rule__JointType__Group_0__2 : rule__JointType__Group_0__2__Impl ;
    public final void rule__JointType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2808:1: ( rule__JointType__Group_0__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2809:2: rule__JointType__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__JointType__Group_0__2__Impl_in_rule__JointType__Group_0__25693);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2815:1: rule__JointType__Group_0__2__Impl : ( ( rule__JointType__NameAssignment_0_2 ) ) ;
    public final void rule__JointType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2819:1: ( ( ( rule__JointType__NameAssignment_0_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2820:1: ( ( rule__JointType__NameAssignment_0_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2820:1: ( ( rule__JointType__NameAssignment_0_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2821:1: ( rule__JointType__NameAssignment_0_2 )
            {
             before(grammarAccess.getJointTypeAccess().getNameAssignment_0_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2822:1: ( rule__JointType__NameAssignment_0_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2822:2: rule__JointType__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__JointType__NameAssignment_0_2_in_rule__JointType__Group_0__2__Impl5720);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2838:1: rule__JointTypeExpression__Group_1__0 : rule__JointTypeExpression__Group_1__0__Impl rule__JointTypeExpression__Group_1__1 ;
    public final void rule__JointTypeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2842:1: ( rule__JointTypeExpression__Group_1__0__Impl rule__JointTypeExpression__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2843:2: rule__JointTypeExpression__Group_1__0__Impl rule__JointTypeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__0__Impl_in_rule__JointTypeExpression__Group_1__05756);
            rule__JointTypeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__1_in_rule__JointTypeExpression__Group_1__05759);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2850:1: rule__JointTypeExpression__Group_1__0__Impl : ( 'revolute' ) ;
    public final void rule__JointTypeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2854:1: ( ( 'revolute' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2855:1: ( 'revolute' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2855:1: ( 'revolute' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2856:1: 'revolute'
            {
             before(grammarAccess.getJointTypeExpressionAccess().getRevoluteKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__JointTypeExpression__Group_1__0__Impl5787); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2869:1: rule__JointTypeExpression__Group_1__1 : rule__JointTypeExpression__Group_1__1__Impl rule__JointTypeExpression__Group_1__2 ;
    public final void rule__JointTypeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2873:1: ( rule__JointTypeExpression__Group_1__1__Impl rule__JointTypeExpression__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2874:2: rule__JointTypeExpression__Group_1__1__Impl rule__JointTypeExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__1__Impl_in_rule__JointTypeExpression__Group_1__15818);
            rule__JointTypeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__2_in_rule__JointTypeExpression__Group_1__15821);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2881:1: rule__JointTypeExpression__Group_1__1__Impl : ( '(' ) ;
    public final void rule__JointTypeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2885:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2886:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2886:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2887:1: '('
            {
             before(grammarAccess.getJointTypeExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,44,FOLLOW_44_in_rule__JointTypeExpression__Group_1__1__Impl5849); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2900:1: rule__JointTypeExpression__Group_1__2 : rule__JointTypeExpression__Group_1__2__Impl rule__JointTypeExpression__Group_1__3 ;
    public final void rule__JointTypeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2904:1: ( rule__JointTypeExpression__Group_1__2__Impl rule__JointTypeExpression__Group_1__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2905:2: rule__JointTypeExpression__Group_1__2__Impl rule__JointTypeExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__2__Impl_in_rule__JointTypeExpression__Group_1__25880);
            rule__JointTypeExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__3_in_rule__JointTypeExpression__Group_1__25883);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2912:1: rule__JointTypeExpression__Group_1__2__Impl : ( ( rule__JointTypeExpression__AxisAssignment_1_2 ) ) ;
    public final void rule__JointTypeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2916:1: ( ( ( rule__JointTypeExpression__AxisAssignment_1_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2917:1: ( ( rule__JointTypeExpression__AxisAssignment_1_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2917:1: ( ( rule__JointTypeExpression__AxisAssignment_1_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2918:1: ( rule__JointTypeExpression__AxisAssignment_1_2 )
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2919:1: ( rule__JointTypeExpression__AxisAssignment_1_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2919:2: rule__JointTypeExpression__AxisAssignment_1_2
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__AxisAssignment_1_2_in_rule__JointTypeExpression__Group_1__2__Impl5910);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2929:1: rule__JointTypeExpression__Group_1__3 : rule__JointTypeExpression__Group_1__3__Impl rule__JointTypeExpression__Group_1__4 ;
    public final void rule__JointTypeExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2933:1: ( rule__JointTypeExpression__Group_1__3__Impl rule__JointTypeExpression__Group_1__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2934:2: rule__JointTypeExpression__Group_1__3__Impl rule__JointTypeExpression__Group_1__4
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__3__Impl_in_rule__JointTypeExpression__Group_1__35940);
            rule__JointTypeExpression__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__4_in_rule__JointTypeExpression__Group_1__35943);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2941:1: rule__JointTypeExpression__Group_1__3__Impl : ( ( rule__JointTypeExpression__Group_1_3__0 )* ) ;
    public final void rule__JointTypeExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2945:1: ( ( ( rule__JointTypeExpression__Group_1_3__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2946:1: ( ( rule__JointTypeExpression__Group_1_3__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2946:1: ( ( rule__JointTypeExpression__Group_1_3__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2947:1: ( rule__JointTypeExpression__Group_1_3__0 )*
            {
             before(grammarAccess.getJointTypeExpressionAccess().getGroup_1_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2948:1: ( rule__JointTypeExpression__Group_1_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2948:2: rule__JointTypeExpression__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__JointTypeExpression__Group_1_3__0_in_rule__JointTypeExpression__Group_1__3__Impl5970);
            	    rule__JointTypeExpression__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2958:1: rule__JointTypeExpression__Group_1__4 : rule__JointTypeExpression__Group_1__4__Impl ;
    public final void rule__JointTypeExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2962:1: ( rule__JointTypeExpression__Group_1__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2963:2: rule__JointTypeExpression__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1__4__Impl_in_rule__JointTypeExpression__Group_1__46001);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2969:1: rule__JointTypeExpression__Group_1__4__Impl : ( ')' ) ;
    public final void rule__JointTypeExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2973:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2974:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2974:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2975:1: ')'
            {
             before(grammarAccess.getJointTypeExpressionAccess().getRightParenthesisKeyword_1_4()); 
            match(input,45,FOLLOW_45_in_rule__JointTypeExpression__Group_1__4__Impl6029); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2998:1: rule__JointTypeExpression__Group_1_3__0 : rule__JointTypeExpression__Group_1_3__0__Impl rule__JointTypeExpression__Group_1_3__1 ;
    public final void rule__JointTypeExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3002:1: ( rule__JointTypeExpression__Group_1_3__0__Impl rule__JointTypeExpression__Group_1_3__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3003:2: rule__JointTypeExpression__Group_1_3__0__Impl rule__JointTypeExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1_3__0__Impl_in_rule__JointTypeExpression__Group_1_3__06070);
            rule__JointTypeExpression__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1_3__1_in_rule__JointTypeExpression__Group_1_3__06073);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3010:1: rule__JointTypeExpression__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__JointTypeExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3014:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3015:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3015:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3016:1: ','
            {
             before(grammarAccess.getJointTypeExpressionAccess().getCommaKeyword_1_3_0()); 
            match(input,46,FOLLOW_46_in_rule__JointTypeExpression__Group_1_3__0__Impl6101); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3029:1: rule__JointTypeExpression__Group_1_3__1 : rule__JointTypeExpression__Group_1_3__1__Impl ;
    public final void rule__JointTypeExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3033:1: ( rule__JointTypeExpression__Group_1_3__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3034:2: rule__JointTypeExpression__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_1_3__1__Impl_in_rule__JointTypeExpression__Group_1_3__16132);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3040:1: rule__JointTypeExpression__Group_1_3__1__Impl : ( ( rule__JointTypeExpression__AxisAssignment_1_3_1 ) ) ;
    public final void rule__JointTypeExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3044:1: ( ( ( rule__JointTypeExpression__AxisAssignment_1_3_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3045:1: ( ( rule__JointTypeExpression__AxisAssignment_1_3_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3045:1: ( ( rule__JointTypeExpression__AxisAssignment_1_3_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3046:1: ( rule__JointTypeExpression__AxisAssignment_1_3_1 )
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_1_3_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3047:1: ( rule__JointTypeExpression__AxisAssignment_1_3_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3047:2: rule__JointTypeExpression__AxisAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__AxisAssignment_1_3_1_in_rule__JointTypeExpression__Group_1_3__1__Impl6159);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3061:1: rule__JointTypeExpression__Group_2__0 : rule__JointTypeExpression__Group_2__0__Impl rule__JointTypeExpression__Group_2__1 ;
    public final void rule__JointTypeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3065:1: ( rule__JointTypeExpression__Group_2__0__Impl rule__JointTypeExpression__Group_2__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3066:2: rule__JointTypeExpression__Group_2__0__Impl rule__JointTypeExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__0__Impl_in_rule__JointTypeExpression__Group_2__06193);
            rule__JointTypeExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__1_in_rule__JointTypeExpression__Group_2__06196);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3073:1: rule__JointTypeExpression__Group_2__0__Impl : ( 'planar' ) ;
    public final void rule__JointTypeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3077:1: ( ( 'planar' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3078:1: ( 'planar' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3078:1: ( 'planar' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3079:1: 'planar'
            {
             before(grammarAccess.getJointTypeExpressionAccess().getPlanarKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__JointTypeExpression__Group_2__0__Impl6224); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3092:1: rule__JointTypeExpression__Group_2__1 : rule__JointTypeExpression__Group_2__1__Impl rule__JointTypeExpression__Group_2__2 ;
    public final void rule__JointTypeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3096:1: ( rule__JointTypeExpression__Group_2__1__Impl rule__JointTypeExpression__Group_2__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3097:2: rule__JointTypeExpression__Group_2__1__Impl rule__JointTypeExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__1__Impl_in_rule__JointTypeExpression__Group_2__16255);
            rule__JointTypeExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__2_in_rule__JointTypeExpression__Group_2__16258);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3104:1: rule__JointTypeExpression__Group_2__1__Impl : ( '(' ) ;
    public final void rule__JointTypeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3108:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3109:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3109:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3110:1: '('
            {
             before(grammarAccess.getJointTypeExpressionAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,44,FOLLOW_44_in_rule__JointTypeExpression__Group_2__1__Impl6286); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3123:1: rule__JointTypeExpression__Group_2__2 : rule__JointTypeExpression__Group_2__2__Impl rule__JointTypeExpression__Group_2__3 ;
    public final void rule__JointTypeExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3127:1: ( rule__JointTypeExpression__Group_2__2__Impl rule__JointTypeExpression__Group_2__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3128:2: rule__JointTypeExpression__Group_2__2__Impl rule__JointTypeExpression__Group_2__3
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__2__Impl_in_rule__JointTypeExpression__Group_2__26317);
            rule__JointTypeExpression__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__3_in_rule__JointTypeExpression__Group_2__26320);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3135:1: rule__JointTypeExpression__Group_2__2__Impl : ( ( rule__JointTypeExpression__AxisAssignment_2_2 ) ) ;
    public final void rule__JointTypeExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3139:1: ( ( ( rule__JointTypeExpression__AxisAssignment_2_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3140:1: ( ( rule__JointTypeExpression__AxisAssignment_2_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3140:1: ( ( rule__JointTypeExpression__AxisAssignment_2_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3141:1: ( rule__JointTypeExpression__AxisAssignment_2_2 )
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_2_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3142:1: ( rule__JointTypeExpression__AxisAssignment_2_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3142:2: rule__JointTypeExpression__AxisAssignment_2_2
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__AxisAssignment_2_2_in_rule__JointTypeExpression__Group_2__2__Impl6347);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3152:1: rule__JointTypeExpression__Group_2__3 : rule__JointTypeExpression__Group_2__3__Impl rule__JointTypeExpression__Group_2__4 ;
    public final void rule__JointTypeExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3156:1: ( rule__JointTypeExpression__Group_2__3__Impl rule__JointTypeExpression__Group_2__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3157:2: rule__JointTypeExpression__Group_2__3__Impl rule__JointTypeExpression__Group_2__4
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__3__Impl_in_rule__JointTypeExpression__Group_2__36377);
            rule__JointTypeExpression__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__4_in_rule__JointTypeExpression__Group_2__36380);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3164:1: rule__JointTypeExpression__Group_2__3__Impl : ( ( rule__JointTypeExpression__Group_2_3__0 )* ) ;
    public final void rule__JointTypeExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3168:1: ( ( ( rule__JointTypeExpression__Group_2_3__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3169:1: ( ( rule__JointTypeExpression__Group_2_3__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3169:1: ( ( rule__JointTypeExpression__Group_2_3__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3170:1: ( rule__JointTypeExpression__Group_2_3__0 )*
            {
             before(grammarAccess.getJointTypeExpressionAccess().getGroup_2_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3171:1: ( rule__JointTypeExpression__Group_2_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==46) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3171:2: rule__JointTypeExpression__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_rule__JointTypeExpression__Group_2_3__0_in_rule__JointTypeExpression__Group_2__3__Impl6407);
            	    rule__JointTypeExpression__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3181:1: rule__JointTypeExpression__Group_2__4 : rule__JointTypeExpression__Group_2__4__Impl ;
    public final void rule__JointTypeExpression__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3185:1: ( rule__JointTypeExpression__Group_2__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3186:2: rule__JointTypeExpression__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2__4__Impl_in_rule__JointTypeExpression__Group_2__46438);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3192:1: rule__JointTypeExpression__Group_2__4__Impl : ( ')' ) ;
    public final void rule__JointTypeExpression__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3196:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3197:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3197:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3198:1: ')'
            {
             before(grammarAccess.getJointTypeExpressionAccess().getRightParenthesisKeyword_2_4()); 
            match(input,45,FOLLOW_45_in_rule__JointTypeExpression__Group_2__4__Impl6466); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3221:1: rule__JointTypeExpression__Group_2_3__0 : rule__JointTypeExpression__Group_2_3__0__Impl rule__JointTypeExpression__Group_2_3__1 ;
    public final void rule__JointTypeExpression__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3225:1: ( rule__JointTypeExpression__Group_2_3__0__Impl rule__JointTypeExpression__Group_2_3__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3226:2: rule__JointTypeExpression__Group_2_3__0__Impl rule__JointTypeExpression__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2_3__0__Impl_in_rule__JointTypeExpression__Group_2_3__06507);
            rule__JointTypeExpression__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2_3__1_in_rule__JointTypeExpression__Group_2_3__06510);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3233:1: rule__JointTypeExpression__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__JointTypeExpression__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3237:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3238:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3238:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3239:1: ','
            {
             before(grammarAccess.getJointTypeExpressionAccess().getCommaKeyword_2_3_0()); 
            match(input,46,FOLLOW_46_in_rule__JointTypeExpression__Group_2_3__0__Impl6538); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3252:1: rule__JointTypeExpression__Group_2_3__1 : rule__JointTypeExpression__Group_2_3__1__Impl ;
    public final void rule__JointTypeExpression__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3256:1: ( rule__JointTypeExpression__Group_2_3__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3257:2: rule__JointTypeExpression__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__Group_2_3__1__Impl_in_rule__JointTypeExpression__Group_2_3__16569);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3263:1: rule__JointTypeExpression__Group_2_3__1__Impl : ( ( rule__JointTypeExpression__AxisAssignment_2_3_1 ) ) ;
    public final void rule__JointTypeExpression__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3267:1: ( ( ( rule__JointTypeExpression__AxisAssignment_2_3_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3268:1: ( ( rule__JointTypeExpression__AxisAssignment_2_3_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3268:1: ( ( rule__JointTypeExpression__AxisAssignment_2_3_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3269:1: ( rule__JointTypeExpression__AxisAssignment_2_3_1 )
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAssignment_2_3_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3270:1: ( rule__JointTypeExpression__AxisAssignment_2_3_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3270:2: rule__JointTypeExpression__AxisAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__JointTypeExpression__AxisAssignment_2_3_1_in_rule__JointTypeExpression__Group_2_3__1__Impl6596);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3284:1: rule__RelativeTransformation__Group__0 : rule__RelativeTransformation__Group__0__Impl rule__RelativeTransformation__Group__1 ;
    public final void rule__RelativeTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3288:1: ( rule__RelativeTransformation__Group__0__Impl rule__RelativeTransformation__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3289:2: rule__RelativeTransformation__Group__0__Impl rule__RelativeTransformation__Group__1
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__0__Impl_in_rule__RelativeTransformation__Group__06630);
            rule__RelativeTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__1_in_rule__RelativeTransformation__Group__06633);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3296:1: rule__RelativeTransformation__Group__0__Impl : ( '(' ) ;
    public final void rule__RelativeTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3300:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3301:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3301:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3302:1: '('
            {
             before(grammarAccess.getRelativeTransformationAccess().getLeftParenthesisKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__RelativeTransformation__Group__0__Impl6661); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3315:1: rule__RelativeTransformation__Group__1 : rule__RelativeTransformation__Group__1__Impl rule__RelativeTransformation__Group__2 ;
    public final void rule__RelativeTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3319:1: ( rule__RelativeTransformation__Group__1__Impl rule__RelativeTransformation__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3320:2: rule__RelativeTransformation__Group__1__Impl rule__RelativeTransformation__Group__2
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__1__Impl_in_rule__RelativeTransformation__Group__16692);
            rule__RelativeTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__2_in_rule__RelativeTransformation__Group__16695);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3327:1: rule__RelativeTransformation__Group__1__Impl : ( 'with' ) ;
    public final void rule__RelativeTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3331:1: ( ( 'with' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3332:1: ( 'with' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3332:1: ( 'with' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3333:1: 'with'
            {
             before(grammarAccess.getRelativeTransformationAccess().getWithKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__RelativeTransformation__Group__1__Impl6723); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3346:1: rule__RelativeTransformation__Group__2 : rule__RelativeTransformation__Group__2__Impl rule__RelativeTransformation__Group__3 ;
    public final void rule__RelativeTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3350:1: ( rule__RelativeTransformation__Group__2__Impl rule__RelativeTransformation__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3351:2: rule__RelativeTransformation__Group__2__Impl rule__RelativeTransformation__Group__3
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__2__Impl_in_rule__RelativeTransformation__Group__26754);
            rule__RelativeTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__3_in_rule__RelativeTransformation__Group__26757);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3358:1: rule__RelativeTransformation__Group__2__Impl : ( 'relative' ) ;
    public final void rule__RelativeTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3362:1: ( ( 'relative' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3363:1: ( 'relative' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3363:1: ( 'relative' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3364:1: 'relative'
            {
             before(grammarAccess.getRelativeTransformationAccess().getRelativeKeyword_2()); 
            match(input,49,FOLLOW_49_in_rule__RelativeTransformation__Group__2__Impl6785); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3377:1: rule__RelativeTransformation__Group__3 : rule__RelativeTransformation__Group__3__Impl rule__RelativeTransformation__Group__4 ;
    public final void rule__RelativeTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3381:1: ( rule__RelativeTransformation__Group__3__Impl rule__RelativeTransformation__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3382:2: rule__RelativeTransformation__Group__3__Impl rule__RelativeTransformation__Group__4
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__3__Impl_in_rule__RelativeTransformation__Group__36816);
            rule__RelativeTransformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__4_in_rule__RelativeTransformation__Group__36819);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3389:1: rule__RelativeTransformation__Group__3__Impl : ( 'transformation' ) ;
    public final void rule__RelativeTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3393:1: ( ( 'transformation' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3394:1: ( 'transformation' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3394:1: ( 'transformation' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3395:1: 'transformation'
            {
             before(grammarAccess.getRelativeTransformationAccess().getTransformationKeyword_3()); 
            match(input,50,FOLLOW_50_in_rule__RelativeTransformation__Group__3__Impl6847); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3408:1: rule__RelativeTransformation__Group__4 : rule__RelativeTransformation__Group__4__Impl rule__RelativeTransformation__Group__5 ;
    public final void rule__RelativeTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3412:1: ( rule__RelativeTransformation__Group__4__Impl rule__RelativeTransformation__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3413:2: rule__RelativeTransformation__Group__4__Impl rule__RelativeTransformation__Group__5
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__4__Impl_in_rule__RelativeTransformation__Group__46878);
            rule__RelativeTransformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__5_in_rule__RelativeTransformation__Group__46881);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3420:1: rule__RelativeTransformation__Group__4__Impl : ( ( rule__RelativeTransformation__PositionAssignment_4 ) ) ;
    public final void rule__RelativeTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3424:1: ( ( ( rule__RelativeTransformation__PositionAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3425:1: ( ( rule__RelativeTransformation__PositionAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3425:1: ( ( rule__RelativeTransformation__PositionAssignment_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3426:1: ( rule__RelativeTransformation__PositionAssignment_4 )
            {
             before(grammarAccess.getRelativeTransformationAccess().getPositionAssignment_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3427:1: ( rule__RelativeTransformation__PositionAssignment_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3427:2: rule__RelativeTransformation__PositionAssignment_4
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__PositionAssignment_4_in_rule__RelativeTransformation__Group__4__Impl6908);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3437:1: rule__RelativeTransformation__Group__5 : rule__RelativeTransformation__Group__5__Impl rule__RelativeTransformation__Group__6 ;
    public final void rule__RelativeTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3441:1: ( rule__RelativeTransformation__Group__5__Impl rule__RelativeTransformation__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3442:2: rule__RelativeTransformation__Group__5__Impl rule__RelativeTransformation__Group__6
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__5__Impl_in_rule__RelativeTransformation__Group__56938);
            rule__RelativeTransformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__6_in_rule__RelativeTransformation__Group__56941);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3449:1: rule__RelativeTransformation__Group__5__Impl : ( ',' ) ;
    public final void rule__RelativeTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3453:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3454:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3454:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3455:1: ','
            {
             before(grammarAccess.getRelativeTransformationAccess().getCommaKeyword_5()); 
            match(input,46,FOLLOW_46_in_rule__RelativeTransformation__Group__5__Impl6969); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3468:1: rule__RelativeTransformation__Group__6 : rule__RelativeTransformation__Group__6__Impl rule__RelativeTransformation__Group__7 ;
    public final void rule__RelativeTransformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3472:1: ( rule__RelativeTransformation__Group__6__Impl rule__RelativeTransformation__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3473:2: rule__RelativeTransformation__Group__6__Impl rule__RelativeTransformation__Group__7
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__6__Impl_in_rule__RelativeTransformation__Group__67000);
            rule__RelativeTransformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__7_in_rule__RelativeTransformation__Group__67003);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3480:1: rule__RelativeTransformation__Group__6__Impl : ( ( rule__RelativeTransformation__ReorientAssignment_6 ) ) ;
    public final void rule__RelativeTransformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3484:1: ( ( ( rule__RelativeTransformation__ReorientAssignment_6 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3485:1: ( ( rule__RelativeTransformation__ReorientAssignment_6 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3485:1: ( ( rule__RelativeTransformation__ReorientAssignment_6 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3486:1: ( rule__RelativeTransformation__ReorientAssignment_6 )
            {
             before(grammarAccess.getRelativeTransformationAccess().getReorientAssignment_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3487:1: ( rule__RelativeTransformation__ReorientAssignment_6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3487:2: rule__RelativeTransformation__ReorientAssignment_6
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__ReorientAssignment_6_in_rule__RelativeTransformation__Group__6__Impl7030);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3497:1: rule__RelativeTransformation__Group__7 : rule__RelativeTransformation__Group__7__Impl ;
    public final void rule__RelativeTransformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3501:1: ( rule__RelativeTransformation__Group__7__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3502:2: rule__RelativeTransformation__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__7__Impl_in_rule__RelativeTransformation__Group__77060);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3508:1: rule__RelativeTransformation__Group__7__Impl : ( ')' ) ;
    public final void rule__RelativeTransformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3512:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3513:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3513:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3514:1: ')'
            {
             before(grammarAccess.getRelativeTransformationAccess().getRightParenthesisKeyword_7()); 
            match(input,45,FOLLOW_45_in_rule__RelativeTransformation__Group__7__Impl7088); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3543:1: rule__Reorientation__Group__0 : rule__Reorientation__Group__0__Impl rule__Reorientation__Group__1 ;
    public final void rule__Reorientation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3547:1: ( rule__Reorientation__Group__0__Impl rule__Reorientation__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3548:2: rule__Reorientation__Group__0__Impl rule__Reorientation__Group__1
            {
            pushFollow(FOLLOW_rule__Reorientation__Group__0__Impl_in_rule__Reorientation__Group__07135);
            rule__Reorientation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reorientation__Group__1_in_rule__Reorientation__Group__07138);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3555:1: rule__Reorientation__Group__0__Impl : ( ( rule__Reorientation__Group_0__0 )? ) ;
    public final void rule__Reorientation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3559:1: ( ( ( rule__Reorientation__Group_0__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3560:1: ( ( rule__Reorientation__Group_0__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3560:1: ( ( rule__Reorientation__Group_0__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3561:1: ( rule__Reorientation__Group_0__0 )?
            {
             before(grammarAccess.getReorientationAccess().getGroup_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3562:1: ( rule__Reorientation__Group_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==51) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3562:2: rule__Reorientation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Reorientation__Group_0__0_in_rule__Reorientation__Group__0__Impl7165);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3572:1: rule__Reorientation__Group__1 : rule__Reorientation__Group__1__Impl ;
    public final void rule__Reorientation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3576:1: ( rule__Reorientation__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3577:2: rule__Reorientation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reorientation__Group__1__Impl_in_rule__Reorientation__Group__17196);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3583:1: rule__Reorientation__Group__1__Impl : ( ( rule__Reorientation__ExpAssignment_1 ) ) ;
    public final void rule__Reorientation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3587:1: ( ( ( rule__Reorientation__ExpAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3588:1: ( ( rule__Reorientation__ExpAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3588:1: ( ( rule__Reorientation__ExpAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3589:1: ( rule__Reorientation__ExpAssignment_1 )
            {
             before(grammarAccess.getReorientationAccess().getExpAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3590:1: ( rule__Reorientation__ExpAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3590:2: rule__Reorientation__ExpAssignment_1
            {
            pushFollow(FOLLOW_rule__Reorientation__ExpAssignment_1_in_rule__Reorientation__Group__1__Impl7223);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3604:1: rule__Reorientation__Group_0__0 : rule__Reorientation__Group_0__0__Impl rule__Reorientation__Group_0__1 ;
    public final void rule__Reorientation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3608:1: ( rule__Reorientation__Group_0__0__Impl rule__Reorientation__Group_0__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3609:2: rule__Reorientation__Group_0__0__Impl rule__Reorientation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Reorientation__Group_0__0__Impl_in_rule__Reorientation__Group_0__07257);
            rule__Reorientation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reorientation__Group_0__1_in_rule__Reorientation__Group_0__07260);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3616:1: rule__Reorientation__Group_0__0__Impl : ( 'reorient' ) ;
    public final void rule__Reorientation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3620:1: ( ( 'reorient' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3621:1: ( 'reorient' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3621:1: ( 'reorient' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3622:1: 'reorient'
            {
             before(grammarAccess.getReorientationAccess().getReorientKeyword_0_0()); 
            match(input,51,FOLLOW_51_in_rule__Reorientation__Group_0__0__Impl7288); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3635:1: rule__Reorientation__Group_0__1 : rule__Reorientation__Group_0__1__Impl ;
    public final void rule__Reorientation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3639:1: ( rule__Reorientation__Group_0__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3640:2: rule__Reorientation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Reorientation__Group_0__1__Impl_in_rule__Reorientation__Group_0__17319);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3646:1: rule__Reorientation__Group_0__1__Impl : ( ( rule__Reorientation__NameAssignment_0_1 ) ) ;
    public final void rule__Reorientation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3650:1: ( ( ( rule__Reorientation__NameAssignment_0_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3651:1: ( ( rule__Reorientation__NameAssignment_0_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3651:1: ( ( rule__Reorientation__NameAssignment_0_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3652:1: ( rule__Reorientation__NameAssignment_0_1 )
            {
             before(grammarAccess.getReorientationAccess().getNameAssignment_0_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3653:1: ( rule__Reorientation__NameAssignment_0_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3653:2: rule__Reorientation__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Reorientation__NameAssignment_0_1_in_rule__Reorientation__Group_0__1__Impl7346);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3667:1: rule__ReorientExpression__Group_1__0 : rule__ReorientExpression__Group_1__0__Impl rule__ReorientExpression__Group_1__1 ;
    public final void rule__ReorientExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3671:1: ( rule__ReorientExpression__Group_1__0__Impl rule__ReorientExpression__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3672:2: rule__ReorientExpression__Group_1__0__Impl rule__ReorientExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__0__Impl_in_rule__ReorientExpression__Group_1__07380);
            rule__ReorientExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__1_in_rule__ReorientExpression__Group_1__07383);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3679:1: rule__ReorientExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ReorientExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3683:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3684:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3684:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3685:1: '('
            {
             before(grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__ReorientExpression__Group_1__0__Impl7411); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3698:1: rule__ReorientExpression__Group_1__1 : rule__ReorientExpression__Group_1__1__Impl rule__ReorientExpression__Group_1__2 ;
    public final void rule__ReorientExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3702:1: ( rule__ReorientExpression__Group_1__1__Impl rule__ReorientExpression__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3703:2: rule__ReorientExpression__Group_1__1__Impl rule__ReorientExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__1__Impl_in_rule__ReorientExpression__Group_1__17442);
            rule__ReorientExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__2_in_rule__ReorientExpression__Group_1__17445);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3710:1: rule__ReorientExpression__Group_1__1__Impl : ( '(' ) ;
    public final void rule__ReorientExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3714:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3715:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3715:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3716:1: '('
            {
             before(grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,44,FOLLOW_44_in_rule__ReorientExpression__Group_1__1__Impl7473); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3729:1: rule__ReorientExpression__Group_1__2 : rule__ReorientExpression__Group_1__2__Impl rule__ReorientExpression__Group_1__3 ;
    public final void rule__ReorientExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3733:1: ( rule__ReorientExpression__Group_1__2__Impl rule__ReorientExpression__Group_1__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3734:2: rule__ReorientExpression__Group_1__2__Impl rule__ReorientExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__2__Impl_in_rule__ReorientExpression__Group_1__27504);
            rule__ReorientExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__3_in_rule__ReorientExpression__Group_1__27507);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3741:1: rule__ReorientExpression__Group_1__2__Impl : ( ( rule__ReorientExpression__AxisAssignment_1_2 ) ) ;
    public final void rule__ReorientExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3745:1: ( ( ( rule__ReorientExpression__AxisAssignment_1_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3746:1: ( ( rule__ReorientExpression__AxisAssignment_1_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3746:1: ( ( rule__ReorientExpression__AxisAssignment_1_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3747:1: ( rule__ReorientExpression__AxisAssignment_1_2 )
            {
             before(grammarAccess.getReorientExpressionAccess().getAxisAssignment_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3748:1: ( rule__ReorientExpression__AxisAssignment_1_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3748:2: rule__ReorientExpression__AxisAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ReorientExpression__AxisAssignment_1_2_in_rule__ReorientExpression__Group_1__2__Impl7534);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3758:1: rule__ReorientExpression__Group_1__3 : rule__ReorientExpression__Group_1__3__Impl rule__ReorientExpression__Group_1__4 ;
    public final void rule__ReorientExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3762:1: ( rule__ReorientExpression__Group_1__3__Impl rule__ReorientExpression__Group_1__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3763:2: rule__ReorientExpression__Group_1__3__Impl rule__ReorientExpression__Group_1__4
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__3__Impl_in_rule__ReorientExpression__Group_1__37564);
            rule__ReorientExpression__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__4_in_rule__ReorientExpression__Group_1__37567);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3770:1: rule__ReorientExpression__Group_1__3__Impl : ( ',' ) ;
    public final void rule__ReorientExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3774:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3775:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3775:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3776:1: ','
            {
             before(grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_3()); 
            match(input,46,FOLLOW_46_in_rule__ReorientExpression__Group_1__3__Impl7595); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3789:1: rule__ReorientExpression__Group_1__4 : rule__ReorientExpression__Group_1__4__Impl rule__ReorientExpression__Group_1__5 ;
    public final void rule__ReorientExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3793:1: ( rule__ReorientExpression__Group_1__4__Impl rule__ReorientExpression__Group_1__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3794:2: rule__ReorientExpression__Group_1__4__Impl rule__ReorientExpression__Group_1__5
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__4__Impl_in_rule__ReorientExpression__Group_1__47626);
            rule__ReorientExpression__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__5_in_rule__ReorientExpression__Group_1__47629);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3801:1: rule__ReorientExpression__Group_1__4__Impl : ( ( rule__ReorientExpression__ValueAssignment_1_4 ) ) ;
    public final void rule__ReorientExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3805:1: ( ( ( rule__ReorientExpression__ValueAssignment_1_4 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3806:1: ( ( rule__ReorientExpression__ValueAssignment_1_4 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3806:1: ( ( rule__ReorientExpression__ValueAssignment_1_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3807:1: ( rule__ReorientExpression__ValueAssignment_1_4 )
            {
             before(grammarAccess.getReorientExpressionAccess().getValueAssignment_1_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3808:1: ( rule__ReorientExpression__ValueAssignment_1_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3808:2: rule__ReorientExpression__ValueAssignment_1_4
            {
            pushFollow(FOLLOW_rule__ReorientExpression__ValueAssignment_1_4_in_rule__ReorientExpression__Group_1__4__Impl7656);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3818:1: rule__ReorientExpression__Group_1__5 : rule__ReorientExpression__Group_1__5__Impl rule__ReorientExpression__Group_1__6 ;
    public final void rule__ReorientExpression__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3822:1: ( rule__ReorientExpression__Group_1__5__Impl rule__ReorientExpression__Group_1__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3823:2: rule__ReorientExpression__Group_1__5__Impl rule__ReorientExpression__Group_1__6
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__5__Impl_in_rule__ReorientExpression__Group_1__57686);
            rule__ReorientExpression__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__6_in_rule__ReorientExpression__Group_1__57689);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3830:1: rule__ReorientExpression__Group_1__5__Impl : ( ')' ) ;
    public final void rule__ReorientExpression__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3834:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3835:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3835:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3836:1: ')'
            {
             before(grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_5()); 
            match(input,45,FOLLOW_45_in_rule__ReorientExpression__Group_1__5__Impl7717); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3849:1: rule__ReorientExpression__Group_1__6 : rule__ReorientExpression__Group_1__6__Impl rule__ReorientExpression__Group_1__7 ;
    public final void rule__ReorientExpression__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3853:1: ( rule__ReorientExpression__Group_1__6__Impl rule__ReorientExpression__Group_1__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3854:2: rule__ReorientExpression__Group_1__6__Impl rule__ReorientExpression__Group_1__7
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__6__Impl_in_rule__ReorientExpression__Group_1__67748);
            rule__ReorientExpression__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__7_in_rule__ReorientExpression__Group_1__67751);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3861:1: rule__ReorientExpression__Group_1__6__Impl : ( ( rule__ReorientExpression__Group_1_6__0 )* ) ;
    public final void rule__ReorientExpression__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3865:1: ( ( ( rule__ReorientExpression__Group_1_6__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3866:1: ( ( rule__ReorientExpression__Group_1_6__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3866:1: ( ( rule__ReorientExpression__Group_1_6__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3867:1: ( rule__ReorientExpression__Group_1_6__0 )*
            {
             before(grammarAccess.getReorientExpressionAccess().getGroup_1_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3868:1: ( rule__ReorientExpression__Group_1_6__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==46) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3868:2: rule__ReorientExpression__Group_1_6__0
            	    {
            	    pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__0_in_rule__ReorientExpression__Group_1__6__Impl7778);
            	    rule__ReorientExpression__Group_1_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3878:1: rule__ReorientExpression__Group_1__7 : rule__ReorientExpression__Group_1__7__Impl ;
    public final void rule__ReorientExpression__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3882:1: ( rule__ReorientExpression__Group_1__7__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3883:2: rule__ReorientExpression__Group_1__7__Impl
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1__7__Impl_in_rule__ReorientExpression__Group_1__77809);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3889:1: rule__ReorientExpression__Group_1__7__Impl : ( ')' ) ;
    public final void rule__ReorientExpression__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3893:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3894:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3894:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3895:1: ')'
            {
             before(grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_7()); 
            match(input,45,FOLLOW_45_in_rule__ReorientExpression__Group_1__7__Impl7837); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3924:1: rule__ReorientExpression__Group_1_6__0 : rule__ReorientExpression__Group_1_6__0__Impl rule__ReorientExpression__Group_1_6__1 ;
    public final void rule__ReorientExpression__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3928:1: ( rule__ReorientExpression__Group_1_6__0__Impl rule__ReorientExpression__Group_1_6__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3929:2: rule__ReorientExpression__Group_1_6__0__Impl rule__ReorientExpression__Group_1_6__1
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__0__Impl_in_rule__ReorientExpression__Group_1_6__07884);
            rule__ReorientExpression__Group_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__1_in_rule__ReorientExpression__Group_1_6__07887);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3936:1: rule__ReorientExpression__Group_1_6__0__Impl : ( ',' ) ;
    public final void rule__ReorientExpression__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3940:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3941:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3941:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3942:1: ','
            {
             before(grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_6_0()); 
            match(input,46,FOLLOW_46_in_rule__ReorientExpression__Group_1_6__0__Impl7915); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3955:1: rule__ReorientExpression__Group_1_6__1 : rule__ReorientExpression__Group_1_6__1__Impl rule__ReorientExpression__Group_1_6__2 ;
    public final void rule__ReorientExpression__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3959:1: ( rule__ReorientExpression__Group_1_6__1__Impl rule__ReorientExpression__Group_1_6__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3960:2: rule__ReorientExpression__Group_1_6__1__Impl rule__ReorientExpression__Group_1_6__2
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__1__Impl_in_rule__ReorientExpression__Group_1_6__17946);
            rule__ReorientExpression__Group_1_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__2_in_rule__ReorientExpression__Group_1_6__17949);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3967:1: rule__ReorientExpression__Group_1_6__1__Impl : ( '(' ) ;
    public final void rule__ReorientExpression__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3971:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3972:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3972:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3973:1: '('
            {
             before(grammarAccess.getReorientExpressionAccess().getLeftParenthesisKeyword_1_6_1()); 
            match(input,44,FOLLOW_44_in_rule__ReorientExpression__Group_1_6__1__Impl7977); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3986:1: rule__ReorientExpression__Group_1_6__2 : rule__ReorientExpression__Group_1_6__2__Impl rule__ReorientExpression__Group_1_6__3 ;
    public final void rule__ReorientExpression__Group_1_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3990:1: ( rule__ReorientExpression__Group_1_6__2__Impl rule__ReorientExpression__Group_1_6__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3991:2: rule__ReorientExpression__Group_1_6__2__Impl rule__ReorientExpression__Group_1_6__3
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__2__Impl_in_rule__ReorientExpression__Group_1_6__28008);
            rule__ReorientExpression__Group_1_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__3_in_rule__ReorientExpression__Group_1_6__28011);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3998:1: rule__ReorientExpression__Group_1_6__2__Impl : ( ( rule__ReorientExpression__AxisAssignment_1_6_2 ) ) ;
    public final void rule__ReorientExpression__Group_1_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4002:1: ( ( ( rule__ReorientExpression__AxisAssignment_1_6_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4003:1: ( ( rule__ReorientExpression__AxisAssignment_1_6_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4003:1: ( ( rule__ReorientExpression__AxisAssignment_1_6_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4004:1: ( rule__ReorientExpression__AxisAssignment_1_6_2 )
            {
             before(grammarAccess.getReorientExpressionAccess().getAxisAssignment_1_6_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4005:1: ( rule__ReorientExpression__AxisAssignment_1_6_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4005:2: rule__ReorientExpression__AxisAssignment_1_6_2
            {
            pushFollow(FOLLOW_rule__ReorientExpression__AxisAssignment_1_6_2_in_rule__ReorientExpression__Group_1_6__2__Impl8038);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4015:1: rule__ReorientExpression__Group_1_6__3 : rule__ReorientExpression__Group_1_6__3__Impl rule__ReorientExpression__Group_1_6__4 ;
    public final void rule__ReorientExpression__Group_1_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4019:1: ( rule__ReorientExpression__Group_1_6__3__Impl rule__ReorientExpression__Group_1_6__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4020:2: rule__ReorientExpression__Group_1_6__3__Impl rule__ReorientExpression__Group_1_6__4
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__3__Impl_in_rule__ReorientExpression__Group_1_6__38068);
            rule__ReorientExpression__Group_1_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__4_in_rule__ReorientExpression__Group_1_6__38071);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4027:1: rule__ReorientExpression__Group_1_6__3__Impl : ( ',' ) ;
    public final void rule__ReorientExpression__Group_1_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4031:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4032:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4032:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4033:1: ','
            {
             before(grammarAccess.getReorientExpressionAccess().getCommaKeyword_1_6_3()); 
            match(input,46,FOLLOW_46_in_rule__ReorientExpression__Group_1_6__3__Impl8099); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4046:1: rule__ReorientExpression__Group_1_6__4 : rule__ReorientExpression__Group_1_6__4__Impl rule__ReorientExpression__Group_1_6__5 ;
    public final void rule__ReorientExpression__Group_1_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4050:1: ( rule__ReorientExpression__Group_1_6__4__Impl rule__ReorientExpression__Group_1_6__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4051:2: rule__ReorientExpression__Group_1_6__4__Impl rule__ReorientExpression__Group_1_6__5
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__4__Impl_in_rule__ReorientExpression__Group_1_6__48130);
            rule__ReorientExpression__Group_1_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__5_in_rule__ReorientExpression__Group_1_6__48133);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4058:1: rule__ReorientExpression__Group_1_6__4__Impl : ( ( rule__ReorientExpression__ValueAssignment_1_6_4 ) ) ;
    public final void rule__ReorientExpression__Group_1_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4062:1: ( ( ( rule__ReorientExpression__ValueAssignment_1_6_4 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4063:1: ( ( rule__ReorientExpression__ValueAssignment_1_6_4 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4063:1: ( ( rule__ReorientExpression__ValueAssignment_1_6_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4064:1: ( rule__ReorientExpression__ValueAssignment_1_6_4 )
            {
             before(grammarAccess.getReorientExpressionAccess().getValueAssignment_1_6_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4065:1: ( rule__ReorientExpression__ValueAssignment_1_6_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4065:2: rule__ReorientExpression__ValueAssignment_1_6_4
            {
            pushFollow(FOLLOW_rule__ReorientExpression__ValueAssignment_1_6_4_in_rule__ReorientExpression__Group_1_6__4__Impl8160);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4075:1: rule__ReorientExpression__Group_1_6__5 : rule__ReorientExpression__Group_1_6__5__Impl ;
    public final void rule__ReorientExpression__Group_1_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4079:1: ( rule__ReorientExpression__Group_1_6__5__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4080:2: rule__ReorientExpression__Group_1_6__5__Impl
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Group_1_6__5__Impl_in_rule__ReorientExpression__Group_1_6__58190);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4086:1: rule__ReorientExpression__Group_1_6__5__Impl : ( ')' ) ;
    public final void rule__ReorientExpression__Group_1_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4090:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4091:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4091:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4092:1: ')'
            {
             before(grammarAccess.getReorientExpressionAccess().getRightParenthesisKeyword_1_6_5()); 
            match(input,45,FOLLOW_45_in_rule__ReorientExpression__Group_1_6__5__Impl8218); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4117:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4121:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4122:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__08261);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__08264);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4129:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4133:1: ( ( 'constraint' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4134:1: ( 'constraint' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4134:1: ( 'constraint' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4135:1: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__Constraint__Group__0__Impl8292); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4148:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4152:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4153:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__18323);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__18326);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4160:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4164:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4165:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4165:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4166:1: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4167:1: ( rule__Constraint__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4167:2: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constraint__NameAssignment_1_in_rule__Constraint__Group__1__Impl8353);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4177:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4181:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4182:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__28383);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__28386);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4189:1: rule__Constraint__Group__2__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4193:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4194:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4194:1: ( ':' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4195:1: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Constraint__Group__2__Impl8414); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4208:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4212:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4213:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__38445);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__38448);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4220:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__TypeAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4224:1: ( ( ( rule__Constraint__TypeAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4225:1: ( ( rule__Constraint__TypeAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4225:1: ( ( rule__Constraint__TypeAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4226:1: ( rule__Constraint__TypeAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getTypeAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4227:1: ( rule__Constraint__TypeAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4227:2: rule__Constraint__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Constraint__TypeAssignment_3_in_rule__Constraint__Group__3__Impl8475);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4237:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4241:1: ( rule__Constraint__Group__4__Impl rule__Constraint__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4242:2: rule__Constraint__Group__4__Impl rule__Constraint__Group__5
            {
            pushFollow(FOLLOW_rule__Constraint__Group__4__Impl_in_rule__Constraint__Group__48505);
            rule__Constraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__48508);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4249:1: rule__Constraint__Group__4__Impl : ( 'between' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4253:1: ( ( 'between' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4254:1: ( 'between' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4254:1: ( 'between' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4255:1: 'between'
            {
             before(grammarAccess.getConstraintAccess().getBetweenKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__Constraint__Group__4__Impl8536); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4268:1: rule__Constraint__Group__5 : rule__Constraint__Group__5__Impl rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4272:1: ( rule__Constraint__Group__5__Impl rule__Constraint__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4273:2: rule__Constraint__Group__5__Impl rule__Constraint__Group__6
            {
            pushFollow(FOLLOW_rule__Constraint__Group__5__Impl_in_rule__Constraint__Group__58567);
            rule__Constraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__58570);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4280:1: rule__Constraint__Group__5__Impl : ( ( rule__Constraint__Body1Assignment_5 ) ) ;
    public final void rule__Constraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4284:1: ( ( ( rule__Constraint__Body1Assignment_5 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4285:1: ( ( rule__Constraint__Body1Assignment_5 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4285:1: ( ( rule__Constraint__Body1Assignment_5 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4286:1: ( rule__Constraint__Body1Assignment_5 )
            {
             before(grammarAccess.getConstraintAccess().getBody1Assignment_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4287:1: ( rule__Constraint__Body1Assignment_5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4287:2: rule__Constraint__Body1Assignment_5
            {
            pushFollow(FOLLOW_rule__Constraint__Body1Assignment_5_in_rule__Constraint__Group__5__Impl8597);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4297:1: rule__Constraint__Group__6 : rule__Constraint__Group__6__Impl rule__Constraint__Group__7 ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4301:1: ( rule__Constraint__Group__6__Impl rule__Constraint__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4302:2: rule__Constraint__Group__6__Impl rule__Constraint__Group__7
            {
            pushFollow(FOLLOW_rule__Constraint__Group__6__Impl_in_rule__Constraint__Group__68627);
            rule__Constraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__68630);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4309:1: rule__Constraint__Group__6__Impl : ( ( rule__Constraint__RelTrans1Assignment_6 ) ) ;
    public final void rule__Constraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4313:1: ( ( ( rule__Constraint__RelTrans1Assignment_6 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4314:1: ( ( rule__Constraint__RelTrans1Assignment_6 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4314:1: ( ( rule__Constraint__RelTrans1Assignment_6 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4315:1: ( rule__Constraint__RelTrans1Assignment_6 )
            {
             before(grammarAccess.getConstraintAccess().getRelTrans1Assignment_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4316:1: ( rule__Constraint__RelTrans1Assignment_6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4316:2: rule__Constraint__RelTrans1Assignment_6
            {
            pushFollow(FOLLOW_rule__Constraint__RelTrans1Assignment_6_in_rule__Constraint__Group__6__Impl8657);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4326:1: rule__Constraint__Group__7 : rule__Constraint__Group__7__Impl rule__Constraint__Group__8 ;
    public final void rule__Constraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4330:1: ( rule__Constraint__Group__7__Impl rule__Constraint__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4331:2: rule__Constraint__Group__7__Impl rule__Constraint__Group__8
            {
            pushFollow(FOLLOW_rule__Constraint__Group__7__Impl_in_rule__Constraint__Group__78687);
            rule__Constraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__8_in_rule__Constraint__Group__78690);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4338:1: rule__Constraint__Group__7__Impl : ( 'and' ) ;
    public final void rule__Constraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4342:1: ( ( 'and' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4343:1: ( 'and' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4343:1: ( 'and' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4344:1: 'and'
            {
             before(grammarAccess.getConstraintAccess().getAndKeyword_7()); 
            match(input,36,FOLLOW_36_in_rule__Constraint__Group__7__Impl8718); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4357:1: rule__Constraint__Group__8 : rule__Constraint__Group__8__Impl rule__Constraint__Group__9 ;
    public final void rule__Constraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4361:1: ( rule__Constraint__Group__8__Impl rule__Constraint__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4362:2: rule__Constraint__Group__8__Impl rule__Constraint__Group__9
            {
            pushFollow(FOLLOW_rule__Constraint__Group__8__Impl_in_rule__Constraint__Group__88749);
            rule__Constraint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__9_in_rule__Constraint__Group__88752);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4369:1: rule__Constraint__Group__8__Impl : ( ( rule__Constraint__Body2Assignment_8 ) ) ;
    public final void rule__Constraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4373:1: ( ( ( rule__Constraint__Body2Assignment_8 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4374:1: ( ( rule__Constraint__Body2Assignment_8 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4374:1: ( ( rule__Constraint__Body2Assignment_8 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4375:1: ( rule__Constraint__Body2Assignment_8 )
            {
             before(grammarAccess.getConstraintAccess().getBody2Assignment_8()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4376:1: ( rule__Constraint__Body2Assignment_8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4376:2: rule__Constraint__Body2Assignment_8
            {
            pushFollow(FOLLOW_rule__Constraint__Body2Assignment_8_in_rule__Constraint__Group__8__Impl8779);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4386:1: rule__Constraint__Group__9 : rule__Constraint__Group__9__Impl ;
    public final void rule__Constraint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4390:1: ( rule__Constraint__Group__9__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4391:2: rule__Constraint__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__9__Impl_in_rule__Constraint__Group__98809);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4397:1: rule__Constraint__Group__9__Impl : ( ( rule__Constraint__RelTrans2Assignment_9 ) ) ;
    public final void rule__Constraint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4401:1: ( ( ( rule__Constraint__RelTrans2Assignment_9 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4402:1: ( ( rule__Constraint__RelTrans2Assignment_9 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4402:1: ( ( rule__Constraint__RelTrans2Assignment_9 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4403:1: ( rule__Constraint__RelTrans2Assignment_9 )
            {
             before(grammarAccess.getConstraintAccess().getRelTrans2Assignment_9()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4404:1: ( rule__Constraint__RelTrans2Assignment_9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4404:2: rule__Constraint__RelTrans2Assignment_9
            {
            pushFollow(FOLLOW_rule__Constraint__RelTrans2Assignment_9_in_rule__Constraint__Group__9__Impl8836);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4434:1: rule__ExternalLoad__Group__0 : rule__ExternalLoad__Group__0__Impl rule__ExternalLoad__Group__1 ;
    public final void rule__ExternalLoad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4438:1: ( rule__ExternalLoad__Group__0__Impl rule__ExternalLoad__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4439:2: rule__ExternalLoad__Group__0__Impl rule__ExternalLoad__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__0__Impl_in_rule__ExternalLoad__Group__08886);
            rule__ExternalLoad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__1_in_rule__ExternalLoad__Group__08889);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4446:1: rule__ExternalLoad__Group__0__Impl : ( 'external' ) ;
    public final void rule__ExternalLoad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4450:1: ( ( 'external' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4451:1: ( 'external' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4451:1: ( 'external' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4452:1: 'external'
            {
             before(grammarAccess.getExternalLoadAccess().getExternalKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__ExternalLoad__Group__0__Impl8917); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4465:1: rule__ExternalLoad__Group__1 : rule__ExternalLoad__Group__1__Impl rule__ExternalLoad__Group__2 ;
    public final void rule__ExternalLoad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4469:1: ( rule__ExternalLoad__Group__1__Impl rule__ExternalLoad__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4470:2: rule__ExternalLoad__Group__1__Impl rule__ExternalLoad__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__1__Impl_in_rule__ExternalLoad__Group__18948);
            rule__ExternalLoad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__2_in_rule__ExternalLoad__Group__18951);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4477:1: rule__ExternalLoad__Group__1__Impl : ( 'load' ) ;
    public final void rule__ExternalLoad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4481:1: ( ( 'load' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4482:1: ( 'load' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4482:1: ( 'load' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4483:1: 'load'
            {
             before(grammarAccess.getExternalLoadAccess().getLoadKeyword_1()); 
            match(input,54,FOLLOW_54_in_rule__ExternalLoad__Group__1__Impl8979); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4496:1: rule__ExternalLoad__Group__2 : rule__ExternalLoad__Group__2__Impl rule__ExternalLoad__Group__3 ;
    public final void rule__ExternalLoad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4500:1: ( rule__ExternalLoad__Group__2__Impl rule__ExternalLoad__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4501:2: rule__ExternalLoad__Group__2__Impl rule__ExternalLoad__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__2__Impl_in_rule__ExternalLoad__Group__29010);
            rule__ExternalLoad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__3_in_rule__ExternalLoad__Group__29013);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4508:1: rule__ExternalLoad__Group__2__Impl : ( ( rule__ExternalLoad__NameAssignment_2 ) ) ;
    public final void rule__ExternalLoad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4512:1: ( ( ( rule__ExternalLoad__NameAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4513:1: ( ( rule__ExternalLoad__NameAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4513:1: ( ( rule__ExternalLoad__NameAssignment_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4514:1: ( rule__ExternalLoad__NameAssignment_2 )
            {
             before(grammarAccess.getExternalLoadAccess().getNameAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4515:1: ( rule__ExternalLoad__NameAssignment_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4515:2: rule__ExternalLoad__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ExternalLoad__NameAssignment_2_in_rule__ExternalLoad__Group__2__Impl9040);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4525:1: rule__ExternalLoad__Group__3 : rule__ExternalLoad__Group__3__Impl rule__ExternalLoad__Group__4 ;
    public final void rule__ExternalLoad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4529:1: ( rule__ExternalLoad__Group__3__Impl rule__ExternalLoad__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4530:2: rule__ExternalLoad__Group__3__Impl rule__ExternalLoad__Group__4
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__3__Impl_in_rule__ExternalLoad__Group__39070);
            rule__ExternalLoad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__4_in_rule__ExternalLoad__Group__39073);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4537:1: rule__ExternalLoad__Group__3__Impl : ( ':' ) ;
    public final void rule__ExternalLoad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4541:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4542:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4542:1: ( ':' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4543:1: ':'
            {
             before(grammarAccess.getExternalLoadAccess().getColonKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__ExternalLoad__Group__3__Impl9101); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4556:1: rule__ExternalLoad__Group__4 : rule__ExternalLoad__Group__4__Impl rule__ExternalLoad__Group__5 ;
    public final void rule__ExternalLoad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4560:1: ( rule__ExternalLoad__Group__4__Impl rule__ExternalLoad__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4561:2: rule__ExternalLoad__Group__4__Impl rule__ExternalLoad__Group__5
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__4__Impl_in_rule__ExternalLoad__Group__49132);
            rule__ExternalLoad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__5_in_rule__ExternalLoad__Group__49135);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4568:1: rule__ExternalLoad__Group__4__Impl : ( ( rule__ExternalLoad__TypeAssignment_4 ) ) ;
    public final void rule__ExternalLoad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4572:1: ( ( ( rule__ExternalLoad__TypeAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4573:1: ( ( rule__ExternalLoad__TypeAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4573:1: ( ( rule__ExternalLoad__TypeAssignment_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4574:1: ( rule__ExternalLoad__TypeAssignment_4 )
            {
             before(grammarAccess.getExternalLoadAccess().getTypeAssignment_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4575:1: ( rule__ExternalLoad__TypeAssignment_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4575:2: rule__ExternalLoad__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__ExternalLoad__TypeAssignment_4_in_rule__ExternalLoad__Group__4__Impl9162);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4585:1: rule__ExternalLoad__Group__5 : rule__ExternalLoad__Group__5__Impl rule__ExternalLoad__Group__6 ;
    public final void rule__ExternalLoad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4589:1: ( rule__ExternalLoad__Group__5__Impl rule__ExternalLoad__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4590:2: rule__ExternalLoad__Group__5__Impl rule__ExternalLoad__Group__6
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__5__Impl_in_rule__ExternalLoad__Group__59192);
            rule__ExternalLoad__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__6_in_rule__ExternalLoad__Group__59195);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4597:1: rule__ExternalLoad__Group__5__Impl : ( 'between' ) ;
    public final void rule__ExternalLoad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4601:1: ( ( 'between' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4602:1: ( 'between' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4602:1: ( 'between' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4603:1: 'between'
            {
             before(grammarAccess.getExternalLoadAccess().getBetweenKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__ExternalLoad__Group__5__Impl9223); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4616:1: rule__ExternalLoad__Group__6 : rule__ExternalLoad__Group__6__Impl rule__ExternalLoad__Group__7 ;
    public final void rule__ExternalLoad__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4620:1: ( rule__ExternalLoad__Group__6__Impl rule__ExternalLoad__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4621:2: rule__ExternalLoad__Group__6__Impl rule__ExternalLoad__Group__7
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__6__Impl_in_rule__ExternalLoad__Group__69254);
            rule__ExternalLoad__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__7_in_rule__ExternalLoad__Group__69257);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4628:1: rule__ExternalLoad__Group__6__Impl : ( ( rule__ExternalLoad__Body1Assignment_6 ) ) ;
    public final void rule__ExternalLoad__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4632:1: ( ( ( rule__ExternalLoad__Body1Assignment_6 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4633:1: ( ( rule__ExternalLoad__Body1Assignment_6 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4633:1: ( ( rule__ExternalLoad__Body1Assignment_6 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4634:1: ( rule__ExternalLoad__Body1Assignment_6 )
            {
             before(grammarAccess.getExternalLoadAccess().getBody1Assignment_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4635:1: ( rule__ExternalLoad__Body1Assignment_6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4635:2: rule__ExternalLoad__Body1Assignment_6
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Body1Assignment_6_in_rule__ExternalLoad__Group__6__Impl9284);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4645:1: rule__ExternalLoad__Group__7 : rule__ExternalLoad__Group__7__Impl rule__ExternalLoad__Group__8 ;
    public final void rule__ExternalLoad__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4649:1: ( rule__ExternalLoad__Group__7__Impl rule__ExternalLoad__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4650:2: rule__ExternalLoad__Group__7__Impl rule__ExternalLoad__Group__8
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__7__Impl_in_rule__ExternalLoad__Group__79314);
            rule__ExternalLoad__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__8_in_rule__ExternalLoad__Group__79317);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4657:1: rule__ExternalLoad__Group__7__Impl : ( ( rule__ExternalLoad__RelTrans1Assignment_7 ) ) ;
    public final void rule__ExternalLoad__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4661:1: ( ( ( rule__ExternalLoad__RelTrans1Assignment_7 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4662:1: ( ( rule__ExternalLoad__RelTrans1Assignment_7 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4662:1: ( ( rule__ExternalLoad__RelTrans1Assignment_7 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4663:1: ( rule__ExternalLoad__RelTrans1Assignment_7 )
            {
             before(grammarAccess.getExternalLoadAccess().getRelTrans1Assignment_7()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4664:1: ( rule__ExternalLoad__RelTrans1Assignment_7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4664:2: rule__ExternalLoad__RelTrans1Assignment_7
            {
            pushFollow(FOLLOW_rule__ExternalLoad__RelTrans1Assignment_7_in_rule__ExternalLoad__Group__7__Impl9344);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4674:1: rule__ExternalLoad__Group__8 : rule__ExternalLoad__Group__8__Impl rule__ExternalLoad__Group__9 ;
    public final void rule__ExternalLoad__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4678:1: ( rule__ExternalLoad__Group__8__Impl rule__ExternalLoad__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4679:2: rule__ExternalLoad__Group__8__Impl rule__ExternalLoad__Group__9
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__8__Impl_in_rule__ExternalLoad__Group__89374);
            rule__ExternalLoad__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__9_in_rule__ExternalLoad__Group__89377);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4686:1: rule__ExternalLoad__Group__8__Impl : ( 'and' ) ;
    public final void rule__ExternalLoad__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4690:1: ( ( 'and' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4691:1: ( 'and' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4691:1: ( 'and' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4692:1: 'and'
            {
             before(grammarAccess.getExternalLoadAccess().getAndKeyword_8()); 
            match(input,36,FOLLOW_36_in_rule__ExternalLoad__Group__8__Impl9405); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4705:1: rule__ExternalLoad__Group__9 : rule__ExternalLoad__Group__9__Impl rule__ExternalLoad__Group__10 ;
    public final void rule__ExternalLoad__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4709:1: ( rule__ExternalLoad__Group__9__Impl rule__ExternalLoad__Group__10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4710:2: rule__ExternalLoad__Group__9__Impl rule__ExternalLoad__Group__10
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__9__Impl_in_rule__ExternalLoad__Group__99436);
            rule__ExternalLoad__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__10_in_rule__ExternalLoad__Group__99439);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4717:1: rule__ExternalLoad__Group__9__Impl : ( ( rule__ExternalLoad__Body2Assignment_9 ) ) ;
    public final void rule__ExternalLoad__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4721:1: ( ( ( rule__ExternalLoad__Body2Assignment_9 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4722:1: ( ( rule__ExternalLoad__Body2Assignment_9 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4722:1: ( ( rule__ExternalLoad__Body2Assignment_9 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4723:1: ( rule__ExternalLoad__Body2Assignment_9 )
            {
             before(grammarAccess.getExternalLoadAccess().getBody2Assignment_9()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4724:1: ( rule__ExternalLoad__Body2Assignment_9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4724:2: rule__ExternalLoad__Body2Assignment_9
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Body2Assignment_9_in_rule__ExternalLoad__Group__9__Impl9466);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4734:1: rule__ExternalLoad__Group__10 : rule__ExternalLoad__Group__10__Impl ;
    public final void rule__ExternalLoad__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4738:1: ( rule__ExternalLoad__Group__10__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4739:2: rule__ExternalLoad__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__10__Impl_in_rule__ExternalLoad__Group__109496);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4745:1: rule__ExternalLoad__Group__10__Impl : ( ( rule__ExternalLoad__RelTrans2Assignment_10 ) ) ;
    public final void rule__ExternalLoad__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4749:1: ( ( ( rule__ExternalLoad__RelTrans2Assignment_10 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4750:1: ( ( rule__ExternalLoad__RelTrans2Assignment_10 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4750:1: ( ( rule__ExternalLoad__RelTrans2Assignment_10 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4751:1: ( rule__ExternalLoad__RelTrans2Assignment_10 )
            {
             before(grammarAccess.getExternalLoadAccess().getRelTrans2Assignment_10()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4752:1: ( rule__ExternalLoad__RelTrans2Assignment_10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4752:2: rule__ExternalLoad__RelTrans2Assignment_10
            {
            pushFollow(FOLLOW_rule__ExternalLoad__RelTrans2Assignment_10_in_rule__ExternalLoad__Group__10__Impl9523);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4784:1: rule__BaseMatrix__Group__0 : rule__BaseMatrix__Group__0__Impl rule__BaseMatrix__Group__1 ;
    public final void rule__BaseMatrix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4788:1: ( rule__BaseMatrix__Group__0__Impl rule__BaseMatrix__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4789:2: rule__BaseMatrix__Group__0__Impl rule__BaseMatrix__Group__1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__0__Impl_in_rule__BaseMatrix__Group__09575);
            rule__BaseMatrix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group__1_in_rule__BaseMatrix__Group__09578);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4796:1: rule__BaseMatrix__Group__0__Impl : ( ( rule__BaseMatrix__Group_0__0 )? ) ;
    public final void rule__BaseMatrix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4800:1: ( ( ( rule__BaseMatrix__Group_0__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4801:1: ( ( rule__BaseMatrix__Group_0__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4801:1: ( ( rule__BaseMatrix__Group_0__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4802:1: ( rule__BaseMatrix__Group_0__0 )?
            {
             before(grammarAccess.getBaseMatrixAccess().getGroup_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4803:1: ( rule__BaseMatrix__Group_0__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==57) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4803:2: rule__BaseMatrix__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BaseMatrix__Group_0__0_in_rule__BaseMatrix__Group__0__Impl9605);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4813:1: rule__BaseMatrix__Group__1 : rule__BaseMatrix__Group__1__Impl rule__BaseMatrix__Group__2 ;
    public final void rule__BaseMatrix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4817:1: ( rule__BaseMatrix__Group__1__Impl rule__BaseMatrix__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4818:2: rule__BaseMatrix__Group__1__Impl rule__BaseMatrix__Group__2
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__1__Impl_in_rule__BaseMatrix__Group__19636);
            rule__BaseMatrix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group__2_in_rule__BaseMatrix__Group__19639);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4825:1: rule__BaseMatrix__Group__1__Impl : ( '[' ) ;
    public final void rule__BaseMatrix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4829:1: ( ( '[' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4830:1: ( '[' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4830:1: ( '[' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4831:1: '['
            {
             before(grammarAccess.getBaseMatrixAccess().getLeftSquareBracketKeyword_1()); 
            match(input,55,FOLLOW_55_in_rule__BaseMatrix__Group__1__Impl9667); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4844:1: rule__BaseMatrix__Group__2 : rule__BaseMatrix__Group__2__Impl rule__BaseMatrix__Group__3 ;
    public final void rule__BaseMatrix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4848:1: ( rule__BaseMatrix__Group__2__Impl rule__BaseMatrix__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4849:2: rule__BaseMatrix__Group__2__Impl rule__BaseMatrix__Group__3
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__2__Impl_in_rule__BaseMatrix__Group__29698);
            rule__BaseMatrix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group__3_in_rule__BaseMatrix__Group__29701);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4856:1: rule__BaseMatrix__Group__2__Impl : ( ( rule__BaseMatrix__ValuesAssignment_2 ) ) ;
    public final void rule__BaseMatrix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4860:1: ( ( ( rule__BaseMatrix__ValuesAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4861:1: ( ( rule__BaseMatrix__ValuesAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4861:1: ( ( rule__BaseMatrix__ValuesAssignment_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4862:1: ( rule__BaseMatrix__ValuesAssignment_2 )
            {
             before(grammarAccess.getBaseMatrixAccess().getValuesAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4863:1: ( rule__BaseMatrix__ValuesAssignment_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4863:2: rule__BaseMatrix__ValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__BaseMatrix__ValuesAssignment_2_in_rule__BaseMatrix__Group__2__Impl9728);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4873:1: rule__BaseMatrix__Group__3 : rule__BaseMatrix__Group__3__Impl rule__BaseMatrix__Group__4 ;
    public final void rule__BaseMatrix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4877:1: ( rule__BaseMatrix__Group__3__Impl rule__BaseMatrix__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4878:2: rule__BaseMatrix__Group__3__Impl rule__BaseMatrix__Group__4
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__3__Impl_in_rule__BaseMatrix__Group__39758);
            rule__BaseMatrix__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group__4_in_rule__BaseMatrix__Group__39761);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4885:1: rule__BaseMatrix__Group__3__Impl : ( ( rule__BaseMatrix__Group_3__0 )* ) ;
    public final void rule__BaseMatrix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4889:1: ( ( ( rule__BaseMatrix__Group_3__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4890:1: ( ( rule__BaseMatrix__Group_3__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4890:1: ( ( rule__BaseMatrix__Group_3__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4891:1: ( rule__BaseMatrix__Group_3__0 )*
            {
             before(grammarAccess.getBaseMatrixAccess().getGroup_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4892:1: ( rule__BaseMatrix__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==46) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4892:2: rule__BaseMatrix__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__BaseMatrix__Group_3__0_in_rule__BaseMatrix__Group__3__Impl9788);
            	    rule__BaseMatrix__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4902:1: rule__BaseMatrix__Group__4 : rule__BaseMatrix__Group__4__Impl ;
    public final void rule__BaseMatrix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4906:1: ( rule__BaseMatrix__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4907:2: rule__BaseMatrix__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__4__Impl_in_rule__BaseMatrix__Group__49819);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4913:1: rule__BaseMatrix__Group__4__Impl : ( ']' ) ;
    public final void rule__BaseMatrix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4917:1: ( ( ']' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4918:1: ( ']' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4918:1: ( ']' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4919:1: ']'
            {
             before(grammarAccess.getBaseMatrixAccess().getRightSquareBracketKeyword_4()); 
            match(input,56,FOLLOW_56_in_rule__BaseMatrix__Group__4__Impl9847); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4942:1: rule__BaseMatrix__Group_0__0 : rule__BaseMatrix__Group_0__0__Impl rule__BaseMatrix__Group_0__1 ;
    public final void rule__BaseMatrix__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4946:1: ( rule__BaseMatrix__Group_0__0__Impl rule__BaseMatrix__Group_0__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4947:2: rule__BaseMatrix__Group_0__0__Impl rule__BaseMatrix__Group_0__1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group_0__0__Impl_in_rule__BaseMatrix__Group_0__09888);
            rule__BaseMatrix__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group_0__1_in_rule__BaseMatrix__Group_0__09891);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4954:1: rule__BaseMatrix__Group_0__0__Impl : ( 'matrix' ) ;
    public final void rule__BaseMatrix__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4958:1: ( ( 'matrix' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4959:1: ( 'matrix' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4959:1: ( 'matrix' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4960:1: 'matrix'
            {
             before(grammarAccess.getBaseMatrixAccess().getMatrixKeyword_0_0()); 
            match(input,57,FOLLOW_57_in_rule__BaseMatrix__Group_0__0__Impl9919); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4973:1: rule__BaseMatrix__Group_0__1 : rule__BaseMatrix__Group_0__1__Impl ;
    public final void rule__BaseMatrix__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4977:1: ( rule__BaseMatrix__Group_0__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4978:2: rule__BaseMatrix__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group_0__1__Impl_in_rule__BaseMatrix__Group_0__19950);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4984:1: rule__BaseMatrix__Group_0__1__Impl : ( ( rule__BaseMatrix__NameAssignment_0_1 ) ) ;
    public final void rule__BaseMatrix__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4988:1: ( ( ( rule__BaseMatrix__NameAssignment_0_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4989:1: ( ( rule__BaseMatrix__NameAssignment_0_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4989:1: ( ( rule__BaseMatrix__NameAssignment_0_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4990:1: ( rule__BaseMatrix__NameAssignment_0_1 )
            {
             before(grammarAccess.getBaseMatrixAccess().getNameAssignment_0_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4991:1: ( rule__BaseMatrix__NameAssignment_0_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4991:2: rule__BaseMatrix__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__NameAssignment_0_1_in_rule__BaseMatrix__Group_0__1__Impl9977);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5005:1: rule__BaseMatrix__Group_3__0 : rule__BaseMatrix__Group_3__0__Impl rule__BaseMatrix__Group_3__1 ;
    public final void rule__BaseMatrix__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5009:1: ( rule__BaseMatrix__Group_3__0__Impl rule__BaseMatrix__Group_3__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5010:2: rule__BaseMatrix__Group_3__0__Impl rule__BaseMatrix__Group_3__1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group_3__0__Impl_in_rule__BaseMatrix__Group_3__010011);
            rule__BaseMatrix__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group_3__1_in_rule__BaseMatrix__Group_3__010014);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5017:1: rule__BaseMatrix__Group_3__0__Impl : ( ',' ) ;
    public final void rule__BaseMatrix__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5021:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5022:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5022:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5023:1: ','
            {
             before(grammarAccess.getBaseMatrixAccess().getCommaKeyword_3_0()); 
            match(input,46,FOLLOW_46_in_rule__BaseMatrix__Group_3__0__Impl10042); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5036:1: rule__BaseMatrix__Group_3__1 : rule__BaseMatrix__Group_3__1__Impl ;
    public final void rule__BaseMatrix__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5040:1: ( rule__BaseMatrix__Group_3__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5041:2: rule__BaseMatrix__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group_3__1__Impl_in_rule__BaseMatrix__Group_3__110073);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5047:1: rule__BaseMatrix__Group_3__1__Impl : ( ( rule__BaseMatrix__ValuesAssignment_3_1 ) ) ;
    public final void rule__BaseMatrix__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5051:1: ( ( ( rule__BaseMatrix__ValuesAssignment_3_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5052:1: ( ( rule__BaseMatrix__ValuesAssignment_3_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5052:1: ( ( rule__BaseMatrix__ValuesAssignment_3_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5053:1: ( rule__BaseMatrix__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getBaseMatrixAccess().getValuesAssignment_3_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5054:1: ( rule__BaseMatrix__ValuesAssignment_3_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5054:2: rule__BaseMatrix__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__ValuesAssignment_3_1_in_rule__BaseMatrix__Group_3__1__Impl10100);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5068:1: rule__AddExp__Group__0 : rule__AddExp__Group__0__Impl rule__AddExp__Group__1 ;
    public final void rule__AddExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5072:1: ( rule__AddExp__Group__0__Impl rule__AddExp__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5073:2: rule__AddExp__Group__0__Impl rule__AddExp__Group__1
            {
            pushFollow(FOLLOW_rule__AddExp__Group__0__Impl_in_rule__AddExp__Group__010134);
            rule__AddExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddExp__Group__1_in_rule__AddExp__Group__010137);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5080:1: rule__AddExp__Group__0__Impl : ( ruleMultExp ) ;
    public final void rule__AddExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5084:1: ( ( ruleMultExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5085:1: ( ruleMultExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5085:1: ( ruleMultExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5086:1: ruleMultExp
            {
             before(grammarAccess.getAddExpAccess().getMultExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultExp_in_rule__AddExp__Group__0__Impl10164);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5097:1: rule__AddExp__Group__1 : rule__AddExp__Group__1__Impl ;
    public final void rule__AddExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5101:1: ( rule__AddExp__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5102:2: rule__AddExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AddExp__Group__1__Impl_in_rule__AddExp__Group__110193);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5108:1: rule__AddExp__Group__1__Impl : ( ( rule__AddExp__Group_1__0 )* ) ;
    public final void rule__AddExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5112:1: ( ( ( rule__AddExp__Group_1__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5113:1: ( ( rule__AddExp__Group_1__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5113:1: ( ( rule__AddExp__Group_1__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5114:1: ( rule__AddExp__Group_1__0 )*
            {
             before(grammarAccess.getAddExpAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5115:1: ( rule__AddExp__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=12 && LA24_0<=13)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5115:2: rule__AddExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AddExp__Group_1__0_in_rule__AddExp__Group__1__Impl10220);
            	    rule__AddExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5129:1: rule__AddExp__Group_1__0 : rule__AddExp__Group_1__0__Impl rule__AddExp__Group_1__1 ;
    public final void rule__AddExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5133:1: ( rule__AddExp__Group_1__0__Impl rule__AddExp__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5134:2: rule__AddExp__Group_1__0__Impl rule__AddExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AddExp__Group_1__0__Impl_in_rule__AddExp__Group_1__010255);
            rule__AddExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddExp__Group_1__1_in_rule__AddExp__Group_1__010258);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5141:1: rule__AddExp__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5145:1: ( ( () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5146:1: ( () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5146:1: ( () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5147:1: ()
            {
             before(grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5148:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5150:1: 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5160:1: rule__AddExp__Group_1__1 : rule__AddExp__Group_1__1__Impl rule__AddExp__Group_1__2 ;
    public final void rule__AddExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5164:1: ( rule__AddExp__Group_1__1__Impl rule__AddExp__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5165:2: rule__AddExp__Group_1__1__Impl rule__AddExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__AddExp__Group_1__1__Impl_in_rule__AddExp__Group_1__110316);
            rule__AddExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddExp__Group_1__2_in_rule__AddExp__Group_1__110319);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5172:1: rule__AddExp__Group_1__1__Impl : ( ( rule__AddExp__OpAssignment_1_1 ) ) ;
    public final void rule__AddExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5176:1: ( ( ( rule__AddExp__OpAssignment_1_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5177:1: ( ( rule__AddExp__OpAssignment_1_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5177:1: ( ( rule__AddExp__OpAssignment_1_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5178:1: ( rule__AddExp__OpAssignment_1_1 )
            {
             before(grammarAccess.getAddExpAccess().getOpAssignment_1_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5179:1: ( rule__AddExp__OpAssignment_1_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5179:2: rule__AddExp__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AddExp__OpAssignment_1_1_in_rule__AddExp__Group_1__1__Impl10346);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5189:1: rule__AddExp__Group_1__2 : rule__AddExp__Group_1__2__Impl ;
    public final void rule__AddExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5193:1: ( rule__AddExp__Group_1__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5194:2: rule__AddExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AddExp__Group_1__2__Impl_in_rule__AddExp__Group_1__210376);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5200:1: rule__AddExp__Group_1__2__Impl : ( ( rule__AddExp__RightAssignment_1_2 ) ) ;
    public final void rule__AddExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5204:1: ( ( ( rule__AddExp__RightAssignment_1_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5205:1: ( ( rule__AddExp__RightAssignment_1_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5205:1: ( ( rule__AddExp__RightAssignment_1_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5206:1: ( rule__AddExp__RightAssignment_1_2 )
            {
             before(grammarAccess.getAddExpAccess().getRightAssignment_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5207:1: ( rule__AddExp__RightAssignment_1_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5207:2: rule__AddExp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AddExp__RightAssignment_1_2_in_rule__AddExp__Group_1__2__Impl10403);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5223:1: rule__MultExp__Group__0 : rule__MultExp__Group__0__Impl rule__MultExp__Group__1 ;
    public final void rule__MultExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5227:1: ( rule__MultExp__Group__0__Impl rule__MultExp__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5228:2: rule__MultExp__Group__0__Impl rule__MultExp__Group__1
            {
            pushFollow(FOLLOW_rule__MultExp__Group__0__Impl_in_rule__MultExp__Group__010439);
            rule__MultExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultExp__Group__1_in_rule__MultExp__Group__010442);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5235:1: rule__MultExp__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MultExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5239:1: ( ( rulePrimary ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5240:1: ( rulePrimary )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5240:1: ( rulePrimary )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5241:1: rulePrimary
            {
             before(grammarAccess.getMultExpAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MultExp__Group__0__Impl10469);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5252:1: rule__MultExp__Group__1 : rule__MultExp__Group__1__Impl ;
    public final void rule__MultExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5256:1: ( rule__MultExp__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5257:2: rule__MultExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultExp__Group__1__Impl_in_rule__MultExp__Group__110498);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5263:1: rule__MultExp__Group__1__Impl : ( ( rule__MultExp__Group_1__0 )* ) ;
    public final void rule__MultExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5267:1: ( ( ( rule__MultExp__Group_1__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5268:1: ( ( rule__MultExp__Group_1__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5268:1: ( ( rule__MultExp__Group_1__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5269:1: ( rule__MultExp__Group_1__0 )*
            {
             before(grammarAccess.getMultExpAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5270:1: ( rule__MultExp__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=14 && LA25_0<=15)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5270:2: rule__MultExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultExp__Group_1__0_in_rule__MultExp__Group__1__Impl10525);
            	    rule__MultExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5284:1: rule__MultExp__Group_1__0 : rule__MultExp__Group_1__0__Impl rule__MultExp__Group_1__1 ;
    public final void rule__MultExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5288:1: ( rule__MultExp__Group_1__0__Impl rule__MultExp__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5289:2: rule__MultExp__Group_1__0__Impl rule__MultExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultExp__Group_1__0__Impl_in_rule__MultExp__Group_1__010560);
            rule__MultExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultExp__Group_1__1_in_rule__MultExp__Group_1__010563);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5296:1: rule__MultExp__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5300:1: ( ( () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5301:1: ( () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5301:1: ( () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5302:1: ()
            {
             before(grammarAccess.getMultExpAccess().getMultExpLeftAction_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5303:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5305:1: 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5315:1: rule__MultExp__Group_1__1 : rule__MultExp__Group_1__1__Impl rule__MultExp__Group_1__2 ;
    public final void rule__MultExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5319:1: ( rule__MultExp__Group_1__1__Impl rule__MultExp__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5320:2: rule__MultExp__Group_1__1__Impl rule__MultExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultExp__Group_1__1__Impl_in_rule__MultExp__Group_1__110621);
            rule__MultExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultExp__Group_1__2_in_rule__MultExp__Group_1__110624);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5327:1: rule__MultExp__Group_1__1__Impl : ( ( rule__MultExp__OpAssignment_1_1 ) ) ;
    public final void rule__MultExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5331:1: ( ( ( rule__MultExp__OpAssignment_1_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5332:1: ( ( rule__MultExp__OpAssignment_1_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5332:1: ( ( rule__MultExp__OpAssignment_1_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5333:1: ( rule__MultExp__OpAssignment_1_1 )
            {
             before(grammarAccess.getMultExpAccess().getOpAssignment_1_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5334:1: ( rule__MultExp__OpAssignment_1_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5334:2: rule__MultExp__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultExp__OpAssignment_1_1_in_rule__MultExp__Group_1__1__Impl10651);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5344:1: rule__MultExp__Group_1__2 : rule__MultExp__Group_1__2__Impl ;
    public final void rule__MultExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5348:1: ( rule__MultExp__Group_1__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5349:2: rule__MultExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultExp__Group_1__2__Impl_in_rule__MultExp__Group_1__210681);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5355:1: rule__MultExp__Group_1__2__Impl : ( ( rule__MultExp__RightAssignment_1_2 ) ) ;
    public final void rule__MultExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5359:1: ( ( ( rule__MultExp__RightAssignment_1_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5360:1: ( ( rule__MultExp__RightAssignment_1_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5360:1: ( ( rule__MultExp__RightAssignment_1_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5361:1: ( rule__MultExp__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultExpAccess().getRightAssignment_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5362:1: ( rule__MultExp__RightAssignment_1_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5362:2: rule__MultExp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MultExp__RightAssignment_1_2_in_rule__MultExp__Group_1__2__Impl10708);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5378:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5382:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5383:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__010744);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__010747);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5390:1: rule__Primary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5394:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5395:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5395:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5396:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Primary__Group_1__0__Impl10775); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5409:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5413:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5414:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__110806);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__110809);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5421:1: rule__Primary__Group_1__1__Impl : ( ruleAddExp ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5425:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5426:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5426:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5427:1: ruleAddExp
            {
             before(grammarAccess.getPrimaryAccess().getAddExpParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__Primary__Group_1__1__Impl10836);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5438:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5442:1: ( rule__Primary__Group_1__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5443:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__210865);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5449:1: rule__Primary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5453:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5454:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5454:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5455:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,45,FOLLOW_45_in_rule__Primary__Group_1__2__Impl10893); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5474:1: rule__ConstantOrFunctionCallExp__Group__0 : rule__ConstantOrFunctionCallExp__Group__0__Impl rule__ConstantOrFunctionCallExp__Group__1 ;
    public final void rule__ConstantOrFunctionCallExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5478:1: ( rule__ConstantOrFunctionCallExp__Group__0__Impl rule__ConstantOrFunctionCallExp__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5479:2: rule__ConstantOrFunctionCallExp__Group__0__Impl rule__ConstantOrFunctionCallExp__Group__1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group__0__Impl_in_rule__ConstantOrFunctionCallExp__Group__010930);
            rule__ConstantOrFunctionCallExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group__1_in_rule__ConstantOrFunctionCallExp__Group__010933);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5486:1: rule__ConstantOrFunctionCallExp__Group__0__Impl : ( ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 ) ) ;
    public final void rule__ConstantOrFunctionCallExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5490:1: ( ( ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5491:1: ( ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5491:1: ( ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5492:1: ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 )
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getLabelAssignment_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5493:1: ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5493:2: rule__ConstantOrFunctionCallExp__LabelAssignment_0
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__LabelAssignment_0_in_rule__ConstantOrFunctionCallExp__Group__0__Impl10960);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5503:1: rule__ConstantOrFunctionCallExp__Group__1 : rule__ConstantOrFunctionCallExp__Group__1__Impl ;
    public final void rule__ConstantOrFunctionCallExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5507:1: ( rule__ConstantOrFunctionCallExp__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5508:2: rule__ConstantOrFunctionCallExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group__1__Impl_in_rule__ConstantOrFunctionCallExp__Group__110990);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5514:1: rule__ConstantOrFunctionCallExp__Group__1__Impl : ( ( rule__ConstantOrFunctionCallExp__Group_1__0 )? ) ;
    public final void rule__ConstantOrFunctionCallExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5518:1: ( ( ( rule__ConstantOrFunctionCallExp__Group_1__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5519:1: ( ( rule__ConstantOrFunctionCallExp__Group_1__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5519:1: ( ( rule__ConstantOrFunctionCallExp__Group_1__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5520:1: ( rule__ConstantOrFunctionCallExp__Group_1__0 )?
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5521:1: ( rule__ConstantOrFunctionCallExp__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5521:2: rule__ConstantOrFunctionCallExp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__0_in_rule__ConstantOrFunctionCallExp__Group__1__Impl11017);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5535:1: rule__ConstantOrFunctionCallExp__Group_1__0 : rule__ConstantOrFunctionCallExp__Group_1__0__Impl rule__ConstantOrFunctionCallExp__Group_1__1 ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5539:1: ( rule__ConstantOrFunctionCallExp__Group_1__0__Impl rule__ConstantOrFunctionCallExp__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5540:2: rule__ConstantOrFunctionCallExp__Group_1__0__Impl rule__ConstantOrFunctionCallExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__0__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__011052);
            rule__ConstantOrFunctionCallExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__1_in_rule__ConstantOrFunctionCallExp__Group_1__011055);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5547:1: rule__ConstantOrFunctionCallExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5551:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5552:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5552:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5553:1: '('
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__ConstantOrFunctionCallExp__Group_1__0__Impl11083); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5566:1: rule__ConstantOrFunctionCallExp__Group_1__1 : rule__ConstantOrFunctionCallExp__Group_1__1__Impl rule__ConstantOrFunctionCallExp__Group_1__2 ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5570:1: ( rule__ConstantOrFunctionCallExp__Group_1__1__Impl rule__ConstantOrFunctionCallExp__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5571:2: rule__ConstantOrFunctionCallExp__Group_1__1__Impl rule__ConstantOrFunctionCallExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__1__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__111114);
            rule__ConstantOrFunctionCallExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__2_in_rule__ConstantOrFunctionCallExp__Group_1__111117);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5578:1: rule__ConstantOrFunctionCallExp__Group_1__1__Impl : ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 ) ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5582:1: ( ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5583:1: ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5583:1: ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5584:1: ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 )
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAssignment_1_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5585:1: ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5585:2: rule__ConstantOrFunctionCallExp__ParamAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__ParamAssignment_1_1_in_rule__ConstantOrFunctionCallExp__Group_1__1__Impl11144);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5595:1: rule__ConstantOrFunctionCallExp__Group_1__2 : rule__ConstantOrFunctionCallExp__Group_1__2__Impl rule__ConstantOrFunctionCallExp__Group_1__3 ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5599:1: ( rule__ConstantOrFunctionCallExp__Group_1__2__Impl rule__ConstantOrFunctionCallExp__Group_1__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5600:2: rule__ConstantOrFunctionCallExp__Group_1__2__Impl rule__ConstantOrFunctionCallExp__Group_1__3
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__2__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__211174);
            rule__ConstantOrFunctionCallExp__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__3_in_rule__ConstantOrFunctionCallExp__Group_1__211177);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5607:1: rule__ConstantOrFunctionCallExp__Group_1__2__Impl : ( ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )* ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5611:1: ( ( ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5612:1: ( ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5612:1: ( ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5613:1: ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )*
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5614:1: ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==46) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5614:2: rule__ConstantOrFunctionCallExp__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__0_in_rule__ConstantOrFunctionCallExp__Group_1__2__Impl11204);
            	    rule__ConstantOrFunctionCallExp__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5624:1: rule__ConstantOrFunctionCallExp__Group_1__3 : rule__ConstantOrFunctionCallExp__Group_1__3__Impl ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5628:1: ( rule__ConstantOrFunctionCallExp__Group_1__3__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5629:2: rule__ConstantOrFunctionCallExp__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__3__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__311235);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5635:1: rule__ConstantOrFunctionCallExp__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5639:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5640:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5640:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5641:1: ')'
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getRightParenthesisKeyword_1_3()); 
            match(input,45,FOLLOW_45_in_rule__ConstantOrFunctionCallExp__Group_1__3__Impl11263); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5662:1: rule__ConstantOrFunctionCallExp__Group_1_2__0 : rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl rule__ConstantOrFunctionCallExp__Group_1_2__1 ;
    public final void rule__ConstantOrFunctionCallExp__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5666:1: ( rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl rule__ConstantOrFunctionCallExp__Group_1_2__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5667:2: rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl rule__ConstantOrFunctionCallExp__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl_in_rule__ConstantOrFunctionCallExp__Group_1_2__011302);
            rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__1_in_rule__ConstantOrFunctionCallExp__Group_1_2__011305);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5674:1: rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5678:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5679:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5679:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5680:1: ','
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getCommaKeyword_1_2_0()); 
            match(input,46,FOLLOW_46_in_rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl11333); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5693:1: rule__ConstantOrFunctionCallExp__Group_1_2__1 : rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl ;
    public final void rule__ConstantOrFunctionCallExp__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5697:1: ( rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5698:2: rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl_in_rule__ConstantOrFunctionCallExp__Group_1_2__111364);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5704:1: rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl : ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 ) ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5708:1: ( ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5709:1: ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5709:1: ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5710:1: ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 )
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAssignment_1_2_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5711:1: ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5711:2: rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1_in_rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl11391);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5725:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5729:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5730:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__0__Impl_in_rule__NumberLiteral__Group__011425);
            rule__NumberLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberLiteral__Group__1_in_rule__NumberLiteral__Group__011428);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5737:1: rule__NumberLiteral__Group__0__Impl : ( ( rule__NumberLiteral__NegAssignment_0 )? ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5741:1: ( ( ( rule__NumberLiteral__NegAssignment_0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5742:1: ( ( rule__NumberLiteral__NegAssignment_0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5742:1: ( ( rule__NumberLiteral__NegAssignment_0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5743:1: ( rule__NumberLiteral__NegAssignment_0 )?
            {
             before(grammarAccess.getNumberLiteralAccess().getNegAssignment_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5744:1: ( rule__NumberLiteral__NegAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5744:2: rule__NumberLiteral__NegAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NumberLiteral__NegAssignment_0_in_rule__NumberLiteral__Group__0__Impl11455);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5754:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5758:1: ( rule__NumberLiteral__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5759:2: rule__NumberLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__1__Impl_in_rule__NumberLiteral__Group__111486);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5765:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5769:1: ( ( ( rule__NumberLiteral__ValueAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5770:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5770:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5771:1: ( rule__NumberLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5772:1: ( rule__NumberLiteral__ValueAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5772:2: rule__NumberLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NumberLiteral__ValueAssignment_1_in_rule__NumberLiteral__Group__1__Impl11513);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5787:1: rule__Model__DefsAssignment_0 : ( ruleInitialDefinition ) ;
    public final void rule__Model__DefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5791:1: ( ( ruleInitialDefinition ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5792:1: ( ruleInitialDefinition )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5792:1: ( ruleInitialDefinition )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5793:1: ruleInitialDefinition
            {
             before(grammarAccess.getModelAccess().getDefsInitialDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInitialDefinition_in_rule__Model__DefsAssignment_011552);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5802:1: rule__Model__WorldAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__Model__WorldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5806:1: ( ( ruleEnvironment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5807:1: ( ruleEnvironment )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5807:1: ( ruleEnvironment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5808:1: ruleEnvironment
            {
             before(grammarAccess.getModelAccess().getWorldEnvironmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnvironment_in_rule__Model__WorldAssignment_111583);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5817:1: rule__Model__BodiesAssignment_2 : ( ruleSystem ) ;
    public final void rule__Model__BodiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5821:1: ( ( ruleSystem ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5822:1: ( ruleSystem )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5822:1: ( ruleSystem )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5823:1: ruleSystem
            {
             before(grammarAccess.getModelAccess().getBodiesSystemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSystem_in_rule__Model__BodiesAssignment_211614);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5832:1: rule__Environment__GravityAssignment_3 : ( ruleMatrix ) ;
    public final void rule__Environment__GravityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5836:1: ( ( ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5837:1: ( ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5837:1: ( ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5838:1: ruleMatrix
            {
             before(grammarAccess.getEnvironmentAccess().getGravityMatrixParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__Environment__GravityAssignment_311645);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5847:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5851:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5852:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5852:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5853:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__NameAssignment_111676); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5862:1: rule__System__ElementsAssignment_3 : ( ruleSystemElement ) ;
    public final void rule__System__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5866:1: ( ( ruleSystemElement ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5867:1: ( ruleSystemElement )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5867:1: ( ruleSystemElement )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5868:1: ruleSystemElement
            {
             before(grammarAccess.getSystemAccess().getElementsSystemElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSystemElement_in_rule__System__ElementsAssignment_311707);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5877:1: rule__Body__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Body__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5881:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5882:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5882:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5883:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__NameAssignment_111738); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5892:1: rule__Body__MassAssignment_3 : ( ruleMass ) ;
    public final void rule__Body__MassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5896:1: ( ( ruleMass ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5897:1: ( ruleMass )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5897:1: ( ruleMass )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5898:1: ruleMass
            {
             before(grammarAccess.getBodyAccess().getMassMassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMass_in_rule__Body__MassAssignment_311769);
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


    // $ANTLR start "rule__BodyReference__BaseAssignment_0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5907:1: rule__BodyReference__BaseAssignment_0 : ( ( 'base' ) ) ;
    public final void rule__BodyReference__BaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5911:1: ( ( ( 'base' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5912:1: ( ( 'base' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5912:1: ( ( 'base' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5913:1: ( 'base' )
            {
             before(grammarAccess.getBodyReferenceAccess().getBaseBaseKeyword_0_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5914:1: ( 'base' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5915:1: 'base'
            {
             before(grammarAccess.getBodyReferenceAccess().getBaseBaseKeyword_0_0()); 
            match(input,58,FOLLOW_58_in_rule__BodyReference__BaseAssignment_011805); 
             after(grammarAccess.getBodyReferenceAccess().getBaseBaseKeyword_0_0()); 

            }

             after(grammarAccess.getBodyReferenceAccess().getBaseBaseKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyReference__BaseAssignment_0"


    // $ANTLR start "rule__BodyReference__RefAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5930:1: rule__BodyReference__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__BodyReference__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5934:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5935:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5935:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5936:1: ( RULE_ID )
            {
             before(grammarAccess.getBodyReferenceAccess().getRefBodyCrossReference_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5937:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5938:1: RULE_ID
            {
             before(grammarAccess.getBodyReferenceAccess().getRefBodyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyReference__RefAssignment_111848); 
             after(grammarAccess.getBodyReferenceAccess().getRefBodyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBodyReferenceAccess().getRefBodyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyReference__RefAssignment_1"


    // $ANTLR start "rule__Mass__ValueAssignment_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5949:1: rule__Mass__ValueAssignment_3 : ( ruleAddExp ) ;
    public final void rule__Mass__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5953:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5954:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5954:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5955:1: ruleAddExp
            {
             before(grammarAccess.getMassAccess().getValueAddExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__Mass__ValueAssignment_311883);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5964:1: rule__Mass__PositionAssignment_5 : ( ruleMatrix ) ;
    public final void rule__Mass__PositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5968:1: ( ( ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5969:1: ( ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5969:1: ( ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5970:1: ruleMatrix
            {
             before(grammarAccess.getMassAccess().getPositionMatrixParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__Mass__PositionAssignment_511914);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5979:1: rule__Mass__InertiaAssignment_7 : ( ruleMatrix ) ;
    public final void rule__Mass__InertiaAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5983:1: ( ( ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5984:1: ( ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5984:1: ( ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5985:1: ruleMatrix
            {
             before(grammarAccess.getMassAccess().getInertiaMatrixParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__Mass__InertiaAssignment_711945);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5994:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5998:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5999:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5999:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6000:1: RULE_ID
            {
             before(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Joint__NameAssignment_111976); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6009:1: rule__Joint__TypeAssignment_3 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6013:1: ( ( ruleJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6014:1: ( ruleJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6014:1: ( ruleJointType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6015:1: ruleJointType
            {
             before(grammarAccess.getJointAccess().getTypeJointTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleJointType_in_rule__Joint__TypeAssignment_312007);
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


    // $ANTLR start "rule__Joint__IsStartAssignment_4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6024:1: rule__Joint__IsStartAssignment_4 : ( ( 'start' ) ) ;
    public final void rule__Joint__IsStartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6028:1: ( ( ( 'start' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6029:1: ( ( 'start' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6029:1: ( ( 'start' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6030:1: ( 'start' )
            {
             before(grammarAccess.getJointAccess().getIsStartStartKeyword_4_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6031:1: ( 'start' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6032:1: 'start'
            {
             before(grammarAccess.getJointAccess().getIsStartStartKeyword_4_0()); 
            match(input,59,FOLLOW_59_in_rule__Joint__IsStartAssignment_412043); 
             after(grammarAccess.getJointAccess().getIsStartStartKeyword_4_0()); 

            }

             after(grammarAccess.getJointAccess().getIsStartStartKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__IsStartAssignment_4"


    // $ANTLR start "rule__Joint__Body1Assignment_6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6047:1: rule__Joint__Body1Assignment_6 : ( ruleBodyReference ) ;
    public final void rule__Joint__Body1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6051:1: ( ( ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6052:1: ( ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6052:1: ( ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6053:1: ruleBodyReference
            {
             before(grammarAccess.getJointAccess().getBody1BodyReferenceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleBodyReference_in_rule__Joint__Body1Assignment_612082);
            ruleBodyReference();

            state._fsp--;

             after(grammarAccess.getJointAccess().getBody1BodyReferenceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Body1Assignment_6"


    // $ANTLR start "rule__Joint__RelTrans1Assignment_7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6062:1: rule__Joint__RelTrans1Assignment_7 : ( ruleRelativeTransformation ) ;
    public final void rule__Joint__RelTrans1Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6066:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6067:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6067:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6068:1: ruleRelativeTransformation
            {
             before(grammarAccess.getJointAccess().getRelTrans1RelativeTransformationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__Joint__RelTrans1Assignment_712113);
            ruleRelativeTransformation();

            state._fsp--;

             after(grammarAccess.getJointAccess().getRelTrans1RelativeTransformationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__RelTrans1Assignment_7"


    // $ANTLR start "rule__Joint__Body2Assignment_9"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6077:1: rule__Joint__Body2Assignment_9 : ( ruleBodyReference ) ;
    public final void rule__Joint__Body2Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6081:1: ( ( ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6082:1: ( ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6082:1: ( ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6083:1: ruleBodyReference
            {
             before(grammarAccess.getJointAccess().getBody2BodyReferenceParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleBodyReference_in_rule__Joint__Body2Assignment_912144);
            ruleBodyReference();

            state._fsp--;

             after(grammarAccess.getJointAccess().getBody2BodyReferenceParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Body2Assignment_9"


    // $ANTLR start "rule__Joint__RelTrans2Assignment_10"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6092:1: rule__Joint__RelTrans2Assignment_10 : ( ruleRelativeTransformation ) ;
    public final void rule__Joint__RelTrans2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6096:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6097:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6097:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6098:1: ruleRelativeTransformation
            {
             before(grammarAccess.getJointAccess().getRelTrans2RelativeTransformationParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__Joint__RelTrans2Assignment_1012175);
            ruleRelativeTransformation();

            state._fsp--;

             after(grammarAccess.getJointAccess().getRelTrans2RelativeTransformationParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__RelTrans2Assignment_10"


    // $ANTLR start "rule__Joint__SpringCoeffAssignment_14"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6107:1: rule__Joint__SpringCoeffAssignment_14 : ( ruleAddExp ) ;
    public final void rule__Joint__SpringCoeffAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6111:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6112:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6112:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6113:1: ruleAddExp
            {
             before(grammarAccess.getJointAccess().getSpringCoeffAddExpParserRuleCall_14_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__Joint__SpringCoeffAssignment_1412206);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getJointAccess().getSpringCoeffAddExpParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__SpringCoeffAssignment_14"


    // $ANTLR start "rule__Joint__SpringInitAssignment_16"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6122:1: rule__Joint__SpringInitAssignment_16 : ( ruleAddExp ) ;
    public final void rule__Joint__SpringInitAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6126:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6127:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6127:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6128:1: ruleAddExp
            {
             before(grammarAccess.getJointAccess().getSpringInitAddExpParserRuleCall_16_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__Joint__SpringInitAssignment_1612237);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getJointAccess().getSpringInitAddExpParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__SpringInitAssignment_16"


    // $ANTLR start "rule__Joint__DampViscousAssignment_18"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6137:1: rule__Joint__DampViscousAssignment_18 : ( ruleAddExp ) ;
    public final void rule__Joint__DampViscousAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6141:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6142:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6142:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6143:1: ruleAddExp
            {
             before(grammarAccess.getJointAccess().getDampViscousAddExpParserRuleCall_18_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__Joint__DampViscousAssignment_1812268);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getJointAccess().getDampViscousAddExpParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__DampViscousAssignment_18"


    // $ANTLR start "rule__Joint__DampCoulombAssignment_20"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6152:1: rule__Joint__DampCoulombAssignment_20 : ( ruleAddExp ) ;
    public final void rule__Joint__DampCoulombAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6156:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6157:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6157:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6158:1: ruleAddExp
            {
             before(grammarAccess.getJointAccess().getDampCoulombAddExpParserRuleCall_20_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__Joint__DampCoulombAssignment_2012299);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getJointAccess().getDampCoulombAddExpParserRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__DampCoulombAssignment_20"


    // $ANTLR start "rule__JointType__NameAssignment_0_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6167:1: rule__JointType__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__JointType__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6171:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6172:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6172:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6173:1: RULE_ID
            {
             before(grammarAccess.getJointTypeAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JointType__NameAssignment_0_212330); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6182:1: rule__JointType__ExpAssignment_1 : ( ruleJointTypeExpression ) ;
    public final void rule__JointType__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6186:1: ( ( ruleJointTypeExpression ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6187:1: ( ruleJointTypeExpression )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6187:1: ( ruleJointTypeExpression )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6188:1: ruleJointTypeExpression
            {
             before(grammarAccess.getJointTypeAccess().getExpJointTypeExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJointTypeExpression_in_rule__JointType__ExpAssignment_112361);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6197:1: rule__JointTypeExpression__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__JointTypeExpression__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6201:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6202:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6202:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6203:1: ( RULE_ID )
            {
             before(grammarAccess.getJointTypeExpressionAccess().getRefJointTypeCrossReference_0_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6204:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6205:1: RULE_ID
            {
             before(grammarAccess.getJointTypeExpressionAccess().getRefJointTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JointTypeExpression__RefAssignment_012396); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6216:1: rule__JointTypeExpression__AxisAssignment_1_2 : ( ruleAXIS ) ;
    public final void rule__JointTypeExpression__AxisAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6220:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6221:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6221:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6222:1: ruleAXIS
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_1_212431);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6231:1: rule__JointTypeExpression__AxisAssignment_1_3_1 : ( ruleAXIS ) ;
    public final void rule__JointTypeExpression__AxisAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6235:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6236:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6236:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6237:1: ruleAXIS
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_1_3_112462);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6246:1: rule__JointTypeExpression__AxisAssignment_2_2 : ( ruleAXIS ) ;
    public final void rule__JointTypeExpression__AxisAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6250:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6251:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6251:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6252:1: ruleAXIS
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_2_212493);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6261:1: rule__JointTypeExpression__AxisAssignment_2_3_1 : ( ruleAXIS ) ;
    public final void rule__JointTypeExpression__AxisAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6265:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6266:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6266:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6267:1: ruleAXIS
            {
             before(grammarAccess.getJointTypeExpressionAccess().getAxisAXISEnumRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_2_3_112524);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6276:1: rule__RelativeTransformation__PositionAssignment_4 : ( ruleMatrix ) ;
    public final void rule__RelativeTransformation__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6280:1: ( ( ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6281:1: ( ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6281:1: ( ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6282:1: ruleMatrix
            {
             before(grammarAccess.getRelativeTransformationAccess().getPositionMatrixParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__RelativeTransformation__PositionAssignment_412555);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6291:1: rule__RelativeTransformation__ReorientAssignment_6 : ( ruleReorientation ) ;
    public final void rule__RelativeTransformation__ReorientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6295:1: ( ( ruleReorientation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6296:1: ( ruleReorientation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6296:1: ( ruleReorientation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6297:1: ruleReorientation
            {
             before(grammarAccess.getRelativeTransformationAccess().getReorientReorientationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleReorientation_in_rule__RelativeTransformation__ReorientAssignment_612586);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6306:1: rule__Reorientation__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Reorientation__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6310:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6311:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6311:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6312:1: RULE_ID
            {
             before(grammarAccess.getReorientationAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reorientation__NameAssignment_0_112617); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6321:1: rule__Reorientation__ExpAssignment_1 : ( ruleReorientExpression ) ;
    public final void rule__Reorientation__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6325:1: ( ( ruleReorientExpression ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6326:1: ( ruleReorientExpression )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6326:1: ( ruleReorientExpression )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6327:1: ruleReorientExpression
            {
             before(grammarAccess.getReorientationAccess().getExpReorientExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReorientExpression_in_rule__Reorientation__ExpAssignment_112648);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6336:1: rule__ReorientExpression__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReorientExpression__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6340:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6341:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6341:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6342:1: ( RULE_ID )
            {
             before(grammarAccess.getReorientExpressionAccess().getRefReorientationCrossReference_0_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6343:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6344:1: RULE_ID
            {
             before(grammarAccess.getReorientExpressionAccess().getRefReorientationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReorientExpression__RefAssignment_012683); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6355:1: rule__ReorientExpression__AxisAssignment_1_2 : ( ruleAXIS ) ;
    public final void rule__ReorientExpression__AxisAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6359:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6360:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6360:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6361:1: ruleAXIS
            {
             before(grammarAccess.getReorientExpressionAccess().getAxisAXISEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__ReorientExpression__AxisAssignment_1_212718);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6370:1: rule__ReorientExpression__ValueAssignment_1_4 : ( ruleAddExp ) ;
    public final void rule__ReorientExpression__ValueAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6374:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6375:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6375:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6376:1: ruleAddExp
            {
             before(grammarAccess.getReorientExpressionAccess().getValueAddExpParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__ReorientExpression__ValueAssignment_1_412749);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6385:1: rule__ReorientExpression__AxisAssignment_1_6_2 : ( ruleAXIS ) ;
    public final void rule__ReorientExpression__AxisAssignment_1_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6389:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6390:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6390:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6391:1: ruleAXIS
            {
             before(grammarAccess.getReorientExpressionAccess().getAxisAXISEnumRuleCall_1_6_2_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__ReorientExpression__AxisAssignment_1_6_212780);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6400:1: rule__ReorientExpression__ValueAssignment_1_6_4 : ( ruleAddExp ) ;
    public final void rule__ReorientExpression__ValueAssignment_1_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6404:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6405:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6405:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6406:1: ruleAddExp
            {
             before(grammarAccess.getReorientExpressionAccess().getValueAddExpParserRuleCall_1_6_4_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__ReorientExpression__ValueAssignment_1_6_412811);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6415:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6419:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6420:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6420:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6421:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constraint__NameAssignment_112842); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6430:1: rule__Constraint__TypeAssignment_3 : ( ruleConstraintType ) ;
    public final void rule__Constraint__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6434:1: ( ( ruleConstraintType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6435:1: ( ruleConstraintType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6435:1: ( ruleConstraintType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6436:1: ruleConstraintType
            {
             before(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConstraintType_in_rule__Constraint__TypeAssignment_312873);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6445:1: rule__Constraint__Body1Assignment_5 : ( ruleBodyReference ) ;
    public final void rule__Constraint__Body1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6449:1: ( ( ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6450:1: ( ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6450:1: ( ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6451:1: ruleBodyReference
            {
             before(grammarAccess.getConstraintAccess().getBody1BodyReferenceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBodyReference_in_rule__Constraint__Body1Assignment_512904);
            ruleBodyReference();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getBody1BodyReferenceParserRuleCall_5_0()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6460:1: rule__Constraint__RelTrans1Assignment_6 : ( ruleRelativeTransformation ) ;
    public final void rule__Constraint__RelTrans1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6464:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6465:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6465:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6466:1: ruleRelativeTransformation
            {
             before(grammarAccess.getConstraintAccess().getRelTrans1RelativeTransformationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__Constraint__RelTrans1Assignment_612935);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6475:1: rule__Constraint__Body2Assignment_8 : ( ruleBodyReference ) ;
    public final void rule__Constraint__Body2Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6479:1: ( ( ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6480:1: ( ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6480:1: ( ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6481:1: ruleBodyReference
            {
             before(grammarAccess.getConstraintAccess().getBody2BodyReferenceParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleBodyReference_in_rule__Constraint__Body2Assignment_812966);
            ruleBodyReference();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getBody2BodyReferenceParserRuleCall_8_0()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6490:1: rule__Constraint__RelTrans2Assignment_9 : ( ruleRelativeTransformation ) ;
    public final void rule__Constraint__RelTrans2Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6494:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6495:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6495:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6496:1: ruleRelativeTransformation
            {
             before(grammarAccess.getConstraintAccess().getRelTrans2RelativeTransformationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__Constraint__RelTrans2Assignment_912997);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6505:1: rule__ExternalLoad__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExternalLoad__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6509:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6510:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6510:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6511:1: RULE_ID
            {
             before(grammarAccess.getExternalLoadAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalLoad__NameAssignment_213028); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6520:1: rule__ExternalLoad__TypeAssignment_4 : ( ruleLoadType ) ;
    public final void rule__ExternalLoad__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6524:1: ( ( ruleLoadType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6525:1: ( ruleLoadType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6525:1: ( ruleLoadType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6526:1: ruleLoadType
            {
             before(grammarAccess.getExternalLoadAccess().getTypeLoadTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleLoadType_in_rule__ExternalLoad__TypeAssignment_413059);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6535:1: rule__ExternalLoad__Body1Assignment_6 : ( ruleBodyReference ) ;
    public final void rule__ExternalLoad__Body1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6539:1: ( ( ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6540:1: ( ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6540:1: ( ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6541:1: ruleBodyReference
            {
             before(grammarAccess.getExternalLoadAccess().getBody1BodyReferenceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleBodyReference_in_rule__ExternalLoad__Body1Assignment_613090);
            ruleBodyReference();

            state._fsp--;

             after(grammarAccess.getExternalLoadAccess().getBody1BodyReferenceParserRuleCall_6_0()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6550:1: rule__ExternalLoad__RelTrans1Assignment_7 : ( ruleRelativeTransformation ) ;
    public final void rule__ExternalLoad__RelTrans1Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6554:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6555:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6555:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6556:1: ruleRelativeTransformation
            {
             before(grammarAccess.getExternalLoadAccess().getRelTrans1RelativeTransformationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__ExternalLoad__RelTrans1Assignment_713121);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6565:1: rule__ExternalLoad__Body2Assignment_9 : ( ruleBodyReference ) ;
    public final void rule__ExternalLoad__Body2Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6569:1: ( ( ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6570:1: ( ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6570:1: ( ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6571:1: ruleBodyReference
            {
             before(grammarAccess.getExternalLoadAccess().getBody2BodyReferenceParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleBodyReference_in_rule__ExternalLoad__Body2Assignment_913152);
            ruleBodyReference();

            state._fsp--;

             after(grammarAccess.getExternalLoadAccess().getBody2BodyReferenceParserRuleCall_9_0()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6580:1: rule__ExternalLoad__RelTrans2Assignment_10 : ( ruleRelativeTransformation ) ;
    public final void rule__ExternalLoad__RelTrans2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6584:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6585:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6585:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6586:1: ruleRelativeTransformation
            {
             before(grammarAccess.getExternalLoadAccess().getRelTrans2RelativeTransformationParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__ExternalLoad__RelTrans2Assignment_1013183);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6595:1: rule__BaseMatrix__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__BaseMatrix__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6599:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6600:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6600:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6601:1: RULE_ID
            {
             before(grammarAccess.getBaseMatrixAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BaseMatrix__NameAssignment_0_113214); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6610:1: rule__BaseMatrix__ValuesAssignment_2 : ( ruleAddExp ) ;
    public final void rule__BaseMatrix__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6614:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6615:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6615:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6616:1: ruleAddExp
            {
             before(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__BaseMatrix__ValuesAssignment_213245);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6625:1: rule__BaseMatrix__ValuesAssignment_3_1 : ( ruleAddExp ) ;
    public final void rule__BaseMatrix__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6629:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6630:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6630:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6631:1: ruleAddExp
            {
             before(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__BaseMatrix__ValuesAssignment_3_113276);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6640:1: rule__MatrixRef__MatrixAssignment : ( ( RULE_ID ) ) ;
    public final void rule__MatrixRef__MatrixAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6644:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6645:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6645:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6646:1: ( RULE_ID )
            {
             before(grammarAccess.getMatrixRefAccess().getMatrixBaseMatrixCrossReference_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6647:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6648:1: RULE_ID
            {
             before(grammarAccess.getMatrixRefAccess().getMatrixBaseMatrixIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MatrixRef__MatrixAssignment13311); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6659:1: rule__AddExp__OpAssignment_1_1 : ( ( rule__AddExp__OpAlternatives_1_1_0 ) ) ;
    public final void rule__AddExp__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6663:1: ( ( ( rule__AddExp__OpAlternatives_1_1_0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6664:1: ( ( rule__AddExp__OpAlternatives_1_1_0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6664:1: ( ( rule__AddExp__OpAlternatives_1_1_0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6665:1: ( rule__AddExp__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getAddExpAccess().getOpAlternatives_1_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6666:1: ( rule__AddExp__OpAlternatives_1_1_0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6666:2: rule__AddExp__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__AddExp__OpAlternatives_1_1_0_in_rule__AddExp__OpAssignment_1_113346);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6675:1: rule__AddExp__RightAssignment_1_2 : ( ruleMultExp ) ;
    public final void rule__AddExp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6679:1: ( ( ruleMultExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6680:1: ( ruleMultExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6680:1: ( ruleMultExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6681:1: ruleMultExp
            {
             before(grammarAccess.getAddExpAccess().getRightMultExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultExp_in_rule__AddExp__RightAssignment_1_213379);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6690:1: rule__MultExp__OpAssignment_1_1 : ( ( rule__MultExp__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MultExp__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6694:1: ( ( ( rule__MultExp__OpAlternatives_1_1_0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6695:1: ( ( rule__MultExp__OpAlternatives_1_1_0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6695:1: ( ( rule__MultExp__OpAlternatives_1_1_0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6696:1: ( rule__MultExp__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultExpAccess().getOpAlternatives_1_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6697:1: ( rule__MultExp__OpAlternatives_1_1_0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6697:2: rule__MultExp__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__MultExp__OpAlternatives_1_1_0_in_rule__MultExp__OpAssignment_1_113410);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6706:1: rule__MultExp__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MultExp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6710:1: ( ( rulePrimary ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6711:1: ( rulePrimary )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6711:1: ( rulePrimary )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6712:1: rulePrimary
            {
             before(grammarAccess.getMultExpAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MultExp__RightAssignment_1_213443);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6721:1: rule__ConstantOrFunctionCallExp__LabelAssignment_0 : ( RULE_ID ) ;
    public final void rule__ConstantOrFunctionCallExp__LabelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6725:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6726:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6726:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6727:1: RULE_ID
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getLabelIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantOrFunctionCallExp__LabelAssignment_013474); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6736:1: rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 : ( ruleAddExp ) ;
    public final void rule__ConstantOrFunctionCallExp__ParamAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6740:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6741:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6741:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6742:1: ruleAddExp
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__ConstantOrFunctionCallExp__ParamAssignment_1_113505);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6751:1: rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 : ( ruleAddExp ) ;
    public final void rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6755:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6756:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6756:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6757:1: ruleAddExp
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_113536);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6766:1: rule__NumberLiteral__NegAssignment_0 : ( ( '-' ) ) ;
    public final void rule__NumberLiteral__NegAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6770:1: ( ( ( '-' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6771:1: ( ( '-' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6771:1: ( ( '-' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6772:1: ( '-' )
            {
             before(grammarAccess.getNumberLiteralAccess().getNegHyphenMinusKeyword_0_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6773:1: ( '-' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6774:1: '-'
            {
             before(grammarAccess.getNumberLiteralAccess().getNegHyphenMinusKeyword_0_0()); 
            match(input,13,FOLLOW_13_in_rule__NumberLiteral__NegAssignment_013572); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6789:1: rule__NumberLiteral__ValueAssignment_1 : ( RULE_REAL ) ;
    public final void rule__NumberLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6793:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6794:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6794:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6795:1: RULE_REAL
            {
             before(grammarAccess.getNumberLiteralAccess().getValueREALTerminalRuleCall_1_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__NumberLiteral__ValueAssignment_113611); 
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
    public static final BitSet FOLLOW_ruleBodyReference_in_entryRuleBodyReference421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyReference428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyReference__Alternatives_in_ruleBodyReference454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_entryRuleMass481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMass488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__0_in_ruleMass514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_entryRuleJoint541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoint548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__0_in_ruleJoint574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_entryRuleJointType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group__0_in_ruleJointType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointTypeExpression_in_entryRuleJointTypeExpression661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointTypeExpression668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Alternatives_in_ruleJointTypeExpression694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_entryRuleRelativeTransformation721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeTransformation728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__0_in_ruleRelativeTransformation754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientation_in_entryRuleReorientation781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientation788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group__0_in_ruleReorientation814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientExpression_in_entryRuleReorientExpression841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientExpression848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Alternatives_in_ruleReorientExpression874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLoad_in_entryRuleExternalLoad961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalLoad968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__0_in_ruleExternalLoad994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_entryRuleMatrix1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Alternatives_in_ruleMatrix1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_entryRuleBaseMatrix1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseMatrix1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__0_in_ruleBaseMatrix1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRef_in_entryRuleMatrixRef1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrixRef1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixRef__MatrixAssignment_in_ruleMatrixRef1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_entryRuleAddExp1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExp1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group__0_in_ruleAddExp1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_entryRuleMultExp1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExp1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group__0_in_ruleMultExp1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantOrFunctionCallExp_in_entryRuleConstantOrFunctionCallExp1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantOrFunctionCallExp1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group__0_in_ruleConstantOrFunctionCallExp1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__0_in_ruleNumberLiteral1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AXIS__Alternatives_in_ruleAXIS1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintType__Alternatives_in_ruleConstraintType1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadType__Alternatives_in_ruleLoadType1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_rule__InitialDefinition__Alternatives1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_rule__InitialDefinition__Alternatives1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__SystemElement__Alternatives1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_rule__SystemElement__Alternatives1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__SystemElement__Alternatives1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLoad_in_rule__SystemElement__Alternatives1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyReference__BaseAssignment_0_in_rule__BodyReference__Alternatives1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyReference__RefAssignment_1_in_rule__BodyReference__Alternatives1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__RefAssignment_0_in_rule__JointTypeExpression__Alternatives1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__0_in_rule__JointTypeExpression__Alternatives1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__0_in_rule__JointTypeExpression__Alternatives1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__RefAssignment_0_in_rule__ReorientExpression__Alternatives1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__0_in_rule__ReorientExpression__Alternatives1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_rule__Matrix__Alternatives1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRef_in_rule__Matrix__Alternatives1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AddExp__OpAlternatives_1_1_01971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AddExp__OpAlternatives_1_1_01991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MultExp__OpAlternatives_1_1_02026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MultExp__OpAlternatives_1_1_02046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_rule__Primary__Alternatives2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantOrFunctionCallExp_in_rule__Primary__Alternatives2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AXIS__Alternatives2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AXIS__Alternatives2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AXIS__Alternatives2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ConstraintType__Alternatives2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ConstraintType__Alternatives2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LoadType__Alternatives2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LoadType__Alternatives2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02337 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DefsAssignment_0_in_rule__Model__Group__0__Impl2367 = new BitSet(new long[]{0x0280880200000012L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12398 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WorldAssignment_1_in_rule__Model__Group__1__Impl2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl2487 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl2499 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__0__Impl_in_rule__Environment__Group__02538 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Environment__Group__1_in_rule__Environment__Group__02541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Environment__Group__0__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__1__Impl_in_rule__Environment__Group__12600 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Environment__Group__2_in_rule__Environment__Group__12603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Environment__Group__1__Impl2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__2__Impl_in_rule__Environment__Group__22662 = new BitSet(new long[]{0x0280000000000010L});
    public static final BitSet FOLLOW_rule__Environment__Group__3_in_rule__Environment__Group__22665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Environment__Group__2__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__3__Impl_in_rule__Environment__Group__32724 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Environment__Group__4_in_rule__Environment__Group__32727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__GravityAssignment_3_in_rule__Environment__Group__3__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__4__Impl_in_rule__Environment__Group__42784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Environment__Group__4__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__02853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__02856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__System__Group__0__Impl2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__12915 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__12918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__22975 = new BitSet(new long[]{0x0030000210000000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__22978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__System__Group__2__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__33037 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__33040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl3069 = new BitSet(new long[]{0x0030000210000002L});
    public static final BitSet FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl3081 = new BitSet(new long[]{0x0030000210000002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__43114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__System__Group__4__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__03183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__03186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Body__Group__0__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__13245 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__13248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__NameAssignment_1_in_rule__Body__Group__1__Impl3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__23305 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__23308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Body__Group__2__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__33367 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Body__Group__4_in_rule__Body__Group__33370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__MassAssignment_3_in_rule__Body__Group__3__Impl3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__43427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Body__Group__4__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__0__Impl_in_rule__Mass__Group__03496 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__1_in_rule__Mass__Group__03499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Mass__Group__0__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__1__Impl_in_rule__Mass__Group__13558 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__2_in_rule__Mass__Group__13561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Mass__Group__1__Impl3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__2__Impl_in_rule__Mass__Group__23620 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__Mass__Group__3_in_rule__Mass__Group__23623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Mass__Group__2__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__3__Impl_in_rule__Mass__Group__33682 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__4_in_rule__Mass__Group__33685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__ValueAssignment_3_in_rule__Mass__Group__3__Impl3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__4__Impl_in_rule__Mass__Group__43742 = new BitSet(new long[]{0x0280000000000010L});
    public static final BitSet FOLLOW_rule__Mass__Group__5_in_rule__Mass__Group__43745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Mass__Group__4__Impl3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__5__Impl_in_rule__Mass__Group__53804 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__6_in_rule__Mass__Group__53807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__PositionAssignment_5_in_rule__Mass__Group__5__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__6__Impl_in_rule__Mass__Group__63864 = new BitSet(new long[]{0x0280000000000010L});
    public static final BitSet FOLLOW_rule__Mass__Group__7_in_rule__Mass__Group__63867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Mass__Group__6__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__7__Impl_in_rule__Mass__Group__73926 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__8_in_rule__Mass__Group__73929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__InertiaAssignment_7_in_rule__Mass__Group__7__Impl3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__8__Impl_in_rule__Mass__Group__83986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Mass__Group__8__Impl4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__0__Impl_in_rule__Joint__Group__04063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Joint__Group__1_in_rule__Joint__Group__04066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Joint__Group__0__Impl4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__1__Impl_in_rule__Joint__Group__14125 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__2_in_rule__Joint__Group__14128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__NameAssignment_1_in_rule__Joint__Group__1__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__2__Impl_in_rule__Joint__Group__24185 = new BitSet(new long[]{0x0280880200000010L});
    public static final BitSet FOLLOW_rule__Joint__Group__3_in_rule__Joint__Group__24188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Joint__Group__2__Impl4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__3__Impl_in_rule__Joint__Group__34247 = new BitSet(new long[]{0x0800000800000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__4_in_rule__Joint__Group__34250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__TypeAssignment_3_in_rule__Joint__Group__3__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__4__Impl_in_rule__Joint__Group__44307 = new BitSet(new long[]{0x0800000800000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__5_in_rule__Joint__Group__44310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__IsStartAssignment_4_in_rule__Joint__Group__4__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__5__Impl_in_rule__Joint__Group__54368 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_rule__Joint__Group__6_in_rule__Joint__Group__54371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Joint__Group__5__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__6__Impl_in_rule__Joint__Group__64430 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__7_in_rule__Joint__Group__64433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Body1Assignment_6_in_rule__Joint__Group__6__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__7__Impl_in_rule__Joint__Group__74490 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__8_in_rule__Joint__Group__74493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__RelTrans1Assignment_7_in_rule__Joint__Group__7__Impl4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__8__Impl_in_rule__Joint__Group__84550 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_rule__Joint__Group__9_in_rule__Joint__Group__84553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Joint__Group__8__Impl4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__9__Impl_in_rule__Joint__Group__94612 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__10_in_rule__Joint__Group__94615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Body2Assignment_9_in_rule__Joint__Group__9__Impl4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__10__Impl_in_rule__Joint__Group__104672 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__11_in_rule__Joint__Group__104675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__RelTrans2Assignment_10_in_rule__Joint__Group__10__Impl4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__11__Impl_in_rule__Joint__Group__114732 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__12_in_rule__Joint__Group__114735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Joint__Group__11__Impl4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__12__Impl_in_rule__Joint__Group__124794 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__13_in_rule__Joint__Group__124797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Joint__Group__12__Impl4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__13__Impl_in_rule__Joint__Group__134856 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__Joint__Group__14_in_rule__Joint__Group__134859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Joint__Group__13__Impl4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__14__Impl_in_rule__Joint__Group__144918 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__15_in_rule__Joint__Group__144921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__SpringCoeffAssignment_14_in_rule__Joint__Group__14__Impl4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__15__Impl_in_rule__Joint__Group__154978 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__Joint__Group__16_in_rule__Joint__Group__154981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Joint__Group__15__Impl5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__16__Impl_in_rule__Joint__Group__165040 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__17_in_rule__Joint__Group__165043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__SpringInitAssignment_16_in_rule__Joint__Group__16__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__17__Impl_in_rule__Joint__Group__175100 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__Joint__Group__18_in_rule__Joint__Group__175103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Joint__Group__17__Impl5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__18__Impl_in_rule__Joint__Group__185162 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__19_in_rule__Joint__Group__185165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__DampViscousAssignment_18_in_rule__Joint__Group__18__Impl5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__19__Impl_in_rule__Joint__Group__195222 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__Joint__Group__20_in_rule__Joint__Group__195225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Joint__Group__19__Impl5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__20__Impl_in_rule__Joint__Group__205284 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__21_in_rule__Joint__Group__205287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__DampCoulombAssignment_20_in_rule__Joint__Group__20__Impl5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__21__Impl_in_rule__Joint__Group__215344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Joint__Group__21__Impl5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group__0__Impl_in_rule__JointType__Group__05447 = new BitSet(new long[]{0x0280880200000010L});
    public static final BitSet FOLLOW_rule__JointType__Group__1_in_rule__JointType__Group__05450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__0_in_rule__JointType__Group__0__Impl5477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group__1__Impl_in_rule__JointType__Group__15508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__ExpAssignment_1_in_rule__JointType__Group__1__Impl5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__0__Impl_in_rule__JointType__Group_0__05569 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__1_in_rule__JointType__Group_0__05572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__JointType__Group_0__0__Impl5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__1__Impl_in_rule__JointType__Group_0__15631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__2_in_rule__JointType__Group_0__15634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__JointType__Group_0__1__Impl5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__2__Impl_in_rule__JointType__Group_0__25693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__NameAssignment_0_2_in_rule__JointType__Group_0__2__Impl5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__0__Impl_in_rule__JointTypeExpression__Group_1__05756 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__1_in_rule__JointTypeExpression__Group_1__05759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__JointTypeExpression__Group_1__0__Impl5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__1__Impl_in_rule__JointTypeExpression__Group_1__15818 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__2_in_rule__JointTypeExpression__Group_1__15821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__JointTypeExpression__Group_1__1__Impl5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__2__Impl_in_rule__JointTypeExpression__Group_1__25880 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__3_in_rule__JointTypeExpression__Group_1__25883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__AxisAssignment_1_2_in_rule__JointTypeExpression__Group_1__2__Impl5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__3__Impl_in_rule__JointTypeExpression__Group_1__35940 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__4_in_rule__JointTypeExpression__Group_1__35943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1_3__0_in_rule__JointTypeExpression__Group_1__3__Impl5970 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1__4__Impl_in_rule__JointTypeExpression__Group_1__46001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__JointTypeExpression__Group_1__4__Impl6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1_3__0__Impl_in_rule__JointTypeExpression__Group_1_3__06070 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1_3__1_in_rule__JointTypeExpression__Group_1_3__06073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__JointTypeExpression__Group_1_3__0__Impl6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_1_3__1__Impl_in_rule__JointTypeExpression__Group_1_3__16132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__AxisAssignment_1_3_1_in_rule__JointTypeExpression__Group_1_3__1__Impl6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__0__Impl_in_rule__JointTypeExpression__Group_2__06193 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__1_in_rule__JointTypeExpression__Group_2__06196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__JointTypeExpression__Group_2__0__Impl6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__1__Impl_in_rule__JointTypeExpression__Group_2__16255 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__2_in_rule__JointTypeExpression__Group_2__16258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__JointTypeExpression__Group_2__1__Impl6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__2__Impl_in_rule__JointTypeExpression__Group_2__26317 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__3_in_rule__JointTypeExpression__Group_2__26320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__AxisAssignment_2_2_in_rule__JointTypeExpression__Group_2__2__Impl6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__3__Impl_in_rule__JointTypeExpression__Group_2__36377 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__4_in_rule__JointTypeExpression__Group_2__36380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2_3__0_in_rule__JointTypeExpression__Group_2__3__Impl6407 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2__4__Impl_in_rule__JointTypeExpression__Group_2__46438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__JointTypeExpression__Group_2__4__Impl6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2_3__0__Impl_in_rule__JointTypeExpression__Group_2_3__06507 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2_3__1_in_rule__JointTypeExpression__Group_2_3__06510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__JointTypeExpression__Group_2_3__0__Impl6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__Group_2_3__1__Impl_in_rule__JointTypeExpression__Group_2_3__16569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeExpression__AxisAssignment_2_3_1_in_rule__JointTypeExpression__Group_2_3__1__Impl6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__0__Impl_in_rule__RelativeTransformation__Group__06630 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__1_in_rule__RelativeTransformation__Group__06633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__RelativeTransformation__Group__0__Impl6661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__1__Impl_in_rule__RelativeTransformation__Group__16692 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__2_in_rule__RelativeTransformation__Group__16695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__RelativeTransformation__Group__1__Impl6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__2__Impl_in_rule__RelativeTransformation__Group__26754 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__3_in_rule__RelativeTransformation__Group__26757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__RelativeTransformation__Group__2__Impl6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__3__Impl_in_rule__RelativeTransformation__Group__36816 = new BitSet(new long[]{0x0280000000000010L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__4_in_rule__RelativeTransformation__Group__36819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__RelativeTransformation__Group__3__Impl6847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__4__Impl_in_rule__RelativeTransformation__Group__46878 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__5_in_rule__RelativeTransformation__Group__46881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__PositionAssignment_4_in_rule__RelativeTransformation__Group__4__Impl6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__5__Impl_in_rule__RelativeTransformation__Group__56938 = new BitSet(new long[]{0x0008100000000010L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__6_in_rule__RelativeTransformation__Group__56941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__RelativeTransformation__Group__5__Impl6969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__6__Impl_in_rule__RelativeTransformation__Group__67000 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__7_in_rule__RelativeTransformation__Group__67003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__ReorientAssignment_6_in_rule__RelativeTransformation__Group__6__Impl7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__7__Impl_in_rule__RelativeTransformation__Group__77060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__RelativeTransformation__Group__7__Impl7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group__0__Impl_in_rule__Reorientation__Group__07135 = new BitSet(new long[]{0x0008100000000010L});
    public static final BitSet FOLLOW_rule__Reorientation__Group__1_in_rule__Reorientation__Group__07138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group_0__0_in_rule__Reorientation__Group__0__Impl7165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group__1__Impl_in_rule__Reorientation__Group__17196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__ExpAssignment_1_in_rule__Reorientation__Group__1__Impl7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group_0__0__Impl_in_rule__Reorientation__Group_0__07257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reorientation__Group_0__1_in_rule__Reorientation__Group_0__07260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Reorientation__Group_0__0__Impl7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group_0__1__Impl_in_rule__Reorientation__Group_0__17319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__NameAssignment_0_1_in_rule__Reorientation__Group_0__1__Impl7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__0__Impl_in_rule__ReorientExpression__Group_1__07380 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__1_in_rule__ReorientExpression__Group_1__07383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ReorientExpression__Group_1__0__Impl7411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__1__Impl_in_rule__ReorientExpression__Group_1__17442 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__2_in_rule__ReorientExpression__Group_1__17445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ReorientExpression__Group_1__1__Impl7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__2__Impl_in_rule__ReorientExpression__Group_1__27504 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__3_in_rule__ReorientExpression__Group_1__27507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__AxisAssignment_1_2_in_rule__ReorientExpression__Group_1__2__Impl7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__3__Impl_in_rule__ReorientExpression__Group_1__37564 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__4_in_rule__ReorientExpression__Group_1__37567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ReorientExpression__Group_1__3__Impl7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__4__Impl_in_rule__ReorientExpression__Group_1__47626 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__5_in_rule__ReorientExpression__Group_1__47629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__ValueAssignment_1_4_in_rule__ReorientExpression__Group_1__4__Impl7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__5__Impl_in_rule__ReorientExpression__Group_1__57686 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__6_in_rule__ReorientExpression__Group_1__57689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ReorientExpression__Group_1__5__Impl7717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__6__Impl_in_rule__ReorientExpression__Group_1__67748 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__7_in_rule__ReorientExpression__Group_1__67751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__0_in_rule__ReorientExpression__Group_1__6__Impl7778 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1__7__Impl_in_rule__ReorientExpression__Group_1__77809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ReorientExpression__Group_1__7__Impl7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__0__Impl_in_rule__ReorientExpression__Group_1_6__07884 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__1_in_rule__ReorientExpression__Group_1_6__07887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ReorientExpression__Group_1_6__0__Impl7915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__1__Impl_in_rule__ReorientExpression__Group_1_6__17946 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__2_in_rule__ReorientExpression__Group_1_6__17949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ReorientExpression__Group_1_6__1__Impl7977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__2__Impl_in_rule__ReorientExpression__Group_1_6__28008 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__3_in_rule__ReorientExpression__Group_1_6__28011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__AxisAssignment_1_6_2_in_rule__ReorientExpression__Group_1_6__2__Impl8038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__3__Impl_in_rule__ReorientExpression__Group_1_6__38068 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__4_in_rule__ReorientExpression__Group_1_6__38071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ReorientExpression__Group_1_6__3__Impl8099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__4__Impl_in_rule__ReorientExpression__Group_1_6__48130 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__5_in_rule__ReorientExpression__Group_1_6__48133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__ValueAssignment_1_6_4_in_rule__ReorientExpression__Group_1_6__4__Impl8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Group_1_6__5__Impl_in_rule__ReorientExpression__Group_1_6__58190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ReorientExpression__Group_1_6__5__Impl8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__08261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__08264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Constraint__Group__0__Impl8292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__18323 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__18326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__NameAssignment_1_in_rule__Constraint__Group__1__Impl8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__28383 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__28386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Constraint__Group__2__Impl8414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__38445 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__38448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__TypeAssignment_3_in_rule__Constraint__Group__3__Impl8475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4__Impl_in_rule__Constraint__Group__48505 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__48508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Constraint__Group__4__Impl8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5__Impl_in_rule__Constraint__Group__58567 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__58570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Body1Assignment_5_in_rule__Constraint__Group__5__Impl8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6__Impl_in_rule__Constraint__Group__68627 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__68630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__RelTrans1Assignment_6_in_rule__Constraint__Group__6__Impl8657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__7__Impl_in_rule__Constraint__Group__78687 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__8_in_rule__Constraint__Group__78690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Constraint__Group__7__Impl8718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__8__Impl_in_rule__Constraint__Group__88749 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__9_in_rule__Constraint__Group__88752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Body2Assignment_8_in_rule__Constraint__Group__8__Impl8779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__9__Impl_in_rule__Constraint__Group__98809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__RelTrans2Assignment_9_in_rule__Constraint__Group__9__Impl8836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__0__Impl_in_rule__ExternalLoad__Group__08886 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__1_in_rule__ExternalLoad__Group__08889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ExternalLoad__Group__0__Impl8917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__1__Impl_in_rule__ExternalLoad__Group__18948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__2_in_rule__ExternalLoad__Group__18951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ExternalLoad__Group__1__Impl8979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__2__Impl_in_rule__ExternalLoad__Group__29010 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__3_in_rule__ExternalLoad__Group__29013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__NameAssignment_2_in_rule__ExternalLoad__Group__2__Impl9040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__3__Impl_in_rule__ExternalLoad__Group__39070 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__4_in_rule__ExternalLoad__Group__39073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ExternalLoad__Group__3__Impl9101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__4__Impl_in_rule__ExternalLoad__Group__49132 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__5_in_rule__ExternalLoad__Group__49135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__TypeAssignment_4_in_rule__ExternalLoad__Group__4__Impl9162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__5__Impl_in_rule__ExternalLoad__Group__59192 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__6_in_rule__ExternalLoad__Group__59195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ExternalLoad__Group__5__Impl9223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__6__Impl_in_rule__ExternalLoad__Group__69254 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__7_in_rule__ExternalLoad__Group__69257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Body1Assignment_6_in_rule__ExternalLoad__Group__6__Impl9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__7__Impl_in_rule__ExternalLoad__Group__79314 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__8_in_rule__ExternalLoad__Group__79317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__RelTrans1Assignment_7_in_rule__ExternalLoad__Group__7__Impl9344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__8__Impl_in_rule__ExternalLoad__Group__89374 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__9_in_rule__ExternalLoad__Group__89377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExternalLoad__Group__8__Impl9405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__9__Impl_in_rule__ExternalLoad__Group__99436 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__10_in_rule__ExternalLoad__Group__99439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Body2Assignment_9_in_rule__ExternalLoad__Group__9__Impl9466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__10__Impl_in_rule__ExternalLoad__Group__109496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__RelTrans2Assignment_10_in_rule__ExternalLoad__Group__10__Impl9523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__0__Impl_in_rule__BaseMatrix__Group__09575 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__1_in_rule__BaseMatrix__Group__09578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_0__0_in_rule__BaseMatrix__Group__0__Impl9605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__1__Impl_in_rule__BaseMatrix__Group__19636 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__2_in_rule__BaseMatrix__Group__19639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__BaseMatrix__Group__1__Impl9667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__2__Impl_in_rule__BaseMatrix__Group__29698 = new BitSet(new long[]{0x0100400000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__3_in_rule__BaseMatrix__Group__29701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__ValuesAssignment_2_in_rule__BaseMatrix__Group__2__Impl9728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__3__Impl_in_rule__BaseMatrix__Group__39758 = new BitSet(new long[]{0x0100400000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__4_in_rule__BaseMatrix__Group__39761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_3__0_in_rule__BaseMatrix__Group__3__Impl9788 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__4__Impl_in_rule__BaseMatrix__Group__49819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__BaseMatrix__Group__4__Impl9847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_0__0__Impl_in_rule__BaseMatrix__Group_0__09888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_0__1_in_rule__BaseMatrix__Group_0__09891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__BaseMatrix__Group_0__0__Impl9919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_0__1__Impl_in_rule__BaseMatrix__Group_0__19950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__NameAssignment_0_1_in_rule__BaseMatrix__Group_0__1__Impl9977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_3__0__Impl_in_rule__BaseMatrix__Group_3__010011 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_3__1_in_rule__BaseMatrix__Group_3__010014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__BaseMatrix__Group_3__0__Impl10042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_3__1__Impl_in_rule__BaseMatrix__Group_3__110073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__ValuesAssignment_3_1_in_rule__BaseMatrix__Group_3__1__Impl10100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group__0__Impl_in_rule__AddExp__Group__010134 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__AddExp__Group__1_in_rule__AddExp__Group__010137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_rule__AddExp__Group__0__Impl10164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group__1__Impl_in_rule__AddExp__Group__110193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__0_in_rule__AddExp__Group__1__Impl10220 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__0__Impl_in_rule__AddExp__Group_1__010255 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__1_in_rule__AddExp__Group_1__010258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__1__Impl_in_rule__AddExp__Group_1__110316 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__2_in_rule__AddExp__Group_1__110319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__OpAssignment_1_1_in_rule__AddExp__Group_1__1__Impl10346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__2__Impl_in_rule__AddExp__Group_1__210376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__RightAssignment_1_2_in_rule__AddExp__Group_1__2__Impl10403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group__0__Impl_in_rule__MultExp__Group__010439 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__MultExp__Group__1_in_rule__MultExp__Group__010442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MultExp__Group__0__Impl10469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group__1__Impl_in_rule__MultExp__Group__110498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__0_in_rule__MultExp__Group__1__Impl10525 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__0__Impl_in_rule__MultExp__Group_1__010560 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__1_in_rule__MultExp__Group_1__010563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__1__Impl_in_rule__MultExp__Group_1__110621 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__2_in_rule__MultExp__Group_1__110624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__OpAssignment_1_1_in_rule__MultExp__Group_1__1__Impl10651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__2__Impl_in_rule__MultExp__Group_1__210681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__RightAssignment_1_2_in_rule__MultExp__Group_1__2__Impl10708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__010744 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__010747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Primary__Group_1__0__Impl10775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__110806 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__110809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__Primary__Group_1__1__Impl10836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__210865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Primary__Group_1__2__Impl10893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group__0__Impl_in_rule__ConstantOrFunctionCallExp__Group__010930 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group__1_in_rule__ConstantOrFunctionCallExp__Group__010933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__LabelAssignment_0_in_rule__ConstantOrFunctionCallExp__Group__0__Impl10960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group__1__Impl_in_rule__ConstantOrFunctionCallExp__Group__110990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__0_in_rule__ConstantOrFunctionCallExp__Group__1__Impl11017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__0__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__011052 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__1_in_rule__ConstantOrFunctionCallExp__Group_1__011055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ConstantOrFunctionCallExp__Group_1__0__Impl11083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__1__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__111114 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__2_in_rule__ConstantOrFunctionCallExp__Group_1__111117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__ParamAssignment_1_1_in_rule__ConstantOrFunctionCallExp__Group_1__1__Impl11144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__2__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__211174 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__3_in_rule__ConstantOrFunctionCallExp__Group_1__211177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__0_in_rule__ConstantOrFunctionCallExp__Group_1__2__Impl11204 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__3__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__311235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ConstantOrFunctionCallExp__Group_1__3__Impl11263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl_in_rule__ConstantOrFunctionCallExp__Group_1_2__011302 = new BitSet(new long[]{0x0000100000002030L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__1_in_rule__ConstantOrFunctionCallExp__Group_1_2__011305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl11333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl_in_rule__ConstantOrFunctionCallExp__Group_1_2__111364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1_in_rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl11391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__0__Impl_in_rule__NumberLiteral__Group__011425 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__1_in_rule__NumberLiteral__Group__011428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__NegAssignment_0_in_rule__NumberLiteral__Group__0__Impl11455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__1__Impl_in_rule__NumberLiteral__Group__111486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__ValueAssignment_1_in_rule__NumberLiteral__Group__1__Impl11513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialDefinition_in_rule__Model__DefsAssignment_011552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_rule__Model__WorldAssignment_111583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Model__BodiesAssignment_211614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Environment__GravityAssignment_311645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__NameAssignment_111676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemElement_in_rule__System__ElementsAssignment_311707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__NameAssignment_111738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_rule__Body__MassAssignment_311769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__BodyReference__BaseAssignment_011805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyReference__RefAssignment_111848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__Mass__ValueAssignment_311883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Mass__PositionAssignment_511914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Mass__InertiaAssignment_711945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Joint__NameAssignment_111976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_rule__Joint__TypeAssignment_312007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Joint__IsStartAssignment_412043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_rule__Joint__Body1Assignment_612082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__Joint__RelTrans1Assignment_712113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_rule__Joint__Body2Assignment_912144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__Joint__RelTrans2Assignment_1012175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__Joint__SpringCoeffAssignment_1412206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__Joint__SpringInitAssignment_1612237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__Joint__DampViscousAssignment_1812268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__Joint__DampCoulombAssignment_2012299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JointType__NameAssignment_0_212330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointTypeExpression_in_rule__JointType__ExpAssignment_112361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JointTypeExpression__RefAssignment_012396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_1_212431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_1_3_112462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_2_212493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__JointTypeExpression__AxisAssignment_2_3_112524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__RelativeTransformation__PositionAssignment_412555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientation_in_rule__RelativeTransformation__ReorientAssignment_612586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reorientation__NameAssignment_0_112617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientExpression_in_rule__Reorientation__ExpAssignment_112648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReorientExpression__RefAssignment_012683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__ReorientExpression__AxisAssignment_1_212718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__ReorientExpression__ValueAssignment_1_412749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__ReorientExpression__AxisAssignment_1_6_212780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__ReorientExpression__ValueAssignment_1_6_412811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constraint__NameAssignment_112842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintType_in_rule__Constraint__TypeAssignment_312873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_rule__Constraint__Body1Assignment_512904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__Constraint__RelTrans1Assignment_612935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_rule__Constraint__Body2Assignment_812966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__Constraint__RelTrans2Assignment_912997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalLoad__NameAssignment_213028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadType_in_rule__ExternalLoad__TypeAssignment_413059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_rule__ExternalLoad__Body1Assignment_613090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__ExternalLoad__RelTrans1Assignment_713121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_rule__ExternalLoad__Body2Assignment_913152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__ExternalLoad__RelTrans2Assignment_1013183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BaseMatrix__NameAssignment_0_113214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__BaseMatrix__ValuesAssignment_213245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__BaseMatrix__ValuesAssignment_3_113276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MatrixRef__MatrixAssignment13311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__OpAlternatives_1_1_0_in_rule__AddExp__OpAssignment_1_113346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_rule__AddExp__RightAssignment_1_213379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__OpAlternatives_1_1_0_in_rule__MultExp__OpAssignment_1_113410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MultExp__RightAssignment_1_213443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantOrFunctionCallExp__LabelAssignment_013474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__ConstantOrFunctionCallExp__ParamAssignment_1_113505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_113536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NumberLiteral__NegAssignment_013572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__NumberLiteral__ValueAssignment_113611 = new BitSet(new long[]{0x0000000000000002L});

}