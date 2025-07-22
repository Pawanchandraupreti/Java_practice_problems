package Ques_21_to_30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Simple database query (requires MySQL JDBC driver)

public class ques29 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "username";
        String password = "password";
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM users")) {
            
            while (rs.next()) {
                System.out.println(rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
