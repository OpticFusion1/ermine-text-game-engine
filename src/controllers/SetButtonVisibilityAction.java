package controllers;

import screenareas.TextArea;

public class SetButtonVisibilityAction implements Action {
	private final boolean visible;
	private final ActionButton button;
	
	public SetButtonVisibilityAction(boolean visible, ActionButton button) {
		this.visible = visible;
		this.button = button;
	}

	@Override
	public void execute() {
		if (button != null)
			button.setVisible(visible);
	}
}
