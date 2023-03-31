package package_main;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
public class accbeneficiary {
    public static void main(String[] args){
        String option[]={"Savings","Current"};
        JFrame frme=new JFrame();
        JLabel accbene=new JLabel("ACCOUNT BENEFICIARY");
        JLabel name=new JLabel("Name");
        JLabel accno=new JLabel("Account Number");
        JLabel acctype=new JLabel("Account Type");
        JLabel ifsc=new JLabel("IFSC Code");
        JLabel note=new JLabel("Note");
        JTextField nametf=new JTextField();
        JTextField accnumtf=new JTextField();
        JTextField ifsctf=new JTextField();
        JComboBox acctypebox=new JComboBox(option);
        JTextArea noteta=new JTextArea();
        JButton pay=new JButton("Make Payment");
        acctypebox.setBounds(230,220,100,17);
        pay.setBounds(150,430,170,25);
        accbene.setBounds(130,30,300,20);
        name.setBounds(130,120,300,20);
        accno.setBounds(100,170,300,20);
        acctype.setBounds(105,220,300,20);
        ifsc.setBounds(110,271,300,20);
        note.setBounds(135,320,300,20);
        nametf.setBounds(230,125,100,17);
        accnumtf.setBounds(230,170,100,17);
        ifsctf.setBounds(230,275,100,17);
        noteta.setBounds(230,320,200,70);
        accbene.setFont(new Font("Serif",Font.BOLD,20));
        name.setFont(new Font("Serif",Font.BOLD,15));
        accno.setFont(new Font("Serif",Font.BOLD,15));
        acctype.setFont(new Font("Serif",Font.BOLD,15));
        ifsc.setFont(new Font("Serif",Font.BOLD,15));
        note.setFont(new Font("Serif",Font.BOLD,15)); 
        frme.setSize(500,550);
        frme.getContentPane().setBackground(Color.pink);
        frme.add(accbene);
        frme.add(name);
        frme.add(accno);
        frme.add(acctype);
        frme.add(ifsc);
        frme.add(note);
        frme.add(nametf);
        frme.add(accnumtf);
        frme.add(ifsctf);
        frme.add(noteta);
        frme.add(pay);
        frme.add(acctypebox);
;       frme.setLayout(null);
        frme.setVisible(true);
        
    }
}
