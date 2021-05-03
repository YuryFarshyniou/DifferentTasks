package examples.by.yurachel.jdbc.ex_1_blinov.main;

import examples.by.yurachel.jdbc.ex_1_blinov.dao.PrepareStatementExample;
import examples.by.yurachel.jdbc.ex_1_blinov.entity.Abonent;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PreparedStatementMain {
    public static void main(String[] args) {
        List<Abonent> lists = new ArrayList<Abonent>() {
            {
                this.add(new Abonent(54, "Yurachel", 3451256));
                this.add(new Abonent(65, "Victoria", 9780674));
            }
        };

        PrepareStatementExample helper = null;
        PreparedStatement ps = null;
        try {
            helper = new PrepareStatementExample();
            ps = helper.getPreparedStatement();
            for (Abonent abonent : lists) {
                helper.insertAbonent(ps, abonent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            helper.closeStatement(ps);
        }

    }
}
