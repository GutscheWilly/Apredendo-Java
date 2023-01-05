import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer begin = scanner.nextInt();
        Integer end = scanner.nextInt();
        
        while (begin != 0 || end != 0) {
            int[] results = getTheResultForEachNumber(begin, end);
            printTheResults(results);
            begin = scanner.nextInt();
            end = scanner.nextInt();
        }

        scanner.close();
    }

    public static Integer getHowManyTimesTheNumberShow(Integer begin, Integer end, Integer number) {
        int quantityOfTimesTheNumberShow = 0;

        for (int i = begin ; i <= end ; i++) {
            String stringValue = Integer.toString(i);
            char[] arrayOfchars = stringValue.toCharArray();
            for (int j = 0 ; j < arrayOfchars.length ; j++) {
                if (arrayOfchars[j] == number.toString().charAt(0)) {
                    quantityOfTimesTheNumberShow++;
                }
            }
        } 
        
        return quantityOfTimesTheNumberShow;
    }

    public static int[] getTheResultForEachNumber(Integer begin, Integer end) {
        int[] results = new int[10];

        for (int i = 0 ; i < 10 ; i++) {
            results[i] = getHowManyTimesTheNumberShow(begin, end, i);
        }

        return results;
    }

    public static void printTheResults(int[] results) {
        for (int i = 0 ; i < results.length ; i++) {
            System.out.print(results[i] + " ");
        }
        System.out.println();
    }
}
