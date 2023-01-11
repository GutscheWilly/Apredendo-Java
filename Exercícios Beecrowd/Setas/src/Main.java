import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer matrixSize = scanner.nextInt();
        scanner.nextLine();

        Board board = new Board(matrixSize, scanner);

        System.out.println(board.quantityOfSafeArrows());
        scanner.close();
    }
}
