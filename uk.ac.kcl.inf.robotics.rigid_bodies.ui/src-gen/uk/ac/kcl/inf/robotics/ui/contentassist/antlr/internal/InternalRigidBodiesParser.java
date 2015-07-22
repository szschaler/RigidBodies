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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'x'", "'y'", "'z'", "'geometrical'", "'velocity'", "'force'", "'torque'", "'world'", "'{'", "'gravity'", "'}'", "'system'", "'body'", "'mass'", "'value'", "'position'", "'inertia'", "'joint'", "':'", "'between'", "'and'", "'type'", "'with'", "'revolute'", "'planar'", "'springCoeff'", "'springInit'", "'dampViscous'", "'dampCoulomb'", "'stiffness'", "'('", "'relative'", "'transformation'", "','", "')'", "'reorient'", "'constraint'", "'external'", "'load'", "'at'", "'['", "']'", "'matrix'", "'base'", "'start'"
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


    // $ANTLR start "entryRuleConnective"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:200:1: entryRuleConnective : ruleConnective EOF ;
    public final void entryRuleConnective() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:201:1: ( ruleConnective EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:202:1: ruleConnective EOF
            {
             before(grammarAccess.getConnectiveRule()); 
            pushFollow(FOLLOW_ruleConnective_in_entryRuleConnective361);
            ruleConnective();

            state._fsp--;

             after(grammarAccess.getConnectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnective368); 

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
    // $ANTLR end "entryRuleConnective"


    // $ANTLR start "ruleConnective"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:209:1: ruleConnective : ( ( rule__Connective__Alternatives ) ) ;
    public final void ruleConnective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:213:2: ( ( ( rule__Connective__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:214:1: ( ( rule__Connective__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:214:1: ( ( rule__Connective__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:215:1: ( rule__Connective__Alternatives )
            {
             before(grammarAccess.getConnectiveAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:216:1: ( rule__Connective__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:216:2: rule__Connective__Alternatives
            {
            pushFollow(FOLLOW_rule__Connective__Alternatives_in_ruleConnective394);
            rule__Connective__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConnectiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnective"


    // $ANTLR start "entryRuleBody"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:228:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:229:1: ( ruleBody EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:230:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody421);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody428); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:237:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:241:2: ( ( ( rule__Body__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:242:1: ( ( rule__Body__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:242:1: ( ( rule__Body__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:243:1: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:244:1: ( rule__Body__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:244:2: rule__Body__Group__0
            {
            pushFollow(FOLLOW_rule__Body__Group__0_in_ruleBody454);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:256:1: entryRuleBodyReference : ruleBodyReference EOF ;
    public final void entryRuleBodyReference() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:257:1: ( ruleBodyReference EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:258:1: ruleBodyReference EOF
            {
             before(grammarAccess.getBodyReferenceRule()); 
            pushFollow(FOLLOW_ruleBodyReference_in_entryRuleBodyReference481);
            ruleBodyReference();

            state._fsp--;

             after(grammarAccess.getBodyReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyReference488); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:265:1: ruleBodyReference : ( ( rule__BodyReference__Alternatives ) ) ;
    public final void ruleBodyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:269:2: ( ( ( rule__BodyReference__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:270:1: ( ( rule__BodyReference__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:270:1: ( ( rule__BodyReference__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:271:1: ( rule__BodyReference__Alternatives )
            {
             before(grammarAccess.getBodyReferenceAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:272:1: ( rule__BodyReference__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:272:2: rule__BodyReference__Alternatives
            {
            pushFollow(FOLLOW_rule__BodyReference__Alternatives_in_ruleBodyReference514);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:284:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:285:1: ( ruleMass EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:286:1: ruleMass EOF
            {
             before(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_ruleMass_in_entryRuleMass541);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getMassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMass548); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:293:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:297:2: ( ( ( rule__Mass__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:298:1: ( ( rule__Mass__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:298:1: ( ( rule__Mass__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:299:1: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:300:1: ( rule__Mass__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:300:2: rule__Mass__Group__0
            {
            pushFollow(FOLLOW_rule__Mass__Group__0_in_ruleMass574);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:312:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:313:1: ( ruleJoint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:314:1: ruleJoint EOF
            {
             before(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_ruleJoint_in_entryRuleJoint601);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getJointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoint608); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:321:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:325:2: ( ( ( rule__Joint__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:326:1: ( ( rule__Joint__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:326:1: ( ( rule__Joint__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:327:1: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:328:1: ( rule__Joint__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:328:2: rule__Joint__Group__0
            {
            pushFollow(FOLLOW_rule__Joint__Group__0_in_ruleJoint634);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:340:1: entryRuleJointType : ruleJointType EOF ;
    public final void entryRuleJointType() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:341:1: ( ruleJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:342:1: ruleJointType EOF
            {
             before(grammarAccess.getJointTypeRule()); 
            pushFollow(FOLLOW_ruleJointType_in_entryRuleJointType661);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointType668); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:349:1: ruleJointType : ( ( rule__JointType__Group__0 ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:353:2: ( ( ( rule__JointType__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:354:1: ( ( rule__JointType__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:354:1: ( ( rule__JointType__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:355:1: ( rule__JointType__Group__0 )
            {
             before(grammarAccess.getJointTypeAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:356:1: ( rule__JointType__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:356:2: rule__JointType__Group__0
            {
            pushFollow(FOLLOW_rule__JointType__Group__0_in_ruleJointType694);
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


    // $ANTLR start "entryRuleAdditiveJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:368:1: entryRuleAdditiveJointType : ruleAdditiveJointType EOF ;
    public final void entryRuleAdditiveJointType() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:369:1: ( ruleAdditiveJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:370:1: ruleAdditiveJointType EOF
            {
             before(grammarAccess.getAdditiveJointTypeRule()); 
            pushFollow(FOLLOW_ruleAdditiveJointType_in_entryRuleAdditiveJointType721);
            ruleAdditiveJointType();

            state._fsp--;

             after(grammarAccess.getAdditiveJointTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveJointType728); 

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
    // $ANTLR end "entryRuleAdditiveJointType"


    // $ANTLR start "ruleAdditiveJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:377:1: ruleAdditiveJointType : ( ( rule__AdditiveJointType__Group__0 ) ) ;
    public final void ruleAdditiveJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:381:2: ( ( ( rule__AdditiveJointType__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:382:1: ( ( rule__AdditiveJointType__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:382:1: ( ( rule__AdditiveJointType__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:383:1: ( rule__AdditiveJointType__Group__0 )
            {
             before(grammarAccess.getAdditiveJointTypeAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:384:1: ( rule__AdditiveJointType__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:384:2: rule__AdditiveJointType__Group__0
            {
            pushFollow(FOLLOW_rule__AdditiveJointType__Group__0_in_ruleAdditiveJointType754);
            rule__AdditiveJointType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveJointTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveJointType"


    // $ANTLR start "entryRulePrimaryJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:396:1: entryRulePrimaryJointType : rulePrimaryJointType EOF ;
    public final void entryRulePrimaryJointType() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:397:1: ( rulePrimaryJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:398:1: rulePrimaryJointType EOF
            {
             before(grammarAccess.getPrimaryJointTypeRule()); 
            pushFollow(FOLLOW_rulePrimaryJointType_in_entryRulePrimaryJointType781);
            rulePrimaryJointType();

            state._fsp--;

             after(grammarAccess.getPrimaryJointTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryJointType788); 

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
    // $ANTLR end "entryRulePrimaryJointType"


    // $ANTLR start "rulePrimaryJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:405:1: rulePrimaryJointType : ( ( rule__PrimaryJointType__Alternatives ) ) ;
    public final void rulePrimaryJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:409:2: ( ( ( rule__PrimaryJointType__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:410:1: ( ( rule__PrimaryJointType__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:410:1: ( ( rule__PrimaryJointType__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:411:1: ( rule__PrimaryJointType__Alternatives )
            {
             before(grammarAccess.getPrimaryJointTypeAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:412:1: ( rule__PrimaryJointType__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:412:2: rule__PrimaryJointType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryJointType__Alternatives_in_rulePrimaryJointType814);
            rule__PrimaryJointType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryJointTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryJointType"


    // $ANTLR start "entryRuleJointTypeReference"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:424:1: entryRuleJointTypeReference : ruleJointTypeReference EOF ;
    public final void entryRuleJointTypeReference() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:425:1: ( ruleJointTypeReference EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:426:1: ruleJointTypeReference EOF
            {
             before(grammarAccess.getJointTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleJointTypeReference_in_entryRuleJointTypeReference841);
            ruleJointTypeReference();

            state._fsp--;

             after(grammarAccess.getJointTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointTypeReference848); 

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
    // $ANTLR end "entryRuleJointTypeReference"


    // $ANTLR start "ruleJointTypeReference"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:433:1: ruleJointTypeReference : ( ( rule__JointTypeReference__RefAssignment ) ) ;
    public final void ruleJointTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:437:2: ( ( ( rule__JointTypeReference__RefAssignment ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:438:1: ( ( rule__JointTypeReference__RefAssignment ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:438:1: ( ( rule__JointTypeReference__RefAssignment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:439:1: ( rule__JointTypeReference__RefAssignment )
            {
             before(grammarAccess.getJointTypeReferenceAccess().getRefAssignment()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:440:1: ( rule__JointTypeReference__RefAssignment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:440:2: rule__JointTypeReference__RefAssignment
            {
            pushFollow(FOLLOW_rule__JointTypeReference__RefAssignment_in_ruleJointTypeReference874);
            rule__JointTypeReference__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeReferenceAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJointTypeReference"


    // $ANTLR start "entryRuleBasicJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:452:1: entryRuleBasicJointType : ruleBasicJointType EOF ;
    public final void entryRuleBasicJointType() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:453:1: ( ruleBasicJointType EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:454:1: ruleBasicJointType EOF
            {
             before(grammarAccess.getBasicJointTypeRule()); 
            pushFollow(FOLLOW_ruleBasicJointType_in_entryRuleBasicJointType901);
            ruleBasicJointType();

            state._fsp--;

             after(grammarAccess.getBasicJointTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicJointType908); 

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
    // $ANTLR end "entryRuleBasicJointType"


    // $ANTLR start "ruleBasicJointType"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:461:1: ruleBasicJointType : ( ( rule__BasicJointType__Group__0 ) ) ;
    public final void ruleBasicJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:465:2: ( ( ( rule__BasicJointType__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:466:1: ( ( rule__BasicJointType__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:466:1: ( ( rule__BasicJointType__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:467:1: ( rule__BasicJointType__Group__0 )
            {
             before(grammarAccess.getBasicJointTypeAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:468:1: ( rule__BasicJointType__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:468:2: rule__BasicJointType__Group__0
            {
            pushFollow(FOLLOW_rule__BasicJointType__Group__0_in_ruleBasicJointType934);
            rule__BasicJointType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicJointTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicJointType"


    // $ANTLR start "entryRuleJointMovement"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:480:1: entryRuleJointMovement : ruleJointMovement EOF ;
    public final void entryRuleJointMovement() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:481:1: ( ruleJointMovement EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:482:1: ruleJointMovement EOF
            {
             before(grammarAccess.getJointMovementRule()); 
            pushFollow(FOLLOW_ruleJointMovement_in_entryRuleJointMovement961);
            ruleJointMovement();

            state._fsp--;

             after(grammarAccess.getJointMovementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJointMovement968); 

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
    // $ANTLR end "entryRuleJointMovement"


    // $ANTLR start "ruleJointMovement"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:489:1: ruleJointMovement : ( ( rule__JointMovement__Alternatives ) ) ;
    public final void ruleJointMovement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:493:2: ( ( ( rule__JointMovement__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:494:1: ( ( rule__JointMovement__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:494:1: ( ( rule__JointMovement__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:495:1: ( rule__JointMovement__Alternatives )
            {
             before(grammarAccess.getJointMovementAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:496:1: ( rule__JointMovement__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:496:2: rule__JointMovement__Alternatives
            {
            pushFollow(FOLLOW_rule__JointMovement__Alternatives_in_ruleJointMovement994);
            rule__JointMovement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJointMovementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJointMovement"


    // $ANTLR start "entryRuleRevolute"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:508:1: entryRuleRevolute : ruleRevolute EOF ;
    public final void entryRuleRevolute() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:509:1: ( ruleRevolute EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:510:1: ruleRevolute EOF
            {
             before(grammarAccess.getRevoluteRule()); 
            pushFollow(FOLLOW_ruleRevolute_in_entryRuleRevolute1021);
            ruleRevolute();

            state._fsp--;

             after(grammarAccess.getRevoluteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRevolute1028); 

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
    // $ANTLR end "entryRuleRevolute"


    // $ANTLR start "ruleRevolute"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:517:1: ruleRevolute : ( ( rule__Revolute__Group__0 ) ) ;
    public final void ruleRevolute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:521:2: ( ( ( rule__Revolute__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:522:1: ( ( rule__Revolute__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:522:1: ( ( rule__Revolute__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:523:1: ( rule__Revolute__Group__0 )
            {
             before(grammarAccess.getRevoluteAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:524:1: ( rule__Revolute__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:524:2: rule__Revolute__Group__0
            {
            pushFollow(FOLLOW_rule__Revolute__Group__0_in_ruleRevolute1054);
            rule__Revolute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRevoluteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRevolute"


    // $ANTLR start "entryRulePlanar"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:536:1: entryRulePlanar : rulePlanar EOF ;
    public final void entryRulePlanar() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:537:1: ( rulePlanar EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:538:1: rulePlanar EOF
            {
             before(grammarAccess.getPlanarRule()); 
            pushFollow(FOLLOW_rulePlanar_in_entryRulePlanar1081);
            rulePlanar();

            state._fsp--;

             after(grammarAccess.getPlanarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanar1088); 

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
    // $ANTLR end "entryRulePlanar"


    // $ANTLR start "rulePlanar"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:545:1: rulePlanar : ( ( rule__Planar__Group__0 ) ) ;
    public final void rulePlanar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:549:2: ( ( ( rule__Planar__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:550:1: ( ( rule__Planar__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:550:1: ( ( rule__Planar__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:551:1: ( rule__Planar__Group__0 )
            {
             before(grammarAccess.getPlanarAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:552:1: ( rule__Planar__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:552:2: rule__Planar__Group__0
            {
            pushFollow(FOLLOW_rule__Planar__Group__0_in_rulePlanar1114);
            rule__Planar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlanarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlanar"


    // $ANTLR start "entryRuleStiffnessExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:564:1: entryRuleStiffnessExp : ruleStiffnessExp EOF ;
    public final void entryRuleStiffnessExp() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:565:1: ( ruleStiffnessExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:566:1: ruleStiffnessExp EOF
            {
             before(grammarAccess.getStiffnessExpRule()); 
            pushFollow(FOLLOW_ruleStiffnessExp_in_entryRuleStiffnessExp1141);
            ruleStiffnessExp();

            state._fsp--;

             after(grammarAccess.getStiffnessExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStiffnessExp1148); 

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
    // $ANTLR end "entryRuleStiffnessExp"


    // $ANTLR start "ruleStiffnessExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:573:1: ruleStiffnessExp : ( ( rule__StiffnessExp__Alternatives ) ) ;
    public final void ruleStiffnessExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:577:2: ( ( ( rule__StiffnessExp__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:578:1: ( ( rule__StiffnessExp__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:578:1: ( ( rule__StiffnessExp__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:579:1: ( rule__StiffnessExp__Alternatives )
            {
             before(grammarAccess.getStiffnessExpAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:580:1: ( rule__StiffnessExp__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:580:2: rule__StiffnessExp__Alternatives
            {
            pushFollow(FOLLOW_rule__StiffnessExp__Alternatives_in_ruleStiffnessExp1174);
            rule__StiffnessExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStiffnessExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStiffnessExp"


    // $ANTLR start "entryRuleStiffnessRef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:592:1: entryRuleStiffnessRef : ruleStiffnessRef EOF ;
    public final void entryRuleStiffnessRef() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:593:1: ( ruleStiffnessRef EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:594:1: ruleStiffnessRef EOF
            {
             before(grammarAccess.getStiffnessRefRule()); 
            pushFollow(FOLLOW_ruleStiffnessRef_in_entryRuleStiffnessRef1201);
            ruleStiffnessRef();

            state._fsp--;

             after(grammarAccess.getStiffnessRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStiffnessRef1208); 

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
    // $ANTLR end "entryRuleStiffnessRef"


    // $ANTLR start "ruleStiffnessRef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:601:1: ruleStiffnessRef : ( ( rule__StiffnessRef__RefAssignment ) ) ;
    public final void ruleStiffnessRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:605:2: ( ( ( rule__StiffnessRef__RefAssignment ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:606:1: ( ( rule__StiffnessRef__RefAssignment ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:606:1: ( ( rule__StiffnessRef__RefAssignment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:607:1: ( rule__StiffnessRef__RefAssignment )
            {
             before(grammarAccess.getStiffnessRefAccess().getRefAssignment()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:608:1: ( rule__StiffnessRef__RefAssignment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:608:2: rule__StiffnessRef__RefAssignment
            {
            pushFollow(FOLLOW_rule__StiffnessRef__RefAssignment_in_ruleStiffnessRef1234);
            rule__StiffnessRef__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStiffnessRefAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStiffnessRef"


    // $ANTLR start "entryRuleBaseStiffnessExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:620:1: entryRuleBaseStiffnessExp : ruleBaseStiffnessExp EOF ;
    public final void entryRuleBaseStiffnessExp() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:621:1: ( ruleBaseStiffnessExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:622:1: ruleBaseStiffnessExp EOF
            {
             before(grammarAccess.getBaseStiffnessExpRule()); 
            pushFollow(FOLLOW_ruleBaseStiffnessExp_in_entryRuleBaseStiffnessExp1261);
            ruleBaseStiffnessExp();

            state._fsp--;

             after(grammarAccess.getBaseStiffnessExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseStiffnessExp1268); 

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
    // $ANTLR end "entryRuleBaseStiffnessExp"


    // $ANTLR start "ruleBaseStiffnessExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:629:1: ruleBaseStiffnessExp : ( ( rule__BaseStiffnessExp__Group__0 ) ) ;
    public final void ruleBaseStiffnessExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:633:2: ( ( ( rule__BaseStiffnessExp__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:634:1: ( ( rule__BaseStiffnessExp__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:634:1: ( ( rule__BaseStiffnessExp__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:635:1: ( rule__BaseStiffnessExp__Group__0 )
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:636:1: ( rule__BaseStiffnessExp__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:636:2: rule__BaseStiffnessExp__Group__0
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__0_in_ruleBaseStiffnessExp1294);
            rule__BaseStiffnessExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseStiffnessExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseStiffnessExp"


    // $ANTLR start "entryRuleRelativeTransformation"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:648:1: entryRuleRelativeTransformation : ruleRelativeTransformation EOF ;
    public final void entryRuleRelativeTransformation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:649:1: ( ruleRelativeTransformation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:650:1: ruleRelativeTransformation EOF
            {
             before(grammarAccess.getRelativeTransformationRule()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_entryRuleRelativeTransformation1321);
            ruleRelativeTransformation();

            state._fsp--;

             after(grammarAccess.getRelativeTransformationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativeTransformation1328); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:657:1: ruleRelativeTransformation : ( ( rule__RelativeTransformation__Group__0 ) ) ;
    public final void ruleRelativeTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:661:2: ( ( ( rule__RelativeTransformation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:662:1: ( ( rule__RelativeTransformation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:662:1: ( ( rule__RelativeTransformation__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:663:1: ( rule__RelativeTransformation__Group__0 )
            {
             before(grammarAccess.getRelativeTransformationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:664:1: ( rule__RelativeTransformation__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:664:2: rule__RelativeTransformation__Group__0
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__0_in_ruleRelativeTransformation1354);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:676:1: entryRuleReorientation : ruleReorientation EOF ;
    public final void entryRuleReorientation() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:677:1: ( ruleReorientation EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:678:1: ruleReorientation EOF
            {
             before(grammarAccess.getReorientationRule()); 
            pushFollow(FOLLOW_ruleReorientation_in_entryRuleReorientation1381);
            ruleReorientation();

            state._fsp--;

             after(grammarAccess.getReorientationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientation1388); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:685:1: ruleReorientation : ( ( rule__Reorientation__Group__0 ) ) ;
    public final void ruleReorientation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:689:2: ( ( ( rule__Reorientation__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:690:1: ( ( rule__Reorientation__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:690:1: ( ( rule__Reorientation__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:691:1: ( rule__Reorientation__Group__0 )
            {
             before(grammarAccess.getReorientationAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:692:1: ( rule__Reorientation__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:692:2: rule__Reorientation__Group__0
            {
            pushFollow(FOLLOW_rule__Reorientation__Group__0_in_ruleReorientation1414);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:704:1: entryRuleReorientExpression : ruleReorientExpression EOF ;
    public final void entryRuleReorientExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:705:1: ( ruleReorientExpression EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:706:1: ruleReorientExpression EOF
            {
             before(grammarAccess.getReorientExpressionRule()); 
            pushFollow(FOLLOW_ruleReorientExpression_in_entryRuleReorientExpression1441);
            ruleReorientExpression();

            state._fsp--;

             after(grammarAccess.getReorientExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientExpression1448); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:713:1: ruleReorientExpression : ( ( rule__ReorientExpression__Alternatives ) ) ;
    public final void ruleReorientExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:717:2: ( ( ( rule__ReorientExpression__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:718:1: ( ( rule__ReorientExpression__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:718:1: ( ( rule__ReorientExpression__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:719:1: ( rule__ReorientExpression__Alternatives )
            {
             before(grammarAccess.getReorientExpressionAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:720:1: ( rule__ReorientExpression__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:720:2: rule__ReorientExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ReorientExpression__Alternatives_in_ruleReorientExpression1474);
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


    // $ANTLR start "entryRuleReorientRef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:732:1: entryRuleReorientRef : ruleReorientRef EOF ;
    public final void entryRuleReorientRef() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:733:1: ( ruleReorientRef EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:734:1: ruleReorientRef EOF
            {
             before(grammarAccess.getReorientRefRule()); 
            pushFollow(FOLLOW_ruleReorientRef_in_entryRuleReorientRef1501);
            ruleReorientRef();

            state._fsp--;

             after(grammarAccess.getReorientRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReorientRef1508); 

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
    // $ANTLR end "entryRuleReorientRef"


    // $ANTLR start "ruleReorientRef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:741:1: ruleReorientRef : ( ( rule__ReorientRef__RefAssignment ) ) ;
    public final void ruleReorientRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:745:2: ( ( ( rule__ReorientRef__RefAssignment ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:746:1: ( ( rule__ReorientRef__RefAssignment ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:746:1: ( ( rule__ReorientRef__RefAssignment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:747:1: ( rule__ReorientRef__RefAssignment )
            {
             before(grammarAccess.getReorientRefAccess().getRefAssignment()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:748:1: ( rule__ReorientRef__RefAssignment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:748:2: rule__ReorientRef__RefAssignment
            {
            pushFollow(FOLLOW_rule__ReorientRef__RefAssignment_in_ruleReorientRef1534);
            rule__ReorientRef__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReorientRefAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReorientRef"


    // $ANTLR start "entryRuleBasicReorientExpression"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:760:1: entryRuleBasicReorientExpression : ruleBasicReorientExpression EOF ;
    public final void entryRuleBasicReorientExpression() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:761:1: ( ruleBasicReorientExpression EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:762:1: ruleBasicReorientExpression EOF
            {
             before(grammarAccess.getBasicReorientExpressionRule()); 
            pushFollow(FOLLOW_ruleBasicReorientExpression_in_entryRuleBasicReorientExpression1561);
            ruleBasicReorientExpression();

            state._fsp--;

             after(grammarAccess.getBasicReorientExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicReorientExpression1568); 

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
    // $ANTLR end "entryRuleBasicReorientExpression"


    // $ANTLR start "ruleBasicReorientExpression"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:769:1: ruleBasicReorientExpression : ( ( rule__BasicReorientExpression__Group__0 ) ) ;
    public final void ruleBasicReorientExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:773:2: ( ( ( rule__BasicReorientExpression__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:774:1: ( ( rule__BasicReorientExpression__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:774:1: ( ( rule__BasicReorientExpression__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:775:1: ( rule__BasicReorientExpression__Group__0 )
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:776:1: ( rule__BasicReorientExpression__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:776:2: rule__BasicReorientExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group__0_in_ruleBasicReorientExpression1594);
            rule__BasicReorientExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicReorientExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicReorientExpression"


    // $ANTLR start "entryRuleConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:788:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:789:1: ( ruleConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:790:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1621);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1628); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:797:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:801:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:802:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:802:1: ( ( rule__Constraint__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:803:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:804:1: ( rule__Constraint__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:804:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint1654);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:816:1: entryRuleExternalLoad : ruleExternalLoad EOF ;
    public final void entryRuleExternalLoad() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:817:1: ( ruleExternalLoad EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:818:1: ruleExternalLoad EOF
            {
             before(grammarAccess.getExternalLoadRule()); 
            pushFollow(FOLLOW_ruleExternalLoad_in_entryRuleExternalLoad1681);
            ruleExternalLoad();

            state._fsp--;

             after(grammarAccess.getExternalLoadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalLoad1688); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:825:1: ruleExternalLoad : ( ( rule__ExternalLoad__Group__0 ) ) ;
    public final void ruleExternalLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:829:2: ( ( ( rule__ExternalLoad__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:830:1: ( ( rule__ExternalLoad__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:830:1: ( ( rule__ExternalLoad__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:831:1: ( rule__ExternalLoad__Group__0 )
            {
             before(grammarAccess.getExternalLoadAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:832:1: ( rule__ExternalLoad__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:832:2: rule__ExternalLoad__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__0_in_ruleExternalLoad1714);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:844:1: entryRuleMatrix : ruleMatrix EOF ;
    public final void entryRuleMatrix() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:845:1: ( ruleMatrix EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:846:1: ruleMatrix EOF
            {
             before(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_ruleMatrix_in_entryRuleMatrix1741);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getMatrixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix1748); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:853:1: ruleMatrix : ( ( rule__Matrix__Alternatives ) ) ;
    public final void ruleMatrix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:857:2: ( ( ( rule__Matrix__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:858:1: ( ( rule__Matrix__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:858:1: ( ( rule__Matrix__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:859:1: ( rule__Matrix__Alternatives )
            {
             before(grammarAccess.getMatrixAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:860:1: ( rule__Matrix__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:860:2: rule__Matrix__Alternatives
            {
            pushFollow(FOLLOW_rule__Matrix__Alternatives_in_ruleMatrix1774);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:872:1: entryRuleBaseMatrix : ruleBaseMatrix EOF ;
    public final void entryRuleBaseMatrix() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:873:1: ( ruleBaseMatrix EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:874:1: ruleBaseMatrix EOF
            {
             before(grammarAccess.getBaseMatrixRule()); 
            pushFollow(FOLLOW_ruleBaseMatrix_in_entryRuleBaseMatrix1801);
            ruleBaseMatrix();

            state._fsp--;

             after(grammarAccess.getBaseMatrixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseMatrix1808); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:881:1: ruleBaseMatrix : ( ( rule__BaseMatrix__Group__0 ) ) ;
    public final void ruleBaseMatrix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:885:2: ( ( ( rule__BaseMatrix__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:886:1: ( ( rule__BaseMatrix__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:886:1: ( ( rule__BaseMatrix__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:887:1: ( rule__BaseMatrix__Group__0 )
            {
             before(grammarAccess.getBaseMatrixAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:888:1: ( rule__BaseMatrix__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:888:2: rule__BaseMatrix__Group__0
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__0_in_ruleBaseMatrix1834);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:900:1: entryRuleMatrixRef : ruleMatrixRef EOF ;
    public final void entryRuleMatrixRef() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:901:1: ( ruleMatrixRef EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:902:1: ruleMatrixRef EOF
            {
             before(grammarAccess.getMatrixRefRule()); 
            pushFollow(FOLLOW_ruleMatrixRef_in_entryRuleMatrixRef1861);
            ruleMatrixRef();

            state._fsp--;

             after(grammarAccess.getMatrixRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrixRef1868); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:909:1: ruleMatrixRef : ( ( rule__MatrixRef__MatrixAssignment ) ) ;
    public final void ruleMatrixRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:913:2: ( ( ( rule__MatrixRef__MatrixAssignment ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:914:1: ( ( rule__MatrixRef__MatrixAssignment ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:914:1: ( ( rule__MatrixRef__MatrixAssignment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:915:1: ( rule__MatrixRef__MatrixAssignment )
            {
             before(grammarAccess.getMatrixRefAccess().getMatrixAssignment()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:916:1: ( rule__MatrixRef__MatrixAssignment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:916:2: rule__MatrixRef__MatrixAssignment
            {
            pushFollow(FOLLOW_rule__MatrixRef__MatrixAssignment_in_ruleMatrixRef1894);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:928:1: entryRuleAddExp : ruleAddExp EOF ;
    public final void entryRuleAddExp() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:929:1: ( ruleAddExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:930:1: ruleAddExp EOF
            {
             before(grammarAccess.getAddExpRule()); 
            pushFollow(FOLLOW_ruleAddExp_in_entryRuleAddExp1921);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getAddExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExp1928); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:937:1: ruleAddExp : ( ( rule__AddExp__Group__0 ) ) ;
    public final void ruleAddExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:941:2: ( ( ( rule__AddExp__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:942:1: ( ( rule__AddExp__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:942:1: ( ( rule__AddExp__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:943:1: ( rule__AddExp__Group__0 )
            {
             before(grammarAccess.getAddExpAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:944:1: ( rule__AddExp__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:944:2: rule__AddExp__Group__0
            {
            pushFollow(FOLLOW_rule__AddExp__Group__0_in_ruleAddExp1954);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:956:1: entryRuleMultExp : ruleMultExp EOF ;
    public final void entryRuleMultExp() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:957:1: ( ruleMultExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:958:1: ruleMultExp EOF
            {
             before(grammarAccess.getMultExpRule()); 
            pushFollow(FOLLOW_ruleMultExp_in_entryRuleMultExp1981);
            ruleMultExp();

            state._fsp--;

             after(grammarAccess.getMultExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExp1988); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:965:1: ruleMultExp : ( ( rule__MultExp__Group__0 ) ) ;
    public final void ruleMultExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:969:2: ( ( ( rule__MultExp__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:970:1: ( ( rule__MultExp__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:970:1: ( ( rule__MultExp__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:971:1: ( rule__MultExp__Group__0 )
            {
             before(grammarAccess.getMultExpAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:972:1: ( rule__MultExp__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:972:2: rule__MultExp__Group__0
            {
            pushFollow(FOLLOW_rule__MultExp__Group__0_in_ruleMultExp2014);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:984:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:985:1: ( rulePrimary EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:986:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary2041);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary2048); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:993:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:997:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:998:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:998:1: ( ( rule__Primary__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:999:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1000:1: ( rule__Primary__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1000:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary2074);
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


    // $ANTLR start "entryRuleParenthesisedExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1012:1: entryRuleParenthesisedExp : ruleParenthesisedExp EOF ;
    public final void entryRuleParenthesisedExp() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1013:1: ( ruleParenthesisedExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1014:1: ruleParenthesisedExp EOF
            {
             before(grammarAccess.getParenthesisedExpRule()); 
            pushFollow(FOLLOW_ruleParenthesisedExp_in_entryRuleParenthesisedExp2101);
            ruleParenthesisedExp();

            state._fsp--;

             after(grammarAccess.getParenthesisedExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisedExp2108); 

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
    // $ANTLR end "entryRuleParenthesisedExp"


    // $ANTLR start "ruleParenthesisedExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1021:1: ruleParenthesisedExp : ( ( rule__ParenthesisedExp__Group__0 ) ) ;
    public final void ruleParenthesisedExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1025:2: ( ( ( rule__ParenthesisedExp__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1026:1: ( ( rule__ParenthesisedExp__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1026:1: ( ( rule__ParenthesisedExp__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1027:1: ( rule__ParenthesisedExp__Group__0 )
            {
             before(grammarAccess.getParenthesisedExpAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1028:1: ( rule__ParenthesisedExp__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1028:2: rule__ParenthesisedExp__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesisedExp__Group__0_in_ruleParenthesisedExp2134);
            rule__ParenthesisedExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisedExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesisedExp"


    // $ANTLR start "entryRuleConstantOrFunctionCallExp"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1040:1: entryRuleConstantOrFunctionCallExp : ruleConstantOrFunctionCallExp EOF ;
    public final void entryRuleConstantOrFunctionCallExp() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1041:1: ( ruleConstantOrFunctionCallExp EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1042:1: ruleConstantOrFunctionCallExp EOF
            {
             before(grammarAccess.getConstantOrFunctionCallExpRule()); 
            pushFollow(FOLLOW_ruleConstantOrFunctionCallExp_in_entryRuleConstantOrFunctionCallExp2161);
            ruleConstantOrFunctionCallExp();

            state._fsp--;

             after(grammarAccess.getConstantOrFunctionCallExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantOrFunctionCallExp2168); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1049:1: ruleConstantOrFunctionCallExp : ( ( rule__ConstantOrFunctionCallExp__Group__0 ) ) ;
    public final void ruleConstantOrFunctionCallExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1053:2: ( ( ( rule__ConstantOrFunctionCallExp__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1054:1: ( ( rule__ConstantOrFunctionCallExp__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1054:1: ( ( rule__ConstantOrFunctionCallExp__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1055:1: ( rule__ConstantOrFunctionCallExp__Group__0 )
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1056:1: ( rule__ConstantOrFunctionCallExp__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1056:2: rule__ConstantOrFunctionCallExp__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group__0_in_ruleConstantOrFunctionCallExp2194);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1068:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1069:1: ( ruleNumberLiteral EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1070:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral2221);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral2228); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1077:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1081:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1082:1: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1082:1: ( ( rule__NumberLiteral__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1083:1: ( rule__NumberLiteral__Group__0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1084:1: ( rule__NumberLiteral__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1084:2: rule__NumberLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__0_in_ruleNumberLiteral2254);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1097:1: ruleAXIS : ( ( rule__AXIS__Alternatives ) ) ;
    public final void ruleAXIS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1101:1: ( ( ( rule__AXIS__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1102:1: ( ( rule__AXIS__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1102:1: ( ( rule__AXIS__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1103:1: ( rule__AXIS__Alternatives )
            {
             before(grammarAccess.getAXISAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1104:1: ( rule__AXIS__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1104:2: rule__AXIS__Alternatives
            {
            pushFollow(FOLLOW_rule__AXIS__Alternatives_in_ruleAXIS2291);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1116:1: ruleConstraintType : ( ( rule__ConstraintType__Alternatives ) ) ;
    public final void ruleConstraintType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1120:1: ( ( ( rule__ConstraintType__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1121:1: ( ( rule__ConstraintType__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1121:1: ( ( rule__ConstraintType__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1122:1: ( rule__ConstraintType__Alternatives )
            {
             before(grammarAccess.getConstraintTypeAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1123:1: ( rule__ConstraintType__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1123:2: rule__ConstraintType__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstraintType__Alternatives_in_ruleConstraintType2327);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1135:1: ruleLoadType : ( ( rule__LoadType__Alternatives ) ) ;
    public final void ruleLoadType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1139:1: ( ( ( rule__LoadType__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1140:1: ( ( rule__LoadType__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1140:1: ( ( rule__LoadType__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1141:1: ( rule__LoadType__Alternatives )
            {
             before(grammarAccess.getLoadTypeAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1142:1: ( rule__LoadType__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1142:2: rule__LoadType__Alternatives
            {
            pushFollow(FOLLOW_rule__LoadType__Alternatives_in_ruleLoadType2363);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1153:1: rule__InitialDefinition__Alternatives : ( ( ruleBaseMatrix ) | ( ruleJointType ) | ( ruleBaseStiffnessExp ) );
    public final void rule__InitialDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1157:1: ( ( ruleBaseMatrix ) | ( ruleJointType ) | ( ruleBaseStiffnessExp ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 56:
            case 58:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
            case 33:
            case 39:
            case 40:
                {
                alt1=2;
                }
                break;
            case 24:
            case 45:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1158:1: ( ruleBaseMatrix )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1158:1: ( ruleBaseMatrix )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1159:1: ruleBaseMatrix
                    {
                     before(grammarAccess.getInitialDefinitionAccess().getBaseMatrixParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBaseMatrix_in_rule__InitialDefinition__Alternatives2398);
                    ruleBaseMatrix();

                    state._fsp--;

                     after(grammarAccess.getInitialDefinitionAccess().getBaseMatrixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1164:6: ( ruleJointType )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1164:6: ( ruleJointType )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1165:1: ruleJointType
                    {
                     before(grammarAccess.getInitialDefinitionAccess().getJointTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleJointType_in_rule__InitialDefinition__Alternatives2415);
                    ruleJointType();

                    state._fsp--;

                     after(grammarAccess.getInitialDefinitionAccess().getJointTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1170:6: ( ruleBaseStiffnessExp )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1170:6: ( ruleBaseStiffnessExp )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1171:1: ruleBaseStiffnessExp
                    {
                     before(grammarAccess.getInitialDefinitionAccess().getBaseStiffnessExpParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBaseStiffnessExp_in_rule__InitialDefinition__Alternatives2432);
                    ruleBaseStiffnessExp();

                    state._fsp--;

                     after(grammarAccess.getInitialDefinitionAccess().getBaseStiffnessExpParserRuleCall_2()); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1181:1: rule__SystemElement__Alternatives : ( ( ruleBody ) | ( ruleConnective ) );
    public final void rule__SystemElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1185:1: ( ( ruleBody ) | ( ruleConnective ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==33||(LA2_0>=52 && LA2_0<=53)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1186:1: ( ruleBody )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1186:1: ( ruleBody )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1187:1: ruleBody
                    {
                     before(grammarAccess.getSystemElementAccess().getBodyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBody_in_rule__SystemElement__Alternatives2464);
                    ruleBody();

                    state._fsp--;

                     after(grammarAccess.getSystemElementAccess().getBodyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1192:6: ( ruleConnective )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1192:6: ( ruleConnective )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1193:1: ruleConnective
                    {
                     before(grammarAccess.getSystemElementAccess().getConnectiveParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleConnective_in_rule__SystemElement__Alternatives2481);
                    ruleConnective();

                    state._fsp--;

                     after(grammarAccess.getSystemElementAccess().getConnectiveParserRuleCall_1()); 

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


    // $ANTLR start "rule__Connective__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1203:1: rule__Connective__Alternatives : ( ( ruleJoint ) | ( ruleConstraint ) | ( ruleExternalLoad ) );
    public final void rule__Connective__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1207:1: ( ( ruleJoint ) | ( ruleConstraint ) | ( ruleExternalLoad ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt3=1;
                }
                break;
            case 52:
                {
                alt3=2;
                }
                break;
            case 53:
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1208:1: ( ruleJoint )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1208:1: ( ruleJoint )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1209:1: ruleJoint
                    {
                     before(grammarAccess.getConnectiveAccess().getJointParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleJoint_in_rule__Connective__Alternatives2513);
                    ruleJoint();

                    state._fsp--;

                     after(grammarAccess.getConnectiveAccess().getJointParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1214:6: ( ruleConstraint )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1214:6: ( ruleConstraint )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1215:1: ruleConstraint
                    {
                     before(grammarAccess.getConnectiveAccess().getConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleConstraint_in_rule__Connective__Alternatives2530);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getConnectiveAccess().getConstraintParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1220:6: ( ruleExternalLoad )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1220:6: ( ruleExternalLoad )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1221:1: ruleExternalLoad
                    {
                     before(grammarAccess.getConnectiveAccess().getExternalLoadParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleExternalLoad_in_rule__Connective__Alternatives2547);
                    ruleExternalLoad();

                    state._fsp--;

                     after(grammarAccess.getConnectiveAccess().getExternalLoadParserRuleCall_2()); 

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
    // $ANTLR end "rule__Connective__Alternatives"


    // $ANTLR start "rule__BodyReference__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1231:1: rule__BodyReference__Alternatives : ( ( ( rule__BodyReference__BaseAssignment_0 ) ) | ( ( rule__BodyReference__RefAssignment_1 ) ) );
    public final void rule__BodyReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1235:1: ( ( ( rule__BodyReference__BaseAssignment_0 ) ) | ( ( rule__BodyReference__RefAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==59) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1236:1: ( ( rule__BodyReference__BaseAssignment_0 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1236:1: ( ( rule__BodyReference__BaseAssignment_0 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1237:1: ( rule__BodyReference__BaseAssignment_0 )
                    {
                     before(grammarAccess.getBodyReferenceAccess().getBaseAssignment_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1238:1: ( rule__BodyReference__BaseAssignment_0 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1238:2: rule__BodyReference__BaseAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BodyReference__BaseAssignment_0_in_rule__BodyReference__Alternatives2579);
                    rule__BodyReference__BaseAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyReferenceAccess().getBaseAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1242:6: ( ( rule__BodyReference__RefAssignment_1 ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1242:6: ( ( rule__BodyReference__RefAssignment_1 ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1243:1: ( rule__BodyReference__RefAssignment_1 )
                    {
                     before(grammarAccess.getBodyReferenceAccess().getRefAssignment_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1244:1: ( rule__BodyReference__RefAssignment_1 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1244:2: rule__BodyReference__RefAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BodyReference__RefAssignment_1_in_rule__BodyReference__Alternatives2597);
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


    // $ANTLR start "rule__PrimaryJointType__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1253:1: rule__PrimaryJointType__Alternatives : ( ( ruleJointTypeReference ) | ( ruleBasicJointType ) );
    public final void rule__PrimaryJointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1257:1: ( ( ruleJointTypeReference ) | ( ruleBasicJointType ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=39 && LA5_0<=40)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1258:1: ( ruleJointTypeReference )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1258:1: ( ruleJointTypeReference )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1259:1: ruleJointTypeReference
                    {
                     before(grammarAccess.getPrimaryJointTypeAccess().getJointTypeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleJointTypeReference_in_rule__PrimaryJointType__Alternatives2630);
                    ruleJointTypeReference();

                    state._fsp--;

                     after(grammarAccess.getPrimaryJointTypeAccess().getJointTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1264:6: ( ruleBasicJointType )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1264:6: ( ruleBasicJointType )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1265:1: ruleBasicJointType
                    {
                     before(grammarAccess.getPrimaryJointTypeAccess().getBasicJointTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBasicJointType_in_rule__PrimaryJointType__Alternatives2647);
                    ruleBasicJointType();

                    state._fsp--;

                     after(grammarAccess.getPrimaryJointTypeAccess().getBasicJointTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__PrimaryJointType__Alternatives"


    // $ANTLR start "rule__JointMovement__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1275:1: rule__JointMovement__Alternatives : ( ( ruleRevolute ) | ( rulePlanar ) );
    public final void rule__JointMovement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1279:1: ( ( ruleRevolute ) | ( rulePlanar ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==39) ) {
                alt6=1;
            }
            else if ( (LA6_0==40) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1280:1: ( ruleRevolute )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1280:1: ( ruleRevolute )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1281:1: ruleRevolute
                    {
                     before(grammarAccess.getJointMovementAccess().getRevoluteParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRevolute_in_rule__JointMovement__Alternatives2679);
                    ruleRevolute();

                    state._fsp--;

                     after(grammarAccess.getJointMovementAccess().getRevoluteParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1286:6: ( rulePlanar )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1286:6: ( rulePlanar )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1287:1: rulePlanar
                    {
                     before(grammarAccess.getJointMovementAccess().getPlanarParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePlanar_in_rule__JointMovement__Alternatives2696);
                    rulePlanar();

                    state._fsp--;

                     after(grammarAccess.getJointMovementAccess().getPlanarParserRuleCall_1()); 

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
    // $ANTLR end "rule__JointMovement__Alternatives"


    // $ANTLR start "rule__StiffnessExp__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1297:1: rule__StiffnessExp__Alternatives : ( ( ruleStiffnessRef ) | ( ruleBaseStiffnessExp ) );
    public final void rule__StiffnessExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1301:1: ( ( ruleStiffnessRef ) | ( ruleBaseStiffnessExp ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==24||LA7_0==45) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1302:1: ( ruleStiffnessRef )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1302:1: ( ruleStiffnessRef )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1303:1: ruleStiffnessRef
                    {
                     before(grammarAccess.getStiffnessExpAccess().getStiffnessRefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStiffnessRef_in_rule__StiffnessExp__Alternatives2728);
                    ruleStiffnessRef();

                    state._fsp--;

                     after(grammarAccess.getStiffnessExpAccess().getStiffnessRefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1308:6: ( ruleBaseStiffnessExp )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1308:6: ( ruleBaseStiffnessExp )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1309:1: ruleBaseStiffnessExp
                    {
                     before(grammarAccess.getStiffnessExpAccess().getBaseStiffnessExpParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBaseStiffnessExp_in_rule__StiffnessExp__Alternatives2745);
                    ruleBaseStiffnessExp();

                    state._fsp--;

                     after(grammarAccess.getStiffnessExpAccess().getBaseStiffnessExpParserRuleCall_1()); 

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
    // $ANTLR end "rule__StiffnessExp__Alternatives"


    // $ANTLR start "rule__ReorientExpression__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1319:1: rule__ReorientExpression__Alternatives : ( ( ruleReorientRef ) | ( ruleBasicReorientExpression ) );
    public final void rule__ReorientExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1323:1: ( ( ruleReorientRef ) | ( ruleBasicReorientExpression ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==46) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1324:1: ( ruleReorientRef )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1324:1: ( ruleReorientRef )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1325:1: ruleReorientRef
                    {
                     before(grammarAccess.getReorientExpressionAccess().getReorientRefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleReorientRef_in_rule__ReorientExpression__Alternatives2777);
                    ruleReorientRef();

                    state._fsp--;

                     after(grammarAccess.getReorientExpressionAccess().getReorientRefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1330:6: ( ruleBasicReorientExpression )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1330:6: ( ruleBasicReorientExpression )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1331:1: ruleBasicReorientExpression
                    {
                     before(grammarAccess.getReorientExpressionAccess().getBasicReorientExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBasicReorientExpression_in_rule__ReorientExpression__Alternatives2794);
                    ruleBasicReorientExpression();

                    state._fsp--;

                     after(grammarAccess.getReorientExpressionAccess().getBasicReorientExpressionParserRuleCall_1()); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1341:1: rule__Matrix__Alternatives : ( ( ruleBaseMatrix ) | ( ruleMatrixRef ) );
    public final void rule__Matrix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1345:1: ( ( ruleBaseMatrix ) | ( ruleMatrixRef ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==56||LA9_0==58) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1346:1: ( ruleBaseMatrix )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1346:1: ( ruleBaseMatrix )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1347:1: ruleBaseMatrix
                    {
                     before(grammarAccess.getMatrixAccess().getBaseMatrixParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBaseMatrix_in_rule__Matrix__Alternatives2826);
                    ruleBaseMatrix();

                    state._fsp--;

                     after(grammarAccess.getMatrixAccess().getBaseMatrixParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1352:6: ( ruleMatrixRef )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1352:6: ( ruleMatrixRef )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1353:1: ruleMatrixRef
                    {
                     before(grammarAccess.getMatrixAccess().getMatrixRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMatrixRef_in_rule__Matrix__Alternatives2843);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1363:1: rule__AddExp__OpAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AddExp__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1367:1: ( ( '+' ) | ( '-' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            else if ( (LA10_0==13) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1368:1: ( '+' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1368:1: ( '+' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1369:1: '+'
                    {
                     before(grammarAccess.getAddExpAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__AddExp__OpAlternatives_1_1_02876); 
                     after(grammarAccess.getAddExpAccess().getOpPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1376:6: ( '-' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1376:6: ( '-' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1377:1: '-'
                    {
                     before(grammarAccess.getAddExpAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__AddExp__OpAlternatives_1_1_02896); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1389:1: rule__MultExp__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MultExp__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1393:1: ( ( '*' ) | ( '/' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1394:1: ( '*' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1394:1: ( '*' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1395:1: '*'
                    {
                     before(grammarAccess.getMultExpAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__MultExp__OpAlternatives_1_1_02931); 
                     after(grammarAccess.getMultExpAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1402:6: ( '/' )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1402:6: ( '/' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1403:1: '/'
                    {
                     before(grammarAccess.getMultExpAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__MultExp__OpAlternatives_1_1_02951); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1415:1: rule__Primary__Alternatives : ( ( ruleNumberLiteral ) | ( ruleParenthesisedExp ) | ( ruleConstantOrFunctionCallExp ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1419:1: ( ( ruleNumberLiteral ) | ( ruleParenthesisedExp ) | ( ruleConstantOrFunctionCallExp ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_REAL:
            case 13:
                {
                alt12=1;
                }
                break;
            case 46:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1420:1: ( ruleNumberLiteral )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1420:1: ( ruleNumberLiteral )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1421:1: ruleNumberLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumberLiteral_in_rule__Primary__Alternatives2985);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1426:6: ( ruleParenthesisedExp )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1426:6: ( ruleParenthesisedExp )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1427:1: ruleParenthesisedExp
                    {
                     before(grammarAccess.getPrimaryAccess().getParenthesisedExpParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParenthesisedExp_in_rule__Primary__Alternatives3002);
                    ruleParenthesisedExp();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParenthesisedExpParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1432:6: ( ruleConstantOrFunctionCallExp )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1432:6: ( ruleConstantOrFunctionCallExp )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1433:1: ruleConstantOrFunctionCallExp
                    {
                     before(grammarAccess.getPrimaryAccess().getConstantOrFunctionCallExpParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleConstantOrFunctionCallExp_in_rule__Primary__Alternatives3019);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1443:1: rule__AXIS__Alternatives : ( ( ( 'x' ) ) | ( ( 'y' ) ) | ( ( 'z' ) ) );
    public final void rule__AXIS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1447:1: ( ( ( 'x' ) ) | ( ( 'y' ) ) | ( ( 'z' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt13=1;
                }
                break;
            case 17:
                {
                alt13=2;
                }
                break;
            case 18:
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1448:1: ( ( 'x' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1448:1: ( ( 'x' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1449:1: ( 'x' )
                    {
                     before(grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1450:1: ( 'x' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1450:3: 'x'
                    {
                    match(input,16,FOLLOW_16_in_rule__AXIS__Alternatives3052); 

                    }

                     after(grammarAccess.getAXISAccess().getXEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1455:6: ( ( 'y' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1455:6: ( ( 'y' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1456:1: ( 'y' )
                    {
                     before(grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1457:1: ( 'y' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1457:3: 'y'
                    {
                    match(input,17,FOLLOW_17_in_rule__AXIS__Alternatives3073); 

                    }

                     after(grammarAccess.getAXISAccess().getYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1462:6: ( ( 'z' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1462:6: ( ( 'z' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1463:1: ( 'z' )
                    {
                     before(grammarAccess.getAXISAccess().getZEnumLiteralDeclaration_2()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1464:1: ( 'z' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1464:3: 'z'
                    {
                    match(input,18,FOLLOW_18_in_rule__AXIS__Alternatives3094); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1474:1: rule__ConstraintType__Alternatives : ( ( ( 'geometrical' ) ) | ( ( 'velocity' ) ) );
    public final void rule__ConstraintType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1478:1: ( ( ( 'geometrical' ) ) | ( ( 'velocity' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            else if ( (LA14_0==20) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1479:1: ( ( 'geometrical' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1479:1: ( ( 'geometrical' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1480:1: ( 'geometrical' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1481:1: ( 'geometrical' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1481:3: 'geometrical'
                    {
                    match(input,19,FOLLOW_19_in_rule__ConstraintType__Alternatives3130); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getGEOMETRICALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1486:6: ( ( 'velocity' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1486:6: ( ( 'velocity' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1487:1: ( 'velocity' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getVELOCITYEnumLiteralDeclaration_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1488:1: ( 'velocity' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1488:3: 'velocity'
                    {
                    match(input,20,FOLLOW_20_in_rule__ConstraintType__Alternatives3151); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1498:1: rule__LoadType__Alternatives : ( ( ( 'force' ) ) | ( ( 'torque' ) ) );
    public final void rule__LoadType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1502:1: ( ( ( 'force' ) ) | ( ( 'torque' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            else if ( (LA15_0==22) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1503:1: ( ( 'force' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1503:1: ( ( 'force' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1504:1: ( 'force' )
                    {
                     before(grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1505:1: ( 'force' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1505:3: 'force'
                    {
                    match(input,21,FOLLOW_21_in_rule__LoadType__Alternatives3187); 

                    }

                     after(grammarAccess.getLoadTypeAccess().getFORCEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1510:6: ( ( 'torque' ) )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1510:6: ( ( 'torque' ) )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1511:1: ( 'torque' )
                    {
                     before(grammarAccess.getLoadTypeAccess().getTORQUEEnumLiteralDeclaration_1()); 
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1512:1: ( 'torque' )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1512:3: 'torque'
                    {
                    match(input,22,FOLLOW_22_in_rule__LoadType__Alternatives3208); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1524:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1528:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1529:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03241);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03244);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1536:1: rule__Model__Group__0__Impl : ( ( rule__Model__DefsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1540:1: ( ( ( rule__Model__DefsAssignment_0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1541:1: ( ( rule__Model__DefsAssignment_0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1541:1: ( ( rule__Model__DefsAssignment_0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1542:1: ( rule__Model__DefsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getDefsAssignment_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1543:1: ( rule__Model__DefsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==24||LA16_0==33||(LA16_0>=39 && LA16_0<=40)||LA16_0==45||LA16_0==56||LA16_0==58) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1543:2: rule__Model__DefsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__DefsAssignment_0_in_rule__Model__Group__0__Impl3271);
            	    rule__Model__DefsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1553:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1557:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1558:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13302);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13305);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1565:1: rule__Model__Group__1__Impl : ( ( rule__Model__WorldAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1569:1: ( ( ( rule__Model__WorldAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1570:1: ( ( rule__Model__WorldAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1570:1: ( ( rule__Model__WorldAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1571:1: ( rule__Model__WorldAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getWorldAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1572:1: ( rule__Model__WorldAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1572:2: rule__Model__WorldAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__WorldAssignment_1_in_rule__Model__Group__1__Impl3332);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1582:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1586:1: ( rule__Model__Group__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1587:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23362);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1593:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1597:1: ( ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1598:1: ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1598:1: ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1599:1: ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1599:1: ( ( rule__Model__BodiesAssignment_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1600:1: ( rule__Model__BodiesAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getBodiesAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1601:1: ( rule__Model__BodiesAssignment_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1601:2: rule__Model__BodiesAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl3391);
            rule__Model__BodiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBodiesAssignment_2()); 

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1604:1: ( ( rule__Model__BodiesAssignment_2 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1605:1: ( rule__Model__BodiesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getBodiesAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1606:1: ( rule__Model__BodiesAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1606:2: rule__Model__BodiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl3403);
            	    rule__Model__BodiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1623:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1627:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1628:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_rule__Environment__Group__0__Impl_in_rule__Environment__Group__03442);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__1_in_rule__Environment__Group__03445);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1635:1: rule__Environment__Group__0__Impl : ( 'world' ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1639:1: ( ( 'world' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1640:1: ( 'world' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1640:1: ( 'world' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1641:1: 'world'
            {
             before(grammarAccess.getEnvironmentAccess().getWorldKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Environment__Group__0__Impl3473); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1654:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1658:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1659:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_rule__Environment__Group__1__Impl_in_rule__Environment__Group__13504);
            rule__Environment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__2_in_rule__Environment__Group__13507);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1666:1: rule__Environment__Group__1__Impl : ( '{' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1670:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1671:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1671:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1672:1: '{'
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Environment__Group__1__Impl3535); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1685:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1689:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1690:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_rule__Environment__Group__2__Impl_in_rule__Environment__Group__23566);
            rule__Environment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__3_in_rule__Environment__Group__23569);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1697:1: rule__Environment__Group__2__Impl : ( 'gravity' ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1701:1: ( ( 'gravity' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1702:1: ( 'gravity' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1702:1: ( 'gravity' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1703:1: 'gravity'
            {
             before(grammarAccess.getEnvironmentAccess().getGravityKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Environment__Group__2__Impl3597); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1716:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl rule__Environment__Group__4 ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1720:1: ( rule__Environment__Group__3__Impl rule__Environment__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1721:2: rule__Environment__Group__3__Impl rule__Environment__Group__4
            {
            pushFollow(FOLLOW_rule__Environment__Group__3__Impl_in_rule__Environment__Group__33628);
            rule__Environment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__4_in_rule__Environment__Group__33631);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1728:1: rule__Environment__Group__3__Impl : ( ( rule__Environment__GravityAssignment_3 ) ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1732:1: ( ( ( rule__Environment__GravityAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1733:1: ( ( rule__Environment__GravityAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1733:1: ( ( rule__Environment__GravityAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1734:1: ( rule__Environment__GravityAssignment_3 )
            {
             before(grammarAccess.getEnvironmentAccess().getGravityAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1735:1: ( rule__Environment__GravityAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1735:2: rule__Environment__GravityAssignment_3
            {
            pushFollow(FOLLOW_rule__Environment__GravityAssignment_3_in_rule__Environment__Group__3__Impl3658);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1745:1: rule__Environment__Group__4 : rule__Environment__Group__4__Impl ;
    public final void rule__Environment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1749:1: ( rule__Environment__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1750:2: rule__Environment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Environment__Group__4__Impl_in_rule__Environment__Group__43688);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1756:1: rule__Environment__Group__4__Impl : ( '}' ) ;
    public final void rule__Environment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1760:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1761:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1761:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1762:1: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Environment__Group__4__Impl3716); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1785:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1789:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1790:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__03757);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__03760);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1797:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1801:1: ( ( 'system' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1802:1: ( 'system' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1802:1: ( 'system' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1803:1: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__System__Group__0__Impl3788); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1816:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1820:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1821:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__13819);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__13822);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1828:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1832:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1833:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1833:1: ( ( rule__System__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1834:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1835:1: ( rule__System__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1835:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl3849);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1845:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1849:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1850:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__23879);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__23882);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1857:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1861:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1862:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1862:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1863:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__System__Group__2__Impl3910); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1876:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1880:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1881:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__33941);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__33944);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1888:1: rule__System__Group__3__Impl : ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1892:1: ( ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1893:1: ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1893:1: ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1894:1: ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1894:1: ( ( rule__System__ElementsAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1895:1: ( rule__System__ElementsAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getElementsAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1896:1: ( rule__System__ElementsAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1896:2: rule__System__ElementsAssignment_3
            {
            pushFollow(FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl3973);
            rule__System__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getElementsAssignment_3()); 

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1899:1: ( ( rule__System__ElementsAssignment_3 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1900:1: ( rule__System__ElementsAssignment_3 )*
            {
             before(grammarAccess.getSystemAccess().getElementsAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1901:1: ( rule__System__ElementsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28||LA18_0==33||(LA18_0>=52 && LA18_0<=53)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1901:2: rule__System__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl3985);
            	    rule__System__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1912:1: rule__System__Group__4 : rule__System__Group__4__Impl ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1916:1: ( rule__System__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1917:2: rule__System__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__44018);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1923:1: rule__System__Group__4__Impl : ( '}' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1927:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1928:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1928:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1929:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__System__Group__4__Impl4046); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1952:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1956:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1957:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__04087);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__04090);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1964:1: rule__Body__Group__0__Impl : ( 'body' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1968:1: ( ( 'body' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1969:1: ( 'body' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1969:1: ( 'body' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1970:1: 'body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Body__Group__0__Impl4118); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1983:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1987:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1988:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__14149);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__14152);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1995:1: rule__Body__Group__1__Impl : ( ( rule__Body__NameAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1999:1: ( ( ( rule__Body__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2000:1: ( ( rule__Body__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2000:1: ( ( rule__Body__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2001:1: ( rule__Body__NameAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2002:1: ( rule__Body__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2002:2: rule__Body__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__NameAssignment_1_in_rule__Body__Group__1__Impl4179);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2012:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2016:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2017:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__24209);
            rule__Body__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__24212);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2024:1: rule__Body__Group__2__Impl : ( '{' ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2028:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2029:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2029:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2030:1: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Body__Group__2__Impl4240); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2043:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2047:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2048:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__34271);
            rule__Body__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__4_in_rule__Body__Group__34274);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2055:1: rule__Body__Group__3__Impl : ( ( rule__Body__MassAssignment_3 ) ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2059:1: ( ( ( rule__Body__MassAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2060:1: ( ( rule__Body__MassAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2060:1: ( ( rule__Body__MassAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2061:1: ( rule__Body__MassAssignment_3 )
            {
             before(grammarAccess.getBodyAccess().getMassAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2062:1: ( rule__Body__MassAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2062:2: rule__Body__MassAssignment_3
            {
            pushFollow(FOLLOW_rule__Body__MassAssignment_3_in_rule__Body__Group__3__Impl4301);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2072:1: rule__Body__Group__4 : rule__Body__Group__4__Impl ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2076:1: ( rule__Body__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2077:2: rule__Body__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__44331);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2083:1: rule__Body__Group__4__Impl : ( '}' ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2087:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2088:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2088:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2089:1: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Body__Group__4__Impl4359); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2112:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2116:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2117:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_rule__Mass__Group__0__Impl_in_rule__Mass__Group__04400);
            rule__Mass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__1_in_rule__Mass__Group__04403);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2124:1: rule__Mass__Group__0__Impl : ( 'mass' ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2128:1: ( ( 'mass' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2129:1: ( 'mass' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2129:1: ( 'mass' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2130:1: 'mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Mass__Group__0__Impl4431); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2143:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2147:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2148:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_rule__Mass__Group__1__Impl_in_rule__Mass__Group__14462);
            rule__Mass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__2_in_rule__Mass__Group__14465);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2155:1: rule__Mass__Group__1__Impl : ( '{' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2159:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2160:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2160:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2161:1: '{'
            {
             before(grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Mass__Group__1__Impl4493); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2174:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2178:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2179:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_rule__Mass__Group__2__Impl_in_rule__Mass__Group__24524);
            rule__Mass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__3_in_rule__Mass__Group__24527);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2186:1: rule__Mass__Group__2__Impl : ( 'value' ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2190:1: ( ( 'value' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2191:1: ( 'value' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2191:1: ( 'value' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2192:1: 'value'
            {
             before(grammarAccess.getMassAccess().getValueKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Mass__Group__2__Impl4555); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2205:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2209:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2210:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
            {
            pushFollow(FOLLOW_rule__Mass__Group__3__Impl_in_rule__Mass__Group__34586);
            rule__Mass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__4_in_rule__Mass__Group__34589);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2217:1: rule__Mass__Group__3__Impl : ( ( rule__Mass__ValueAssignment_3 ) ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2221:1: ( ( ( rule__Mass__ValueAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2222:1: ( ( rule__Mass__ValueAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2222:1: ( ( rule__Mass__ValueAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2223:1: ( rule__Mass__ValueAssignment_3 )
            {
             before(grammarAccess.getMassAccess().getValueAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2224:1: ( rule__Mass__ValueAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2224:2: rule__Mass__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Mass__ValueAssignment_3_in_rule__Mass__Group__3__Impl4616);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2234:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl rule__Mass__Group__5 ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2238:1: ( rule__Mass__Group__4__Impl rule__Mass__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2239:2: rule__Mass__Group__4__Impl rule__Mass__Group__5
            {
            pushFollow(FOLLOW_rule__Mass__Group__4__Impl_in_rule__Mass__Group__44646);
            rule__Mass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__5_in_rule__Mass__Group__44649);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2246:1: rule__Mass__Group__4__Impl : ( 'position' ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2250:1: ( ( 'position' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2251:1: ( 'position' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2251:1: ( 'position' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2252:1: 'position'
            {
             before(grammarAccess.getMassAccess().getPositionKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__Mass__Group__4__Impl4677); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2265:1: rule__Mass__Group__5 : rule__Mass__Group__5__Impl rule__Mass__Group__6 ;
    public final void rule__Mass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2269:1: ( rule__Mass__Group__5__Impl rule__Mass__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2270:2: rule__Mass__Group__5__Impl rule__Mass__Group__6
            {
            pushFollow(FOLLOW_rule__Mass__Group__5__Impl_in_rule__Mass__Group__54708);
            rule__Mass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__6_in_rule__Mass__Group__54711);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2277:1: rule__Mass__Group__5__Impl : ( ( rule__Mass__PositionAssignment_5 ) ) ;
    public final void rule__Mass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2281:1: ( ( ( rule__Mass__PositionAssignment_5 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2282:1: ( ( rule__Mass__PositionAssignment_5 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2282:1: ( ( rule__Mass__PositionAssignment_5 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2283:1: ( rule__Mass__PositionAssignment_5 )
            {
             before(grammarAccess.getMassAccess().getPositionAssignment_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2284:1: ( rule__Mass__PositionAssignment_5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2284:2: rule__Mass__PositionAssignment_5
            {
            pushFollow(FOLLOW_rule__Mass__PositionAssignment_5_in_rule__Mass__Group__5__Impl4738);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2294:1: rule__Mass__Group__6 : rule__Mass__Group__6__Impl rule__Mass__Group__7 ;
    public final void rule__Mass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2298:1: ( rule__Mass__Group__6__Impl rule__Mass__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2299:2: rule__Mass__Group__6__Impl rule__Mass__Group__7
            {
            pushFollow(FOLLOW_rule__Mass__Group__6__Impl_in_rule__Mass__Group__64768);
            rule__Mass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__7_in_rule__Mass__Group__64771);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2306:1: rule__Mass__Group__6__Impl : ( 'inertia' ) ;
    public final void rule__Mass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2310:1: ( ( 'inertia' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2311:1: ( 'inertia' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2311:1: ( 'inertia' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2312:1: 'inertia'
            {
             before(grammarAccess.getMassAccess().getInertiaKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__Mass__Group__6__Impl4799); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2325:1: rule__Mass__Group__7 : rule__Mass__Group__7__Impl rule__Mass__Group__8 ;
    public final void rule__Mass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2329:1: ( rule__Mass__Group__7__Impl rule__Mass__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2330:2: rule__Mass__Group__7__Impl rule__Mass__Group__8
            {
            pushFollow(FOLLOW_rule__Mass__Group__7__Impl_in_rule__Mass__Group__74830);
            rule__Mass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__8_in_rule__Mass__Group__74833);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2337:1: rule__Mass__Group__7__Impl : ( ( rule__Mass__InertiaAssignment_7 ) ) ;
    public final void rule__Mass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2341:1: ( ( ( rule__Mass__InertiaAssignment_7 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2342:1: ( ( rule__Mass__InertiaAssignment_7 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2342:1: ( ( rule__Mass__InertiaAssignment_7 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2343:1: ( rule__Mass__InertiaAssignment_7 )
            {
             before(grammarAccess.getMassAccess().getInertiaAssignment_7()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2344:1: ( rule__Mass__InertiaAssignment_7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2344:2: rule__Mass__InertiaAssignment_7
            {
            pushFollow(FOLLOW_rule__Mass__InertiaAssignment_7_in_rule__Mass__Group__7__Impl4860);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2354:1: rule__Mass__Group__8 : rule__Mass__Group__8__Impl ;
    public final void rule__Mass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2358:1: ( rule__Mass__Group__8__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2359:2: rule__Mass__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Mass__Group__8__Impl_in_rule__Mass__Group__84890);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2365:1: rule__Mass__Group__8__Impl : ( '}' ) ;
    public final void rule__Mass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2369:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2370:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2370:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2371:1: '}'
            {
             before(grammarAccess.getMassAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__Mass__Group__8__Impl4918); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2402:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2406:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2407:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_rule__Joint__Group__0__Impl_in_rule__Joint__Group__04967);
            rule__Joint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__1_in_rule__Joint__Group__04970);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2414:1: rule__Joint__Group__0__Impl : ( 'joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2418:1: ( ( 'joint' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2419:1: ( 'joint' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2419:1: ( 'joint' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2420:1: 'joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Joint__Group__0__Impl4998); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2433:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2437:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2438:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_rule__Joint__Group__1__Impl_in_rule__Joint__Group__15029);
            rule__Joint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__2_in_rule__Joint__Group__15032);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2445:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2449:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2450:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2450:1: ( ( rule__Joint__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2451:1: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2452:1: ( rule__Joint__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2452:2: rule__Joint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Joint__NameAssignment_1_in_rule__Joint__Group__1__Impl5059);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2462:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2466:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2467:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_rule__Joint__Group__2__Impl_in_rule__Joint__Group__25089);
            rule__Joint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__3_in_rule__Joint__Group__25092);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2474:1: rule__Joint__Group__2__Impl : ( ':' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2478:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2479:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2479:1: ( ':' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2480:1: ':'
            {
             before(grammarAccess.getJointAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Joint__Group__2__Impl5120); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2493:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2497:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2498:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_rule__Joint__Group__3__Impl_in_rule__Joint__Group__35151);
            rule__Joint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__4_in_rule__Joint__Group__35154);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2505:1: rule__Joint__Group__3__Impl : ( ( rule__Joint__TypeAssignment_3 ) ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2509:1: ( ( ( rule__Joint__TypeAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2510:1: ( ( rule__Joint__TypeAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2510:1: ( ( rule__Joint__TypeAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2511:1: ( rule__Joint__TypeAssignment_3 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2512:1: ( rule__Joint__TypeAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2512:2: rule__Joint__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Joint__TypeAssignment_3_in_rule__Joint__Group__3__Impl5181);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2522:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2526:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2527:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_rule__Joint__Group__4__Impl_in_rule__Joint__Group__45211);
            rule__Joint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__5_in_rule__Joint__Group__45214);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2534:1: rule__Joint__Group__4__Impl : ( ( rule__Joint__IsStartAssignment_4 )? ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2538:1: ( ( ( rule__Joint__IsStartAssignment_4 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2539:1: ( ( rule__Joint__IsStartAssignment_4 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2539:1: ( ( rule__Joint__IsStartAssignment_4 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2540:1: ( rule__Joint__IsStartAssignment_4 )?
            {
             before(grammarAccess.getJointAccess().getIsStartAssignment_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2541:1: ( rule__Joint__IsStartAssignment_4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==60) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2541:2: rule__Joint__IsStartAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Joint__IsStartAssignment_4_in_rule__Joint__Group__4__Impl5241);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2551:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2555:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2556:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_rule__Joint__Group__5__Impl_in_rule__Joint__Group__55272);
            rule__Joint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__6_in_rule__Joint__Group__55275);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2563:1: rule__Joint__Group__5__Impl : ( 'between' ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2567:1: ( ( 'between' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2568:1: ( 'between' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2568:1: ( 'between' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2569:1: 'between'
            {
             before(grammarAccess.getJointAccess().getBetweenKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__Joint__Group__5__Impl5303); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2582:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2586:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2587:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_rule__Joint__Group__6__Impl_in_rule__Joint__Group__65334);
            rule__Joint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__7_in_rule__Joint__Group__65337);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2594:1: rule__Joint__Group__6__Impl : ( ( rule__Joint__Body1Assignment_6 ) ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2598:1: ( ( ( rule__Joint__Body1Assignment_6 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2599:1: ( ( rule__Joint__Body1Assignment_6 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2599:1: ( ( rule__Joint__Body1Assignment_6 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2600:1: ( rule__Joint__Body1Assignment_6 )
            {
             before(grammarAccess.getJointAccess().getBody1Assignment_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2601:1: ( rule__Joint__Body1Assignment_6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2601:2: rule__Joint__Body1Assignment_6
            {
            pushFollow(FOLLOW_rule__Joint__Body1Assignment_6_in_rule__Joint__Group__6__Impl5364);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2611:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2615:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2616:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_rule__Joint__Group__7__Impl_in_rule__Joint__Group__75394);
            rule__Joint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__8_in_rule__Joint__Group__75397);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2623:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__RelTrans1Assignment_7 ) ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2627:1: ( ( ( rule__Joint__RelTrans1Assignment_7 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2628:1: ( ( rule__Joint__RelTrans1Assignment_7 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2628:1: ( ( rule__Joint__RelTrans1Assignment_7 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2629:1: ( rule__Joint__RelTrans1Assignment_7 )
            {
             before(grammarAccess.getJointAccess().getRelTrans1Assignment_7()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2630:1: ( rule__Joint__RelTrans1Assignment_7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2630:2: rule__Joint__RelTrans1Assignment_7
            {
            pushFollow(FOLLOW_rule__Joint__RelTrans1Assignment_7_in_rule__Joint__Group__7__Impl5424);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2640:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2644:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2645:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_rule__Joint__Group__8__Impl_in_rule__Joint__Group__85454);
            rule__Joint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__9_in_rule__Joint__Group__85457);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2652:1: rule__Joint__Group__8__Impl : ( 'and' ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2656:1: ( ( 'and' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2657:1: ( 'and' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2657:1: ( 'and' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2658:1: 'and'
            {
             before(grammarAccess.getJointAccess().getAndKeyword_8()); 
            match(input,36,FOLLOW_36_in_rule__Joint__Group__8__Impl5485); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2671:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2675:1: ( rule__Joint__Group__9__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2676:2: rule__Joint__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Joint__Group__9__Impl_in_rule__Joint__Group__95516);
            rule__Joint__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2682:1: rule__Joint__Group__9__Impl : ( ( rule__Joint__Body2Assignment_9 ) ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2686:1: ( ( ( rule__Joint__Body2Assignment_9 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2687:1: ( ( rule__Joint__Body2Assignment_9 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2687:1: ( ( rule__Joint__Body2Assignment_9 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2688:1: ( rule__Joint__Body2Assignment_9 )
            {
             before(grammarAccess.getJointAccess().getBody2Assignment_9()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2689:1: ( rule__Joint__Body2Assignment_9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2689:2: rule__Joint__Body2Assignment_9
            {
            pushFollow(FOLLOW_rule__Joint__Body2Assignment_9_in_rule__Joint__Group__9__Impl5543);
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


    // $ANTLR start "rule__JointType__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2719:1: rule__JointType__Group__0 : rule__JointType__Group__0__Impl rule__JointType__Group__1 ;
    public final void rule__JointType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2723:1: ( rule__JointType__Group__0__Impl rule__JointType__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2724:2: rule__JointType__Group__0__Impl rule__JointType__Group__1
            {
            pushFollow(FOLLOW_rule__JointType__Group__0__Impl_in_rule__JointType__Group__05593);
            rule__JointType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointType__Group__1_in_rule__JointType__Group__05596);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2731:1: rule__JointType__Group__0__Impl : ( ( rule__JointType__Group_0__0 )? ) ;
    public final void rule__JointType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2735:1: ( ( ( rule__JointType__Group_0__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2736:1: ( ( rule__JointType__Group_0__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2736:1: ( ( rule__JointType__Group_0__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2737:1: ( rule__JointType__Group_0__0 )?
            {
             before(grammarAccess.getJointTypeAccess().getGroup_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2738:1: ( rule__JointType__Group_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2738:2: rule__JointType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JointType__Group_0__0_in_rule__JointType__Group__0__Impl5623);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2748:1: rule__JointType__Group__1 : rule__JointType__Group__1__Impl ;
    public final void rule__JointType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2752:1: ( rule__JointType__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2753:2: rule__JointType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__JointType__Group__1__Impl_in_rule__JointType__Group__15654);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2759:1: rule__JointType__Group__1__Impl : ( ( rule__JointType__ExpAssignment_1 ) ) ;
    public final void rule__JointType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2763:1: ( ( ( rule__JointType__ExpAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2764:1: ( ( rule__JointType__ExpAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2764:1: ( ( rule__JointType__ExpAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2765:1: ( rule__JointType__ExpAssignment_1 )
            {
             before(grammarAccess.getJointTypeAccess().getExpAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2766:1: ( rule__JointType__ExpAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2766:2: rule__JointType__ExpAssignment_1
            {
            pushFollow(FOLLOW_rule__JointType__ExpAssignment_1_in_rule__JointType__Group__1__Impl5681);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2780:1: rule__JointType__Group_0__0 : rule__JointType__Group_0__0__Impl rule__JointType__Group_0__1 ;
    public final void rule__JointType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2784:1: ( rule__JointType__Group_0__0__Impl rule__JointType__Group_0__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2785:2: rule__JointType__Group_0__0__Impl rule__JointType__Group_0__1
            {
            pushFollow(FOLLOW_rule__JointType__Group_0__0__Impl_in_rule__JointType__Group_0__05715);
            rule__JointType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointType__Group_0__1_in_rule__JointType__Group_0__05718);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2792:1: rule__JointType__Group_0__0__Impl : ( 'joint' ) ;
    public final void rule__JointType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2796:1: ( ( 'joint' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2797:1: ( 'joint' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2797:1: ( 'joint' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2798:1: 'joint'
            {
             before(grammarAccess.getJointTypeAccess().getJointKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__JointType__Group_0__0__Impl5746); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2811:1: rule__JointType__Group_0__1 : rule__JointType__Group_0__1__Impl rule__JointType__Group_0__2 ;
    public final void rule__JointType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2815:1: ( rule__JointType__Group_0__1__Impl rule__JointType__Group_0__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2816:2: rule__JointType__Group_0__1__Impl rule__JointType__Group_0__2
            {
            pushFollow(FOLLOW_rule__JointType__Group_0__1__Impl_in_rule__JointType__Group_0__15777);
            rule__JointType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JointType__Group_0__2_in_rule__JointType__Group_0__15780);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2823:1: rule__JointType__Group_0__1__Impl : ( 'type' ) ;
    public final void rule__JointType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2827:1: ( ( 'type' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2828:1: ( 'type' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2828:1: ( 'type' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2829:1: 'type'
            {
             before(grammarAccess.getJointTypeAccess().getTypeKeyword_0_1()); 
            match(input,37,FOLLOW_37_in_rule__JointType__Group_0__1__Impl5808); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2842:1: rule__JointType__Group_0__2 : rule__JointType__Group_0__2__Impl ;
    public final void rule__JointType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2846:1: ( rule__JointType__Group_0__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2847:2: rule__JointType__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__JointType__Group_0__2__Impl_in_rule__JointType__Group_0__25839);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2853:1: rule__JointType__Group_0__2__Impl : ( ( rule__JointType__NameAssignment_0_2 ) ) ;
    public final void rule__JointType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2857:1: ( ( ( rule__JointType__NameAssignment_0_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2858:1: ( ( rule__JointType__NameAssignment_0_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2858:1: ( ( rule__JointType__NameAssignment_0_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2859:1: ( rule__JointType__NameAssignment_0_2 )
            {
             before(grammarAccess.getJointTypeAccess().getNameAssignment_0_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2860:1: ( rule__JointType__NameAssignment_0_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2860:2: rule__JointType__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__JointType__NameAssignment_0_2_in_rule__JointType__Group_0__2__Impl5866);
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


    // $ANTLR start "rule__AdditiveJointType__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2876:1: rule__AdditiveJointType__Group__0 : rule__AdditiveJointType__Group__0__Impl rule__AdditiveJointType__Group__1 ;
    public final void rule__AdditiveJointType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2880:1: ( rule__AdditiveJointType__Group__0__Impl rule__AdditiveJointType__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2881:2: rule__AdditiveJointType__Group__0__Impl rule__AdditiveJointType__Group__1
            {
            pushFollow(FOLLOW_rule__AdditiveJointType__Group__0__Impl_in_rule__AdditiveJointType__Group__05902);
            rule__AdditiveJointType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditiveJointType__Group__1_in_rule__AdditiveJointType__Group__05905);
            rule__AdditiveJointType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveJointType__Group__0"


    // $ANTLR start "rule__AdditiveJointType__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2888:1: rule__AdditiveJointType__Group__0__Impl : ( rulePrimaryJointType ) ;
    public final void rule__AdditiveJointType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2892:1: ( ( rulePrimaryJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2893:1: ( rulePrimaryJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2893:1: ( rulePrimaryJointType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2894:1: rulePrimaryJointType
            {
             before(grammarAccess.getAdditiveJointTypeAccess().getPrimaryJointTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimaryJointType_in_rule__AdditiveJointType__Group__0__Impl5932);
            rulePrimaryJointType();

            state._fsp--;

             after(grammarAccess.getAdditiveJointTypeAccess().getPrimaryJointTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveJointType__Group__0__Impl"


    // $ANTLR start "rule__AdditiveJointType__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2905:1: rule__AdditiveJointType__Group__1 : rule__AdditiveJointType__Group__1__Impl ;
    public final void rule__AdditiveJointType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2909:1: ( rule__AdditiveJointType__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2910:2: rule__AdditiveJointType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditiveJointType__Group__1__Impl_in_rule__AdditiveJointType__Group__15961);
            rule__AdditiveJointType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveJointType__Group__1"


    // $ANTLR start "rule__AdditiveJointType__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2916:1: rule__AdditiveJointType__Group__1__Impl : ( ( rule__AdditiveJointType__Group_1__0 )* ) ;
    public final void rule__AdditiveJointType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2920:1: ( ( ( rule__AdditiveJointType__Group_1__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2921:1: ( ( rule__AdditiveJointType__Group_1__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2921:1: ( ( rule__AdditiveJointType__Group_1__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2922:1: ( rule__AdditiveJointType__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveJointTypeAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2923:1: ( rule__AdditiveJointType__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==12) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2923:2: rule__AdditiveJointType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AdditiveJointType__Group_1__0_in_rule__AdditiveJointType__Group__1__Impl5988);
            	    rule__AdditiveJointType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAdditiveJointTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveJointType__Group__1__Impl"


    // $ANTLR start "rule__AdditiveJointType__Group_1__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2937:1: rule__AdditiveJointType__Group_1__0 : rule__AdditiveJointType__Group_1__0__Impl rule__AdditiveJointType__Group_1__1 ;
    public final void rule__AdditiveJointType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2941:1: ( rule__AdditiveJointType__Group_1__0__Impl rule__AdditiveJointType__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2942:2: rule__AdditiveJointType__Group_1__0__Impl rule__AdditiveJointType__Group_1__1
            {
            pushFollow(FOLLOW_rule__AdditiveJointType__Group_1__0__Impl_in_rule__AdditiveJointType__Group_1__06023);
            rule__AdditiveJointType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditiveJointType__Group_1__1_in_rule__AdditiveJointType__Group_1__06026);
            rule__AdditiveJointType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveJointType__Group_1__0"


    // $ANTLR start "rule__AdditiveJointType__Group_1__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2949:1: rule__AdditiveJointType__Group_1__0__Impl : ( '+' ) ;
    public final void rule__AdditiveJointType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2953:1: ( ( '+' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2954:1: ( '+' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2954:1: ( '+' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2955:1: '+'
            {
             before(grammarAccess.getAdditiveJointTypeAccess().getPlusSignKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__AdditiveJointType__Group_1__0__Impl6054); 
             after(grammarAccess.getAdditiveJointTypeAccess().getPlusSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveJointType__Group_1__0__Impl"


    // $ANTLR start "rule__AdditiveJointType__Group_1__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2968:1: rule__AdditiveJointType__Group_1__1 : rule__AdditiveJointType__Group_1__1__Impl rule__AdditiveJointType__Group_1__2 ;
    public final void rule__AdditiveJointType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2972:1: ( rule__AdditiveJointType__Group_1__1__Impl rule__AdditiveJointType__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2973:2: rule__AdditiveJointType__Group_1__1__Impl rule__AdditiveJointType__Group_1__2
            {
            pushFollow(FOLLOW_rule__AdditiveJointType__Group_1__1__Impl_in_rule__AdditiveJointType__Group_1__16085);
            rule__AdditiveJointType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditiveJointType__Group_1__2_in_rule__AdditiveJointType__Group_1__16088);
            rule__AdditiveJointType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveJointType__Group_1__1"


    // $ANTLR start "rule__AdditiveJointType__Group_1__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2980:1: rule__AdditiveJointType__Group_1__1__Impl : ( () ) ;
    public final void rule__AdditiveJointType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2984:1: ( ( () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2985:1: ( () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2985:1: ( () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2986:1: ()
            {
             before(grammarAccess.getAdditiveJointTypeAccess().getAdditiveJointTypeLeftAction_1_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2987:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2989:1: 
            {
            }

             after(grammarAccess.getAdditiveJointTypeAccess().getAdditiveJointTypeLeftAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveJointType__Group_1__1__Impl"


    // $ANTLR start "rule__AdditiveJointType__Group_1__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2999:1: rule__AdditiveJointType__Group_1__2 : rule__AdditiveJointType__Group_1__2__Impl ;
    public final void rule__AdditiveJointType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3003:1: ( rule__AdditiveJointType__Group_1__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3004:2: rule__AdditiveJointType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AdditiveJointType__Group_1__2__Impl_in_rule__AdditiveJointType__Group_1__26146);
            rule__AdditiveJointType__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveJointType__Group_1__2"


    // $ANTLR start "rule__AdditiveJointType__Group_1__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3010:1: rule__AdditiveJointType__Group_1__2__Impl : ( ( rule__AdditiveJointType__RightAssignment_1_2 ) ) ;
    public final void rule__AdditiveJointType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3014:1: ( ( ( rule__AdditiveJointType__RightAssignment_1_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3015:1: ( ( rule__AdditiveJointType__RightAssignment_1_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3015:1: ( ( rule__AdditiveJointType__RightAssignment_1_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3016:1: ( rule__AdditiveJointType__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditiveJointTypeAccess().getRightAssignment_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3017:1: ( rule__AdditiveJointType__RightAssignment_1_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3017:2: rule__AdditiveJointType__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AdditiveJointType__RightAssignment_1_2_in_rule__AdditiveJointType__Group_1__2__Impl6173);
            rule__AdditiveJointType__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveJointTypeAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveJointType__Group_1__2__Impl"


    // $ANTLR start "rule__BasicJointType__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3033:1: rule__BasicJointType__Group__0 : rule__BasicJointType__Group__0__Impl rule__BasicJointType__Group__1 ;
    public final void rule__BasicJointType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3037:1: ( rule__BasicJointType__Group__0__Impl rule__BasicJointType__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3038:2: rule__BasicJointType__Group__0__Impl rule__BasicJointType__Group__1
            {
            pushFollow(FOLLOW_rule__BasicJointType__Group__0__Impl_in_rule__BasicJointType__Group__06209);
            rule__BasicJointType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicJointType__Group__1_in_rule__BasicJointType__Group__06212);
            rule__BasicJointType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicJointType__Group__0"


    // $ANTLR start "rule__BasicJointType__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3045:1: rule__BasicJointType__Group__0__Impl : ( ( rule__BasicJointType__TypeAssignment_0 ) ) ;
    public final void rule__BasicJointType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3049:1: ( ( ( rule__BasicJointType__TypeAssignment_0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3050:1: ( ( rule__BasicJointType__TypeAssignment_0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3050:1: ( ( rule__BasicJointType__TypeAssignment_0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3051:1: ( rule__BasicJointType__TypeAssignment_0 )
            {
             before(grammarAccess.getBasicJointTypeAccess().getTypeAssignment_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3052:1: ( rule__BasicJointType__TypeAssignment_0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3052:2: rule__BasicJointType__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__BasicJointType__TypeAssignment_0_in_rule__BasicJointType__Group__0__Impl6239);
            rule__BasicJointType__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicJointTypeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicJointType__Group__0__Impl"


    // $ANTLR start "rule__BasicJointType__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3062:1: rule__BasicJointType__Group__1 : rule__BasicJointType__Group__1__Impl rule__BasicJointType__Group__2 ;
    public final void rule__BasicJointType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3066:1: ( rule__BasicJointType__Group__1__Impl rule__BasicJointType__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3067:2: rule__BasicJointType__Group__1__Impl rule__BasicJointType__Group__2
            {
            pushFollow(FOLLOW_rule__BasicJointType__Group__1__Impl_in_rule__BasicJointType__Group__16269);
            rule__BasicJointType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicJointType__Group__2_in_rule__BasicJointType__Group__16272);
            rule__BasicJointType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicJointType__Group__1"


    // $ANTLR start "rule__BasicJointType__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3074:1: rule__BasicJointType__Group__1__Impl : ( 'with' ) ;
    public final void rule__BasicJointType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3078:1: ( ( 'with' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3079:1: ( 'with' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3079:1: ( 'with' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3080:1: 'with'
            {
             before(grammarAccess.getBasicJointTypeAccess().getWithKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__BasicJointType__Group__1__Impl6300); 
             after(grammarAccess.getBasicJointTypeAccess().getWithKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicJointType__Group__1__Impl"


    // $ANTLR start "rule__BasicJointType__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3093:1: rule__BasicJointType__Group__2 : rule__BasicJointType__Group__2__Impl ;
    public final void rule__BasicJointType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3097:1: ( rule__BasicJointType__Group__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3098:2: rule__BasicJointType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BasicJointType__Group__2__Impl_in_rule__BasicJointType__Group__26331);
            rule__BasicJointType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicJointType__Group__2"


    // $ANTLR start "rule__BasicJointType__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3104:1: rule__BasicJointType__Group__2__Impl : ( ( rule__BasicJointType__StiffnessAssignment_2 ) ) ;
    public final void rule__BasicJointType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3108:1: ( ( ( rule__BasicJointType__StiffnessAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3109:1: ( ( rule__BasicJointType__StiffnessAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3109:1: ( ( rule__BasicJointType__StiffnessAssignment_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3110:1: ( rule__BasicJointType__StiffnessAssignment_2 )
            {
             before(grammarAccess.getBasicJointTypeAccess().getStiffnessAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3111:1: ( rule__BasicJointType__StiffnessAssignment_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3111:2: rule__BasicJointType__StiffnessAssignment_2
            {
            pushFollow(FOLLOW_rule__BasicJointType__StiffnessAssignment_2_in_rule__BasicJointType__Group__2__Impl6358);
            rule__BasicJointType__StiffnessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBasicJointTypeAccess().getStiffnessAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicJointType__Group__2__Impl"


    // $ANTLR start "rule__Revolute__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3127:1: rule__Revolute__Group__0 : rule__Revolute__Group__0__Impl rule__Revolute__Group__1 ;
    public final void rule__Revolute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3131:1: ( rule__Revolute__Group__0__Impl rule__Revolute__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3132:2: rule__Revolute__Group__0__Impl rule__Revolute__Group__1
            {
            pushFollow(FOLLOW_rule__Revolute__Group__0__Impl_in_rule__Revolute__Group__06394);
            rule__Revolute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Revolute__Group__1_in_rule__Revolute__Group__06397);
            rule__Revolute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Revolute__Group__0"


    // $ANTLR start "rule__Revolute__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3139:1: rule__Revolute__Group__0__Impl : ( 'revolute' ) ;
    public final void rule__Revolute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3143:1: ( ( 'revolute' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3144:1: ( 'revolute' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3144:1: ( 'revolute' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3145:1: 'revolute'
            {
             before(grammarAccess.getRevoluteAccess().getRevoluteKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Revolute__Group__0__Impl6425); 
             after(grammarAccess.getRevoluteAccess().getRevoluteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Revolute__Group__0__Impl"


    // $ANTLR start "rule__Revolute__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3158:1: rule__Revolute__Group__1 : rule__Revolute__Group__1__Impl ;
    public final void rule__Revolute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3162:1: ( rule__Revolute__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3163:2: rule__Revolute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Revolute__Group__1__Impl_in_rule__Revolute__Group__16456);
            rule__Revolute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Revolute__Group__1"


    // $ANTLR start "rule__Revolute__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3169:1: rule__Revolute__Group__1__Impl : ( ( rule__Revolute__AxisAssignment_1 ) ) ;
    public final void rule__Revolute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3173:1: ( ( ( rule__Revolute__AxisAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3174:1: ( ( rule__Revolute__AxisAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3174:1: ( ( rule__Revolute__AxisAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3175:1: ( rule__Revolute__AxisAssignment_1 )
            {
             before(grammarAccess.getRevoluteAccess().getAxisAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3176:1: ( rule__Revolute__AxisAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3176:2: rule__Revolute__AxisAssignment_1
            {
            pushFollow(FOLLOW_rule__Revolute__AxisAssignment_1_in_rule__Revolute__Group__1__Impl6483);
            rule__Revolute__AxisAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRevoluteAccess().getAxisAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Revolute__Group__1__Impl"


    // $ANTLR start "rule__Planar__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3190:1: rule__Planar__Group__0 : rule__Planar__Group__0__Impl rule__Planar__Group__1 ;
    public final void rule__Planar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3194:1: ( rule__Planar__Group__0__Impl rule__Planar__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3195:2: rule__Planar__Group__0__Impl rule__Planar__Group__1
            {
            pushFollow(FOLLOW_rule__Planar__Group__0__Impl_in_rule__Planar__Group__06517);
            rule__Planar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Planar__Group__1_in_rule__Planar__Group__06520);
            rule__Planar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planar__Group__0"


    // $ANTLR start "rule__Planar__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3202:1: rule__Planar__Group__0__Impl : ( 'planar' ) ;
    public final void rule__Planar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3206:1: ( ( 'planar' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3207:1: ( 'planar' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3207:1: ( 'planar' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3208:1: 'planar'
            {
             before(grammarAccess.getPlanarAccess().getPlanarKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Planar__Group__0__Impl6548); 
             after(grammarAccess.getPlanarAccess().getPlanarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planar__Group__0__Impl"


    // $ANTLR start "rule__Planar__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3221:1: rule__Planar__Group__1 : rule__Planar__Group__1__Impl ;
    public final void rule__Planar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3225:1: ( rule__Planar__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3226:2: rule__Planar__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Planar__Group__1__Impl_in_rule__Planar__Group__16579);
            rule__Planar__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planar__Group__1"


    // $ANTLR start "rule__Planar__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3232:1: rule__Planar__Group__1__Impl : ( ( rule__Planar__AxisAssignment_1 ) ) ;
    public final void rule__Planar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3236:1: ( ( ( rule__Planar__AxisAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3237:1: ( ( rule__Planar__AxisAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3237:1: ( ( rule__Planar__AxisAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3238:1: ( rule__Planar__AxisAssignment_1 )
            {
             before(grammarAccess.getPlanarAccess().getAxisAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3239:1: ( rule__Planar__AxisAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3239:2: rule__Planar__AxisAssignment_1
            {
            pushFollow(FOLLOW_rule__Planar__AxisAssignment_1_in_rule__Planar__Group__1__Impl6606);
            rule__Planar__AxisAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlanarAccess().getAxisAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planar__Group__1__Impl"


    // $ANTLR start "rule__BaseStiffnessExp__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3253:1: rule__BaseStiffnessExp__Group__0 : rule__BaseStiffnessExp__Group__0__Impl rule__BaseStiffnessExp__Group__1 ;
    public final void rule__BaseStiffnessExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3257:1: ( rule__BaseStiffnessExp__Group__0__Impl rule__BaseStiffnessExp__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3258:2: rule__BaseStiffnessExp__Group__0__Impl rule__BaseStiffnessExp__Group__1
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__0__Impl_in_rule__BaseStiffnessExp__Group__06640);
            rule__BaseStiffnessExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__1_in_rule__BaseStiffnessExp__Group__06643);
            rule__BaseStiffnessExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__0"


    // $ANTLR start "rule__BaseStiffnessExp__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3265:1: rule__BaseStiffnessExp__Group__0__Impl : ( ( rule__BaseStiffnessExp__Group_0__0 )? ) ;
    public final void rule__BaseStiffnessExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3269:1: ( ( ( rule__BaseStiffnessExp__Group_0__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3270:1: ( ( rule__BaseStiffnessExp__Group_0__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3270:1: ( ( rule__BaseStiffnessExp__Group_0__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3271:1: ( rule__BaseStiffnessExp__Group_0__0 )?
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getGroup_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3272:1: ( rule__BaseStiffnessExp__Group_0__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3272:2: rule__BaseStiffnessExp__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BaseStiffnessExp__Group_0__0_in_rule__BaseStiffnessExp__Group__0__Impl6670);
                    rule__BaseStiffnessExp__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseStiffnessExpAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__0__Impl"


    // $ANTLR start "rule__BaseStiffnessExp__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3282:1: rule__BaseStiffnessExp__Group__1 : rule__BaseStiffnessExp__Group__1__Impl rule__BaseStiffnessExp__Group__2 ;
    public final void rule__BaseStiffnessExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3286:1: ( rule__BaseStiffnessExp__Group__1__Impl rule__BaseStiffnessExp__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3287:2: rule__BaseStiffnessExp__Group__1__Impl rule__BaseStiffnessExp__Group__2
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__1__Impl_in_rule__BaseStiffnessExp__Group__16701);
            rule__BaseStiffnessExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__2_in_rule__BaseStiffnessExp__Group__16704);
            rule__BaseStiffnessExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__1"


    // $ANTLR start "rule__BaseStiffnessExp__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3294:1: rule__BaseStiffnessExp__Group__1__Impl : ( '{' ) ;
    public final void rule__BaseStiffnessExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3298:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3299:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3299:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3300:1: '{'
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__BaseStiffnessExp__Group__1__Impl6732); 
             after(grammarAccess.getBaseStiffnessExpAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__1__Impl"


    // $ANTLR start "rule__BaseStiffnessExp__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3313:1: rule__BaseStiffnessExp__Group__2 : rule__BaseStiffnessExp__Group__2__Impl rule__BaseStiffnessExp__Group__3 ;
    public final void rule__BaseStiffnessExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3317:1: ( rule__BaseStiffnessExp__Group__2__Impl rule__BaseStiffnessExp__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3318:2: rule__BaseStiffnessExp__Group__2__Impl rule__BaseStiffnessExp__Group__3
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__2__Impl_in_rule__BaseStiffnessExp__Group__26763);
            rule__BaseStiffnessExp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__3_in_rule__BaseStiffnessExp__Group__26766);
            rule__BaseStiffnessExp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__2"


    // $ANTLR start "rule__BaseStiffnessExp__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3325:1: rule__BaseStiffnessExp__Group__2__Impl : ( 'springCoeff' ) ;
    public final void rule__BaseStiffnessExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3329:1: ( ( 'springCoeff' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3330:1: ( 'springCoeff' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3330:1: ( 'springCoeff' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3331:1: 'springCoeff'
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getSpringCoeffKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__BaseStiffnessExp__Group__2__Impl6794); 
             after(grammarAccess.getBaseStiffnessExpAccess().getSpringCoeffKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__2__Impl"


    // $ANTLR start "rule__BaseStiffnessExp__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3344:1: rule__BaseStiffnessExp__Group__3 : rule__BaseStiffnessExp__Group__3__Impl rule__BaseStiffnessExp__Group__4 ;
    public final void rule__BaseStiffnessExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3348:1: ( rule__BaseStiffnessExp__Group__3__Impl rule__BaseStiffnessExp__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3349:2: rule__BaseStiffnessExp__Group__3__Impl rule__BaseStiffnessExp__Group__4
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__3__Impl_in_rule__BaseStiffnessExp__Group__36825);
            rule__BaseStiffnessExp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__4_in_rule__BaseStiffnessExp__Group__36828);
            rule__BaseStiffnessExp__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__3"


    // $ANTLR start "rule__BaseStiffnessExp__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3356:1: rule__BaseStiffnessExp__Group__3__Impl : ( ( rule__BaseStiffnessExp__SpringCoeffAssignment_3 ) ) ;
    public final void rule__BaseStiffnessExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3360:1: ( ( ( rule__BaseStiffnessExp__SpringCoeffAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3361:1: ( ( rule__BaseStiffnessExp__SpringCoeffAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3361:1: ( ( rule__BaseStiffnessExp__SpringCoeffAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3362:1: ( rule__BaseStiffnessExp__SpringCoeffAssignment_3 )
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getSpringCoeffAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3363:1: ( rule__BaseStiffnessExp__SpringCoeffAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3363:2: rule__BaseStiffnessExp__SpringCoeffAssignment_3
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__SpringCoeffAssignment_3_in_rule__BaseStiffnessExp__Group__3__Impl6855);
            rule__BaseStiffnessExp__SpringCoeffAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBaseStiffnessExpAccess().getSpringCoeffAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__3__Impl"


    // $ANTLR start "rule__BaseStiffnessExp__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3373:1: rule__BaseStiffnessExp__Group__4 : rule__BaseStiffnessExp__Group__4__Impl rule__BaseStiffnessExp__Group__5 ;
    public final void rule__BaseStiffnessExp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3377:1: ( rule__BaseStiffnessExp__Group__4__Impl rule__BaseStiffnessExp__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3378:2: rule__BaseStiffnessExp__Group__4__Impl rule__BaseStiffnessExp__Group__5
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__4__Impl_in_rule__BaseStiffnessExp__Group__46885);
            rule__BaseStiffnessExp__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__5_in_rule__BaseStiffnessExp__Group__46888);
            rule__BaseStiffnessExp__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__4"


    // $ANTLR start "rule__BaseStiffnessExp__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3385:1: rule__BaseStiffnessExp__Group__4__Impl : ( 'springInit' ) ;
    public final void rule__BaseStiffnessExp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3389:1: ( ( 'springInit' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3390:1: ( 'springInit' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3390:1: ( 'springInit' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3391:1: 'springInit'
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getSpringInitKeyword_4()); 
            match(input,42,FOLLOW_42_in_rule__BaseStiffnessExp__Group__4__Impl6916); 
             after(grammarAccess.getBaseStiffnessExpAccess().getSpringInitKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__4__Impl"


    // $ANTLR start "rule__BaseStiffnessExp__Group__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3404:1: rule__BaseStiffnessExp__Group__5 : rule__BaseStiffnessExp__Group__5__Impl rule__BaseStiffnessExp__Group__6 ;
    public final void rule__BaseStiffnessExp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3408:1: ( rule__BaseStiffnessExp__Group__5__Impl rule__BaseStiffnessExp__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3409:2: rule__BaseStiffnessExp__Group__5__Impl rule__BaseStiffnessExp__Group__6
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__5__Impl_in_rule__BaseStiffnessExp__Group__56947);
            rule__BaseStiffnessExp__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__6_in_rule__BaseStiffnessExp__Group__56950);
            rule__BaseStiffnessExp__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__5"


    // $ANTLR start "rule__BaseStiffnessExp__Group__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3416:1: rule__BaseStiffnessExp__Group__5__Impl : ( ( rule__BaseStiffnessExp__SpringInitAssignment_5 ) ) ;
    public final void rule__BaseStiffnessExp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3420:1: ( ( ( rule__BaseStiffnessExp__SpringInitAssignment_5 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3421:1: ( ( rule__BaseStiffnessExp__SpringInitAssignment_5 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3421:1: ( ( rule__BaseStiffnessExp__SpringInitAssignment_5 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3422:1: ( rule__BaseStiffnessExp__SpringInitAssignment_5 )
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getSpringInitAssignment_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3423:1: ( rule__BaseStiffnessExp__SpringInitAssignment_5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3423:2: rule__BaseStiffnessExp__SpringInitAssignment_5
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__SpringInitAssignment_5_in_rule__BaseStiffnessExp__Group__5__Impl6977);
            rule__BaseStiffnessExp__SpringInitAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBaseStiffnessExpAccess().getSpringInitAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__5__Impl"


    // $ANTLR start "rule__BaseStiffnessExp__Group__6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3433:1: rule__BaseStiffnessExp__Group__6 : rule__BaseStiffnessExp__Group__6__Impl rule__BaseStiffnessExp__Group__7 ;
    public final void rule__BaseStiffnessExp__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3437:1: ( rule__BaseStiffnessExp__Group__6__Impl rule__BaseStiffnessExp__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3438:2: rule__BaseStiffnessExp__Group__6__Impl rule__BaseStiffnessExp__Group__7
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__6__Impl_in_rule__BaseStiffnessExp__Group__67007);
            rule__BaseStiffnessExp__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__7_in_rule__BaseStiffnessExp__Group__67010);
            rule__BaseStiffnessExp__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__6"


    // $ANTLR start "rule__BaseStiffnessExp__Group__6__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3445:1: rule__BaseStiffnessExp__Group__6__Impl : ( 'dampViscous' ) ;
    public final void rule__BaseStiffnessExp__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3449:1: ( ( 'dampViscous' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3450:1: ( 'dampViscous' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3450:1: ( 'dampViscous' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3451:1: 'dampViscous'
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getDampViscousKeyword_6()); 
            match(input,43,FOLLOW_43_in_rule__BaseStiffnessExp__Group__6__Impl7038); 
             after(grammarAccess.getBaseStiffnessExpAccess().getDampViscousKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__6__Impl"


    // $ANTLR start "rule__BaseStiffnessExp__Group__7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3464:1: rule__BaseStiffnessExp__Group__7 : rule__BaseStiffnessExp__Group__7__Impl rule__BaseStiffnessExp__Group__8 ;
    public final void rule__BaseStiffnessExp__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3468:1: ( rule__BaseStiffnessExp__Group__7__Impl rule__BaseStiffnessExp__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3469:2: rule__BaseStiffnessExp__Group__7__Impl rule__BaseStiffnessExp__Group__8
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__7__Impl_in_rule__BaseStiffnessExp__Group__77069);
            rule__BaseStiffnessExp__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__8_in_rule__BaseStiffnessExp__Group__77072);
            rule__BaseStiffnessExp__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__7"


    // $ANTLR start "rule__BaseStiffnessExp__Group__7__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3476:1: rule__BaseStiffnessExp__Group__7__Impl : ( ( rule__BaseStiffnessExp__DampViscousAssignment_7 ) ) ;
    public final void rule__BaseStiffnessExp__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3480:1: ( ( ( rule__BaseStiffnessExp__DampViscousAssignment_7 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3481:1: ( ( rule__BaseStiffnessExp__DampViscousAssignment_7 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3481:1: ( ( rule__BaseStiffnessExp__DampViscousAssignment_7 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3482:1: ( rule__BaseStiffnessExp__DampViscousAssignment_7 )
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getDampViscousAssignment_7()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3483:1: ( rule__BaseStiffnessExp__DampViscousAssignment_7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3483:2: rule__BaseStiffnessExp__DampViscousAssignment_7
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__DampViscousAssignment_7_in_rule__BaseStiffnessExp__Group__7__Impl7099);
            rule__BaseStiffnessExp__DampViscousAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBaseStiffnessExpAccess().getDampViscousAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__7__Impl"


    // $ANTLR start "rule__BaseStiffnessExp__Group__8"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3493:1: rule__BaseStiffnessExp__Group__8 : rule__BaseStiffnessExp__Group__8__Impl rule__BaseStiffnessExp__Group__9 ;
    public final void rule__BaseStiffnessExp__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3497:1: ( rule__BaseStiffnessExp__Group__8__Impl rule__BaseStiffnessExp__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3498:2: rule__BaseStiffnessExp__Group__8__Impl rule__BaseStiffnessExp__Group__9
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__8__Impl_in_rule__BaseStiffnessExp__Group__87129);
            rule__BaseStiffnessExp__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__9_in_rule__BaseStiffnessExp__Group__87132);
            rule__BaseStiffnessExp__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__8"


    // $ANTLR start "rule__BaseStiffnessExp__Group__8__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3505:1: rule__BaseStiffnessExp__Group__8__Impl : ( 'dampCoulomb' ) ;
    public final void rule__BaseStiffnessExp__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3509:1: ( ( 'dampCoulomb' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3510:1: ( 'dampCoulomb' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3510:1: ( 'dampCoulomb' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3511:1: 'dampCoulomb'
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getDampCoulombKeyword_8()); 
            match(input,44,FOLLOW_44_in_rule__BaseStiffnessExp__Group__8__Impl7160); 
             after(grammarAccess.getBaseStiffnessExpAccess().getDampCoulombKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__8__Impl"


    // $ANTLR start "rule__BaseStiffnessExp__Group__9"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3524:1: rule__BaseStiffnessExp__Group__9 : rule__BaseStiffnessExp__Group__9__Impl rule__BaseStiffnessExp__Group__10 ;
    public final void rule__BaseStiffnessExp__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3528:1: ( rule__BaseStiffnessExp__Group__9__Impl rule__BaseStiffnessExp__Group__10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3529:2: rule__BaseStiffnessExp__Group__9__Impl rule__BaseStiffnessExp__Group__10
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__9__Impl_in_rule__BaseStiffnessExp__Group__97191);
            rule__BaseStiffnessExp__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__10_in_rule__BaseStiffnessExp__Group__97194);
            rule__BaseStiffnessExp__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__9"


    // $ANTLR start "rule__BaseStiffnessExp__Group__9__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3536:1: rule__BaseStiffnessExp__Group__9__Impl : ( ( rule__BaseStiffnessExp__DampCoulombAssignment_9 ) ) ;
    public final void rule__BaseStiffnessExp__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3540:1: ( ( ( rule__BaseStiffnessExp__DampCoulombAssignment_9 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3541:1: ( ( rule__BaseStiffnessExp__DampCoulombAssignment_9 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3541:1: ( ( rule__BaseStiffnessExp__DampCoulombAssignment_9 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3542:1: ( rule__BaseStiffnessExp__DampCoulombAssignment_9 )
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getDampCoulombAssignment_9()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3543:1: ( rule__BaseStiffnessExp__DampCoulombAssignment_9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3543:2: rule__BaseStiffnessExp__DampCoulombAssignment_9
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__DampCoulombAssignment_9_in_rule__BaseStiffnessExp__Group__9__Impl7221);
            rule__BaseStiffnessExp__DampCoulombAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getBaseStiffnessExpAccess().getDampCoulombAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__9__Impl"


    // $ANTLR start "rule__BaseStiffnessExp__Group__10"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3553:1: rule__BaseStiffnessExp__Group__10 : rule__BaseStiffnessExp__Group__10__Impl ;
    public final void rule__BaseStiffnessExp__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3557:1: ( rule__BaseStiffnessExp__Group__10__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3558:2: rule__BaseStiffnessExp__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group__10__Impl_in_rule__BaseStiffnessExp__Group__107251);
            rule__BaseStiffnessExp__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__10"


    // $ANTLR start "rule__BaseStiffnessExp__Group__10__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3564:1: rule__BaseStiffnessExp__Group__10__Impl : ( '}' ) ;
    public final void rule__BaseStiffnessExp__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3568:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3569:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3569:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3570:1: '}'
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getRightCurlyBracketKeyword_10()); 
            match(input,26,FOLLOW_26_in_rule__BaseStiffnessExp__Group__10__Impl7279); 
             after(grammarAccess.getBaseStiffnessExpAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group__10__Impl"


    // $ANTLR start "rule__BaseStiffnessExp__Group_0__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3605:1: rule__BaseStiffnessExp__Group_0__0 : rule__BaseStiffnessExp__Group_0__0__Impl rule__BaseStiffnessExp__Group_0__1 ;
    public final void rule__BaseStiffnessExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3609:1: ( rule__BaseStiffnessExp__Group_0__0__Impl rule__BaseStiffnessExp__Group_0__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3610:2: rule__BaseStiffnessExp__Group_0__0__Impl rule__BaseStiffnessExp__Group_0__1
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group_0__0__Impl_in_rule__BaseStiffnessExp__Group_0__07332);
            rule__BaseStiffnessExp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group_0__1_in_rule__BaseStiffnessExp__Group_0__07335);
            rule__BaseStiffnessExp__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group_0__0"


    // $ANTLR start "rule__BaseStiffnessExp__Group_0__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3617:1: rule__BaseStiffnessExp__Group_0__0__Impl : ( 'stiffness' ) ;
    public final void rule__BaseStiffnessExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3621:1: ( ( 'stiffness' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3622:1: ( 'stiffness' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3622:1: ( 'stiffness' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3623:1: 'stiffness'
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getStiffnessKeyword_0_0()); 
            match(input,45,FOLLOW_45_in_rule__BaseStiffnessExp__Group_0__0__Impl7363); 
             after(grammarAccess.getBaseStiffnessExpAccess().getStiffnessKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group_0__0__Impl"


    // $ANTLR start "rule__BaseStiffnessExp__Group_0__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3636:1: rule__BaseStiffnessExp__Group_0__1 : rule__BaseStiffnessExp__Group_0__1__Impl ;
    public final void rule__BaseStiffnessExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3640:1: ( rule__BaseStiffnessExp__Group_0__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3641:2: rule__BaseStiffnessExp__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__Group_0__1__Impl_in_rule__BaseStiffnessExp__Group_0__17394);
            rule__BaseStiffnessExp__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group_0__1"


    // $ANTLR start "rule__BaseStiffnessExp__Group_0__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3647:1: rule__BaseStiffnessExp__Group_0__1__Impl : ( ( rule__BaseStiffnessExp__NameAssignment_0_1 ) ) ;
    public final void rule__BaseStiffnessExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3651:1: ( ( ( rule__BaseStiffnessExp__NameAssignment_0_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3652:1: ( ( rule__BaseStiffnessExp__NameAssignment_0_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3652:1: ( ( rule__BaseStiffnessExp__NameAssignment_0_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3653:1: ( rule__BaseStiffnessExp__NameAssignment_0_1 )
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getNameAssignment_0_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3654:1: ( rule__BaseStiffnessExp__NameAssignment_0_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3654:2: rule__BaseStiffnessExp__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BaseStiffnessExp__NameAssignment_0_1_in_rule__BaseStiffnessExp__Group_0__1__Impl7421);
            rule__BaseStiffnessExp__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseStiffnessExpAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__Group_0__1__Impl"


    // $ANTLR start "rule__RelativeTransformation__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3668:1: rule__RelativeTransformation__Group__0 : rule__RelativeTransformation__Group__0__Impl rule__RelativeTransformation__Group__1 ;
    public final void rule__RelativeTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3672:1: ( rule__RelativeTransformation__Group__0__Impl rule__RelativeTransformation__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3673:2: rule__RelativeTransformation__Group__0__Impl rule__RelativeTransformation__Group__1
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__0__Impl_in_rule__RelativeTransformation__Group__07455);
            rule__RelativeTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__1_in_rule__RelativeTransformation__Group__07458);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3680:1: rule__RelativeTransformation__Group__0__Impl : ( '(' ) ;
    public final void rule__RelativeTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3684:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3685:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3685:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3686:1: '('
            {
             before(grammarAccess.getRelativeTransformationAccess().getLeftParenthesisKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__RelativeTransformation__Group__0__Impl7486); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3699:1: rule__RelativeTransformation__Group__1 : rule__RelativeTransformation__Group__1__Impl rule__RelativeTransformation__Group__2 ;
    public final void rule__RelativeTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3703:1: ( rule__RelativeTransformation__Group__1__Impl rule__RelativeTransformation__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3704:2: rule__RelativeTransformation__Group__1__Impl rule__RelativeTransformation__Group__2
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__1__Impl_in_rule__RelativeTransformation__Group__17517);
            rule__RelativeTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__2_in_rule__RelativeTransformation__Group__17520);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3711:1: rule__RelativeTransformation__Group__1__Impl : ( 'with' ) ;
    public final void rule__RelativeTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3715:1: ( ( 'with' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3716:1: ( 'with' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3716:1: ( 'with' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3717:1: 'with'
            {
             before(grammarAccess.getRelativeTransformationAccess().getWithKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__RelativeTransformation__Group__1__Impl7548); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3730:1: rule__RelativeTransformation__Group__2 : rule__RelativeTransformation__Group__2__Impl rule__RelativeTransformation__Group__3 ;
    public final void rule__RelativeTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3734:1: ( rule__RelativeTransformation__Group__2__Impl rule__RelativeTransformation__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3735:2: rule__RelativeTransformation__Group__2__Impl rule__RelativeTransformation__Group__3
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__2__Impl_in_rule__RelativeTransformation__Group__27579);
            rule__RelativeTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__3_in_rule__RelativeTransformation__Group__27582);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3742:1: rule__RelativeTransformation__Group__2__Impl : ( 'relative' ) ;
    public final void rule__RelativeTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3746:1: ( ( 'relative' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3747:1: ( 'relative' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3747:1: ( 'relative' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3748:1: 'relative'
            {
             before(grammarAccess.getRelativeTransformationAccess().getRelativeKeyword_2()); 
            match(input,47,FOLLOW_47_in_rule__RelativeTransformation__Group__2__Impl7610); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3761:1: rule__RelativeTransformation__Group__3 : rule__RelativeTransformation__Group__3__Impl rule__RelativeTransformation__Group__4 ;
    public final void rule__RelativeTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3765:1: ( rule__RelativeTransformation__Group__3__Impl rule__RelativeTransformation__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3766:2: rule__RelativeTransformation__Group__3__Impl rule__RelativeTransformation__Group__4
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__3__Impl_in_rule__RelativeTransformation__Group__37641);
            rule__RelativeTransformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__4_in_rule__RelativeTransformation__Group__37644);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3773:1: rule__RelativeTransformation__Group__3__Impl : ( 'transformation' ) ;
    public final void rule__RelativeTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3777:1: ( ( 'transformation' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3778:1: ( 'transformation' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3778:1: ( 'transformation' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3779:1: 'transformation'
            {
             before(grammarAccess.getRelativeTransformationAccess().getTransformationKeyword_3()); 
            match(input,48,FOLLOW_48_in_rule__RelativeTransformation__Group__3__Impl7672); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3792:1: rule__RelativeTransformation__Group__4 : rule__RelativeTransformation__Group__4__Impl rule__RelativeTransformation__Group__5 ;
    public final void rule__RelativeTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3796:1: ( rule__RelativeTransformation__Group__4__Impl rule__RelativeTransformation__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3797:2: rule__RelativeTransformation__Group__4__Impl rule__RelativeTransformation__Group__5
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__4__Impl_in_rule__RelativeTransformation__Group__47703);
            rule__RelativeTransformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__5_in_rule__RelativeTransformation__Group__47706);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3804:1: rule__RelativeTransformation__Group__4__Impl : ( ( rule__RelativeTransformation__PositionAssignment_4 ) ) ;
    public final void rule__RelativeTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3808:1: ( ( ( rule__RelativeTransformation__PositionAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3809:1: ( ( rule__RelativeTransformation__PositionAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3809:1: ( ( rule__RelativeTransformation__PositionAssignment_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3810:1: ( rule__RelativeTransformation__PositionAssignment_4 )
            {
             before(grammarAccess.getRelativeTransformationAccess().getPositionAssignment_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3811:1: ( rule__RelativeTransformation__PositionAssignment_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3811:2: rule__RelativeTransformation__PositionAssignment_4
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__PositionAssignment_4_in_rule__RelativeTransformation__Group__4__Impl7733);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3821:1: rule__RelativeTransformation__Group__5 : rule__RelativeTransformation__Group__5__Impl rule__RelativeTransformation__Group__6 ;
    public final void rule__RelativeTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3825:1: ( rule__RelativeTransformation__Group__5__Impl rule__RelativeTransformation__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3826:2: rule__RelativeTransformation__Group__5__Impl rule__RelativeTransformation__Group__6
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__5__Impl_in_rule__RelativeTransformation__Group__57763);
            rule__RelativeTransformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__6_in_rule__RelativeTransformation__Group__57766);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3833:1: rule__RelativeTransformation__Group__5__Impl : ( ',' ) ;
    public final void rule__RelativeTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3837:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3838:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3838:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3839:1: ','
            {
             before(grammarAccess.getRelativeTransformationAccess().getCommaKeyword_5()); 
            match(input,49,FOLLOW_49_in_rule__RelativeTransformation__Group__5__Impl7794); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3852:1: rule__RelativeTransformation__Group__6 : rule__RelativeTransformation__Group__6__Impl rule__RelativeTransformation__Group__7 ;
    public final void rule__RelativeTransformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3856:1: ( rule__RelativeTransformation__Group__6__Impl rule__RelativeTransformation__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3857:2: rule__RelativeTransformation__Group__6__Impl rule__RelativeTransformation__Group__7
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__6__Impl_in_rule__RelativeTransformation__Group__67825);
            rule__RelativeTransformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelativeTransformation__Group__7_in_rule__RelativeTransformation__Group__67828);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3864:1: rule__RelativeTransformation__Group__6__Impl : ( ( rule__RelativeTransformation__ReorientAssignment_6 ) ) ;
    public final void rule__RelativeTransformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3868:1: ( ( ( rule__RelativeTransformation__ReorientAssignment_6 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3869:1: ( ( rule__RelativeTransformation__ReorientAssignment_6 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3869:1: ( ( rule__RelativeTransformation__ReorientAssignment_6 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3870:1: ( rule__RelativeTransformation__ReorientAssignment_6 )
            {
             before(grammarAccess.getRelativeTransformationAccess().getReorientAssignment_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3871:1: ( rule__RelativeTransformation__ReorientAssignment_6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3871:2: rule__RelativeTransformation__ReorientAssignment_6
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__ReorientAssignment_6_in_rule__RelativeTransformation__Group__6__Impl7855);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3881:1: rule__RelativeTransformation__Group__7 : rule__RelativeTransformation__Group__7__Impl ;
    public final void rule__RelativeTransformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3885:1: ( rule__RelativeTransformation__Group__7__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3886:2: rule__RelativeTransformation__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__RelativeTransformation__Group__7__Impl_in_rule__RelativeTransformation__Group__77885);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3892:1: rule__RelativeTransformation__Group__7__Impl : ( ')' ) ;
    public final void rule__RelativeTransformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3896:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3897:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3897:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3898:1: ')'
            {
             before(grammarAccess.getRelativeTransformationAccess().getRightParenthesisKeyword_7()); 
            match(input,50,FOLLOW_50_in_rule__RelativeTransformation__Group__7__Impl7913); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3927:1: rule__Reorientation__Group__0 : rule__Reorientation__Group__0__Impl rule__Reorientation__Group__1 ;
    public final void rule__Reorientation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3931:1: ( rule__Reorientation__Group__0__Impl rule__Reorientation__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3932:2: rule__Reorientation__Group__0__Impl rule__Reorientation__Group__1
            {
            pushFollow(FOLLOW_rule__Reorientation__Group__0__Impl_in_rule__Reorientation__Group__07960);
            rule__Reorientation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reorientation__Group__1_in_rule__Reorientation__Group__07963);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3939:1: rule__Reorientation__Group__0__Impl : ( ( rule__Reorientation__Group_0__0 )? ) ;
    public final void rule__Reorientation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3943:1: ( ( ( rule__Reorientation__Group_0__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3944:1: ( ( rule__Reorientation__Group_0__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3944:1: ( ( rule__Reorientation__Group_0__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3945:1: ( rule__Reorientation__Group_0__0 )?
            {
             before(grammarAccess.getReorientationAccess().getGroup_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3946:1: ( rule__Reorientation__Group_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==51) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3946:2: rule__Reorientation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Reorientation__Group_0__0_in_rule__Reorientation__Group__0__Impl7990);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3956:1: rule__Reorientation__Group__1 : rule__Reorientation__Group__1__Impl ;
    public final void rule__Reorientation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3960:1: ( rule__Reorientation__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3961:2: rule__Reorientation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reorientation__Group__1__Impl_in_rule__Reorientation__Group__18021);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3967:1: rule__Reorientation__Group__1__Impl : ( ( rule__Reorientation__ExpAssignment_1 ) ) ;
    public final void rule__Reorientation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3971:1: ( ( ( rule__Reorientation__ExpAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3972:1: ( ( rule__Reorientation__ExpAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3972:1: ( ( rule__Reorientation__ExpAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3973:1: ( rule__Reorientation__ExpAssignment_1 )
            {
             before(grammarAccess.getReorientationAccess().getExpAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3974:1: ( rule__Reorientation__ExpAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3974:2: rule__Reorientation__ExpAssignment_1
            {
            pushFollow(FOLLOW_rule__Reorientation__ExpAssignment_1_in_rule__Reorientation__Group__1__Impl8048);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3988:1: rule__Reorientation__Group_0__0 : rule__Reorientation__Group_0__0__Impl rule__Reorientation__Group_0__1 ;
    public final void rule__Reorientation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3992:1: ( rule__Reorientation__Group_0__0__Impl rule__Reorientation__Group_0__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3993:2: rule__Reorientation__Group_0__0__Impl rule__Reorientation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Reorientation__Group_0__0__Impl_in_rule__Reorientation__Group_0__08082);
            rule__Reorientation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reorientation__Group_0__1_in_rule__Reorientation__Group_0__08085);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4000:1: rule__Reorientation__Group_0__0__Impl : ( 'reorient' ) ;
    public final void rule__Reorientation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4004:1: ( ( 'reorient' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4005:1: ( 'reorient' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4005:1: ( 'reorient' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4006:1: 'reorient'
            {
             before(grammarAccess.getReorientationAccess().getReorientKeyword_0_0()); 
            match(input,51,FOLLOW_51_in_rule__Reorientation__Group_0__0__Impl8113); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4019:1: rule__Reorientation__Group_0__1 : rule__Reorientation__Group_0__1__Impl ;
    public final void rule__Reorientation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4023:1: ( rule__Reorientation__Group_0__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4024:2: rule__Reorientation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Reorientation__Group_0__1__Impl_in_rule__Reorientation__Group_0__18144);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4030:1: rule__Reorientation__Group_0__1__Impl : ( ( rule__Reorientation__NameAssignment_0_1 ) ) ;
    public final void rule__Reorientation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4034:1: ( ( ( rule__Reorientation__NameAssignment_0_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4035:1: ( ( rule__Reorientation__NameAssignment_0_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4035:1: ( ( rule__Reorientation__NameAssignment_0_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4036:1: ( rule__Reorientation__NameAssignment_0_1 )
            {
             before(grammarAccess.getReorientationAccess().getNameAssignment_0_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4037:1: ( rule__Reorientation__NameAssignment_0_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4037:2: rule__Reorientation__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Reorientation__NameAssignment_0_1_in_rule__Reorientation__Group_0__1__Impl8171);
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


    // $ANTLR start "rule__BasicReorientExpression__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4051:1: rule__BasicReorientExpression__Group__0 : rule__BasicReorientExpression__Group__0__Impl rule__BasicReorientExpression__Group__1 ;
    public final void rule__BasicReorientExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4055:1: ( rule__BasicReorientExpression__Group__0__Impl rule__BasicReorientExpression__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4056:2: rule__BasicReorientExpression__Group__0__Impl rule__BasicReorientExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group__0__Impl_in_rule__BasicReorientExpression__Group__08205);
            rule__BasicReorientExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicReorientExpression__Group__1_in_rule__BasicReorientExpression__Group__08208);
            rule__BasicReorientExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group__0"


    // $ANTLR start "rule__BasicReorientExpression__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4063:1: rule__BasicReorientExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__BasicReorientExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4067:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4068:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4068:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4069:1: '('
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__BasicReorientExpression__Group__0__Impl8236); 
             after(grammarAccess.getBasicReorientExpressionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group__0__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4082:1: rule__BasicReorientExpression__Group__1 : rule__BasicReorientExpression__Group__1__Impl rule__BasicReorientExpression__Group__2 ;
    public final void rule__BasicReorientExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4086:1: ( rule__BasicReorientExpression__Group__1__Impl rule__BasicReorientExpression__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4087:2: rule__BasicReorientExpression__Group__1__Impl rule__BasicReorientExpression__Group__2
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group__1__Impl_in_rule__BasicReorientExpression__Group__18267);
            rule__BasicReorientExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicReorientExpression__Group__2_in_rule__BasicReorientExpression__Group__18270);
            rule__BasicReorientExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group__1"


    // $ANTLR start "rule__BasicReorientExpression__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4094:1: rule__BasicReorientExpression__Group__1__Impl : ( () ) ;
    public final void rule__BasicReorientExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4098:1: ( ( () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4099:1: ( () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4099:1: ( () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4100:1: ()
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getBasicReorientExpressionAction_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4101:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4103:1: 
            {
            }

             after(grammarAccess.getBasicReorientExpressionAccess().getBasicReorientExpressionAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group__1__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4113:1: rule__BasicReorientExpression__Group__2 : rule__BasicReorientExpression__Group__2__Impl rule__BasicReorientExpression__Group__3 ;
    public final void rule__BasicReorientExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4117:1: ( rule__BasicReorientExpression__Group__2__Impl rule__BasicReorientExpression__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4118:2: rule__BasicReorientExpression__Group__2__Impl rule__BasicReorientExpression__Group__3
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group__2__Impl_in_rule__BasicReorientExpression__Group__28328);
            rule__BasicReorientExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicReorientExpression__Group__3_in_rule__BasicReorientExpression__Group__28331);
            rule__BasicReorientExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group__2"


    // $ANTLR start "rule__BasicReorientExpression__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4125:1: rule__BasicReorientExpression__Group__2__Impl : ( ( rule__BasicReorientExpression__Group_2__0 )? ) ;
    public final void rule__BasicReorientExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4129:1: ( ( ( rule__BasicReorientExpression__Group_2__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4130:1: ( ( rule__BasicReorientExpression__Group_2__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4130:1: ( ( rule__BasicReorientExpression__Group_2__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4131:1: ( rule__BasicReorientExpression__Group_2__0 )?
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getGroup_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4132:1: ( rule__BasicReorientExpression__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4132:2: rule__BasicReorientExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2__0_in_rule__BasicReorientExpression__Group__2__Impl8358);
                    rule__BasicReorientExpression__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicReorientExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group__2__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4142:1: rule__BasicReorientExpression__Group__3 : rule__BasicReorientExpression__Group__3__Impl ;
    public final void rule__BasicReorientExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4146:1: ( rule__BasicReorientExpression__Group__3__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4147:2: rule__BasicReorientExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group__3__Impl_in_rule__BasicReorientExpression__Group__38389);
            rule__BasicReorientExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group__3"


    // $ANTLR start "rule__BasicReorientExpression__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4153:1: rule__BasicReorientExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__BasicReorientExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4157:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4158:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4158:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4159:1: ')'
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FOLLOW_50_in_rule__BasicReorientExpression__Group__3__Impl8417); 
             after(grammarAccess.getBasicReorientExpressionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group__3__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group_2__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4180:1: rule__BasicReorientExpression__Group_2__0 : rule__BasicReorientExpression__Group_2__0__Impl rule__BasicReorientExpression__Group_2__1 ;
    public final void rule__BasicReorientExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4184:1: ( rule__BasicReorientExpression__Group_2__0__Impl rule__BasicReorientExpression__Group_2__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4185:2: rule__BasicReorientExpression__Group_2__0__Impl rule__BasicReorientExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2__0__Impl_in_rule__BasicReorientExpression__Group_2__08456);
            rule__BasicReorientExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2__1_in_rule__BasicReorientExpression__Group_2__08459);
            rule__BasicReorientExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2__0"


    // $ANTLR start "rule__BasicReorientExpression__Group_2__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4192:1: rule__BasicReorientExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__BasicReorientExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4196:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4197:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4197:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4198:1: '('
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,46,FOLLOW_46_in_rule__BasicReorientExpression__Group_2__0__Impl8487); 
             after(grammarAccess.getBasicReorientExpressionAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2__0__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group_2__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4211:1: rule__BasicReorientExpression__Group_2__1 : rule__BasicReorientExpression__Group_2__1__Impl rule__BasicReorientExpression__Group_2__2 ;
    public final void rule__BasicReorientExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4215:1: ( rule__BasicReorientExpression__Group_2__1__Impl rule__BasicReorientExpression__Group_2__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4216:2: rule__BasicReorientExpression__Group_2__1__Impl rule__BasicReorientExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2__1__Impl_in_rule__BasicReorientExpression__Group_2__18518);
            rule__BasicReorientExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2__2_in_rule__BasicReorientExpression__Group_2__18521);
            rule__BasicReorientExpression__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2__1"


    // $ANTLR start "rule__BasicReorientExpression__Group_2__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4223:1: rule__BasicReorientExpression__Group_2__1__Impl : ( ( rule__BasicReorientExpression__AxisAssignment_2_1 ) ) ;
    public final void rule__BasicReorientExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4227:1: ( ( ( rule__BasicReorientExpression__AxisAssignment_2_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4228:1: ( ( rule__BasicReorientExpression__AxisAssignment_2_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4228:1: ( ( rule__BasicReorientExpression__AxisAssignment_2_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4229:1: ( rule__BasicReorientExpression__AxisAssignment_2_1 )
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getAxisAssignment_2_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4230:1: ( rule__BasicReorientExpression__AxisAssignment_2_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4230:2: rule__BasicReorientExpression__AxisAssignment_2_1
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__AxisAssignment_2_1_in_rule__BasicReorientExpression__Group_2__1__Impl8548);
            rule__BasicReorientExpression__AxisAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicReorientExpressionAccess().getAxisAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2__1__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group_2__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4240:1: rule__BasicReorientExpression__Group_2__2 : rule__BasicReorientExpression__Group_2__2__Impl rule__BasicReorientExpression__Group_2__3 ;
    public final void rule__BasicReorientExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4244:1: ( rule__BasicReorientExpression__Group_2__2__Impl rule__BasicReorientExpression__Group_2__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4245:2: rule__BasicReorientExpression__Group_2__2__Impl rule__BasicReorientExpression__Group_2__3
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2__2__Impl_in_rule__BasicReorientExpression__Group_2__28578);
            rule__BasicReorientExpression__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2__3_in_rule__BasicReorientExpression__Group_2__28581);
            rule__BasicReorientExpression__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2__2"


    // $ANTLR start "rule__BasicReorientExpression__Group_2__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4252:1: rule__BasicReorientExpression__Group_2__2__Impl : ( ',' ) ;
    public final void rule__BasicReorientExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4256:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4257:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4257:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4258:1: ','
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getCommaKeyword_2_2()); 
            match(input,49,FOLLOW_49_in_rule__BasicReorientExpression__Group_2__2__Impl8609); 
             after(grammarAccess.getBasicReorientExpressionAccess().getCommaKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2__2__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group_2__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4271:1: rule__BasicReorientExpression__Group_2__3 : rule__BasicReorientExpression__Group_2__3__Impl rule__BasicReorientExpression__Group_2__4 ;
    public final void rule__BasicReorientExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4275:1: ( rule__BasicReorientExpression__Group_2__3__Impl rule__BasicReorientExpression__Group_2__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4276:2: rule__BasicReorientExpression__Group_2__3__Impl rule__BasicReorientExpression__Group_2__4
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2__3__Impl_in_rule__BasicReorientExpression__Group_2__38640);
            rule__BasicReorientExpression__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2__4_in_rule__BasicReorientExpression__Group_2__38643);
            rule__BasicReorientExpression__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2__3"


    // $ANTLR start "rule__BasicReorientExpression__Group_2__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4283:1: rule__BasicReorientExpression__Group_2__3__Impl : ( ( rule__BasicReorientExpression__ValueAssignment_2_3 ) ) ;
    public final void rule__BasicReorientExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4287:1: ( ( ( rule__BasicReorientExpression__ValueAssignment_2_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4288:1: ( ( rule__BasicReorientExpression__ValueAssignment_2_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4288:1: ( ( rule__BasicReorientExpression__ValueAssignment_2_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4289:1: ( rule__BasicReorientExpression__ValueAssignment_2_3 )
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getValueAssignment_2_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4290:1: ( rule__BasicReorientExpression__ValueAssignment_2_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4290:2: rule__BasicReorientExpression__ValueAssignment_2_3
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__ValueAssignment_2_3_in_rule__BasicReorientExpression__Group_2__3__Impl8670);
            rule__BasicReorientExpression__ValueAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getBasicReorientExpressionAccess().getValueAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2__3__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group_2__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4300:1: rule__BasicReorientExpression__Group_2__4 : rule__BasicReorientExpression__Group_2__4__Impl rule__BasicReorientExpression__Group_2__5 ;
    public final void rule__BasicReorientExpression__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4304:1: ( rule__BasicReorientExpression__Group_2__4__Impl rule__BasicReorientExpression__Group_2__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4305:2: rule__BasicReorientExpression__Group_2__4__Impl rule__BasicReorientExpression__Group_2__5
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2__4__Impl_in_rule__BasicReorientExpression__Group_2__48700);
            rule__BasicReorientExpression__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2__5_in_rule__BasicReorientExpression__Group_2__48703);
            rule__BasicReorientExpression__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2__4"


    // $ANTLR start "rule__BasicReorientExpression__Group_2__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4312:1: rule__BasicReorientExpression__Group_2__4__Impl : ( ')' ) ;
    public final void rule__BasicReorientExpression__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4316:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4317:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4317:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4318:1: ')'
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getRightParenthesisKeyword_2_4()); 
            match(input,50,FOLLOW_50_in_rule__BasicReorientExpression__Group_2__4__Impl8731); 
             after(grammarAccess.getBasicReorientExpressionAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2__4__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group_2__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4331:1: rule__BasicReorientExpression__Group_2__5 : rule__BasicReorientExpression__Group_2__5__Impl ;
    public final void rule__BasicReorientExpression__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4335:1: ( rule__BasicReorientExpression__Group_2__5__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4336:2: rule__BasicReorientExpression__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2__5__Impl_in_rule__BasicReorientExpression__Group_2__58762);
            rule__BasicReorientExpression__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2__5"


    // $ANTLR start "rule__BasicReorientExpression__Group_2__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4342:1: rule__BasicReorientExpression__Group_2__5__Impl : ( ( rule__BasicReorientExpression__Group_2_5__0 )* ) ;
    public final void rule__BasicReorientExpression__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4346:1: ( ( ( rule__BasicReorientExpression__Group_2_5__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4347:1: ( ( rule__BasicReorientExpression__Group_2_5__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4347:1: ( ( rule__BasicReorientExpression__Group_2_5__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4348:1: ( rule__BasicReorientExpression__Group_2_5__0 )*
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getGroup_2_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4349:1: ( rule__BasicReorientExpression__Group_2_5__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4349:2: rule__BasicReorientExpression__Group_2_5__0
            	    {
            	    pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2_5__0_in_rule__BasicReorientExpression__Group_2__5__Impl8789);
            	    rule__BasicReorientExpression__Group_2_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getBasicReorientExpressionAccess().getGroup_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2__5__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group_2_5__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4371:1: rule__BasicReorientExpression__Group_2_5__0 : rule__BasicReorientExpression__Group_2_5__0__Impl rule__BasicReorientExpression__Group_2_5__1 ;
    public final void rule__BasicReorientExpression__Group_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4375:1: ( rule__BasicReorientExpression__Group_2_5__0__Impl rule__BasicReorientExpression__Group_2_5__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4376:2: rule__BasicReorientExpression__Group_2_5__0__Impl rule__BasicReorientExpression__Group_2_5__1
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2_5__0__Impl_in_rule__BasicReorientExpression__Group_2_5__08832);
            rule__BasicReorientExpression__Group_2_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2_5__1_in_rule__BasicReorientExpression__Group_2_5__08835);
            rule__BasicReorientExpression__Group_2_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2_5__0"


    // $ANTLR start "rule__BasicReorientExpression__Group_2_5__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4383:1: rule__BasicReorientExpression__Group_2_5__0__Impl : ( ',' ) ;
    public final void rule__BasicReorientExpression__Group_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4387:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4388:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4388:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4389:1: ','
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getCommaKeyword_2_5_0()); 
            match(input,49,FOLLOW_49_in_rule__BasicReorientExpression__Group_2_5__0__Impl8863); 
             after(grammarAccess.getBasicReorientExpressionAccess().getCommaKeyword_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2_5__0__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group_2_5__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4402:1: rule__BasicReorientExpression__Group_2_5__1 : rule__BasicReorientExpression__Group_2_5__1__Impl rule__BasicReorientExpression__Group_2_5__2 ;
    public final void rule__BasicReorientExpression__Group_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4406:1: ( rule__BasicReorientExpression__Group_2_5__1__Impl rule__BasicReorientExpression__Group_2_5__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4407:2: rule__BasicReorientExpression__Group_2_5__1__Impl rule__BasicReorientExpression__Group_2_5__2
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2_5__1__Impl_in_rule__BasicReorientExpression__Group_2_5__18894);
            rule__BasicReorientExpression__Group_2_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2_5__2_in_rule__BasicReorientExpression__Group_2_5__18897);
            rule__BasicReorientExpression__Group_2_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2_5__1"


    // $ANTLR start "rule__BasicReorientExpression__Group_2_5__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4414:1: rule__BasicReorientExpression__Group_2_5__1__Impl : ( '(' ) ;
    public final void rule__BasicReorientExpression__Group_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4418:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4419:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4419:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4420:1: '('
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getLeftParenthesisKeyword_2_5_1()); 
            match(input,46,FOLLOW_46_in_rule__BasicReorientExpression__Group_2_5__1__Impl8925); 
             after(grammarAccess.getBasicReorientExpressionAccess().getLeftParenthesisKeyword_2_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2_5__1__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group_2_5__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4433:1: rule__BasicReorientExpression__Group_2_5__2 : rule__BasicReorientExpression__Group_2_5__2__Impl rule__BasicReorientExpression__Group_2_5__3 ;
    public final void rule__BasicReorientExpression__Group_2_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4437:1: ( rule__BasicReorientExpression__Group_2_5__2__Impl rule__BasicReorientExpression__Group_2_5__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4438:2: rule__BasicReorientExpression__Group_2_5__2__Impl rule__BasicReorientExpression__Group_2_5__3
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2_5__2__Impl_in_rule__BasicReorientExpression__Group_2_5__28956);
            rule__BasicReorientExpression__Group_2_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2_5__3_in_rule__BasicReorientExpression__Group_2_5__28959);
            rule__BasicReorientExpression__Group_2_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2_5__2"


    // $ANTLR start "rule__BasicReorientExpression__Group_2_5__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4445:1: rule__BasicReorientExpression__Group_2_5__2__Impl : ( ( rule__BasicReorientExpression__AxisAssignment_2_5_2 ) ) ;
    public final void rule__BasicReorientExpression__Group_2_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4449:1: ( ( ( rule__BasicReorientExpression__AxisAssignment_2_5_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4450:1: ( ( rule__BasicReorientExpression__AxisAssignment_2_5_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4450:1: ( ( rule__BasicReorientExpression__AxisAssignment_2_5_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4451:1: ( rule__BasicReorientExpression__AxisAssignment_2_5_2 )
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getAxisAssignment_2_5_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4452:1: ( rule__BasicReorientExpression__AxisAssignment_2_5_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4452:2: rule__BasicReorientExpression__AxisAssignment_2_5_2
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__AxisAssignment_2_5_2_in_rule__BasicReorientExpression__Group_2_5__2__Impl8986);
            rule__BasicReorientExpression__AxisAssignment_2_5_2();

            state._fsp--;


            }

             after(grammarAccess.getBasicReorientExpressionAccess().getAxisAssignment_2_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2_5__2__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group_2_5__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4462:1: rule__BasicReorientExpression__Group_2_5__3 : rule__BasicReorientExpression__Group_2_5__3__Impl rule__BasicReorientExpression__Group_2_5__4 ;
    public final void rule__BasicReorientExpression__Group_2_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4466:1: ( rule__BasicReorientExpression__Group_2_5__3__Impl rule__BasicReorientExpression__Group_2_5__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4467:2: rule__BasicReorientExpression__Group_2_5__3__Impl rule__BasicReorientExpression__Group_2_5__4
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2_5__3__Impl_in_rule__BasicReorientExpression__Group_2_5__39016);
            rule__BasicReorientExpression__Group_2_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2_5__4_in_rule__BasicReorientExpression__Group_2_5__39019);
            rule__BasicReorientExpression__Group_2_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2_5__3"


    // $ANTLR start "rule__BasicReorientExpression__Group_2_5__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4474:1: rule__BasicReorientExpression__Group_2_5__3__Impl : ( ',' ) ;
    public final void rule__BasicReorientExpression__Group_2_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4478:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4479:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4479:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4480:1: ','
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getCommaKeyword_2_5_3()); 
            match(input,49,FOLLOW_49_in_rule__BasicReorientExpression__Group_2_5__3__Impl9047); 
             after(grammarAccess.getBasicReorientExpressionAccess().getCommaKeyword_2_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2_5__3__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group_2_5__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4493:1: rule__BasicReorientExpression__Group_2_5__4 : rule__BasicReorientExpression__Group_2_5__4__Impl rule__BasicReorientExpression__Group_2_5__5 ;
    public final void rule__BasicReorientExpression__Group_2_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4497:1: ( rule__BasicReorientExpression__Group_2_5__4__Impl rule__BasicReorientExpression__Group_2_5__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4498:2: rule__BasicReorientExpression__Group_2_5__4__Impl rule__BasicReorientExpression__Group_2_5__5
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2_5__4__Impl_in_rule__BasicReorientExpression__Group_2_5__49078);
            rule__BasicReorientExpression__Group_2_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2_5__5_in_rule__BasicReorientExpression__Group_2_5__49081);
            rule__BasicReorientExpression__Group_2_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2_5__4"


    // $ANTLR start "rule__BasicReorientExpression__Group_2_5__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4505:1: rule__BasicReorientExpression__Group_2_5__4__Impl : ( ( rule__BasicReorientExpression__ValueAssignment_2_5_4 ) ) ;
    public final void rule__BasicReorientExpression__Group_2_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4509:1: ( ( ( rule__BasicReorientExpression__ValueAssignment_2_5_4 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4510:1: ( ( rule__BasicReorientExpression__ValueAssignment_2_5_4 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4510:1: ( ( rule__BasicReorientExpression__ValueAssignment_2_5_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4511:1: ( rule__BasicReorientExpression__ValueAssignment_2_5_4 )
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getValueAssignment_2_5_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4512:1: ( rule__BasicReorientExpression__ValueAssignment_2_5_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4512:2: rule__BasicReorientExpression__ValueAssignment_2_5_4
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__ValueAssignment_2_5_4_in_rule__BasicReorientExpression__Group_2_5__4__Impl9108);
            rule__BasicReorientExpression__ValueAssignment_2_5_4();

            state._fsp--;


            }

             after(grammarAccess.getBasicReorientExpressionAccess().getValueAssignment_2_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2_5__4__Impl"


    // $ANTLR start "rule__BasicReorientExpression__Group_2_5__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4522:1: rule__BasicReorientExpression__Group_2_5__5 : rule__BasicReorientExpression__Group_2_5__5__Impl ;
    public final void rule__BasicReorientExpression__Group_2_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4526:1: ( rule__BasicReorientExpression__Group_2_5__5__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4527:2: rule__BasicReorientExpression__Group_2_5__5__Impl
            {
            pushFollow(FOLLOW_rule__BasicReorientExpression__Group_2_5__5__Impl_in_rule__BasicReorientExpression__Group_2_5__59138);
            rule__BasicReorientExpression__Group_2_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2_5__5"


    // $ANTLR start "rule__BasicReorientExpression__Group_2_5__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4533:1: rule__BasicReorientExpression__Group_2_5__5__Impl : ( ')' ) ;
    public final void rule__BasicReorientExpression__Group_2_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4537:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4538:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4538:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4539:1: ')'
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getRightParenthesisKeyword_2_5_5()); 
            match(input,50,FOLLOW_50_in_rule__BasicReorientExpression__Group_2_5__5__Impl9166); 
             after(grammarAccess.getBasicReorientExpressionAccess().getRightParenthesisKeyword_2_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__Group_2_5__5__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4564:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4568:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4569:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__09209);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__09212);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4576:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4580:1: ( ( 'constraint' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4581:1: ( 'constraint' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4581:1: ( 'constraint' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4582:1: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__Constraint__Group__0__Impl9240); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4595:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4599:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4600:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__19271);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__19274);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4607:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4611:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4612:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4612:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4613:1: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4614:1: ( rule__Constraint__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4614:2: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constraint__NameAssignment_1_in_rule__Constraint__Group__1__Impl9301);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4624:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4628:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4629:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__29331);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__29334);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4636:1: rule__Constraint__Group__2__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4640:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4641:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4641:1: ( ':' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4642:1: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Constraint__Group__2__Impl9362); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4655:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4659:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4660:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__39393);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__39396);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4667:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__TypeAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4671:1: ( ( ( rule__Constraint__TypeAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4672:1: ( ( rule__Constraint__TypeAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4672:1: ( ( rule__Constraint__TypeAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4673:1: ( rule__Constraint__TypeAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getTypeAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4674:1: ( rule__Constraint__TypeAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4674:2: rule__Constraint__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Constraint__TypeAssignment_3_in_rule__Constraint__Group__3__Impl9423);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4684:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4688:1: ( rule__Constraint__Group__4__Impl rule__Constraint__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4689:2: rule__Constraint__Group__4__Impl rule__Constraint__Group__5
            {
            pushFollow(FOLLOW_rule__Constraint__Group__4__Impl_in_rule__Constraint__Group__49453);
            rule__Constraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__49456);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4696:1: rule__Constraint__Group__4__Impl : ( 'between' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4700:1: ( ( 'between' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4701:1: ( 'between' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4701:1: ( 'between' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4702:1: 'between'
            {
             before(grammarAccess.getConstraintAccess().getBetweenKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__Constraint__Group__4__Impl9484); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4715:1: rule__Constraint__Group__5 : rule__Constraint__Group__5__Impl rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4719:1: ( rule__Constraint__Group__5__Impl rule__Constraint__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4720:2: rule__Constraint__Group__5__Impl rule__Constraint__Group__6
            {
            pushFollow(FOLLOW_rule__Constraint__Group__5__Impl_in_rule__Constraint__Group__59515);
            rule__Constraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__59518);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4727:1: rule__Constraint__Group__5__Impl : ( ( rule__Constraint__Body1Assignment_5 ) ) ;
    public final void rule__Constraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4731:1: ( ( ( rule__Constraint__Body1Assignment_5 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4732:1: ( ( rule__Constraint__Body1Assignment_5 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4732:1: ( ( rule__Constraint__Body1Assignment_5 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4733:1: ( rule__Constraint__Body1Assignment_5 )
            {
             before(grammarAccess.getConstraintAccess().getBody1Assignment_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4734:1: ( rule__Constraint__Body1Assignment_5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4734:2: rule__Constraint__Body1Assignment_5
            {
            pushFollow(FOLLOW_rule__Constraint__Body1Assignment_5_in_rule__Constraint__Group__5__Impl9545);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4744:1: rule__Constraint__Group__6 : rule__Constraint__Group__6__Impl rule__Constraint__Group__7 ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4748:1: ( rule__Constraint__Group__6__Impl rule__Constraint__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4749:2: rule__Constraint__Group__6__Impl rule__Constraint__Group__7
            {
            pushFollow(FOLLOW_rule__Constraint__Group__6__Impl_in_rule__Constraint__Group__69575);
            rule__Constraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__69578);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4756:1: rule__Constraint__Group__6__Impl : ( ( rule__Constraint__RelTrans1Assignment_6 ) ) ;
    public final void rule__Constraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4760:1: ( ( ( rule__Constraint__RelTrans1Assignment_6 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4761:1: ( ( rule__Constraint__RelTrans1Assignment_6 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4761:1: ( ( rule__Constraint__RelTrans1Assignment_6 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4762:1: ( rule__Constraint__RelTrans1Assignment_6 )
            {
             before(grammarAccess.getConstraintAccess().getRelTrans1Assignment_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4763:1: ( rule__Constraint__RelTrans1Assignment_6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4763:2: rule__Constraint__RelTrans1Assignment_6
            {
            pushFollow(FOLLOW_rule__Constraint__RelTrans1Assignment_6_in_rule__Constraint__Group__6__Impl9605);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4773:1: rule__Constraint__Group__7 : rule__Constraint__Group__7__Impl rule__Constraint__Group__8 ;
    public final void rule__Constraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4777:1: ( rule__Constraint__Group__7__Impl rule__Constraint__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4778:2: rule__Constraint__Group__7__Impl rule__Constraint__Group__8
            {
            pushFollow(FOLLOW_rule__Constraint__Group__7__Impl_in_rule__Constraint__Group__79635);
            rule__Constraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__8_in_rule__Constraint__Group__79638);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4785:1: rule__Constraint__Group__7__Impl : ( 'and' ) ;
    public final void rule__Constraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4789:1: ( ( 'and' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4790:1: ( 'and' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4790:1: ( 'and' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4791:1: 'and'
            {
             before(grammarAccess.getConstraintAccess().getAndKeyword_7()); 
            match(input,36,FOLLOW_36_in_rule__Constraint__Group__7__Impl9666); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4804:1: rule__Constraint__Group__8 : rule__Constraint__Group__8__Impl rule__Constraint__Group__9 ;
    public final void rule__Constraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4808:1: ( rule__Constraint__Group__8__Impl rule__Constraint__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4809:2: rule__Constraint__Group__8__Impl rule__Constraint__Group__9
            {
            pushFollow(FOLLOW_rule__Constraint__Group__8__Impl_in_rule__Constraint__Group__89697);
            rule__Constraint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__9_in_rule__Constraint__Group__89700);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4816:1: rule__Constraint__Group__8__Impl : ( ( rule__Constraint__Body2Assignment_8 ) ) ;
    public final void rule__Constraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4820:1: ( ( ( rule__Constraint__Body2Assignment_8 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4821:1: ( ( rule__Constraint__Body2Assignment_8 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4821:1: ( ( rule__Constraint__Body2Assignment_8 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4822:1: ( rule__Constraint__Body2Assignment_8 )
            {
             before(grammarAccess.getConstraintAccess().getBody2Assignment_8()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4823:1: ( rule__Constraint__Body2Assignment_8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4823:2: rule__Constraint__Body2Assignment_8
            {
            pushFollow(FOLLOW_rule__Constraint__Body2Assignment_8_in_rule__Constraint__Group__8__Impl9727);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4833:1: rule__Constraint__Group__9 : rule__Constraint__Group__9__Impl ;
    public final void rule__Constraint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4837:1: ( rule__Constraint__Group__9__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4838:2: rule__Constraint__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__9__Impl_in_rule__Constraint__Group__99757);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4844:1: rule__Constraint__Group__9__Impl : ( ( rule__Constraint__RelTrans2Assignment_9 ) ) ;
    public final void rule__Constraint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4848:1: ( ( ( rule__Constraint__RelTrans2Assignment_9 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4849:1: ( ( rule__Constraint__RelTrans2Assignment_9 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4849:1: ( ( rule__Constraint__RelTrans2Assignment_9 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4850:1: ( rule__Constraint__RelTrans2Assignment_9 )
            {
             before(grammarAccess.getConstraintAccess().getRelTrans2Assignment_9()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4851:1: ( rule__Constraint__RelTrans2Assignment_9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4851:2: rule__Constraint__RelTrans2Assignment_9
            {
            pushFollow(FOLLOW_rule__Constraint__RelTrans2Assignment_9_in_rule__Constraint__Group__9__Impl9784);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4881:1: rule__ExternalLoad__Group__0 : rule__ExternalLoad__Group__0__Impl rule__ExternalLoad__Group__1 ;
    public final void rule__ExternalLoad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4885:1: ( rule__ExternalLoad__Group__0__Impl rule__ExternalLoad__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4886:2: rule__ExternalLoad__Group__0__Impl rule__ExternalLoad__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__0__Impl_in_rule__ExternalLoad__Group__09834);
            rule__ExternalLoad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__1_in_rule__ExternalLoad__Group__09837);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4893:1: rule__ExternalLoad__Group__0__Impl : ( 'external' ) ;
    public final void rule__ExternalLoad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4897:1: ( ( 'external' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4898:1: ( 'external' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4898:1: ( 'external' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4899:1: 'external'
            {
             before(grammarAccess.getExternalLoadAccess().getExternalKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__ExternalLoad__Group__0__Impl9865); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4912:1: rule__ExternalLoad__Group__1 : rule__ExternalLoad__Group__1__Impl rule__ExternalLoad__Group__2 ;
    public final void rule__ExternalLoad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4916:1: ( rule__ExternalLoad__Group__1__Impl rule__ExternalLoad__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4917:2: rule__ExternalLoad__Group__1__Impl rule__ExternalLoad__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__1__Impl_in_rule__ExternalLoad__Group__19896);
            rule__ExternalLoad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__2_in_rule__ExternalLoad__Group__19899);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4924:1: rule__ExternalLoad__Group__1__Impl : ( 'load' ) ;
    public final void rule__ExternalLoad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4928:1: ( ( 'load' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4929:1: ( 'load' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4929:1: ( 'load' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4930:1: 'load'
            {
             before(grammarAccess.getExternalLoadAccess().getLoadKeyword_1()); 
            match(input,54,FOLLOW_54_in_rule__ExternalLoad__Group__1__Impl9927); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4943:1: rule__ExternalLoad__Group__2 : rule__ExternalLoad__Group__2__Impl rule__ExternalLoad__Group__3 ;
    public final void rule__ExternalLoad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4947:1: ( rule__ExternalLoad__Group__2__Impl rule__ExternalLoad__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4948:2: rule__ExternalLoad__Group__2__Impl rule__ExternalLoad__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__2__Impl_in_rule__ExternalLoad__Group__29958);
            rule__ExternalLoad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__3_in_rule__ExternalLoad__Group__29961);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4955:1: rule__ExternalLoad__Group__2__Impl : ( ( rule__ExternalLoad__NameAssignment_2 ) ) ;
    public final void rule__ExternalLoad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4959:1: ( ( ( rule__ExternalLoad__NameAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4960:1: ( ( rule__ExternalLoad__NameAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4960:1: ( ( rule__ExternalLoad__NameAssignment_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4961:1: ( rule__ExternalLoad__NameAssignment_2 )
            {
             before(grammarAccess.getExternalLoadAccess().getNameAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4962:1: ( rule__ExternalLoad__NameAssignment_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4962:2: rule__ExternalLoad__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ExternalLoad__NameAssignment_2_in_rule__ExternalLoad__Group__2__Impl9988);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4972:1: rule__ExternalLoad__Group__3 : rule__ExternalLoad__Group__3__Impl rule__ExternalLoad__Group__4 ;
    public final void rule__ExternalLoad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4976:1: ( rule__ExternalLoad__Group__3__Impl rule__ExternalLoad__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4977:2: rule__ExternalLoad__Group__3__Impl rule__ExternalLoad__Group__4
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__3__Impl_in_rule__ExternalLoad__Group__310018);
            rule__ExternalLoad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__4_in_rule__ExternalLoad__Group__310021);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4984:1: rule__ExternalLoad__Group__3__Impl : ( ':' ) ;
    public final void rule__ExternalLoad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4988:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4989:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4989:1: ( ':' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4990:1: ':'
            {
             before(grammarAccess.getExternalLoadAccess().getColonKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__ExternalLoad__Group__3__Impl10049); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5003:1: rule__ExternalLoad__Group__4 : rule__ExternalLoad__Group__4__Impl rule__ExternalLoad__Group__5 ;
    public final void rule__ExternalLoad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5007:1: ( rule__ExternalLoad__Group__4__Impl rule__ExternalLoad__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5008:2: rule__ExternalLoad__Group__4__Impl rule__ExternalLoad__Group__5
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__4__Impl_in_rule__ExternalLoad__Group__410080);
            rule__ExternalLoad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__5_in_rule__ExternalLoad__Group__410083);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5015:1: rule__ExternalLoad__Group__4__Impl : ( ( rule__ExternalLoad__TypeAssignment_4 ) ) ;
    public final void rule__ExternalLoad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5019:1: ( ( ( rule__ExternalLoad__TypeAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5020:1: ( ( rule__ExternalLoad__TypeAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5020:1: ( ( rule__ExternalLoad__TypeAssignment_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5021:1: ( rule__ExternalLoad__TypeAssignment_4 )
            {
             before(grammarAccess.getExternalLoadAccess().getTypeAssignment_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5022:1: ( rule__ExternalLoad__TypeAssignment_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5022:2: rule__ExternalLoad__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__ExternalLoad__TypeAssignment_4_in_rule__ExternalLoad__Group__4__Impl10110);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5032:1: rule__ExternalLoad__Group__5 : rule__ExternalLoad__Group__5__Impl rule__ExternalLoad__Group__6 ;
    public final void rule__ExternalLoad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5036:1: ( rule__ExternalLoad__Group__5__Impl rule__ExternalLoad__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5037:2: rule__ExternalLoad__Group__5__Impl rule__ExternalLoad__Group__6
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__5__Impl_in_rule__ExternalLoad__Group__510140);
            rule__ExternalLoad__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__6_in_rule__ExternalLoad__Group__510143);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5044:1: rule__ExternalLoad__Group__5__Impl : ( 'at' ) ;
    public final void rule__ExternalLoad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5048:1: ( ( 'at' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5049:1: ( 'at' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5049:1: ( 'at' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5050:1: 'at'
            {
             before(grammarAccess.getExternalLoadAccess().getAtKeyword_5()); 
            match(input,55,FOLLOW_55_in_rule__ExternalLoad__Group__5__Impl10171); 
             after(grammarAccess.getExternalLoadAccess().getAtKeyword_5()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5063:1: rule__ExternalLoad__Group__6 : rule__ExternalLoad__Group__6__Impl rule__ExternalLoad__Group__7 ;
    public final void rule__ExternalLoad__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5067:1: ( rule__ExternalLoad__Group__6__Impl rule__ExternalLoad__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5068:2: rule__ExternalLoad__Group__6__Impl rule__ExternalLoad__Group__7
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__6__Impl_in_rule__ExternalLoad__Group__610202);
            rule__ExternalLoad__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__7_in_rule__ExternalLoad__Group__610205);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5075:1: rule__ExternalLoad__Group__6__Impl : ( ( rule__ExternalLoad__Body1Assignment_6 ) ) ;
    public final void rule__ExternalLoad__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5079:1: ( ( ( rule__ExternalLoad__Body1Assignment_6 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5080:1: ( ( rule__ExternalLoad__Body1Assignment_6 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5080:1: ( ( rule__ExternalLoad__Body1Assignment_6 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5081:1: ( rule__ExternalLoad__Body1Assignment_6 )
            {
             before(grammarAccess.getExternalLoadAccess().getBody1Assignment_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5082:1: ( rule__ExternalLoad__Body1Assignment_6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5082:2: rule__ExternalLoad__Body1Assignment_6
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Body1Assignment_6_in_rule__ExternalLoad__Group__6__Impl10232);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5092:1: rule__ExternalLoad__Group__7 : rule__ExternalLoad__Group__7__Impl rule__ExternalLoad__Group__8 ;
    public final void rule__ExternalLoad__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5096:1: ( rule__ExternalLoad__Group__7__Impl rule__ExternalLoad__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5097:2: rule__ExternalLoad__Group__7__Impl rule__ExternalLoad__Group__8
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__7__Impl_in_rule__ExternalLoad__Group__710262);
            rule__ExternalLoad__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__8_in_rule__ExternalLoad__Group__710265);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5104:1: rule__ExternalLoad__Group__7__Impl : ( '(' ) ;
    public final void rule__ExternalLoad__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5108:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5109:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5109:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5110:1: '('
            {
             before(grammarAccess.getExternalLoadAccess().getLeftParenthesisKeyword_7()); 
            match(input,46,FOLLOW_46_in_rule__ExternalLoad__Group__7__Impl10293); 
             after(grammarAccess.getExternalLoadAccess().getLeftParenthesisKeyword_7()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5123:1: rule__ExternalLoad__Group__8 : rule__ExternalLoad__Group__8__Impl rule__ExternalLoad__Group__9 ;
    public final void rule__ExternalLoad__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5127:1: ( rule__ExternalLoad__Group__8__Impl rule__ExternalLoad__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5128:2: rule__ExternalLoad__Group__8__Impl rule__ExternalLoad__Group__9
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__8__Impl_in_rule__ExternalLoad__Group__810324);
            rule__ExternalLoad__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__9_in_rule__ExternalLoad__Group__810327);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5135:1: rule__ExternalLoad__Group__8__Impl : ( 'with' ) ;
    public final void rule__ExternalLoad__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5139:1: ( ( 'with' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5140:1: ( 'with' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5140:1: ( 'with' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5141:1: 'with'
            {
             before(grammarAccess.getExternalLoadAccess().getWithKeyword_8()); 
            match(input,38,FOLLOW_38_in_rule__ExternalLoad__Group__8__Impl10355); 
             after(grammarAccess.getExternalLoadAccess().getWithKeyword_8()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5154:1: rule__ExternalLoad__Group__9 : rule__ExternalLoad__Group__9__Impl rule__ExternalLoad__Group__10 ;
    public final void rule__ExternalLoad__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5158:1: ( rule__ExternalLoad__Group__9__Impl rule__ExternalLoad__Group__10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5159:2: rule__ExternalLoad__Group__9__Impl rule__ExternalLoad__Group__10
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__9__Impl_in_rule__ExternalLoad__Group__910386);
            rule__ExternalLoad__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__10_in_rule__ExternalLoad__Group__910389);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5166:1: rule__ExternalLoad__Group__9__Impl : ( 'relative' ) ;
    public final void rule__ExternalLoad__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5170:1: ( ( 'relative' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5171:1: ( 'relative' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5171:1: ( 'relative' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5172:1: 'relative'
            {
             before(grammarAccess.getExternalLoadAccess().getRelativeKeyword_9()); 
            match(input,47,FOLLOW_47_in_rule__ExternalLoad__Group__9__Impl10417); 
             after(grammarAccess.getExternalLoadAccess().getRelativeKeyword_9()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5185:1: rule__ExternalLoad__Group__10 : rule__ExternalLoad__Group__10__Impl rule__ExternalLoad__Group__11 ;
    public final void rule__ExternalLoad__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5189:1: ( rule__ExternalLoad__Group__10__Impl rule__ExternalLoad__Group__11 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5190:2: rule__ExternalLoad__Group__10__Impl rule__ExternalLoad__Group__11
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__10__Impl_in_rule__ExternalLoad__Group__1010448);
            rule__ExternalLoad__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__11_in_rule__ExternalLoad__Group__1010451);
            rule__ExternalLoad__Group__11();

            state._fsp--;


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5197:1: rule__ExternalLoad__Group__10__Impl : ( 'transformation' ) ;
    public final void rule__ExternalLoad__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5201:1: ( ( 'transformation' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5202:1: ( 'transformation' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5202:1: ( 'transformation' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5203:1: 'transformation'
            {
             before(grammarAccess.getExternalLoadAccess().getTransformationKeyword_10()); 
            match(input,48,FOLLOW_48_in_rule__ExternalLoad__Group__10__Impl10479); 
             after(grammarAccess.getExternalLoadAccess().getTransformationKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExternalLoad__Group__11"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5216:1: rule__ExternalLoad__Group__11 : rule__ExternalLoad__Group__11__Impl rule__ExternalLoad__Group__12 ;
    public final void rule__ExternalLoad__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5220:1: ( rule__ExternalLoad__Group__11__Impl rule__ExternalLoad__Group__12 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5221:2: rule__ExternalLoad__Group__11__Impl rule__ExternalLoad__Group__12
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__11__Impl_in_rule__ExternalLoad__Group__1110510);
            rule__ExternalLoad__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLoad__Group__12_in_rule__ExternalLoad__Group__1110513);
            rule__ExternalLoad__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLoad__Group__11"


    // $ANTLR start "rule__ExternalLoad__Group__11__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5228:1: rule__ExternalLoad__Group__11__Impl : ( ( rule__ExternalLoad__PositionAssignment_11 ) ) ;
    public final void rule__ExternalLoad__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5232:1: ( ( ( rule__ExternalLoad__PositionAssignment_11 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5233:1: ( ( rule__ExternalLoad__PositionAssignment_11 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5233:1: ( ( rule__ExternalLoad__PositionAssignment_11 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5234:1: ( rule__ExternalLoad__PositionAssignment_11 )
            {
             before(grammarAccess.getExternalLoadAccess().getPositionAssignment_11()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5235:1: ( rule__ExternalLoad__PositionAssignment_11 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5235:2: rule__ExternalLoad__PositionAssignment_11
            {
            pushFollow(FOLLOW_rule__ExternalLoad__PositionAssignment_11_in_rule__ExternalLoad__Group__11__Impl10540);
            rule__ExternalLoad__PositionAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getExternalLoadAccess().getPositionAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLoad__Group__11__Impl"


    // $ANTLR start "rule__ExternalLoad__Group__12"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5245:1: rule__ExternalLoad__Group__12 : rule__ExternalLoad__Group__12__Impl ;
    public final void rule__ExternalLoad__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5249:1: ( rule__ExternalLoad__Group__12__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5250:2: rule__ExternalLoad__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__ExternalLoad__Group__12__Impl_in_rule__ExternalLoad__Group__1210570);
            rule__ExternalLoad__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLoad__Group__12"


    // $ANTLR start "rule__ExternalLoad__Group__12__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5256:1: rule__ExternalLoad__Group__12__Impl : ( ')' ) ;
    public final void rule__ExternalLoad__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5260:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5261:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5261:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5262:1: ')'
            {
             before(grammarAccess.getExternalLoadAccess().getRightParenthesisKeyword_12()); 
            match(input,50,FOLLOW_50_in_rule__ExternalLoad__Group__12__Impl10598); 
             after(grammarAccess.getExternalLoadAccess().getRightParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLoad__Group__12__Impl"


    // $ANTLR start "rule__BaseMatrix__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5301:1: rule__BaseMatrix__Group__0 : rule__BaseMatrix__Group__0__Impl rule__BaseMatrix__Group__1 ;
    public final void rule__BaseMatrix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5305:1: ( rule__BaseMatrix__Group__0__Impl rule__BaseMatrix__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5306:2: rule__BaseMatrix__Group__0__Impl rule__BaseMatrix__Group__1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__0__Impl_in_rule__BaseMatrix__Group__010655);
            rule__BaseMatrix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group__1_in_rule__BaseMatrix__Group__010658);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5313:1: rule__BaseMatrix__Group__0__Impl : ( ( rule__BaseMatrix__Group_0__0 )? ) ;
    public final void rule__BaseMatrix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5317:1: ( ( ( rule__BaseMatrix__Group_0__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5318:1: ( ( rule__BaseMatrix__Group_0__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5318:1: ( ( rule__BaseMatrix__Group_0__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5319:1: ( rule__BaseMatrix__Group_0__0 )?
            {
             before(grammarAccess.getBaseMatrixAccess().getGroup_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5320:1: ( rule__BaseMatrix__Group_0__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==58) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5320:2: rule__BaseMatrix__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BaseMatrix__Group_0__0_in_rule__BaseMatrix__Group__0__Impl10685);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5330:1: rule__BaseMatrix__Group__1 : rule__BaseMatrix__Group__1__Impl rule__BaseMatrix__Group__2 ;
    public final void rule__BaseMatrix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5334:1: ( rule__BaseMatrix__Group__1__Impl rule__BaseMatrix__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5335:2: rule__BaseMatrix__Group__1__Impl rule__BaseMatrix__Group__2
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__1__Impl_in_rule__BaseMatrix__Group__110716);
            rule__BaseMatrix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group__2_in_rule__BaseMatrix__Group__110719);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5342:1: rule__BaseMatrix__Group__1__Impl : ( '[' ) ;
    public final void rule__BaseMatrix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5346:1: ( ( '[' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5347:1: ( '[' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5347:1: ( '[' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5348:1: '['
            {
             before(grammarAccess.getBaseMatrixAccess().getLeftSquareBracketKeyword_1()); 
            match(input,56,FOLLOW_56_in_rule__BaseMatrix__Group__1__Impl10747); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5361:1: rule__BaseMatrix__Group__2 : rule__BaseMatrix__Group__2__Impl rule__BaseMatrix__Group__3 ;
    public final void rule__BaseMatrix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5365:1: ( rule__BaseMatrix__Group__2__Impl rule__BaseMatrix__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5366:2: rule__BaseMatrix__Group__2__Impl rule__BaseMatrix__Group__3
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__2__Impl_in_rule__BaseMatrix__Group__210778);
            rule__BaseMatrix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group__3_in_rule__BaseMatrix__Group__210781);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5373:1: rule__BaseMatrix__Group__2__Impl : ( ( rule__BaseMatrix__ValuesAssignment_2 ) ) ;
    public final void rule__BaseMatrix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5377:1: ( ( ( rule__BaseMatrix__ValuesAssignment_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5378:1: ( ( rule__BaseMatrix__ValuesAssignment_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5378:1: ( ( rule__BaseMatrix__ValuesAssignment_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5379:1: ( rule__BaseMatrix__ValuesAssignment_2 )
            {
             before(grammarAccess.getBaseMatrixAccess().getValuesAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5380:1: ( rule__BaseMatrix__ValuesAssignment_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5380:2: rule__BaseMatrix__ValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__BaseMatrix__ValuesAssignment_2_in_rule__BaseMatrix__Group__2__Impl10808);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5390:1: rule__BaseMatrix__Group__3 : rule__BaseMatrix__Group__3__Impl rule__BaseMatrix__Group__4 ;
    public final void rule__BaseMatrix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5394:1: ( rule__BaseMatrix__Group__3__Impl rule__BaseMatrix__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5395:2: rule__BaseMatrix__Group__3__Impl rule__BaseMatrix__Group__4
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__3__Impl_in_rule__BaseMatrix__Group__310838);
            rule__BaseMatrix__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group__4_in_rule__BaseMatrix__Group__310841);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5402:1: rule__BaseMatrix__Group__3__Impl : ( ( rule__BaseMatrix__Group_3__0 )* ) ;
    public final void rule__BaseMatrix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5406:1: ( ( ( rule__BaseMatrix__Group_3__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5407:1: ( ( rule__BaseMatrix__Group_3__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5407:1: ( ( rule__BaseMatrix__Group_3__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5408:1: ( rule__BaseMatrix__Group_3__0 )*
            {
             before(grammarAccess.getBaseMatrixAccess().getGroup_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5409:1: ( rule__BaseMatrix__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==49) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5409:2: rule__BaseMatrix__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__BaseMatrix__Group_3__0_in_rule__BaseMatrix__Group__3__Impl10868);
            	    rule__BaseMatrix__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5419:1: rule__BaseMatrix__Group__4 : rule__BaseMatrix__Group__4__Impl ;
    public final void rule__BaseMatrix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5423:1: ( rule__BaseMatrix__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5424:2: rule__BaseMatrix__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group__4__Impl_in_rule__BaseMatrix__Group__410899);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5430:1: rule__BaseMatrix__Group__4__Impl : ( ']' ) ;
    public final void rule__BaseMatrix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5434:1: ( ( ']' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5435:1: ( ']' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5435:1: ( ']' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5436:1: ']'
            {
             before(grammarAccess.getBaseMatrixAccess().getRightSquareBracketKeyword_4()); 
            match(input,57,FOLLOW_57_in_rule__BaseMatrix__Group__4__Impl10927); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5459:1: rule__BaseMatrix__Group_0__0 : rule__BaseMatrix__Group_0__0__Impl rule__BaseMatrix__Group_0__1 ;
    public final void rule__BaseMatrix__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5463:1: ( rule__BaseMatrix__Group_0__0__Impl rule__BaseMatrix__Group_0__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5464:2: rule__BaseMatrix__Group_0__0__Impl rule__BaseMatrix__Group_0__1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group_0__0__Impl_in_rule__BaseMatrix__Group_0__010968);
            rule__BaseMatrix__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group_0__1_in_rule__BaseMatrix__Group_0__010971);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5471:1: rule__BaseMatrix__Group_0__0__Impl : ( 'matrix' ) ;
    public final void rule__BaseMatrix__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5475:1: ( ( 'matrix' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5476:1: ( 'matrix' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5476:1: ( 'matrix' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5477:1: 'matrix'
            {
             before(grammarAccess.getBaseMatrixAccess().getMatrixKeyword_0_0()); 
            match(input,58,FOLLOW_58_in_rule__BaseMatrix__Group_0__0__Impl10999); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5490:1: rule__BaseMatrix__Group_0__1 : rule__BaseMatrix__Group_0__1__Impl ;
    public final void rule__BaseMatrix__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5494:1: ( rule__BaseMatrix__Group_0__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5495:2: rule__BaseMatrix__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group_0__1__Impl_in_rule__BaseMatrix__Group_0__111030);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5501:1: rule__BaseMatrix__Group_0__1__Impl : ( ( rule__BaseMatrix__NameAssignment_0_1 ) ) ;
    public final void rule__BaseMatrix__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5505:1: ( ( ( rule__BaseMatrix__NameAssignment_0_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5506:1: ( ( rule__BaseMatrix__NameAssignment_0_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5506:1: ( ( rule__BaseMatrix__NameAssignment_0_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5507:1: ( rule__BaseMatrix__NameAssignment_0_1 )
            {
             before(grammarAccess.getBaseMatrixAccess().getNameAssignment_0_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5508:1: ( rule__BaseMatrix__NameAssignment_0_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5508:2: rule__BaseMatrix__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__NameAssignment_0_1_in_rule__BaseMatrix__Group_0__1__Impl11057);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5522:1: rule__BaseMatrix__Group_3__0 : rule__BaseMatrix__Group_3__0__Impl rule__BaseMatrix__Group_3__1 ;
    public final void rule__BaseMatrix__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5526:1: ( rule__BaseMatrix__Group_3__0__Impl rule__BaseMatrix__Group_3__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5527:2: rule__BaseMatrix__Group_3__0__Impl rule__BaseMatrix__Group_3__1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group_3__0__Impl_in_rule__BaseMatrix__Group_3__011091);
            rule__BaseMatrix__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix__Group_3__1_in_rule__BaseMatrix__Group_3__011094);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5534:1: rule__BaseMatrix__Group_3__0__Impl : ( ',' ) ;
    public final void rule__BaseMatrix__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5538:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5539:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5539:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5540:1: ','
            {
             before(grammarAccess.getBaseMatrixAccess().getCommaKeyword_3_0()); 
            match(input,49,FOLLOW_49_in_rule__BaseMatrix__Group_3__0__Impl11122); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5553:1: rule__BaseMatrix__Group_3__1 : rule__BaseMatrix__Group_3__1__Impl ;
    public final void rule__BaseMatrix__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5557:1: ( rule__BaseMatrix__Group_3__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5558:2: rule__BaseMatrix__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseMatrix__Group_3__1__Impl_in_rule__BaseMatrix__Group_3__111153);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5564:1: rule__BaseMatrix__Group_3__1__Impl : ( ( rule__BaseMatrix__ValuesAssignment_3_1 ) ) ;
    public final void rule__BaseMatrix__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5568:1: ( ( ( rule__BaseMatrix__ValuesAssignment_3_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5569:1: ( ( rule__BaseMatrix__ValuesAssignment_3_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5569:1: ( ( rule__BaseMatrix__ValuesAssignment_3_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5570:1: ( rule__BaseMatrix__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getBaseMatrixAccess().getValuesAssignment_3_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5571:1: ( rule__BaseMatrix__ValuesAssignment_3_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5571:2: rule__BaseMatrix__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__BaseMatrix__ValuesAssignment_3_1_in_rule__BaseMatrix__Group_3__1__Impl11180);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5585:1: rule__AddExp__Group__0 : rule__AddExp__Group__0__Impl rule__AddExp__Group__1 ;
    public final void rule__AddExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5589:1: ( rule__AddExp__Group__0__Impl rule__AddExp__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5590:2: rule__AddExp__Group__0__Impl rule__AddExp__Group__1
            {
            pushFollow(FOLLOW_rule__AddExp__Group__0__Impl_in_rule__AddExp__Group__011214);
            rule__AddExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddExp__Group__1_in_rule__AddExp__Group__011217);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5597:1: rule__AddExp__Group__0__Impl : ( ruleMultExp ) ;
    public final void rule__AddExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5601:1: ( ( ruleMultExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5602:1: ( ruleMultExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5602:1: ( ruleMultExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5603:1: ruleMultExp
            {
             before(grammarAccess.getAddExpAccess().getMultExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultExp_in_rule__AddExp__Group__0__Impl11244);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5614:1: rule__AddExp__Group__1 : rule__AddExp__Group__1__Impl ;
    public final void rule__AddExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5618:1: ( rule__AddExp__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5619:2: rule__AddExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AddExp__Group__1__Impl_in_rule__AddExp__Group__111273);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5625:1: rule__AddExp__Group__1__Impl : ( ( rule__AddExp__Group_1__0 )* ) ;
    public final void rule__AddExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5629:1: ( ( ( rule__AddExp__Group_1__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5630:1: ( ( rule__AddExp__Group_1__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5630:1: ( ( rule__AddExp__Group_1__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5631:1: ( rule__AddExp__Group_1__0 )*
            {
             before(grammarAccess.getAddExpAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5632:1: ( rule__AddExp__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=12 && LA28_0<=13)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5632:2: rule__AddExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AddExp__Group_1__0_in_rule__AddExp__Group__1__Impl11300);
            	    rule__AddExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5646:1: rule__AddExp__Group_1__0 : rule__AddExp__Group_1__0__Impl rule__AddExp__Group_1__1 ;
    public final void rule__AddExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5650:1: ( rule__AddExp__Group_1__0__Impl rule__AddExp__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5651:2: rule__AddExp__Group_1__0__Impl rule__AddExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AddExp__Group_1__0__Impl_in_rule__AddExp__Group_1__011335);
            rule__AddExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddExp__Group_1__1_in_rule__AddExp__Group_1__011338);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5658:1: rule__AddExp__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5662:1: ( ( () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5663:1: ( () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5663:1: ( () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5664:1: ()
            {
             before(grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5665:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5667:1: 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5677:1: rule__AddExp__Group_1__1 : rule__AddExp__Group_1__1__Impl rule__AddExp__Group_1__2 ;
    public final void rule__AddExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5681:1: ( rule__AddExp__Group_1__1__Impl rule__AddExp__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5682:2: rule__AddExp__Group_1__1__Impl rule__AddExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__AddExp__Group_1__1__Impl_in_rule__AddExp__Group_1__111396);
            rule__AddExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddExp__Group_1__2_in_rule__AddExp__Group_1__111399);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5689:1: rule__AddExp__Group_1__1__Impl : ( ( rule__AddExp__OpAssignment_1_1 ) ) ;
    public final void rule__AddExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5693:1: ( ( ( rule__AddExp__OpAssignment_1_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5694:1: ( ( rule__AddExp__OpAssignment_1_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5694:1: ( ( rule__AddExp__OpAssignment_1_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5695:1: ( rule__AddExp__OpAssignment_1_1 )
            {
             before(grammarAccess.getAddExpAccess().getOpAssignment_1_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5696:1: ( rule__AddExp__OpAssignment_1_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5696:2: rule__AddExp__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AddExp__OpAssignment_1_1_in_rule__AddExp__Group_1__1__Impl11426);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5706:1: rule__AddExp__Group_1__2 : rule__AddExp__Group_1__2__Impl ;
    public final void rule__AddExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5710:1: ( rule__AddExp__Group_1__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5711:2: rule__AddExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AddExp__Group_1__2__Impl_in_rule__AddExp__Group_1__211456);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5717:1: rule__AddExp__Group_1__2__Impl : ( ( rule__AddExp__RightAssignment_1_2 ) ) ;
    public final void rule__AddExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5721:1: ( ( ( rule__AddExp__RightAssignment_1_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5722:1: ( ( rule__AddExp__RightAssignment_1_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5722:1: ( ( rule__AddExp__RightAssignment_1_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5723:1: ( rule__AddExp__RightAssignment_1_2 )
            {
             before(grammarAccess.getAddExpAccess().getRightAssignment_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5724:1: ( rule__AddExp__RightAssignment_1_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5724:2: rule__AddExp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AddExp__RightAssignment_1_2_in_rule__AddExp__Group_1__2__Impl11483);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5740:1: rule__MultExp__Group__0 : rule__MultExp__Group__0__Impl rule__MultExp__Group__1 ;
    public final void rule__MultExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5744:1: ( rule__MultExp__Group__0__Impl rule__MultExp__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5745:2: rule__MultExp__Group__0__Impl rule__MultExp__Group__1
            {
            pushFollow(FOLLOW_rule__MultExp__Group__0__Impl_in_rule__MultExp__Group__011519);
            rule__MultExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultExp__Group__1_in_rule__MultExp__Group__011522);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5752:1: rule__MultExp__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MultExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5756:1: ( ( rulePrimary ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5757:1: ( rulePrimary )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5757:1: ( rulePrimary )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5758:1: rulePrimary
            {
             before(grammarAccess.getMultExpAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MultExp__Group__0__Impl11549);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5769:1: rule__MultExp__Group__1 : rule__MultExp__Group__1__Impl ;
    public final void rule__MultExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5773:1: ( rule__MultExp__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5774:2: rule__MultExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultExp__Group__1__Impl_in_rule__MultExp__Group__111578);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5780:1: rule__MultExp__Group__1__Impl : ( ( rule__MultExp__Group_1__0 )* ) ;
    public final void rule__MultExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5784:1: ( ( ( rule__MultExp__Group_1__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5785:1: ( ( rule__MultExp__Group_1__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5785:1: ( ( rule__MultExp__Group_1__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5786:1: ( rule__MultExp__Group_1__0 )*
            {
             before(grammarAccess.getMultExpAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5787:1: ( rule__MultExp__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=14 && LA29_0<=15)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5787:2: rule__MultExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultExp__Group_1__0_in_rule__MultExp__Group__1__Impl11605);
            	    rule__MultExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5801:1: rule__MultExp__Group_1__0 : rule__MultExp__Group_1__0__Impl rule__MultExp__Group_1__1 ;
    public final void rule__MultExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5805:1: ( rule__MultExp__Group_1__0__Impl rule__MultExp__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5806:2: rule__MultExp__Group_1__0__Impl rule__MultExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultExp__Group_1__0__Impl_in_rule__MultExp__Group_1__011640);
            rule__MultExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultExp__Group_1__1_in_rule__MultExp__Group_1__011643);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5813:1: rule__MultExp__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5817:1: ( ( () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5818:1: ( () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5818:1: ( () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5819:1: ()
            {
             before(grammarAccess.getMultExpAccess().getMultExpLeftAction_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5820:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5822:1: 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5832:1: rule__MultExp__Group_1__1 : rule__MultExp__Group_1__1__Impl rule__MultExp__Group_1__2 ;
    public final void rule__MultExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5836:1: ( rule__MultExp__Group_1__1__Impl rule__MultExp__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5837:2: rule__MultExp__Group_1__1__Impl rule__MultExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultExp__Group_1__1__Impl_in_rule__MultExp__Group_1__111701);
            rule__MultExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultExp__Group_1__2_in_rule__MultExp__Group_1__111704);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5844:1: rule__MultExp__Group_1__1__Impl : ( ( rule__MultExp__OpAssignment_1_1 ) ) ;
    public final void rule__MultExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5848:1: ( ( ( rule__MultExp__OpAssignment_1_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5849:1: ( ( rule__MultExp__OpAssignment_1_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5849:1: ( ( rule__MultExp__OpAssignment_1_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5850:1: ( rule__MultExp__OpAssignment_1_1 )
            {
             before(grammarAccess.getMultExpAccess().getOpAssignment_1_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5851:1: ( rule__MultExp__OpAssignment_1_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5851:2: rule__MultExp__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultExp__OpAssignment_1_1_in_rule__MultExp__Group_1__1__Impl11731);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5861:1: rule__MultExp__Group_1__2 : rule__MultExp__Group_1__2__Impl ;
    public final void rule__MultExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5865:1: ( rule__MultExp__Group_1__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5866:2: rule__MultExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultExp__Group_1__2__Impl_in_rule__MultExp__Group_1__211761);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5872:1: rule__MultExp__Group_1__2__Impl : ( ( rule__MultExp__RightAssignment_1_2 ) ) ;
    public final void rule__MultExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5876:1: ( ( ( rule__MultExp__RightAssignment_1_2 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5877:1: ( ( rule__MultExp__RightAssignment_1_2 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5877:1: ( ( rule__MultExp__RightAssignment_1_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5878:1: ( rule__MultExp__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultExpAccess().getRightAssignment_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5879:1: ( rule__MultExp__RightAssignment_1_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5879:2: rule__MultExp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MultExp__RightAssignment_1_2_in_rule__MultExp__Group_1__2__Impl11788);
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


    // $ANTLR start "rule__ParenthesisedExp__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5895:1: rule__ParenthesisedExp__Group__0 : rule__ParenthesisedExp__Group__0__Impl rule__ParenthesisedExp__Group__1 ;
    public final void rule__ParenthesisedExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5899:1: ( rule__ParenthesisedExp__Group__0__Impl rule__ParenthesisedExp__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5900:2: rule__ParenthesisedExp__Group__0__Impl rule__ParenthesisedExp__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisedExp__Group__0__Impl_in_rule__ParenthesisedExp__Group__011824);
            rule__ParenthesisedExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenthesisedExp__Group__1_in_rule__ParenthesisedExp__Group__011827);
            rule__ParenthesisedExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisedExp__Group__0"


    // $ANTLR start "rule__ParenthesisedExp__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5907:1: rule__ParenthesisedExp__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisedExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5911:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5912:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5912:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5913:1: '('
            {
             before(grammarAccess.getParenthesisedExpAccess().getLeftParenthesisKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__ParenthesisedExp__Group__0__Impl11855); 
             after(grammarAccess.getParenthesisedExpAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisedExp__Group__0__Impl"


    // $ANTLR start "rule__ParenthesisedExp__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5926:1: rule__ParenthesisedExp__Group__1 : rule__ParenthesisedExp__Group__1__Impl rule__ParenthesisedExp__Group__2 ;
    public final void rule__ParenthesisedExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5930:1: ( rule__ParenthesisedExp__Group__1__Impl rule__ParenthesisedExp__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5931:2: rule__ParenthesisedExp__Group__1__Impl rule__ParenthesisedExp__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisedExp__Group__1__Impl_in_rule__ParenthesisedExp__Group__111886);
            rule__ParenthesisedExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenthesisedExp__Group__2_in_rule__ParenthesisedExp__Group__111889);
            rule__ParenthesisedExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisedExp__Group__1"


    // $ANTLR start "rule__ParenthesisedExp__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5938:1: rule__ParenthesisedExp__Group__1__Impl : ( ( rule__ParenthesisedExp__ExpAssignment_1 ) ) ;
    public final void rule__ParenthesisedExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5942:1: ( ( ( rule__ParenthesisedExp__ExpAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5943:1: ( ( rule__ParenthesisedExp__ExpAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5943:1: ( ( rule__ParenthesisedExp__ExpAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5944:1: ( rule__ParenthesisedExp__ExpAssignment_1 )
            {
             before(grammarAccess.getParenthesisedExpAccess().getExpAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5945:1: ( rule__ParenthesisedExp__ExpAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5945:2: rule__ParenthesisedExp__ExpAssignment_1
            {
            pushFollow(FOLLOW_rule__ParenthesisedExp__ExpAssignment_1_in_rule__ParenthesisedExp__Group__1__Impl11916);
            rule__ParenthesisedExp__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisedExpAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisedExp__Group__1__Impl"


    // $ANTLR start "rule__ParenthesisedExp__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5955:1: rule__ParenthesisedExp__Group__2 : rule__ParenthesisedExp__Group__2__Impl ;
    public final void rule__ParenthesisedExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5959:1: ( rule__ParenthesisedExp__Group__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5960:2: rule__ParenthesisedExp__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisedExp__Group__2__Impl_in_rule__ParenthesisedExp__Group__211946);
            rule__ParenthesisedExp__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisedExp__Group__2"


    // $ANTLR start "rule__ParenthesisedExp__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5966:1: rule__ParenthesisedExp__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisedExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5970:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5971:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5971:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5972:1: ')'
            {
             before(grammarAccess.getParenthesisedExpAccess().getRightParenthesisKeyword_2()); 
            match(input,50,FOLLOW_50_in_rule__ParenthesisedExp__Group__2__Impl11974); 
             after(grammarAccess.getParenthesisedExpAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisedExp__Group__2__Impl"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5991:1: rule__ConstantOrFunctionCallExp__Group__0 : rule__ConstantOrFunctionCallExp__Group__0__Impl rule__ConstantOrFunctionCallExp__Group__1 ;
    public final void rule__ConstantOrFunctionCallExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5995:1: ( rule__ConstantOrFunctionCallExp__Group__0__Impl rule__ConstantOrFunctionCallExp__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:5996:2: rule__ConstantOrFunctionCallExp__Group__0__Impl rule__ConstantOrFunctionCallExp__Group__1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group__0__Impl_in_rule__ConstantOrFunctionCallExp__Group__012011);
            rule__ConstantOrFunctionCallExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group__1_in_rule__ConstantOrFunctionCallExp__Group__012014);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6003:1: rule__ConstantOrFunctionCallExp__Group__0__Impl : ( ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 ) ) ;
    public final void rule__ConstantOrFunctionCallExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6007:1: ( ( ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6008:1: ( ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6008:1: ( ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6009:1: ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 )
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getLabelAssignment_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6010:1: ( rule__ConstantOrFunctionCallExp__LabelAssignment_0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6010:2: rule__ConstantOrFunctionCallExp__LabelAssignment_0
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__LabelAssignment_0_in_rule__ConstantOrFunctionCallExp__Group__0__Impl12041);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6020:1: rule__ConstantOrFunctionCallExp__Group__1 : rule__ConstantOrFunctionCallExp__Group__1__Impl ;
    public final void rule__ConstantOrFunctionCallExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6024:1: ( rule__ConstantOrFunctionCallExp__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6025:2: rule__ConstantOrFunctionCallExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group__1__Impl_in_rule__ConstantOrFunctionCallExp__Group__112071);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6031:1: rule__ConstantOrFunctionCallExp__Group__1__Impl : ( ( rule__ConstantOrFunctionCallExp__Group_1__0 )? ) ;
    public final void rule__ConstantOrFunctionCallExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6035:1: ( ( ( rule__ConstantOrFunctionCallExp__Group_1__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6036:1: ( ( rule__ConstantOrFunctionCallExp__Group_1__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6036:1: ( ( rule__ConstantOrFunctionCallExp__Group_1__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6037:1: ( rule__ConstantOrFunctionCallExp__Group_1__0 )?
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6038:1: ( rule__ConstantOrFunctionCallExp__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6038:2: rule__ConstantOrFunctionCallExp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__0_in_rule__ConstantOrFunctionCallExp__Group__1__Impl12098);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6052:1: rule__ConstantOrFunctionCallExp__Group_1__0 : rule__ConstantOrFunctionCallExp__Group_1__0__Impl rule__ConstantOrFunctionCallExp__Group_1__1 ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6056:1: ( rule__ConstantOrFunctionCallExp__Group_1__0__Impl rule__ConstantOrFunctionCallExp__Group_1__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6057:2: rule__ConstantOrFunctionCallExp__Group_1__0__Impl rule__ConstantOrFunctionCallExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__0__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__012133);
            rule__ConstantOrFunctionCallExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__1_in_rule__ConstantOrFunctionCallExp__Group_1__012136);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6064:1: rule__ConstantOrFunctionCallExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6068:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6069:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6069:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6070:1: '('
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__ConstantOrFunctionCallExp__Group_1__0__Impl12164); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6083:1: rule__ConstantOrFunctionCallExp__Group_1__1 : rule__ConstantOrFunctionCallExp__Group_1__1__Impl rule__ConstantOrFunctionCallExp__Group_1__2 ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6087:1: ( rule__ConstantOrFunctionCallExp__Group_1__1__Impl rule__ConstantOrFunctionCallExp__Group_1__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6088:2: rule__ConstantOrFunctionCallExp__Group_1__1__Impl rule__ConstantOrFunctionCallExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__1__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__112195);
            rule__ConstantOrFunctionCallExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__2_in_rule__ConstantOrFunctionCallExp__Group_1__112198);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6095:1: rule__ConstantOrFunctionCallExp__Group_1__1__Impl : ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 ) ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6099:1: ( ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6100:1: ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6100:1: ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6101:1: ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 )
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAssignment_1_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6102:1: ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6102:2: rule__ConstantOrFunctionCallExp__ParamAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__ParamAssignment_1_1_in_rule__ConstantOrFunctionCallExp__Group_1__1__Impl12225);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6112:1: rule__ConstantOrFunctionCallExp__Group_1__2 : rule__ConstantOrFunctionCallExp__Group_1__2__Impl rule__ConstantOrFunctionCallExp__Group_1__3 ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6116:1: ( rule__ConstantOrFunctionCallExp__Group_1__2__Impl rule__ConstantOrFunctionCallExp__Group_1__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6117:2: rule__ConstantOrFunctionCallExp__Group_1__2__Impl rule__ConstantOrFunctionCallExp__Group_1__3
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__2__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__212255);
            rule__ConstantOrFunctionCallExp__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__3_in_rule__ConstantOrFunctionCallExp__Group_1__212258);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6124:1: rule__ConstantOrFunctionCallExp__Group_1__2__Impl : ( ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )* ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6128:1: ( ( ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6129:1: ( ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6129:1: ( ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6130:1: ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )*
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getGroup_1_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6131:1: ( rule__ConstantOrFunctionCallExp__Group_1_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==49) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6131:2: rule__ConstantOrFunctionCallExp__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__0_in_rule__ConstantOrFunctionCallExp__Group_1__2__Impl12285);
            	    rule__ConstantOrFunctionCallExp__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6141:1: rule__ConstantOrFunctionCallExp__Group_1__3 : rule__ConstantOrFunctionCallExp__Group_1__3__Impl ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6145:1: ( rule__ConstantOrFunctionCallExp__Group_1__3__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6146:2: rule__ConstantOrFunctionCallExp__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__3__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__312316);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6152:1: rule__ConstantOrFunctionCallExp__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6156:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6157:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6157:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6158:1: ')'
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getRightParenthesisKeyword_1_3()); 
            match(input,50,FOLLOW_50_in_rule__ConstantOrFunctionCallExp__Group_1__3__Impl12344); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6179:1: rule__ConstantOrFunctionCallExp__Group_1_2__0 : rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl rule__ConstantOrFunctionCallExp__Group_1_2__1 ;
    public final void rule__ConstantOrFunctionCallExp__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6183:1: ( rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl rule__ConstantOrFunctionCallExp__Group_1_2__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6184:2: rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl rule__ConstantOrFunctionCallExp__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl_in_rule__ConstantOrFunctionCallExp__Group_1_2__012383);
            rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__1_in_rule__ConstantOrFunctionCallExp__Group_1_2__012386);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6191:1: rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6195:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6196:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6196:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6197:1: ','
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getCommaKeyword_1_2_0()); 
            match(input,49,FOLLOW_49_in_rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl12414); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6210:1: rule__ConstantOrFunctionCallExp__Group_1_2__1 : rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl ;
    public final void rule__ConstantOrFunctionCallExp__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6214:1: ( rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6215:2: rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl_in_rule__ConstantOrFunctionCallExp__Group_1_2__112445);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6221:1: rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl : ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 ) ) ;
    public final void rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6225:1: ( ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6226:1: ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6226:1: ( ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6227:1: ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 )
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAssignment_1_2_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6228:1: ( rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6228:2: rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1_in_rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl12472);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6242:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6246:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6247:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__0__Impl_in_rule__NumberLiteral__Group__012506);
            rule__NumberLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberLiteral__Group__1_in_rule__NumberLiteral__Group__012509);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6254:1: rule__NumberLiteral__Group__0__Impl : ( ( rule__NumberLiteral__NegAssignment_0 )? ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6258:1: ( ( ( rule__NumberLiteral__NegAssignment_0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6259:1: ( ( rule__NumberLiteral__NegAssignment_0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6259:1: ( ( rule__NumberLiteral__NegAssignment_0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6260:1: ( rule__NumberLiteral__NegAssignment_0 )?
            {
             before(grammarAccess.getNumberLiteralAccess().getNegAssignment_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6261:1: ( rule__NumberLiteral__NegAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==13) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6261:2: rule__NumberLiteral__NegAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NumberLiteral__NegAssignment_0_in_rule__NumberLiteral__Group__0__Impl12536);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6271:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6275:1: ( rule__NumberLiteral__Group__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6276:2: rule__NumberLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__1__Impl_in_rule__NumberLiteral__Group__112567);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6282:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6286:1: ( ( ( rule__NumberLiteral__ValueAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6287:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6287:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6288:1: ( rule__NumberLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6289:1: ( rule__NumberLiteral__ValueAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6289:2: rule__NumberLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NumberLiteral__ValueAssignment_1_in_rule__NumberLiteral__Group__1__Impl12594);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6304:1: rule__Model__DefsAssignment_0 : ( ruleInitialDefinition ) ;
    public final void rule__Model__DefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6308:1: ( ( ruleInitialDefinition ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6309:1: ( ruleInitialDefinition )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6309:1: ( ruleInitialDefinition )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6310:1: ruleInitialDefinition
            {
             before(grammarAccess.getModelAccess().getDefsInitialDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInitialDefinition_in_rule__Model__DefsAssignment_012633);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6319:1: rule__Model__WorldAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__Model__WorldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6323:1: ( ( ruleEnvironment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6324:1: ( ruleEnvironment )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6324:1: ( ruleEnvironment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6325:1: ruleEnvironment
            {
             before(grammarAccess.getModelAccess().getWorldEnvironmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnvironment_in_rule__Model__WorldAssignment_112664);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6334:1: rule__Model__BodiesAssignment_2 : ( ruleSystem ) ;
    public final void rule__Model__BodiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6338:1: ( ( ruleSystem ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6339:1: ( ruleSystem )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6339:1: ( ruleSystem )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6340:1: ruleSystem
            {
             before(grammarAccess.getModelAccess().getBodiesSystemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSystem_in_rule__Model__BodiesAssignment_212695);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6349:1: rule__Environment__GravityAssignment_3 : ( ruleMatrix ) ;
    public final void rule__Environment__GravityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6353:1: ( ( ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6354:1: ( ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6354:1: ( ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6355:1: ruleMatrix
            {
             before(grammarAccess.getEnvironmentAccess().getGravityMatrixParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__Environment__GravityAssignment_312726);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6364:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6368:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6369:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6369:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6370:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__NameAssignment_112757); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6379:1: rule__System__ElementsAssignment_3 : ( ruleSystemElement ) ;
    public final void rule__System__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6383:1: ( ( ruleSystemElement ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6384:1: ( ruleSystemElement )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6384:1: ( ruleSystemElement )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6385:1: ruleSystemElement
            {
             before(grammarAccess.getSystemAccess().getElementsSystemElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSystemElement_in_rule__System__ElementsAssignment_312788);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6394:1: rule__Body__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Body__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6398:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6399:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6399:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6400:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__NameAssignment_112819); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6409:1: rule__Body__MassAssignment_3 : ( ruleMass ) ;
    public final void rule__Body__MassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6413:1: ( ( ruleMass ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6414:1: ( ruleMass )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6414:1: ( ruleMass )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6415:1: ruleMass
            {
             before(grammarAccess.getBodyAccess().getMassMassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMass_in_rule__Body__MassAssignment_312850);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6424:1: rule__BodyReference__BaseAssignment_0 : ( ( 'base' ) ) ;
    public final void rule__BodyReference__BaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6428:1: ( ( ( 'base' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6429:1: ( ( 'base' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6429:1: ( ( 'base' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6430:1: ( 'base' )
            {
             before(grammarAccess.getBodyReferenceAccess().getBaseBaseKeyword_0_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6431:1: ( 'base' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6432:1: 'base'
            {
             before(grammarAccess.getBodyReferenceAccess().getBaseBaseKeyword_0_0()); 
            match(input,59,FOLLOW_59_in_rule__BodyReference__BaseAssignment_012886); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6447:1: rule__BodyReference__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__BodyReference__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6451:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6452:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6452:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6453:1: ( RULE_ID )
            {
             before(grammarAccess.getBodyReferenceAccess().getRefBodyCrossReference_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6454:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6455:1: RULE_ID
            {
             before(grammarAccess.getBodyReferenceAccess().getRefBodyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyReference__RefAssignment_112929); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6466:1: rule__Mass__ValueAssignment_3 : ( ruleAddExp ) ;
    public final void rule__Mass__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6470:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6471:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6471:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6472:1: ruleAddExp
            {
             before(grammarAccess.getMassAccess().getValueAddExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__Mass__ValueAssignment_312964);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6481:1: rule__Mass__PositionAssignment_5 : ( ruleMatrix ) ;
    public final void rule__Mass__PositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6485:1: ( ( ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6486:1: ( ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6486:1: ( ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6487:1: ruleMatrix
            {
             before(grammarAccess.getMassAccess().getPositionMatrixParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__Mass__PositionAssignment_512995);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6496:1: rule__Mass__InertiaAssignment_7 : ( ruleMatrix ) ;
    public final void rule__Mass__InertiaAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6500:1: ( ( ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6501:1: ( ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6501:1: ( ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6502:1: ruleMatrix
            {
             before(grammarAccess.getMassAccess().getInertiaMatrixParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__Mass__InertiaAssignment_713026);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6511:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6515:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6516:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6516:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6517:1: RULE_ID
            {
             before(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Joint__NameAssignment_113057); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6526:1: rule__Joint__TypeAssignment_3 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6530:1: ( ( ruleJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6531:1: ( ruleJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6531:1: ( ruleJointType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6532:1: ruleJointType
            {
             before(grammarAccess.getJointAccess().getTypeJointTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleJointType_in_rule__Joint__TypeAssignment_313088);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6541:1: rule__Joint__IsStartAssignment_4 : ( ( 'start' ) ) ;
    public final void rule__Joint__IsStartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6545:1: ( ( ( 'start' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6546:1: ( ( 'start' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6546:1: ( ( 'start' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6547:1: ( 'start' )
            {
             before(grammarAccess.getJointAccess().getIsStartStartKeyword_4_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6548:1: ( 'start' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6549:1: 'start'
            {
             before(grammarAccess.getJointAccess().getIsStartStartKeyword_4_0()); 
            match(input,60,FOLLOW_60_in_rule__Joint__IsStartAssignment_413124); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6564:1: rule__Joint__Body1Assignment_6 : ( ruleBodyReference ) ;
    public final void rule__Joint__Body1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6568:1: ( ( ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6569:1: ( ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6569:1: ( ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6570:1: ruleBodyReference
            {
             before(grammarAccess.getJointAccess().getBody1BodyReferenceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleBodyReference_in_rule__Joint__Body1Assignment_613163);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6579:1: rule__Joint__RelTrans1Assignment_7 : ( ruleRelativeTransformation ) ;
    public final void rule__Joint__RelTrans1Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6583:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6584:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6584:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6585:1: ruleRelativeTransformation
            {
             before(grammarAccess.getJointAccess().getRelTrans1RelativeTransformationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__Joint__RelTrans1Assignment_713194);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6594:1: rule__Joint__Body2Assignment_9 : ( ruleBodyReference ) ;
    public final void rule__Joint__Body2Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6598:1: ( ( ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6599:1: ( ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6599:1: ( ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6600:1: ruleBodyReference
            {
             before(grammarAccess.getJointAccess().getBody2BodyReferenceParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleBodyReference_in_rule__Joint__Body2Assignment_913225);
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


    // $ANTLR start "rule__JointType__NameAssignment_0_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6609:1: rule__JointType__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__JointType__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6613:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6614:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6614:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6615:1: RULE_ID
            {
             before(grammarAccess.getJointTypeAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JointType__NameAssignment_0_213256); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6624:1: rule__JointType__ExpAssignment_1 : ( ruleAdditiveJointType ) ;
    public final void rule__JointType__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6628:1: ( ( ruleAdditiveJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6629:1: ( ruleAdditiveJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6629:1: ( ruleAdditiveJointType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6630:1: ruleAdditiveJointType
            {
             before(grammarAccess.getJointTypeAccess().getExpAdditiveJointTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAdditiveJointType_in_rule__JointType__ExpAssignment_113287);
            ruleAdditiveJointType();

            state._fsp--;

             after(grammarAccess.getJointTypeAccess().getExpAdditiveJointTypeParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__AdditiveJointType__RightAssignment_1_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6639:1: rule__AdditiveJointType__RightAssignment_1_2 : ( rulePrimaryJointType ) ;
    public final void rule__AdditiveJointType__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6643:1: ( ( rulePrimaryJointType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6644:1: ( rulePrimaryJointType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6644:1: ( rulePrimaryJointType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6645:1: rulePrimaryJointType
            {
             before(grammarAccess.getAdditiveJointTypeAccess().getRightPrimaryJointTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimaryJointType_in_rule__AdditiveJointType__RightAssignment_1_213318);
            rulePrimaryJointType();

            state._fsp--;

             after(grammarAccess.getAdditiveJointTypeAccess().getRightPrimaryJointTypeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveJointType__RightAssignment_1_2"


    // $ANTLR start "rule__JointTypeReference__RefAssignment"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6654:1: rule__JointTypeReference__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__JointTypeReference__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6658:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6659:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6659:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6660:1: ( RULE_ID )
            {
             before(grammarAccess.getJointTypeReferenceAccess().getRefJointTypeCrossReference_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6661:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6662:1: RULE_ID
            {
             before(grammarAccess.getJointTypeReferenceAccess().getRefJointTypeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JointTypeReference__RefAssignment13353); 
             after(grammarAccess.getJointTypeReferenceAccess().getRefJointTypeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getJointTypeReferenceAccess().getRefJointTypeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointTypeReference__RefAssignment"


    // $ANTLR start "rule__BasicJointType__TypeAssignment_0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6673:1: rule__BasicJointType__TypeAssignment_0 : ( ruleJointMovement ) ;
    public final void rule__BasicJointType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6677:1: ( ( ruleJointMovement ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6678:1: ( ruleJointMovement )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6678:1: ( ruleJointMovement )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6679:1: ruleJointMovement
            {
             before(grammarAccess.getBasicJointTypeAccess().getTypeJointMovementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJointMovement_in_rule__BasicJointType__TypeAssignment_013388);
            ruleJointMovement();

            state._fsp--;

             after(grammarAccess.getBasicJointTypeAccess().getTypeJointMovementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicJointType__TypeAssignment_0"


    // $ANTLR start "rule__BasicJointType__StiffnessAssignment_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6688:1: rule__BasicJointType__StiffnessAssignment_2 : ( ruleStiffnessExp ) ;
    public final void rule__BasicJointType__StiffnessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6692:1: ( ( ruleStiffnessExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6693:1: ( ruleStiffnessExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6693:1: ( ruleStiffnessExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6694:1: ruleStiffnessExp
            {
             before(grammarAccess.getBasicJointTypeAccess().getStiffnessStiffnessExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStiffnessExp_in_rule__BasicJointType__StiffnessAssignment_213419);
            ruleStiffnessExp();

            state._fsp--;

             after(grammarAccess.getBasicJointTypeAccess().getStiffnessStiffnessExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicJointType__StiffnessAssignment_2"


    // $ANTLR start "rule__Revolute__AxisAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6703:1: rule__Revolute__AxisAssignment_1 : ( ruleAXIS ) ;
    public final void rule__Revolute__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6707:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6708:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6708:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6709:1: ruleAXIS
            {
             before(grammarAccess.getRevoluteAccess().getAxisAXISEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__Revolute__AxisAssignment_113450);
            ruleAXIS();

            state._fsp--;

             after(grammarAccess.getRevoluteAccess().getAxisAXISEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Revolute__AxisAssignment_1"


    // $ANTLR start "rule__Planar__AxisAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6718:1: rule__Planar__AxisAssignment_1 : ( ruleAXIS ) ;
    public final void rule__Planar__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6722:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6723:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6723:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6724:1: ruleAXIS
            {
             before(grammarAccess.getPlanarAccess().getAxisAXISEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__Planar__AxisAssignment_113481);
            ruleAXIS();

            state._fsp--;

             after(grammarAccess.getPlanarAccess().getAxisAXISEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planar__AxisAssignment_1"


    // $ANTLR start "rule__StiffnessRef__RefAssignment"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6733:1: rule__StiffnessRef__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__StiffnessRef__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6737:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6738:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6738:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6739:1: ( RULE_ID )
            {
             before(grammarAccess.getStiffnessRefAccess().getRefBaseStiffnessExpCrossReference_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6740:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6741:1: RULE_ID
            {
             before(grammarAccess.getStiffnessRefAccess().getRefBaseStiffnessExpIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StiffnessRef__RefAssignment13516); 
             after(grammarAccess.getStiffnessRefAccess().getRefBaseStiffnessExpIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getStiffnessRefAccess().getRefBaseStiffnessExpCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StiffnessRef__RefAssignment"


    // $ANTLR start "rule__BaseStiffnessExp__NameAssignment_0_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6752:1: rule__BaseStiffnessExp__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__BaseStiffnessExp__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6756:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6757:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6757:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6758:1: RULE_ID
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BaseStiffnessExp__NameAssignment_0_113551); 
             after(grammarAccess.getBaseStiffnessExpAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__NameAssignment_0_1"


    // $ANTLR start "rule__BaseStiffnessExp__SpringCoeffAssignment_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6767:1: rule__BaseStiffnessExp__SpringCoeffAssignment_3 : ( ruleAddExp ) ;
    public final void rule__BaseStiffnessExp__SpringCoeffAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6771:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6772:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6772:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6773:1: ruleAddExp
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getSpringCoeffAddExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__BaseStiffnessExp__SpringCoeffAssignment_313582);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getBaseStiffnessExpAccess().getSpringCoeffAddExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__SpringCoeffAssignment_3"


    // $ANTLR start "rule__BaseStiffnessExp__SpringInitAssignment_5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6782:1: rule__BaseStiffnessExp__SpringInitAssignment_5 : ( ruleAddExp ) ;
    public final void rule__BaseStiffnessExp__SpringInitAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6786:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6787:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6787:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6788:1: ruleAddExp
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getSpringInitAddExpParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__BaseStiffnessExp__SpringInitAssignment_513613);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getBaseStiffnessExpAccess().getSpringInitAddExpParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__SpringInitAssignment_5"


    // $ANTLR start "rule__BaseStiffnessExp__DampViscousAssignment_7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6797:1: rule__BaseStiffnessExp__DampViscousAssignment_7 : ( ruleAddExp ) ;
    public final void rule__BaseStiffnessExp__DampViscousAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6801:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6802:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6802:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6803:1: ruleAddExp
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getDampViscousAddExpParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__BaseStiffnessExp__DampViscousAssignment_713644);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getBaseStiffnessExpAccess().getDampViscousAddExpParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__DampViscousAssignment_7"


    // $ANTLR start "rule__BaseStiffnessExp__DampCoulombAssignment_9"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6812:1: rule__BaseStiffnessExp__DampCoulombAssignment_9 : ( ruleAddExp ) ;
    public final void rule__BaseStiffnessExp__DampCoulombAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6816:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6817:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6817:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6818:1: ruleAddExp
            {
             before(grammarAccess.getBaseStiffnessExpAccess().getDampCoulombAddExpParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__BaseStiffnessExp__DampCoulombAssignment_913675);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getBaseStiffnessExpAccess().getDampCoulombAddExpParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseStiffnessExp__DampCoulombAssignment_9"


    // $ANTLR start "rule__RelativeTransformation__PositionAssignment_4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6827:1: rule__RelativeTransformation__PositionAssignment_4 : ( ruleMatrix ) ;
    public final void rule__RelativeTransformation__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6831:1: ( ( ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6832:1: ( ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6832:1: ( ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6833:1: ruleMatrix
            {
             before(grammarAccess.getRelativeTransformationAccess().getPositionMatrixParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__RelativeTransformation__PositionAssignment_413706);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6842:1: rule__RelativeTransformation__ReorientAssignment_6 : ( ruleReorientation ) ;
    public final void rule__RelativeTransformation__ReorientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6846:1: ( ( ruleReorientation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6847:1: ( ruleReorientation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6847:1: ( ruleReorientation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6848:1: ruleReorientation
            {
             before(grammarAccess.getRelativeTransformationAccess().getReorientReorientationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleReorientation_in_rule__RelativeTransformation__ReorientAssignment_613737);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6857:1: rule__Reorientation__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Reorientation__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6861:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6862:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6862:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6863:1: RULE_ID
            {
             before(grammarAccess.getReorientationAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reorientation__NameAssignment_0_113768); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6872:1: rule__Reorientation__ExpAssignment_1 : ( ruleReorientExpression ) ;
    public final void rule__Reorientation__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6876:1: ( ( ruleReorientExpression ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6877:1: ( ruleReorientExpression )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6877:1: ( ruleReorientExpression )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6878:1: ruleReorientExpression
            {
             before(grammarAccess.getReorientationAccess().getExpReorientExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReorientExpression_in_rule__Reorientation__ExpAssignment_113799);
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


    // $ANTLR start "rule__ReorientRef__RefAssignment"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6887:1: rule__ReorientRef__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ReorientRef__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6891:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6892:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6892:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6893:1: ( RULE_ID )
            {
             before(grammarAccess.getReorientRefAccess().getRefReorientationCrossReference_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6894:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6895:1: RULE_ID
            {
             before(grammarAccess.getReorientRefAccess().getRefReorientationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReorientRef__RefAssignment13834); 
             after(grammarAccess.getReorientRefAccess().getRefReorientationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getReorientRefAccess().getRefReorientationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReorientRef__RefAssignment"


    // $ANTLR start "rule__BasicReorientExpression__AxisAssignment_2_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6906:1: rule__BasicReorientExpression__AxisAssignment_2_1 : ( ruleAXIS ) ;
    public final void rule__BasicReorientExpression__AxisAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6910:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6911:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6911:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6912:1: ruleAXIS
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getAxisAXISEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__BasicReorientExpression__AxisAssignment_2_113869);
            ruleAXIS();

            state._fsp--;

             after(grammarAccess.getBasicReorientExpressionAccess().getAxisAXISEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__AxisAssignment_2_1"


    // $ANTLR start "rule__BasicReorientExpression__ValueAssignment_2_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6921:1: rule__BasicReorientExpression__ValueAssignment_2_3 : ( ruleAddExp ) ;
    public final void rule__BasicReorientExpression__ValueAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6925:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6926:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6926:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6927:1: ruleAddExp
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getValueAddExpParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__BasicReorientExpression__ValueAssignment_2_313900);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getBasicReorientExpressionAccess().getValueAddExpParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__ValueAssignment_2_3"


    // $ANTLR start "rule__BasicReorientExpression__AxisAssignment_2_5_2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6936:1: rule__BasicReorientExpression__AxisAssignment_2_5_2 : ( ruleAXIS ) ;
    public final void rule__BasicReorientExpression__AxisAssignment_2_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6940:1: ( ( ruleAXIS ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6941:1: ( ruleAXIS )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6941:1: ( ruleAXIS )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6942:1: ruleAXIS
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getAxisAXISEnumRuleCall_2_5_2_0()); 
            pushFollow(FOLLOW_ruleAXIS_in_rule__BasicReorientExpression__AxisAssignment_2_5_213931);
            ruleAXIS();

            state._fsp--;

             after(grammarAccess.getBasicReorientExpressionAccess().getAxisAXISEnumRuleCall_2_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__AxisAssignment_2_5_2"


    // $ANTLR start "rule__BasicReorientExpression__ValueAssignment_2_5_4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6951:1: rule__BasicReorientExpression__ValueAssignment_2_5_4 : ( ruleAddExp ) ;
    public final void rule__BasicReorientExpression__ValueAssignment_2_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6955:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6956:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6956:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6957:1: ruleAddExp
            {
             before(grammarAccess.getBasicReorientExpressionAccess().getValueAddExpParserRuleCall_2_5_4_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__BasicReorientExpression__ValueAssignment_2_5_413962);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getBasicReorientExpressionAccess().getValueAddExpParserRuleCall_2_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicReorientExpression__ValueAssignment_2_5_4"


    // $ANTLR start "rule__Constraint__NameAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6966:1: rule__Constraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6970:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6971:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6971:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6972:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constraint__NameAssignment_113993); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6981:1: rule__Constraint__TypeAssignment_3 : ( ruleConstraintType ) ;
    public final void rule__Constraint__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6985:1: ( ( ruleConstraintType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6986:1: ( ruleConstraintType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6986:1: ( ruleConstraintType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6987:1: ruleConstraintType
            {
             before(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConstraintType_in_rule__Constraint__TypeAssignment_314024);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:6996:1: rule__Constraint__Body1Assignment_5 : ( ruleBodyReference ) ;
    public final void rule__Constraint__Body1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7000:1: ( ( ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7001:1: ( ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7001:1: ( ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7002:1: ruleBodyReference
            {
             before(grammarAccess.getConstraintAccess().getBody1BodyReferenceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBodyReference_in_rule__Constraint__Body1Assignment_514055);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7011:1: rule__Constraint__RelTrans1Assignment_6 : ( ruleRelativeTransformation ) ;
    public final void rule__Constraint__RelTrans1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7015:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7016:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7016:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7017:1: ruleRelativeTransformation
            {
             before(grammarAccess.getConstraintAccess().getRelTrans1RelativeTransformationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__Constraint__RelTrans1Assignment_614086);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7026:1: rule__Constraint__Body2Assignment_8 : ( ruleBodyReference ) ;
    public final void rule__Constraint__Body2Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7030:1: ( ( ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7031:1: ( ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7031:1: ( ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7032:1: ruleBodyReference
            {
             before(grammarAccess.getConstraintAccess().getBody2BodyReferenceParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleBodyReference_in_rule__Constraint__Body2Assignment_814117);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7041:1: rule__Constraint__RelTrans2Assignment_9 : ( ruleRelativeTransformation ) ;
    public final void rule__Constraint__RelTrans2Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7045:1: ( ( ruleRelativeTransformation ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7046:1: ( ruleRelativeTransformation )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7046:1: ( ruleRelativeTransformation )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7047:1: ruleRelativeTransformation
            {
             before(grammarAccess.getConstraintAccess().getRelTrans2RelativeTransformationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleRelativeTransformation_in_rule__Constraint__RelTrans2Assignment_914148);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7056:1: rule__ExternalLoad__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExternalLoad__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7060:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7061:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7061:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7062:1: RULE_ID
            {
             before(grammarAccess.getExternalLoadAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExternalLoad__NameAssignment_214179); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7071:1: rule__ExternalLoad__TypeAssignment_4 : ( ruleLoadType ) ;
    public final void rule__ExternalLoad__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7075:1: ( ( ruleLoadType ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7076:1: ( ruleLoadType )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7076:1: ( ruleLoadType )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7077:1: ruleLoadType
            {
             before(grammarAccess.getExternalLoadAccess().getTypeLoadTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleLoadType_in_rule__ExternalLoad__TypeAssignment_414210);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7086:1: rule__ExternalLoad__Body1Assignment_6 : ( ruleBodyReference ) ;
    public final void rule__ExternalLoad__Body1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7090:1: ( ( ruleBodyReference ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7091:1: ( ruleBodyReference )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7091:1: ( ruleBodyReference )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7092:1: ruleBodyReference
            {
             before(grammarAccess.getExternalLoadAccess().getBody1BodyReferenceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleBodyReference_in_rule__ExternalLoad__Body1Assignment_614241);
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


    // $ANTLR start "rule__ExternalLoad__PositionAssignment_11"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7101:1: rule__ExternalLoad__PositionAssignment_11 : ( ruleMatrix ) ;
    public final void rule__ExternalLoad__PositionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7105:1: ( ( ruleMatrix ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7106:1: ( ruleMatrix )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7106:1: ( ruleMatrix )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7107:1: ruleMatrix
            {
             before(grammarAccess.getExternalLoadAccess().getPositionMatrixParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleMatrix_in_rule__ExternalLoad__PositionAssignment_1114272);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getExternalLoadAccess().getPositionMatrixParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLoad__PositionAssignment_11"


    // $ANTLR start "rule__BaseMatrix__NameAssignment_0_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7116:1: rule__BaseMatrix__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__BaseMatrix__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7120:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7121:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7121:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7122:1: RULE_ID
            {
             before(grammarAccess.getBaseMatrixAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BaseMatrix__NameAssignment_0_114303); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7131:1: rule__BaseMatrix__ValuesAssignment_2 : ( ruleAddExp ) ;
    public final void rule__BaseMatrix__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7135:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7136:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7136:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7137:1: ruleAddExp
            {
             before(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__BaseMatrix__ValuesAssignment_214334);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7146:1: rule__BaseMatrix__ValuesAssignment_3_1 : ( ruleAddExp ) ;
    public final void rule__BaseMatrix__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7150:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7151:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7151:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7152:1: ruleAddExp
            {
             before(grammarAccess.getBaseMatrixAccess().getValuesAddExpParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__BaseMatrix__ValuesAssignment_3_114365);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7161:1: rule__MatrixRef__MatrixAssignment : ( ( RULE_ID ) ) ;
    public final void rule__MatrixRef__MatrixAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7165:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7166:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7166:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7167:1: ( RULE_ID )
            {
             before(grammarAccess.getMatrixRefAccess().getMatrixBaseMatrixCrossReference_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7168:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7169:1: RULE_ID
            {
             before(grammarAccess.getMatrixRefAccess().getMatrixBaseMatrixIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MatrixRef__MatrixAssignment14400); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7180:1: rule__AddExp__OpAssignment_1_1 : ( ( rule__AddExp__OpAlternatives_1_1_0 ) ) ;
    public final void rule__AddExp__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7184:1: ( ( ( rule__AddExp__OpAlternatives_1_1_0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7185:1: ( ( rule__AddExp__OpAlternatives_1_1_0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7185:1: ( ( rule__AddExp__OpAlternatives_1_1_0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7186:1: ( rule__AddExp__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getAddExpAccess().getOpAlternatives_1_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7187:1: ( rule__AddExp__OpAlternatives_1_1_0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7187:2: rule__AddExp__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__AddExp__OpAlternatives_1_1_0_in_rule__AddExp__OpAssignment_1_114435);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7196:1: rule__AddExp__RightAssignment_1_2 : ( ruleMultExp ) ;
    public final void rule__AddExp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7200:1: ( ( ruleMultExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7201:1: ( ruleMultExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7201:1: ( ruleMultExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7202:1: ruleMultExp
            {
             before(grammarAccess.getAddExpAccess().getRightMultExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultExp_in_rule__AddExp__RightAssignment_1_214468);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7211:1: rule__MultExp__OpAssignment_1_1 : ( ( rule__MultExp__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MultExp__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7215:1: ( ( ( rule__MultExp__OpAlternatives_1_1_0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7216:1: ( ( rule__MultExp__OpAlternatives_1_1_0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7216:1: ( ( rule__MultExp__OpAlternatives_1_1_0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7217:1: ( rule__MultExp__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultExpAccess().getOpAlternatives_1_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7218:1: ( rule__MultExp__OpAlternatives_1_1_0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7218:2: rule__MultExp__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__MultExp__OpAlternatives_1_1_0_in_rule__MultExp__OpAssignment_1_114499);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7227:1: rule__MultExp__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MultExp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7231:1: ( ( rulePrimary ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7232:1: ( rulePrimary )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7232:1: ( rulePrimary )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7233:1: rulePrimary
            {
             before(grammarAccess.getMultExpAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MultExp__RightAssignment_1_214532);
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


    // $ANTLR start "rule__ParenthesisedExp__ExpAssignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7242:1: rule__ParenthesisedExp__ExpAssignment_1 : ( ruleAddExp ) ;
    public final void rule__ParenthesisedExp__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7246:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7247:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7247:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7248:1: ruleAddExp
            {
             before(grammarAccess.getParenthesisedExpAccess().getExpAddExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__ParenthesisedExp__ExpAssignment_114563);
            ruleAddExp();

            state._fsp--;

             after(grammarAccess.getParenthesisedExpAccess().getExpAddExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisedExp__ExpAssignment_1"


    // $ANTLR start "rule__ConstantOrFunctionCallExp__LabelAssignment_0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7257:1: rule__ConstantOrFunctionCallExp__LabelAssignment_0 : ( RULE_ID ) ;
    public final void rule__ConstantOrFunctionCallExp__LabelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7261:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7262:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7262:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7263:1: RULE_ID
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getLabelIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantOrFunctionCallExp__LabelAssignment_014594); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7272:1: rule__ConstantOrFunctionCallExp__ParamAssignment_1_1 : ( ruleAddExp ) ;
    public final void rule__ConstantOrFunctionCallExp__ParamAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7276:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7277:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7277:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7278:1: ruleAddExp
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__ConstantOrFunctionCallExp__ParamAssignment_1_114625);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7287:1: rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1 : ( ruleAddExp ) ;
    public final void rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7291:1: ( ( ruleAddExp ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7292:1: ( ruleAddExp )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7292:1: ( ruleAddExp )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7293:1: ruleAddExp
            {
             before(grammarAccess.getConstantOrFunctionCallExpAccess().getParamAddExpParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleAddExp_in_rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_114656);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7302:1: rule__NumberLiteral__NegAssignment_0 : ( ( '-' ) ) ;
    public final void rule__NumberLiteral__NegAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7306:1: ( ( ( '-' ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7307:1: ( ( '-' ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7307:1: ( ( '-' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7308:1: ( '-' )
            {
             before(grammarAccess.getNumberLiteralAccess().getNegHyphenMinusKeyword_0_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7309:1: ( '-' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7310:1: '-'
            {
             before(grammarAccess.getNumberLiteralAccess().getNegHyphenMinusKeyword_0_0()); 
            match(input,13,FOLLOW_13_in_rule__NumberLiteral__NegAssignment_014692); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7325:1: rule__NumberLiteral__ValueAssignment_1 : ( RULE_REAL ) ;
    public final void rule__NumberLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7329:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7330:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7330:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:7331:1: RULE_REAL
            {
             before(grammarAccess.getNumberLiteralAccess().getValueREALTerminalRuleCall_1_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__NumberLiteral__ValueAssignment_114731); 
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
    public static final BitSet FOLLOW_ruleConnective_in_entryRuleConnective361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnective368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connective__Alternatives_in_ruleConnective394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0_in_ruleBody454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_entryRuleBodyReference481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyReference488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyReference__Alternatives_in_ruleBodyReference514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_entryRuleMass541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMass548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__0_in_ruleMass574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_entryRuleJoint601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoint608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__0_in_ruleJoint634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_entryRuleJointType661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group__0_in_ruleJointType694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveJointType_in_entryRuleAdditiveJointType721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveJointType728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveJointType__Group__0_in_ruleAdditiveJointType754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryJointType_in_entryRulePrimaryJointType781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryJointType788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryJointType__Alternatives_in_rulePrimaryJointType814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointTypeReference_in_entryRuleJointTypeReference841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointTypeReference848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointTypeReference__RefAssignment_in_ruleJointTypeReference874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicJointType_in_entryRuleBasicJointType901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicJointType908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicJointType__Group__0_in_ruleBasicJointType934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointMovement_in_entryRuleJointMovement961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJointMovement968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointMovement__Alternatives_in_ruleJointMovement994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRevolute_in_entryRuleRevolute1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRevolute1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Revolute__Group__0_in_ruleRevolute1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanar_in_entryRulePlanar1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanar1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planar__Group__0_in_rulePlanar1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStiffnessExp_in_entryRuleStiffnessExp1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStiffnessExp1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StiffnessExp__Alternatives_in_ruleStiffnessExp1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStiffnessRef_in_entryRuleStiffnessRef1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStiffnessRef1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StiffnessRef__RefAssignment_in_ruleStiffnessRef1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseStiffnessExp_in_entryRuleBaseStiffnessExp1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseStiffnessExp1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__0_in_ruleBaseStiffnessExp1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_entryRuleRelativeTransformation1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativeTransformation1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__0_in_ruleRelativeTransformation1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientation_in_entryRuleReorientation1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientation1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group__0_in_ruleReorientation1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientExpression_in_entryRuleReorientExpression1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientExpression1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientExpression__Alternatives_in_ruleReorientExpression1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientRef_in_entryRuleReorientRef1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReorientRef1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReorientRef__RefAssignment_in_ruleReorientRef1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicReorientExpression_in_entryRuleBasicReorientExpression1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicReorientExpression1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group__0_in_ruleBasicReorientExpression1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLoad_in_entryRuleExternalLoad1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalLoad1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__0_in_ruleExternalLoad1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_entryRuleMatrix1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Alternatives_in_ruleMatrix1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_entryRuleBaseMatrix1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseMatrix1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__0_in_ruleBaseMatrix1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRef_in_entryRuleMatrixRef1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrixRef1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixRef__MatrixAssignment_in_ruleMatrixRef1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_entryRuleAddExp1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExp1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group__0_in_ruleAddExp1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_entryRuleMultExp1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExp1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group__0_in_ruleMultExp2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisedExp_in_entryRuleParenthesisedExp2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisedExp2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisedExp__Group__0_in_ruleParenthesisedExp2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantOrFunctionCallExp_in_entryRuleConstantOrFunctionCallExp2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantOrFunctionCallExp2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group__0_in_ruleConstantOrFunctionCallExp2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__0_in_ruleNumberLiteral2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AXIS__Alternatives_in_ruleAXIS2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintType__Alternatives_in_ruleConstraintType2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoadType__Alternatives_in_ruleLoadType2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_rule__InitialDefinition__Alternatives2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_rule__InitialDefinition__Alternatives2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseStiffnessExp_in_rule__InitialDefinition__Alternatives2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__SystemElement__Alternatives2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnective_in_rule__SystemElement__Alternatives2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_rule__Connective__Alternatives2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Connective__Alternatives2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLoad_in_rule__Connective__Alternatives2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyReference__BaseAssignment_0_in_rule__BodyReference__Alternatives2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyReference__RefAssignment_1_in_rule__BodyReference__Alternatives2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointTypeReference_in_rule__PrimaryJointType__Alternatives2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicJointType_in_rule__PrimaryJointType__Alternatives2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRevolute_in_rule__JointMovement__Alternatives2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanar_in_rule__JointMovement__Alternatives2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStiffnessRef_in_rule__StiffnessExp__Alternatives2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseStiffnessExp_in_rule__StiffnessExp__Alternatives2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientRef_in_rule__ReorientExpression__Alternatives2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicReorientExpression_in_rule__ReorientExpression__Alternatives2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix_in_rule__Matrix__Alternatives2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixRef_in_rule__Matrix__Alternatives2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AddExp__OpAlternatives_1_1_02876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AddExp__OpAlternatives_1_1_02896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MultExp__OpAlternatives_1_1_02931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MultExp__OpAlternatives_1_1_02951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_rule__Primary__Alternatives2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisedExp_in_rule__Primary__Alternatives3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantOrFunctionCallExp_in_rule__Primary__Alternatives3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AXIS__Alternatives3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AXIS__Alternatives3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AXIS__Alternatives3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ConstraintType__Alternatives3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ConstraintType__Alternatives3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LoadType__Alternatives3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LoadType__Alternatives3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03241 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DefsAssignment_0_in_rule__Model__Group__0__Impl3271 = new BitSet(new long[]{0x0500218201000012L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13302 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WorldAssignment_1_in_rule__Model__Group__1__Impl3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl3391 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl3403 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__0__Impl_in_rule__Environment__Group__03442 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Environment__Group__1_in_rule__Environment__Group__03445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Environment__Group__0__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__1__Impl_in_rule__Environment__Group__13504 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Environment__Group__2_in_rule__Environment__Group__13507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Environment__Group__1__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__2__Impl_in_rule__Environment__Group__23566 = new BitSet(new long[]{0x0500000000000010L});
    public static final BitSet FOLLOW_rule__Environment__Group__3_in_rule__Environment__Group__23569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Environment__Group__2__Impl3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__3__Impl_in_rule__Environment__Group__33628 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Environment__Group__4_in_rule__Environment__Group__33631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__GravityAssignment_3_in_rule__Environment__Group__3__Impl3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__4__Impl_in_rule__Environment__Group__43688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Environment__Group__4__Impl3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__03757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__03760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__System__Group__0__Impl3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__13819 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__13822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__23879 = new BitSet(new long[]{0x0030000210000000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__23882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__System__Group__2__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__33941 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__33944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl3973 = new BitSet(new long[]{0x0030000210000002L});
    public static final BitSet FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl3985 = new BitSet(new long[]{0x0030000210000002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__44018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__System__Group__4__Impl4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__04087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__04090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Body__Group__0__Impl4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__14149 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__14152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__NameAssignment_1_in_rule__Body__Group__1__Impl4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__24209 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__24212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Body__Group__2__Impl4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__34271 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Body__Group__4_in_rule__Body__Group__34274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__MassAssignment_3_in_rule__Body__Group__3__Impl4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__44331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Body__Group__4__Impl4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__0__Impl_in_rule__Mass__Group__04400 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__1_in_rule__Mass__Group__04403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Mass__Group__0__Impl4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__1__Impl_in_rule__Mass__Group__14462 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__2_in_rule__Mass__Group__14465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Mass__Group__1__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__2__Impl_in_rule__Mass__Group__24524 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__Mass__Group__3_in_rule__Mass__Group__24527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Mass__Group__2__Impl4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__3__Impl_in_rule__Mass__Group__34586 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__4_in_rule__Mass__Group__34589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__ValueAssignment_3_in_rule__Mass__Group__3__Impl4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__4__Impl_in_rule__Mass__Group__44646 = new BitSet(new long[]{0x0500000000000010L});
    public static final BitSet FOLLOW_rule__Mass__Group__5_in_rule__Mass__Group__44649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Mass__Group__4__Impl4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__5__Impl_in_rule__Mass__Group__54708 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__6_in_rule__Mass__Group__54711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__PositionAssignment_5_in_rule__Mass__Group__5__Impl4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__6__Impl_in_rule__Mass__Group__64768 = new BitSet(new long[]{0x0500000000000010L});
    public static final BitSet FOLLOW_rule__Mass__Group__7_in_rule__Mass__Group__64771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Mass__Group__6__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__7__Impl_in_rule__Mass__Group__74830 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__8_in_rule__Mass__Group__74833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__InertiaAssignment_7_in_rule__Mass__Group__7__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__8__Impl_in_rule__Mass__Group__84890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Mass__Group__8__Impl4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__0__Impl_in_rule__Joint__Group__04967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Joint__Group__1_in_rule__Joint__Group__04970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Joint__Group__0__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__1__Impl_in_rule__Joint__Group__15029 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__2_in_rule__Joint__Group__15032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__NameAssignment_1_in_rule__Joint__Group__1__Impl5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__2__Impl_in_rule__Joint__Group__25089 = new BitSet(new long[]{0x0000018200000010L});
    public static final BitSet FOLLOW_rule__Joint__Group__3_in_rule__Joint__Group__25092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Joint__Group__2__Impl5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__3__Impl_in_rule__Joint__Group__35151 = new BitSet(new long[]{0x1000000800000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__4_in_rule__Joint__Group__35154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__TypeAssignment_3_in_rule__Joint__Group__3__Impl5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__4__Impl_in_rule__Joint__Group__45211 = new BitSet(new long[]{0x1000000800000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__5_in_rule__Joint__Group__45214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__IsStartAssignment_4_in_rule__Joint__Group__4__Impl5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__5__Impl_in_rule__Joint__Group__55272 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_rule__Joint__Group__6_in_rule__Joint__Group__55275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Joint__Group__5__Impl5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__6__Impl_in_rule__Joint__Group__65334 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__7_in_rule__Joint__Group__65337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Body1Assignment_6_in_rule__Joint__Group__6__Impl5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__7__Impl_in_rule__Joint__Group__75394 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__8_in_rule__Joint__Group__75397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__RelTrans1Assignment_7_in_rule__Joint__Group__7__Impl5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__8__Impl_in_rule__Joint__Group__85454 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_rule__Joint__Group__9_in_rule__Joint__Group__85457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Joint__Group__8__Impl5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__9__Impl_in_rule__Joint__Group__95516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Body2Assignment_9_in_rule__Joint__Group__9__Impl5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group__0__Impl_in_rule__JointType__Group__05593 = new BitSet(new long[]{0x0000018200000010L});
    public static final BitSet FOLLOW_rule__JointType__Group__1_in_rule__JointType__Group__05596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__0_in_rule__JointType__Group__0__Impl5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group__1__Impl_in_rule__JointType__Group__15654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__ExpAssignment_1_in_rule__JointType__Group__1__Impl5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__0__Impl_in_rule__JointType__Group_0__05715 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__1_in_rule__JointType__Group_0__05718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__JointType__Group_0__0__Impl5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__1__Impl_in_rule__JointType__Group_0__15777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__2_in_rule__JointType__Group_0__15780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__JointType__Group_0__1__Impl5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__Group_0__2__Impl_in_rule__JointType__Group_0__25839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JointType__NameAssignment_0_2_in_rule__JointType__Group_0__2__Impl5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveJointType__Group__0__Impl_in_rule__AdditiveJointType__Group__05902 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__AdditiveJointType__Group__1_in_rule__AdditiveJointType__Group__05905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryJointType_in_rule__AdditiveJointType__Group__0__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveJointType__Group__1__Impl_in_rule__AdditiveJointType__Group__15961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveJointType__Group_1__0_in_rule__AdditiveJointType__Group__1__Impl5988 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__AdditiveJointType__Group_1__0__Impl_in_rule__AdditiveJointType__Group_1__06023 = new BitSet(new long[]{0x0000018200000010L});
    public static final BitSet FOLLOW_rule__AdditiveJointType__Group_1__1_in_rule__AdditiveJointType__Group_1__06026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AdditiveJointType__Group_1__0__Impl6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveJointType__Group_1__1__Impl_in_rule__AdditiveJointType__Group_1__16085 = new BitSet(new long[]{0x0000018200000010L});
    public static final BitSet FOLLOW_rule__AdditiveJointType__Group_1__2_in_rule__AdditiveJointType__Group_1__16088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveJointType__Group_1__2__Impl_in_rule__AdditiveJointType__Group_1__26146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveJointType__RightAssignment_1_2_in_rule__AdditiveJointType__Group_1__2__Impl6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicJointType__Group__0__Impl_in_rule__BasicJointType__Group__06209 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__BasicJointType__Group__1_in_rule__BasicJointType__Group__06212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicJointType__TypeAssignment_0_in_rule__BasicJointType__Group__0__Impl6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicJointType__Group__1__Impl_in_rule__BasicJointType__Group__16269 = new BitSet(new long[]{0x0500218201000010L});
    public static final BitSet FOLLOW_rule__BasicJointType__Group__2_in_rule__BasicJointType__Group__16272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__BasicJointType__Group__1__Impl6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicJointType__Group__2__Impl_in_rule__BasicJointType__Group__26331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicJointType__StiffnessAssignment_2_in_rule__BasicJointType__Group__2__Impl6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Revolute__Group__0__Impl_in_rule__Revolute__Group__06394 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__Revolute__Group__1_in_rule__Revolute__Group__06397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Revolute__Group__0__Impl6425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Revolute__Group__1__Impl_in_rule__Revolute__Group__16456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Revolute__AxisAssignment_1_in_rule__Revolute__Group__1__Impl6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planar__Group__0__Impl_in_rule__Planar__Group__06517 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__Planar__Group__1_in_rule__Planar__Group__06520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Planar__Group__0__Impl6548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planar__Group__1__Impl_in_rule__Planar__Group__16579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Planar__AxisAssignment_1_in_rule__Planar__Group__1__Impl6606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__0__Impl_in_rule__BaseStiffnessExp__Group__06640 = new BitSet(new long[]{0x0500218201000010L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__1_in_rule__BaseStiffnessExp__Group__06643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group_0__0_in_rule__BaseStiffnessExp__Group__0__Impl6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__1__Impl_in_rule__BaseStiffnessExp__Group__16701 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__2_in_rule__BaseStiffnessExp__Group__16704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BaseStiffnessExp__Group__1__Impl6732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__2__Impl_in_rule__BaseStiffnessExp__Group__26763 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__3_in_rule__BaseStiffnessExp__Group__26766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__BaseStiffnessExp__Group__2__Impl6794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__3__Impl_in_rule__BaseStiffnessExp__Group__36825 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__4_in_rule__BaseStiffnessExp__Group__36828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__SpringCoeffAssignment_3_in_rule__BaseStiffnessExp__Group__3__Impl6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__4__Impl_in_rule__BaseStiffnessExp__Group__46885 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__5_in_rule__BaseStiffnessExp__Group__46888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__BaseStiffnessExp__Group__4__Impl6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__5__Impl_in_rule__BaseStiffnessExp__Group__56947 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__6_in_rule__BaseStiffnessExp__Group__56950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__SpringInitAssignment_5_in_rule__BaseStiffnessExp__Group__5__Impl6977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__6__Impl_in_rule__BaseStiffnessExp__Group__67007 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__7_in_rule__BaseStiffnessExp__Group__67010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__BaseStiffnessExp__Group__6__Impl7038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__7__Impl_in_rule__BaseStiffnessExp__Group__77069 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__8_in_rule__BaseStiffnessExp__Group__77072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__DampViscousAssignment_7_in_rule__BaseStiffnessExp__Group__7__Impl7099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__8__Impl_in_rule__BaseStiffnessExp__Group__87129 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__9_in_rule__BaseStiffnessExp__Group__87132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__BaseStiffnessExp__Group__8__Impl7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__9__Impl_in_rule__BaseStiffnessExp__Group__97191 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__10_in_rule__BaseStiffnessExp__Group__97194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__DampCoulombAssignment_9_in_rule__BaseStiffnessExp__Group__9__Impl7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group__10__Impl_in_rule__BaseStiffnessExp__Group__107251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BaseStiffnessExp__Group__10__Impl7279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group_0__0__Impl_in_rule__BaseStiffnessExp__Group_0__07332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group_0__1_in_rule__BaseStiffnessExp__Group_0__07335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__BaseStiffnessExp__Group_0__0__Impl7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__Group_0__1__Impl_in_rule__BaseStiffnessExp__Group_0__17394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseStiffnessExp__NameAssignment_0_1_in_rule__BaseStiffnessExp__Group_0__1__Impl7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__0__Impl_in_rule__RelativeTransformation__Group__07455 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__1_in_rule__RelativeTransformation__Group__07458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__RelativeTransformation__Group__0__Impl7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__1__Impl_in_rule__RelativeTransformation__Group__17517 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__2_in_rule__RelativeTransformation__Group__17520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RelativeTransformation__Group__1__Impl7548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__2__Impl_in_rule__RelativeTransformation__Group__27579 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__3_in_rule__RelativeTransformation__Group__27582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__RelativeTransformation__Group__2__Impl7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__3__Impl_in_rule__RelativeTransformation__Group__37641 = new BitSet(new long[]{0x0500000000000010L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__4_in_rule__RelativeTransformation__Group__37644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__RelativeTransformation__Group__3__Impl7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__4__Impl_in_rule__RelativeTransformation__Group__47703 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__5_in_rule__RelativeTransformation__Group__47706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__PositionAssignment_4_in_rule__RelativeTransformation__Group__4__Impl7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__5__Impl_in_rule__RelativeTransformation__Group__57763 = new BitSet(new long[]{0x0008400000000010L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__6_in_rule__RelativeTransformation__Group__57766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__RelativeTransformation__Group__5__Impl7794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__6__Impl_in_rule__RelativeTransformation__Group__67825 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__7_in_rule__RelativeTransformation__Group__67828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__ReorientAssignment_6_in_rule__RelativeTransformation__Group__6__Impl7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelativeTransformation__Group__7__Impl_in_rule__RelativeTransformation__Group__77885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__RelativeTransformation__Group__7__Impl7913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group__0__Impl_in_rule__Reorientation__Group__07960 = new BitSet(new long[]{0x0008400000000010L});
    public static final BitSet FOLLOW_rule__Reorientation__Group__1_in_rule__Reorientation__Group__07963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group_0__0_in_rule__Reorientation__Group__0__Impl7990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group__1__Impl_in_rule__Reorientation__Group__18021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__ExpAssignment_1_in_rule__Reorientation__Group__1__Impl8048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group_0__0__Impl_in_rule__Reorientation__Group_0__08082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reorientation__Group_0__1_in_rule__Reorientation__Group_0__08085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Reorientation__Group_0__0__Impl8113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__Group_0__1__Impl_in_rule__Reorientation__Group_0__18144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reorientation__NameAssignment_0_1_in_rule__Reorientation__Group_0__1__Impl8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group__0__Impl_in_rule__BasicReorientExpression__Group__08205 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group__1_in_rule__BasicReorientExpression__Group__08208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__BasicReorientExpression__Group__0__Impl8236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group__1__Impl_in_rule__BasicReorientExpression__Group__18267 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group__2_in_rule__BasicReorientExpression__Group__18270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group__2__Impl_in_rule__BasicReorientExpression__Group__28328 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group__3_in_rule__BasicReorientExpression__Group__28331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2__0_in_rule__BasicReorientExpression__Group__2__Impl8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group__3__Impl_in_rule__BasicReorientExpression__Group__38389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__BasicReorientExpression__Group__3__Impl8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2__0__Impl_in_rule__BasicReorientExpression__Group_2__08456 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2__1_in_rule__BasicReorientExpression__Group_2__08459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__BasicReorientExpression__Group_2__0__Impl8487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2__1__Impl_in_rule__BasicReorientExpression__Group_2__18518 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2__2_in_rule__BasicReorientExpression__Group_2__18521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__AxisAssignment_2_1_in_rule__BasicReorientExpression__Group_2__1__Impl8548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2__2__Impl_in_rule__BasicReorientExpression__Group_2__28578 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2__3_in_rule__BasicReorientExpression__Group_2__28581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__BasicReorientExpression__Group_2__2__Impl8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2__3__Impl_in_rule__BasicReorientExpression__Group_2__38640 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2__4_in_rule__BasicReorientExpression__Group_2__38643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__ValueAssignment_2_3_in_rule__BasicReorientExpression__Group_2__3__Impl8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2__4__Impl_in_rule__BasicReorientExpression__Group_2__48700 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2__5_in_rule__BasicReorientExpression__Group_2__48703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__BasicReorientExpression__Group_2__4__Impl8731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2__5__Impl_in_rule__BasicReorientExpression__Group_2__58762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2_5__0_in_rule__BasicReorientExpression__Group_2__5__Impl8789 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2_5__0__Impl_in_rule__BasicReorientExpression__Group_2_5__08832 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2_5__1_in_rule__BasicReorientExpression__Group_2_5__08835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__BasicReorientExpression__Group_2_5__0__Impl8863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2_5__1__Impl_in_rule__BasicReorientExpression__Group_2_5__18894 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2_5__2_in_rule__BasicReorientExpression__Group_2_5__18897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__BasicReorientExpression__Group_2_5__1__Impl8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2_5__2__Impl_in_rule__BasicReorientExpression__Group_2_5__28956 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2_5__3_in_rule__BasicReorientExpression__Group_2_5__28959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__AxisAssignment_2_5_2_in_rule__BasicReorientExpression__Group_2_5__2__Impl8986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2_5__3__Impl_in_rule__BasicReorientExpression__Group_2_5__39016 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2_5__4_in_rule__BasicReorientExpression__Group_2_5__39019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__BasicReorientExpression__Group_2_5__3__Impl9047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2_5__4__Impl_in_rule__BasicReorientExpression__Group_2_5__49078 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2_5__5_in_rule__BasicReorientExpression__Group_2_5__49081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__ValueAssignment_2_5_4_in_rule__BasicReorientExpression__Group_2_5__4__Impl9108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicReorientExpression__Group_2_5__5__Impl_in_rule__BasicReorientExpression__Group_2_5__59138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__BasicReorientExpression__Group_2_5__5__Impl9166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__09209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__09212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Constraint__Group__0__Impl9240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__19271 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__19274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__NameAssignment_1_in_rule__Constraint__Group__1__Impl9301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__29331 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__29334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Constraint__Group__2__Impl9362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__39393 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__39396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__TypeAssignment_3_in_rule__Constraint__Group__3__Impl9423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4__Impl_in_rule__Constraint__Group__49453 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__49456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Constraint__Group__4__Impl9484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5__Impl_in_rule__Constraint__Group__59515 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__59518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Body1Assignment_5_in_rule__Constraint__Group__5__Impl9545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6__Impl_in_rule__Constraint__Group__69575 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__7_in_rule__Constraint__Group__69578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__RelTrans1Assignment_6_in_rule__Constraint__Group__6__Impl9605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__7__Impl_in_rule__Constraint__Group__79635 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__8_in_rule__Constraint__Group__79638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Constraint__Group__7__Impl9666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__8__Impl_in_rule__Constraint__Group__89697 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__9_in_rule__Constraint__Group__89700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Body2Assignment_8_in_rule__Constraint__Group__8__Impl9727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__9__Impl_in_rule__Constraint__Group__99757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__RelTrans2Assignment_9_in_rule__Constraint__Group__9__Impl9784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__0__Impl_in_rule__ExternalLoad__Group__09834 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__1_in_rule__ExternalLoad__Group__09837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ExternalLoad__Group__0__Impl9865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__1__Impl_in_rule__ExternalLoad__Group__19896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__2_in_rule__ExternalLoad__Group__19899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ExternalLoad__Group__1__Impl9927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__2__Impl_in_rule__ExternalLoad__Group__29958 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__3_in_rule__ExternalLoad__Group__29961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__NameAssignment_2_in_rule__ExternalLoad__Group__2__Impl9988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__3__Impl_in_rule__ExternalLoad__Group__310018 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__4_in_rule__ExternalLoad__Group__310021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ExternalLoad__Group__3__Impl10049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__4__Impl_in_rule__ExternalLoad__Group__410080 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__5_in_rule__ExternalLoad__Group__410083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__TypeAssignment_4_in_rule__ExternalLoad__Group__4__Impl10110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__5__Impl_in_rule__ExternalLoad__Group__510140 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__6_in_rule__ExternalLoad__Group__510143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__ExternalLoad__Group__5__Impl10171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__6__Impl_in_rule__ExternalLoad__Group__610202 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__7_in_rule__ExternalLoad__Group__610205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Body1Assignment_6_in_rule__ExternalLoad__Group__6__Impl10232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__7__Impl_in_rule__ExternalLoad__Group__710262 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__8_in_rule__ExternalLoad__Group__710265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ExternalLoad__Group__7__Impl10293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__8__Impl_in_rule__ExternalLoad__Group__810324 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__9_in_rule__ExternalLoad__Group__810327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ExternalLoad__Group__8__Impl10355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__9__Impl_in_rule__ExternalLoad__Group__910386 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__10_in_rule__ExternalLoad__Group__910389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ExternalLoad__Group__9__Impl10417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__10__Impl_in_rule__ExternalLoad__Group__1010448 = new BitSet(new long[]{0x0500000000000010L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__11_in_rule__ExternalLoad__Group__1010451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ExternalLoad__Group__10__Impl10479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__11__Impl_in_rule__ExternalLoad__Group__1110510 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__12_in_rule__ExternalLoad__Group__1110513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__PositionAssignment_11_in_rule__ExternalLoad__Group__11__Impl10540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLoad__Group__12__Impl_in_rule__ExternalLoad__Group__1210570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ExternalLoad__Group__12__Impl10598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__0__Impl_in_rule__BaseMatrix__Group__010655 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__1_in_rule__BaseMatrix__Group__010658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_0__0_in_rule__BaseMatrix__Group__0__Impl10685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__1__Impl_in_rule__BaseMatrix__Group__110716 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__2_in_rule__BaseMatrix__Group__110719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__BaseMatrix__Group__1__Impl10747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__2__Impl_in_rule__BaseMatrix__Group__210778 = new BitSet(new long[]{0x0202000000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__3_in_rule__BaseMatrix__Group__210781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__ValuesAssignment_2_in_rule__BaseMatrix__Group__2__Impl10808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__3__Impl_in_rule__BaseMatrix__Group__310838 = new BitSet(new long[]{0x0202000000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__4_in_rule__BaseMatrix__Group__310841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_3__0_in_rule__BaseMatrix__Group__3__Impl10868 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group__4__Impl_in_rule__BaseMatrix__Group__410899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__BaseMatrix__Group__4__Impl10927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_0__0__Impl_in_rule__BaseMatrix__Group_0__010968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_0__1_in_rule__BaseMatrix__Group_0__010971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__BaseMatrix__Group_0__0__Impl10999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_0__1__Impl_in_rule__BaseMatrix__Group_0__111030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__NameAssignment_0_1_in_rule__BaseMatrix__Group_0__1__Impl11057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_3__0__Impl_in_rule__BaseMatrix__Group_3__011091 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_3__1_in_rule__BaseMatrix__Group_3__011094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__BaseMatrix__Group_3__0__Impl11122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__Group_3__1__Impl_in_rule__BaseMatrix__Group_3__111153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix__ValuesAssignment_3_1_in_rule__BaseMatrix__Group_3__1__Impl11180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group__0__Impl_in_rule__AddExp__Group__011214 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__AddExp__Group__1_in_rule__AddExp__Group__011217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_rule__AddExp__Group__0__Impl11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group__1__Impl_in_rule__AddExp__Group__111273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__0_in_rule__AddExp__Group__1__Impl11300 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__0__Impl_in_rule__AddExp__Group_1__011335 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__1_in_rule__AddExp__Group_1__011338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__1__Impl_in_rule__AddExp__Group_1__111396 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__2_in_rule__AddExp__Group_1__111399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__OpAssignment_1_1_in_rule__AddExp__Group_1__1__Impl11426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__Group_1__2__Impl_in_rule__AddExp__Group_1__211456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__RightAssignment_1_2_in_rule__AddExp__Group_1__2__Impl11483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group__0__Impl_in_rule__MultExp__Group__011519 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__MultExp__Group__1_in_rule__MultExp__Group__011522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MultExp__Group__0__Impl11549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group__1__Impl_in_rule__MultExp__Group__111578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__0_in_rule__MultExp__Group__1__Impl11605 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__0__Impl_in_rule__MultExp__Group_1__011640 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__1_in_rule__MultExp__Group_1__011643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__1__Impl_in_rule__MultExp__Group_1__111701 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__2_in_rule__MultExp__Group_1__111704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__OpAssignment_1_1_in_rule__MultExp__Group_1__1__Impl11731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__Group_1__2__Impl_in_rule__MultExp__Group_1__211761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__RightAssignment_1_2_in_rule__MultExp__Group_1__2__Impl11788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisedExp__Group__0__Impl_in_rule__ParenthesisedExp__Group__011824 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__ParenthesisedExp__Group__1_in_rule__ParenthesisedExp__Group__011827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ParenthesisedExp__Group__0__Impl11855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisedExp__Group__1__Impl_in_rule__ParenthesisedExp__Group__111886 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__ParenthesisedExp__Group__2_in_rule__ParenthesisedExp__Group__111889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisedExp__ExpAssignment_1_in_rule__ParenthesisedExp__Group__1__Impl11916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisedExp__Group__2__Impl_in_rule__ParenthesisedExp__Group__211946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ParenthesisedExp__Group__2__Impl11974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group__0__Impl_in_rule__ConstantOrFunctionCallExp__Group__012011 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group__1_in_rule__ConstantOrFunctionCallExp__Group__012014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__LabelAssignment_0_in_rule__ConstantOrFunctionCallExp__Group__0__Impl12041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group__1__Impl_in_rule__ConstantOrFunctionCallExp__Group__112071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__0_in_rule__ConstantOrFunctionCallExp__Group__1__Impl12098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__0__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__012133 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__1_in_rule__ConstantOrFunctionCallExp__Group_1__012136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ConstantOrFunctionCallExp__Group_1__0__Impl12164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__1__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__112195 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__2_in_rule__ConstantOrFunctionCallExp__Group_1__112198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__ParamAssignment_1_1_in_rule__ConstantOrFunctionCallExp__Group_1__1__Impl12225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__2__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__212255 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__3_in_rule__ConstantOrFunctionCallExp__Group_1__212258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__0_in_rule__ConstantOrFunctionCallExp__Group_1__2__Impl12285 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1__3__Impl_in_rule__ConstantOrFunctionCallExp__Group_1__312316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ConstantOrFunctionCallExp__Group_1__3__Impl12344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl_in_rule__ConstantOrFunctionCallExp__Group_1_2__012383 = new BitSet(new long[]{0x0000400000002030L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__1_in_rule__ConstantOrFunctionCallExp__Group_1_2__012386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ConstantOrFunctionCallExp__Group_1_2__0__Impl12414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl_in_rule__ConstantOrFunctionCallExp__Group_1_2__112445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_1_in_rule__ConstantOrFunctionCallExp__Group_1_2__1__Impl12472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__0__Impl_in_rule__NumberLiteral__Group__012506 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__1_in_rule__NumberLiteral__Group__012509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__NegAssignment_0_in_rule__NumberLiteral__Group__0__Impl12536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__1__Impl_in_rule__NumberLiteral__Group__112567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__ValueAssignment_1_in_rule__NumberLiteral__Group__1__Impl12594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialDefinition_in_rule__Model__DefsAssignment_012633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_rule__Model__WorldAssignment_112664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Model__BodiesAssignment_212695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Environment__GravityAssignment_312726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__NameAssignment_112757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemElement_in_rule__System__ElementsAssignment_312788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__NameAssignment_112819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_rule__Body__MassAssignment_312850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__BodyReference__BaseAssignment_012886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyReference__RefAssignment_112929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__Mass__ValueAssignment_312964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Mass__PositionAssignment_512995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Mass__InertiaAssignment_713026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Joint__NameAssignment_113057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointType_in_rule__Joint__TypeAssignment_313088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Joint__IsStartAssignment_413124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_rule__Joint__Body1Assignment_613163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__Joint__RelTrans1Assignment_713194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_rule__Joint__Body2Assignment_913225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JointType__NameAssignment_0_213256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveJointType_in_rule__JointType__ExpAssignment_113287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryJointType_in_rule__AdditiveJointType__RightAssignment_1_213318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JointTypeReference__RefAssignment13353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJointMovement_in_rule__BasicJointType__TypeAssignment_013388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStiffnessExp_in_rule__BasicJointType__StiffnessAssignment_213419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__Revolute__AxisAssignment_113450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__Planar__AxisAssignment_113481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StiffnessRef__RefAssignment13516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BaseStiffnessExp__NameAssignment_0_113551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__BaseStiffnessExp__SpringCoeffAssignment_313582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__BaseStiffnessExp__SpringInitAssignment_513613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__BaseStiffnessExp__DampViscousAssignment_713644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__BaseStiffnessExp__DampCoulombAssignment_913675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__RelativeTransformation__PositionAssignment_413706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientation_in_rule__RelativeTransformation__ReorientAssignment_613737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reorientation__NameAssignment_0_113768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReorientExpression_in_rule__Reorientation__ExpAssignment_113799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReorientRef__RefAssignment13834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__BasicReorientExpression__AxisAssignment_2_113869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__BasicReorientExpression__ValueAssignment_2_313900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAXIS_in_rule__BasicReorientExpression__AxisAssignment_2_5_213931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__BasicReorientExpression__ValueAssignment_2_5_413962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constraint__NameAssignment_113993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintType_in_rule__Constraint__TypeAssignment_314024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_rule__Constraint__Body1Assignment_514055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__Constraint__RelTrans1Assignment_614086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_rule__Constraint__Body2Assignment_814117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativeTransformation_in_rule__Constraint__RelTrans2Assignment_914148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExternalLoad__NameAssignment_214179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadType_in_rule__ExternalLoad__TypeAssignment_414210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyReference_in_rule__ExternalLoad__Body1Assignment_614241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__ExternalLoad__PositionAssignment_1114272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BaseMatrix__NameAssignment_0_114303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__BaseMatrix__ValuesAssignment_214334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__BaseMatrix__ValuesAssignment_3_114365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MatrixRef__MatrixAssignment14400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExp__OpAlternatives_1_1_0_in_rule__AddExp__OpAssignment_1_114435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExp_in_rule__AddExp__RightAssignment_1_214468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultExp__OpAlternatives_1_1_0_in_rule__MultExp__OpAssignment_1_114499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MultExp__RightAssignment_1_214532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__ParenthesisedExp__ExpAssignment_114563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantOrFunctionCallExp__LabelAssignment_014594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__ConstantOrFunctionCallExp__ParamAssignment_1_114625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_rule__ConstantOrFunctionCallExp__ParamAssignment_1_2_114656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NumberLiteral__NegAssignment_014692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__NumberLiteral__ValueAssignment_114731 = new BitSet(new long[]{0x0000000000000002L});

}