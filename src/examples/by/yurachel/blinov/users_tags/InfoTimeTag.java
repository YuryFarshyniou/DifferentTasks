package examples.by.yurachel.blinov.users_tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Locale;


/* Класс TagSupport берем из директории tomcat lib : jsp-api.
Для создания тега без атрибутов или тела достаточно переопределить метод doStartTag().
* */

public class InfoTimeTag extends TagSupport {

    /*doStartTag определяет код,который вызывает во время запроса,если обнаруживает начальный элемент тэга.Если в определении
    * тега отсутствует тело,метод должен возвратить константу SKIP_BODY.*/
    @Override
    public int doStartTag() throws JspException {
        GregorianCalendar gc = new GregorianCalendar();
        String time = "<hr/>Time : <b> " + gc.getTime() + " </b><hr/>";
        String locale = " Locale : <b> " + Locale.getDefault() + " </b><hr/>";
        try {
            JspWriter out = pageContext.getOut(); //метод getOut() возвращает ссылку на поток JspWriter,с помощью которого осуществляется вывод.
            out.write(time + locale);// Генерирует вывод,который выводит на страницу содержимое параметра.
        } catch (IOException e) {
            throw new JspException(e.getMessage());
        }
        /*Возвращение SKIP_PAGE приведет к вызову метода doEndTag()*/
        return SKIP_BODY;
    }

    /*Метод doEndTag() вызывается один раз,когда обработанны все остальные методы.По умолчанию возвращает значение
    * EVAL_PAGE,разрешающее дальнейшую обработку страницы.*/
    @Override
    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }
}
