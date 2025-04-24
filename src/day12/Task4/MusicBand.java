package day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
	public MusicBand(String name, int year) {
		this.name = name;
		this.year = year;
		members = new ArrayList<>();
	}

	private String name;
	private int year;
	private List<String> members;

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public void addMember(String name) {
		members.add(name);
	}

	public void removeMember(String name) {
		members.remove(name);
	}

	public void printMembers() {
		for (String member : members) {
			System.out.println(member);
		}
	}

	public static void transferMembers(MusicBand bandA, MusicBand bandB) {
		bandB.members.addAll(bandA.members);
	}
}
