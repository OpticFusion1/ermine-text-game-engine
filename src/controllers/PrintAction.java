package controllers;

import screenareas.TextArea;

public class PrintAction implements Action {
	public enum PrintOptions { APPEND, REPLACE };
	private String text = null;
	private TextArea textArea = null;
	private PrintOptions option = null;
	
	public PrintAction(String text, TextArea textArea, PrintOptions option) {
		this.text = text;
		this.textArea = textArea;
		this.option = option;
	}

	@Override
	public void execute() {
		if (text != null && textArea != null)
			if (option == null || option == PrintOptions.REPLACE)
				textArea.setText(text);
			else
				textArea.appendText(text);
	}
}
