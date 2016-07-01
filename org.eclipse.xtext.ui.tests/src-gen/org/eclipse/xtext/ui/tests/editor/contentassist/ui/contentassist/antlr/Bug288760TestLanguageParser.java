/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug288760TestLanguageGrammarAccess;

public class Bug288760TestLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private Bug288760TestLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug288760TestLanguageParser createParser() {
		org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug288760TestLanguageParser result = new org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug288760TestLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getWorkflowElementAccess().getAlternatives(), "rule__WorkflowElement__Alternatives");
					put(grammarAccess.getWorkflowElementAccess().getGroup_0(), "rule__WorkflowElement__Group_0__0");
					put(grammarAccess.getWorkflowElementAccess().getGroup_1(), "rule__WorkflowElement__Group_1__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getWorkflowElementAccess().getNameAssignment_0_0(), "rule__WorkflowElement__NameAssignment_0_0");
					put(grammarAccess.getWorkflowElementAccess().getAttributesAssignment_0_1(), "rule__WorkflowElement__AttributesAssignment_0_1");
					put(grammarAccess.getWorkflowElementAccess().getNameAssignment_1_0(), "rule__WorkflowElement__NameAssignment_1_0");
					put(grammarAccess.getWorkflowElementAccess().getAttributesAssignment_1_1(), "rule__WorkflowElement__AttributesAssignment_1_1");
					put(grammarAccess.getWorkflowElementAccess().getChildrenAssignment_1_3(), "rule__WorkflowElement__ChildrenAssignment_1_3");
					put(grammarAccess.getWorkflowElementAccess().getEndAssignment_1_4(), "rule__WorkflowElement__EndAssignment_1_4");
					put(grammarAccess.getAttributeAccess().getNameAssignment_0(), "rule__Attribute__NameAssignment_0");
					put(grammarAccess.getAttributeAccess().getValueAssignment_2(), "rule__Attribute__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug288760TestLanguageParser typedParser = (org.eclipse.xtext.ui.tests.editor.contentassist.ui.contentassist.antlr.internal.InternalBug288760TestLanguageParser) parser;
			typedParser.entryRuleWorkflowElement();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT" };
	}
	
	public Bug288760TestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(Bug288760TestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}