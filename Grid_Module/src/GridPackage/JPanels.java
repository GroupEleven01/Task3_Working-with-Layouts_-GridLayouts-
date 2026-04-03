package GridPackage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JPanels {

    static JPanel JPanel1, JPanel2, JPanel3;

    public static JPanel  CreateJPanel_1(){
        JPanel1 = new JPanel();
        JPanel1.setBackground(Color.magenta);
        Border Jpanel1Border = BorderFactory.createTitledBorder("JPanel_1");
        JPanel1.setBorder(Jpanel1Border);

        return JPanel1;
    }

    public static JPanel CreateJPanel_2(){
        JPanel2 = new JPanel();
        JPanel2.setBackground(Color.gray);
        Border Jpanel2Border = BorderFactory.createTitledBorder("JPanel_2");
        JPanel2.setBorder(Jpanel2Border);
        return JPanel2;
    }

    public static JPanel CreateJPanel_3(){
        JPanel3 = new JPanel();
        JPanel3.setBackground(Color.pink);
        Border Jpanel3Border = BorderFactory.createTitledBorder("JPanel_3");
        JPanel3.setBorder(Jpanel3Border);
        return JPanel3;
    }
}
