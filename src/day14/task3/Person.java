package day14.task3;

public class Person {

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	private String name;
	private int age;

	public String toString() {
		return String.format("{name='%s', year=%d}", name, age);
	}
}
