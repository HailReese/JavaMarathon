package FinalProjectBattleship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import FinalProjectBattleship.Exceptions.HaloException;
import FinalProjectBattleship.Exceptions.IncorrectAmountOfCoordinatesException;
import FinalProjectBattleship.Exceptions.IncorrectCoordinatesException;
import FinalProjectBattleship.Exceptions.InvalidShipException;
import FinalProjectBattleship.Exceptions.PlaceIsNotEmptyException;

public class Main {
	public static void main(String[] args) {
		Cell[][] playerField = new Cell[][] {
				{ Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.EMPTY },
				{ Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.EMPTY },
				{ Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.EMPTY },
				{ Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.EMPTY },
				{ Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.EMPTY },
				{ Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.EMPTY },
				{ Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.EMPTY },
				{ Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.EMPTY },
				{ Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.EMPTY },
				{ Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY, Cell.EMPTY,
						Cell.EMPTY, Cell.EMPTY },
		};

		int amountOfShips = 0;
		do {
			System.out.println("Введи координаты четырёхпалубного корабля (формат: x,y;x,y;x,y;x,y)");
			try {
				Scanner sc = new Scanner(System.in);
				String str = sc.nextLine();
				str = str.replaceAll(" ", "");

				// Проверка на количество координат
				String numbers = str.replaceAll(";", "").replaceAll(",", "");
				if (numbers.length() != 8)
					throw new IncorrectAmountOfCoordinatesException();

				// Проверка на корректность координат
				if (str.length() == 15) {
					char[] chars = str.toCharArray();
					if (chars[1] == ',' && chars[5] == ',' && chars[9] == ',' && chars[13] == ',' && chars[3] == ';'
							&& chars[7] == ';' && chars[11] == ';') {
						for (int i = 0; i < chars.length; i += 2) {
							if (!Character.isDigit(chars[i])) {
								throw new IncorrectCoordinatesException();
							}
						}
					} else {
						throw new IncorrectCoordinatesException();
					}
				} else {
					throw new IncorrectCoordinatesException();
				}
				// считывание координат и проверка на корректность
				String[] parts = str.split(";", 4);
				String[][] coordinatesString = new String[4][2];
				int[][] coordinates = new int[4][2];
				for (int i = 0; i < coordinatesString.length; i++) {
					coordinatesString[i] = parts[i].split(",", 2);
					for (int j = 0; j < coordinatesString[i].length; j++) {
						coordinates[i][j] = Integer.parseInt(coordinatesString[i][j]);
						if (coordinates[i][j] > 9 || coordinates[i][j] < 0) {
							throw new IncorrectCoordinatesException();
						}
					}
				}

				// проверка на валидность корабля
				int commonCoordinate = 0;
				int commonIndex = 0;
				boolean checkCommon = false;
				List<Integer> temp = new ArrayList<>();
				for (int i = 0; i < coordinates.length; i++) {
					if (!checkCommon) {
						if (coordinates[i][0] == coordinates[i + 1][0]) {
							commonCoordinate = coordinates[i][0];
							commonIndex = 0;
							checkCommon = true;
						} else if (coordinates[i][1] == coordinates[i + 1][1]) {
							commonCoordinate = coordinates[i][1];
							commonIndex = 1;
							checkCommon = true;
						} else {
							throw new InvalidShipException();
						}
					}

					if (commonIndex == 0) {
						if (coordinates[i][0] != commonCoordinate)
							throw new InvalidShipException();
						if (temp.contains(coordinates[i][1])) {
							throw new InvalidShipException();
						}
						temp.add(coordinates[i][1]);
					} else if (commonIndex == 1) {
						if (coordinates[i][1] != commonCoordinate)
							throw new InvalidShipException();
						if (temp.contains(coordinates[i][0])) {
							throw new InvalidShipException();
						}
						temp.add(coordinates[i][0]);
					}
				}
				Collections.sort(temp);
				int tempValue = 0;
				for (int i = 0; i < temp.size(); i++) {
					if (i == 0)
						tempValue = temp.get(0);
					if (temp.get(i) != tempValue + i)
						throw new InvalidShipException();
				}
				// проверка на то что на данных координатах нет другого корабля и вокруг него
				// есть свободный ореол
				for (int i = 0; i < coordinates.length; i++) {
					if (playerField[commonCoordinate][temp.get(i)] != Cell.EMPTY) {
						throw new PlaceIsNotEmptyException();
					} else {
						if (commonIndex == 0) {
							// добавление корабля на поле и ореола вокруг него
							playerField[commonCoordinate][temp.get(i)] = Cell.SHIP;
							if (i == 0) {
								if (commonCoordinate != 0) {
									playerField[commonCoordinate - 1][temp.get(i) - 1] = Cell.BUSY;
									playerField[commonCoordinate - 1][temp.get(i)] = Cell.BUSY;
									playerField[commonCoordinate - 1][temp.get(i) + 1] = Cell.BUSY;
								}
								if (temp.get(i) != 0)
									playerField[commonCoordinate][temp.get(i) - 1] = Cell.BUSY;
								if (temp.get(i) != 9)
									playerField[commonCoordinate][temp.get(i) + 1] = Cell.BUSY;
							} else if (i + 1 == coordinates.length) {
								if (commonCoordinate != 9) {
									playerField[commonCoordinate + 1][temp.get(i) - 1] = Cell.BUSY;
									playerField[commonCoordinate + 1][temp.get(i)] = Cell.BUSY;
									playerField[commonCoordinate + 1][temp.get(i) + 1] = Cell.BUSY;
								}
								if (temp.get(i) != 0)
									playerField[commonCoordinate][temp.get(i) - 1] = Cell.BUSY;
								if (temp.get(i) != 9)
									playerField[commonCoordinate][temp.get(i) + 1] = Cell.BUSY;
							} else {
								if (temp.get(i) != 0)
									playerField[commonCoordinate][temp.get(i) + 1] = Cell.BUSY;
								if (temp.get(i) != 9)
									playerField[commonCoordinate][temp.get(i) - 1] = Cell.BUSY;
							}
						} else if (commonIndex == 1) {
							// добавление корабля на поле и ореола вокруг него
							playerField[commonCoordinate][temp.get(i)] = Cell.SHIP;
							if (i == 0) {
								if (commonCoordinate != 0) {
									playerField[commonCoordinate - 1][temp.get(i) - 1] = Cell.BUSY;
									playerField[commonCoordinate - 1][temp.get(i)] = Cell.BUSY;
									playerField[commonCoordinate - 1][temp.get(i) + 1] = Cell.BUSY;
								}
								if (temp.get(i) != 0)
									playerField[commonCoordinate][temp.get(i) - 1] = Cell.BUSY;
								if (temp.get(i) != 9)
									playerField[commonCoordinate][temp.get(i) + 1] = Cell.BUSY;
							} else if (i + 1 == coordinates.length) {
								if (commonCoordinate != 9) {
									playerField[commonCoordinate + 1][temp.get(i) - 1] = Cell.BUSY;
									playerField[commonCoordinate + 1][temp.get(i)] = Cell.BUSY;
									playerField[commonCoordinate + 1][temp.get(i) + 1] = Cell.BUSY;
								}
								if (temp.get(i) != 0)
									playerField[commonCoordinate][temp.get(i) - 1] = Cell.BUSY;
								if (temp.get(i) != 9)
									playerField[commonCoordinate][temp.get(i) + 1] = Cell.BUSY;
							} else {
								if (temp.get(i) != 0)
									playerField[commonCoordinate][temp.get(i) + 1] = Cell.BUSY;
								if (temp.get(i) != 9)
									playerField[commonCoordinate][temp.get(i) - 1] = Cell.BUSY;
							}
						}
					}
				}

			} catch (IncorrectCoordinatesException e) {
				System.out.println(
						"Некорректные входные данные. Каждая координата должна быть в диапазоне от 0 до 9 включительно.");
			} catch (NumberFormatException e) {
				System.out.println(
						"Некорректные входные данные. Каждая координата должна быть в диапазоне от 0 до 9 включительно.");
			} catch (IncorrectAmountOfCoordinatesException e) {
				System.out.println("Некорректное количество координат");
			} catch (InvalidShipException e) {
				System.out.println(
						"Невалидный корабль. Корабль должен располагаться по вертикали или горизонтали в последовательно идущих клетках.");
			} catch (PlaceIsNotEmptyException e) {
				System.out.println("Данные координаты уже заняты");
			} catch (HaloException e) {
				System.out.println(
						"Корабль должен располагаться на расстоянии минимум одной свободной клетки от соседнего.");
			}
		} while (amountOfShips < 1);
	}
}
