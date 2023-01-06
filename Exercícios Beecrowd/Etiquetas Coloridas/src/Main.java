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

        System.out.println("\n" + result);
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
        int quantityMaxOfGreen = calculateArea(values[0]) / calculateArea(values[1]);
        int quantityMaxOfBlue = calculateArea(values[1]) / calculateArea(values[2]) * quantityMaxOfGreen;
        
        return quantityMaxOfGreen + quantityMaxOfBlue + 1;
    }

    public static int calculateArea(int side) {
        return (int)Math.pow(side, 2);
    }
}
