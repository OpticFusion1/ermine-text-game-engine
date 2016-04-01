package areas;

import control.ButtonActionHandler;
import control.ErmineNavigationScreenController;
import control.ErmineNavigationScreenController.NavigationPanelButtons;

public class TestArea extends Area {
	public TestArea() {
		super();
		navigationControl.setButtonText("Change row 1 text", "west");
		navigationControl.setButtonText("Inventory", "center");
		
		NorthController northController = new NorthController();
		
		registerNorthAction(northController);
		registerWestAction(new WestController(this));
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
		private int num = 0;
		private TestArea area;
		public WestController(TestArea area) {
			this.area = area;
		}
		
		@Override
		public void execute() {
			System.out.println("West Execute!");

			area.navigationControl.setRowLabel("Row Label"+num, "row1");
			area.navigationControl.setRowText("Row Text"+num, "row1");
			num++;
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
			area.navigationControl.setMainText("Inventory Test");
			area.navigationControl.goToInventoryScreen();
		}
	}
}
