package screenareas;

import gui_elements.ActionButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NavigationArea extends ActionArea {
	private ActionButton north, south, east, west, center;
	private ActionButton northeast, northwest, southeast, southwest;
	private int maxGap = 5;
	
	public NavigationArea(int width, int height) {
		super(width, height, new GridLayout(0, 2));
		
		JButton b = new JButton("Just fake button");
		Dimension buttonSize = b.getPreferredSize();
		setPreferredSize(new Dimension((int)(buttonSize.getWidth() * 2.5)+maxGap,
				(int)(buttonSize.getHeight() * 3.5)+maxGap * 2));
        
		//setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		north = new ActionButton("North");
		south = new ActionButton("South");
		east = new ActionButton("East");
		west = new ActionButton("West");

		center = new ActionButton("Center");
		
		northwest = new ActionButton("Northwest");
		southwest = new ActionButton("Southwest");
		northeast = new ActionButton("Northeast");
		southeast = new ActionButton("Southeast");
		
		//Dimension buttonSize = new Dimension(100, 50);
		
		add(northwest);
		
		//north.setPreferredSize(buttonSize);
		add(north);
		
		add(northeast);
		
		
		//west.setPreferredSize(buttonSize);
		add(west);

		add(center);
		
		//east.setPreferredSize(buttonSize);
		add(east);
		
		
		add(southwest);
		//south.setPreferredSize(buttonSize);
		add(south);
		add(southeast);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//TODO
	}
}
