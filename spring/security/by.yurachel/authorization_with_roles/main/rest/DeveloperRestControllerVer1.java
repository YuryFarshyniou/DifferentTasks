package rest;

import model.Developer2;
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
    private List<Developer2> developer2s = Stream.of(
            new Developer2(1L, "Ivan", "Ivanov"),
            new Developer2(2L, "Yurachel", "Zyzz"),
            new Developer2(3L, "Marsy", "Cat")
    ).collect(Collectors.toList());

    @GetMapping
    public List<Developer2> getAll() {
        return developer2s;
    }

    @GetMapping("/{id}")
    public Developer2 getById(@PathVariable Long id) {
        return developer2s.stream().filter(
                developer -> developer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Developer2 create(Developer2 developer2) {
        this.developer2s.add(developer2);
        return developer2;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        this.developer2s.removeIf(developer -> developer.getId().equals(id));
    }

}
