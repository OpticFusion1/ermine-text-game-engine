package screenareas;

import gui_elements.ActionButton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

/*
 * What goes in the right side of the action area.
 * Inventory button, status check, etc
 */

public class MiscActions extends ActionArea {
	private ActionButton inventory;
	
	public MiscActions(int width, int height) {
		super(width, height, new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		inventory = new ActionButton("Inventory");

		c.gridx = 0;
		c.gridy = 0;
		add(inventory, c);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//TODO
	}
	
}
