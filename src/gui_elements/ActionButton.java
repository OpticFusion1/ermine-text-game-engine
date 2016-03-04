package gui_elements;

import javax.swing.JButton;

public class ActionButton extends JButton {
	private String displayText = ""; 
	
	public ActionButton(String displayText) {
		super(displayText);
		this.displayText = displayText;
	}
	
}
