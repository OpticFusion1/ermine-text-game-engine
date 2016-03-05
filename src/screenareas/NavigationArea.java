package screenareas;

import gui_elements.ActionButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NavigationArea {
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
		
		
		north.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("North clicked!");
			}
		});
		south.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("South clicked!");
			}
		});
		east.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("East clicked!");
			}
		});
		west.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("West clicked!");
			}
		});
		

		northwest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Northwest clicked!");
			}
		});
		northeast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Northeast clicked!");
			}
		});
		southwest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Southwest clicked!");
			}
		});
		southeast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Southeast clicked!");
			}
		});
		center.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Center clicked!");
			}
		});
	}
}
