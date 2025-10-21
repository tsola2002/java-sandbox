package com.tsola2002.ch06_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connect {

    public static void main(String[] args) {
        driverManager();
    }

    private static void driverManager(){
        // CREATING OUR DATABASE HOST URL
        String URL = "jdbc:mysql://localhost/person";
        // CREATING OUR PROPERTIES
        Properties prop = new Properties();
        prop.put("user", "root");
        //prop.put( "password", "" );
        try {
            Connection conn = DriverManager.getConnection(URL, prop);
            System.out.println("Successfully Connected to Database");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
