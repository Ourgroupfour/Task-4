import javax.swing.*;

public class MenuBarClass {
    JMenuBar menuBar;

    public MenuBarClass(PanelClass panelClass){
        menuBar = new JMenuBar();

        JMenu home = new JMenu("Home");
        JMenuItem homeItem = new JMenuItem("home");
        homeItem.addActionListener(e -> panelClass.showCard("HOME"));

        JMenu about = new JMenu("About");
        JMenuItem aboutItem = new JMenuItem("about");
        aboutItem.addActionListener(e -> panelClass.showCard("ABOUT"));

        JMenu settings = new JMenu("Settings");
        JMenuItem settingItem = new JMenuItem("setting");
        settingItem.addActionListener(e -> panelClass.showCard("SETTING"));

        home.add(homeItem);
        about.add(aboutItem);
        settings.add(settingItem);

        menuBar.add(home);
        menuBar.add(about);
        menuBar.add(settings);


    }

    public JMenuBar getMenuBar(){
        return menuBar;
    }
}
