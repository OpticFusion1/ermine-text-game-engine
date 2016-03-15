package gui;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.builder.EffectBuilder;
import de.lessvoid.nifty.builder.LayerBuilder;
import de.lessvoid.nifty.builder.PanelBuilder;
import de.lessvoid.nifty.builder.TextBuilder;
import de.lessvoid.nifty.controls.button.builder.ButtonBuilder;
import de.lessvoid.nifty.screen.ScreenController;
import de.lessvoid.nifty.tools.Color;
import de.lessvoid.nifty.tools.SizeValue;

/*     Super simplified version of the default layout
 *     +--------------------------------+
 *     |  text here!                    |
 *     |                                |
 *     |                                |
 *     |                                |
 *     |                                |
 *     |                                |
 *     +--------------------------------+                 +--------------------------------+                +--------------------------------+
 *     |(status)     north      (status)|     switches    | item1     item3                |     switches   |            item#               |
 *     |     west    invtry    east     |    <-------->   | item2     item4                |    <-------->  |     info blah blah blah        |
 *     |(status)     south      (status)|                 |                                |                |                                |
 *     +--------------------------------+                 +--------------------------------+                +--------------------------------+
 *           ^ navigation panel ^                               ^ inventory panel ^                                 ^ item panel ^
 *     
 *     Also, there will be an actions panel that works like the navigation panel
 */

public class DefaultScreenLayoutManager extends ScreenLayoutManager {
	public DefaultScreenLayoutManager(final Nifty nifty, final ScreenController controller) {
		super(nifty, controller);
		
		/*screenBuilder.layer(new LayerBuilder("layer") {{
			childLayoutCenter();
			onStartScreenEffect(new EffectBuilder("fade") {{
				length(500);
				effectParameter("start", "#0");
				effectParameter("end", "#f");
			}});
			onEndScreenEffect(new EffectBuilder("fade") {{
				length(500);
				effectParameter("start", "#f");
				effectParameter("end", "#0");
			}});
			onActiveEffect(new EffectBuilder("gradient") {{
				effectValue("offset", "0%", "color", "#333f");
				effectValue("offset", "100%", "color", "#ffff");
			}});
			panel(new PanelBuilder() {{
				childLayoutVertical();
				text(new TextBuilder() {{
					text("Nifty 1.4 Core Hello World");
					style("base-font");
					color(Color.BLACK);
					alignCenter();
					valignCenter();
				}});
				panel(new PanelBuilder(){{
					height(SizeValue.px(10));
				}});
				control(new ButtonBuilder("exit", "Pretty Cool!") {{
					alignCenter();
					valignCenter();
				}});
				control(new ButtonBuilder("exit2", "This one also exits") {{
					alignCenter();
					valignCenter();
				}});
			}});
		}});*/
	}
}
