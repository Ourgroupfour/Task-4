import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class MainFrameTest {

    @Test
    public void testFrame(){
        MainFrame MainFrame = new MainFrame();
        JFrame frame = MainFrame.frame;

        assertTrue(frame.isVisible());
    }

    @Test
    public void testPanel(){
        PanelClass panel = new PanelClass();
        JPanel panel1 = panel.homePanel;

        assertEquals(Color.GRAY, panel1.getBackground());
    }


}