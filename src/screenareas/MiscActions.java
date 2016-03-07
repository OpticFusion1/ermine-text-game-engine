package screenareas;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import screenareas.NavigationArea.ButtonNames;
import controllers.Action;
import controllers.ActionButton;

/*
 * What goes in the right side of the action area.
 * Inventory button, status check, etc
 */

public class MiscActions {
	public enum ButtonNames {INVENTORY};
	private ActionButton inventory;
	private JPanel parent;
	
	public MiscActions(int width, int height, JPanel parent) {
		this.parent = parent;
		inventory = new ActionButton("Inventory");
		
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		parent.add(inventory, c);
	}

	private ActionButton getButton(ButtonNames btnName) {
		ActionButton btn;
		switch(btnName) {
			case INVENTORY:
				btn = inventory;
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
