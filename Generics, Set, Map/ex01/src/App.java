import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class App {
    public static void main(String[] args) throws Exception {
        String filePath = "C:\\temp\\in.txt";
        List<Product> productsList = requestProductList(filePath);
        Product mostExpensiveProduct = CalculationService.max(productsList);
        System.out.println("Most expensive product: " + mostExpensiveProduct);
    }

    public static List<Product> requestProductList(String filePath) {
        List<Product> productsList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                String[] splitCurrentLine = currentLine.split(",");
                String productName = splitCurrentLine[0];
                Double productPrice = Double.parseDouble(splitCurrentLine[1]);
                Product product = new Product(productName, productPrice);
                productsList.add(product);
                currentLine = bufferedReader.readLine();
            }
            return productsList;
        } 
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
}
