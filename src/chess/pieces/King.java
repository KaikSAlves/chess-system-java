package chess.pieces;

import chess.ChessPiece;
import chess.Color;
import chess_system.application.boardgame.Board;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "♚";
	}
	
}
