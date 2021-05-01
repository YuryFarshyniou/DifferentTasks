package examples.by.yurachel.jdbc.ex_1_blinov.main;

import examples.by.yurachel.jdbc.ex_1_blinov.dao.ConnectorDB;
import examples.by.yurachel.jdbc.ex_1_blinov.entity.Abonent;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (Connection con = ConnectorDB.getConnection(); // Устанавливаем соединение с базой данных.
             Statement statement = con.createStatement(); // Объект Statement используется для выполнения запросов.
             // Используется для выполнения SQL-запроса без его предварительной подготовки.

             ResultSet rs = statement.executeQuery("SELECT * from phonebook")) { //Метод executeQuery, один из методов для выполнение
            //запроса SQL. Результаты выполнение запроса помещаются в ResultSet.Для добавления  или изменения информации в таблице запрос
            // помещается в метод executeUpdate.

            /* Обработка результатов выполнения запроса производится методами интер-
             фейса ResultSet, где самыми распространенными являются next(), first(), previous(),
             last() для навигации по строками таблицы результатов и группа методов по до-
             ступу к информации вида getString(int pos), а также аналогичные методы, на-
             чинающиеся с getТип(int pos) (getInt(int pos), getFloat(int pos) и др.) и updateТип().
             Среди них следует выделить методы getClob(int pos) и getBlob(int pos), позво-
              ляющие извлекать из полей таблицы специфические объекты (Character Large
              Object, Binary Large Object), которые могут быть, например, графическими или
              архивными файлами.
            * */

            List<Abonent> list = new ArrayList<>();
            while (rs.next()) { // При первом вызове метода next() указатель перемещается на таблицу результатов выборки в позицию первой
                // строки таблицы ответа.Когда строки закончаться,метод возвратит false.

                int id = rs.getInt(1); //Позволяет извлекать значения поля по названию поля,либо по индексу колонки.
                int phone = rs.getInt(3);
                String name = rs.getString(2);
                list.add(new Abonent(id, phone, name));
            }
            if (list.size() > 0) {
                System.out.println(list);
            } else {
                System.out.println("error");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
