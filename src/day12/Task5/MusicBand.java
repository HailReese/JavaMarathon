package day12.Task5;

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
	private List<MusicArtist> members;

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public void addMember(String name, int age) {
		members.add(new MusicArtist(name, age));
	}

	public void removeMember(String name) {
		members.removeIf(member -> member.getName().equals(name));
	}

	public void printMembers() {
		for (MusicArtist member : members) {
			System.out.println(member.toString());
		}
	}

	public static void transferMembers(MusicBand bandA, MusicBand bandB) {
		bandB.members.addAll(bandA.members);
	}
}
