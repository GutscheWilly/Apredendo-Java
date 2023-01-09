import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer quantityOfGrades = scanner.nextInt();
        List<Integer> listOfgrades = new ArrayList<>();

        for (int i = 0 ; i < quantityOfGrades ; i++) {
            listOfgrades.add(scanner.nextInt());
        }

        listOfgrades.sort(Comparator.naturalOrder());

        int mostFrequencyNumber = -1;
        int frequency = 0;

        for (int i = 0 ; i < listOfgrades.size() ; i++) {
            int relativeFrequency = 1;
            int number = listOfgrades.get(i);
            while (i < listOfgrades.size() - 1  && listOfgrades.get(i + 1) == number) {
                relativeFrequency++;
                i++;
            }
            if (relativeFrequency > frequency) {
                frequency = relativeFrequency;
                mostFrequencyNumber = number;
            } else if (relativeFrequency == frequency && number > mostFrequencyNumber) {
                mostFrequencyNumber = number;
            }
        }

        System.out.println(mostFrequencyNumber);

        scanner.close();
    }
}
