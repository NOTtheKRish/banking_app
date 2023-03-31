package app_main.views;
import javax.swing.*;
import app_main.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.*;

public class Dashboard{
    LoginController user;
    String name,accountType;
    double balance = 0;
    JFrame frame;
    JButton transaction,pinchange,accBeneficiary,neft,checkBalance,logout;
    JLabel titleLabel,userLabel,accountTypeLabel,balanceLabel;
    JPanel backpan,sidePanel;
    Dashboard(LoginController u){
        this.user = u;
        name = new String();
        accountType = new String();
        // try {
        //     getAccountDetails();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        frame = new JFrame("Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        frame.setVisible(true);

        titleLabel = new JLabel("DASHBOARD");
        titleLabel.setFont(new Font(null,Font.BOLD,25));
        titleLabel.setBounds(330,30,200,50);

        transaction = new JButton("Transactions");
        transaction.setBounds(110,120,200,30);
        transaction.addActionListener(e -> {
            // frame.dispose();
            // new Transactions();
            getTransactions();
            new TransactionHistory();
        });
         
        pinchange=new JButton("Change Password");
        pinchange.setBounds(110,170,200,30);
        pinchange.addActionListener(e -> {
            frame.dispose();
            new PinChange(user);
            // new PinChange();
        });
        
        accBeneficiary=new JButton("Account Beneficiary");
        accBeneficiary.setBounds(110,220,200,30);
        accBeneficiary.addActionListener(e -> {
            frame.dispose();
            new Beneficiary();
        });
        
        neft=new JButton("NEFT");
        neft.setBounds(110,270,200,30);
        neft.addActionListener(e -> {
            frame.dispose();
            new NEFT();
        });
        
        checkBalance = new JButton("Check Balance");
        checkBalance.setBounds(110, 320, 200, 30);
        checkBalance.addActionListener(e -> {
            getAccountBalance();
        });
        
        logout=new JButton("Log Out");
        logout.setBounds(110,370,200,30);
        logout.addActionListener(e -> {
            frame.dispose();
            new LoginController().logout();
        });

        backpan = new JPanel();
        backpan.setBounds(70,90,275,330);
        
        sidePanel = new JPanel();
        sidePanel.setBounds(430,90,275,50);

        // userLabel = new JLabel("Welcome!");
        // userLabel.setBounds(90, 0, 200, 30);

        // accountTypeLabel = new JLabel("Account Type : "+accountType);
        // accountTypeLabel.setBounds(90, 40, 200, 30);

        balanceLabel = new JLabel("");
        balanceLabel.setBounds(300, 120, 200, 30);

        // sidePanel.add(userLabel);
        // sidePanel.add(accountTypeLabel);
        sidePanel.add(balanceLabel);


        frame.add(transaction);
        frame.add(pinchange);
        frame.add(accBeneficiary);
        frame.add(checkBalance);
        frame.add(logout);
        frame.add(neft);
        frame.add(backpan);
        frame.add(sidePanel);
        
        frame.getContentPane().setBackground(Color.pink);
        frame.setLayout(null);
        frame.add(titleLabel);
    }

    public void getAccountBalance(){
        System.out.println("getAccountBalance()");
        int userId = user.getUserId();
        double accB = new AccountController().getBalance(userId);
        this.balance = accB;
        balanceLabel.setText("Account Balance : Rs."+this.balance);
    }
    public void getTransactions(){
        System.out.println("getTransactions()");
        int userId = user.getUserId();
        // double accB = new AccountController().getTransactions(userId);
        new AccountController().getTransactions(userId);
    }
}
