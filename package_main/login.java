package package_main;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.*;

import javax.swing.JFrame;
public class login{
    public static void main(String[] args){
        JFrame frme=new JFrame("Finance Management System");
        JLabel lab=new JLabel("Welcome To Financial Management System");
        JLabel userlab=new JLabel("Username");
        JLabel passlab=new JLabel("Password");
        JButton loginbt=new JButton("Login");
        Panel back=new Panel();
        back.setBackground(Color.green);
        userlab.setBackground(Color.green);
        back.setBounds(230,150,300,200);
        loginbt.setBounds(337,300,100,25);
        JTextField userfld=new JTextField();
        JTextField passfld=new JTextField();
        frme.add(loginbt); 
        userfld.setBounds(325,200,130,20);
        passfld.setBounds(325,250,130,20);
        userlab.setBounds(325,183,130,10);
        passlab.setBounds(325,236,130,10);
        lab.setBounds(230,30,700,100);
        lab.setFont(new Font("Serif",Font.BOLD,20));
        userlab.setFont(new Font("Serif",Font.BOLD,12));
        passlab.setFont(new Font("Serif",Font.BOLD,12));
        frme.getContentPane().setBackground(Color.pink);
        frme.add(lab);
        frme.add(userfld);
        frme.add(passfld);
        frme.add(userlab);
        frme.add(passlab);
   //     frme.add(back);
        frme.setSize(800,500);
        frme.setLayout(null);
        frme.setVisible(true);
    }
}