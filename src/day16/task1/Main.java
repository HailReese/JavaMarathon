package day16.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		printResult(new File("src\\day16\\task1\\input.txt"));
	}

	public static void printResult(File file) {
		try (Scanner sc = new Scanner(file)) {
			int n = 0;
			int sum = 0;
			while (sc.hasNextInt()) {
				n++;
				sum += sc.nextInt();
			}
			double result = (double)sum/n;
			System.out.printf(result + " -> %.3f", result);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
