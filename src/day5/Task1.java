package day5;

public class Task1 {
	public static void main(String[] args) {
		Car car = new Car();
		car.setReleaseYear(2007);
		car.setColor("Red");
		car.setModel("BMW");
		System.out.println(car.getReleaseYear());
		System.out.println(car.getColor());
		System.out.println(car.getModel());
	}
}

class Car {

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

}
