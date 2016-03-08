package areas;

import controllers.PrintAction;
import screenareas.DisplayAreas;
import screenareas.NavigationArea;

public class TestStarterArea extends Area {
	private String entranceText = "Test starter area text.\n"+
			"		eyyyy-oooooo\n"+
			"	ASDJFAJSDFSDF";
	
	public TestStarterArea(DisplayAreas area) {
		super(area);
	}

	@Override
	protected void registerNewActions(DisplayAreas area) {
		area.registerAction(NavigationArea.ButtonNames.NORTH, new PrintAction("north clicked", area.getTextArea(), PrintAction.PrintOptions.APPEND));
		area.registerAction(NavigationArea.ButtonNames.SOUTH, new PrintAction("south clicked", area.getTextArea(), PrintAction.PrintOptions.APPEND));
		area.registerAction(NavigationArea.ButtonNames.EAST, new PrintAction("east clicked", area.getTextArea(), PrintAction.PrintOptions.APPEND));
		area.registerAction(NavigationArea.ButtonNames.WEST, new PrintAction("west clicked", area.getTextArea(), PrintAction.PrintOptions.APPEND));
	}
}
