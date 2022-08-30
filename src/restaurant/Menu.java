package restaurant;

import java.util.Date;

public class Menu {
    private ArrayList<Menuitem> menuItems;
    public Date lastUpdate;

    public Menu(ArrayList<Menuitem> menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList<Menuitem> getMenuItems() {
        return menuItems;
    }

}
