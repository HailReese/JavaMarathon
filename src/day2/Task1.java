package day2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.print("Введи сколько этажей в доме: ");
		int floors = 0;
		try (Scanner sc = new Scanner(System.in)) {
			floors = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Вы ввели неверное число");
			return;
		}
	}
}
