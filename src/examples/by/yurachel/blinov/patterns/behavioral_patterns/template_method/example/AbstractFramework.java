package examples.by.yurachel.blinov.patterns.behavioral_patterns.template_method.example;

import examples.by.yurachel.blinov.patterns.creational_patterns.builder.example.User;

/*Шаблон Template Method применим в случаях, если:
——существует общее для всех подклассов поведение, но оно может быть раз-
делено на фрагменты и помещено в суперкласс;
——каркас алгоритма однократно задан жестко, а конкретное изменяемое пове-
дение возложено на подклассы.*/
public abstract class AbstractFramework {
    public AbstractFramework() {
    }

    //Методы,задающие контракт для подклассов.
    protected abstract boolean check(User user);

    protected abstract ListPermission getAvailablePermissions();

    public void templateMethodLogin(User user) { // template method.
        int count = 0;
        //Вызов переопределенных в подклассах методов.
        while (!check(user)) {
            if (++count == 3) {
                System.out.println("access denied for" + user);
                return;
            }
        }
        //Получение списка прав (List) , доступных данному пользователю
        ListPermission list = getAvailablePermissions();
    }

}
