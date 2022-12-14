package boardgame;

public abstract class Piece {
    
    protected Position position;
    private Board board;

    public Piece(Board board) {
        position = null;
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] matrix = possibleMoves();
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix.length ; j++) {
                if (matrix[i][j] == true) {
                    return true;
                }
            }
        }
        return false;
    } 
}
