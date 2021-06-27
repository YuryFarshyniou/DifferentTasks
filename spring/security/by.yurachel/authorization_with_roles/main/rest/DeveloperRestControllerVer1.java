package rest;

import model.Developer3;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*@Controller — это обычная аннотация, которая используется для пометки класса как Spring MVC Controller,
тогда как @RestController — это специальный контроллер, используемый в веб-сервисах RESTFul, и эквивалент @Controller + @ResponseBody.
@RestController является относительно новым, добавлен только в Spring 4.0, но @Controller является старой аннотацией,
существует с тех пор, как Spring начал поддерживать аннотацию, и официально он был добавлен в версии Spring 2.5.
Аннотация @Controller указывает, что класс является «Контроллером», например, веб-контроллером,
в то время @RestController примечание @RestController указывает, что класс является контроллером,
где методы @ResponseBody по умолчанию принимают семантику @ResponseBody , то есть обслуживают REST API.
*/

/*@ResponseBody - Преобразует ответ в JSON объект.*/

@RestController
@RequestMapping("/api/v1/developers")//Best practise REST API.
public class DeveloperRestControllerVer1 {
    private List<Developer3> developer3s = Stream.of(
            new Developer3(1L, "Ivan", "Ivanov"),
            new Developer3(2L, "Yurachel", "Zyzz"),
            new Developer3(3L, "Marsy", "Cat")
    ).collect(Collectors.toList());

    @GetMapping
    public List<Developer3> getAll() {
        return developer3s;
    }

    @GetMapping("/{id}")
    public Developer3 getById(@PathVariable Long id) {
        return developer3s.stream().filter(
                developer -> developer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Developer3 create(Developer3 developer3) {
        this.developer3s.add(developer3);
        return developer3;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        this.developer3s.removeIf(developer -> developer.getId().equals(id));
    }

}
