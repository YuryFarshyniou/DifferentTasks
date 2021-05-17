package examples.by.yurachel.blinov.jsp.jsp_servlet_jsp;

import jakarta.servlet.http.HttpServletRequest;

import java.util.HashMap;

/* Экземпляр request не должен свободно передаваться в бизнес-логику приложения во избежание некорректной
модификации,поэтому следует предварительно извлекать необходимую информацию из экземпляра-запроса и сохранять ее
в объекте класса,специально для этого предназначенном.*
* */

public class SessionRequestContent {
    private HashMap<String,Object> requestAttributes;
    private HashMap<String,String[]> requestParameters;
    private HashMap<String,Object> sessionAttributes;
    //Конструкторы.
    // Метод извлечения информации из запроса.

    public void extractValues(HttpServletRequest request){
        //реализация.
    }
    // метод добавления в запрос данных для передачи в jsp

    public void insertAttributes(HttpServletRequest request){
        //реализация.
    }

    //some methods.
}
