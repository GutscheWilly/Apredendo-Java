import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int quantityOfWagons = scanner.nextInt();

        while (quantityOfWagons > 0) {
            int[] initialOrder = getInitialOrder(quantityOfWagons, scanner);

            if (initialOrder != null) {
                printMessageOfValidation(initialOrder);
            } else {
                System.out.println();
                quantityOfWagons = scanner.nextInt();
            }
        }
    }

    public static int[] getInitialOrder(int quantityOfWagons, Scanner scanner) {
        int[] initialOrder = new int[quantityOfWagons];
            
            for (int i = 0 ; i < initialOrder.length ; i++) {
                initialOrder[i] = scanner.nextInt();

                if (initialOrder[i] == 0) {
                    return null;
                }
            }

        return initialOrder;
    }

    public static void printMessageOfValidation(int[] initialOrder) {
        if (validateInitialOrder(initialOrder)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean validateDescentingOrder(int[] initialOrder) {
        for (int i = 0 ; i < initialOrder.length - 1 ; i++) {
            if (initialOrder[i] < initialOrder[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateAscendingOrder(int[] initialOrder) {
        for (int i = 0 ; i < initialOrder.length - 1 ; i++) {
            if (initialOrder[i] > initialOrder[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateInitialOrder(int[] initialOrder) {
        return validateAscendingOrder(initialOrder) || validateDescentingOrder(initialOrder);
    }
}
