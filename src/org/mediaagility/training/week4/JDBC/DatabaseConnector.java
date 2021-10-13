package org.mediaagility.training.week4.JDBC;

import java.sql.*;

public class DatabaseConnector {
    private static DatabaseConnector databaseConnector;
    private static Connection conn;
    private DatabaseConnector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world",
                    "root", "root");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static DatabaseConnector getInstance(){
        if(databaseConnector == null)
            databaseConnector = new DatabaseConnector();
        return databaseConnector;
    }

    public static Connection getConnector(){
        return conn;
    }

//    public static ResultSet executeQuery(String query) throws SQLException {
//        return stmt.executeQuery(query);
//    }

    /*public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world",
                "root", "root")){
            String query = "select * from city";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()) {
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "
                        +rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }*/
}
