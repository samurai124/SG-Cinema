package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String HOST = "jdbc:mysql://localhost:3306/";
    private static final int PORT = 3306;
    private static final String DATABASE = "système_gestion_cinéma";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection(){
        String url = HOST + DATABASE + "?useSSL=false&serverTimezone=UTC";
            try{
                return DriverManager.getConnection(url, USER , PASSWORD);
            } catch(SQLException e){
                System.out.println("Database connection failed: "+ e.getMessage());
                return null;
            }
    }
}
