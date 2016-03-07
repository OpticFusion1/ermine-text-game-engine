package controllers;

import screenareas.TextArea;

public class PrintAction implements Action {
	private String text = null;
	private TextArea textArea = null;
	
	public PrintAction(String text, TextArea textArea) {
		this.text = text;
		this.textArea = textArea;
	}

	@Override
	public void execute() {
		if (text != null && textArea != null)
			textArea.setText(text);
	}
}
