package day4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int count8 = 0, count1 = 0, countEven = 0, countOdd = 0, sum = 0;
			System.out.print("Введите длину массива: ");
			int n = sc.nextInt();
			int[] myArray = new int[n];
			Random random = new Random();
			for (int number : myArray) {
				number = random.nextInt(11);
				if (number > 8)
					count8 += 1;
				if (number == 1)
					count1 += 1;
				if (number % 2 == 0)
					countEven += 1;
				else
					countOdd += 1;
				sum += number;
			}
			System.out.println("Длина массива: " + myArray.length);
			System.out.println("Количество чисел больше 8: " + count8);
			System.out.println("Количество чисел равных 1: " + count1);
			System.out.println("Количество четных чисел: " + countEven);
			System.out.println("Количество нечетных чисел: " + countOdd);
			System.out.println("Сумма всех элементов массива: " + sum);
		} catch (InputMismatchException e) {
			System.out.println("Неверный тип ввода.\nЗавершение программы...");
		}
	}
}
