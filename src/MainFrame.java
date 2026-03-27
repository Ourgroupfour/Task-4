import javax.swing.*;
import java.awt.*;

public class MainFrame {
    JFrame frame;

    public MainFrame(){
        frame = new JFrame("Task 4 App");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        PanelClass mainContainer = new PanelClass();
        MenuBarClass menuBar = new MenuBarClass(mainContainer);

        frame.setJMenuBar(menuBar.getMenuBar());
        frame.add(mainContainer.getContainer(), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}