package examples.by.yurachel.blinov.jsp.jsp_servlet_jsp;

/*Класс выполняет проверку правильности введенных логина и пароля с помощью запроса в БД,
но для демонстрации простой логики работы приложения используется "заглушка" - логин и пароль
хранятся в константах числа,чего никогда не следует делать в реальном проекте.
* */
public class LoginLogic {
    private final static String ADMIN_LOGIN = "admin";
    private final static String ADMIN_PASS = "pass";

    public static boolean checkLogin(String enterLogin, String enterPass) {
        return ADMIN_LOGIN.equals(enterLogin) &&
                ADMIN_PASS.equals(enterPass);
    }
}
