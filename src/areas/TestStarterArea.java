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
		area.registerAction(NavigationArea.ButtonNames.NORTH, new PrintAction("asdfasdasd", area.getTextArea()));
	}
}
