package GridPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class JPanelsTest {

    @BeforeEach
    void setUp() {
        JPanels.JPanel1 = null;
        JPanels.JPanel2 = null;
        JPanels.JPanel3 = null;
    }

    @Test
    void createJPanel_1() {
         JPanel Pn1 = JPanels.CreateJPanel_1();
         TitledBorder B1 = (TitledBorder) Pn1.getBorder();

         assertNotNull(Pn1);
         assertNotNull(B1);
         assertTrue(Pn1.isBackgroundSet());
         assertEquals(Color.magenta, Pn1.getBackground());
         assertInstanceOf(TitledBorder.class, Pn1.getBorder());
         assertEquals("JPanel_1", B1.getTitle());

         assertSame(Pn1, JPanels.JPanel1);
    }

    @Test
    void createJPanel_2() {
        JPanels Panels = new JPanels();
        JPanel Pn2 = Panels.CreateJPanel_2();
        TitledBorder B2 = (TitledBorder) Pn2.getBorder();

        assertNotNull(Pn2);
        assertNotNull(B2);
        assertTrue(Pn2.isBackgroundSet());
        assertEquals(Color.gray, Pn2.getBackground());

        assertInstanceOf(TitledBorder.class, Pn2.getBorder());
        assertSame("JPanel_2", B2.getTitle());

        assertSame(Pn2, JPanels.JPanel2);
    }

    @Test
    void createJPanel_3() {
        JPanel Pn3 = JPanels.CreateJPanel_3();
        TitledBorder B3 = (TitledBorder) Pn3.getBorder();

        assertNotNull(Pn3);
        assertNotNull(B3);
        assertTrue(Pn3.isBackgroundSet());
        assertEquals(Color.pink, Pn3.getBackground());

        assertInstanceOf(TitledBorder.class, Pn3.getBorder());
        assertSame("JPanel_3", B3.getTitle());

        assertSame(Pn3, JPanels.JPanel3);
    }
}