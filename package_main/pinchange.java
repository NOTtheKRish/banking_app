package package_main;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
public class pinchange {
    public static void main(String[] args){
        JFrame frme=new JFrame("Pin Change");
        JLabel plab=new JLabel("PIN CHANGE");
        plab.setFont(new Font("Serif",Font.BOLD,20));
        plab.setBounds(180,10,160,100);
        JLabel curpass=new JLabel("Enter your current password");
        JLabel newpass=new JLabel("Enter your new Password");
        JTextField curptxt=new JTextField();
        JTextField newptxt=new JTextField();
        JButton chgebut=new JButton("Make Changes");
        frme.setSize(500,400);
        chgebut.setBounds(170,270,150,30);
        curpass.setBounds(65,150,170,20);
        newpass.setBounds(65,210,170,20);
        curptxt.setBounds(250,150,120,20);
        newptxt.setBounds(250,210,120,20);
        frme.getContentPane().setBackground(Color.pink);
        frme.setVisible(true);
        frme.setLayout(null);
        frme.add(plab);
        frme.add(curpass);
        frme.add(newpass);
        frme.add(curptxt);
        frme.add(newptxt);
        frme.add(chgebut);
    }
}
