import javax.swing.*;
import java.awt.*;
import GridPackage.JPanels;

public class Working_with_GridLayout {

    JFrame GridJFrame;

    public Working_with_GridLayout() {
        this.CreateGridJFrame();

    }

    public JFrame CreateGridJFrame(){

        GridJFrame = new JFrame("working with Grid layout");
        JPanels jps = new JPanels();

        GridJFrame.setLayout(new BorderLayout());
        GridJFrame.setLayout(new GridLayout(1,3));
        GridJFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        GridJFrame.add(JPanels.CreateJPanel_1());
        GridJFrame.add(jps.CreateJPanel_2());
        GridJFrame.add(JPanels.CreateJPanel_3());


        GridJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridJFrame.setVisible(true);

        return GridJFrame;
    }
}
