package examples.by.yurachel.blinov.users_tags.tag_with_body;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspTagException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

import java.io.IOException;
import java.util.Locale;

public class RevenueTableTag extends TagSupport {
    private String head;
    private int rows;

    public void setHead(String head) {
        this.head = head;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.write("<table border='1'><colgroup span='2'> title='title' />");
            out.write("<caption>" + Locale.getDefault().getDisplayCountry() + "<caption>");
            out.write("<thead><tr><th scope='col'" + head + "</th></tr></thead>");
            out.write("<tbody><tr><td>");
        } catch (IOException e) {
            throw new JspTagException(e.getMessage());
        }
        return EVAL_BODY_INCLUDE; // Следует использовать при необходимости включения в поток вывода тела тега.
    }

    @Override
    public int doAfterBody() throws JspException {
        if (rows-- > 1) {
            try {
                pageContext.getOut().write("</td></tr><tr><td");
            } catch (IOException e) {
                throw new JspTagException(e.getMessage());
            }
            return EVAL_BODY_AGAIN; // Метод будет вызван еще раз после вывода в поток тела тега.
        } else {
            return SKIP_BODY;
        }
    }

    @Override
    public int doEndTag() throws JspException {
        try {
            pageContext.getOut().write("</td></tr></tbody><table");
        } catch (IOException e) {
            throw new JspTagException(e.getMessage());
        }
        return EVAL_PAGE;
    }
}
