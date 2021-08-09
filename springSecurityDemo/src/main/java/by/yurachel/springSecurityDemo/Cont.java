package by.yurachel.springSecurityDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Cont {
    @GetMapping("world")
    public String h() {
        return "/example";
    }
}
