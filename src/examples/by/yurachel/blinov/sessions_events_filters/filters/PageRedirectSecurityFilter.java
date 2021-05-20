package examples.by.yurachel.blinov.sessions_events_filters.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/* Фильтры применяются для обеспечения безопасности приложения, а имен-
но, легко решают задачу запрещения несанкционированного прямого обраще-
ния к JSP. Следствием установки шаблона urlPatterns в значение "/jsp/*" будет
вызов фильтра при любом прямом обращении из строки браузера. Фильтр
в итоге перенаправит вызов на указанную страницу.*/

@WebFilter(urlPatterns = {"/jsp/*"},
        initParams = {@WebInitParam(name = "INDEX_PATH", value = "/index.jsp")})
public class PageRedirectSecurityFilter implements Filter {
    private String indexPath;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        indexPath = filterConfig.getInitParameter("INDEX_PATH");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        //Переход на заданную страницу.
        resp.sendRedirect(req.getContextPath() + indexPath);
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
