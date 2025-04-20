package day6;

import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Kiara", "Math");
		Student student = new Student("James");

		teacher.evaluate(student);
	}
}

class Teacher {
	public Teacher(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}

	private String name;
	private String subject;

	public void evaluate(Student student) {
		Random random = new Random();
		int score = random.nextInt(2, 6);
		System.out.printf("Преподаватель %s оценил(а) студента с именем %s по предмету %s на оценку %d", name,
				student.getName(), subject, score);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}
}

class Student {
	public Student(String name) {
		this.name = name;
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}