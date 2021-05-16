package examples.by.yurachel.blinov.jdbc.dao.dao_method_level;

import examples.by.yurachel.blinov.jdbc.entity.Abonent;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/* Часть методов может остаться нереализованной,кроме того,могут добавлятся собственные методы
,определить которые в более обзем класса невозможно из за узкой области применения.Реализация
на уровне метода предполагает использование соединения для выполнения единственного запроса,т.е
 соединение будет полученно из пула в начале работы метода и возвращено по его окончании,что в
 общем случае не является экономным решением.
* */

public class AbonentDAO extends AbstractDao {


    public static final String SQL_SELECT_ALL_ABONENTS = "SELECT * FROM phonebook";
    public static final String SQL_SELECT_ABONENT_BY_LASTNAME =
            "SELECT idphonebook,phone FROM phonebook WHERE lastname ?";


    @Override
    public List findALL() {
        List<Abonent> abonents = new ArrayList<>();
        try (Connection cn = ConnectionPool.getConnection();
             Statement st = cn.createStatement()) {

            ResultSet resultSet =
                    st.executeQuery(SQL_SELECT_ALL_ABONENTS);
            while (resultSet.next()) {
                Abonent abonent = new Abonent();
                abonent.setId(resultSet.getInt(1));
                abonent.setLastName(resultSet.getString(2));
                abonent.setPhone(resultSet.getInt(3));
                abonents.add(abonent);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return abonents;
    }

    @Override
    public Abonent findEntityById(Object id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Object id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Abonent entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean create(Abonent entity) {
        throw new UnsupportedOperationException();

    }

    @Override
    public Abonent update(Abonent entity) {
        throw new UnsupportedOperationException();
    }

    //Собственный метод DAO.
    public Abonent findAbonentByLastname(String name) {
        Abonent abonent = new Abonent();
        try (Connection cn = ConnectionPool.getConnection();
             PreparedStatement ps = cn.prepareStatement(SQL_SELECT_ABONENT_BY_LASTNAME)) {
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            rs.next();
            abonent.setId(rs.getInt("idphonebook"));
            abonent.setLastName(rs.getString("lastname"));
            abonent.setPhone(rs.getInt("phone"));


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return abonent;
    }
}
