package day9;

public class Task2 {
	public static void main(String[] args) {
		Figure[] figures = {
				new Triangle(10, 10, 10, "Red"),
				new Triangle(10, 20, 30, "Green"),
				new Triangle(10, 20, 15, "Red"),
				new Rectangle(5, 10, "Red"),
				new Rectangle(40, 15, "Orange"),
				new Circle(4, "Red"),
				new Circle(10, "Red"),
				new Circle(5, "Blue")
		};

		System.out.println(calculateRedArea(figures));
		System.out.println(calculateRedPerimeter(figures));
	}

	public static double calculateRedPerimeter(Figure[] figures) {
		double result = 0;
		for (Figure figure : figures) {
			if (figure.getColor() == "Red")
				result += figure.area();
		}
		return result;
	}

	public static double calculateRedArea(Figure[] figures) {
		double result = 0;
		for (Figure figure : figures) {
			if (figure.getColor() == "Red")
				result += figure.perimeter();
		}
		return result;
	}
}

abstract class Figure {

	public Figure(String color) {
		this.color = color;
	}

	private String color;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public abstract double area();

	public abstract double perimeter();
}

class Circle extends Figure {
	public Circle(double radius, String color) {
		super(color);
		this.radius = radius;
	}

	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double area() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double perimeter() {
		return Math.PI * Math.pow(radius, 2);
	}
}

class Rectangle extends Figure {

	public Rectangle(double width, double height, String color) {
		super(color);
		this.width = width;
		this.height = height;
	}

	private double width;
	private double height;

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public double perimeter() {
		return (width + height) * 2;
	}
}

class Triangle extends Figure {
	public Triangle(double partA, double partB, double partC, String color) {
		super(color);
		this.partA = partA;
		this.partB = partB;
		this.partC = partC;
	}

	private double partA;
	private double partB;
	private double partC;

	public void setPartA(double partA) {
		this.partA = partA;
	}

	public double getPartA() {
		return partA;
	}

	public void setPartB(double partB) {
		this.partB = partB;
	}

	public double getPartB() {
		return partB;
	}

	public void setPartC(double partC) {
		this.partC = partC;
	}

	public double getPartC() {
		return partC;
	}

	@Override
	public double area() {
		double p = partA + partB + partC;
		return Math.sqrt(p / 2) * (p - partA) * (p - partB) * (p - partB);
	}

	@Override
	public double perimeter() {
		return partA + partB + partC;
	}
}