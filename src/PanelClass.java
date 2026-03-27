import javax.swing.*;
import java.awt.*;

public class PanelClass {
    JPanel container, homePanel, aboutPanel, settingPanel;
    CardLayout cardLayout;

    public PanelClass(){
        cardLayout = new CardLayout();
        container = new JPanel(cardLayout);

        homePanel = new JPanel();
        homePanel.add(new JLabel("home page"));
        homePanel.setBackground(Color.GRAY);

        container.add(homePanel,"HOME");

        aboutPanel = new JPanel();
        JLabel aboutLabel = new JLabel("About us");
        aboutPanel.add(aboutLabel);
        aboutLabel.setForeground(Color.white);
        aboutPanel.setBackground(Color.BLUE);

        container.add(aboutPanel, "ABOUT");

        settingPanel = new JPanel();
        JLabel settingLabel = new JLabel("Setting");
        settingPanel.add(settingLabel);
        settingLabel.setForeground(Color.WHITE);
        settingPanel.setBackground(Color.CYAN);

        container.add(settingPanel, "SETTING");
    }
    public JPanel getContainer(){
        return container;
    }

    public void showCard(String name){
        cardLayout.show(container, name);
    }


}
