package day12.Task5;

public class MusicArtist {
	public MusicArtist(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return String.format("%s : %d", name, age);
	}
}
