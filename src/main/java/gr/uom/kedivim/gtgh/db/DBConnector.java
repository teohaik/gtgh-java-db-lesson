package gr.uom.kedivim.gtgh.db;

import java.sql.*;
import java.util.Properties;

public class DBConnector {


    public static Connection getConnectionPostgress(){
        String url = "jdbc:postgresql://195.251.210.147:5533/test_db";
        Properties props = new Properties();
        props.setProperty("user","root");
        props.setProperty("password","30a301d72578dbb");
        props.setProperty("ssl","false");
        props.setProperty("schema","public");

        try {
            Connection myConnection = DriverManager.getConnection(url, props);
            return myConnection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Cannot establish Connection");
    }


    public static Connection getConnectionMariaDB(){
        String url = "jdbc:mariadb://localhost:3306/javauser";
        Properties props = new Properties();
        props.setProperty("user","javauser");
        props.setProperty("password","javauser123");

        try {
            Connection mariaDBConnection = DriverManager.getConnection(url, props);
            return mariaDBConnection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Cannot establish Connection");
    }




}
