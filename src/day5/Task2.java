package day5;

public class Task2 {
	public static void main(String[] args) {
		Motorbike moto = new Motorbike(2013, "black", "Ducati");
		System.out.println(moto.getReleaseYear());
		System.out.println(moto.getColor());
		System.out.println(moto.getModel());
	}
}

class Motorbike {

	public Motorbike(int releaseYear, String color, String model) {
		this.releaseYear = releaseYear;
		this.color = color;
		this.model = model;
	}

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
}
