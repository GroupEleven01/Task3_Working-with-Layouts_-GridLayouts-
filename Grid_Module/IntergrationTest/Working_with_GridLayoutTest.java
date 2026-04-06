import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Working_with_GridLayoutTest {
    Working_with_GridLayout GridExample;
    JFrame frame1;

    @BeforeEach
    void setUp() {
        GridExample = new Working_with_GridLayout();
        frame1 = GridExample.GridJFrame;
    }

    @Test
    void createGridJFrame() {
        frame1 = GridExample.GridJFrame;
        LayoutManager Layout = frame1.getContentPane().getLayout();
        GridLayout grid = ((GridLayout) Layout);
        assertEquals(1, grid.getRows());
        assertEquals(3, grid.getColumns());
        frame1.setExtendedState((JFrame.MAXIMIZED_BOTH));
        assertEquals(3,frame1.getContentPane().getComponentCount());


        JPanel Jpanel_1 = (JPanel) frame1.getContentPane().getComponent(0);
        assertEquals(Color.magenta, Jpanel_1.getBackground());

        JPanel Jpanel_2 = (JPanel) frame1.getContentPane().getComponent(1);
        assertEquals(Color.gray, Jpanel_2.getBackground());

        JPanel Jpanel_3 = (JPanel) frame1.getContentPane().getComponent(2);
        assertEquals(Color.pink, Jpanel_3.getBackground());



    }
}