package gameelements;

import screenareas.NavigationArea;

public class Player {
	private int x, y;
	
	public Player(int startingX, int startingY) {
		x = startingX;
		y = startingY;
	}
	
	public void movePlayer(NavigationArea.ButtonNames direction) {
		switch (direction) {
			case NORTH:
				y--;
				break;
			case SOUTH:
				y++;
				break;
			case EAST:
				x++;
				break;
			case WEST:
				x--;
				break;
			case SOUTHWEST:
				movePlayer(NavigationArea.ButtonNames.SOUTH);
				movePlayer(NavigationArea.ButtonNames.WEST);
				break;
			case SOUTHEAST:
				movePlayer(NavigationArea.ButtonNames.SOUTH);
				movePlayer(NavigationArea.ButtonNames.EAST);
				break;
			case NORTHEAST:
				movePlayer(NavigationArea.ButtonNames.NORTH);
				movePlayer(NavigationArea.ButtonNames.EAST);
				break;
			case NORTHWEST:
				movePlayer(NavigationArea.ButtonNames.NORTH);
				movePlayer(NavigationArea.ButtonNames.WEST);
				break;
			default:
				return;
		}
	}
}
