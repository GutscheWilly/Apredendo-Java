import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[3];

        for (int i = 0 ; i < 3 ; i++) {
            String hexadecimal = scanner.nextLine();
            values[i] = convertHexadecimalToDecimal(hexadecimal);
        }

        int result = calculateQuantityMaxOfHangTags(values);

        for (int i = 0 ; i < 3 ; i++) {
            System.out.println("\n" + values[i]);
        }

        System.out.println("\n" + result);

        scanner.close();
    }

    public static int convertHexadecimalToDecimal(String hexadecimal) {
        char[] arrayOfChars = hexadecimal.toCharArray();
        int result = 0;
        for (int i = arrayOfChars.length - 1 ; i >= 0 ; i--) {
            result += convertToInt(arrayOfChars[i]) * Math.pow(16, arrayOfChars.length - 1 - i);
        }
        return result;
    }

    public static int convertToInt(char character) {
        switch (character) {
            case 'a':
                return (int)character - 87;
            case 'b':
                return (int)character - 87;
            case 'c':
                return (int)character - 87;
            case 'd':
                return (int)character - 87;
            case 'e':
                return (int)character - 87;
            case 'f':
                return (int)character - 87;
            default:
                return (int)character - 48;
        }
    }

    public static int calculateQuantityMaxOfHangTags(int[] values) {
        int quantityMaxOfGreenHangTags = (int)Math.pow(values[0] / calculateMDC(values[0], values[1]), 2);
        int quantityMaxOfBlueHangTags = (int)Math.pow(values[1] / calculateMDC(values[1], values[2]), 2) * quantityMaxOfGreenHangTags;
        return quantityMaxOfGreenHangTags + quantityMaxOfBlueHangTags + 1;
    }

    public static int calculateMDC(int firtValue, int secondValue) {
        int mdcBetweenTheNumbers = 1;
        int divider = 2;

        while (firtValue != 1 && secondValue != 1) {
            while (firtValue % divider == 0 || secondValue % divider == 0) {
                if (firtValue % divider == 0 && secondValue % divider == 0) {
                    mdcBetweenTheNumbers *= divider;
                }
                if (firtValue % divider == 0) {
                    firtValue /= divider;
                }
                if (secondValue % divider == 0) {
                    secondValue /= divider;
                }
            }
            divider++;
        }

        return mdcBetweenTheNumbers;
    }
}
