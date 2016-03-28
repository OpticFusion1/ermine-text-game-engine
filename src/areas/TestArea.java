package areas;

import control.ButtonActionHandler;
import control.ErmineNavigationScreenController;
import control.ErmineNavigationScreenController.NavigationPanelButtons;

public class TestArea extends Area {
	private final NorthController northController;
	
	public TestArea() {
		super();
		
		northController = new NorthController();
		
		registerNorthAction(northController);
		registerWestAction(new WestController());
		registerSouthAction(new SouthController());
		registerEastAction(new EastController());
		registerCenterAction(new CenterController(this));
	}
	
	// ---- BUTTON CONTROLLERS ----
	public class NorthController implements ButtonActionHandler {
		@Override
		public void execute() {
			System.out.println("North Execute!");
		}
	}
	public class SouthController implements ButtonActionHandler {
		@Override
		public void execute() {
			System.out.println("South Execute!");
		}
	}
	public class WestController implements ButtonActionHandler {
		@Override
		public void execute() {
			System.out.println("West Execute!");
		}
	}
	public class EastController implements ButtonActionHandler {
		@Override
		public void execute() {
			System.out.println("East Execute!");
		}
	}
	public class CenterController implements ButtonActionHandler {
		private TestArea area;
		public CenterController(TestArea area) {
			this.area = area;
		}
		
		@Override
		public void execute() {
			System.out.println("Center Execute!");
			if (area.navigationControl.hasAction(NavigationPanelButtons.NORTH)) {
				System.out.println("north has action");
				area.deregisterNorthAction();
				area.navigationControl.setButtonText("ayy lmao", "north");
			} else {
				System.out.println("north does not have action");
				area.registerNorthAction(northController);
				area.navigationControl.setButtonText("NORTH", "north");
			}
		}
	}
}
