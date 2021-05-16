package examples.by.yurachel.blinov.jdbc.dao.dao_class_level;

/* Реализация конкретного DAO при таком построении взаимодействия никогда в методе не
должна закрывать соединения. Соединение закрывается в той части бизнес-логики, откуда вы
поплняются обращения к DAO.
* */

import examples.by.yurachel.blinov.jdbc.entity.Abonent;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/* Соединение с базой данных инициирует конструктор DAO,либо получает его из пула.В методе
остаются возможности по созданию экземпляра Statement для выполнения запросов и его заерытию.
В данной реализации используется класс обертка для соединения ,инкапсулирующий процесс создания
соединения и упрощающий его использование.Такой подход при организации пула соединений
из экземпляров классов-оберток резко затрудняет попадание в пул диких соединений,созданных
программистом в обход пула.
*
* */


public class AbonentDAO extends AbstractDAO {
    public static final String SQL_SELECT_ALL_ABONENTS =
            "SELECT * FROM phonebook";

    public AbonentDAO() {
        this.connector = new WrapperConnector();
    }

    public List<Abonent> findAll() {
        List<Abonent> abonents = new ArrayList<>();
        Statement st = null;
        try {
            st = connector.getStatement();
            ResultSet rs = st.executeQuery(SQL_SELECT_ALL_ABONENTS);
            while (rs.next()) {
                Abonent abonent = new Abonent();
                abonent.setId(rs.getInt(1));
                abonent.setLastName(rs.getString(2));
                abonent.setPhone(rs.getInt(3));
                abonents.add(abonent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeStatement(st);
        }
        return abonents;
    }
    //Другие методы.
}
