package day14.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		System.out.println(parseFileToObjList(new File("src\\day14\\task3\\people.txt")));
	}

	public static List<Person> parseFileToObjList(File file) {
		List<Person> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			int i = 0;
			while (br.ready()) {
				String[] parts = new String[2];
				parts = br.readLine().split(" ");
				if (Integer.parseInt(parts[1]) < 0)
					throw new IOException();
				list.add(new Person(parts[0], Integer.parseInt(parts[1])));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Incorrect input file");
		}
		return list;
	}
}
