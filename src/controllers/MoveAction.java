package controllers;

import gameelements.Player;
import screenareas.NavigationArea;
import screenareas.TextArea;

public class MoveAction implements Action {
	private Player player;
	private NavigationArea.ButtonNames direction;
	
	public MoveAction(Player player, NavigationArea.ButtonNames direction) {
		this.player = player;
		this.direction = direction;
	}

	@Override
	public void execute() {
		player.movePlayer(direction);
	}
}
