/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests;

import java.util.Collections;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Activator extends AbstractUIPlugin {
	
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_XTEXTGRAMMARUITESTLANGUAGE = "org.eclipse.xtext.ui.tests.XtextGrammarUiTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_LINKING_IMPORTURIUITESTLANGUAGE = "org.eclipse.xtext.ui.tests.linking.ImportUriUiTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_TWOCONTEXTSTESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.TwoContextsTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG286935TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug286935TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG287941TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug287941TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG288734TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug288734TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG288760TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug288760TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG289187TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug289187TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG291022TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug291022TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG303200TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug303200TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG304681TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug304681TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG307519TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug307519TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG309949TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug309949TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG332217TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG348427TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG348199TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug348199TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG360834TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug360834TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG347012TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG381381TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug381381TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BACKTRACKINGCONTENTASSISTTESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_CONTENTASSISTCONTEXTTESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_CONTENTASSISTCUSTOMIZINGTESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistCustomizingTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_CROSSREFERENCEPROPOSALTESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.CrossReferenceProposalTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_DATATYPERULETESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.DatatypeRuleTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_LOOKAHEADCONTENTASSISTTESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.LookAheadContentAssistTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_DOMAINMODELTESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.DomainModelTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_UNORDEREDGROUPSTESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_PARAMETERSTESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.ParametersTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_PARAMETERSTESTLANGUAGEEX = "org.eclipse.xtext.ui.tests.editor.contentassist.ParametersTestLanguageEx";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_TWOPARAMETERSTESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_OUTLINE_OUTLINETESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.outline.OutlineTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_PARSER_KEYWORDS_KEYWORDSUITESTLANGUAGE = "org.eclipse.xtext.ui.tests.parser.keywords.KeywordsUiTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_TESTLANGUAGES_CONTENTASSISTTESTLANGUAGE = "org.eclipse.xtext.ui.tests.testlanguages.ContentAssistTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_TESTLANGUAGES_REFERENCEGRAMMARUITESTLANGUAGE = "org.eclipse.xtext.ui.tests.testlanguages.ReferenceGrammarUiTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_ENCODING_ENCODINGUITESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.encoding.EncodingUiTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_ENUMRULES_ENUMRULESUITESTLANGUAGE = "org.eclipse.xtext.ui.tests.enumrules.EnumRulesUiTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_TESTLANGUAGE = "org.eclipse.xtext.ui.tests.TestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_FOLDINGTESTLANGUAGE = "org.eclipse.xtext.ui.tests.FoldingTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_BRACKETMATCHING_BMTESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.bracketmatching.BmTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_QUICKFIX_QUICKFIXCROSSREFTESTLANGUAGE = "org.eclipse.xtext.ui.tests.quickfix.QuickfixCrossrefTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_REFACTORING_REFACTORINGTESTLANGUAGE = "org.eclipse.xtext.ui.tests.refactoring.RefactoringTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_REFACTORING_REFERRINGTESTLANGUAGE = "org.eclipse.xtext.ui.tests.refactoring.ReferringTestLanguage";
	public static final String ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG377311TESTLANGUAGE = "org.eclipse.xtext.ui.tests.editor.contentassist.Bug377311TestLanguage";
	
	private static final Logger logger = Logger.getLogger(Activator.class);
	
	private static Activator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static Activator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			Module runtimeModule = getRuntimeModule(language);
			Module sharedStateModule = getSharedStateModule();
			Module uiModule = getUiModule(language);
			Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}

	protected Module getRuntimeModule(String grammar) {
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_XTEXTGRAMMARUITESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.XtextGrammarUiTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_LINKING_IMPORTURIUITESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.linking.ImportUriUiTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_TWOCONTEXTSTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.TwoContextsTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG286935TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug286935TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG287941TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug287941TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG288734TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug288734TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG288760TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug288760TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG289187TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug289187TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG291022TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug291022TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG303200TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug303200TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG304681TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug304681TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG307519TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug307519TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG309949TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug309949TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG332217TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG348427TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG348199TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug348199TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG360834TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug360834TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG347012TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug347012TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG381381TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug381381TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BACKTRACKINGCONTENTASSISTTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_CONTENTASSISTCONTEXTTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_CONTENTASSISTCUSTOMIZINGTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistCustomizingTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_CROSSREFERENCEPROPOSALTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.CrossReferenceProposalTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_DATATYPERULETESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.DatatypeRuleTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_LOOKAHEADCONTENTASSISTTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.LookAheadContentAssistTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_DOMAINMODELTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.DomainModelTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_UNORDEREDGROUPSTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_PARAMETERSTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ParametersTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_PARAMETERSTESTLANGUAGEEX.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ParametersTestLanguageExRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_TWOPARAMETERSTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_OUTLINE_OUTLINETESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.outline.OutlineTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_PARSER_KEYWORDS_KEYWORDSUITESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.parser.keywords.KeywordsUiTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_TESTLANGUAGES_CONTENTASSISTTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.testlanguages.ContentAssistTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_TESTLANGUAGES_REFERENCEGRAMMARUITESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.testlanguages.ReferenceGrammarUiTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_ENCODING_ENCODINGUITESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.encoding.EncodingUiTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_ENUMRULES_ENUMRULESUITESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.enumrules.EnumRulesUiTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.TestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_FOLDINGTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.FoldingTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_BRACKETMATCHING_BMTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.bracketmatching.BmTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_QUICKFIX_QUICKFIXCROSSREFTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.quickfix.QuickfixCrossrefTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_REFACTORING_REFACTORINGTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.refactoring.RefactoringTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_REFACTORING_REFERRINGTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.refactoring.ReferringTestLanguageRuntimeModule();
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG377311TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.Bug377311TestLanguageRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getUiModule(String grammar) {
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_XTEXTGRAMMARUITESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.ui.XtextGrammarUiTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_LINKING_IMPORTURIUITESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.linking.ui.ImportUriUiTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_TWOCONTEXTSTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.TwoContextsTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG286935TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug286935TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG287941TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug287941TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG288734TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug288734TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG288760TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug288760TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG289187TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug289187TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG291022TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug291022TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG303200TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug303200TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG304681TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug304681TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG307519TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug307519TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG309949TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug309949TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG332217TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug332217TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG348427TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug348427TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG348199TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug348199TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG360834TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug360834TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG347012TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug347012TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG381381TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug381381TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BACKTRACKINGCONTENTASSISTTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.BacktrackingContentAssistTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_CONTENTASSISTCONTEXTTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.ContentAssistContextTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_CONTENTASSISTCUSTOMIZINGTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.ContentAssistCustomizingTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_CROSSREFERENCEPROPOSALTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.CrossReferenceProposalTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_DATATYPERULETESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.DatatypeRuleTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_LOOKAHEADCONTENTASSISTTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.LookAheadContentAssistTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_DOMAINMODELTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.DomainModelTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_UNORDEREDGROUPSTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.UnorderedGroupsTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_PARAMETERSTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.ParametersTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_PARAMETERSTESTLANGUAGEEX.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.ParametersTestLanguageExUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_TWOPARAMETERSTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.TwoParametersTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_OUTLINE_OUTLINETESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.outline.ui.OutlineTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_PARSER_KEYWORDS_KEYWORDSUITESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.parser.keywords.ui.KeywordsUiTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_TESTLANGUAGES_CONTENTASSISTTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.testlanguages.ui.ContentAssistTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_TESTLANGUAGES_REFERENCEGRAMMARUITESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.testlanguages.ui.ReferenceGrammarUiTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_ENCODING_ENCODINGUITESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.encoding.ui.EncodingUiTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_ENUMRULES_ENUMRULESUITESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.enumrules.ui.EnumRulesUiTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.ui.TestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_FOLDINGTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.ui.FoldingTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_BRACKETMATCHING_BMTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.bracketmatching.ui.BmTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_QUICKFIX_QUICKFIXCROSSREFTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.quickfix.ui.QuickfixCrossrefTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_REFACTORING_REFACTORINGTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.refactoring.ui.RefactoringTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_REFACTORING_REFERRINGTESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.refactoring.ui.ReferringTestLanguageUiModule(this);
		}
		if (ORG_ECLIPSE_XTEXT_UI_TESTS_EDITOR_CONTENTASSIST_BUG377311TESTLANGUAGE.equals(grammar)) {
			return new org.eclipse.xtext.ui.tests.editor.contentassist.ui.Bug377311TestLanguageUiModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
}