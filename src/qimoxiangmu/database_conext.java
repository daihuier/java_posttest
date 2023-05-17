package qimoxiangmu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database_conext {
public static Connection conn=null;

   public static Connection  getConnection() throws SQLException {
       if (conn==null)
       {
           String url="jdbc:mysql://localhost:3306/lib_gui";
           String user="root";
           String mypassword="ltybyf8821";
           conn=DriverManager.getConnection(url,user,mypassword);
       }
       return conn;
   }
    public static void closeConnection() throws SQLException {
            if (conn != null) {
                conn.close(); // 关闭数据库连接
                conn = null;
    }}

}
