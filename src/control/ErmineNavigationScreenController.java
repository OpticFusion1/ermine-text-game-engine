package control;

import java.util.HashMap;

import actions.ButtonActionHandler;
import de.lessvoid.nifty.Nifty;
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
	public void deRegisterAction(NavigationPanelButtons buttonChoice) {
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
	
	// this is called by nifty, as defined in the XML layout
	@SuppressWarnings("unused")
	public void buttonClick(String buttonClicked) {
		NavigationPanelButtons buttonName = stringToButtonChoice(buttonClicked);
		// TODO: make this an actual exception
		if (buttonName == null) {
			System.err.println("Button name "+buttonClicked+" not found!");
			return;
		} else {
			ButtonActionHandler actionHandler = buttonActionHandlerMap.get(buttonName);
			System.out.println("  action handler: "+actionHandler+" for button "+buttonName);
			if (actionHandler != null) {
				System.out.println("  Action handler found for: "+buttonClicked);
				actionHandler.execute();
			}
		}
	}
}
