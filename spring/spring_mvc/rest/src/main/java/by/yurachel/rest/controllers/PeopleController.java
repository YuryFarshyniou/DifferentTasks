package by.yurachel.rest.controllers;

import by.yurachel.rest.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class PeopleController {
//
//    private final PersonDao personDao;
//
//    @Autowired
//    public PeopleController(PersonDao personDao) {
//        this.personDao = personDao;
//    }

    @GetMapping()
    public String list(Model model) {
        System.out.println("Hello");
        model.addAttribute("list","Gopy sosi");
        //Получим всех людей из дао  и передадим на отображение в представление.
        return "people/list";
    }

//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") int id, Model model) {
////Получим одного человека по его id из дао и передадим этого человека на отображение в представление.
//        model.addAttribute("person", dao.show(id));
//
//        return "show";
//    }


//    public PersonDao getPersonDao() {
//        return personDao;
//    }
}
