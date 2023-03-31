package app_main.views;
import java.awt.*;
import javax.swing.*;

import app_main.AccountController;
import app_main.LoginController;

public class PinChange {
    LoginController user;
    JFrame frme;
    PinChange(LoginController u){
    // PinChange(){
        this.user = u;
        frme=new JFrame("Pin Change");
        frme.setSize(500,400);

        JLabel plab=new JLabel("Change Password");
        plab.setFont(new Font(null,Font.BOLD,20));
        plab.setBounds(130,10,250,100);

        JLabel newpass=new JLabel("New Password : ");
        newpass.setBounds(65,150,170,20);

        JLabel confpass=new JLabel("Confirm Password : ");
        confpass.setBounds(65,210,170,20);

        JTextField newptxt = new JTextField();
        newptxt.setBounds(250,150,120,20);

        JTextField confptxt = new JTextField();
        confptxt.setBounds(250,210,120,20);

        JLabel response = new JLabel("");
        response.setBounds(170,250,200,20);
        
        JButton backBtn = new JButton("Back");
        backBtn.setBounds(170,320,150,30);
        backBtn.addActionListener(e -> {
            frme.dispose();
            new Dashboard(user);
        });

        JButton chgebut=new JButton("Make Changes");
        chgebut.setBounds(170,270,150,30);
        chgebut.addActionListener(e -> {
            if(newptxt.getText().equals(confptxt.getText())){
                String username = user.getUsername();
                String resp = new AccountController().updatePassword(username, newptxt.getText());
                response.setText(resp);
            }
        });

        frme.getContentPane().setBackground(Color.pink);
        frme.setVisible(true);
        frme.setLayout(null);

        frme.add(plab);
        frme.add(newpass);
        frme.add(confpass);
        frme.add(newptxt);
        frme.add(confptxt);
        frme.add(chgebut);
        frme.add(backBtn);
        frme.add(response);

        
    }

    // public static void main(String[] args){
    //     new PinChange();
    // }
}
