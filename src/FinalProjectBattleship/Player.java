package FinalProjectBattleship;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {

	private Player() {
		playerField = new Cell[][] {
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
		};

		opponentField = new Cell[][] {
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
			{Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY},
		};
	}

	private Cell[][] playerField;
	private Cell[][] opponentField;

	public void initField() {
		System.out.println("Начнем расставлять корабли на поле Player1. Другой игрок, не смотри!");
		// addFourDeckShip();
		// addThreeDeckShips();
		// addTwoDeckShips();
		// addSingleDeckShips();
	}

	private void addFourDeckShip() {
		int amountOfShips = 0;
		do {
			System.out.println("Введи координаты четырёхпалубного корабля (формат: x,y;x,y;x,y;x,y)");
			try {
				Scanner sc = new Scanner(System.in);
				String str = sc.nextLine();
				str = str.replaceAll(" ", "");
				if (str.length() == 15) {
					char[] chars = str.toCharArray();
					if (chars[1] == ',' && chars[5] == ',' && chars[9] == ',' && chars[13] == ',' && chars[3] == ';' && chars[7] == ';' && chars[11] == ';') {
						for (int i = 0; i < chars.length; i += 2) {
							if (!Character.isDigit(chars[i])) {
								throw new InputMismatchException();
							}
						}
					} else {
						throw new InputMismatchException();
					}
				}
				String[] parts = str.split(";", 4);
				String[][] coordinatesString = new String[4][2];
				int[][] coordinates = new int[4][2];

				for (int i = 0; i < coordinatesString.length; i++) {
					coordinatesString[i] = parts[i].split(",", 2);
					for (int j = 0; j < coordinatesString[i].length; j++) {
						coordinates[i][j] = Integer.parseInt(coordinatesString[i][j]);
						if (coordinates[i][j] > 9 || coordinates[i][j] < 0) {
							throw new InputMismatchException();
						}
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("Некорректные данные");
			}
			


		} while (amountOfShips < 1);
	}

	private void addThreeDeckShips(Cell[][] grid) {

	}

	private void addTwoDeckShips(Cell[][] grid) {

	}

	private void addSingleDeckShips(Cell[][] grid) {

	}
}
