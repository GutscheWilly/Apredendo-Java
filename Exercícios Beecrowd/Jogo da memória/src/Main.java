import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer quantityOfCards = scanner.nextInt();
            int[] cardPositions = new int[quantityOfCards];
            for (int i = 0 ; i < quantityOfCards ; i++) {
                cardPositions[i] = scanner.nextInt();
            }
            List<int[]> linesBetweenPositions = new ArrayList<>();
            for (int i = 0 ; i < quantityOfCards - 1 ; i++) {
                int[] positions = new int[2];
                for (int j = 0 ; j < 2 ; j++) {
                    positions[j] = scanner.nextInt();
                }
                linesBetweenPositions.add(positions);
            }
            Integer score = 0;
            for (int i = 1 ; i <= quantityOfCards / 2 ; i++) {
                Integer firstPosition = -1;
                Integer secondPosition = -1;
                for (int j = 0 ; j < quantityOfCards ; j++) {
                    if (cardPositions[j] == i && firstPosition == -1) {
                        firstPosition = j;
                    } else if (cardPositions[j] == i && secondPosition == -1) {
                        secondPosition = j;
                    }
                }
                firstPosition++;
                secondPosition++;
                for (int[] positions : linesBetweenPositions) {
                    if (positions[0] == firstPosition) {
                        score++;
                        firstPosition = positions[1];
                    }
                }
            }
            System.out.println(score);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
