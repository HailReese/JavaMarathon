package day9;

public class Task1 {
	public static void main(String[] args) {
		Student student = new Student("Eric", "ABC123");
		Teacher teacher = new Teacher("Clara", "Biology");

		System.out.printf("Название учебной группы у студента: %s\n", student.getGroupName());
		System.out.printf("Название предмета у преподавателя: %s\n", teacher.getSubject());

		student.printInfo();
		teacher.printInfo();
	}
}

class Human {

	public Human(String name) {
		this.name = name;
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void printInfo() {
		System.out.printf("Этот человек с именем %s\n", name);
	}
}

class Student extends Human {

	public Student(String name, String groupName) {
		super(name);
		this.groupName = groupName;
	}

	private String groupName;

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void printInfo() {
		super.printInfo();
		System.out.printf("Этот студент с именем %s\n", super.getName());
	}
}

class Teacher extends Human {

	public Teacher(String name, String subject) {
		super(name);
		this.subject = subject;
	}

	private String subject;

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void printInfo() {
		super.printInfo();
		System.out.printf("Этот преподаватель с именем %s\n", super.getName());
	}
}