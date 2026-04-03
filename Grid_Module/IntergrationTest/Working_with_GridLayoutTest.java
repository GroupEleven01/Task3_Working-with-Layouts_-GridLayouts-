import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;

public class Working_with_GridLayout {

    JFrame GridJFrame;

    @Test
    public static void CreateGridJFrame() {
        // Call the method
        JFrame frame = Working_with_GridLayout.CreateGridJFrame();

        // Check that frame is not null
        assertNotNull(frame, "Frame should not be null");

        // Check title
        assertEquals("working with Grid layout", frame.getTitle(), "Frame title should match");

        // Check layout type
        assertTrue(frame.getLayout() instanceof GridLayout, "Layout should be GridLayout");
        GridLayout layout = (GridLayout) frame.getLayout();
        assertEquals(1, layout.getRows(), "GridLayout should have 1 row");
        assertEquals(3, layout.getColumns(), "GridLayout should have 3 columns");

        // Check extended state
        assertEquals(JFrame.MAXIMIZED_BOTH, frame.getExtendedState(), "Frame should be maximized");

        // Check number of components
        assertEquals(3, frame.getContentPane().getComponentCount(), "Frame should contain 3 panels");

        // Check that components are JPanels
        for (Component comp : frame.getContentPane().getComponents()) {
            assertTrue(comp instanceof JPanel, "Each component should be a JPanel");
        }
    }
}
