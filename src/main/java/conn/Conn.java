package conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
    private static String DB_URL = "jdbc:mysql://localhost:3306/db_quanlinhankhau";
    private static String USER_NAME = "root";
    private static String PASSWORD = "root";


    public static Connection getConnection(String dbURL, String userName,
                                           String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
           conn=Conn.getConnection(DB_URL,USER_NAME,PASSWORD);
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        System.out.println("connected");
        return conn;
    }


}
