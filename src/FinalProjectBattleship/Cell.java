package FinalProjectBattleship;

public enum Cell {
	EMPTY("☐"), SHIP("★"), SHOOT("☑"), KILLED("☒");

	private Cell(String icon) { this.icon = icon; }
	private String icon;

	public String getIcon() { return icon; }
}
