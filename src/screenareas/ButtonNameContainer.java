package screenareas;

import java.util.ArrayList;

public abstract class ButtonNameContainer {
	private ArrayList<String> buttonNames;
	
	public ArrayList<String> getButtonNames() {
		return buttonNames;
	}
	public void addButtonName(String buttonName) {
		buttonNames.add(buttonName);
	}
}
