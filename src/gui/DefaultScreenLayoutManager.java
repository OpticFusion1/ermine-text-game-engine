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

public class DefaultScreenLayoutManager extends ScreenLayoutManager {
	public DefaultScreenLayoutManager(final Nifty nifty, final ScreenController controller) {
		super(nifty, controller);
		
		screenBuilder.layer(new LayerBuilder("layer") {{
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
			}});
		}});
	}
}
