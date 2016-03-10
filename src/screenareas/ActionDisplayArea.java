package screenareas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import controllers.Action;

public abstract class ActionDisplayArea extends JPanel {
	public ActionDisplayArea(int width, int height, LayoutManager layout) {
		this.setPreferredSize(new Dimension(width, height));
	}

	public abstract void registerAction(NavigationArea.ButtonNames btnName, Action act);
	public abstract void registerAction(MiscActions.ButtonNames btnName, Action act);
	
	public void makeBorder() {
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
}
