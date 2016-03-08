package screenareas;

import javax.swing.JPanel;

import controllers.Action;
import controllers.ActionButton;

public class NavigationArea {
	public enum ButtonNames {NORTH, SOUTH, EAST, WEST, CENTER, NORTHEAST, NORTHWEST, SOUTHEAST, SOUTHWEST};
	
	private ActionButton north, south, east, west, center;
	private ActionButton northeast, northwest, southeast, southwest;
	private JPanel parent;
	
	public NavigationArea(int width, int height, JPanel parent) {
		this.parent = parent;
		north = new ActionButton("North");
		south = new ActionButton("South");
		east = new ActionButton("East");
		west = new ActionButton("West");
		
		center = new ActionButton("Center");
		
		northwest = new ActionButton("Northwest");
		southwest = new ActionButton("Southwest");
		northeast = new ActionButton("Northeast");
		southeast = new ActionButton("Southeast");
		
		parent.add(northwest);
		parent.add(north);
		parent.add(northeast);
		
		parent.add(west);
		parent.add(center);
		parent.add(east);
		
		parent.add(southwest);
		parent.add(south);
		parent.add(southeast);
	}
	
	public ActionButton getButton(ButtonNames btnName) {
		ActionButton btn;
		switch(btnName) {
			case NORTH:
				btn = north;
				break;
			case SOUTH:
				btn = south;
				break;
			case EAST:
				btn = east;
				break;
			case WEST:
				btn = west;
				break;
			
			case NORTHEAST:
				btn = northeast;
				break;
			case NORTHWEST:
				btn = northwest;
				break;
			case SOUTHEAST:
				btn = southeast;
				break;
			case SOUTHWEST:
				btn = southwest;
				break;
			case CENTER:
				btn = center;
				break;
			default:
				btn = null;
				break;
		}
		return btn;
	}

	public void setButtonVisibility(ButtonNames btnName, boolean visible) {
		ActionButton btn = getButton(btnName);
		if (btn != null)
			btn.setVisible(visible);
	}
	
	public void registerAction(ButtonNames btnName, Action action) {
		ActionButton btn = getButton(btnName);
		if (btn != null)
			btn.registerAction(action);
	}
	public void deregisterAction(ButtonNames btnName, Action action) {
		ActionButton btn = getButton(btnName);
		if (btn != null)
			btn.deregisterAction(action);
	}
	public void deregisterAllActions(ButtonNames btnName) {
		ActionButton btn = getButton(btnName);
		if (btn != null)
			btn.deregisterAllActions();
	}
	public void deregisterAllActions() {
		if (north != null)
			north.deregisterAllActions();
		if (south != null)
			south.deregisterAllActions();
		if (east != null)
			east.deregisterAllActions();
		if (west!= null)
			west.deregisterAllActions();
		
		if (northeast != null)
			northeast.deregisterAllActions();
		if (northwest != null)
			northwest.deregisterAllActions();
		if (southwest != null)
			southwest.deregisterAllActions();
		if (southeast != null)
			southeast.deregisterAllActions();
		if (center != null)
			center.deregisterAllActions();
	}
	
	
	
}
