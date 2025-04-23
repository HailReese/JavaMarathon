package day12.Task1;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("BMW");
		list.add("Mers");
		list.add("Lada");
		list.add("Audi");
		list.add(3, "Volga");

		System.out.println(list.toString());

		list.removeFirst();

		System.out.println(list.toString());
	}
}
