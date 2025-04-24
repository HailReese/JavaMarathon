package day14.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		printSunDigits(new File("src\\day14\\Task1\\input.txt"));
	}

	public static void printSunDigits(File file) {
		int[] numbers = new int [10];
		try (Scanner sc = new Scanner(file)) {
			int i = 0;
			int result = 0;
			while (sc.hasNextInt()) {
				numbers[i++] = sc.nextInt();
			}
			if (!sc.hasNextInt() && i != 10) {
				throw new ArrayIndexOutOfBoundsException();
			}
			for (int number : numbers) {
				result += number;
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Некорректный входной файл");
		}
	}
}

    
