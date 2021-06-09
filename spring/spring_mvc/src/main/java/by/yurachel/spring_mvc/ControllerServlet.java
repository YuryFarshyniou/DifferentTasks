package by.yurachel.spring_mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerServlet {

    @GetMapping(value = "/hello-world")//URL в строке браузера.
    public String sayHello() {
        return "hello"; // Возвращает html страницу
    }
}
