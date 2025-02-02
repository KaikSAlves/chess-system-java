package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position aux = new Position(0, 0);
		
		if(getColor() == Color.WHITE) {
			aux.setValues(position.getRow() - 1,  position.getColumn());
			if(getBoard().positionExists(aux) && !getBoard().thereIsAPiece(aux)) {
				mat[aux.getRow()][aux.getColumn()] = true;
			}
			
			aux.setValues(position.getRow() - 2,  position.getColumn());
			Position p2 = new Position(position.getRow() - 1,  position.getColumn());
			if(getBoard().positionExists(aux) && !getBoard().thereIsAPiece(aux) && getMoveCount() == 0 && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2)) {
				mat[aux.getRow()][aux.getColumn()] = true;
			}
			
			aux.setValues(position.getRow() - 1,  position.getColumn() - 1);
			if(getBoard().positionExists(aux) && isThereOpponentPiece(aux)) {
				mat[aux.getRow()][aux.getColumn()] = true;
			}
			
			aux.setValues(position.getRow() - 1,  position.getColumn() + 1);
			if(getBoard().positionExists(aux) && isThereOpponentPiece(aux)) {
				mat[aux.getRow()][aux.getColumn()] = true;
			}
			
		}else {
			aux.setValues(position.getRow() + 1,  position.getColumn());
			if(getBoard().positionExists(aux) && !getBoard().thereIsAPiece(aux)) {
				mat[aux.getRow()][aux.getColumn()] = true;
			}
			
			aux.setValues(position.getRow() + 2,  position.getColumn());
			Position p2 = new Position(position.getRow() + 1,  position.getColumn());
			if(getBoard().positionExists(aux) && !getBoard().thereIsAPiece(aux) && getMoveCount() == 0 && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2)) {
				mat[aux.getRow()][aux.getColumn()] = true;
			}
			
			aux.setValues(position.getRow() + 1,  position.getColumn() - 1);
			if(getBoard().positionExists(aux) && isThereOpponentPiece(aux)) {
				mat[aux.getRow()][aux.getColumn()] = true;
			}
			
			aux.setValues(position.getRow() + 1,  position.getColumn() + 1);
			if(getBoard().positionExists(aux) && isThereOpponentPiece(aux)) {
				mat[aux.getRow()][aux.getColumn()] = true;
			}
		}
		
		return mat;
	}

	@Override
	public String toString() {
		return "P";
	}	
	
	

}
