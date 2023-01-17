import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = requestMatrix(scanner);
        boolean isLetterMatrix = isLatterMatrix(matrix);
        printResult(isLetterMatrix);
        scanner.close();
    }

    public static int[][] requestMatrix(Scanner scanner) {
        int numberOfRows = scanner.nextInt();
        int numberOfColumns = scanner.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfColumns];

        for (int i = 0 ; i < numberOfRows ; i++) {
            for (int j = 0 ; j < numberOfColumns ; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static boolean areAllElementsZeroInThatRow(int[][] matrix, int row) {
        for (int j = 0 ; j < matrix[0].length ; j++) {
            if (matrix[row][j] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean testAllRowsAbove(int matrix[][], int row) {
        for (int i = row + 1 ; i < matrix.length ; i++) {
            if (!areAllElementsZeroInThatRow(matrix, i)) {
                return false;
            }
        }
        return true;
    }
    
    public static int columnIndexOfFirstElementDifferentFromZero(int[][] matrix, int row) {
        for (int i = 0 ; i < matrix[0].length ; i++) {
            if (matrix[row][i] != 0) {
                return i;
            }
        }
        return -1;
    }

    public static boolean validateSides(int[][] matrix, int row, int column) {
        for (int i = row ; i < matrix.length ; i++) {
            for (int j = 0 ; j <= column ; j++) {
                if (matrix[i][j] != 0 && !(i == row && j == column)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isLatterMatrix(int[][] matrix) {
        for (int i = 0 ; i < matrix.length ; i++) {
            if (areAllElementsZeroInThatRow(matrix, i)) {
                return testAllRowsAbove(matrix, i);
            }

            int columnIndexOfFirstElementDifferentFromZero = columnIndexOfFirstElementDifferentFromZero(matrix, i);
            if (!validateSides(matrix, i, columnIndexOfFirstElementDifferentFromZero)) {
                return false;
            }
        }
        return true;
    }

    public static void printResult(boolean isLetterMatrix) {
        if (isLetterMatrix) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
