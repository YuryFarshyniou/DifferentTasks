package examples.by.yurachel.jdbc.ex_1_blinov.dao.dao_class_level;

import java.sql.Statement;

/* Реализация на уровне класа подразумевает одного коннекта к базе данных для вызова нескольких методой
конкретного DAO класса.В этом случае вершина иерархии DAO в качестве поля может объявить сам коннет к СУБД
или его оболочку,корме стандартного набора методов.
*
* */
public abstract class AbstractDAO {

    protected WrapperConnector connector;

    // Методы добавление,удаления,замены,поиска.
    // Методы закрытия коннекти и Statement.
    public void close() {
        connector.closeConnection();

    }

    protected void closeStatement(Statement statement) {
        connector.closeStatement(statement);
    }

}
