package control;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.controls.ScrollPanel;
import de.lessvoid.nifty.elements.Element;
import de.lessvoid.nifty.elements.render.TextRenderer;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;
import de.lessvoid.nifty.tools.SizeValue;

public class ErmineScreenController implements ScreenController {
	private final Nifty nifty;
	
	public ErmineScreenController() {
		nifty = Main.getNiftyInstance();
		refreshMainTextPanelSize();
	}
	
	public static ErmineScreenController getInstance() {
		return (ErmineScreenController) Main.getNiftyInstance().getCurrentScreen().getScreenController();
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
		//System.out.println("mainTextPanelContainerTopPadding: "+mainTextPanelContainerTopPadding);
		
		ScrollPanel scrollPanel = screen.findNiftyControl("main_text_scrollbar", ScrollPanel.class);
		//System.out.println("mainTextPanelContainer.getHeight(): "+mainTextPanelContainer.getHeight());
		mainTextPanel.setConstraintHeight(new SizeValue((mainTextPanelContainer.getHeight()+scrollPanel.getHeight()*2+mainTextPanelContainerTopPadding)+"px"));
		mainTextPanel.setConstraintWidth(new SizeValue((mainTextPanelContainer.getWidth())+"px"));
		
		int newTextPanelHeight = mainTextPanel.getConstraintHeight().getValueAsInt(1);
		//System.out.println("newTextPanelHeight: "+newTextPanelHeight);
		scrollPanel.setHeight(new SizeValue(newTextPanelHeight+"px"));
	}
	

	@Override
	public void bind(Nifty arg0, Screen arg1) {
		System.out.println("Unimplemented (bind)");
	}

	@Override
	public void onEndScreen() {
		System.out.println("Unimplemented (onEndScreen)");
	}

	@Override
	public void onStartScreen() {
		System.out.println("Unimplemented (onStartScreen)");
	}
	
	
	// this is called by nifty, as defined in the XML layout
	public void buttonClick(String buttonClicked) {
		System.out.println("ErmineScreenControl "+buttonClicked);
		String controllerName = buttonClicked.substring(0,2);
		System.out.println(controllerName);
		String buttonClickedName = buttonClicked.substring(2);
		System.out.println(buttonClickedName);
	}
}
