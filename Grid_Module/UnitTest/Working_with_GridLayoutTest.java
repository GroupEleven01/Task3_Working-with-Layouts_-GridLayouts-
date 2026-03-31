
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Working_with_GridLayoutTest {

    Working_with_GridLayout DesktopLayout;
    JFrame GridFrame;

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
        assertTrue(layout instanceof GridLayout);

        GridLayout grid = ((GridLayout) layout);
        assertEquals(1, grid.getRows());
        assertEquals(3, grid.getColumns());

    }

}