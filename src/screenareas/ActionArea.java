package screenareas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public abstract class ActionArea extends JPanel implements ActionListener {
	public ActionArea(int width, int height, LayoutManager layout) {
		this.setPreferredSize(new Dimension(width, height));
	}
	
	public void makeBorder() {
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
}
