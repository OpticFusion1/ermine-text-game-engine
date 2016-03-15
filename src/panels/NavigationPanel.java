package panels;

import de.lessvoid.nifty.builder.PanelBuilder;
import de.lessvoid.nifty.builder.ScreenBuilder;

public class NavigationPanel extends ErminePanel {
	
	public NavigationPanel(ScreenBuilder screenBuilder) {
		super(screenBuilder);

		screenBuilder.panel(new PanelBuilder() {{
			childLayoutVertical();
			/*text(new TextBuilder() {{
				text("Nifty 1.4 Core Hello World");
				style("base-font");
				color(Color.BLACK);
				alignCenter();
				valignCenter();
			}});*/
			control(new ButtonBuilder("north", "North") {{
				alignCenter();
				valignCenter();
			}});
			control(new ButtonBuilder("exit2", "This one also exits") {{
				alignCenter();
				valignCenter();
			}});
		}});
	}
}
