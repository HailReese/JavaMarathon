package day17.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<ChessPiece> chessEnum = new ArrayList<>();
		chessEnum.add(ChessPiece.PAWN_WHITE);
		chessEnum.add(ChessPiece.PAWN_WHITE);
		chessEnum.add(ChessPiece.PAWN_WHITE);
		chessEnum.add(ChessPiece.PAWN_WHITE);
		chessEnum.add(ChessPiece.PAWN_BLACK);
		chessEnum.add(ChessPiece.PAWN_BLACK);
		chessEnum.add(ChessPiece.PAWN_BLACK);
		chessEnum.add(ChessPiece.PAWN_BLACK);

		for(ChessPiece piece : chessEnum) {
			System.out.print(piece.getDesignation() + " ");
		}
	}
}
