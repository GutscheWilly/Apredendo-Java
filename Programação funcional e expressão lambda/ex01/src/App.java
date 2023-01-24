import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class App {

    public static void main(String[] args) throws Exception {
        String filePath = "c:\\temp\\in.txt";
        File file = new File(filePath);
        List<Product> productList = getProductsFromFile(file);
        Double averagePrice = productList.stream().map(x -> x.getPrice()).reduce(0.0, (x, y) -> x + y) / productList.size();
        List<Product> productsCheaperThanAveragePrice = productList.stream().filter(x -> x.getPrice() < averagePrice).collect(Collectors.toList());
        List<String> nameOfproductsCheaperThanAveragePrice = productsCheaperThanAveragePrice.stream().map(x -> x.getName()).sorted((x, y) -> -x.compareTo(y)).collect(Collectors.toList());
        System.out.printf("Average price: %.2f\n", averagePrice);
        nameOfproductsCheaperThanAveragePrice.forEach(x -> System.out.println(x));
    }

    public static List<Product> getProductsFromFile(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            List<Product> productList = new ArrayList<>();
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                String[] currentLineSplited = currentLine.split(",");
                String productName = currentLineSplited[0];
                Double productPrice = Double.parseDouble(currentLineSplited[1]);
                Product product = new Product(productName, productPrice);
                productList.add(product);
                currentLine = bufferedReader.readLine();
            }
            return productList;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
}
