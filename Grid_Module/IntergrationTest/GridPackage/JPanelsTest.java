package GridPackage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

class JPanelsTest {

    @Test
    void createJPanel_1() {
        JPanel panel = JPanels.CreateJPanel_1();
        assertNotNull(panel, "Jpanel_1");
        assertEquals(Color.magenta, panel.getBackground());
        assertInstanceOf(TitledBorder.class, panel.getBorder());
    }

    @Test
    void createJPanel_2() {
        JPanels panel2 = new JPanels();
        JPanel Pn = panel2.CreateJPanel_2();
//        JPanel panel = JPanels.CreateJPanel_2();
        assertNotNull(Pn, "Jpanel_2");
        assertEquals(Color.gray, Pn.getBackground());
        assertInstanceOf(TitledBorder.class, Pn.getBorder());
    }

    @Test
    void createJPanel_3() {
        JPanel panel = JPanels.CreateJPanel_3();
        assertNotNull(panel, "Jpanel_3");
        assertEquals(Color.pink, panel.getBackground());
        assertTrue(panel.getBorder() instanceof javax.swing.border.TitledBorder);
    }
}