package screenareas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import controllers.Action;

public abstract class ActionArea {
	public ButtonNameContainer buttonNameContainer;
	
	public ActionArea() {}

	public abstract void registerAction(String buttonName, Action act);
	
	
	
}
