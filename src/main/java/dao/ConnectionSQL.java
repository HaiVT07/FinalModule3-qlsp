package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionSQL {
    public static Connection getConnection(){
        try {
            String url = "jdbc:mysql://localhost:3306/quanlysanpham";
            String user = "root";
            String password = "123456789";

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
