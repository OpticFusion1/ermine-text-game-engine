package control;

import java.util.HashMap;

import characters.Player;
import control.ButtonActionHandler;
import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.controls.Button;
import de.lessvoid.nifty.elements.Element;
import de.lessvoid.nifty.elements.render.TextRenderer;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;

//TODO: this whole class
public class ErmineInventoryScreenController implements ScreenController {
	public enum InventoryPanelButtons {NORTH, SOUTH, EAST, WEST, CENTER, NORTHEAST, NORTHWEST, SOUTHEAST, SOUTHWEST};
	protected HashMap<InventoryPanelButtons, ButtonActionHandler> buttonActionHandlerMap; 
	private final Player player = Game.getPlayer();
	
	public ErmineInventoryScreenController() {
		buttonActionHandlerMap = new HashMap<InventoryPanelButtons, ButtonActionHandler>();
	}
	
	public static ErmineInventoryScreenController getInstance() {
		return (ErmineInventoryScreenController) Main.getNiftyInstance().getScreen("inventory").getScreenController();
	}
	
	private Screen getNavigationScreen() {
		return Main.getNiftyInstance().getScreen("inventory");
	}

	public void registerAction(ButtonActionHandler handler, InventoryPanelButtons buttonChoice) {
		buttonActionHandlerMap.put(buttonChoice, handler);
	}
	public void deregisterAction(InventoryPanelButtons buttonChoice) {
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
		ErmineScreenControllerFunctions.getInstance().refreshMainTextPanelSize();
	}
	
	private InventoryPanelButtons stringToButtonChoice(String str) {
		str = str.toLowerCase().trim();
		switch (str) {
			case "north":
				return InventoryPanelButtons.NORTH;
			case "south":
				return InventoryPanelButtons.SOUTH;
			case "east":
				return InventoryPanelButtons.EAST;
			case "west":
				return InventoryPanelButtons.WEST;
			case "center":
				return InventoryPanelButtons.CENTER;
			case "southeast":
				return InventoryPanelButtons.SOUTHEAST;
			case "southwest":
				return InventoryPanelButtons.SOUTHWEST;
			case "northeast":
				return InventoryPanelButtons.NORTHEAST;
			case "northwest":
				return InventoryPanelButtons.NORTHWEST;
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
		Button button = getNavigationScreen().findNiftyControl(buttonName, Button.class);
		if (button != null) {
			button.setText(text);
		}
	}

	public void setRowText(String text, String rowName) {
		setElementText(text, rowName+"_text");
	}
	public void setRowLabel(String text, String rowName) {
		setElementText(text, rowName+"_label");
	}
	private void setElementText(String text, String elementName) {
		Screen screen = getNavigationScreen();
		Element mainText = screen.findElementById(elementName);
		if (mainText == null) {
			System.err.println("Screen \""+elementName+"\" not found!");
			return;
		}
		TextRenderer renderer = mainText.getRenderer(TextRenderer.class);
		renderer.setText(text);
	}
	
	public void setMainText(String text) {
		ErmineScreenControllerFunctions.getInstance().setMainText(text);
	}
	
	public void goToNavigationScreen() {
		ErmineScreenControllerFunctions.getInstance().goToNavigationScreen();
	}
}
