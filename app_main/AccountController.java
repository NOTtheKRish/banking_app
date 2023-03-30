package app_main;
import java.sql.*;

public class AccountController {
    public String updatePassword(String username, String password){
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
                int userId = 0;
                do{
                    userId = rs.getInt("id");
                }while(rs.next());
                try{
                    PreparedStatement pS = conn.prepareStatement("UPDATE users SET password = ? WHERE ID = ?");
                    pS.setString(1, password);
                    pS.setInt(2, userId);
                }catch(Exception eX){
                    System.out.println("Exception : "+eX);
                }

                result = "Account Password Updated!";
            }
            return result;
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        return "Something Went Wrong! Try Again";
    }
}
