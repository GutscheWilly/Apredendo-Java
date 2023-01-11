public class Square {
    
    private char arrowDirection;
    private Position position;
    private Board board;
    private boolean safeArrow;

    public Square(char arrowDirection, Position position, Board board) {
        this.arrowDirection = arrowDirection;
        this.position = position;
        this.board = board;
        safeArrow = board.positionExists(targetPosition());
    }

    public char getArrowDirection() {
        return arrowDirection;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isSafeArrow() {
        return safeArrow;
    }

    public void setSafeArrow(Boolean safeArrow) {
        this.safeArrow = safeArrow;
    }

    public Board getBoard() {
        return board;
    }

    public Position targetPosition() {
        switch (arrowDirection) {
            case 'V':
                return new Position(position.getRow() + 1, position.getColumn());
            case '<':
                return new Position(position.getRow(), position.getColumn() - 1);
            case '>':
                return new Position(position.getRow(), position.getColumn() + 1);
            case 'A':
                return new Position(position.getRow() - 1, position.getColumn());
        }
        return null;
    }
}
