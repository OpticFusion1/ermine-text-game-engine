package control;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;

public class ErmineNavigationScreenController implements ScreenController {
	public enum NavigationPanelButtons {NORTH, SOUTH, EAST, WEST, CENTER};
	
	public ErmineNavigationScreenController() {
		
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
	
	public void buttonClick(String buttonClicked) {
		switch (buttonClicked) {
			case "north":
				northClicked();
				break;
			case "south":
				southClicked();
				break;
			case "east":
				eastClicked();
				break;
			case "west":
				westClicked();
				break;
			case "center":
				centerClicked();
				break;
			default:
				break;
		}
	}

	private void northClicked() {
		System.out.println("North!");
	}
	private void southClicked() {
		System.out.println("South!");
	}
	private void eastClicked() {
		System.out.println("East!");
	}
	private void westClicked() {
		System.out.println("West!");
	}
	private void centerClicked() {
		System.out.println("Center!");
	}
}
