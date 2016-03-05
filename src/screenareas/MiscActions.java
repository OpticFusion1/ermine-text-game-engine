package screenareas;

import gui_elements.ActionButton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

/*
 * What goes in the right side of the action area.
 * Inventory button, status check, etc
 */

public class MiscActions {
	private ActionButton inventory;
	private JPanel parent;
	
	public MiscActions(int width, int height, JPanel parent) {
		this.parent = parent;
		inventory = new ActionButton("Inventory");
		
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		parent.add(inventory, c);
		
		inventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Inventory clicked!");
			}
		});
	}
	
}
