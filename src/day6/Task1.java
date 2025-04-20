package day6;

public class Task1 {
	public static void main(String[] args) {
		Car car = new Car();
		car.setReleaseYear(1989);
		car.setColor("White");
		car.setModel("Toyota");

		Motorbike moto = new Motorbike(2023, "Yellow", "Yamaha");

		System.out.println(car.info() + "\n" + car.getReleaseYear() + "\n" + car.getColor() + "\n" + car.getModel());
		System.out.println();
		System.out.println(moto.info() + "\n" + moto.getReleaseYear() + "\n" + moto.getColor() + "\n" + moto.getModel());
	}
}

class Car {

	private String info = "Это автомобиль";
	private int releaseYear;
	private String color;
	private String model;

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public String info() {
		return info;
	}
}

class Motorbike {

	public Motorbike(int releaseYear, String color, String model) {
		this.releaseYear = releaseYear;
		this.color = color;
		this.model = model;
	}

	private String info = "Это мотоцикл";
	private int releaseYear;
	private String color;
	private String model;

	public int getReleaseYear() {
		return releaseYear;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public String info() {
		return info;
	}
}