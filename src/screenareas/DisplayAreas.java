package screenareas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controllers.Action;
import controllers.ActionButton;

public class DisplayAreas {
	private JFrame frame;
	private TextArea textArea;
	private ActionInfoContainer actionInfoArea;
	
	private static int textAreaRows = 20;
	private static int textAreaColumns = 80;
	private static int actionAreaAddPixelsHeight = 150;
	
	public DisplayAreas(int screenWidth, int screenHeight) {
		textArea = new MainTextArea(textAreaRows, textAreaColumns);
		actionInfoArea = new ActionInfoContainer(screenWidth, actionAreaAddPixelsHeight + screenHeight);
		
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.add(textArea.getScrollPane(), BorderLayout.CENTER);
		frame.add(actionInfoArea, BorderLayout.SOUTH);
		
		frame.pack();
	}
	
	public void setText(String str) {
		textArea.setText(str);
	}
	public void appendText(String str) {
		textArea.appendText(str);
	}
	public String getText() {
		return textArea.getText();
	}

	public TextArea getTextArea() {
		return textArea;
	}
	public ActionInfoContainer getActionInfoArea() {
		return actionInfoArea;
	}
	
	public void deregisterAllActions() {
		actionInfoArea.deregisterAllActions();
	}
	public void registerAction(NavigationArea.ButtonNames btnName, Action act) {
		actionInfoArea.registerAction(btnName, act);
	}

	public ActionButton getButton(NavigationArea.ButtonNames btnName) {
		return actionInfoArea.getNavigationArea().getButton(btnName);
	}
	public ActionButton getButton(MiscActions.ButtonNames btnName) {
		return actionInfoArea.getMiscArea().getButton(btnName);
	}
	
	
}
