package app_main.views;
import java.awt.*;
import javax.swing.*;
public class NEFT {
    JFrame frme;
    NEFT(){
        String option[]={"Savings","Current"};
        frme=new JFrame("NEFT");
        
        JLabel lab=new JLabel("NEFT");
        lab.setBounds(220,30,300,20);
        lab.setFont(new Font(null,Font.BOLD,20));
        
        JLabel amt=new JLabel("Amount");
        amt.setBounds(130,120,300,20);
        amt.setFont(new Font(null,Font.BOLD,17));
        
        JLabel acctype=new JLabel("Account Type");
        acctype.setBounds(100,170,300,20);
        acctype.setFont(new Font(null,Font.BOLD,17));
        
        JLabel accountno=new JLabel("Account No");
        accountno.setBounds(90,220,300,20);
        accountno.setFont(new Font(null,Font.BOLD,17));
        
        JLabel ifsc=new JLabel("IFSC Code");
        ifsc.setBounds(90,240,300,20);
        ifsc.setFont(new Font(null,Font.BOLD,17));

        JTextField ifsc_code = new JTextField();
        ifsc_code.setBounds(230,245,200,100);
        
        JLabel remarks=new JLabel("Remarks");
        remarks.setBounds(110,271,300,20);
        remarks.setFont(new Font(null,Font.BOLD,17));

        JTextField amtVal=new JTextField();
        amtVal.setBounds(230,125,100,17);

        JTextArea remarksta=new JTextArea();
        remarksta.setBounds(230,275,200,100);

        JComboBox acctypebox=new JComboBox(option);
        acctypebox.setBounds(230,170,100,17);

        JButton pay=new JButton("Make Payment");
        pay.setBounds(150,400,170,25);



        frme.setSize(500,500);
        frme.add(lab);
        frme.add(amt);
        frme.add(acctype);
        frme.add(accountno);
        frme.add(ifsc);
        frme.add(remarks);
        frme.add(amtVal);
        frme.add(acctypebox);
        frme.add(pay);

        frme.add(remarksta);

        frme.setLayout(null);
        frme.setVisible(true);
        frme.getContentPane().setBackground(Color.pink);
    }

    public static void main(String[] args){
        new NEFT();
    }
}
