package app_main;
import java.sql.*;

public class MySQLConnection{
    public static String dbName = "banking_app";
    public static String dbUser = "root";
    public static String dbPass = "";

    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName, dbUser, dbPass);
            return conn;
        }catch(Exception e){
            System.out.println("DB Connection Exception : "+e);
        }
        return null;
    }
}