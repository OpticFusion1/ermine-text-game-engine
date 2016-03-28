package areas;

import control.ButtonActionHandler;
import control.ErmineNavigationScreenController;
import control.ErmineNavigationScreenController.NavigationPanelButtons;

public abstract class Area {
	protected final ErmineNavigationScreenController navigationControl;
	
	public Area() {
		navigationControl = ErmineNavigationScreenController.getInstance();
	}

	protected void deregisterNorthAction() {
		System.out.println("deregister north");
		navigationControl.deregisterAction(NavigationPanelButtons.NORTH);
	}
	protected void deregisterSouthAction() {
		navigationControl.deregisterAction(NavigationPanelButtons.SOUTH);
	}
	protected void deregisterWestAction() {
		navigationControl.deregisterAction(NavigationPanelButtons.WEST);
	}
	protected void deregisterEastAction() {
		navigationControl.deregisterAction(NavigationPanelButtons.EAST);
	}
	protected void deregisterCenterAction() {
		navigationControl.deregisterAction(NavigationPanelButtons.CENTER);
	}
	
	protected void registerNorthAction(ButtonActionHandler actionHandler) {
		navigationControl.registerAction(actionHandler, NavigationPanelButtons.NORTH);
	}
	protected void registerSouthAction(ButtonActionHandler actionHandler) {
		navigationControl.registerAction(actionHandler, NavigationPanelButtons.SOUTH);
	}
	protected void registerEastAction(ButtonActionHandler actionHandler) {
		navigationControl.registerAction(actionHandler, NavigationPanelButtons.EAST);
	}
	protected void registerWestAction(ButtonActionHandler actionHandler) {
		navigationControl.registerAction(actionHandler, NavigationPanelButtons.WEST);
	}
	protected void registerCenterAction(ButtonActionHandler actionHandler) {
		navigationControl.registerAction(actionHandler, NavigationPanelButtons.CENTER);
	}
}
