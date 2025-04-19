package day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int a = 0, b = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите число a: ");
			a = sc.nextInt();
			System.out.print("\nВведите число b: ");
			b = sc.nextInt();
			for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
				if (i % 5 == 0 && i % 10 != 0)
					System.out.println(i);
			}
		} catch (InputMismatchException e) {
			System.out.println("Ошибка ввода, неверный тип ввода.\nЗакрытие программы...");
		}

	}
}
