package qimoxiangmu;

import java.sql.SQLException;

public class testrun {
    public static void main(String[] args) throws SQLException {
        new del_book().setVisible(true);
        database_conext.closeConnection();
    }
}
