package examples.by.yurachel.blinov.users_tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspTagException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.BodyContent;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

import java.io.IOException;
import java.util.regex.Pattern;

public class MailTag extends BodyTagSupport {
    private static final String MAIL_PATTERN = "(\\w{6,})@(\\w+\\.)(\\w{2,4})";

    @Override
    public int doAfterBody() throws JspException {
        BodyContent content = this.getBodyContent();
        String body = content.getString();
        String res = null;
        if (Pattern.matches(MAIL_PATTERN, body)) {
            res = body.replaceAll("\\.", "(dot)");
            res = res.replaceFirst("@", "(a)");
        } else {
            res = body + " is invalid e-mail";
        }
        JspWriter out = content.getEnclosingWriter();
        try {
            out.write(res);
        } catch (IOException e) {
            throw new JspTagException(e.getMessage());
        }
        return SKIP_BODY;
    }
}
