package gui;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.builder.ScreenBuilder;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;

public abstract class ScreenLayoutManager {
	protected ScreenBuilder screenBuilder;
	protected Nifty nifty;
	
	public ScreenLayoutManager(final Nifty nifty, final ScreenController controller) {
		this.nifty = nifty;
		screenBuilder = new ScreenBuilder("start") {{
			controller(controller);
		}};
	}
	
	public Screen build() {
		return screenBuilder.build(nifty);
	}
}
