package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		int maxNumber = 0, minNumber = 0, count0 = 0, sum0 = 0;
		Random random = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(10000);
			if (i != 0) {
				if (numbers[i] < minNumber)
					minNumber = numbers[i];
				if (numbers[i] > maxNumber)
					maxNumber = numbers[i];
			} else {
				minNumber = numbers[i];
				maxNumber = numbers[i];
			}
			if (numbers[i] % 10 == 0 || numbers[i] == 0) {
				count0++;
				sum0 += numbers[i];
			}
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println("Наибольший элемент массива: " + maxNumber);
		System.out.println("Наименьший элеменет массива: " + minNumber);
		System.out.println("Количество элементов массива, оканчивающихся на 0: " + count0);
		System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum0);
	}
}
