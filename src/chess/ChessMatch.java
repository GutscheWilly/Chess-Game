package chess;

import boardgame.Board;
import chess.enums.Color;
import chess.pieces.*;

public class ChessMatch {
    
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    public void initialSetup() {
        placeNewPiece('e', 4, new King(board, Color.BLACK));
        placeNewPiece('h', 8, new Rook(board, Color.WHITE));
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0 ; i < board.getRows() ; i++) {
            for (int j = 0 ; j < board.getColumns() ; j++) {
                matrix[i][j] = (ChessPiece)board.piece(i, j);
            }
        }
        return matrix;
    }
}
