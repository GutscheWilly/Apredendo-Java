import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer quantityOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0 ; i < quantityOfTests ; i++) {
            String input = scanner.nextLine();
            System.out.println(sortString(input));
        }

        scanner.close();
    }

    public static String sortString(String input) {
        List<String> initialOrder = new ArrayList<>();
        String[] divisionsOfString = input.split(" ");

        for (int i = 0 ; i < divisionsOfString.length ; i++) {
            initialOrder.add(divisionsOfString[i]);
        }

        List<String> sortedOrder = new ArrayList<>();

        while (initialOrder.size() > 0) {
            int index = 0;
            for (int i = 1 ; i < initialOrder.size() ; i++) {
                if (initialOrder.get(i).length() > initialOrder.get(index).length()) {
                    index = i;
                }
            }
            sortedOrder.add(initialOrder.get(index));
            initialOrder.remove(index);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String string : sortedOrder) {
            stringBuilder.append(string + " ");
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());

        return stringBuilder.toString();
    }
}
