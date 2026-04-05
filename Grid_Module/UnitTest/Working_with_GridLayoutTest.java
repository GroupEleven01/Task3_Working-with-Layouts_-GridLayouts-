
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Working_with_GridLayoutTest {

    Working_with_GridLayout DesktopLayout;
    JFrame GridFrame;
    Component[] components;

    @BeforeEach
    void setUp() {
        DesktopLayout = new Working_with_GridLayout();
        GridFrame = DesktopLayout.GridJFrame;
    }

    @AfterEach
    void tearDown() {

        if (GridFrame != null) {
            GridFrame.dispose();
        }
    }

    @Test
    void createGridJFrame() {
        GridFrame = DesktopLayout.CreateGridJFrame();

        assertNotNull(GridFrame);
        assertEquals("working with Grid layout", GridFrame.getTitle());
    }

    @Test
    void SetLayoutProperties() {
        LayoutManager layout = GridFrame.getContentPane().getLayout();
        assertInstanceOf(GridLayout.class, layout);

        GridLayout grid = ((GridLayout) layout);
        assertEquals(1, grid.getRows());
        assertEquals(3, grid.getColumns());

    }

    @Test
    void JFrameComponentProperties() {
        components = GridFrame.getContentPane().getComponents();
        assertEquals(3, components.length, "The number of components must be 3");

        for (Component comp: components) {
            assertInstanceOf(JPanel.class, comp);
        }
    }

    @Test
    void ComponentProperties() {
        components = GridFrame.getContentPane().getComponents();
        JPanel p1 = new JPanel();
        p1 = (JPanel) components[0];
        JPanel p2 = new JPanel();
        p2 = (JPanel) components[1];
        JPanel p3 = new JPanel();
        p3 = (JPanel) components[2];

        assertEquals(p1, GridFrame.getContentPane().getComponent(0));
        assertEquals(p2, GridFrame.getContentPane().getComponent(1));
        assertEquals(p3, GridFrame.getContentPane().getComponent(2));

        assertTrue(p1.isBackgroundSet());
        assertTrue(p2.isBackgroundSet());
        assertTrue(p3.isBackgroundSet());

        assertTrue(p1.isLightweight());
        assertTrue(p2.isLightweight());
        assertTrue(p3.isLightweight());

        assertEquals(Color.magenta, p1.getBackground());
        assertEquals(Color.gray, p2.getBackground());
        assertEquals(Color.pink, p3.getBackground());

    }


}