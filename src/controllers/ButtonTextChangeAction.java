package controllers;

import screenareas.TextArea;

public class ButtonTextChangeAction implements Action {
	private String text = null;
	private ActionButton button = null;
	
	public ButtonTextChangeAction(String text, ActionButton button) {
		this.text = text;
		this.button = button;
	}

	@Override
	public void execute() {
		if (text != null && button != null)
			button.setText(text);
	}
}
