import java.util.Scanner;

public class Board {
    
    private Integer size;
    private Square[][] squares;

    public Board(Integer size, Scanner scanner) {
        this.size = size;
        squares = new Square[size][size];
        requestInitialSquares(scanner);
    }

    private void requestInitialSquares(Scanner scanner) {
        for (int i = 0 ; i < size ; i++) {
            String lineRequest = scanner.nextLine();
            for (int j = 0 ; j < size ; j++) {
                squares[i][j] = new Square(lineRequest.charAt(j), new Position(i, j), this);
            }
        }
    }

    public Integer getSize() {
        return size;
    }

    public Square[][] getSquares() {
        return squares;
    }

    public Square getSquare(Position position) {
        return squares[position.getRow()][position.getColumn()];
    }

    public boolean positionExists(Position position) {
        return position.getRow() >= 0 && position.getRow() < size && position.getColumn() >= 0 && position.getColumn() < size;
    }

    
}
