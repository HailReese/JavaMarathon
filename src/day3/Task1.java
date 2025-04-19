package day3;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String command;
		do {
			command = sc.nextLine();
			switch (command) {
				case "Москва":
				case "Владивосток":
				case "Ростов":
					System.out.println("Россия");
					break;
				case "Рим":
				case "Милан":
				case "Турин":
					System.out.println("Италия");
					break;
				case "Ливерпуль":
				case "Манчестер":
				case "Лондон":
					System.out.println("Англия");
					break;
				case "Берлин":
				case "Мюнхен":
				case "Кёльн":
					System.out.println("Германия");
					break;
				default:
					System.out.println("Неизвестная страна");
			}
		} while (!command.equals("Stop"));
		System.out.println("Программа завершена.");
		sc.close();
	}
}
