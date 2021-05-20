package examples.by.yurachel.blinov.sessions_events_filters.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;

import java.io.IOException;

/*Изменяет кодировку запроса и ответа на кодировку,заданную параметром фильтра.
* */

/*Для использования фильтра для всех сервлетов и JSP используется шаблон
"/*", только для JSP — "*.jsp", для каталога — "/jsp/admin/*", для конкретной
jsp — "/index.jsp", для сервлета — "/controller".*/
@WebFilter(urlPatterns = {"/*"}, initParams = {
        @WebInitParam(name = "encoding", value = "UTF-8", description = "Encoding Param")
})
public class EncodingFilter implements Filter {
    private String code;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        code = filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String codeRequest = request.getCharacterEncoding();
        //Установка кодировки из параметров фильтра,если не установлена.
        if (code != null && !code.equalsIgnoreCase(codeRequest)) {
            request.setCharacterEncoding(code);
            response.setCharacterEncoding(code);
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        code = null;
    }
}
