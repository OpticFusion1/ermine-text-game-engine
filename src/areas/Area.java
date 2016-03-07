package areas;

import screenareas.DisplayAreas;

public abstract class Area {
	private final String entranceText = "Not implemented!";
	private final DisplayAreas area;
	
	public Area(DisplayAreas area) {
		this.area = area;
		area.deregisterAllActions();
		registerNewActions(area);
	}
	
	protected abstract void registerNewActions(DisplayAreas area);
	
	public String getEntranceText() {
		return entranceText;
	}
}
