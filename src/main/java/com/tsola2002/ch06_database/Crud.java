package com.tsola2002.ch06_database;

import java.sql.*;
import java.util.Properties;

import static java.sql.DriverManager.getConnection;

public class Crud {
    public static void main(String[] args) {

        System.out.println(selectAllUsers());
    }


    private static String selectAllUsers() {
        StringBuilder result = new StringBuilder();
        Connection conn = driverManager();
        try (conn; Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("SELECT * FROM users");

            // Get column count and names dynamically
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Print column headers
            for (int i = 1; i <= columnCount; i++) {
                result.append(metaData.getColumnName(i)).append("\t");
            }
            result.append("\n----------------------------------------\n");

            // Print each row
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    result.append(rs.getString(i)).append("\t");
                }
                result.append("\n");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result.toString();
    }



    private static Connection driverManager() {
        String URL = "jdbc:mysql://localhost/person"; // make sure 'person' has your correct 'users' table
        Properties prop = new Properties();
        prop.put("user", "root");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, prop);
            System.out.println("Successfully Connected to Database");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
}
