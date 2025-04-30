package day16.task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Random rd = new Random();
		PrintWriter pw1 = new PrintWriter(new FileWriter("src\\day16\\task2\\file1.txt"));
		PrintWriter pw2 = new PrintWriter(new FileWriter("src\\day16\\task2\\file2.txt"));
		Scanner sc1 = new Scanner(new FileReader("src\\day16\\task2\\file1.txt"));
		Scanner sc2 = new Scanner(new FileReader("src\\day16\\task2\\file2.txt"));
		for (int i = 0; i < 1000; i++) {
			pw1.print(rd.nextInt(0, 100) + " ");
		}
		int i = 1;
		int result = 0;
		while (sc1.hasNextInt()) {
			result += sc1.nextInt();
			if (i == 20) {
				i = 1;
				pw2.print(result/(double)20 + " ");
				result = 0;
			} else
				i++;
		}
		pw1.close();
		pw2.close();
		sc1.close();
		double sum = 0;
		while (sc2.hasNextDouble()) {
			sum += sc2.nextDouble();
		}
		sc2.close();
		System.out.println((int)sum);
	}
}
