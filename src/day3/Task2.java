package day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double divident, divisor;
			do {
				System.out.print("Введите делимое: ");
				divident = sc.nextDouble();
				System.out.print("Введите делитель: ");
				divisor = sc.nextDouble();
				System.out.println("Результат деления: " + divident / divisor);
			} while (divisor != 0);
			System.out.println("Завершение программы...");
		} catch (InputMismatchException e) {
			System.out.println("Неверный тип ввода.\nЗавершение программы...");
		}
	}
}
