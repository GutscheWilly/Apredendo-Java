import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = requestMatrix(scanner);
        System.out.println(parOfCornersBetweenSpecialStreets(matrix));
    }

    public static int[][] requestMatrix(Scanner scanner) {
        int size = scanner.nextInt() - 1;
        int[][] matrix = new int[size][3];

        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[0].length ; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix; 
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[0].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean hasSpecialStreet(int[][] matrix, int row) {
        return matrix[row][2] == 1;
    }

    public static int parOfCornersBetweenSpecialStreets(int[][] matrix) {
        int parOfCornersBetweenSpecialStreets = 0;

        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = i ; j < matrix.length ; j++) {
                if (hasSpecialStreet(matrix, j)) {
                    parOfCornersBetweenSpecialStreets++;
                }
            }
        }
        return parOfCornersBetweenSpecialStreets;
    }
}

