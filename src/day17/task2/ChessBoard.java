package day17.task2;

public class ChessBoard {

	public ChessBoard (ChessPiece[][] board) {
		this.board = board;
	}

	private ChessPiece[][] board;

	public void print() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j].getDesignation());
			}
			System.out.println();
		}
	}
}
