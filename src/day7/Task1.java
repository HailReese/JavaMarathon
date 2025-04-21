package day7;

public class Task1 {
	public static void main(String[] args) {
		Airplane plane1 = new Airplane("Boing", 2010, 98, 68000);
		Airplane plane2 = new Airplane("SuperJet", 2023, 50, 45000);
		Airplane.compareAirplanes(plane1, plane2);
	}
}

class Airplane {

	public Airplane(String producer, int year, double length, double weight) {
		this.producer = producer;
		this.year = year;
		this.length = length;
		this.weight = weight;
	}

	private String producer;
	private int year;
	private double length;
	private double weight;
	private double fuel = 0;

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public void setYear(int year) {
		if (year > 2025)
			this.year = 2025;
		else if (year < 1903)
			this.year = 1903;
		else
			this.year = year;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getFuel() {
		return fuel;
	}

	public void info() {
		System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %.2f, вес: %.2f, количество топлива в баке: %.2f",
				producer, year, length, weight, fuel);
	}

	public void fillUp(double fuel) {
		if (fuel > 10000)
			this.fuel = 10000;
		else
			this.fuel = fuel;
	}

	public static void compareAirplanes(Airplane plane1, Airplane plane2) {
		if (plane1.length > plane2.length) {
			System.out.println("Первый самолет длиннее");
		} else if (plane1.length < plane2.length) {
			System.out.println("Второй самолет длиннее");
		} else {
			System.out.println("Оба самолета одинаковой длины");
		}
	}
}