package by.yurachel.rest.controllers;

import by.yurachel.rest.dao.PersonDao;
import by.yurachel.rest.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PersonDao personDao;

    @Autowired
    public PeopleController(PersonDao personDao) {
        this.personDao = personDao;
    }


    @GetMapping()
    public String list(Model model) {
        model.addAttribute("list", personDao.index());
        //Получим всех людей из дао  и передадим на отображение в представление.
        return "people/list";
    }

    @GetMapping("/{id}")/*//Означает,что во время запуска приложения сюда можно будет поместить любое число,и это число поместить в аргументы
     этого метода с помощью аннотации @PathVariable,мы извлечем этот id из url,из адреса,и получим к нему доступ внутри этого метода.*/
    public String show(@PathVariable("id") int id, Model model) {
//Получим одного человека по его id из дао и передадим этого человека на отображение в представление.
        model.addAttribute("person", personDao.show(id));

        return "people/show";
    }

    @GetMapping("/new")
    public String newPerson(Model model) {
        model.addAttribute("person", new Person());
        return "people/new";
    }

    @PostMapping
    public String create(@ModelAttribute("person") Person person) {
        personDao.save(person);
        return "redirect:/people";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("person", personDao.show(id));
        return "people/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("person") Person person,
                         @PathVariable("id") int id) {
        personDao.update(id, person);
        return "redirect:/people";
    }


}
