package areas;

import actions.ButtonActionHandler;
import control.ErmineNavigationScreenController;
import control.ErmineNavigationScreenController.NavigationPanelButtons;

public abstract class Area {
	protected final ErmineNavigationScreenController navigationControl;
	
	public Area() {
		navigationControl = ErmineNavigationScreenController.getInstance();
	}

	protected void deRegisterNorthAction() {
		navigationControl.deRegisterAction(NavigationPanelButtons.NORTH);
	}
	protected void deRegisterSouthAction() {
		navigationControl.deRegisterAction(NavigationPanelButtons.SOUTH);
	}
	protected void deRegisterWestAction() {
		navigationControl.deRegisterAction(NavigationPanelButtons.WEST);
	}
	protected void deRegisterEastAction() {
		navigationControl.deRegisterAction(NavigationPanelButtons.EAST);
	}
	protected void deRegisterCenterAction() {
		navigationControl.deRegisterAction(NavigationPanelButtons.CENTER);
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
