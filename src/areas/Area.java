package areas;

import screenareas.DisplayAreas;

public abstract class Area {
	private final String entranceText = "Not implemented!";
	private final DisplayAreas area;
	
	public Area(DisplayAreas area) {
		this.area = area;
	}
	
	public String getEntranceText() {
		return entranceText;
	}
}
