package controllers;

import screenareas.TextArea;

public class ToggleButtonVisibilityAction implements Action {
	private final ActionButton button;
	
	public ToggleButtonVisibilityAction(ActionButton button) {
		this.button = button;
	}

	@Override
	public void execute() {
		if (button != null) {
			button.setVisible(!button.isVisible());
		}
	}
}
