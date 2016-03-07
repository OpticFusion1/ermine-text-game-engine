package screenareas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	private ActionButton getButton(ButtonNames btnName) {
		ActionButton btn;
		switch(btnName) {
			case NORTH:
				btn = north;
			case SOUTH:
				btn = south;
			case EAST:
				btn = east;
			case WEST:
				btn = west;
			
			case NORTHEAST:
				btn = northeast;
			case NORTHWEST:
				btn = northwest;
			case SOUTHEAST:
				btn = southeast;
			case SOUTHWEST:
				btn = southwest;
			default:
				btn = null;
		}
		return btn;
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
	
	
	
}
