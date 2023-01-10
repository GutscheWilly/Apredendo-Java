import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Integer quantityOfLocks = scanner.nextInt();
        Integer requiredHeight = scanner.nextInt();

        int[] arrayOfLocks = new int[quantityOfLocks];

        for (int i = 0 ; i < quantityOfLocks ; i++) {
            arrayOfLocks[i] = scanner.nextInt();
        }

        Integer minimumNumberOfMoviments = 0;

        for (int i = 0 ; i < arrayOfLocks.length - 1 ; i++) {
            while (arrayOfLocks[i] != requiredHeight) {
                if (arrayOfLocks[i] < requiredHeight) {
                    arrayOfLocks[i]++;
                    arrayOfLocks[i + 1]++;
                } else {
                    arrayOfLocks[i]--;
                    arrayOfLocks[i + 1]--;
                }
                minimumNumberOfMoviments++;
            }
        }

        System.out.println(minimumNumberOfMoviments);
        scanner.close();
    }
}
