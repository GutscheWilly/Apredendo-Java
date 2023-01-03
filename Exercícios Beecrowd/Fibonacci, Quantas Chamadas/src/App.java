import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int quantityOfTests = scanner.nextInt();

        for (int i = 0 ; i < quantityOfTests ; i++) {
            int positionOfValue = scanner.nextInt();
            String result = String.format("fib(%d) = %d calls = %d", positionOfValue, getQuantityOfCallsFromPosition(positionOfValue), getValueOfPositionFromFibonacci(positionOfValue));
            System.out.println(result);
        }

        scanner.close();
    }

    public static int getValueOfPositionFromFibonacci(int positionOfValue) {
        if (positionOfValue == 0) {
            return 0;
        }

        if (positionOfValue == 1) {
            return 1;
        }

        return getValueOfPositionFromFibonacci(positionOfValue - 1) + getValueOfPositionFromFibonacci(positionOfValue - 2);
    }

    public static int getQuantityOfCallsFromPosition(int position) {
        if (position == 1 || position == 0) {
            return 0;
        }

        return getQuantityOfCallsFromPosition(position - 1) + getQuantityOfCallsFromPosition(position - 2) + 2;
    }
}
