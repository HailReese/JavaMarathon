package FinalProjectBattleship;

import java.util.InputMismatchException;
import java.util.Scanner;

import FinalProjectBattleship.Exceptions.HaloException;
import FinalProjectBattleship.Exceptions.IncorrectAmountOfCoordinates;
import FinalProjectBattleship.Exceptions.IncorrectAmountOfCoordinatesException;
import FinalProjectBattleship.Exceptions.IncorrectCoordinatesException;
import FinalProjectBattleship.Exceptions.InvalidShipException;
import FinalProjectBattleship.Exceptions.MimatchCoordinateException;
import FinalProjectBattleship.Exceptions.PlaceIsNotEmptyException;

public class Main {
	public static void main(String[] args) {
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
				} else {
					throw new InputMismatchException();
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

				int commonCoordinate = 0;
				boolean checkCommon = false;
				for (int i = 0; i < coordinates.length; i++) {
					if (!checkCommon) {
						if (coordinates[i][0] == coordinates[i+1][0]) {
							commonCoordinate = coordinates[i][0];
							checkCommon = true;
						} else if (coordinates[i][1] == coordinates[i+1][1]) {
							commonCoordinate = coordinates[i][1];
							checkCommon = true;
						} else {

						}
					} else {

					}
					if (coordinates[i][0] == coordinates[i-1][0])
				}
			} catch (IncorrectCoordinatesException e) {
				System.out.println("Некорректные входные данные. Каждая координата должна быть в диапазоне от 0 до 9 включительно.");
			} catch (IncorrectAmountOfCoordinatesException e) {
				System.out.println("Некорректное количество координат");
			} catch (InvalidShipException e) {
				System.out.println("Невалидный корабль. Корабль должен распоалагаться по вертикали или горизонтали в последовательно идущих клетках.");
			} catch (PlaceIsNotEmptyException e) {
				System.out.println("Данные координаты уже заняты");
			} catch (HaloException e) {
				System.out.println("Корабль должен распоалагаться в минимум одной клетке от соседнего.");
			}
		} while (amountOfShips < 1);
	}
}
