package day12.Task4;

public class Program {
	public static void main(String[] args) {
		MusicBand metallica = new MusicBand("Metallica", 1981);
		MusicBand corn = new MusicBand("Corn", 1993);

		metallica.addMember("James Hetfield");
		metallica.addMember("Lars Ulrich");
		metallica.addMember("Kirk Hammett");
		metallica.addMember("Robert Trujillo");

		corn.addMember("Jonathan Davis");
		corn.addMember("James Shaffer");
		corn.addMember("Reginald Arvizu");
		corn.addMember("Brian Weich");
		corn.addMember("Ray Luzier");

		MusicBand.transferMembers(metallica, corn);
		corn.printMembers();

	}
}
