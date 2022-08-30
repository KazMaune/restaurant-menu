package restaurant;

public class MenuItem {
    private double price;
    private String description;
    private String category;

    public boolean isNew = false;

    public MenuItem(double price, String description, String appetizer) {
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }
}
