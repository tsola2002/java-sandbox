package com.tsola2002.ch06_database;

import java.sql.*;
import java.util.Properties;

import static java.sql.DriverManager.getConnection;

public class Crud {

    static Connection conn;

    public static void main(String[] args) {
      driverManager();
      // insertValues();
      //  updateUser(1, "Terry", "Bogard", "1980-01-10");
        deleteUser(1);
      String allUsers = selectAllUsers();
      System.out.println(allUsers);

    }


    private static String selectAllUsers() {
        StringBuilder result = new StringBuilder();
        //Connection conn = driverManager();
        try (Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("SELECT * FROM user");

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


    private static void driverManager() {
        String URL = "jdbc:mysql://localhost/person"; // make sure 'person' has your correct 'users' table
        Properties prop = new Properties();
        prop.put("user", "root");
        //Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, prop);
            System.out.println("Successfully Connected to Database");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //return conn;
    }


    private static void insertValues() {
        try {
            String details = "INSERT INTO user (id, first_name, last_name, dob)VALUES (?,?,?,?)";
            PreparedStatement executer = conn.prepareStatement(details);
            executer.setInt(1, 1);
            executer.setString(2, "chuks");
            executer.setString(3, "daniels");
            executer.setString(4, "1990-07-21");
            int rowInserted = executer.executeUpdate();
            System.out.println(executer + "ROWS INSERTED SUCCESSFULLY");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void updateUser(int id, String firstName, String lastName, String dob) {
        String sql = "UPDATE user SET first_name = ?, last_name = ?, dob = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, dob);
            stmt.setInt(4, id);
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("User with ID " + id + " updated successfully.");
            } else {
                System.out.println("No user found with ID " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteUser(int id) {
        String sql = "DELETE FROM user WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("User with ID " + id + " deleted successfully.");
            } else {
                System.out.println("No user found with ID " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
