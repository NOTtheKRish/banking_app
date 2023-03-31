package package_main;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.*;
public class dashboard{
    public static void main(String[] args){
        JFrame frme=new JFrame("Dashboard");
        frme.setSize(900,500);
        frme.setVisible(true);
        JLabel titlab=new JLabel("DASHBOARD");
        titlab.setFont(new Font("Serif",Font.BOLD,25));
        titlab.setBounds(370,30,200,50);
        JButton transction=new JButton("Transactions");
        JButton pinchge=new JButton("Pin Change");
        JButton accbenefry=new JButton("Account Beneficiary");
        JButton neft=new JButton("NEFT");
        JButton moopr=new JButton("Check Balance");
        JPanel backpan=new JPanel();
        backpan.setBounds(70,90,275,300);
        transction.setBounds(110,120,200,30);
        pinchge.setBounds(110,170,200,30);
        accbenefry.setBounds(110,220,200,30);
        neft.setBounds(110,270,200,30);
        moopr.setBounds(110,320,200,30);
        frme.getContentPane().setBackground(Color.pink);
        frme.add(transction);
        frme.add(pinchge);
        frme.add(accbenefry);
        frme.add(moopr);
        frme.add(neft);
        frme.add(backpan);
        frme.setLayout(null);
        frme.add(titlab);
    }
}