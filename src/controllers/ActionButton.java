package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class ActionButton extends JButton {
	private ArrayList<Action> actions;
	
	public ActionButton(String text) {
		super(text);
		actions = new ArrayList<Action>();
		
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (actions.size() > 0) {
					for (int i=0; i<actions.size(); i++)
						actions.get(i).execute();
				}
			}
		});
	}
	
	public void registerAction(Action action) {
		actions.add(action);
	}
	public void deregisterAction(Action action) {
		actions.remove(action);
	}
	public void deregisterAllActions() {
		actions.clear();
	}
	
}
