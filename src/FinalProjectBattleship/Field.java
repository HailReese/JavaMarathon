package FinalProjectBattleship;

public class Field {
	public Field(Cell[][] cellsPlayer1, Cell[][] cellsPlayer2) {
		this.cellsPlayer1 = cellsPlayer1;
		this.cellsPlayer2 = cellsPlayer2;
	}

	private Cell[][] cellsPlayer1;
	private Cell[][] cellsPlayer2;

	public void updateField(Cell[][] cellsPlayer1, Cell[][] cellsPlayer2) {
		this.cellsPlayer1 = cellsPlayer1;
		this.cellsPlayer2 = cellsPlayer2;
	}

	public void printFieldPlayer1(Cell[][] cellsPlayer1) {
		for (int i = 0; i < cellsPlayer1.length; i++) {
			for (int j = 0; j < cellsPlayer1[i].length; j++) {
				System.out.print(cellsPlayer1[i][j]);
			}
			System.out.println();
		}
	}

	public void printFieldPlayer2(Cell[][] cellsPlayer2) {
		for (int i = 0; i < cellsPlayer2.length; i++) {
			for (int j = 0; j < cellsPlayer2[i].length; j++) {
				System.out.print(cellsPlayer2[i][j]);
			}
			System.out.println();
		}
	}
}
