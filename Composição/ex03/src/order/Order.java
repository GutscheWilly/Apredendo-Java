package order;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import order.compositions.*;

public class Order {
    
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private ArrayList<OrderItem> items = new ArrayList<>();
    
    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        Double total = 0.0;
        for (OrderItem item : items) {
            total += item.subTotal();
        }
        return total;
    }

    public String showAllItems() {
        StringBuilder builder = new StringBuilder();
        builder.append("Order Items:\n");
        for (OrderItem item : items) {
            builder.append(item + "\n");
        }   
        return builder.toString();
    }

    public String toString() {
        return String.format("ORDER SUMMARY:\nOrder Moment: %s\nOrder Status: %s\n%s\n%s\nTotal price: $%.2f",
        moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
        status,
        client,
        showAllItems(),
        total());
    }
}
