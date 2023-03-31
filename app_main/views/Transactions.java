package app_main.views;

import javax.swing.*;
import java.awt.*;

public class Transactions{
    JTable tTable;
    Transactions(){
        JFrame frme = new JFrame("Transactions");
        frme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frme.setSize(700,500);

        JLabel trns = new JLabel("TRANSACTIONS");
        trns.setFont(new Font(null,Font.BOLD,20));
        trns.setBounds(260,30,190,20);

        String column[]={"Transaction ID","Name","Amount","Date","Mode of transfer"};
        String data[][]={
            {"1002","Rishi","1000","19-2-2004","UPI"},
            {"1002","Rishi","1000","19-2-2004","UPI"},
        };
        // String data[][]=new String[10][10];
        
        tTable=new JTable(data,column);
        // tTable.setBounds(80,80,500,500);
        tTable.setBounds(80,80,500,500);
        tTable.setBackground(Color.ORANGE);
        // JScrollPane sp = new JScrollPane(tTable);
        // sp.setVisible(true);

        // j = new JTable(data, columnNames);
        // j.setBounds(30, 40, 200, 300);
 
        // // adding it to JScrollPane
        // JScrollPane sp = new JScrollPane(j);
        // f.add(sp);

        frme.setVisible(true);
        frme.getContentPane().setBackground(Color.pink);
        frme.add(trns);
        frme.add(tTable);
        // frme.add(sp); // transaction table along with scroll pane
        frme.setLayout(null);
    }

    public static void main(String[] args){
        new Transactions();
    }
}
