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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_REAL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'world'", "'{'", "'gravity'", "'}'", "'system'", "'body'", "'local'", "'frame'", "'orientation'", "'position'", "'mass'", "'value'", "'inertia'", "'joint'", "':'", "'between'", "'('", "'with'", "'relative'", "'transformation'", "')'", "'and'", "'colocate'", "','", "'vector'", "'['", "']'", "'m3'", "'m4'"
    };
    public static final int RULE_ID=5;
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


    // $ANTLR start "entryRuleLocalFrame"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:228:1: entryRuleLocalFrame : ruleLocalFrame EOF ;
    public final void entryRuleLocalFrame() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:229:1: ( ruleLocalFrame EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:230:1: ruleLocalFrame EOF
            {
             before(grammarAccess.getLocalFrameRule()); 
            pushFollow(FOLLOW_ruleLocalFrame_in_entryRuleLocalFrame421);
            ruleLocalFrame();

            state._fsp--;

             after(grammarAccess.getLocalFrameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalFrame428); 

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
    // $ANTLR end "entryRuleLocalFrame"


    // $ANTLR start "ruleLocalFrame"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:237:1: ruleLocalFrame : ( ( rule__LocalFrame__Group__0 ) ) ;
    public final void ruleLocalFrame() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:241:2: ( ( ( rule__LocalFrame__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:242:1: ( ( rule__LocalFrame__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:242:1: ( ( rule__LocalFrame__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:243:1: ( rule__LocalFrame__Group__0 )
            {
             before(grammarAccess.getLocalFrameAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:244:1: ( rule__LocalFrame__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:244:2: rule__LocalFrame__Group__0
            {
            pushFollow(FOLLOW_rule__LocalFrame__Group__0_in_ruleLocalFrame454);
            rule__LocalFrame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalFrameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalFrame"


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


    // $ANTLR start "entryRuleConstraint"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:312:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:313:1: ( ruleConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:314:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint601);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint608); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:321:1: ruleConstraint : ( ruleColocationConstraint ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:325:2: ( ( ruleColocationConstraint ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:326:1: ( ruleColocationConstraint )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:326:1: ( ruleColocationConstraint )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:327:1: ruleColocationConstraint
            {
             before(grammarAccess.getConstraintAccess().getColocationConstraintParserRuleCall()); 
            pushFollow(FOLLOW_ruleColocationConstraint_in_ruleConstraint634);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:340:1: entryRuleColocationConstraint : ruleColocationConstraint EOF ;
    public final void entryRuleColocationConstraint() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:341:1: ( ruleColocationConstraint EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:342:1: ruleColocationConstraint EOF
            {
             before(grammarAccess.getColocationConstraintRule()); 
            pushFollow(FOLLOW_ruleColocationConstraint_in_entryRuleColocationConstraint660);
            ruleColocationConstraint();

            state._fsp--;

             after(grammarAccess.getColocationConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColocationConstraint667); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:349:1: ruleColocationConstraint : ( ( rule__ColocationConstraint__Group__0 ) ) ;
    public final void ruleColocationConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:353:2: ( ( ( rule__ColocationConstraint__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:354:1: ( ( rule__ColocationConstraint__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:354:1: ( ( rule__ColocationConstraint__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:355:1: ( rule__ColocationConstraint__Group__0 )
            {
             before(grammarAccess.getColocationConstraintAccess().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:356:1: ( rule__ColocationConstraint__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:356:2: rule__ColocationConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Group__0_in_ruleColocationConstraint693);
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


    // $ANTLR start "entryRuleVector3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:368:1: entryRuleVector3 : ruleVector3 EOF ;
    public final void entryRuleVector3() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:369:1: ( ruleVector3 EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:370:1: ruleVector3 EOF
            {
             before(grammarAccess.getVector3Rule()); 
            pushFollow(FOLLOW_ruleVector3_in_entryRuleVector3720);
            ruleVector3();

            state._fsp--;

             after(grammarAccess.getVector3Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector3727); 

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
    // $ANTLR end "entryRuleVector3"


    // $ANTLR start "ruleVector3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:377:1: ruleVector3 : ( ( rule__Vector3__Alternatives ) ) ;
    public final void ruleVector3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:381:2: ( ( ( rule__Vector3__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:382:1: ( ( rule__Vector3__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:382:1: ( ( rule__Vector3__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:383:1: ( rule__Vector3__Alternatives )
            {
             before(grammarAccess.getVector3Access().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:384:1: ( rule__Vector3__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:384:2: rule__Vector3__Alternatives
            {
            pushFollow(FOLLOW_rule__Vector3__Alternatives_in_ruleVector3753);
            rule__Vector3__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVector3Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVector3"


    // $ANTLR start "entryRuleBaseVector3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:396:1: entryRuleBaseVector3 : ruleBaseVector3 EOF ;
    public final void entryRuleBaseVector3() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:397:1: ( ruleBaseVector3 EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:398:1: ruleBaseVector3 EOF
            {
             before(grammarAccess.getBaseVector3Rule()); 
            pushFollow(FOLLOW_ruleBaseVector3_in_entryRuleBaseVector3780);
            ruleBaseVector3();

            state._fsp--;

             after(grammarAccess.getBaseVector3Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseVector3787); 

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
    // $ANTLR end "entryRuleBaseVector3"


    // $ANTLR start "ruleBaseVector3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:405:1: ruleBaseVector3 : ( ( rule__BaseVector3__Group__0 ) ) ;
    public final void ruleBaseVector3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:409:2: ( ( ( rule__BaseVector3__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:410:1: ( ( rule__BaseVector3__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:410:1: ( ( rule__BaseVector3__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:411:1: ( rule__BaseVector3__Group__0 )
            {
             before(grammarAccess.getBaseVector3Access().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:412:1: ( rule__BaseVector3__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:412:2: rule__BaseVector3__Group__0
            {
            pushFollow(FOLLOW_rule__BaseVector3__Group__0_in_ruleBaseVector3813);
            rule__BaseVector3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseVector3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseVector3"


    // $ANTLR start "entryRuleVector3Ref"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:424:1: entryRuleVector3Ref : ruleVector3Ref EOF ;
    public final void entryRuleVector3Ref() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:425:1: ( ruleVector3Ref EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:426:1: ruleVector3Ref EOF
            {
             before(grammarAccess.getVector3RefRule()); 
            pushFollow(FOLLOW_ruleVector3Ref_in_entryRuleVector3Ref840);
            ruleVector3Ref();

            state._fsp--;

             after(grammarAccess.getVector3RefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector3Ref847); 

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
    // $ANTLR end "entryRuleVector3Ref"


    // $ANTLR start "ruleVector3Ref"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:433:1: ruleVector3Ref : ( ( rule__Vector3Ref__VectorAssignment ) ) ;
    public final void ruleVector3Ref() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:437:2: ( ( ( rule__Vector3Ref__VectorAssignment ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:438:1: ( ( rule__Vector3Ref__VectorAssignment ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:438:1: ( ( rule__Vector3Ref__VectorAssignment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:439:1: ( rule__Vector3Ref__VectorAssignment )
            {
             before(grammarAccess.getVector3RefAccess().getVectorAssignment()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:440:1: ( rule__Vector3Ref__VectorAssignment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:440:2: rule__Vector3Ref__VectorAssignment
            {
            pushFollow(FOLLOW_rule__Vector3Ref__VectorAssignment_in_ruleVector3Ref873);
            rule__Vector3Ref__VectorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVector3RefAccess().getVectorAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVector3Ref"


    // $ANTLR start "entryRuleMatrix3X3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:452:1: entryRuleMatrix3X3 : ruleMatrix3X3 EOF ;
    public final void entryRuleMatrix3X3() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:453:1: ( ruleMatrix3X3 EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:454:1: ruleMatrix3X3 EOF
            {
             before(grammarAccess.getMatrix3X3Rule()); 
            pushFollow(FOLLOW_ruleMatrix3X3_in_entryRuleMatrix3X3900);
            ruleMatrix3X3();

            state._fsp--;

             after(grammarAccess.getMatrix3X3Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix3X3907); 

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
    // $ANTLR end "entryRuleMatrix3X3"


    // $ANTLR start "ruleMatrix3X3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:461:1: ruleMatrix3X3 : ( ( rule__Matrix3X3__Alternatives ) ) ;
    public final void ruleMatrix3X3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:465:2: ( ( ( rule__Matrix3X3__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:466:1: ( ( rule__Matrix3X3__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:466:1: ( ( rule__Matrix3X3__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:467:1: ( rule__Matrix3X3__Alternatives )
            {
             before(grammarAccess.getMatrix3X3Access().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:468:1: ( rule__Matrix3X3__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:468:2: rule__Matrix3X3__Alternatives
            {
            pushFollow(FOLLOW_rule__Matrix3X3__Alternatives_in_ruleMatrix3X3933);
            rule__Matrix3X3__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMatrix3X3Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatrix3X3"


    // $ANTLR start "entryRuleBaseMatrix3X3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:480:1: entryRuleBaseMatrix3X3 : ruleBaseMatrix3X3 EOF ;
    public final void entryRuleBaseMatrix3X3() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:481:1: ( ruleBaseMatrix3X3 EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:482:1: ruleBaseMatrix3X3 EOF
            {
             before(grammarAccess.getBaseMatrix3X3Rule()); 
            pushFollow(FOLLOW_ruleBaseMatrix3X3_in_entryRuleBaseMatrix3X3960);
            ruleBaseMatrix3X3();

            state._fsp--;

             after(grammarAccess.getBaseMatrix3X3Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseMatrix3X3967); 

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
    // $ANTLR end "entryRuleBaseMatrix3X3"


    // $ANTLR start "ruleBaseMatrix3X3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:489:1: ruleBaseMatrix3X3 : ( ( rule__BaseMatrix3X3__Group__0 ) ) ;
    public final void ruleBaseMatrix3X3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:493:2: ( ( ( rule__BaseMatrix3X3__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:494:1: ( ( rule__BaseMatrix3X3__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:494:1: ( ( rule__BaseMatrix3X3__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:495:1: ( rule__BaseMatrix3X3__Group__0 )
            {
             before(grammarAccess.getBaseMatrix3X3Access().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:496:1: ( rule__BaseMatrix3X3__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:496:2: rule__BaseMatrix3X3__Group__0
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__0_in_ruleBaseMatrix3X3993);
            rule__BaseMatrix3X3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseMatrix3X3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseMatrix3X3"


    // $ANTLR start "entryRuleMatrix3X3Ref"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:508:1: entryRuleMatrix3X3Ref : ruleMatrix3X3Ref EOF ;
    public final void entryRuleMatrix3X3Ref() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:509:1: ( ruleMatrix3X3Ref EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:510:1: ruleMatrix3X3Ref EOF
            {
             before(grammarAccess.getMatrix3X3RefRule()); 
            pushFollow(FOLLOW_ruleMatrix3X3Ref_in_entryRuleMatrix3X3Ref1020);
            ruleMatrix3X3Ref();

            state._fsp--;

             after(grammarAccess.getMatrix3X3RefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix3X3Ref1027); 

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
    // $ANTLR end "entryRuleMatrix3X3Ref"


    // $ANTLR start "ruleMatrix3X3Ref"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:517:1: ruleMatrix3X3Ref : ( ( rule__Matrix3X3Ref__MatrixAssignment ) ) ;
    public final void ruleMatrix3X3Ref() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:521:2: ( ( ( rule__Matrix3X3Ref__MatrixAssignment ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:522:1: ( ( rule__Matrix3X3Ref__MatrixAssignment ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:522:1: ( ( rule__Matrix3X3Ref__MatrixAssignment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:523:1: ( rule__Matrix3X3Ref__MatrixAssignment )
            {
             before(grammarAccess.getMatrix3X3RefAccess().getMatrixAssignment()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:524:1: ( rule__Matrix3X3Ref__MatrixAssignment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:524:2: rule__Matrix3X3Ref__MatrixAssignment
            {
            pushFollow(FOLLOW_rule__Matrix3X3Ref__MatrixAssignment_in_ruleMatrix3X3Ref1053);
            rule__Matrix3X3Ref__MatrixAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMatrix3X3RefAccess().getMatrixAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatrix3X3Ref"


    // $ANTLR start "entryRuleMatrix4X4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:536:1: entryRuleMatrix4X4 : ruleMatrix4X4 EOF ;
    public final void entryRuleMatrix4X4() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:537:1: ( ruleMatrix4X4 EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:538:1: ruleMatrix4X4 EOF
            {
             before(grammarAccess.getMatrix4X4Rule()); 
            pushFollow(FOLLOW_ruleMatrix4X4_in_entryRuleMatrix4X41080);
            ruleMatrix4X4();

            state._fsp--;

             after(grammarAccess.getMatrix4X4Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix4X41087); 

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
    // $ANTLR end "entryRuleMatrix4X4"


    // $ANTLR start "ruleMatrix4X4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:545:1: ruleMatrix4X4 : ( ( rule__Matrix4X4__Alternatives ) ) ;
    public final void ruleMatrix4X4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:549:2: ( ( ( rule__Matrix4X4__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:550:1: ( ( rule__Matrix4X4__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:550:1: ( ( rule__Matrix4X4__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:551:1: ( rule__Matrix4X4__Alternatives )
            {
             before(grammarAccess.getMatrix4X4Access().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:552:1: ( rule__Matrix4X4__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:552:2: rule__Matrix4X4__Alternatives
            {
            pushFollow(FOLLOW_rule__Matrix4X4__Alternatives_in_ruleMatrix4X41113);
            rule__Matrix4X4__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMatrix4X4Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatrix4X4"


    // $ANTLR start "entryRuleBaseMatrix4X4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:564:1: entryRuleBaseMatrix4X4 : ruleBaseMatrix4X4 EOF ;
    public final void entryRuleBaseMatrix4X4() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:565:1: ( ruleBaseMatrix4X4 EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:566:1: ruleBaseMatrix4X4 EOF
            {
             before(grammarAccess.getBaseMatrix4X4Rule()); 
            pushFollow(FOLLOW_ruleBaseMatrix4X4_in_entryRuleBaseMatrix4X41140);
            ruleBaseMatrix4X4();

            state._fsp--;

             after(grammarAccess.getBaseMatrix4X4Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseMatrix4X41147); 

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
    // $ANTLR end "entryRuleBaseMatrix4X4"


    // $ANTLR start "ruleBaseMatrix4X4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:573:1: ruleBaseMatrix4X4 : ( ( rule__BaseMatrix4X4__Group__0 ) ) ;
    public final void ruleBaseMatrix4X4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:577:2: ( ( ( rule__BaseMatrix4X4__Group__0 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:578:1: ( ( rule__BaseMatrix4X4__Group__0 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:578:1: ( ( rule__BaseMatrix4X4__Group__0 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:579:1: ( rule__BaseMatrix4X4__Group__0 )
            {
             before(grammarAccess.getBaseMatrix4X4Access().getGroup()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:580:1: ( rule__BaseMatrix4X4__Group__0 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:580:2: rule__BaseMatrix4X4__Group__0
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__0_in_ruleBaseMatrix4X41173);
            rule__BaseMatrix4X4__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseMatrix4X4Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseMatrix4X4"


    // $ANTLR start "entryRuleMatrix4X4Ref"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:592:1: entryRuleMatrix4X4Ref : ruleMatrix4X4Ref EOF ;
    public final void entryRuleMatrix4X4Ref() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:593:1: ( ruleMatrix4X4Ref EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:594:1: ruleMatrix4X4Ref EOF
            {
             before(grammarAccess.getMatrix4X4RefRule()); 
            pushFollow(FOLLOW_ruleMatrix4X4Ref_in_entryRuleMatrix4X4Ref1200);
            ruleMatrix4X4Ref();

            state._fsp--;

             after(grammarAccess.getMatrix4X4RefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix4X4Ref1207); 

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
    // $ANTLR end "entryRuleMatrix4X4Ref"


    // $ANTLR start "ruleMatrix4X4Ref"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:601:1: ruleMatrix4X4Ref : ( ( rule__Matrix4X4Ref__MatrixAssignment ) ) ;
    public final void ruleMatrix4X4Ref() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:605:2: ( ( ( rule__Matrix4X4Ref__MatrixAssignment ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:606:1: ( ( rule__Matrix4X4Ref__MatrixAssignment ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:606:1: ( ( rule__Matrix4X4Ref__MatrixAssignment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:607:1: ( rule__Matrix4X4Ref__MatrixAssignment )
            {
             before(grammarAccess.getMatrix4X4RefAccess().getMatrixAssignment()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:608:1: ( rule__Matrix4X4Ref__MatrixAssignment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:608:2: rule__Matrix4X4Ref__MatrixAssignment
            {
            pushFollow(FOLLOW_rule__Matrix4X4Ref__MatrixAssignment_in_ruleMatrix4X4Ref1233);
            rule__Matrix4X4Ref__MatrixAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMatrix4X4RefAccess().getMatrixAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatrix4X4Ref"


    // $ANTLR start "entryRuleMatrixDef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:620:1: entryRuleMatrixDef : ruleMatrixDef EOF ;
    public final void entryRuleMatrixDef() throws RecognitionException {
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:621:1: ( ruleMatrixDef EOF )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:622:1: ruleMatrixDef EOF
            {
             before(grammarAccess.getMatrixDefRule()); 
            pushFollow(FOLLOW_ruleMatrixDef_in_entryRuleMatrixDef1260);
            ruleMatrixDef();

            state._fsp--;

             after(grammarAccess.getMatrixDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrixDef1267); 

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
    // $ANTLR end "entryRuleMatrixDef"


    // $ANTLR start "ruleMatrixDef"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:629:1: ruleMatrixDef : ( ( rule__MatrixDef__Alternatives ) ) ;
    public final void ruleMatrixDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:633:2: ( ( ( rule__MatrixDef__Alternatives ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:634:1: ( ( rule__MatrixDef__Alternatives ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:634:1: ( ( rule__MatrixDef__Alternatives ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:635:1: ( rule__MatrixDef__Alternatives )
            {
             before(grammarAccess.getMatrixDefAccess().getAlternatives()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:636:1: ( rule__MatrixDef__Alternatives )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:636:2: rule__MatrixDef__Alternatives
            {
            pushFollow(FOLLOW_rule__MatrixDef__Alternatives_in_ruleMatrixDef1293);
            rule__MatrixDef__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMatrixDefAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatrixDef"


    // $ANTLR start "rule__InitialDefinition__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:648:1: rule__InitialDefinition__Alternatives : ( ( ruleMatrixDef ) | ( ruleBaseVector3 ) );
    public final void rule__InitialDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:652:1: ( ( ruleMatrixDef ) | ( ruleBaseVector3 ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==37||(LA1_0>=39 && LA1_0<=40)) ) {
                alt1=1;
            }
            else if ( (LA1_0==28||LA1_0==36) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:653:1: ( ruleMatrixDef )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:653:1: ( ruleMatrixDef )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:654:1: ruleMatrixDef
                    {
                     before(grammarAccess.getInitialDefinitionAccess().getMatrixDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMatrixDef_in_rule__InitialDefinition__Alternatives1329);
                    ruleMatrixDef();

                    state._fsp--;

                     after(grammarAccess.getInitialDefinitionAccess().getMatrixDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:659:6: ( ruleBaseVector3 )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:659:6: ( ruleBaseVector3 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:660:1: ruleBaseVector3
                    {
                     before(grammarAccess.getInitialDefinitionAccess().getBaseVector3ParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBaseVector3_in_rule__InitialDefinition__Alternatives1346);
                    ruleBaseVector3();

                    state._fsp--;

                     after(grammarAccess.getInitialDefinitionAccess().getBaseVector3ParserRuleCall_1()); 

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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:670:1: rule__SystemElement__Alternatives : ( ( ruleBody ) | ( ruleJoint ) | ( ruleConstraint ) );
    public final void rule__SystemElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:674:1: ( ( ruleBody ) | ( ruleJoint ) | ( ruleConstraint ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:675:1: ( ruleBody )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:675:1: ( ruleBody )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:676:1: ruleBody
                    {
                     before(grammarAccess.getSystemElementAccess().getBodyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBody_in_rule__SystemElement__Alternatives1378);
                    ruleBody();

                    state._fsp--;

                     after(grammarAccess.getSystemElementAccess().getBodyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:681:6: ( ruleJoint )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:681:6: ( ruleJoint )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:682:1: ruleJoint
                    {
                     before(grammarAccess.getSystemElementAccess().getJointParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleJoint_in_rule__SystemElement__Alternatives1395);
                    ruleJoint();

                    state._fsp--;

                     after(grammarAccess.getSystemElementAccess().getJointParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:687:6: ( ruleConstraint )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:687:6: ( ruleConstraint )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:688:1: ruleConstraint
                    {
                     before(grammarAccess.getSystemElementAccess().getConstraintParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleConstraint_in_rule__SystemElement__Alternatives1412);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getSystemElementAccess().getConstraintParserRuleCall_2()); 

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


    // $ANTLR start "rule__Vector3__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:698:1: rule__Vector3__Alternatives : ( ( ruleBaseVector3 ) | ( ruleVector3Ref ) );
    public final void rule__Vector3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:702:1: ( ( ruleBaseVector3 ) | ( ruleVector3Ref ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28||LA3_0==36) ) {
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:703:1: ( ruleBaseVector3 )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:703:1: ( ruleBaseVector3 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:704:1: ruleBaseVector3
                    {
                     before(grammarAccess.getVector3Access().getBaseVector3ParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBaseVector3_in_rule__Vector3__Alternatives1444);
                    ruleBaseVector3();

                    state._fsp--;

                     after(grammarAccess.getVector3Access().getBaseVector3ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:709:6: ( ruleVector3Ref )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:709:6: ( ruleVector3Ref )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:710:1: ruleVector3Ref
                    {
                     before(grammarAccess.getVector3Access().getVector3RefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVector3Ref_in_rule__Vector3__Alternatives1461);
                    ruleVector3Ref();

                    state._fsp--;

                     after(grammarAccess.getVector3Access().getVector3RefParserRuleCall_1()); 

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
    // $ANTLR end "rule__Vector3__Alternatives"


    // $ANTLR start "rule__Matrix3X3__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:720:1: rule__Matrix3X3__Alternatives : ( ( ruleBaseMatrix3X3 ) | ( ruleMatrix3X3Ref ) );
    public final void rule__Matrix3X3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:724:1: ( ( ruleBaseMatrix3X3 ) | ( ruleMatrix3X3Ref ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37||LA4_0==39) ) {
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:725:1: ( ruleBaseMatrix3X3 )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:725:1: ( ruleBaseMatrix3X3 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:726:1: ruleBaseMatrix3X3
                    {
                     before(grammarAccess.getMatrix3X3Access().getBaseMatrix3X3ParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBaseMatrix3X3_in_rule__Matrix3X3__Alternatives1493);
                    ruleBaseMatrix3X3();

                    state._fsp--;

                     after(grammarAccess.getMatrix3X3Access().getBaseMatrix3X3ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:731:6: ( ruleMatrix3X3Ref )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:731:6: ( ruleMatrix3X3Ref )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:732:1: ruleMatrix3X3Ref
                    {
                     before(grammarAccess.getMatrix3X3Access().getMatrix3X3RefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMatrix3X3Ref_in_rule__Matrix3X3__Alternatives1510);
                    ruleMatrix3X3Ref();

                    state._fsp--;

                     after(grammarAccess.getMatrix3X3Access().getMatrix3X3RefParserRuleCall_1()); 

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
    // $ANTLR end "rule__Matrix3X3__Alternatives"


    // $ANTLR start "rule__Matrix4X4__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:742:1: rule__Matrix4X4__Alternatives : ( ( ruleBaseMatrix4X4 ) | ( ruleMatrix4X4Ref ) );
    public final void rule__Matrix4X4__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:746:1: ( ( ruleBaseMatrix4X4 ) | ( ruleMatrix4X4Ref ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==37||LA5_0==40) ) {
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
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:747:1: ( ruleBaseMatrix4X4 )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:747:1: ( ruleBaseMatrix4X4 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:748:1: ruleBaseMatrix4X4
                    {
                     before(grammarAccess.getMatrix4X4Access().getBaseMatrix4X4ParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBaseMatrix4X4_in_rule__Matrix4X4__Alternatives1542);
                    ruleBaseMatrix4X4();

                    state._fsp--;

                     after(grammarAccess.getMatrix4X4Access().getBaseMatrix4X4ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:753:6: ( ruleMatrix4X4Ref )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:753:6: ( ruleMatrix4X4Ref )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:754:1: ruleMatrix4X4Ref
                    {
                     before(grammarAccess.getMatrix4X4Access().getMatrix4X4RefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMatrix4X4Ref_in_rule__Matrix4X4__Alternatives1559);
                    ruleMatrix4X4Ref();

                    state._fsp--;

                     after(grammarAccess.getMatrix4X4Access().getMatrix4X4RefParserRuleCall_1()); 

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
    // $ANTLR end "rule__Matrix4X4__Alternatives"


    // $ANTLR start "rule__MatrixDef__Alternatives"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:764:1: rule__MatrixDef__Alternatives : ( ( ruleBaseMatrix3X3 ) | ( ruleBaseMatrix4X4 ) );
    public final void rule__MatrixDef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:768:1: ( ( ruleBaseMatrix3X3 ) | ( ruleBaseMatrix4X4 ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:769:1: ( ruleBaseMatrix3X3 )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:769:1: ( ruleBaseMatrix3X3 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:770:1: ruleBaseMatrix3X3
                    {
                     before(grammarAccess.getMatrixDefAccess().getBaseMatrix3X3ParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBaseMatrix3X3_in_rule__MatrixDef__Alternatives1591);
                    ruleBaseMatrix3X3();

                    state._fsp--;

                     after(grammarAccess.getMatrixDefAccess().getBaseMatrix3X3ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:775:6: ( ruleBaseMatrix4X4 )
                    {
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:775:6: ( ruleBaseMatrix4X4 )
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:776:1: ruleBaseMatrix4X4
                    {
                     before(grammarAccess.getMatrixDefAccess().getBaseMatrix4X4ParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBaseMatrix4X4_in_rule__MatrixDef__Alternatives1608);
                    ruleBaseMatrix4X4();

                    state._fsp--;

                     after(grammarAccess.getMatrixDefAccess().getBaseMatrix4X4ParserRuleCall_1()); 

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
    // $ANTLR end "rule__MatrixDef__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:788:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:792:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:793:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01638);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01641);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:800:1: rule__Model__Group__0__Impl : ( ( rule__Model__DefsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:804:1: ( ( ( rule__Model__DefsAssignment_0 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:805:1: ( ( rule__Model__DefsAssignment_0 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:805:1: ( ( rule__Model__DefsAssignment_0 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:806:1: ( rule__Model__DefsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getDefsAssignment_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:807:1: ( rule__Model__DefsAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28||(LA7_0>=36 && LA7_0<=37)||(LA7_0>=39 && LA7_0<=40)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:807:2: rule__Model__DefsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__DefsAssignment_0_in_rule__Model__Group__0__Impl1668);
            	    rule__Model__DefsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:817:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:821:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:822:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11699);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11702);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:829:1: rule__Model__Group__1__Impl : ( ( rule__Model__WorldAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:833:1: ( ( ( rule__Model__WorldAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:834:1: ( ( rule__Model__WorldAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:834:1: ( ( rule__Model__WorldAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:835:1: ( rule__Model__WorldAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getWorldAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:836:1: ( rule__Model__WorldAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:836:2: rule__Model__WorldAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__WorldAssignment_1_in_rule__Model__Group__1__Impl1729);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:846:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:850:1: ( rule__Model__Group__2__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:851:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21759);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:857:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:861:1: ( ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:862:1: ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:862:1: ( ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:863:1: ( ( rule__Model__BodiesAssignment_2 ) ) ( ( rule__Model__BodiesAssignment_2 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:863:1: ( ( rule__Model__BodiesAssignment_2 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:864:1: ( rule__Model__BodiesAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getBodiesAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:865:1: ( rule__Model__BodiesAssignment_2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:865:2: rule__Model__BodiesAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl1788);
            rule__Model__BodiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBodiesAssignment_2()); 

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:868:1: ( ( rule__Model__BodiesAssignment_2 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:869:1: ( rule__Model__BodiesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getBodiesAssignment_2()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:870:1: ( rule__Model__BodiesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:870:2: rule__Model__BodiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl1800);
            	    rule__Model__BodiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:887:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:891:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:892:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_rule__Environment__Group__0__Impl_in_rule__Environment__Group__01839);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__1_in_rule__Environment__Group__01842);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:899:1: rule__Environment__Group__0__Impl : ( 'world' ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:903:1: ( ( 'world' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:904:1: ( 'world' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:904:1: ( 'world' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:905:1: 'world'
            {
             before(grammarAccess.getEnvironmentAccess().getWorldKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Environment__Group__0__Impl1870); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:918:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:922:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:923:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_rule__Environment__Group__1__Impl_in_rule__Environment__Group__11901);
            rule__Environment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__2_in_rule__Environment__Group__11904);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:930:1: rule__Environment__Group__1__Impl : ( '{' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:934:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:935:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:935:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:936:1: '{'
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Environment__Group__1__Impl1932); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:949:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:953:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:954:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_rule__Environment__Group__2__Impl_in_rule__Environment__Group__21963);
            rule__Environment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__3_in_rule__Environment__Group__21966);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:961:1: rule__Environment__Group__2__Impl : ( 'gravity' ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:965:1: ( ( 'gravity' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:966:1: ( 'gravity' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:966:1: ( 'gravity' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:967:1: 'gravity'
            {
             before(grammarAccess.getEnvironmentAccess().getGravityKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Environment__Group__2__Impl1994); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:980:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl rule__Environment__Group__4 ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:984:1: ( rule__Environment__Group__3__Impl rule__Environment__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:985:2: rule__Environment__Group__3__Impl rule__Environment__Group__4
            {
            pushFollow(FOLLOW_rule__Environment__Group__3__Impl_in_rule__Environment__Group__32025);
            rule__Environment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__4_in_rule__Environment__Group__32028);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:992:1: rule__Environment__Group__3__Impl : ( ( rule__Environment__GravityAssignment_3 ) ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:996:1: ( ( ( rule__Environment__GravityAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:997:1: ( ( rule__Environment__GravityAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:997:1: ( ( rule__Environment__GravityAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:998:1: ( rule__Environment__GravityAssignment_3 )
            {
             before(grammarAccess.getEnvironmentAccess().getGravityAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:999:1: ( rule__Environment__GravityAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:999:2: rule__Environment__GravityAssignment_3
            {
            pushFollow(FOLLOW_rule__Environment__GravityAssignment_3_in_rule__Environment__Group__3__Impl2055);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1009:1: rule__Environment__Group__4 : rule__Environment__Group__4__Impl ;
    public final void rule__Environment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1013:1: ( rule__Environment__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1014:2: rule__Environment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Environment__Group__4__Impl_in_rule__Environment__Group__42085);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1020:1: rule__Environment__Group__4__Impl : ( '}' ) ;
    public final void rule__Environment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1024:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1025:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1025:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1026:1: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Environment__Group__4__Impl2113); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1049:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1053:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1054:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__02154);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__02157);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1061:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1065:1: ( ( 'system' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1066:1: ( 'system' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1066:1: ( 'system' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1067:1: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__System__Group__0__Impl2185); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1080:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1084:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1085:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__12216);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__12219);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1092:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1096:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1097:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1097:1: ( ( rule__System__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1098:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1099:1: ( rule__System__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1099:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl2246);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1109:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1113:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1114:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__22276);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__22279);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1121:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1125:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1126:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1126:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1127:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__System__Group__2__Impl2307); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1140:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1144:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1145:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__32338);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__32341);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1152:1: rule__System__Group__3__Impl : ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1156:1: ( ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1157:1: ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1157:1: ( ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1158:1: ( ( rule__System__ElementsAssignment_3 ) ) ( ( rule__System__ElementsAssignment_3 )* )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1158:1: ( ( rule__System__ElementsAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1159:1: ( rule__System__ElementsAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getElementsAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1160:1: ( rule__System__ElementsAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1160:2: rule__System__ElementsAssignment_3
            {
            pushFollow(FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl2370);
            rule__System__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getElementsAssignment_3()); 

            }

            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1163:1: ( ( rule__System__ElementsAssignment_3 )* )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1164:1: ( rule__System__ElementsAssignment_3 )*
            {
             before(grammarAccess.getSystemAccess().getElementsAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1165:1: ( rule__System__ElementsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17||LA9_0==25||LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1165:2: rule__System__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl2382);
            	    rule__System__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1176:1: rule__System__Group__4 : rule__System__Group__4__Impl ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1180:1: ( rule__System__Group__4__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1181:2: rule__System__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__42415);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1187:1: rule__System__Group__4__Impl : ( '}' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1191:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1192:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1192:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1193:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__System__Group__4__Impl2443); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1216:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1220:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1221:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__02484);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__02487);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1228:1: rule__Body__Group__0__Impl : ( 'body' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1232:1: ( ( 'body' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1233:1: ( 'body' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1233:1: ( 'body' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1234:1: 'body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Body__Group__0__Impl2515); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1247:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1251:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1252:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__12546);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__12549);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1259:1: rule__Body__Group__1__Impl : ( ( rule__Body__NameAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1263:1: ( ( ( rule__Body__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1264:1: ( ( rule__Body__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1264:1: ( ( rule__Body__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1265:1: ( rule__Body__NameAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1266:1: ( rule__Body__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1266:2: rule__Body__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__NameAssignment_1_in_rule__Body__Group__1__Impl2576);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1276:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1280:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1281:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__22606);
            rule__Body__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__22609);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1288:1: rule__Body__Group__2__Impl : ( '{' ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1292:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1293:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1293:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1294:1: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Body__Group__2__Impl2637); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1307:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1311:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1312:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__32668);
            rule__Body__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__4_in_rule__Body__Group__32671);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1319:1: rule__Body__Group__3__Impl : ( ( rule__Body__FrameAssignment_3 ) ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1323:1: ( ( ( rule__Body__FrameAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1324:1: ( ( rule__Body__FrameAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1324:1: ( ( rule__Body__FrameAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1325:1: ( rule__Body__FrameAssignment_3 )
            {
             before(grammarAccess.getBodyAccess().getFrameAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1326:1: ( rule__Body__FrameAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1326:2: rule__Body__FrameAssignment_3
            {
            pushFollow(FOLLOW_rule__Body__FrameAssignment_3_in_rule__Body__Group__3__Impl2698);
            rule__Body__FrameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getFrameAssignment_3()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1336:1: rule__Body__Group__4 : rule__Body__Group__4__Impl rule__Body__Group__5 ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1340:1: ( rule__Body__Group__4__Impl rule__Body__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1341:2: rule__Body__Group__4__Impl rule__Body__Group__5
            {
            pushFollow(FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__42728);
            rule__Body__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Body__Group__5_in_rule__Body__Group__42731);
            rule__Body__Group__5();

            state._fsp--;


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1348:1: rule__Body__Group__4__Impl : ( ( rule__Body__MassAssignment_4 ) ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1352:1: ( ( ( rule__Body__MassAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1353:1: ( ( rule__Body__MassAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1353:1: ( ( rule__Body__MassAssignment_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1354:1: ( rule__Body__MassAssignment_4 )
            {
             before(grammarAccess.getBodyAccess().getMassAssignment_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1355:1: ( rule__Body__MassAssignment_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1355:2: rule__Body__MassAssignment_4
            {
            pushFollow(FOLLOW_rule__Body__MassAssignment_4_in_rule__Body__Group__4__Impl2758);
            rule__Body__MassAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getMassAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Body__Group__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1365:1: rule__Body__Group__5 : rule__Body__Group__5__Impl ;
    public final void rule__Body__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1369:1: ( rule__Body__Group__5__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1370:2: rule__Body__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__52788);
            rule__Body__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__5"


    // $ANTLR start "rule__Body__Group__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1376:1: rule__Body__Group__5__Impl : ( '}' ) ;
    public final void rule__Body__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1380:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1381:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1381:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1382:1: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Body__Group__5__Impl2816); 
             after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__5__Impl"


    // $ANTLR start "rule__LocalFrame__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1407:1: rule__LocalFrame__Group__0 : rule__LocalFrame__Group__0__Impl rule__LocalFrame__Group__1 ;
    public final void rule__LocalFrame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1411:1: ( rule__LocalFrame__Group__0__Impl rule__LocalFrame__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1412:2: rule__LocalFrame__Group__0__Impl rule__LocalFrame__Group__1
            {
            pushFollow(FOLLOW_rule__LocalFrame__Group__0__Impl_in_rule__LocalFrame__Group__02859);
            rule__LocalFrame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalFrame__Group__1_in_rule__LocalFrame__Group__02862);
            rule__LocalFrame__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__0"


    // $ANTLR start "rule__LocalFrame__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1419:1: rule__LocalFrame__Group__0__Impl : ( 'local' ) ;
    public final void rule__LocalFrame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1423:1: ( ( 'local' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1424:1: ( 'local' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1424:1: ( 'local' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1425:1: 'local'
            {
             before(grammarAccess.getLocalFrameAccess().getLocalKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__LocalFrame__Group__0__Impl2890); 
             after(grammarAccess.getLocalFrameAccess().getLocalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__0__Impl"


    // $ANTLR start "rule__LocalFrame__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1438:1: rule__LocalFrame__Group__1 : rule__LocalFrame__Group__1__Impl rule__LocalFrame__Group__2 ;
    public final void rule__LocalFrame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1442:1: ( rule__LocalFrame__Group__1__Impl rule__LocalFrame__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1443:2: rule__LocalFrame__Group__1__Impl rule__LocalFrame__Group__2
            {
            pushFollow(FOLLOW_rule__LocalFrame__Group__1__Impl_in_rule__LocalFrame__Group__12921);
            rule__LocalFrame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalFrame__Group__2_in_rule__LocalFrame__Group__12924);
            rule__LocalFrame__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__1"


    // $ANTLR start "rule__LocalFrame__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1450:1: rule__LocalFrame__Group__1__Impl : ( 'frame' ) ;
    public final void rule__LocalFrame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1454:1: ( ( 'frame' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1455:1: ( 'frame' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1455:1: ( 'frame' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1456:1: 'frame'
            {
             before(grammarAccess.getLocalFrameAccess().getFrameKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__LocalFrame__Group__1__Impl2952); 
             after(grammarAccess.getLocalFrameAccess().getFrameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__1__Impl"


    // $ANTLR start "rule__LocalFrame__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1469:1: rule__LocalFrame__Group__2 : rule__LocalFrame__Group__2__Impl rule__LocalFrame__Group__3 ;
    public final void rule__LocalFrame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1473:1: ( rule__LocalFrame__Group__2__Impl rule__LocalFrame__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1474:2: rule__LocalFrame__Group__2__Impl rule__LocalFrame__Group__3
            {
            pushFollow(FOLLOW_rule__LocalFrame__Group__2__Impl_in_rule__LocalFrame__Group__22983);
            rule__LocalFrame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalFrame__Group__3_in_rule__LocalFrame__Group__22986);
            rule__LocalFrame__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__2"


    // $ANTLR start "rule__LocalFrame__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1481:1: rule__LocalFrame__Group__2__Impl : ( '{' ) ;
    public final void rule__LocalFrame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1485:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1486:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1486:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1487:1: '{'
            {
             before(grammarAccess.getLocalFrameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__LocalFrame__Group__2__Impl3014); 
             after(grammarAccess.getLocalFrameAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__2__Impl"


    // $ANTLR start "rule__LocalFrame__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1500:1: rule__LocalFrame__Group__3 : rule__LocalFrame__Group__3__Impl rule__LocalFrame__Group__4 ;
    public final void rule__LocalFrame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1504:1: ( rule__LocalFrame__Group__3__Impl rule__LocalFrame__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1505:2: rule__LocalFrame__Group__3__Impl rule__LocalFrame__Group__4
            {
            pushFollow(FOLLOW_rule__LocalFrame__Group__3__Impl_in_rule__LocalFrame__Group__33045);
            rule__LocalFrame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalFrame__Group__4_in_rule__LocalFrame__Group__33048);
            rule__LocalFrame__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__3"


    // $ANTLR start "rule__LocalFrame__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1512:1: rule__LocalFrame__Group__3__Impl : ( 'orientation' ) ;
    public final void rule__LocalFrame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1516:1: ( ( 'orientation' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1517:1: ( 'orientation' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1517:1: ( 'orientation' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1518:1: 'orientation'
            {
             before(grammarAccess.getLocalFrameAccess().getOrientationKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__LocalFrame__Group__3__Impl3076); 
             after(grammarAccess.getLocalFrameAccess().getOrientationKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__3__Impl"


    // $ANTLR start "rule__LocalFrame__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1531:1: rule__LocalFrame__Group__4 : rule__LocalFrame__Group__4__Impl rule__LocalFrame__Group__5 ;
    public final void rule__LocalFrame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1535:1: ( rule__LocalFrame__Group__4__Impl rule__LocalFrame__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1536:2: rule__LocalFrame__Group__4__Impl rule__LocalFrame__Group__5
            {
            pushFollow(FOLLOW_rule__LocalFrame__Group__4__Impl_in_rule__LocalFrame__Group__43107);
            rule__LocalFrame__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalFrame__Group__5_in_rule__LocalFrame__Group__43110);
            rule__LocalFrame__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__4"


    // $ANTLR start "rule__LocalFrame__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1543:1: rule__LocalFrame__Group__4__Impl : ( ( rule__LocalFrame__OrientationAssignment_4 ) ) ;
    public final void rule__LocalFrame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1547:1: ( ( ( rule__LocalFrame__OrientationAssignment_4 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1548:1: ( ( rule__LocalFrame__OrientationAssignment_4 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1548:1: ( ( rule__LocalFrame__OrientationAssignment_4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1549:1: ( rule__LocalFrame__OrientationAssignment_4 )
            {
             before(grammarAccess.getLocalFrameAccess().getOrientationAssignment_4()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1550:1: ( rule__LocalFrame__OrientationAssignment_4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1550:2: rule__LocalFrame__OrientationAssignment_4
            {
            pushFollow(FOLLOW_rule__LocalFrame__OrientationAssignment_4_in_rule__LocalFrame__Group__4__Impl3137);
            rule__LocalFrame__OrientationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLocalFrameAccess().getOrientationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__4__Impl"


    // $ANTLR start "rule__LocalFrame__Group__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1560:1: rule__LocalFrame__Group__5 : rule__LocalFrame__Group__5__Impl rule__LocalFrame__Group__6 ;
    public final void rule__LocalFrame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1564:1: ( rule__LocalFrame__Group__5__Impl rule__LocalFrame__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1565:2: rule__LocalFrame__Group__5__Impl rule__LocalFrame__Group__6
            {
            pushFollow(FOLLOW_rule__LocalFrame__Group__5__Impl_in_rule__LocalFrame__Group__53167);
            rule__LocalFrame__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalFrame__Group__6_in_rule__LocalFrame__Group__53170);
            rule__LocalFrame__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__5"


    // $ANTLR start "rule__LocalFrame__Group__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1572:1: rule__LocalFrame__Group__5__Impl : ( 'position' ) ;
    public final void rule__LocalFrame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1576:1: ( ( 'position' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1577:1: ( 'position' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1577:1: ( 'position' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1578:1: 'position'
            {
             before(grammarAccess.getLocalFrameAccess().getPositionKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__LocalFrame__Group__5__Impl3198); 
             after(grammarAccess.getLocalFrameAccess().getPositionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__5__Impl"


    // $ANTLR start "rule__LocalFrame__Group__6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1591:1: rule__LocalFrame__Group__6 : rule__LocalFrame__Group__6__Impl rule__LocalFrame__Group__7 ;
    public final void rule__LocalFrame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1595:1: ( rule__LocalFrame__Group__6__Impl rule__LocalFrame__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1596:2: rule__LocalFrame__Group__6__Impl rule__LocalFrame__Group__7
            {
            pushFollow(FOLLOW_rule__LocalFrame__Group__6__Impl_in_rule__LocalFrame__Group__63229);
            rule__LocalFrame__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalFrame__Group__7_in_rule__LocalFrame__Group__63232);
            rule__LocalFrame__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__6"


    // $ANTLR start "rule__LocalFrame__Group__6__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1603:1: rule__LocalFrame__Group__6__Impl : ( ( rule__LocalFrame__PositionAssignment_6 ) ) ;
    public final void rule__LocalFrame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1607:1: ( ( ( rule__LocalFrame__PositionAssignment_6 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1608:1: ( ( rule__LocalFrame__PositionAssignment_6 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1608:1: ( ( rule__LocalFrame__PositionAssignment_6 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1609:1: ( rule__LocalFrame__PositionAssignment_6 )
            {
             before(grammarAccess.getLocalFrameAccess().getPositionAssignment_6()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1610:1: ( rule__LocalFrame__PositionAssignment_6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1610:2: rule__LocalFrame__PositionAssignment_6
            {
            pushFollow(FOLLOW_rule__LocalFrame__PositionAssignment_6_in_rule__LocalFrame__Group__6__Impl3259);
            rule__LocalFrame__PositionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLocalFrameAccess().getPositionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__6__Impl"


    // $ANTLR start "rule__LocalFrame__Group__7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1620:1: rule__LocalFrame__Group__7 : rule__LocalFrame__Group__7__Impl ;
    public final void rule__LocalFrame__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1624:1: ( rule__LocalFrame__Group__7__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1625:2: rule__LocalFrame__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__LocalFrame__Group__7__Impl_in_rule__LocalFrame__Group__73289);
            rule__LocalFrame__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__7"


    // $ANTLR start "rule__LocalFrame__Group__7__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1631:1: rule__LocalFrame__Group__7__Impl : ( '}' ) ;
    public final void rule__LocalFrame__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1635:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1636:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1636:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1637:1: '}'
            {
             before(grammarAccess.getLocalFrameAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__LocalFrame__Group__7__Impl3317); 
             after(grammarAccess.getLocalFrameAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__Group__7__Impl"


    // $ANTLR start "rule__Mass__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1666:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1670:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1671:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_rule__Mass__Group__0__Impl_in_rule__Mass__Group__03364);
            rule__Mass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__1_in_rule__Mass__Group__03367);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1678:1: rule__Mass__Group__0__Impl : ( 'mass' ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1682:1: ( ( 'mass' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1683:1: ( 'mass' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1683:1: ( 'mass' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1684:1: 'mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Mass__Group__0__Impl3395); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1697:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1701:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1702:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_rule__Mass__Group__1__Impl_in_rule__Mass__Group__13426);
            rule__Mass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__2_in_rule__Mass__Group__13429);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1709:1: rule__Mass__Group__1__Impl : ( '{' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1713:1: ( ( '{' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1714:1: ( '{' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1714:1: ( '{' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1715:1: '{'
            {
             before(grammarAccess.getMassAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Mass__Group__1__Impl3457); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1728:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1732:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1733:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_rule__Mass__Group__2__Impl_in_rule__Mass__Group__23488);
            rule__Mass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__3_in_rule__Mass__Group__23491);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1740:1: rule__Mass__Group__2__Impl : ( 'value' ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1744:1: ( ( 'value' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1745:1: ( 'value' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1745:1: ( 'value' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1746:1: 'value'
            {
             before(grammarAccess.getMassAccess().getValueKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Mass__Group__2__Impl3519); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1759:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1763:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1764:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
            {
            pushFollow(FOLLOW_rule__Mass__Group__3__Impl_in_rule__Mass__Group__33550);
            rule__Mass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__4_in_rule__Mass__Group__33553);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1771:1: rule__Mass__Group__3__Impl : ( ( rule__Mass__ValueAssignment_3 ) ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1775:1: ( ( ( rule__Mass__ValueAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1776:1: ( ( rule__Mass__ValueAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1776:1: ( ( rule__Mass__ValueAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1777:1: ( rule__Mass__ValueAssignment_3 )
            {
             before(grammarAccess.getMassAccess().getValueAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1778:1: ( rule__Mass__ValueAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1778:2: rule__Mass__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Mass__ValueAssignment_3_in_rule__Mass__Group__3__Impl3580);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1788:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl rule__Mass__Group__5 ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1792:1: ( rule__Mass__Group__4__Impl rule__Mass__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1793:2: rule__Mass__Group__4__Impl rule__Mass__Group__5
            {
            pushFollow(FOLLOW_rule__Mass__Group__4__Impl_in_rule__Mass__Group__43610);
            rule__Mass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__5_in_rule__Mass__Group__43613);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1800:1: rule__Mass__Group__4__Impl : ( 'position' ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1804:1: ( ( 'position' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1805:1: ( 'position' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1805:1: ( 'position' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1806:1: 'position'
            {
             before(grammarAccess.getMassAccess().getPositionKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Mass__Group__4__Impl3641); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1819:1: rule__Mass__Group__5 : rule__Mass__Group__5__Impl rule__Mass__Group__6 ;
    public final void rule__Mass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1823:1: ( rule__Mass__Group__5__Impl rule__Mass__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1824:2: rule__Mass__Group__5__Impl rule__Mass__Group__6
            {
            pushFollow(FOLLOW_rule__Mass__Group__5__Impl_in_rule__Mass__Group__53672);
            rule__Mass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__6_in_rule__Mass__Group__53675);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1831:1: rule__Mass__Group__5__Impl : ( ( rule__Mass__PositionAssignment_5 ) ) ;
    public final void rule__Mass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1835:1: ( ( ( rule__Mass__PositionAssignment_5 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1836:1: ( ( rule__Mass__PositionAssignment_5 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1836:1: ( ( rule__Mass__PositionAssignment_5 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1837:1: ( rule__Mass__PositionAssignment_5 )
            {
             before(grammarAccess.getMassAccess().getPositionAssignment_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1838:1: ( rule__Mass__PositionAssignment_5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1838:2: rule__Mass__PositionAssignment_5
            {
            pushFollow(FOLLOW_rule__Mass__PositionAssignment_5_in_rule__Mass__Group__5__Impl3702);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1848:1: rule__Mass__Group__6 : rule__Mass__Group__6__Impl rule__Mass__Group__7 ;
    public final void rule__Mass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1852:1: ( rule__Mass__Group__6__Impl rule__Mass__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1853:2: rule__Mass__Group__6__Impl rule__Mass__Group__7
            {
            pushFollow(FOLLOW_rule__Mass__Group__6__Impl_in_rule__Mass__Group__63732);
            rule__Mass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__7_in_rule__Mass__Group__63735);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1860:1: rule__Mass__Group__6__Impl : ( 'inertia' ) ;
    public final void rule__Mass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1864:1: ( ( 'inertia' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1865:1: ( 'inertia' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1865:1: ( 'inertia' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1866:1: 'inertia'
            {
             before(grammarAccess.getMassAccess().getInertiaKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__Mass__Group__6__Impl3763); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1879:1: rule__Mass__Group__7 : rule__Mass__Group__7__Impl rule__Mass__Group__8 ;
    public final void rule__Mass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1883:1: ( rule__Mass__Group__7__Impl rule__Mass__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1884:2: rule__Mass__Group__7__Impl rule__Mass__Group__8
            {
            pushFollow(FOLLOW_rule__Mass__Group__7__Impl_in_rule__Mass__Group__73794);
            rule__Mass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mass__Group__8_in_rule__Mass__Group__73797);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1891:1: rule__Mass__Group__7__Impl : ( ( rule__Mass__InertiaAssignment_7 ) ) ;
    public final void rule__Mass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1895:1: ( ( ( rule__Mass__InertiaAssignment_7 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1896:1: ( ( rule__Mass__InertiaAssignment_7 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1896:1: ( ( rule__Mass__InertiaAssignment_7 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1897:1: ( rule__Mass__InertiaAssignment_7 )
            {
             before(grammarAccess.getMassAccess().getInertiaAssignment_7()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1898:1: ( rule__Mass__InertiaAssignment_7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1898:2: rule__Mass__InertiaAssignment_7
            {
            pushFollow(FOLLOW_rule__Mass__InertiaAssignment_7_in_rule__Mass__Group__7__Impl3824);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1908:1: rule__Mass__Group__8 : rule__Mass__Group__8__Impl ;
    public final void rule__Mass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1912:1: ( rule__Mass__Group__8__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1913:2: rule__Mass__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Mass__Group__8__Impl_in_rule__Mass__Group__83854);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1919:1: rule__Mass__Group__8__Impl : ( '}' ) ;
    public final void rule__Mass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1923:1: ( ( '}' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1924:1: ( '}' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1924:1: ( '}' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1925:1: '}'
            {
             before(grammarAccess.getMassAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_15_in_rule__Mass__Group__8__Impl3882); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1956:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1960:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1961:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_rule__Joint__Group__0__Impl_in_rule__Joint__Group__03931);
            rule__Joint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__1_in_rule__Joint__Group__03934);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1968:1: rule__Joint__Group__0__Impl : ( 'joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1972:1: ( ( 'joint' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1973:1: ( 'joint' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1973:1: ( 'joint' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1974:1: 'joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Joint__Group__0__Impl3962); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1987:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1991:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1992:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_rule__Joint__Group__1__Impl_in_rule__Joint__Group__13993);
            rule__Joint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__2_in_rule__Joint__Group__13996);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:1999:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2003:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2004:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2004:1: ( ( rule__Joint__NameAssignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2005:1: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2006:1: ( rule__Joint__NameAssignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2006:2: rule__Joint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Joint__NameAssignment_1_in_rule__Joint__Group__1__Impl4023);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2016:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2020:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2021:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_rule__Joint__Group__2__Impl_in_rule__Joint__Group__24053);
            rule__Joint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__3_in_rule__Joint__Group__24056);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2028:1: rule__Joint__Group__2__Impl : ( ':' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2032:1: ( ( ':' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2033:1: ( ':' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2033:1: ( ':' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2034:1: ':'
            {
             before(grammarAccess.getJointAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Joint__Group__2__Impl4084); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2047:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2051:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2052:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_rule__Joint__Group__3__Impl_in_rule__Joint__Group__34115);
            rule__Joint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__4_in_rule__Joint__Group__34118);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2059:1: rule__Joint__Group__3__Impl : ( ( rule__Joint__TypeAssignment_3 ) ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2063:1: ( ( ( rule__Joint__TypeAssignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2064:1: ( ( rule__Joint__TypeAssignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2064:1: ( ( rule__Joint__TypeAssignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2065:1: ( rule__Joint__TypeAssignment_3 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2066:1: ( rule__Joint__TypeAssignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2066:2: rule__Joint__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Joint__TypeAssignment_3_in_rule__Joint__Group__3__Impl4145);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2076:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2080:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2081:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_rule__Joint__Group__4__Impl_in_rule__Joint__Group__44175);
            rule__Joint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__5_in_rule__Joint__Group__44178);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2088:1: rule__Joint__Group__4__Impl : ( 'between' ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2092:1: ( ( 'between' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2093:1: ( 'between' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2093:1: ( 'between' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2094:1: 'between'
            {
             before(grammarAccess.getJointAccess().getBetweenKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Joint__Group__4__Impl4206); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2107:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2111:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2112:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_rule__Joint__Group__5__Impl_in_rule__Joint__Group__54237);
            rule__Joint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__6_in_rule__Joint__Group__54240);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2119:1: rule__Joint__Group__5__Impl : ( ( rule__Joint__Body1Assignment_5 ) ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2123:1: ( ( ( rule__Joint__Body1Assignment_5 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2124:1: ( ( rule__Joint__Body1Assignment_5 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2124:1: ( ( rule__Joint__Body1Assignment_5 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2125:1: ( rule__Joint__Body1Assignment_5 )
            {
             before(grammarAccess.getJointAccess().getBody1Assignment_5()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2126:1: ( rule__Joint__Body1Assignment_5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2126:2: rule__Joint__Body1Assignment_5
            {
            pushFollow(FOLLOW_rule__Joint__Body1Assignment_5_in_rule__Joint__Group__5__Impl4267);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2136:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2140:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2141:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_rule__Joint__Group__6__Impl_in_rule__Joint__Group__64297);
            rule__Joint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__7_in_rule__Joint__Group__64300);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2148:1: rule__Joint__Group__6__Impl : ( '(' ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2152:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2153:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2153:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2154:1: '('
            {
             before(grammarAccess.getJointAccess().getLeftParenthesisKeyword_6()); 
            match(input,28,FOLLOW_28_in_rule__Joint__Group__6__Impl4328); 
             after(grammarAccess.getJointAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2167:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2171:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2172:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_rule__Joint__Group__7__Impl_in_rule__Joint__Group__74359);
            rule__Joint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__8_in_rule__Joint__Group__74362);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2179:1: rule__Joint__Group__7__Impl : ( 'with' ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2183:1: ( ( 'with' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2184:1: ( 'with' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2184:1: ( 'with' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2185:1: 'with'
            {
             before(grammarAccess.getJointAccess().getWithKeyword_7()); 
            match(input,29,FOLLOW_29_in_rule__Joint__Group__7__Impl4390); 
             after(grammarAccess.getJointAccess().getWithKeyword_7()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2198:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2202:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2203:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_rule__Joint__Group__8__Impl_in_rule__Joint__Group__84421);
            rule__Joint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__9_in_rule__Joint__Group__84424);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2210:1: rule__Joint__Group__8__Impl : ( 'relative' ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2214:1: ( ( 'relative' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2215:1: ( 'relative' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2215:1: ( 'relative' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2216:1: 'relative'
            {
             before(grammarAccess.getJointAccess().getRelativeKeyword_8()); 
            match(input,30,FOLLOW_30_in_rule__Joint__Group__8__Impl4452); 
             after(grammarAccess.getJointAccess().getRelativeKeyword_8()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2229:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2233:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2234:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_rule__Joint__Group__9__Impl_in_rule__Joint__Group__94483);
            rule__Joint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__10_in_rule__Joint__Group__94486);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2241:1: rule__Joint__Group__9__Impl : ( 'transformation' ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2245:1: ( ( 'transformation' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2246:1: ( 'transformation' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2246:1: ( 'transformation' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2247:1: 'transformation'
            {
             before(grammarAccess.getJointAccess().getTransformationKeyword_9()); 
            match(input,31,FOLLOW_31_in_rule__Joint__Group__9__Impl4514); 
             after(grammarAccess.getJointAccess().getTransformationKeyword_9()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2260:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl rule__Joint__Group__11 ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2264:1: ( rule__Joint__Group__10__Impl rule__Joint__Group__11 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2265:2: rule__Joint__Group__10__Impl rule__Joint__Group__11
            {
            pushFollow(FOLLOW_rule__Joint__Group__10__Impl_in_rule__Joint__Group__104545);
            rule__Joint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__11_in_rule__Joint__Group__104548);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2272:1: rule__Joint__Group__10__Impl : ( ( rule__Joint__RelTransformation1Assignment_10 ) ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2276:1: ( ( ( rule__Joint__RelTransformation1Assignment_10 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2277:1: ( ( rule__Joint__RelTransformation1Assignment_10 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2277:1: ( ( rule__Joint__RelTransformation1Assignment_10 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2278:1: ( rule__Joint__RelTransformation1Assignment_10 )
            {
             before(grammarAccess.getJointAccess().getRelTransformation1Assignment_10()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2279:1: ( rule__Joint__RelTransformation1Assignment_10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2279:2: rule__Joint__RelTransformation1Assignment_10
            {
            pushFollow(FOLLOW_rule__Joint__RelTransformation1Assignment_10_in_rule__Joint__Group__10__Impl4575);
            rule__Joint__RelTransformation1Assignment_10();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getRelTransformation1Assignment_10()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2289:1: rule__Joint__Group__11 : rule__Joint__Group__11__Impl rule__Joint__Group__12 ;
    public final void rule__Joint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2293:1: ( rule__Joint__Group__11__Impl rule__Joint__Group__12 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2294:2: rule__Joint__Group__11__Impl rule__Joint__Group__12
            {
            pushFollow(FOLLOW_rule__Joint__Group__11__Impl_in_rule__Joint__Group__114605);
            rule__Joint__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__12_in_rule__Joint__Group__114608);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2301:1: rule__Joint__Group__11__Impl : ( ')' ) ;
    public final void rule__Joint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2305:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2306:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2306:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2307:1: ')'
            {
             before(grammarAccess.getJointAccess().getRightParenthesisKeyword_11()); 
            match(input,32,FOLLOW_32_in_rule__Joint__Group__11__Impl4636); 
             after(grammarAccess.getJointAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2320:1: rule__Joint__Group__12 : rule__Joint__Group__12__Impl rule__Joint__Group__13 ;
    public final void rule__Joint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2324:1: ( rule__Joint__Group__12__Impl rule__Joint__Group__13 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2325:2: rule__Joint__Group__12__Impl rule__Joint__Group__13
            {
            pushFollow(FOLLOW_rule__Joint__Group__12__Impl_in_rule__Joint__Group__124667);
            rule__Joint__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__13_in_rule__Joint__Group__124670);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2332:1: rule__Joint__Group__12__Impl : ( 'and' ) ;
    public final void rule__Joint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2336:1: ( ( 'and' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2337:1: ( 'and' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2337:1: ( 'and' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2338:1: 'and'
            {
             before(grammarAccess.getJointAccess().getAndKeyword_12()); 
            match(input,33,FOLLOW_33_in_rule__Joint__Group__12__Impl4698); 
             after(grammarAccess.getJointAccess().getAndKeyword_12()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2351:1: rule__Joint__Group__13 : rule__Joint__Group__13__Impl rule__Joint__Group__14 ;
    public final void rule__Joint__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2355:1: ( rule__Joint__Group__13__Impl rule__Joint__Group__14 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2356:2: rule__Joint__Group__13__Impl rule__Joint__Group__14
            {
            pushFollow(FOLLOW_rule__Joint__Group__13__Impl_in_rule__Joint__Group__134729);
            rule__Joint__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__14_in_rule__Joint__Group__134732);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2363:1: rule__Joint__Group__13__Impl : ( ( rule__Joint__Body2Assignment_13 ) ) ;
    public final void rule__Joint__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2367:1: ( ( ( rule__Joint__Body2Assignment_13 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2368:1: ( ( rule__Joint__Body2Assignment_13 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2368:1: ( ( rule__Joint__Body2Assignment_13 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2369:1: ( rule__Joint__Body2Assignment_13 )
            {
             before(grammarAccess.getJointAccess().getBody2Assignment_13()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2370:1: ( rule__Joint__Body2Assignment_13 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2370:2: rule__Joint__Body2Assignment_13
            {
            pushFollow(FOLLOW_rule__Joint__Body2Assignment_13_in_rule__Joint__Group__13__Impl4759);
            rule__Joint__Body2Assignment_13();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getBody2Assignment_13()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2380:1: rule__Joint__Group__14 : rule__Joint__Group__14__Impl rule__Joint__Group__15 ;
    public final void rule__Joint__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2384:1: ( rule__Joint__Group__14__Impl rule__Joint__Group__15 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2385:2: rule__Joint__Group__14__Impl rule__Joint__Group__15
            {
            pushFollow(FOLLOW_rule__Joint__Group__14__Impl_in_rule__Joint__Group__144789);
            rule__Joint__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__15_in_rule__Joint__Group__144792);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2392:1: rule__Joint__Group__14__Impl : ( '(' ) ;
    public final void rule__Joint__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2396:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2397:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2397:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2398:1: '('
            {
             before(grammarAccess.getJointAccess().getLeftParenthesisKeyword_14()); 
            match(input,28,FOLLOW_28_in_rule__Joint__Group__14__Impl4820); 
             after(grammarAccess.getJointAccess().getLeftParenthesisKeyword_14()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2411:1: rule__Joint__Group__15 : rule__Joint__Group__15__Impl rule__Joint__Group__16 ;
    public final void rule__Joint__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2415:1: ( rule__Joint__Group__15__Impl rule__Joint__Group__16 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2416:2: rule__Joint__Group__15__Impl rule__Joint__Group__16
            {
            pushFollow(FOLLOW_rule__Joint__Group__15__Impl_in_rule__Joint__Group__154851);
            rule__Joint__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__16_in_rule__Joint__Group__154854);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2423:1: rule__Joint__Group__15__Impl : ( 'with' ) ;
    public final void rule__Joint__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2427:1: ( ( 'with' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2428:1: ( 'with' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2428:1: ( 'with' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2429:1: 'with'
            {
             before(grammarAccess.getJointAccess().getWithKeyword_15()); 
            match(input,29,FOLLOW_29_in_rule__Joint__Group__15__Impl4882); 
             after(grammarAccess.getJointAccess().getWithKeyword_15()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2442:1: rule__Joint__Group__16 : rule__Joint__Group__16__Impl rule__Joint__Group__17 ;
    public final void rule__Joint__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2446:1: ( rule__Joint__Group__16__Impl rule__Joint__Group__17 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2447:2: rule__Joint__Group__16__Impl rule__Joint__Group__17
            {
            pushFollow(FOLLOW_rule__Joint__Group__16__Impl_in_rule__Joint__Group__164913);
            rule__Joint__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__17_in_rule__Joint__Group__164916);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2454:1: rule__Joint__Group__16__Impl : ( 'relative' ) ;
    public final void rule__Joint__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2458:1: ( ( 'relative' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2459:1: ( 'relative' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2459:1: ( 'relative' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2460:1: 'relative'
            {
             before(grammarAccess.getJointAccess().getRelativeKeyword_16()); 
            match(input,30,FOLLOW_30_in_rule__Joint__Group__16__Impl4944); 
             after(grammarAccess.getJointAccess().getRelativeKeyword_16()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2473:1: rule__Joint__Group__17 : rule__Joint__Group__17__Impl rule__Joint__Group__18 ;
    public final void rule__Joint__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2477:1: ( rule__Joint__Group__17__Impl rule__Joint__Group__18 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2478:2: rule__Joint__Group__17__Impl rule__Joint__Group__18
            {
            pushFollow(FOLLOW_rule__Joint__Group__17__Impl_in_rule__Joint__Group__174975);
            rule__Joint__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__18_in_rule__Joint__Group__174978);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2485:1: rule__Joint__Group__17__Impl : ( 'transformation' ) ;
    public final void rule__Joint__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2489:1: ( ( 'transformation' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2490:1: ( 'transformation' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2490:1: ( 'transformation' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2491:1: 'transformation'
            {
             before(grammarAccess.getJointAccess().getTransformationKeyword_17()); 
            match(input,31,FOLLOW_31_in_rule__Joint__Group__17__Impl5006); 
             after(grammarAccess.getJointAccess().getTransformationKeyword_17()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2504:1: rule__Joint__Group__18 : rule__Joint__Group__18__Impl rule__Joint__Group__19 ;
    public final void rule__Joint__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2508:1: ( rule__Joint__Group__18__Impl rule__Joint__Group__19 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2509:2: rule__Joint__Group__18__Impl rule__Joint__Group__19
            {
            pushFollow(FOLLOW_rule__Joint__Group__18__Impl_in_rule__Joint__Group__185037);
            rule__Joint__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Joint__Group__19_in_rule__Joint__Group__185040);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2516:1: rule__Joint__Group__18__Impl : ( ( rule__Joint__RelTransformation2Assignment_18 ) ) ;
    public final void rule__Joint__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2520:1: ( ( ( rule__Joint__RelTransformation2Assignment_18 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2521:1: ( ( rule__Joint__RelTransformation2Assignment_18 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2521:1: ( ( rule__Joint__RelTransformation2Assignment_18 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2522:1: ( rule__Joint__RelTransformation2Assignment_18 )
            {
             before(grammarAccess.getJointAccess().getRelTransformation2Assignment_18()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2523:1: ( rule__Joint__RelTransformation2Assignment_18 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2523:2: rule__Joint__RelTransformation2Assignment_18
            {
            pushFollow(FOLLOW_rule__Joint__RelTransformation2Assignment_18_in_rule__Joint__Group__18__Impl5067);
            rule__Joint__RelTransformation2Assignment_18();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getRelTransformation2Assignment_18()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2533:1: rule__Joint__Group__19 : rule__Joint__Group__19__Impl ;
    public final void rule__Joint__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2537:1: ( rule__Joint__Group__19__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2538:2: rule__Joint__Group__19__Impl
            {
            pushFollow(FOLLOW_rule__Joint__Group__19__Impl_in_rule__Joint__Group__195097);
            rule__Joint__Group__19__Impl();

            state._fsp--;


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2544:1: rule__Joint__Group__19__Impl : ( ')' ) ;
    public final void rule__Joint__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2548:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2549:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2549:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2550:1: ')'
            {
             before(grammarAccess.getJointAccess().getRightParenthesisKeyword_19()); 
            match(input,32,FOLLOW_32_in_rule__Joint__Group__19__Impl5125); 
             after(grammarAccess.getJointAccess().getRightParenthesisKeyword_19()); 

            }


            }

        }
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


    // $ANTLR start "rule__ColocationConstraint__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2603:1: rule__ColocationConstraint__Group__0 : rule__ColocationConstraint__Group__0__Impl rule__ColocationConstraint__Group__1 ;
    public final void rule__ColocationConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2607:1: ( rule__ColocationConstraint__Group__0__Impl rule__ColocationConstraint__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2608:2: rule__ColocationConstraint__Group__0__Impl rule__ColocationConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Group__0__Impl_in_rule__ColocationConstraint__Group__05196);
            rule__ColocationConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColocationConstraint__Group__1_in_rule__ColocationConstraint__Group__05199);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2615:1: rule__ColocationConstraint__Group__0__Impl : ( 'colocate' ) ;
    public final void rule__ColocationConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2619:1: ( ( 'colocate' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2620:1: ( 'colocate' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2620:1: ( 'colocate' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2621:1: 'colocate'
            {
             before(grammarAccess.getColocationConstraintAccess().getColocateKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__ColocationConstraint__Group__0__Impl5227); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2634:1: rule__ColocationConstraint__Group__1 : rule__ColocationConstraint__Group__1__Impl rule__ColocationConstraint__Group__2 ;
    public final void rule__ColocationConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2638:1: ( rule__ColocationConstraint__Group__1__Impl rule__ColocationConstraint__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2639:2: rule__ColocationConstraint__Group__1__Impl rule__ColocationConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Group__1__Impl_in_rule__ColocationConstraint__Group__15258);
            rule__ColocationConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColocationConstraint__Group__2_in_rule__ColocationConstraint__Group__15261);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2646:1: rule__ColocationConstraint__Group__1__Impl : ( ( rule__ColocationConstraint__Joint1Assignment_1 ) ) ;
    public final void rule__ColocationConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2650:1: ( ( ( rule__ColocationConstraint__Joint1Assignment_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2651:1: ( ( rule__ColocationConstraint__Joint1Assignment_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2651:1: ( ( rule__ColocationConstraint__Joint1Assignment_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2652:1: ( rule__ColocationConstraint__Joint1Assignment_1 )
            {
             before(grammarAccess.getColocationConstraintAccess().getJoint1Assignment_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2653:1: ( rule__ColocationConstraint__Joint1Assignment_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2653:2: rule__ColocationConstraint__Joint1Assignment_1
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Joint1Assignment_1_in_rule__ColocationConstraint__Group__1__Impl5288);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2663:1: rule__ColocationConstraint__Group__2 : rule__ColocationConstraint__Group__2__Impl rule__ColocationConstraint__Group__3 ;
    public final void rule__ColocationConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2667:1: ( rule__ColocationConstraint__Group__2__Impl rule__ColocationConstraint__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2668:2: rule__ColocationConstraint__Group__2__Impl rule__ColocationConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Group__2__Impl_in_rule__ColocationConstraint__Group__25318);
            rule__ColocationConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColocationConstraint__Group__3_in_rule__ColocationConstraint__Group__25321);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2675:1: rule__ColocationConstraint__Group__2__Impl : ( 'with' ) ;
    public final void rule__ColocationConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2679:1: ( ( 'with' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2680:1: ( 'with' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2680:1: ( 'with' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2681:1: 'with'
            {
             before(grammarAccess.getColocationConstraintAccess().getWithKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__ColocationConstraint__Group__2__Impl5349); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2694:1: rule__ColocationConstraint__Group__3 : rule__ColocationConstraint__Group__3__Impl ;
    public final void rule__ColocationConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2698:1: ( rule__ColocationConstraint__Group__3__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2699:2: rule__ColocationConstraint__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Group__3__Impl_in_rule__ColocationConstraint__Group__35380);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2705:1: rule__ColocationConstraint__Group__3__Impl : ( ( rule__ColocationConstraint__Joint2Assignment_3 ) ) ;
    public final void rule__ColocationConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2709:1: ( ( ( rule__ColocationConstraint__Joint2Assignment_3 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2710:1: ( ( rule__ColocationConstraint__Joint2Assignment_3 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2710:1: ( ( rule__ColocationConstraint__Joint2Assignment_3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2711:1: ( rule__ColocationConstraint__Joint2Assignment_3 )
            {
             before(grammarAccess.getColocationConstraintAccess().getJoint2Assignment_3()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2712:1: ( rule__ColocationConstraint__Joint2Assignment_3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2712:2: rule__ColocationConstraint__Joint2Assignment_3
            {
            pushFollow(FOLLOW_rule__ColocationConstraint__Joint2Assignment_3_in_rule__ColocationConstraint__Group__3__Impl5407);
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


    // $ANTLR start "rule__BaseVector3__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2730:1: rule__BaseVector3__Group__0 : rule__BaseVector3__Group__0__Impl rule__BaseVector3__Group__1 ;
    public final void rule__BaseVector3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2734:1: ( rule__BaseVector3__Group__0__Impl rule__BaseVector3__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2735:2: rule__BaseVector3__Group__0__Impl rule__BaseVector3__Group__1
            {
            pushFollow(FOLLOW_rule__BaseVector3__Group__0__Impl_in_rule__BaseVector3__Group__05445);
            rule__BaseVector3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseVector3__Group__1_in_rule__BaseVector3__Group__05448);
            rule__BaseVector3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__0"


    // $ANTLR start "rule__BaseVector3__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2742:1: rule__BaseVector3__Group__0__Impl : ( ( rule__BaseVector3__Group_0__0 )? ) ;
    public final void rule__BaseVector3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2746:1: ( ( ( rule__BaseVector3__Group_0__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2747:1: ( ( rule__BaseVector3__Group_0__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2747:1: ( ( rule__BaseVector3__Group_0__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2748:1: ( rule__BaseVector3__Group_0__0 )?
            {
             before(grammarAccess.getBaseVector3Access().getGroup_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2749:1: ( rule__BaseVector3__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2749:2: rule__BaseVector3__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BaseVector3__Group_0__0_in_rule__BaseVector3__Group__0__Impl5475);
                    rule__BaseVector3__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseVector3Access().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__0__Impl"


    // $ANTLR start "rule__BaseVector3__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2759:1: rule__BaseVector3__Group__1 : rule__BaseVector3__Group__1__Impl rule__BaseVector3__Group__2 ;
    public final void rule__BaseVector3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2763:1: ( rule__BaseVector3__Group__1__Impl rule__BaseVector3__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2764:2: rule__BaseVector3__Group__1__Impl rule__BaseVector3__Group__2
            {
            pushFollow(FOLLOW_rule__BaseVector3__Group__1__Impl_in_rule__BaseVector3__Group__15506);
            rule__BaseVector3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseVector3__Group__2_in_rule__BaseVector3__Group__15509);
            rule__BaseVector3__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__1"


    // $ANTLR start "rule__BaseVector3__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2771:1: rule__BaseVector3__Group__1__Impl : ( '(' ) ;
    public final void rule__BaseVector3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2775:1: ( ( '(' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2776:1: ( '(' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2776:1: ( '(' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2777:1: '('
            {
             before(grammarAccess.getBaseVector3Access().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__BaseVector3__Group__1__Impl5537); 
             after(grammarAccess.getBaseVector3Access().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__1__Impl"


    // $ANTLR start "rule__BaseVector3__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2790:1: rule__BaseVector3__Group__2 : rule__BaseVector3__Group__2__Impl rule__BaseVector3__Group__3 ;
    public final void rule__BaseVector3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2794:1: ( rule__BaseVector3__Group__2__Impl rule__BaseVector3__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2795:2: rule__BaseVector3__Group__2__Impl rule__BaseVector3__Group__3
            {
            pushFollow(FOLLOW_rule__BaseVector3__Group__2__Impl_in_rule__BaseVector3__Group__25568);
            rule__BaseVector3__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseVector3__Group__3_in_rule__BaseVector3__Group__25571);
            rule__BaseVector3__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__2"


    // $ANTLR start "rule__BaseVector3__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2802:1: rule__BaseVector3__Group__2__Impl : ( RULE_REAL ) ;
    public final void rule__BaseVector3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2806:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2807:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2807:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2808:1: RULE_REAL
            {
             before(grammarAccess.getBaseVector3Access().getREALTerminalRuleCall_2()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseVector3__Group__2__Impl5598); 
             after(grammarAccess.getBaseVector3Access().getREALTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__2__Impl"


    // $ANTLR start "rule__BaseVector3__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2819:1: rule__BaseVector3__Group__3 : rule__BaseVector3__Group__3__Impl rule__BaseVector3__Group__4 ;
    public final void rule__BaseVector3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2823:1: ( rule__BaseVector3__Group__3__Impl rule__BaseVector3__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2824:2: rule__BaseVector3__Group__3__Impl rule__BaseVector3__Group__4
            {
            pushFollow(FOLLOW_rule__BaseVector3__Group__3__Impl_in_rule__BaseVector3__Group__35627);
            rule__BaseVector3__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseVector3__Group__4_in_rule__BaseVector3__Group__35630);
            rule__BaseVector3__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__3"


    // $ANTLR start "rule__BaseVector3__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2831:1: rule__BaseVector3__Group__3__Impl : ( ',' ) ;
    public final void rule__BaseVector3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2835:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2836:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2836:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2837:1: ','
            {
             before(grammarAccess.getBaseVector3Access().getCommaKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__BaseVector3__Group__3__Impl5658); 
             after(grammarAccess.getBaseVector3Access().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__3__Impl"


    // $ANTLR start "rule__BaseVector3__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2850:1: rule__BaseVector3__Group__4 : rule__BaseVector3__Group__4__Impl rule__BaseVector3__Group__5 ;
    public final void rule__BaseVector3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2854:1: ( rule__BaseVector3__Group__4__Impl rule__BaseVector3__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2855:2: rule__BaseVector3__Group__4__Impl rule__BaseVector3__Group__5
            {
            pushFollow(FOLLOW_rule__BaseVector3__Group__4__Impl_in_rule__BaseVector3__Group__45689);
            rule__BaseVector3__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseVector3__Group__5_in_rule__BaseVector3__Group__45692);
            rule__BaseVector3__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__4"


    // $ANTLR start "rule__BaseVector3__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2862:1: rule__BaseVector3__Group__4__Impl : ( RULE_REAL ) ;
    public final void rule__BaseVector3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2866:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2867:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2867:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2868:1: RULE_REAL
            {
             before(grammarAccess.getBaseVector3Access().getREALTerminalRuleCall_4()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseVector3__Group__4__Impl5719); 
             after(grammarAccess.getBaseVector3Access().getREALTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__4__Impl"


    // $ANTLR start "rule__BaseVector3__Group__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2879:1: rule__BaseVector3__Group__5 : rule__BaseVector3__Group__5__Impl rule__BaseVector3__Group__6 ;
    public final void rule__BaseVector3__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2883:1: ( rule__BaseVector3__Group__5__Impl rule__BaseVector3__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2884:2: rule__BaseVector3__Group__5__Impl rule__BaseVector3__Group__6
            {
            pushFollow(FOLLOW_rule__BaseVector3__Group__5__Impl_in_rule__BaseVector3__Group__55748);
            rule__BaseVector3__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseVector3__Group__6_in_rule__BaseVector3__Group__55751);
            rule__BaseVector3__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__5"


    // $ANTLR start "rule__BaseVector3__Group__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2891:1: rule__BaseVector3__Group__5__Impl : ( ',' ) ;
    public final void rule__BaseVector3__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2895:1: ( ( ',' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2896:1: ( ',' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2896:1: ( ',' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2897:1: ','
            {
             before(grammarAccess.getBaseVector3Access().getCommaKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__BaseVector3__Group__5__Impl5779); 
             after(grammarAccess.getBaseVector3Access().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__5__Impl"


    // $ANTLR start "rule__BaseVector3__Group__6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2910:1: rule__BaseVector3__Group__6 : rule__BaseVector3__Group__6__Impl rule__BaseVector3__Group__7 ;
    public final void rule__BaseVector3__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2914:1: ( rule__BaseVector3__Group__6__Impl rule__BaseVector3__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2915:2: rule__BaseVector3__Group__6__Impl rule__BaseVector3__Group__7
            {
            pushFollow(FOLLOW_rule__BaseVector3__Group__6__Impl_in_rule__BaseVector3__Group__65810);
            rule__BaseVector3__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseVector3__Group__7_in_rule__BaseVector3__Group__65813);
            rule__BaseVector3__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__6"


    // $ANTLR start "rule__BaseVector3__Group__6__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2922:1: rule__BaseVector3__Group__6__Impl : ( RULE_REAL ) ;
    public final void rule__BaseVector3__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2926:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2927:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2927:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2928:1: RULE_REAL
            {
             before(grammarAccess.getBaseVector3Access().getREALTerminalRuleCall_6()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseVector3__Group__6__Impl5840); 
             after(grammarAccess.getBaseVector3Access().getREALTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__6__Impl"


    // $ANTLR start "rule__BaseVector3__Group__7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2939:1: rule__BaseVector3__Group__7 : rule__BaseVector3__Group__7__Impl rule__BaseVector3__Group__8 ;
    public final void rule__BaseVector3__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2943:1: ( rule__BaseVector3__Group__7__Impl rule__BaseVector3__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2944:2: rule__BaseVector3__Group__7__Impl rule__BaseVector3__Group__8
            {
            pushFollow(FOLLOW_rule__BaseVector3__Group__7__Impl_in_rule__BaseVector3__Group__75869);
            rule__BaseVector3__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseVector3__Group__8_in_rule__BaseVector3__Group__75872);
            rule__BaseVector3__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__7"


    // $ANTLR start "rule__BaseVector3__Group__7__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2951:1: rule__BaseVector3__Group__7__Impl : ( ')' ) ;
    public final void rule__BaseVector3__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2955:1: ( ( ')' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2956:1: ( ')' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2956:1: ( ')' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2957:1: ')'
            {
             before(grammarAccess.getBaseVector3Access().getRightParenthesisKeyword_7()); 
            match(input,32,FOLLOW_32_in_rule__BaseVector3__Group__7__Impl5900); 
             after(grammarAccess.getBaseVector3Access().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__7__Impl"


    // $ANTLR start "rule__BaseVector3__Group__8"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2970:1: rule__BaseVector3__Group__8 : rule__BaseVector3__Group__8__Impl ;
    public final void rule__BaseVector3__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2974:1: ( rule__BaseVector3__Group__8__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2975:2: rule__BaseVector3__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__BaseVector3__Group__8__Impl_in_rule__BaseVector3__Group__85931);
            rule__BaseVector3__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__8"


    // $ANTLR start "rule__BaseVector3__Group__8__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2981:1: rule__BaseVector3__Group__8__Impl : ( () ) ;
    public final void rule__BaseVector3__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2985:1: ( ( () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2986:1: ( () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2986:1: ( () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2987:1: ()
            {
             before(grammarAccess.getBaseVector3Access().getBaseVector3Action_8()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2988:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:2990:1: 
            {
            }

             after(grammarAccess.getBaseVector3Access().getBaseVector3Action_8()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group__8__Impl"


    // $ANTLR start "rule__BaseVector3__Group_0__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3018:1: rule__BaseVector3__Group_0__0 : rule__BaseVector3__Group_0__0__Impl rule__BaseVector3__Group_0__1 ;
    public final void rule__BaseVector3__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3022:1: ( rule__BaseVector3__Group_0__0__Impl rule__BaseVector3__Group_0__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3023:2: rule__BaseVector3__Group_0__0__Impl rule__BaseVector3__Group_0__1
            {
            pushFollow(FOLLOW_rule__BaseVector3__Group_0__0__Impl_in_rule__BaseVector3__Group_0__06007);
            rule__BaseVector3__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseVector3__Group_0__1_in_rule__BaseVector3__Group_0__06010);
            rule__BaseVector3__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group_0__0"


    // $ANTLR start "rule__BaseVector3__Group_0__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3030:1: rule__BaseVector3__Group_0__0__Impl : ( 'vector' ) ;
    public final void rule__BaseVector3__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3034:1: ( ( 'vector' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3035:1: ( 'vector' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3035:1: ( 'vector' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3036:1: 'vector'
            {
             before(grammarAccess.getBaseVector3Access().getVectorKeyword_0_0()); 
            match(input,36,FOLLOW_36_in_rule__BaseVector3__Group_0__0__Impl6038); 
             after(grammarAccess.getBaseVector3Access().getVectorKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group_0__0__Impl"


    // $ANTLR start "rule__BaseVector3__Group_0__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3049:1: rule__BaseVector3__Group_0__1 : rule__BaseVector3__Group_0__1__Impl ;
    public final void rule__BaseVector3__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3053:1: ( rule__BaseVector3__Group_0__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3054:2: rule__BaseVector3__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseVector3__Group_0__1__Impl_in_rule__BaseVector3__Group_0__16069);
            rule__BaseVector3__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group_0__1"


    // $ANTLR start "rule__BaseVector3__Group_0__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3060:1: rule__BaseVector3__Group_0__1__Impl : ( ( rule__BaseVector3__NameAssignment_0_1 ) ) ;
    public final void rule__BaseVector3__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3064:1: ( ( ( rule__BaseVector3__NameAssignment_0_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3065:1: ( ( rule__BaseVector3__NameAssignment_0_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3065:1: ( ( rule__BaseVector3__NameAssignment_0_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3066:1: ( rule__BaseVector3__NameAssignment_0_1 )
            {
             before(grammarAccess.getBaseVector3Access().getNameAssignment_0_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3067:1: ( rule__BaseVector3__NameAssignment_0_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3067:2: rule__BaseVector3__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BaseVector3__NameAssignment_0_1_in_rule__BaseVector3__Group_0__1__Impl6096);
            rule__BaseVector3__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseVector3Access().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__Group_0__1__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3081:1: rule__BaseMatrix3X3__Group__0 : rule__BaseMatrix3X3__Group__0__Impl rule__BaseMatrix3X3__Group__1 ;
    public final void rule__BaseMatrix3X3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3085:1: ( rule__BaseMatrix3X3__Group__0__Impl rule__BaseMatrix3X3__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3086:2: rule__BaseMatrix3X3__Group__0__Impl rule__BaseMatrix3X3__Group__1
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__0__Impl_in_rule__BaseMatrix3X3__Group__06130);
            rule__BaseMatrix3X3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__1_in_rule__BaseMatrix3X3__Group__06133);
            rule__BaseMatrix3X3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__0"


    // $ANTLR start "rule__BaseMatrix3X3__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3093:1: rule__BaseMatrix3X3__Group__0__Impl : ( ( rule__BaseMatrix3X3__Group_0__0 )? ) ;
    public final void rule__BaseMatrix3X3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3097:1: ( ( ( rule__BaseMatrix3X3__Group_0__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3098:1: ( ( rule__BaseMatrix3X3__Group_0__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3098:1: ( ( rule__BaseMatrix3X3__Group_0__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3099:1: ( rule__BaseMatrix3X3__Group_0__0 )?
            {
             before(grammarAccess.getBaseMatrix3X3Access().getGroup_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3100:1: ( rule__BaseMatrix3X3__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3100:2: rule__BaseMatrix3X3__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BaseMatrix3X3__Group_0__0_in_rule__BaseMatrix3X3__Group__0__Impl6160);
                    rule__BaseMatrix3X3__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseMatrix3X3Access().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__0__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3110:1: rule__BaseMatrix3X3__Group__1 : rule__BaseMatrix3X3__Group__1__Impl rule__BaseMatrix3X3__Group__2 ;
    public final void rule__BaseMatrix3X3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3114:1: ( rule__BaseMatrix3X3__Group__1__Impl rule__BaseMatrix3X3__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3115:2: rule__BaseMatrix3X3__Group__1__Impl rule__BaseMatrix3X3__Group__2
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__1__Impl_in_rule__BaseMatrix3X3__Group__16191);
            rule__BaseMatrix3X3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__2_in_rule__BaseMatrix3X3__Group__16194);
            rule__BaseMatrix3X3__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__1"


    // $ANTLR start "rule__BaseMatrix3X3__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3122:1: rule__BaseMatrix3X3__Group__1__Impl : ( '[' ) ;
    public final void rule__BaseMatrix3X3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3126:1: ( ( '[' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3127:1: ( '[' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3127:1: ( '[' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3128:1: '['
            {
             before(grammarAccess.getBaseMatrix3X3Access().getLeftSquareBracketKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__BaseMatrix3X3__Group__1__Impl6222); 
             after(grammarAccess.getBaseMatrix3X3Access().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__1__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3141:1: rule__BaseMatrix3X3__Group__2 : rule__BaseMatrix3X3__Group__2__Impl rule__BaseMatrix3X3__Group__3 ;
    public final void rule__BaseMatrix3X3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3145:1: ( rule__BaseMatrix3X3__Group__2__Impl rule__BaseMatrix3X3__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3146:2: rule__BaseMatrix3X3__Group__2__Impl rule__BaseMatrix3X3__Group__3
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__2__Impl_in_rule__BaseMatrix3X3__Group__26253);
            rule__BaseMatrix3X3__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__3_in_rule__BaseMatrix3X3__Group__26256);
            rule__BaseMatrix3X3__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__2"


    // $ANTLR start "rule__BaseMatrix3X3__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3153:1: rule__BaseMatrix3X3__Group__2__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix3X3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3157:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3158:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3158:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3159:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_2()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__2__Impl6283); 
             after(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__2__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3170:1: rule__BaseMatrix3X3__Group__3 : rule__BaseMatrix3X3__Group__3__Impl rule__BaseMatrix3X3__Group__4 ;
    public final void rule__BaseMatrix3X3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3174:1: ( rule__BaseMatrix3X3__Group__3__Impl rule__BaseMatrix3X3__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3175:2: rule__BaseMatrix3X3__Group__3__Impl rule__BaseMatrix3X3__Group__4
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__3__Impl_in_rule__BaseMatrix3X3__Group__36312);
            rule__BaseMatrix3X3__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__4_in_rule__BaseMatrix3X3__Group__36315);
            rule__BaseMatrix3X3__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__3"


    // $ANTLR start "rule__BaseMatrix3X3__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3182:1: rule__BaseMatrix3X3__Group__3__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix3X3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3186:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3187:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3187:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3188:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_3()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__3__Impl6342); 
             after(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__3__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3199:1: rule__BaseMatrix3X3__Group__4 : rule__BaseMatrix3X3__Group__4__Impl rule__BaseMatrix3X3__Group__5 ;
    public final void rule__BaseMatrix3X3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3203:1: ( rule__BaseMatrix3X3__Group__4__Impl rule__BaseMatrix3X3__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3204:2: rule__BaseMatrix3X3__Group__4__Impl rule__BaseMatrix3X3__Group__5
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__4__Impl_in_rule__BaseMatrix3X3__Group__46371);
            rule__BaseMatrix3X3__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__5_in_rule__BaseMatrix3X3__Group__46374);
            rule__BaseMatrix3X3__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__4"


    // $ANTLR start "rule__BaseMatrix3X3__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3211:1: rule__BaseMatrix3X3__Group__4__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix3X3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3215:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3216:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3216:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3217:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_4()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__4__Impl6401); 
             after(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__4__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3228:1: rule__BaseMatrix3X3__Group__5 : rule__BaseMatrix3X3__Group__5__Impl rule__BaseMatrix3X3__Group__6 ;
    public final void rule__BaseMatrix3X3__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3232:1: ( rule__BaseMatrix3X3__Group__5__Impl rule__BaseMatrix3X3__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3233:2: rule__BaseMatrix3X3__Group__5__Impl rule__BaseMatrix3X3__Group__6
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__5__Impl_in_rule__BaseMatrix3X3__Group__56430);
            rule__BaseMatrix3X3__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__6_in_rule__BaseMatrix3X3__Group__56433);
            rule__BaseMatrix3X3__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__5"


    // $ANTLR start "rule__BaseMatrix3X3__Group__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3240:1: rule__BaseMatrix3X3__Group__5__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix3X3__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3244:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3245:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3245:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3246:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_5()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__5__Impl6460); 
             after(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__5__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group__6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3257:1: rule__BaseMatrix3X3__Group__6 : rule__BaseMatrix3X3__Group__6__Impl rule__BaseMatrix3X3__Group__7 ;
    public final void rule__BaseMatrix3X3__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3261:1: ( rule__BaseMatrix3X3__Group__6__Impl rule__BaseMatrix3X3__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3262:2: rule__BaseMatrix3X3__Group__6__Impl rule__BaseMatrix3X3__Group__7
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__6__Impl_in_rule__BaseMatrix3X3__Group__66489);
            rule__BaseMatrix3X3__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__7_in_rule__BaseMatrix3X3__Group__66492);
            rule__BaseMatrix3X3__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__6"


    // $ANTLR start "rule__BaseMatrix3X3__Group__6__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3269:1: rule__BaseMatrix3X3__Group__6__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix3X3__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3273:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3274:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3274:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3275:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_6()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__6__Impl6519); 
             after(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__6__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group__7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3286:1: rule__BaseMatrix3X3__Group__7 : rule__BaseMatrix3X3__Group__7__Impl rule__BaseMatrix3X3__Group__8 ;
    public final void rule__BaseMatrix3X3__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3290:1: ( rule__BaseMatrix3X3__Group__7__Impl rule__BaseMatrix3X3__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3291:2: rule__BaseMatrix3X3__Group__7__Impl rule__BaseMatrix3X3__Group__8
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__7__Impl_in_rule__BaseMatrix3X3__Group__76548);
            rule__BaseMatrix3X3__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__8_in_rule__BaseMatrix3X3__Group__76551);
            rule__BaseMatrix3X3__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__7"


    // $ANTLR start "rule__BaseMatrix3X3__Group__7__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3298:1: rule__BaseMatrix3X3__Group__7__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix3X3__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3302:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3303:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3303:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3304:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_7()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__7__Impl6578); 
             after(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__7__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group__8"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3315:1: rule__BaseMatrix3X3__Group__8 : rule__BaseMatrix3X3__Group__8__Impl rule__BaseMatrix3X3__Group__9 ;
    public final void rule__BaseMatrix3X3__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3319:1: ( rule__BaseMatrix3X3__Group__8__Impl rule__BaseMatrix3X3__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3320:2: rule__BaseMatrix3X3__Group__8__Impl rule__BaseMatrix3X3__Group__9
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__8__Impl_in_rule__BaseMatrix3X3__Group__86607);
            rule__BaseMatrix3X3__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__9_in_rule__BaseMatrix3X3__Group__86610);
            rule__BaseMatrix3X3__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__8"


    // $ANTLR start "rule__BaseMatrix3X3__Group__8__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3327:1: rule__BaseMatrix3X3__Group__8__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix3X3__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3331:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3332:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3332:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3333:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_8()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__8__Impl6637); 
             after(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__8__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group__9"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3344:1: rule__BaseMatrix3X3__Group__9 : rule__BaseMatrix3X3__Group__9__Impl rule__BaseMatrix3X3__Group__10 ;
    public final void rule__BaseMatrix3X3__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3348:1: ( rule__BaseMatrix3X3__Group__9__Impl rule__BaseMatrix3X3__Group__10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3349:2: rule__BaseMatrix3X3__Group__9__Impl rule__BaseMatrix3X3__Group__10
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__9__Impl_in_rule__BaseMatrix3X3__Group__96666);
            rule__BaseMatrix3X3__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__10_in_rule__BaseMatrix3X3__Group__96669);
            rule__BaseMatrix3X3__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__9"


    // $ANTLR start "rule__BaseMatrix3X3__Group__9__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3356:1: rule__BaseMatrix3X3__Group__9__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix3X3__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3360:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3361:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3361:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3362:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_9()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__9__Impl6696); 
             after(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__9__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group__10"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3373:1: rule__BaseMatrix3X3__Group__10 : rule__BaseMatrix3X3__Group__10__Impl rule__BaseMatrix3X3__Group__11 ;
    public final void rule__BaseMatrix3X3__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3377:1: ( rule__BaseMatrix3X3__Group__10__Impl rule__BaseMatrix3X3__Group__11 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3378:2: rule__BaseMatrix3X3__Group__10__Impl rule__BaseMatrix3X3__Group__11
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__10__Impl_in_rule__BaseMatrix3X3__Group__106725);
            rule__BaseMatrix3X3__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__11_in_rule__BaseMatrix3X3__Group__106728);
            rule__BaseMatrix3X3__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__10"


    // $ANTLR start "rule__BaseMatrix3X3__Group__10__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3385:1: rule__BaseMatrix3X3__Group__10__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix3X3__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3389:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3390:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3390:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3391:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_10()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__10__Impl6755); 
             after(grammarAccess.getBaseMatrix3X3Access().getREALTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__10__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group__11"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3402:1: rule__BaseMatrix3X3__Group__11 : rule__BaseMatrix3X3__Group__11__Impl rule__BaseMatrix3X3__Group__12 ;
    public final void rule__BaseMatrix3X3__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3406:1: ( rule__BaseMatrix3X3__Group__11__Impl rule__BaseMatrix3X3__Group__12 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3407:2: rule__BaseMatrix3X3__Group__11__Impl rule__BaseMatrix3X3__Group__12
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__11__Impl_in_rule__BaseMatrix3X3__Group__116784);
            rule__BaseMatrix3X3__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__12_in_rule__BaseMatrix3X3__Group__116787);
            rule__BaseMatrix3X3__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__11"


    // $ANTLR start "rule__BaseMatrix3X3__Group__11__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3414:1: rule__BaseMatrix3X3__Group__11__Impl : ( ']' ) ;
    public final void rule__BaseMatrix3X3__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3418:1: ( ( ']' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3419:1: ( ']' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3419:1: ( ']' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3420:1: ']'
            {
             before(grammarAccess.getBaseMatrix3X3Access().getRightSquareBracketKeyword_11()); 
            match(input,38,FOLLOW_38_in_rule__BaseMatrix3X3__Group__11__Impl6815); 
             after(grammarAccess.getBaseMatrix3X3Access().getRightSquareBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__11__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group__12"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3433:1: rule__BaseMatrix3X3__Group__12 : rule__BaseMatrix3X3__Group__12__Impl ;
    public final void rule__BaseMatrix3X3__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3437:1: ( rule__BaseMatrix3X3__Group__12__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3438:2: rule__BaseMatrix3X3__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group__12__Impl_in_rule__BaseMatrix3X3__Group__126846);
            rule__BaseMatrix3X3__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__12"


    // $ANTLR start "rule__BaseMatrix3X3__Group__12__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3444:1: rule__BaseMatrix3X3__Group__12__Impl : ( () ) ;
    public final void rule__BaseMatrix3X3__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3448:1: ( ( () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3449:1: ( () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3449:1: ( () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3450:1: ()
            {
             before(grammarAccess.getBaseMatrix3X3Access().getBaseMatrix3X3Action_12()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3451:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3453:1: 
            {
            }

             after(grammarAccess.getBaseMatrix3X3Access().getBaseMatrix3X3Action_12()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group__12__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group_0__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3489:1: rule__BaseMatrix3X3__Group_0__0 : rule__BaseMatrix3X3__Group_0__0__Impl rule__BaseMatrix3X3__Group_0__1 ;
    public final void rule__BaseMatrix3X3__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3493:1: ( rule__BaseMatrix3X3__Group_0__0__Impl rule__BaseMatrix3X3__Group_0__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3494:2: rule__BaseMatrix3X3__Group_0__0__Impl rule__BaseMatrix3X3__Group_0__1
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group_0__0__Impl_in_rule__BaseMatrix3X3__Group_0__06930);
            rule__BaseMatrix3X3__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group_0__1_in_rule__BaseMatrix3X3__Group_0__06933);
            rule__BaseMatrix3X3__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group_0__0"


    // $ANTLR start "rule__BaseMatrix3X3__Group_0__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3501:1: rule__BaseMatrix3X3__Group_0__0__Impl : ( 'm3' ) ;
    public final void rule__BaseMatrix3X3__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3505:1: ( ( 'm3' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3506:1: ( 'm3' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3506:1: ( 'm3' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3507:1: 'm3'
            {
             before(grammarAccess.getBaseMatrix3X3Access().getM3Keyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__BaseMatrix3X3__Group_0__0__Impl6961); 
             after(grammarAccess.getBaseMatrix3X3Access().getM3Keyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group_0__0__Impl"


    // $ANTLR start "rule__BaseMatrix3X3__Group_0__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3520:1: rule__BaseMatrix3X3__Group_0__1 : rule__BaseMatrix3X3__Group_0__1__Impl ;
    public final void rule__BaseMatrix3X3__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3524:1: ( rule__BaseMatrix3X3__Group_0__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3525:2: rule__BaseMatrix3X3__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__Group_0__1__Impl_in_rule__BaseMatrix3X3__Group_0__16992);
            rule__BaseMatrix3X3__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group_0__1"


    // $ANTLR start "rule__BaseMatrix3X3__Group_0__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3531:1: rule__BaseMatrix3X3__Group_0__1__Impl : ( ( rule__BaseMatrix3X3__NameAssignment_0_1 ) ) ;
    public final void rule__BaseMatrix3X3__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3535:1: ( ( ( rule__BaseMatrix3X3__NameAssignment_0_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3536:1: ( ( rule__BaseMatrix3X3__NameAssignment_0_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3536:1: ( ( rule__BaseMatrix3X3__NameAssignment_0_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3537:1: ( rule__BaseMatrix3X3__NameAssignment_0_1 )
            {
             before(grammarAccess.getBaseMatrix3X3Access().getNameAssignment_0_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3538:1: ( rule__BaseMatrix3X3__NameAssignment_0_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3538:2: rule__BaseMatrix3X3__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BaseMatrix3X3__NameAssignment_0_1_in_rule__BaseMatrix3X3__Group_0__1__Impl7019);
            rule__BaseMatrix3X3__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseMatrix3X3Access().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__Group_0__1__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3552:1: rule__BaseMatrix4X4__Group__0 : rule__BaseMatrix4X4__Group__0__Impl rule__BaseMatrix4X4__Group__1 ;
    public final void rule__BaseMatrix4X4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3556:1: ( rule__BaseMatrix4X4__Group__0__Impl rule__BaseMatrix4X4__Group__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3557:2: rule__BaseMatrix4X4__Group__0__Impl rule__BaseMatrix4X4__Group__1
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__0__Impl_in_rule__BaseMatrix4X4__Group__07053);
            rule__BaseMatrix4X4__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__1_in_rule__BaseMatrix4X4__Group__07056);
            rule__BaseMatrix4X4__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__0"


    // $ANTLR start "rule__BaseMatrix4X4__Group__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3564:1: rule__BaseMatrix4X4__Group__0__Impl : ( ( rule__BaseMatrix4X4__Group_0__0 )? ) ;
    public final void rule__BaseMatrix4X4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3568:1: ( ( ( rule__BaseMatrix4X4__Group_0__0 )? ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3569:1: ( ( rule__BaseMatrix4X4__Group_0__0 )? )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3569:1: ( ( rule__BaseMatrix4X4__Group_0__0 )? )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3570:1: ( rule__BaseMatrix4X4__Group_0__0 )?
            {
             before(grammarAccess.getBaseMatrix4X4Access().getGroup_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3571:1: ( rule__BaseMatrix4X4__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3571:2: rule__BaseMatrix4X4__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BaseMatrix4X4__Group_0__0_in_rule__BaseMatrix4X4__Group__0__Impl7083);
                    rule__BaseMatrix4X4__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseMatrix4X4Access().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__0__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3581:1: rule__BaseMatrix4X4__Group__1 : rule__BaseMatrix4X4__Group__1__Impl rule__BaseMatrix4X4__Group__2 ;
    public final void rule__BaseMatrix4X4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3585:1: ( rule__BaseMatrix4X4__Group__1__Impl rule__BaseMatrix4X4__Group__2 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3586:2: rule__BaseMatrix4X4__Group__1__Impl rule__BaseMatrix4X4__Group__2
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__1__Impl_in_rule__BaseMatrix4X4__Group__17114);
            rule__BaseMatrix4X4__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__2_in_rule__BaseMatrix4X4__Group__17117);
            rule__BaseMatrix4X4__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__1"


    // $ANTLR start "rule__BaseMatrix4X4__Group__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3593:1: rule__BaseMatrix4X4__Group__1__Impl : ( '[' ) ;
    public final void rule__BaseMatrix4X4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3597:1: ( ( '[' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3598:1: ( '[' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3598:1: ( '[' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3599:1: '['
            {
             before(grammarAccess.getBaseMatrix4X4Access().getLeftSquareBracketKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__BaseMatrix4X4__Group__1__Impl7145); 
             after(grammarAccess.getBaseMatrix4X4Access().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__1__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__2"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3612:1: rule__BaseMatrix4X4__Group__2 : rule__BaseMatrix4X4__Group__2__Impl rule__BaseMatrix4X4__Group__3 ;
    public final void rule__BaseMatrix4X4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3616:1: ( rule__BaseMatrix4X4__Group__2__Impl rule__BaseMatrix4X4__Group__3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3617:2: rule__BaseMatrix4X4__Group__2__Impl rule__BaseMatrix4X4__Group__3
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__2__Impl_in_rule__BaseMatrix4X4__Group__27176);
            rule__BaseMatrix4X4__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__3_in_rule__BaseMatrix4X4__Group__27179);
            rule__BaseMatrix4X4__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__2"


    // $ANTLR start "rule__BaseMatrix4X4__Group__2__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3624:1: rule__BaseMatrix4X4__Group__2__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3628:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3629:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3629:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3630:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_2()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__2__Impl7206); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__2__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3641:1: rule__BaseMatrix4X4__Group__3 : rule__BaseMatrix4X4__Group__3__Impl rule__BaseMatrix4X4__Group__4 ;
    public final void rule__BaseMatrix4X4__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3645:1: ( rule__BaseMatrix4X4__Group__3__Impl rule__BaseMatrix4X4__Group__4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3646:2: rule__BaseMatrix4X4__Group__3__Impl rule__BaseMatrix4X4__Group__4
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__3__Impl_in_rule__BaseMatrix4X4__Group__37235);
            rule__BaseMatrix4X4__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__4_in_rule__BaseMatrix4X4__Group__37238);
            rule__BaseMatrix4X4__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__3"


    // $ANTLR start "rule__BaseMatrix4X4__Group__3__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3653:1: rule__BaseMatrix4X4__Group__3__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3657:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3658:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3658:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3659:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_3()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__3__Impl7265); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__3__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3670:1: rule__BaseMatrix4X4__Group__4 : rule__BaseMatrix4X4__Group__4__Impl rule__BaseMatrix4X4__Group__5 ;
    public final void rule__BaseMatrix4X4__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3674:1: ( rule__BaseMatrix4X4__Group__4__Impl rule__BaseMatrix4X4__Group__5 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3675:2: rule__BaseMatrix4X4__Group__4__Impl rule__BaseMatrix4X4__Group__5
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__4__Impl_in_rule__BaseMatrix4X4__Group__47294);
            rule__BaseMatrix4X4__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__5_in_rule__BaseMatrix4X4__Group__47297);
            rule__BaseMatrix4X4__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__4"


    // $ANTLR start "rule__BaseMatrix4X4__Group__4__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3682:1: rule__BaseMatrix4X4__Group__4__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3686:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3687:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3687:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3688:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_4()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__4__Impl7324); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__4__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__5"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3699:1: rule__BaseMatrix4X4__Group__5 : rule__BaseMatrix4X4__Group__5__Impl rule__BaseMatrix4X4__Group__6 ;
    public final void rule__BaseMatrix4X4__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3703:1: ( rule__BaseMatrix4X4__Group__5__Impl rule__BaseMatrix4X4__Group__6 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3704:2: rule__BaseMatrix4X4__Group__5__Impl rule__BaseMatrix4X4__Group__6
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__5__Impl_in_rule__BaseMatrix4X4__Group__57353);
            rule__BaseMatrix4X4__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__6_in_rule__BaseMatrix4X4__Group__57356);
            rule__BaseMatrix4X4__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__5"


    // $ANTLR start "rule__BaseMatrix4X4__Group__5__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3711:1: rule__BaseMatrix4X4__Group__5__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3715:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3716:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3716:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3717:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_5()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__5__Impl7383); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__5__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3728:1: rule__BaseMatrix4X4__Group__6 : rule__BaseMatrix4X4__Group__6__Impl rule__BaseMatrix4X4__Group__7 ;
    public final void rule__BaseMatrix4X4__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3732:1: ( rule__BaseMatrix4X4__Group__6__Impl rule__BaseMatrix4X4__Group__7 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3733:2: rule__BaseMatrix4X4__Group__6__Impl rule__BaseMatrix4X4__Group__7
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__6__Impl_in_rule__BaseMatrix4X4__Group__67412);
            rule__BaseMatrix4X4__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__7_in_rule__BaseMatrix4X4__Group__67415);
            rule__BaseMatrix4X4__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__6"


    // $ANTLR start "rule__BaseMatrix4X4__Group__6__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3740:1: rule__BaseMatrix4X4__Group__6__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3744:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3745:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3745:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3746:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_6()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__6__Impl7442); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__6__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__7"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3757:1: rule__BaseMatrix4X4__Group__7 : rule__BaseMatrix4X4__Group__7__Impl rule__BaseMatrix4X4__Group__8 ;
    public final void rule__BaseMatrix4X4__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3761:1: ( rule__BaseMatrix4X4__Group__7__Impl rule__BaseMatrix4X4__Group__8 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3762:2: rule__BaseMatrix4X4__Group__7__Impl rule__BaseMatrix4X4__Group__8
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__7__Impl_in_rule__BaseMatrix4X4__Group__77471);
            rule__BaseMatrix4X4__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__8_in_rule__BaseMatrix4X4__Group__77474);
            rule__BaseMatrix4X4__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__7"


    // $ANTLR start "rule__BaseMatrix4X4__Group__7__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3769:1: rule__BaseMatrix4X4__Group__7__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3773:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3774:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3774:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3775:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_7()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__7__Impl7501); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__7__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__8"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3786:1: rule__BaseMatrix4X4__Group__8 : rule__BaseMatrix4X4__Group__8__Impl rule__BaseMatrix4X4__Group__9 ;
    public final void rule__BaseMatrix4X4__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3790:1: ( rule__BaseMatrix4X4__Group__8__Impl rule__BaseMatrix4X4__Group__9 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3791:2: rule__BaseMatrix4X4__Group__8__Impl rule__BaseMatrix4X4__Group__9
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__8__Impl_in_rule__BaseMatrix4X4__Group__87530);
            rule__BaseMatrix4X4__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__9_in_rule__BaseMatrix4X4__Group__87533);
            rule__BaseMatrix4X4__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__8"


    // $ANTLR start "rule__BaseMatrix4X4__Group__8__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3798:1: rule__BaseMatrix4X4__Group__8__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3802:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3803:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3803:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3804:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_8()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__8__Impl7560); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__8__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__9"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3815:1: rule__BaseMatrix4X4__Group__9 : rule__BaseMatrix4X4__Group__9__Impl rule__BaseMatrix4X4__Group__10 ;
    public final void rule__BaseMatrix4X4__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3819:1: ( rule__BaseMatrix4X4__Group__9__Impl rule__BaseMatrix4X4__Group__10 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3820:2: rule__BaseMatrix4X4__Group__9__Impl rule__BaseMatrix4X4__Group__10
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__9__Impl_in_rule__BaseMatrix4X4__Group__97589);
            rule__BaseMatrix4X4__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__10_in_rule__BaseMatrix4X4__Group__97592);
            rule__BaseMatrix4X4__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__9"


    // $ANTLR start "rule__BaseMatrix4X4__Group__9__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3827:1: rule__BaseMatrix4X4__Group__9__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3831:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3832:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3832:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3833:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_9()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__9__Impl7619); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__9__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__10"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3844:1: rule__BaseMatrix4X4__Group__10 : rule__BaseMatrix4X4__Group__10__Impl rule__BaseMatrix4X4__Group__11 ;
    public final void rule__BaseMatrix4X4__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3848:1: ( rule__BaseMatrix4X4__Group__10__Impl rule__BaseMatrix4X4__Group__11 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3849:2: rule__BaseMatrix4X4__Group__10__Impl rule__BaseMatrix4X4__Group__11
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__10__Impl_in_rule__BaseMatrix4X4__Group__107648);
            rule__BaseMatrix4X4__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__11_in_rule__BaseMatrix4X4__Group__107651);
            rule__BaseMatrix4X4__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__10"


    // $ANTLR start "rule__BaseMatrix4X4__Group__10__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3856:1: rule__BaseMatrix4X4__Group__10__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3860:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3861:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3861:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3862:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_10()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__10__Impl7678); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__10__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__11"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3873:1: rule__BaseMatrix4X4__Group__11 : rule__BaseMatrix4X4__Group__11__Impl rule__BaseMatrix4X4__Group__12 ;
    public final void rule__BaseMatrix4X4__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3877:1: ( rule__BaseMatrix4X4__Group__11__Impl rule__BaseMatrix4X4__Group__12 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3878:2: rule__BaseMatrix4X4__Group__11__Impl rule__BaseMatrix4X4__Group__12
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__11__Impl_in_rule__BaseMatrix4X4__Group__117707);
            rule__BaseMatrix4X4__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__12_in_rule__BaseMatrix4X4__Group__117710);
            rule__BaseMatrix4X4__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__11"


    // $ANTLR start "rule__BaseMatrix4X4__Group__11__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3885:1: rule__BaseMatrix4X4__Group__11__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3889:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3890:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3890:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3891:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_11()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__11__Impl7737); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__11__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__12"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3902:1: rule__BaseMatrix4X4__Group__12 : rule__BaseMatrix4X4__Group__12__Impl rule__BaseMatrix4X4__Group__13 ;
    public final void rule__BaseMatrix4X4__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3906:1: ( rule__BaseMatrix4X4__Group__12__Impl rule__BaseMatrix4X4__Group__13 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3907:2: rule__BaseMatrix4X4__Group__12__Impl rule__BaseMatrix4X4__Group__13
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__12__Impl_in_rule__BaseMatrix4X4__Group__127766);
            rule__BaseMatrix4X4__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__13_in_rule__BaseMatrix4X4__Group__127769);
            rule__BaseMatrix4X4__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__12"


    // $ANTLR start "rule__BaseMatrix4X4__Group__12__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3914:1: rule__BaseMatrix4X4__Group__12__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3918:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3919:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3919:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3920:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_12()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__12__Impl7796); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__12__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__13"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3931:1: rule__BaseMatrix4X4__Group__13 : rule__BaseMatrix4X4__Group__13__Impl rule__BaseMatrix4X4__Group__14 ;
    public final void rule__BaseMatrix4X4__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3935:1: ( rule__BaseMatrix4X4__Group__13__Impl rule__BaseMatrix4X4__Group__14 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3936:2: rule__BaseMatrix4X4__Group__13__Impl rule__BaseMatrix4X4__Group__14
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__13__Impl_in_rule__BaseMatrix4X4__Group__137825);
            rule__BaseMatrix4X4__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__14_in_rule__BaseMatrix4X4__Group__137828);
            rule__BaseMatrix4X4__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__13"


    // $ANTLR start "rule__BaseMatrix4X4__Group__13__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3943:1: rule__BaseMatrix4X4__Group__13__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3947:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3948:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3948:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3949:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_13()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__13__Impl7855); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__13__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__14"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3960:1: rule__BaseMatrix4X4__Group__14 : rule__BaseMatrix4X4__Group__14__Impl rule__BaseMatrix4X4__Group__15 ;
    public final void rule__BaseMatrix4X4__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3964:1: ( rule__BaseMatrix4X4__Group__14__Impl rule__BaseMatrix4X4__Group__15 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3965:2: rule__BaseMatrix4X4__Group__14__Impl rule__BaseMatrix4X4__Group__15
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__14__Impl_in_rule__BaseMatrix4X4__Group__147884);
            rule__BaseMatrix4X4__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__15_in_rule__BaseMatrix4X4__Group__147887);
            rule__BaseMatrix4X4__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__14"


    // $ANTLR start "rule__BaseMatrix4X4__Group__14__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3972:1: rule__BaseMatrix4X4__Group__14__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3976:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3977:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3977:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3978:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_14()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__14__Impl7914); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__14__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__15"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3989:1: rule__BaseMatrix4X4__Group__15 : rule__BaseMatrix4X4__Group__15__Impl rule__BaseMatrix4X4__Group__16 ;
    public final void rule__BaseMatrix4X4__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3993:1: ( rule__BaseMatrix4X4__Group__15__Impl rule__BaseMatrix4X4__Group__16 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:3994:2: rule__BaseMatrix4X4__Group__15__Impl rule__BaseMatrix4X4__Group__16
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__15__Impl_in_rule__BaseMatrix4X4__Group__157943);
            rule__BaseMatrix4X4__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__16_in_rule__BaseMatrix4X4__Group__157946);
            rule__BaseMatrix4X4__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__15"


    // $ANTLR start "rule__BaseMatrix4X4__Group__15__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4001:1: rule__BaseMatrix4X4__Group__15__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4005:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4006:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4006:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4007:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_15()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__15__Impl7973); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__15__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__16"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4018:1: rule__BaseMatrix4X4__Group__16 : rule__BaseMatrix4X4__Group__16__Impl rule__BaseMatrix4X4__Group__17 ;
    public final void rule__BaseMatrix4X4__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4022:1: ( rule__BaseMatrix4X4__Group__16__Impl rule__BaseMatrix4X4__Group__17 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4023:2: rule__BaseMatrix4X4__Group__16__Impl rule__BaseMatrix4X4__Group__17
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__16__Impl_in_rule__BaseMatrix4X4__Group__168002);
            rule__BaseMatrix4X4__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__17_in_rule__BaseMatrix4X4__Group__168005);
            rule__BaseMatrix4X4__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__16"


    // $ANTLR start "rule__BaseMatrix4X4__Group__16__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4030:1: rule__BaseMatrix4X4__Group__16__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4034:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4035:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4035:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4036:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_16()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__16__Impl8032); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__16__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__17"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4047:1: rule__BaseMatrix4X4__Group__17 : rule__BaseMatrix4X4__Group__17__Impl rule__BaseMatrix4X4__Group__18 ;
    public final void rule__BaseMatrix4X4__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4051:1: ( rule__BaseMatrix4X4__Group__17__Impl rule__BaseMatrix4X4__Group__18 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4052:2: rule__BaseMatrix4X4__Group__17__Impl rule__BaseMatrix4X4__Group__18
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__17__Impl_in_rule__BaseMatrix4X4__Group__178061);
            rule__BaseMatrix4X4__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__18_in_rule__BaseMatrix4X4__Group__178064);
            rule__BaseMatrix4X4__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__17"


    // $ANTLR start "rule__BaseMatrix4X4__Group__17__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4059:1: rule__BaseMatrix4X4__Group__17__Impl : ( RULE_REAL ) ;
    public final void rule__BaseMatrix4X4__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4063:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4064:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4064:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4065:1: RULE_REAL
            {
             before(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_17()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__17__Impl8091); 
             after(grammarAccess.getBaseMatrix4X4Access().getREALTerminalRuleCall_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__17__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__18"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4076:1: rule__BaseMatrix4X4__Group__18 : rule__BaseMatrix4X4__Group__18__Impl rule__BaseMatrix4X4__Group__19 ;
    public final void rule__BaseMatrix4X4__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4080:1: ( rule__BaseMatrix4X4__Group__18__Impl rule__BaseMatrix4X4__Group__19 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4081:2: rule__BaseMatrix4X4__Group__18__Impl rule__BaseMatrix4X4__Group__19
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__18__Impl_in_rule__BaseMatrix4X4__Group__188120);
            rule__BaseMatrix4X4__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__19_in_rule__BaseMatrix4X4__Group__188123);
            rule__BaseMatrix4X4__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__18"


    // $ANTLR start "rule__BaseMatrix4X4__Group__18__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4088:1: rule__BaseMatrix4X4__Group__18__Impl : ( ']' ) ;
    public final void rule__BaseMatrix4X4__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4092:1: ( ( ']' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4093:1: ( ']' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4093:1: ( ']' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4094:1: ']'
            {
             before(grammarAccess.getBaseMatrix4X4Access().getRightSquareBracketKeyword_18()); 
            match(input,38,FOLLOW_38_in_rule__BaseMatrix4X4__Group__18__Impl8151); 
             after(grammarAccess.getBaseMatrix4X4Access().getRightSquareBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__18__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group__19"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4107:1: rule__BaseMatrix4X4__Group__19 : rule__BaseMatrix4X4__Group__19__Impl ;
    public final void rule__BaseMatrix4X4__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4111:1: ( rule__BaseMatrix4X4__Group__19__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4112:2: rule__BaseMatrix4X4__Group__19__Impl
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group__19__Impl_in_rule__BaseMatrix4X4__Group__198182);
            rule__BaseMatrix4X4__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__19"


    // $ANTLR start "rule__BaseMatrix4X4__Group__19__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4118:1: rule__BaseMatrix4X4__Group__19__Impl : ( () ) ;
    public final void rule__BaseMatrix4X4__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4122:1: ( ( () ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4123:1: ( () )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4123:1: ( () )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4124:1: ()
            {
             before(grammarAccess.getBaseMatrix4X4Access().getBaseMatrix4X4Action_19()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4125:1: ()
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4127:1: 
            {
            }

             after(grammarAccess.getBaseMatrix4X4Access().getBaseMatrix4X4Action_19()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group__19__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group_0__0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4177:1: rule__BaseMatrix4X4__Group_0__0 : rule__BaseMatrix4X4__Group_0__0__Impl rule__BaseMatrix4X4__Group_0__1 ;
    public final void rule__BaseMatrix4X4__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4181:1: ( rule__BaseMatrix4X4__Group_0__0__Impl rule__BaseMatrix4X4__Group_0__1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4182:2: rule__BaseMatrix4X4__Group_0__0__Impl rule__BaseMatrix4X4__Group_0__1
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group_0__0__Impl_in_rule__BaseMatrix4X4__Group_0__08280);
            rule__BaseMatrix4X4__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group_0__1_in_rule__BaseMatrix4X4__Group_0__08283);
            rule__BaseMatrix4X4__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group_0__0"


    // $ANTLR start "rule__BaseMatrix4X4__Group_0__0__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4189:1: rule__BaseMatrix4X4__Group_0__0__Impl : ( 'm4' ) ;
    public final void rule__BaseMatrix4X4__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4193:1: ( ( 'm4' ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4194:1: ( 'm4' )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4194:1: ( 'm4' )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4195:1: 'm4'
            {
             before(grammarAccess.getBaseMatrix4X4Access().getM4Keyword_0_0()); 
            match(input,40,FOLLOW_40_in_rule__BaseMatrix4X4__Group_0__0__Impl8311); 
             after(grammarAccess.getBaseMatrix4X4Access().getM4Keyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group_0__0__Impl"


    // $ANTLR start "rule__BaseMatrix4X4__Group_0__1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4208:1: rule__BaseMatrix4X4__Group_0__1 : rule__BaseMatrix4X4__Group_0__1__Impl ;
    public final void rule__BaseMatrix4X4__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4212:1: ( rule__BaseMatrix4X4__Group_0__1__Impl )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4213:2: rule__BaseMatrix4X4__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__Group_0__1__Impl_in_rule__BaseMatrix4X4__Group_0__18342);
            rule__BaseMatrix4X4__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group_0__1"


    // $ANTLR start "rule__BaseMatrix4X4__Group_0__1__Impl"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4219:1: rule__BaseMatrix4X4__Group_0__1__Impl : ( ( rule__BaseMatrix4X4__NameAssignment_0_1 ) ) ;
    public final void rule__BaseMatrix4X4__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4223:1: ( ( ( rule__BaseMatrix4X4__NameAssignment_0_1 ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4224:1: ( ( rule__BaseMatrix4X4__NameAssignment_0_1 ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4224:1: ( ( rule__BaseMatrix4X4__NameAssignment_0_1 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4225:1: ( rule__BaseMatrix4X4__NameAssignment_0_1 )
            {
             before(grammarAccess.getBaseMatrix4X4Access().getNameAssignment_0_1()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4226:1: ( rule__BaseMatrix4X4__NameAssignment_0_1 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4226:2: rule__BaseMatrix4X4__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BaseMatrix4X4__NameAssignment_0_1_in_rule__BaseMatrix4X4__Group_0__1__Impl8369);
            rule__BaseMatrix4X4__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseMatrix4X4Access().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__Group_0__1__Impl"


    // $ANTLR start "rule__Model__DefsAssignment_0"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4241:1: rule__Model__DefsAssignment_0 : ( ruleInitialDefinition ) ;
    public final void rule__Model__DefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4245:1: ( ( ruleInitialDefinition ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4246:1: ( ruleInitialDefinition )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4246:1: ( ruleInitialDefinition )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4247:1: ruleInitialDefinition
            {
             before(grammarAccess.getModelAccess().getDefsInitialDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInitialDefinition_in_rule__Model__DefsAssignment_08408);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4256:1: rule__Model__WorldAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__Model__WorldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4260:1: ( ( ruleEnvironment ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4261:1: ( ruleEnvironment )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4261:1: ( ruleEnvironment )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4262:1: ruleEnvironment
            {
             before(grammarAccess.getModelAccess().getWorldEnvironmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnvironment_in_rule__Model__WorldAssignment_18439);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4271:1: rule__Model__BodiesAssignment_2 : ( ruleSystem ) ;
    public final void rule__Model__BodiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4275:1: ( ( ruleSystem ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4276:1: ( ruleSystem )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4276:1: ( ruleSystem )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4277:1: ruleSystem
            {
             before(grammarAccess.getModelAccess().getBodiesSystemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSystem_in_rule__Model__BodiesAssignment_28470);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4286:1: rule__Environment__GravityAssignment_3 : ( ruleVector3 ) ;
    public final void rule__Environment__GravityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4290:1: ( ( ruleVector3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4291:1: ( ruleVector3 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4291:1: ( ruleVector3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4292:1: ruleVector3
            {
             before(grammarAccess.getEnvironmentAccess().getGravityVector3ParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVector3_in_rule__Environment__GravityAssignment_38501);
            ruleVector3();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getGravityVector3ParserRuleCall_3_0()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4301:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4305:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4306:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4306:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4307:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__NameAssignment_18532); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4316:1: rule__System__ElementsAssignment_3 : ( ruleSystemElement ) ;
    public final void rule__System__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4320:1: ( ( ruleSystemElement ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4321:1: ( ruleSystemElement )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4321:1: ( ruleSystemElement )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4322:1: ruleSystemElement
            {
             before(grammarAccess.getSystemAccess().getElementsSystemElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSystemElement_in_rule__System__ElementsAssignment_38563);
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4331:1: rule__Body__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Body__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4335:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4336:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4336:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4337:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__NameAssignment_18594); 
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


    // $ANTLR start "rule__Body__FrameAssignment_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4346:1: rule__Body__FrameAssignment_3 : ( ruleLocalFrame ) ;
    public final void rule__Body__FrameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4350:1: ( ( ruleLocalFrame ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4351:1: ( ruleLocalFrame )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4351:1: ( ruleLocalFrame )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4352:1: ruleLocalFrame
            {
             before(grammarAccess.getBodyAccess().getFrameLocalFrameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLocalFrame_in_rule__Body__FrameAssignment_38625);
            ruleLocalFrame();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getFrameLocalFrameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__FrameAssignment_3"


    // $ANTLR start "rule__Body__MassAssignment_4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4361:1: rule__Body__MassAssignment_4 : ( ruleMass ) ;
    public final void rule__Body__MassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4365:1: ( ( ruleMass ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4366:1: ( ruleMass )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4366:1: ( ruleMass )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4367:1: ruleMass
            {
             before(grammarAccess.getBodyAccess().getMassMassParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMass_in_rule__Body__MassAssignment_48656);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getMassMassParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__MassAssignment_4"


    // $ANTLR start "rule__LocalFrame__OrientationAssignment_4"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4376:1: rule__LocalFrame__OrientationAssignment_4 : ( ruleMatrix3X3 ) ;
    public final void rule__LocalFrame__OrientationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4380:1: ( ( ruleMatrix3X3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4381:1: ( ruleMatrix3X3 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4381:1: ( ruleMatrix3X3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4382:1: ruleMatrix3X3
            {
             before(grammarAccess.getLocalFrameAccess().getOrientationMatrix3X3ParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMatrix3X3_in_rule__LocalFrame__OrientationAssignment_48687);
            ruleMatrix3X3();

            state._fsp--;

             after(grammarAccess.getLocalFrameAccess().getOrientationMatrix3X3ParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__OrientationAssignment_4"


    // $ANTLR start "rule__LocalFrame__PositionAssignment_6"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4391:1: rule__LocalFrame__PositionAssignment_6 : ( ruleVector3 ) ;
    public final void rule__LocalFrame__PositionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4395:1: ( ( ruleVector3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4396:1: ( ruleVector3 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4396:1: ( ruleVector3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4397:1: ruleVector3
            {
             before(grammarAccess.getLocalFrameAccess().getPositionVector3ParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleVector3_in_rule__LocalFrame__PositionAssignment_68718);
            ruleVector3();

            state._fsp--;

             after(grammarAccess.getLocalFrameAccess().getPositionVector3ParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalFrame__PositionAssignment_6"


    // $ANTLR start "rule__Mass__ValueAssignment_3"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4406:1: rule__Mass__ValueAssignment_3 : ( RULE_REAL ) ;
    public final void rule__Mass__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4410:1: ( ( RULE_REAL ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4411:1: ( RULE_REAL )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4411:1: ( RULE_REAL )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4412:1: RULE_REAL
            {
             before(grammarAccess.getMassAccess().getValueREALTerminalRuleCall_3_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Mass__ValueAssignment_38749); 
             after(grammarAccess.getMassAccess().getValueREALTerminalRuleCall_3_0()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4421:1: rule__Mass__PositionAssignment_5 : ( ruleVector3 ) ;
    public final void rule__Mass__PositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4425:1: ( ( ruleVector3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4426:1: ( ruleVector3 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4426:1: ( ruleVector3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4427:1: ruleVector3
            {
             before(grammarAccess.getMassAccess().getPositionVector3ParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVector3_in_rule__Mass__PositionAssignment_58780);
            ruleVector3();

            state._fsp--;

             after(grammarAccess.getMassAccess().getPositionVector3ParserRuleCall_5_0()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4436:1: rule__Mass__InertiaAssignment_7 : ( ruleMatrix3X3 ) ;
    public final void rule__Mass__InertiaAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4440:1: ( ( ruleMatrix3X3 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4441:1: ( ruleMatrix3X3 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4441:1: ( ruleMatrix3X3 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4442:1: ruleMatrix3X3
            {
             before(grammarAccess.getMassAccess().getInertiaMatrix3X3ParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMatrix3X3_in_rule__Mass__InertiaAssignment_78811);
            ruleMatrix3X3();

            state._fsp--;

             after(grammarAccess.getMassAccess().getInertiaMatrix3X3ParserRuleCall_7_0()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4451:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4455:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4456:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4456:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4457:1: RULE_ID
            {
             before(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Joint__NameAssignment_18842); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4466:1: rule__Joint__TypeAssignment_3 : ( ruleMatrix4X4 ) ;
    public final void rule__Joint__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4470:1: ( ( ruleMatrix4X4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4471:1: ( ruleMatrix4X4 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4471:1: ( ruleMatrix4X4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4472:1: ruleMatrix4X4
            {
             before(grammarAccess.getJointAccess().getTypeMatrix4X4ParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMatrix4X4_in_rule__Joint__TypeAssignment_38873);
            ruleMatrix4X4();

            state._fsp--;

             after(grammarAccess.getJointAccess().getTypeMatrix4X4ParserRuleCall_3_0()); 

            }


            }

        }
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4481:1: rule__Joint__Body1Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__Body1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4485:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4486:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4486:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4487:1: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getBody1BodyCrossReference_5_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4488:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4489:1: RULE_ID
            {
             before(grammarAccess.getJointAccess().getBody1BodyIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Joint__Body1Assignment_58908); 
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


    // $ANTLR start "rule__Joint__RelTransformation1Assignment_10"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4500:1: rule__Joint__RelTransformation1Assignment_10 : ( ruleMatrix4X4 ) ;
    public final void rule__Joint__RelTransformation1Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4504:1: ( ( ruleMatrix4X4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4505:1: ( ruleMatrix4X4 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4505:1: ( ruleMatrix4X4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4506:1: ruleMatrix4X4
            {
             before(grammarAccess.getJointAccess().getRelTransformation1Matrix4X4ParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleMatrix4X4_in_rule__Joint__RelTransformation1Assignment_108943);
            ruleMatrix4X4();

            state._fsp--;

             after(grammarAccess.getJointAccess().getRelTransformation1Matrix4X4ParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__RelTransformation1Assignment_10"


    // $ANTLR start "rule__Joint__Body2Assignment_13"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4515:1: rule__Joint__Body2Assignment_13 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__Body2Assignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4519:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4520:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4520:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4521:1: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getBody2BodyCrossReference_13_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4522:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4523:1: RULE_ID
            {
             before(grammarAccess.getJointAccess().getBody2BodyIDTerminalRuleCall_13_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Joint__Body2Assignment_138978); 
             after(grammarAccess.getJointAccess().getBody2BodyIDTerminalRuleCall_13_0_1()); 

            }

             after(grammarAccess.getJointAccess().getBody2BodyCrossReference_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Body2Assignment_13"


    // $ANTLR start "rule__Joint__RelTransformation2Assignment_18"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4534:1: rule__Joint__RelTransformation2Assignment_18 : ( ruleMatrix4X4 ) ;
    public final void rule__Joint__RelTransformation2Assignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4538:1: ( ( ruleMatrix4X4 ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4539:1: ( ruleMatrix4X4 )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4539:1: ( ruleMatrix4X4 )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4540:1: ruleMatrix4X4
            {
             before(grammarAccess.getJointAccess().getRelTransformation2Matrix4X4ParserRuleCall_18_0()); 
            pushFollow(FOLLOW_ruleMatrix4X4_in_rule__Joint__RelTransformation2Assignment_189013);
            ruleMatrix4X4();

            state._fsp--;

             after(grammarAccess.getJointAccess().getRelTransformation2Matrix4X4ParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__RelTransformation2Assignment_18"


    // $ANTLR start "rule__ColocationConstraint__Joint1Assignment_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4549:1: rule__ColocationConstraint__Joint1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ColocationConstraint__Joint1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4553:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4554:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4554:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4555:1: ( RULE_ID )
            {
             before(grammarAccess.getColocationConstraintAccess().getJoint1JointCrossReference_1_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4556:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4557:1: RULE_ID
            {
             before(grammarAccess.getColocationConstraintAccess().getJoint1JointIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColocationConstraint__Joint1Assignment_19048); 
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
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4568:1: rule__ColocationConstraint__Joint2Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ColocationConstraint__Joint2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4572:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4573:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4573:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4574:1: ( RULE_ID )
            {
             before(grammarAccess.getColocationConstraintAccess().getJoint2JointCrossReference_3_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4575:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4576:1: RULE_ID
            {
             before(grammarAccess.getColocationConstraintAccess().getJoint2JointIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColocationConstraint__Joint2Assignment_39087); 
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


    // $ANTLR start "rule__BaseVector3__NameAssignment_0_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4587:1: rule__BaseVector3__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__BaseVector3__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4591:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4592:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4592:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4593:1: RULE_ID
            {
             before(grammarAccess.getBaseVector3Access().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BaseVector3__NameAssignment_0_19122); 
             after(grammarAccess.getBaseVector3Access().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVector3__NameAssignment_0_1"


    // $ANTLR start "rule__Vector3Ref__VectorAssignment"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4602:1: rule__Vector3Ref__VectorAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Vector3Ref__VectorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4606:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4607:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4607:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4608:1: ( RULE_ID )
            {
             before(grammarAccess.getVector3RefAccess().getVectorBaseVector3CrossReference_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4609:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4610:1: RULE_ID
            {
             before(grammarAccess.getVector3RefAccess().getVectorBaseVector3IDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Vector3Ref__VectorAssignment9157); 
             after(grammarAccess.getVector3RefAccess().getVectorBaseVector3IDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVector3RefAccess().getVectorBaseVector3CrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector3Ref__VectorAssignment"


    // $ANTLR start "rule__BaseMatrix3X3__NameAssignment_0_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4621:1: rule__BaseMatrix3X3__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__BaseMatrix3X3__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4625:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4626:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4626:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4627:1: RULE_ID
            {
             before(grammarAccess.getBaseMatrix3X3Access().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BaseMatrix3X3__NameAssignment_0_19192); 
             after(grammarAccess.getBaseMatrix3X3Access().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix3X3__NameAssignment_0_1"


    // $ANTLR start "rule__Matrix3X3Ref__MatrixAssignment"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4636:1: rule__Matrix3X3Ref__MatrixAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Matrix3X3Ref__MatrixAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4640:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4641:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4641:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4642:1: ( RULE_ID )
            {
             before(grammarAccess.getMatrix3X3RefAccess().getMatrixBaseMatrix3X3CrossReference_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4643:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4644:1: RULE_ID
            {
             before(grammarAccess.getMatrix3X3RefAccess().getMatrixBaseMatrix3X3IDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Matrix3X3Ref__MatrixAssignment9227); 
             after(grammarAccess.getMatrix3X3RefAccess().getMatrixBaseMatrix3X3IDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getMatrix3X3RefAccess().getMatrixBaseMatrix3X3CrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix3X3Ref__MatrixAssignment"


    // $ANTLR start "rule__BaseMatrix4X4__NameAssignment_0_1"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4655:1: rule__BaseMatrix4X4__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__BaseMatrix4X4__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4659:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4660:1: ( RULE_ID )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4660:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4661:1: RULE_ID
            {
             before(grammarAccess.getBaseMatrix4X4Access().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BaseMatrix4X4__NameAssignment_0_19262); 
             after(grammarAccess.getBaseMatrix4X4Access().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseMatrix4X4__NameAssignment_0_1"


    // $ANTLR start "rule__Matrix4X4Ref__MatrixAssignment"
    // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4670:1: rule__Matrix4X4Ref__MatrixAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Matrix4X4Ref__MatrixAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4674:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4675:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4675:1: ( ( RULE_ID ) )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4676:1: ( RULE_ID )
            {
             before(grammarAccess.getMatrix4X4RefAccess().getMatrixBaseMatrix4X4CrossReference_0()); 
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4677:1: ( RULE_ID )
            // ../uk.ac.kcl.inf.robotics.rigid_bodies.ui/src-gen/uk/ac/kcl/inf/robotics/ui/contentassist/antlr/internal/InternalRigidBodies.g:4678:1: RULE_ID
            {
             before(grammarAccess.getMatrix4X4RefAccess().getMatrixBaseMatrix4X4IDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Matrix4X4Ref__MatrixAssignment9297); 
             after(grammarAccess.getMatrix4X4RefAccess().getMatrixBaseMatrix4X4IDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getMatrix4X4RefAccess().getMatrixBaseMatrix4X4CrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix4X4Ref__MatrixAssignment"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\1\45\1\uffff\1\4\1\uffff\11\4";
    static final String DFA6_maxS =
        "\1\50\1\uffff\1\4\1\uffff\10\4\1\46";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\11\uffff";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\uffff\1\1\1\3",
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

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "764:1: rule__MatrixDef__Alternatives : ( ( ruleBaseMatrix3X3 ) | ( ruleBaseMatrix4X4 ) );";
        }
    }
 

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
    public static final BitSet FOLLOW_ruleLocalFrame_in_entryRuleLocalFrame421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalFrame428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__0_in_ruleLocalFrame454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_entryRuleMass481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMass488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__0_in_ruleMass514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_entryRuleJoint541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoint548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__0_in_ruleJoint574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColocationConstraint_in_ruleConstraint634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColocationConstraint_in_entryRuleColocationConstraint660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColocationConstraint667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__0_in_ruleColocationConstraint693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector3_in_entryRuleVector3720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector3__Alternatives_in_ruleVector3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseVector3_in_entryRuleBaseVector3780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseVector3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__0_in_ruleBaseVector3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector3Ref_in_entryRuleVector3Ref840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector3Ref847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vector3Ref__VectorAssignment_in_ruleVector3Ref873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix3X3_in_entryRuleMatrix3X3900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix3X3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix3X3__Alternatives_in_ruleMatrix3X3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix3X3_in_entryRuleBaseMatrix3X3960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseMatrix3X3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__0_in_ruleBaseMatrix3X3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix3X3Ref_in_entryRuleMatrix3X3Ref1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix3X3Ref1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix3X3Ref__MatrixAssignment_in_ruleMatrix3X3Ref1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix4X4_in_entryRuleMatrix4X41080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix4X41087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix4X4__Alternatives_in_ruleMatrix4X41113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix4X4_in_entryRuleBaseMatrix4X41140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseMatrix4X41147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__0_in_ruleBaseMatrix4X41173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix4X4Ref_in_entryRuleMatrix4X4Ref1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix4X4Ref1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix4X4Ref__MatrixAssignment_in_ruleMatrix4X4Ref1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixDef_in_entryRuleMatrixDef1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrixDef1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixDef__Alternatives_in_ruleMatrixDef1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixDef_in_rule__InitialDefinition__Alternatives1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseVector3_in_rule__InitialDefinition__Alternatives1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__SystemElement__Alternatives1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoint_in_rule__SystemElement__Alternatives1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__SystemElement__Alternatives1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseVector3_in_rule__Vector3__Alternatives1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector3Ref_in_rule__Vector3__Alternatives1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix3X3_in_rule__Matrix3X3__Alternatives1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix3X3Ref_in_rule__Matrix3X3__Alternatives1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix4X4_in_rule__Matrix4X4__Alternatives1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix4X4Ref_in_rule__Matrix4X4__Alternatives1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix3X3_in_rule__MatrixDef__Alternatives1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseMatrix4X4_in_rule__MatrixDef__Alternatives1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01638 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DefsAssignment_0_in_rule__Model__Group__0__Impl1668 = new BitSet(new long[]{0x000001B010000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11699 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__WorldAssignment_1_in_rule__Model__Group__1__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl1788 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Model__BodiesAssignment_2_in_rule__Model__Group__2__Impl1800 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Environment__Group__0__Impl_in_rule__Environment__Group__01839 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Environment__Group__1_in_rule__Environment__Group__01842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Environment__Group__0__Impl1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__1__Impl_in_rule__Environment__Group__11901 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Environment__Group__2_in_rule__Environment__Group__11904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Environment__Group__1__Impl1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__2__Impl_in_rule__Environment__Group__21963 = new BitSet(new long[]{0x000001B010000020L});
    public static final BitSet FOLLOW_rule__Environment__Group__3_in_rule__Environment__Group__21966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Environment__Group__2__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__3__Impl_in_rule__Environment__Group__32025 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Environment__Group__4_in_rule__Environment__Group__32028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__GravityAssignment_3_in_rule__Environment__Group__3__Impl2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__4__Impl_in_rule__Environment__Group__42085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Environment__Group__4__Impl2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__02154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__02157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__System__Group__0__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__12216 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__12219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__22276 = new BitSet(new long[]{0x0000000402020000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__22279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__System__Group__2__Impl2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__32338 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__32341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl2370 = new BitSet(new long[]{0x0000000402020002L});
    public static final BitSet FOLLOW_rule__System__ElementsAssignment_3_in_rule__System__Group__3__Impl2382 = new BitSet(new long[]{0x0000000402020002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__42415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__System__Group__4__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__02484 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__02487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Body__Group__0__Impl2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__12546 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__12549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__NameAssignment_1_in_rule__Body__Group__1__Impl2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__22606 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__22609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Body__Group__2__Impl2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__32668 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Body__Group__4_in_rule__Body__Group__32671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__FrameAssignment_3_in_rule__Body__Group__3__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__42728 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Body__Group__5_in_rule__Body__Group__42731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__MassAssignment_4_in_rule__Body__Group__4__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__52788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Body__Group__5__Impl2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__0__Impl_in_rule__LocalFrame__Group__02859 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__1_in_rule__LocalFrame__Group__02862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LocalFrame__Group__0__Impl2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__1__Impl_in_rule__LocalFrame__Group__12921 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__2_in_rule__LocalFrame__Group__12924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LocalFrame__Group__1__Impl2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__2__Impl_in_rule__LocalFrame__Group__22983 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__3_in_rule__LocalFrame__Group__22986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__LocalFrame__Group__2__Impl3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__3__Impl_in_rule__LocalFrame__Group__33045 = new BitSet(new long[]{0x000000A000000020L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__4_in_rule__LocalFrame__Group__33048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LocalFrame__Group__3__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__4__Impl_in_rule__LocalFrame__Group__43107 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__5_in_rule__LocalFrame__Group__43110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalFrame__OrientationAssignment_4_in_rule__LocalFrame__Group__4__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__5__Impl_in_rule__LocalFrame__Group__53167 = new BitSet(new long[]{0x000001B010000020L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__6_in_rule__LocalFrame__Group__53170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LocalFrame__Group__5__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__6__Impl_in_rule__LocalFrame__Group__63229 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__7_in_rule__LocalFrame__Group__63232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalFrame__PositionAssignment_6_in_rule__LocalFrame__Group__6__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalFrame__Group__7__Impl_in_rule__LocalFrame__Group__73289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__LocalFrame__Group__7__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__0__Impl_in_rule__Mass__Group__03364 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Mass__Group__1_in_rule__Mass__Group__03367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Mass__Group__0__Impl3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__1__Impl_in_rule__Mass__Group__13426 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Mass__Group__2_in_rule__Mass__Group__13429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Mass__Group__1__Impl3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__2__Impl_in_rule__Mass__Group__23488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mass__Group__3_in_rule__Mass__Group__23491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Mass__Group__2__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__3__Impl_in_rule__Mass__Group__33550 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Mass__Group__4_in_rule__Mass__Group__33553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__ValueAssignment_3_in_rule__Mass__Group__3__Impl3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__4__Impl_in_rule__Mass__Group__43610 = new BitSet(new long[]{0x000001B010000020L});
    public static final BitSet FOLLOW_rule__Mass__Group__5_in_rule__Mass__Group__43613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Mass__Group__4__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__5__Impl_in_rule__Mass__Group__53672 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Mass__Group__6_in_rule__Mass__Group__53675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__PositionAssignment_5_in_rule__Mass__Group__5__Impl3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__6__Impl_in_rule__Mass__Group__63732 = new BitSet(new long[]{0x000000A000000020L});
    public static final BitSet FOLLOW_rule__Mass__Group__7_in_rule__Mass__Group__63735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Mass__Group__6__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__7__Impl_in_rule__Mass__Group__73794 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Mass__Group__8_in_rule__Mass__Group__73797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__InertiaAssignment_7_in_rule__Mass__Group__7__Impl3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mass__Group__8__Impl_in_rule__Mass__Group__83854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Mass__Group__8__Impl3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__0__Impl_in_rule__Joint__Group__03931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Joint__Group__1_in_rule__Joint__Group__03934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Joint__Group__0__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__1__Impl_in_rule__Joint__Group__13993 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__2_in_rule__Joint__Group__13996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__NameAssignment_1_in_rule__Joint__Group__1__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__2__Impl_in_rule__Joint__Group__24053 = new BitSet(new long[]{0x000001A000000020L});
    public static final BitSet FOLLOW_rule__Joint__Group__3_in_rule__Joint__Group__24056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Joint__Group__2__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__3__Impl_in_rule__Joint__Group__34115 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__4_in_rule__Joint__Group__34118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__TypeAssignment_3_in_rule__Joint__Group__3__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__4__Impl_in_rule__Joint__Group__44175 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Joint__Group__5_in_rule__Joint__Group__44178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Joint__Group__4__Impl4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__5__Impl_in_rule__Joint__Group__54237 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__6_in_rule__Joint__Group__54240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Body1Assignment_5_in_rule__Joint__Group__5__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__6__Impl_in_rule__Joint__Group__64297 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__7_in_rule__Joint__Group__64300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Joint__Group__6__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__7__Impl_in_rule__Joint__Group__74359 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__8_in_rule__Joint__Group__74362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Joint__Group__7__Impl4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__8__Impl_in_rule__Joint__Group__84421 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__9_in_rule__Joint__Group__84424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Joint__Group__8__Impl4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__9__Impl_in_rule__Joint__Group__94483 = new BitSet(new long[]{0x000001A000000020L});
    public static final BitSet FOLLOW_rule__Joint__Group__10_in_rule__Joint__Group__94486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Joint__Group__9__Impl4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__10__Impl_in_rule__Joint__Group__104545 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__11_in_rule__Joint__Group__104548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__RelTransformation1Assignment_10_in_rule__Joint__Group__10__Impl4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__11__Impl_in_rule__Joint__Group__114605 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__12_in_rule__Joint__Group__114608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Joint__Group__11__Impl4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__12__Impl_in_rule__Joint__Group__124667 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Joint__Group__13_in_rule__Joint__Group__124670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Joint__Group__12__Impl4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__13__Impl_in_rule__Joint__Group__134729 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__14_in_rule__Joint__Group__134732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Body2Assignment_13_in_rule__Joint__Group__13__Impl4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__14__Impl_in_rule__Joint__Group__144789 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__15_in_rule__Joint__Group__144792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Joint__Group__14__Impl4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__15__Impl_in_rule__Joint__Group__154851 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__16_in_rule__Joint__Group__154854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Joint__Group__15__Impl4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__16__Impl_in_rule__Joint__Group__164913 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__17_in_rule__Joint__Group__164916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Joint__Group__16__Impl4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__17__Impl_in_rule__Joint__Group__174975 = new BitSet(new long[]{0x000001A000000020L});
    public static final BitSet FOLLOW_rule__Joint__Group__18_in_rule__Joint__Group__174978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Joint__Group__17__Impl5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__18__Impl_in_rule__Joint__Group__185037 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Joint__Group__19_in_rule__Joint__Group__185040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__RelTransformation2Assignment_18_in_rule__Joint__Group__18__Impl5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Joint__Group__19__Impl_in_rule__Joint__Group__195097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Joint__Group__19__Impl5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__0__Impl_in_rule__ColocationConstraint__Group__05196 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__1_in_rule__ColocationConstraint__Group__05199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ColocationConstraint__Group__0__Impl5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__1__Impl_in_rule__ColocationConstraint__Group__15258 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__2_in_rule__ColocationConstraint__Group__15261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Joint1Assignment_1_in_rule__ColocationConstraint__Group__1__Impl5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__2__Impl_in_rule__ColocationConstraint__Group__25318 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__3_in_rule__ColocationConstraint__Group__25321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ColocationConstraint__Group__2__Impl5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Group__3__Impl_in_rule__ColocationConstraint__Group__35380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColocationConstraint__Joint2Assignment_3_in_rule__ColocationConstraint__Group__3__Impl5407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__0__Impl_in_rule__BaseVector3__Group__05445 = new BitSet(new long[]{0x000001B010000000L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__1_in_rule__BaseVector3__Group__05448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group_0__0_in_rule__BaseVector3__Group__0__Impl5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__1__Impl_in_rule__BaseVector3__Group__15506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__2_in_rule__BaseVector3__Group__15509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BaseVector3__Group__1__Impl5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__2__Impl_in_rule__BaseVector3__Group__25568 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__3_in_rule__BaseVector3__Group__25571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseVector3__Group__2__Impl5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__3__Impl_in_rule__BaseVector3__Group__35627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__4_in_rule__BaseVector3__Group__35630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BaseVector3__Group__3__Impl5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__4__Impl_in_rule__BaseVector3__Group__45689 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__5_in_rule__BaseVector3__Group__45692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseVector3__Group__4__Impl5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__5__Impl_in_rule__BaseVector3__Group__55748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__6_in_rule__BaseVector3__Group__55751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BaseVector3__Group__5__Impl5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__6__Impl_in_rule__BaseVector3__Group__65810 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__7_in_rule__BaseVector3__Group__65813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseVector3__Group__6__Impl5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__7__Impl_in_rule__BaseVector3__Group__75869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__8_in_rule__BaseVector3__Group__75872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__BaseVector3__Group__7__Impl5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group__8__Impl_in_rule__BaseVector3__Group__85931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group_0__0__Impl_in_rule__BaseVector3__Group_0__06007 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group_0__1_in_rule__BaseVector3__Group_0__06010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__BaseVector3__Group_0__0__Impl6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__Group_0__1__Impl_in_rule__BaseVector3__Group_0__16069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseVector3__NameAssignment_0_1_in_rule__BaseVector3__Group_0__1__Impl6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__0__Impl_in_rule__BaseMatrix3X3__Group__06130 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__1_in_rule__BaseMatrix3X3__Group__06133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group_0__0_in_rule__BaseMatrix3X3__Group__0__Impl6160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__1__Impl_in_rule__BaseMatrix3X3__Group__16191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__2_in_rule__BaseMatrix3X3__Group__16194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BaseMatrix3X3__Group__1__Impl6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__2__Impl_in_rule__BaseMatrix3X3__Group__26253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__3_in_rule__BaseMatrix3X3__Group__26256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__2__Impl6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__3__Impl_in_rule__BaseMatrix3X3__Group__36312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__4_in_rule__BaseMatrix3X3__Group__36315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__3__Impl6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__4__Impl_in_rule__BaseMatrix3X3__Group__46371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__5_in_rule__BaseMatrix3X3__Group__46374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__4__Impl6401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__5__Impl_in_rule__BaseMatrix3X3__Group__56430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__6_in_rule__BaseMatrix3X3__Group__56433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__5__Impl6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__6__Impl_in_rule__BaseMatrix3X3__Group__66489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__7_in_rule__BaseMatrix3X3__Group__66492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__6__Impl6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__7__Impl_in_rule__BaseMatrix3X3__Group__76548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__8_in_rule__BaseMatrix3X3__Group__76551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__7__Impl6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__8__Impl_in_rule__BaseMatrix3X3__Group__86607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__9_in_rule__BaseMatrix3X3__Group__86610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__8__Impl6637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__9__Impl_in_rule__BaseMatrix3X3__Group__96666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__10_in_rule__BaseMatrix3X3__Group__96669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__9__Impl6696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__10__Impl_in_rule__BaseMatrix3X3__Group__106725 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__11_in_rule__BaseMatrix3X3__Group__106728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix3X3__Group__10__Impl6755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__11__Impl_in_rule__BaseMatrix3X3__Group__116784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__12_in_rule__BaseMatrix3X3__Group__116787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__BaseMatrix3X3__Group__11__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group__12__Impl_in_rule__BaseMatrix3X3__Group__126846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group_0__0__Impl_in_rule__BaseMatrix3X3__Group_0__06930 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group_0__1_in_rule__BaseMatrix3X3__Group_0__06933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__BaseMatrix3X3__Group_0__0__Impl6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__Group_0__1__Impl_in_rule__BaseMatrix3X3__Group_0__16992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix3X3__NameAssignment_0_1_in_rule__BaseMatrix3X3__Group_0__1__Impl7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__0__Impl_in_rule__BaseMatrix4X4__Group__07053 = new BitSet(new long[]{0x000001A000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__1_in_rule__BaseMatrix4X4__Group__07056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group_0__0_in_rule__BaseMatrix4X4__Group__0__Impl7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__1__Impl_in_rule__BaseMatrix4X4__Group__17114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__2_in_rule__BaseMatrix4X4__Group__17117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BaseMatrix4X4__Group__1__Impl7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__2__Impl_in_rule__BaseMatrix4X4__Group__27176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__3_in_rule__BaseMatrix4X4__Group__27179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__2__Impl7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__3__Impl_in_rule__BaseMatrix4X4__Group__37235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__4_in_rule__BaseMatrix4X4__Group__37238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__3__Impl7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__4__Impl_in_rule__BaseMatrix4X4__Group__47294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__5_in_rule__BaseMatrix4X4__Group__47297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__4__Impl7324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__5__Impl_in_rule__BaseMatrix4X4__Group__57353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__6_in_rule__BaseMatrix4X4__Group__57356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__5__Impl7383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__6__Impl_in_rule__BaseMatrix4X4__Group__67412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__7_in_rule__BaseMatrix4X4__Group__67415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__6__Impl7442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__7__Impl_in_rule__BaseMatrix4X4__Group__77471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__8_in_rule__BaseMatrix4X4__Group__77474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__7__Impl7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__8__Impl_in_rule__BaseMatrix4X4__Group__87530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__9_in_rule__BaseMatrix4X4__Group__87533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__8__Impl7560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__9__Impl_in_rule__BaseMatrix4X4__Group__97589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__10_in_rule__BaseMatrix4X4__Group__97592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__9__Impl7619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__10__Impl_in_rule__BaseMatrix4X4__Group__107648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__11_in_rule__BaseMatrix4X4__Group__107651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__10__Impl7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__11__Impl_in_rule__BaseMatrix4X4__Group__117707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__12_in_rule__BaseMatrix4X4__Group__117710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__11__Impl7737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__12__Impl_in_rule__BaseMatrix4X4__Group__127766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__13_in_rule__BaseMatrix4X4__Group__127769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__12__Impl7796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__13__Impl_in_rule__BaseMatrix4X4__Group__137825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__14_in_rule__BaseMatrix4X4__Group__137828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__13__Impl7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__14__Impl_in_rule__BaseMatrix4X4__Group__147884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__15_in_rule__BaseMatrix4X4__Group__147887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__14__Impl7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__15__Impl_in_rule__BaseMatrix4X4__Group__157943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__16_in_rule__BaseMatrix4X4__Group__157946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__15__Impl7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__16__Impl_in_rule__BaseMatrix4X4__Group__168002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__17_in_rule__BaseMatrix4X4__Group__168005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__16__Impl8032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__17__Impl_in_rule__BaseMatrix4X4__Group__178061 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__18_in_rule__BaseMatrix4X4__Group__178064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__BaseMatrix4X4__Group__17__Impl8091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__18__Impl_in_rule__BaseMatrix4X4__Group__188120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__19_in_rule__BaseMatrix4X4__Group__188123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__BaseMatrix4X4__Group__18__Impl8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group__19__Impl_in_rule__BaseMatrix4X4__Group__198182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group_0__0__Impl_in_rule__BaseMatrix4X4__Group_0__08280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group_0__1_in_rule__BaseMatrix4X4__Group_0__08283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__BaseMatrix4X4__Group_0__0__Impl8311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__Group_0__1__Impl_in_rule__BaseMatrix4X4__Group_0__18342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseMatrix4X4__NameAssignment_0_1_in_rule__BaseMatrix4X4__Group_0__1__Impl8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialDefinition_in_rule__Model__DefsAssignment_08408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_rule__Model__WorldAssignment_18439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Model__BodiesAssignment_28470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector3_in_rule__Environment__GravityAssignment_38501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__NameAssignment_18532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemElement_in_rule__System__ElementsAssignment_38563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__NameAssignment_18594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalFrame_in_rule__Body__FrameAssignment_38625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMass_in_rule__Body__MassAssignment_48656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix3X3_in_rule__LocalFrame__OrientationAssignment_48687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector3_in_rule__LocalFrame__PositionAssignment_68718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Mass__ValueAssignment_38749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector3_in_rule__Mass__PositionAssignment_58780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix3X3_in_rule__Mass__InertiaAssignment_78811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Joint__NameAssignment_18842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix4X4_in_rule__Joint__TypeAssignment_38873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Joint__Body1Assignment_58908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix4X4_in_rule__Joint__RelTransformation1Assignment_108943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Joint__Body2Assignment_138978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix4X4_in_rule__Joint__RelTransformation2Assignment_189013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColocationConstraint__Joint1Assignment_19048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColocationConstraint__Joint2Assignment_39087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BaseVector3__NameAssignment_0_19122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Vector3Ref__VectorAssignment9157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BaseMatrix3X3__NameAssignment_0_19192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Matrix3X3Ref__MatrixAssignment9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BaseMatrix4X4__NameAssignment_0_19262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Matrix4X4Ref__MatrixAssignment9297 = new BitSet(new long[]{0x0000000000000002L});

}