package control;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.NiftyEventSubscriber;
import de.lessvoid.nifty.controls.ButtonClickedEvent;
import de.lessvoid.nifty.controls.Controller;
import de.lessvoid.nifty.controls.ScrollPanel;
import de.lessvoid.nifty.elements.Element;
import de.lessvoid.nifty.elements.render.TextRenderer;
import de.lessvoid.nifty.screen.DefaultScreenController;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;
import de.lessvoid.nifty.tools.SizeValue;

public class ScreenController2 implements ScreenController {
	private final Nifty nifty;
	
	public ScreenController2(Nifty nifty) {
		super();
		this.nifty = nifty;
		
		//loadXML("layouts/default.xsd");
		loadXML("layouts/defaultWithStatsPane.xsd");
		
		System.out.println("aaaskakskkdskd butts");
		refreshMainTextPanelSize();
	}
	
	public void loadXML(String fileName) {
		nifty.fromXml(fileName, "start", new DefaultErmineScreenController());
	}
	
	public void setMainText(String text) {
		Screen screen = nifty.getCurrentScreen();
		Element mainText = screen.findElementById("main_text");
		if (mainText == null) {
			System.err.println("Screen \"main_text\" not found!");
			return;
		}
		TextRenderer renderer = mainText.getRenderer(TextRenderer.class);
		renderer.setText(text);
		refreshMainTextPanelSize();
	}
	
	private void refreshMainTextPanelSize() {
		Screen screen = nifty.getCurrentScreen();
		Element mainTextPanel = screen.findElementById("main_text_panel");
		Element mainTextPanelContainer = screen.findElementById("main_text_panel_container");
		int mainTextPanelContainerTopPadding = mainTextPanelContainer.getPaddingTop().getValueAsInt(1)*4;
		System.out.println("mainTextPanelContainerTopPadding: "+mainTextPanelContainerTopPadding);
		
		ScrollPanel scrollPanel = screen.findNiftyControl("main_text_scrollbar", ScrollPanel.class);
		System.out.println("mainTextPanelContainer.getHeight(): "+mainTextPanelContainer.getHeight());
		mainTextPanel.setConstraintHeight(new SizeValue((mainTextPanelContainer.getHeight()+scrollPanel.getHeight()*2+mainTextPanelContainerTopPadding)+"px"));
		mainTextPanel.setConstraintWidth(new SizeValue((mainTextPanelContainer.getWidth())+"px"));
		
		int newTextPanelHeight = mainTextPanel.getConstraintHeight().getValueAsInt(1);
		System.out.println("newTextPanelHeight: "+newTextPanelHeight);
		scrollPanel.setHeight(new SizeValue(newTextPanelHeight+"px"));
	}
	
	public void northTest() {
		System.out.println("asdfasdfae north");
	}
	
	public class DefaultErmineScreenController extends DefaultScreenController {

		public void northTest() {
			System.out.println("asdfasdfae north");
		}
		
		@NiftyEventSubscriber(id="north")
		public void north(final String id, final ButtonClickedEvent event) {
			System.out.println("north");
			nifty.exit();
		}
		
		@NiftyEventSubscriber(id="south")
		public void south(final String id, final ButtonClickedEvent event) {
			System.out.println("south");
		}
		
		@NiftyEventSubscriber(id="east")
		public void east(final String id, final ButtonClickedEvent event) {
			System.out.println("east");
		}
		
		@NiftyEventSubscriber(id="west")
		public void west(final String id, final ButtonClickedEvent event) {
			System.out.println("west");
		}
		
		@NiftyEventSubscriber(id="center")
		public void center(final String id, final ButtonClickedEvent event) {
			System.out.println("center");
		}
	}

	@Override
	public void bind(Nifty arg0, Screen arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEndScreen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStartScreen() {
		// TODO Auto-generated method stub
		
	}
}
