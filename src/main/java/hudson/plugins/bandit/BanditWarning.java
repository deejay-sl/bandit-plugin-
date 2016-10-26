package hudson.plugins.bandit;

import hudson.plugins.analysis.util.model.AbstractAnnotation;
import hudson.plugins.analysis.util.model.Priority;

import org.apache.commons.lang.StringUtils;

@SuppressWarnings("PMD.CyclomaticComplexity")
public class BanditWarning extends AbstractAnnotation {
    /** Unique identifier of this class. */
    private static final long serialVersionUID = 1006L;

    /**
     * Creates a new instance of <code>Warning</code>.
     *
     * @param fileName
     *            the name of the file
     * @param start
     *            the first line of the line range
     * @param type
     *            the identifier of the warning type
     * @param category
     *            the warning category
     * @param message
     *            the message of the warning
     * @param priority
     *            the priority of the warning
     */
    public BanditWarning(final String fileName, final int start, final int end, final String type, final String category, final String message, final Priority priority) {
        super(priority, message, start, end, category, type);
        setFileName(fileName);
    }

    /** {@inheritDoc} */
    public String getToolTip() {
        return StringUtils.EMPTY;
    }
}

