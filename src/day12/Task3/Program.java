package day12.Task3;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<MusicBand> bands = new ArrayList<>();
		bands.add(new MusicBand("Corn", 1993));
		bands.add(new MusicBand("Metallica", 1981));
		bands.add(new MusicBand("Polyphia", 2011));
		bands.add(new MusicBand("SOAD", 1994));
		bands.add(new MusicBand("Northlane", 2009));

		List<MusicBand> bandsAfter2000 = groupsAfter2000(bands);

		for (MusicBand band : bands) {
			System.out.println(band.getName());
		}
		System.out.println();
		for (MusicBand band : bandsAfter2000) {
			System.out.println(band.getName());
		}
	}

	public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
		List<MusicBand> rockBandsAfter2000 = new ArrayList<>();
		for (MusicBand band : bands) {
			if (band.getYear() > 2000)
				rockBandsAfter2000.add(band);
		}
		return rockBandsAfter2000;
	}

}
