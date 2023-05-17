package this_test;

import org.junit.Test;
import qimoxiangmu.database_conext;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mytest { //数据库单元测试
    @Test
    public void test() {
        String sql = "select * from studen";//
        PreparedStatement stmt = null;//Statement对象，用于执行静态sqlyuju并返回其生成的结果的对象,PreparedStatement是预处理，statement子接口
        ResultSet rs = null;
        try {
            stmt = null;
            rs = null;
            stmt = database_conext.getConnection().prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("测试成功");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stmt!=null)
            {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if (rs!=null)
            {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }


        }

    }
}
