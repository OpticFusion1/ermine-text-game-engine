package screenareas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

/*
 * Holds all the stuff that isn't in the main text area.
 * Think, "all that stuff below the actual text screen."
 * Mainly action panels and info panels.
 */

public class ActionInfoContainer extends ActionArea {
	private NavigationArea navArea;
	private MiscActions miscArea;
	
	public ActionInfoContainer(int width, int height) {
		super(width, height, new GridLayout());
		navArea = new NavigationArea((int)(width*.6), height);
		miscArea = new MiscActions((int)(width*.4), height);
		//navArea.makeBorder();
		//miscArea.makeBorder();

		//add(navArea, BorderLayout.WEST);
		//add(miscArea, BorderLayout.EAST);
		
		add(navArea);
		add(miscArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO
	}
}
