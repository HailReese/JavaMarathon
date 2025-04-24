package day12.Task5;

public class Program {
	public static void main(String[] args) {
		MusicBand metallica = new MusicBand("Metallica", 1981);
		MusicBand corn = new MusicBand("Corn", 1993);

		metallica.addMember("James Hetfield", 61);
		metallica.addMember("Lars Ulrich", 61);
		metallica.addMember("Kirk Hammett", 62);
		metallica.addMember("Robert Trujillo", 60);

		corn.addMember("Jonathan Davis", 54);
		corn.addMember("James Shaffer", 54);
		corn.addMember("Reginald Arvizu", 55);
		corn.addMember("Brian Weich", 54);
		corn.addMember("Ray Luzier", 54);

		MusicBand.transferMembers(metallica, corn);
		corn.printMembers();
	}
}
