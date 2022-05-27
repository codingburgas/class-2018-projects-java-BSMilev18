package database;

//import models.PinkPlannr;
//import utils.ApplicationProperties;

import models.Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

public class ProjectDatabase {
    List<Project> listOfPlans = new ArrayList<>();
    private String url = "jdbc:sqlserver://DESKTOP-NNM76RJ\\sqlexpress;databaseName=PinkPlannr;integratedSecurity=true";
    private Connection conn;

    ProjectDatabase() throws SQLException {
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

    public void ShowPlans() {
        String query1 = "SELECT TOP 5 * FROM user_Plans";
        Statement stmt;
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            while (rs.next()) {
                String projectFmt = String.format("%d, %s %s %s",
                        rs.getInt("planListNumber"), rs.getString("exercisePlans"),
                        rs.getString("dietPlans"), rs.getString("hygienePlans"));
                System.out.println(projectFmt);
            }
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}