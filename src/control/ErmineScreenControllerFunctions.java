package control;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.controls.ScrollPanel;
import de.lessvoid.nifty.elements.Element;
import de.lessvoid.nifty.elements.render.TextRenderer;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;
import de.lessvoid.nifty.tools.SizeValue;

// Common functions used by the Ermine Screen Controllers
// This is necessary because for some reason Nifty cannot find a ScreenController that extends another class
public class ErmineScreenControllerFunctions {
	private final Nifty nifty;
	private static ErmineScreenControllerFunctions instance = null;
	
	protected ErmineScreenControllerFunctions() {
		nifty = Main.getNiftyInstance();
		refreshMainTextPanelSize();
	}
	
	public static ErmineScreenControllerFunctions getInstance() {
		if (instance == null) {
			instance = new ErmineScreenControllerFunctions();
		}
		return instance;
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
	
	public void refreshMainTextPanelSize() {
		Screen screen = nifty.getCurrentScreen();
		Element mainTextPanel = screen.findElementById("main_text_panel");
		Element mainTextPanelContainer = screen.findElementById("main_text_panel_container");
		int mainTextPanelContainerTopPadding = mainTextPanelContainer.getPaddingTop().getValueAsInt(1)*4;
		//System.out.println("mainTextPanelContainerTopPadding: "+mainTextPanelContainerTopPadding);
		
		ScrollPanel scrollPanel = screen.findNiftyControl("main_text_scrollbar", ScrollPanel.class);
		//System.out.println("mainTextPanelContainer.getHeight(): "+mainTextPanelContainer.getHeight());
		mainTextPanel.setConstraintHeight(new SizeValue((mainTextPanelContainer.getHeight()+scrollPanel.getHeight()*2+mainTextPanelContainerTopPadding)+"px"));
		mainTextPanel.setConstraintWidth(new SizeValue((mainTextPanelContainer.getWidth())+"px"));
		
		int newTextPanelHeight = mainTextPanel.getConstraintHeight().getValueAsInt(1);
		//System.out.println("newTextPanelHeight: "+newTextPanelHeight);
		scrollPanel.setHeight(new SizeValue(newTextPanelHeight+"px"));
	}
	
	public void goToInventoryScreen() {
		nifty.gotoScreen("inventory");
	}
	public void goToNavigationScreen() {
		nifty.gotoScreen("navigation");
	}
}
