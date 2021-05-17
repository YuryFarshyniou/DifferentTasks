package examples.by.yurachel.blinov.jsp.jsp_servlet_jsp.resources;

import java.util.ResourceBundle;

/* Служебный класс,извлекающий информацию из properties-файлов необходимую для
 * функционирования приложения информацию.*/
public class ConfigurationManager {
    private static final ResourceBundle resourceBundle =
            ResourceBundle.getBundle("resources.config");

    //Класс извлекает информацию из файла config.properties.
    private ConfigurationManager() {
    }

    public static String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}


/* config.properties content:
###############################
## Application configuration ##
###############################
path.page.index=/index.jsp
path.page.login=/jsp/login.jsp
path.page.main=/jsp/main.jsp
path.page.error=/jsp/error/error.jsp
##############################
* */