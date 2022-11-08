import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import order.Order;
import order.compositions.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter client datas:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date: ");
        String date = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Client client = new Client(name, email, birthDate);

        System.out.print("Enter order data:\n");
        System.out.print("Status: ");
        String statusString = scanner.nextLine();
        OrderStatus status = OrderStatus.valueOf(statusString);

        Order order = new Order(LocalDateTime.now(), status, client);
        System.out.print("How many items to this order?: ");
        Integer itemsQuantity = scanner.nextInt();
        for (int i = 1 ; i <= itemsQuantity ; i++) {
            System.out.printf("Enter (%d) item data:\n", i);
            System.out.print("Product name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            Double productPrice = scanner.nextDouble();
            Product product = new Product(productName, productPrice);
            System.out.print("Quantity: ");
            Integer productQuantity = scanner.nextInt();
            OrderItem item = new OrderItem(product, productQuantity);
            order.addItem(item);
        }
        System.out.println(order);
        scanner.close();
    }
}
