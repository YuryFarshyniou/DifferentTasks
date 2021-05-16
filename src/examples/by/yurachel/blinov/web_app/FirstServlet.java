package examples.by.yurachel.blinov.web_app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet( value ="FirstServletTest")
public class FirstServlet extends HttpServlet {

    public FirstServlet() {
        super();
    }

    public void init() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().print("This is " + this.getClass().getName()
                + ", using the GET Method");
    }

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().print("This is " + this.getClass().getName()
                + ", using the POST Method");
    }

    public void destroy(){
        super.destroy(); // Just puts "destroy" string in log.
    }

}
