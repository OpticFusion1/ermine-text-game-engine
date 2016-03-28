package control;

import java.util.HashMap;

import control.ButtonActionHandler;
import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.controls.Button;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;

public class ErmineNavigationScreenController implements ScreenController {
	public enum NavigationPanelButtons {NORTH, SOUTH, EAST, WEST, CENTER};
	protected HashMap<NavigationPanelButtons, ButtonActionHandler> buttonActionHandlerMap; 
	
	public ErmineNavigationScreenController() {
		buttonActionHandlerMap = new HashMap<NavigationPanelButtons, ButtonActionHandler>();
	}
	
	public static ErmineNavigationScreenController getInstance() {
		return (ErmineNavigationScreenController) Main.getNiftyInstance().getCurrentScreen().getScreenController();
	}

	public void registerAction(ButtonActionHandler handler, NavigationPanelButtons buttonChoice) {
		System.out.println("Register action: "+handler+" to button: "+buttonChoice);
		buttonActionHandlerMap.put(buttonChoice, handler);
	}
	public void deregisterAction(NavigationPanelButtons buttonChoice) {
		System.out.println("Deregister action from button: "+buttonChoice);
		buttonActionHandlerMap.put(buttonChoice, null);
	}
	
	@Override
	public void bind(Nifty arg0, Screen arg1) {
		System.out.println("Unimplemented (bind)");
	}

	@Override
	public void onEndScreen() {
		System.out.println("Unimplemented (onEndScreen)");
	}

	@Override
	public void onStartScreen() {
		System.out.println("Unimplemented (onStartScreen)");
	}

	private NavigationPanelButtons stringToButtonChoice(String str) {
		str = str.toLowerCase().trim();
		switch (str) {
			case "north":
				return NavigationPanelButtons.NORTH;
			case "south":
				return NavigationPanelButtons.SOUTH;
			case "east":
				return NavigationPanelButtons.EAST;
			case "west":
				return NavigationPanelButtons.WEST;
			case "center":
				return NavigationPanelButtons.CENTER;
			default:
				return null;
		}
	}
	private String buttonChoiceToString(NavigationPanelButtons buttonChoice) {
		switch (buttonChoice) {
			case NORTH:
				return "north";
			case SOUTH:
				return "south";
			case EAST:
				return "east";
			case WEST:
				return "west";
			case CENTER:
				return "center";
			default:
				return null;
		}
	}
	
	// this is called by nifty, as defined in the XML layout
	public void buttonClick(String buttonClicked) {
		NavigationPanelButtons buttonName = stringToButtonChoice(buttonClicked);
		// TODO: make this an actual exception
		if (buttonName == null) {
			System.err.println("Button name "+buttonClicked+" not found!");
			return;
		} else {
			ButtonActionHandler actionHandler = buttonActionHandlerMap.get(buttonName);
			if (actionHandler != null) {
				actionHandler.execute();
			}
		}
	}
	
	public boolean hasAction(String buttonName) {
		return hasAction(stringToButtonChoice(buttonName));
	}
	public boolean hasAction(NavigationPanelButtons buttonChoice) {
		return buttonActionHandlerMap.get(buttonChoice) != null;
	}

	public void setButtonText(String text, String buttonName) {
		Button button = Main.getNiftyInstance().getCurrentScreen().findNiftyControl(buttonName, Button.class);
		if (button != null) {
			button.setText(text);
		}
	}
}
