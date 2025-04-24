package day12.Task2;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i <= 350; i++) {
			if (i == 31)
				i = 300;
			if (i % 2 == 0) {
				list.add(i);
			}
		}
		System.out.println(list.toString());
	}
}
