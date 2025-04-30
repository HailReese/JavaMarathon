package day17.task2;

public class Main {
	public static void main(String[] args) {
		ChessPiece[][] board = new ChessPiece[][] {
			{ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
			{ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK}
		};
		ChessBoard chb = new ChessBoard(board);
		chb.print();
	}
}
