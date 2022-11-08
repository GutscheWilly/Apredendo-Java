package order.compositions;

public class OrderItem {
    
    private Product product;
    private Integer quantity;

    public OrderItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double subTotal() {
        return product.getPrice() * quantity;
    }

    public String toString() {
        return String.format("%s -> Quantity: %d, Subtotal: $%.2f", 
        product,
        quantity,
        subTotal());
    }
}
