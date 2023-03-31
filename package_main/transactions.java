package package_main;
import java.awt.Color;
import java.awt.Panel;
import java.awt.Font;

import javax.swing.*;
public class transactions {
    public static void main(String[] args){
        JFrame frme = new JFrame("Transactions");
        JLabel trns = new JLabel("TRANSACTIONS");
        frme.setSize(700,500);
        trns.setFont(new Font("Serif",Font.BOLD,20));
        trns.setBounds(260,30,190,20);
        String data[][]={{"1002","Rishi","1000","19-2-2004","UPI"}};
        String column[]={"Transaction ID","Name","Amount","Date","Mode of transfer"};
        JTable transtab=new JTable(data,column);
        transtab.setBounds(80,80,500,500);
        transtab.setBackground(Color.ORANGE);
        frme.setVisible(true);
        frme.getContentPane().setBackground(Color.pink);
        frme.add(trns);
        frme.add(transtab);
        frme.setLayout(null);
    }
}
