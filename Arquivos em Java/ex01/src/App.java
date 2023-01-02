import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a path of a .csv file: ");
        String stringPath = scanner.nextLine();
        File sourceFile = new File(stringPath);
        createSummaryFileFromSourceFile(sourceFile);
        scanner.close();
    }

    public static Item getItemFromCurrentLine(String currentLine) {
        String[] divisionsOfCurrentLine = currentLine.split(",");

        String name = divisionsOfCurrentLine[0];
        float price = Float.parseFloat(divisionsOfCurrentLine[1]);
        int quantity = Integer.parseInt(divisionsOfCurrentLine[2]);

        return new Item(name, price, quantity);
    }

    public static List<Item> getItemsFromAFile(File file) {
        List<Item> listOfItems = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
            String currentLine = bufferedReader.readLine();

            while (currentLine != null) {
                Item itemOfCurrentLine = getItemFromCurrentLine(currentLine);
                listOfItems.add(itemOfCurrentLine);
                currentLine = bufferedReader.readLine();
            }
        }
        catch (IOException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }

        return listOfItems;
    }

    public static void createSummaryFileFromSourceFile(File sourceFile) {
        new File(sourceFile.getParent() + "\\out").mkdir();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(sourceFile.getParent() + "\\out\\summary.csv"))) {
            List<Item> listOfItems = getItemsFromAFile(sourceFile);

            for (Item item : listOfItems) {
                String contentOfLine = String.format("%s, %.2f", item.getName(), item.totalValueOfItem());
                bufferedWriter.write(contentOfLine);
                bufferedWriter.newLine();
            }
        }
        catch (IOException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}
