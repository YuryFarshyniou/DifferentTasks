package by.yurachel.spring_mvc.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "lastName", required = false) String lastName,
                            Model model) {
//        String name = request.getParameter("name");
//        String lastName = request.getParameter(("surname"));
//        System.out.println(name + " " + lastName + " Hello");
        model.addAttribute("message", "Hello" + " " + "lastName" + " Hello");
        return "/first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "/first/goodbye";
    }
}
