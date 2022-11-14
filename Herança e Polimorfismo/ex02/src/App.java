import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import product.Product;
import product.imported.ImportedProduct;
import product.used.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberOfProducts = scanner.nextInt();

        for (int i = 0 ; i < numberOfProducts ; i++) {
            System.out.println("Product (" + (i + 1) + ") datas:");
            System.out.print("Common, used or imported (c/u/i)?: ");
            char kindOfProduct = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Price: ");
            Double price = scanner.nextDouble();
            switch (kindOfProduct) {
                case 'i':
                    System.out.print("Customs fee: ");
                    Double customsFee = scanner.nextDouble();
                    products.add(new ImportedProduct(name, price, customsFee));
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    scanner.nextLine();
                    String date = scanner.next();
                    LocalDate manufactureDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    products.add(new UsedProduct(name, price, manufactureDate));
                    break;
                default:
                    products.add(new Product(name, price));
            }
        }

        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
        scanner.close();
    }
}
