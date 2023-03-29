package app_main;
import java.awt.List;
import java.sql.*;
import java.util.HashMap;

public class Login {
    public String initLogin(String username, String password){
        try{
            String result = new String();
            Connection conn = new MySQLConnection().getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ?");
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            // System.out.println("ResultSet generated!");
            if(!rs.next()){
                // ResultSet is Empty!
                // P.S: Account Doesn't Exists
                result = "Account Doesn't Exists";
            }else{
                // ResultSet is not Empty!
                do{
                    if(rs.getString("username").equals(username) && rs.getString("password").equals(password)){
                        // login credentials are correct
                        result = "Login Success!";
                    }else if(rs.getString("username").equals(username) && !(rs.getString("password").equals(password))){
                        // invalid password entered
                        result = "Invalid Password!";
                    }
                    // System.out.println("Result : "+result);
                }while(rs.next());
            }
            return result;
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        return "Something Went Wrong! Try Again";
    }
}
