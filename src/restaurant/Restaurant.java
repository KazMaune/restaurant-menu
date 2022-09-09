package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem(2.99, "Chicken Strips", "Appetizer");
        MenuItem item2 = new MenuItem(12.99, "Chicken Strip Dinner", "Main Course");
        MenuItem item3 = new MenuItem(13.99, "Bread Pudding", "Dessert");
        Menu menu = new Menu();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.printAllItems();
        item1.print();
        menu.removeItem(item3);
        menu.printAllItems();
    }
}
