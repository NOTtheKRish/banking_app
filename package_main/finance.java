package package_main;
import java.awt.Component;

import javax.swing.*;
import javax.swing.JLabel;
public class finance{
    private static Component add;

    /**
     * @param args
     */
    public static void main(String args[]){
    JFrame frame=new JFrame();
   // JLabel label=new JLabel();
    frame.setVisible(true);
    frame.setSize(1100,700);
    frame.setTitle("Financial Management System");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(true);
    ImageIcon image=new ImageIcon("money.png");
    frame.setIconImage(image.getImage());
    JLabel label=new JLabel();
    label.setText("Username");
    label.setText("Password");
    frame.add(label);
    frame.add(label);

    


    }


}
