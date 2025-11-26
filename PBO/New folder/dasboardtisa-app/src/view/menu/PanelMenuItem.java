package view.menu;

import java.awt.Color;
import java.awt.MenuItem;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMenuItem extends JPanel{
    private static final Color BG_SIDEBAR = new Color(245, 247, 250);
    private static final Color BG_HOVER = new Color(224, 230, 235);
    private static final Color BG_SELECTED = new Color(234, 242, 235);

    private static final Color TEXT_NORMAL = new Color(98, 117, 138);
    private static final Color TEXT_HOVER = new Color(0, 48, 73);
    private static final Color TEXT_SELECTED = new Color(131, 188, 160);

    private final String contentKey;
    private boolean isSubMenu;
    private boolean selected = false;

    private JPanel panelContainerSubMenu;
    private JLabel labelMenu;
    private PanelMenuItem panelSubMenuItem;
    private PanelMenu panelMenu;

    public PanelMenuItem (MenuItem item, PanelMenu panelMenu, boolean isSubMenu){
        this(item, panelMenu, false);
    }
}
