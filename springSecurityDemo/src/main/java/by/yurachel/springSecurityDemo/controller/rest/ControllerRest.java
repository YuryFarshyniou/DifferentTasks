package by.yurachel.springSecurityDemo.controller.rest;

import by.yurachel.springSecurityDemo.entity.Entity;
import by.yurachel.springSecurityDemo.service.EntityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/entity")
public class ControllerRest {

    private final EntityService entityService;

    public ControllerRest(EntityService entityService) {
        this.entityService = entityService;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping()
    public List<Entity> exampleList() {
        return entityService.getEntityList();
    }

    @DeleteMapping("/{id}")
    public void deleteEntity(@PathVariable int id) {

        entityService.deleteEntity(id);
    }


}
