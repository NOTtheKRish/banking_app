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
    public static void main(String[] args){
        String response = new Login().initLogin("rishi", "rish@");
        System.out.println("Response from Login().initLogin() : "+response);
        if(response.equals("Login Success!")){
            try{
                Thread.sleep(1000);
                System.out.println("Page Moved to Dashboard");
            }catch(Exception e){
                System.out.println("Exception : "+e);
            }
        }
    }

    // public static void main(String[] args){
    //     try{
    //         Class.forName("com.mysql.jdbc.Driver");
    //         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName, dbUser, dbPass);
    //         Statement stmt = conn.createStatement();
    //         ResultSet rS = stmt.executeQuery("SELECT * FROM users");

    //         while(rS.next()){
    //             System.out.println(rS.getInt("id")+ " - "+rS.getString("name"));
    //         }
    //         conn.close();
    //     }catch(Exception e){
    //         System.out.println("Exception : "+e);
    //     }
    // }
}