package day6;

public class Task2 {
	public static void main(String[] args) {
		Airplane plane = new Airplane("Boing", 1999, 50, 20000);
		plane.setYear(2039);
		plane.setLength(45);
		plane.fillUp(7854);
		plane.fillUp(2344);
		plane.info();
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
}
