package day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		int[][] numbers = new int[8][12];
		int[] sumOfNumbers = new int[8];
		int indexOfMaxSum = 0;
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = random.nextInt(50);
				sumOfNumbers[i] += numbers[i][j];
			}
			if (sumOfNumbers[i] >= sumOfNumbers[indexOfMaxSum])
				indexOfMaxSum = i;
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(indexOfMaxSum);
	}
}