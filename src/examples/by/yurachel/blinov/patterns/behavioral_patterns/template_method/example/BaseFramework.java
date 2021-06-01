package examples.by.yurachel.blinov.patterns.behavioral_patterns.template_method.example;

import examples.by.yurachel.blinov.patterns.creational_patterns.builder.example.User;

//Классов с конкретным поведением может быть несколько
public class BaseFramework extends AbstractFramework {
    // Конкретное поведение.
    @Override
    protected boolean check(User user) {
        System.out.println("Check user");
        return true;
    }

    @Override
    protected ListPermission getAvailablePermissions() {
        //Получение списка прав пользователя.
        System.out.println("list of user permissions.");
        return null;
    }
}
