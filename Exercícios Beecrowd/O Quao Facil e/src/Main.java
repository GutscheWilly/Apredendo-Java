import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String statement = scanner.nextLine();

            while (statement != null) {
                List<String> words = getWords(statement);
                int averageLength = calculateAverageLength(words);
                int difficultyLevel = getDifficultyLevel(averageLength);
                System.out.println(difficultyLevel);
                statement = scanner.nextLine();
            }
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static List<String> getWords(String statement) {
        String[] splitStatement = statement.split(" ");
        List<String> words = new ArrayList<>();

        for (String word : splitStatement) {
            if (!word.contains(".")) {
                words.add(word);
            }
        }
        return words;
    }

    public static Integer calculateAverageLength(List<String> words) {
        if (words.isEmpty()) {
            return 0;
        }

        int totalLetters = words.stream()
                .map(String::length)
                .reduce(Integer::sum)
                .orElse(0);
        return totalLetters / words.size();
    }

    public static int getDifficultyLevel(int averageLength) {
        if (averageLength == 0) {
            return 0;
        }
        if (averageLength < 4) {
            return 250;
        }
        if (averageLength < 6) {
            return 500;
        }
        return 1000;
    }
}
