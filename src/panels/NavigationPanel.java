package panels;

import java.awt.Panel;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.builder.LayerBuilder;
import de.lessvoid.nifty.builder.PanelBuilder;
import de.lessvoid.nifty.builder.ScreenBuilder;
import de.lessvoid.nifty.controls.button.builder.ButtonBuilder;
import de.lessvoid.nifty.elements.Element;
import de.lessvoid.nifty.screen.Screen;

public class NavigationPanel extends ErminePanel {
	protected PanelBuilder panelBuilder = null;

	public NavigationPanel() {
	//public NavigationPanel(ScreenBuilder screenBuilder) {
		//super(screenBuilder);
		super();

		/*screenBuilder.layer(new LayerBuilder("layer") {{
				panel(new PanelBuilder() {{
				childLayoutVertical();
				/*text(new TextBuilder() {{
					text("Nifty 1.4 Core Hello World");
					style("base-font");
					color(Color.BLACK);
					alignCenter();
					valignCenter();
				}});
				control(new ButtonBuilder("north", "North") {{
					alignCenter();
					valignCenter();
				}});
				control(new ButtonBuilder("exit2", "This one also exits") {{
					alignCenter();
					valignCenter();
				}});
			}});
		}});*/
		
		panelBuilder = new PanelBuilder("Navigation_Panel") {{
			childLayoutVertical();
			
			/*
			panel(new PanelBuilder(){{
				height(SizeValue.px(10));
			}});
			*/
			
			control(new ButtonBuilder("north", "North") {{
				alignCenter();
				valignCenter();
			}});
			control(new ButtonBuilder("exit2", "This one also exits") {{
				alignCenter();
				valignCenter();
			}});
		}};
	}
	
	public Element build(Nifty nifty, Screen screen, Element parent) {
		if (panelBuilder != null) {
			return panelBuilder.build(nifty, screen, parent);
		} else {
			return null;
		}
	}
}
