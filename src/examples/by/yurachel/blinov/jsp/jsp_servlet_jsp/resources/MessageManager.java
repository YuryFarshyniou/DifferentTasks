package examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.resources;

import java.util.ResourceBundle;

/* Служебный класс,извлекающий информацию из properties-файлов необходимую для
* функционирования приложения информацию.*/
public class MessageManager {
    private static final ResourceBundle resourceBundle =
            ResourceBundle.getBundle("resources.messages");

    //Класс Извлекает информацию из файла messages.properties.
    private MessageManager() {
    }

    public static String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}
/* messages.properties content:
###############################
## Messages ##
###############################
message.loginError = Incorrect login or password.
message.nullPage = Page not found. Business logic error.
message.wrongAction = : command not found or wrong!
* */