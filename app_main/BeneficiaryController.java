package app_main;
import java.sql.*;

public class BeneficiaryController {

    public String display(){
        try{
            String result = new String();
            int userId = new LoginController().getUserId();
            Connection conn = new MySQLConnection().getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM beneficiaries WHERE user_id = ?");
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            // System.out.println("ResultSet generated!");
            if(!rs.next()){
                // ResultSet is Empty!
                // P.S: No Transactions Available
                result = "No Transactions Available!";
            }else{
                // ResultSet is not Empty!
                do{
                    // userId = rs.getInt("id");
                }while(rs.next());
                result = "";
            }
            return result;
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        return "Something Went Wrong! Try Again";
    }

    public String add(String name, String account_type, String account_no, String ifsc_code, String note){
        try{
            String result = new String();
            int userId = new LoginController().getUserId();
            Connection conn = new MySQLConnection().getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO beneficiaries (user_id,name,account_type,account_no,ifsc_code,note) VALUES (?,?,?,?,?,?)");
            stmt.setInt(1, userId);
            stmt.setString(2, name);
            stmt.setString(3, account_type);
            stmt.setString(4, account_no);
            stmt.setString(5, ifsc_code);
            stmt.setString(6, note);
            int rs = stmt.executeUpdate();
            
            if(rs != 0){
                result = "New Beneficiary Added!";
            }else{
                result = "Something Went Wrong! Try Again!";
            }
            return result;
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        return "Something Went Wrong! Try Again";
    }

    public void delete(){
        
    }
}
