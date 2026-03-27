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
         assertTrue(Pn1.isBackgroundSet());
         assertEquals(Color.magenta, Pn1.getBackground());
         assertInstanceOf(TitledBorder.class, Pn1.getBorder());
         assertEquals("JPanel_1", B1.getTitle());

         assertSame(Pn1, JPanels.JPanel1);
    }

    @Test
    void createJPanel_2() {
    }

    @Test
    void createJPanel_3() {
    }
}