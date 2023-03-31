package package_main;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
public class neft {
    public static void main(String[] args){
        String option[]={"Savings","Current"};
        String option1[]={"Dummy"};
        JFrame frme=new JFrame("NEFT");
        JLabel lab=new JLabel("NEFT");
        JLabel amt=new JLabel("Amount");
        JLabel acctype=new JLabel("Account Type");
        JLabel beneficiarylst=new JLabel("Beneficiary List");
        JLabel remarks=new JLabel("Remarks");
        JTextField amttf=new JTextField();
        JTextArea remarksta=new JTextArea();
        JComboBox acctypebox=new JComboBox(option);
        JComboBox benebox=new JComboBox(option1);
        JButton pay=new JButton("Make Payment");
        pay.setBounds(150,400,170,25);
        lab.setBounds(220,30,300,20);
        amt.setBounds(130,120,300,20);
        acctype.setBounds(100,170,300,20);
        beneficiarylst.setBounds(90,220,300,20);
        remarks.setBounds(110,271,300,20);
        amttf.setBounds(230,125,100,17);
        acctypebox.setBounds(230,170,100,17);
        benebox.setBounds(230,220,100,17);
        remarksta.setBounds(230,275,200,100);
        lab.setFont(new Font("Serif",Font.BOLD,20));
        amt.setFont(new Font("Serif",Font.BOLD,17));
        acctype.setFont(new Font("Serif",Font.BOLD,17));
        beneficiarylst.setFont(new Font("Serif",Font.BOLD,17));
        remarks.setFont(new Font("Serif",Font.BOLD,17));
        frme.setSize(500,500);
        frme.add(lab);
        frme.add(amt);
        frme.add(acctype);
        frme.add(beneficiarylst);
        frme.add(remarks);
        frme.add(amttf);
        frme.add(acctypebox);
        frme.add(pay);
        frme.add(benebox);
        frme.add(remarksta);
        frme.setLayout(null);
        frme.setVisible(true);
        frme.getContentPane().setBackground(Color.pink);
       // frme.add(butt);
             
    }
    
}
