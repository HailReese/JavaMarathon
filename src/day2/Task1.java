package day2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Task1 {
	public static void main(String[] args) {
		System.out.print("Введите количество этажей в доме: ");
		int floors = 0;

		try (Scanner sc = new Scanner(System.in)) {
			floors = sc.nextInt();

			if (floors <= 0) {
				System.out.println("Ошибка ввода");
				return;
			}

			if (floors <= 4) {
				System.out.println("Малоэтажный дом");
			} else if (floors <= 8) {
				System.out.println("Среднеэтажный дом");
			} else {
				System.out.println("Многоэтажный дом");
			}

		} catch (InputMismatchException e) {
			System.out.println("Ошибка ввода: введите целое число");
		}
	}
}
