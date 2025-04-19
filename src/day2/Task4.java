package day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите х: ");
			double x = sc.nextInt();
			double y = 0.0;
			if (x > -3) {
				if (x >= 5) {
					y = ((Math.pow(x, 2) - 10) / (x + 7));
				} else {
					y = ((x + 3) * (Math.pow(x, 2) - 2));
				}
			} else {
				y = 420.0;
			}
			System.out.println("Значение y равно: " + y);
		} catch (InputMismatchException e) {
			System.out.println("Ошибка ввода, неверный тип ввода.\nЗакрытие программы...");
		}
	}
}
