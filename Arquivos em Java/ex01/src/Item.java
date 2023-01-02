public class Item {
    
    private String name;
    private float price;
    private int quantity;

    public Item(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    
    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public float totalValueOfItem() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("Name: " + this.name + " | Price: " + this.price + " | Quantity: " + this.quantity);
    }
}
