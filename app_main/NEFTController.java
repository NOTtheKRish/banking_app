package app_main;
import java.sql.*;

public class NEFTController {
    public String add(String account_type, String account_no, String ifsc_code,double amount, String remarks){
        try{
            String result = new String();
            int userId = new LoginController().getUserId();
            Connection conn = new MySQLConnection().getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO transactions (user_id,account_type,account_no,ifsc_code,amount,remarks) VALUES (?,?,?,?,?,?)");
            stmt.setInt(1, userId);
            stmt.setString(2, account_type);
            stmt.setString(3, account_no);
            stmt.setString(4, ifsc_code);
            stmt.setDouble(5, amount);
            stmt.setString(6, remarks);
            int rs = stmt.executeUpdate();
            
            if(rs != 0){
                result = "NEFT Transaction Successful!";
            }else{
                result = "Something Went Wrong! Try Again!";
            }
            return result;
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        return "Something Went Wrong! Try Again";
    }
}
