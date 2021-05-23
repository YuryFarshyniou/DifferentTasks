package examples.by.yurachel.blinov.users_tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

import java.io.IOException;

public class HelloTag extends TagSupport {
    private String role;

    public HelloTag(String role) {
        this.role = role;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            String to = null;
            if ("admin".equalsIgnoreCase(role)) {
                to = "Hello, " + role;
            } else {
                to = "Welcome, " + role;
            }
            pageContext.getOut().write("<hr/>" + to + "<hr/>");
        } catch (IOException e) {
            throw new JspException(e.getMessage());
        }
        return SKIP_BODY;
    }
}
