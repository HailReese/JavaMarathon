package day14.Task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		printSunDigits(new File("src\\day14\\Task1\\input.txt"));
	}

	public static void printSunDigits(File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String[] parts = br.readLine().split(" ");
			int result = 0;
			for (String part : parts) {
				int num = Integer.parseInt(part);
				result += num;
			}
			System.out.println(result);
		} catch (IOException e) {
			System.out.println("Некорректный входной файл");
		}
	}
}

    
