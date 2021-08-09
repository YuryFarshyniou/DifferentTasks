package by.yurachel.springSecurityDemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/hello")
    public Entity exampleList() {
        Entity e = new Entity();
        e.setId(1);
        e.setContent("Hello");
        return e;
    }

}
