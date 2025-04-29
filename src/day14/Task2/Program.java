package day14.Task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		System.out.println(parseFileToStringList(new File("src\\day14\\Task2\\people.txt")));
	}

	public static List<String> parseFileToStringList(File file) {
		List<String> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			int i = 0;
			while (br.ready()) {
				list.add(br.readLine());
				String[] parts = new String[2];
				String str = list.get(i);
				parts = list.get(i).split(" ");
				if (Integer.parseInt(parts[1]) < 0)
					throw new IOException();
				i++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Incorrect input file");
		}
		return list;
	}
}
