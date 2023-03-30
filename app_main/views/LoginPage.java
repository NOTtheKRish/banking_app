package app_main.views;
import app_main.LoginController;

// Factory Packages
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener {
    public JLabel WelcomeLabel,UsernameLabel,PassLabel,ResponseLabel;
    public JTextField UsernameField;
    public JPasswordField PassField;
    public JButton LoginBtn;

    public LoginPage(){
        JFrame frame = new JFrame("Banking Application");
        
        WelcomeLabel = new JLabel("Banking Application");
        WelcomeLabel.setBounds(230,30,700,100);
        WelcomeLabel.setFont(new Font("Serif",Font.BOLD,20));
        
        UsernameLabel = new JLabel("Username");
        UsernameLabel.setBounds(325,183,130,10);
        UsernameLabel.setFont(new Font("Serif",Font.BOLD,12));
        
        PassLabel = new JLabel("Password");
        PassLabel.setBounds(325,236,130,10);
        PassLabel.setFont(new Font("Serif",Font.BOLD,12));

        ResponseLabel = new JLabel("Response Comes Here!");
        ResponseLabel.setBounds(337,400,700,25);

        LoginBtn = new JButton("Login");
        LoginBtn.setBounds(337,300,100,25);
        LoginBtn.addActionListener(this);

        UsernameField = new JTextField();
        UsernameField.setBounds(325,200,130,20);
        
        PassField = new JPasswordField();
        PassField.setBounds(325,250,130,20);
        
        frame.add(WelcomeLabel);
        frame.add(UsernameLabel);
        frame.add(UsernameField);
        frame.add(PassLabel);
        frame.add(PassField);
        frame.add(LoginBtn);
        frame.add(ResponseLabel);

        frame.setSize(800,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String message = new String();
        String username = UsernameField.getText();
        String password = String.valueOf(PassField.getPassword());
        if(username.isEmpty()){
            // username field is empty
            message = "Username is Required!";
            ResponseLabel.setText(message);
        }else if(password.isEmpty()){
            // password field is empty
            message = "Password is Required!";
            ResponseLabel.setText(message);
        }else{
            // all data filled
            message = new LoginController().initLogin(username, password);
            ResponseLabel.setText(message);
            if(message.equals("Login Success!")){
                try{
                    Thread.sleep(1000);
                    // move to dashboard
                }catch(Exception Ex){
                    System.out.println("Exception : "+Ex);
                }
            }
        }
    }
}
