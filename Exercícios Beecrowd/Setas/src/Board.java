import java.util.Scanner;

public class Board {
    
    private Integer size;
    private Square[][] squareMatrix;

    public Board(Integer size, Scanner scanner) {
        this.size = size;
        squareMatrix = new Square[size][size];
        requestInitialSquareMatrix(scanner);
    }

    private void requestInitialSquareMatrix(Scanner scanner) {
        for (int i = 0 ; i < size ; i++) {
            String lineRequest = scanner.nextLine();
            for (int j = 0 ; j < size ; j++) {
                squareMatrix[i][j] = new Square(lineRequest.charAt(j), new Position(i, j), this);
            }
        }
        assignSafeArrows();
    }
    
    private void assignSafeArrows() {
        for (int i = 0 ; i < size ; i++) {
            for (int j = 0 ; j < size ; j++) {
                Square currentSquare = squareMatrix[i][j];
                Square targetSquare = getSquare(currentSquare.targetPosition());
                if (currentSquare.isSafeArrow() && !targetSquare.isSafeArrow()) {
                    currentSquare.setSafeArrow(false);
                    assignSafeArrows();
                    break;
                }
            }
        }
    }

    public Integer getSize() {
        return size;
    }

    public Square[][] getSquareMatrix() {
        return squareMatrix;
    }

    public Square getSquare(Position position) {
        if (!positionExists(position)) {
            return null;
        }
        return squareMatrix[position.getRow()][position.getColumn()];
    }

    public boolean positionExists(Position position) {
        return position.getRow() >= 0 && position.getRow() < size && position.getColumn() >= 0 && position.getColumn() < size;
    }

    public Integer quantityOfSafeArrows() {
        Integer quantityOfSafeArrows = 0;

        for (int i = 0 ; i < size ; i++) {
            for (int j = 0 ; j < size ; j++) {
                if (squareMatrix[i][j].isSafeArrow()) {
                    quantityOfSafeArrows++;
                }
            }
        }

        return quantityOfSafeArrows;
    }
}
