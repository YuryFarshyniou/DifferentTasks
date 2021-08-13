package by.yurachel.springSecurityDemo.service;

import by.yurachel.springSecurityDemo.entity.Entity;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EntityService {
    private List<Entity> entityList = new ArrayList<>(Arrays.asList(
            new Entity(1, "Yura"),
            new Entity(2, "Dima"),
            new Entity(3, "Kent")));

//    @PostConstruct
//    public void initList() {
//        entityList =
//        );
//    }

    public List<Entity> getEntityList() {
        return entityList;
    }

    public void setEntityList(List<Entity> entityList) {
        this.entityList = entityList;
    }

    public Entity findEntityById(int id) {
        return entityList.stream().filter(entity -> entity.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void deleteEntity(int id) {
        System.out.println(entityList);
        entityList.removeIf(entity -> entity.getId() == id);
    }

    public void addEntity(Entity entity) {
        entityList.add(entity);
    }
}
