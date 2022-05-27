package database;

//import models.PinkPlannr;
//import utils.ApplicationProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDatabase {
    private String url = "jdbc:sqlserver://DESKTOP-NNM76RJ\\sqlexpress;databaseName=PinkPlannr;integratedSecurity=true";
    private Connection conn;

    UserDatabase() throws SQLException {
        System.out.println("Connecting to project database...");
        conn = DriverManager.getConnection(url);
        System.out.println("Successfully connected!");
    }

    public void CloseConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public String ShowUsers() {
        String query1 = "SELECT TOP 5 * FROM user_Basic";
        Statement stmt;
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            while (rs.next()) {
                String userFmt = String.format("%d, %s %s %s %s",
                        rs.getInt("userId"), rs.getString("firstName"),
                        rs.getString("lastName"), rs.getString("userName"), rs.getString("email"));
                System.out.println(userFmt);
            }
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return query1;
    }
}
