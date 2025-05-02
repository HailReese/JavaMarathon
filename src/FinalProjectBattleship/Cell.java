package FinalProjectBattleship;

public enum Cell {
	EMPTY("☐"), BUSY("☐"), SHIP("★"), SHOOT("☑"), KILLED("☒");

	private Cell(String icon) { this.icon = icon; }
	private String icon;

	public String toString() { return icon; }
}
