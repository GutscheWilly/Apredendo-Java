import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testNumber = scanner.nextInt();
            scanner.nextLine();
            for (int test = 1 ; test <= testNumber ; test++) {
                String scrambledSentence = scanner.nextLine();
                String unscrambledSentence = unscramble(scrambledSentence);
                System.out.println(unscrambledSentence);
            }
        }
        catch (InputMismatchException inputMismatchException) {
            System.out.println(inputMismatchException.getMessage());
        }
    }

    public static String unscramble(String sentence) {
        int half = sentence.length() / 2;

        String leftHalf = sentence.substring(0, half);
        String rightHalf = sentence.substring(half, sentence.length());

        return invert(leftHalf) + invert(rightHalf);
    }

    private static String invert(String string) {
        char[] characters = string.toCharArray();
        int lastIndex = characters.length - 1;

        for (int i = 0 ; i < characters.length / 2 ; i++) {
            char assistantCharacter = characters[i];
            characters[i] = characters[lastIndex - i];
            characters[lastIndex - i] = assistantCharacter;
        }
        return String.copyValueOf(characters);
    }
}
