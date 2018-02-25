package io.jenkins.plugins.analysis.core.views;

import java.nio.charset.Charset;

import edu.hm.hafner.analysis.Issues;
import io.jenkins.plugins.analysis.core.model.StaticAnalysisLabelProvider;

import hudson.model.Run;
import hudson.plugins.analysis.Messages;

/**
 * Result object to visualize the fixed issues in a build/run.
 *
 * @author Ulli Hafner
 */
public class FixedWarningsDetail extends IssuesDetail {
    /**
     * Creates a new instance of {@code FixedWarningsDetail}.
     *
     * @param owner
     *         the current run as owner of this action
     * @param fixedIssues
     *         the fixed issues to show in this tab
     * @param defaultEncoding
     *         the default encoding to be used when reading and parsing files
     * @param labelProvider
     *         the label provider
     * @param url
     *         the URL of this view
     */
    public FixedWarningsDetail(final Run<?, ?> owner, final Issues<?> fixedIssues, final Charset defaultEncoding,
            final StaticAnalysisLabelProvider labelProvider, final String url) {
        super(owner, fixedIssues, fixedIssues, NO_ISSUES, NO_ISSUES, Messages.FixedWarningsDetail_Name(), url,
                labelProvider, defaultEncoding);
    }
}
