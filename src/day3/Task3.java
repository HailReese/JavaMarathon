package day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		double divident, divisor;
		int i = 0;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("Введите делимое: ");
				divident = sc.nextDouble();
				System.out.print("Введите делитель: ");
				divisor = sc.nextDouble();
				if (divisor == 0) {
					System.out.println("Деление на 0");
					continue;
				}
				System.out.println("Результат деления: " + divident / divisor);
				i++;
			} while (i < 5);

		} catch (InputMismatchException e) {
			System.out.println("Неверный тип ввода.\nЗавершение программы...");
		}
	}
}
