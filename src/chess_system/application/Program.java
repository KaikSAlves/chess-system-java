package chess_system.application;

import chess.ChessMatch;
import chess_system.application.boardgame.Board;

public class Program {
	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
}
