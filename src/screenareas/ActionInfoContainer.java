package screenareas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import controllers.Action;

/*
 * Holds all the stuff that isn't in the main text area.
 * Think, "all that stuff below the actual text screen."
 * Mainly action panels and info panels.
 */

public class ActionInfoContainer extends ActionArea {
	private NavigationArea navArea;
	private MiscActions miscArea;
	private int maxGap = 5;
	
	public ActionInfoContainer(int width, int height) {
		super(width, height, new GridLayout());
        JButton b = new JButton("Just fake button");
        Dimension buttonSize = b.getPreferredSize();
		
		JPanel navAreaPanel = new JPanel();
		navArea = new NavigationArea((int)(width*.6), height, navAreaPanel);
		JPanel miscAreaPanel = new JPanel();
		miscArea = new MiscActions((int)(width*.4), height, miscAreaPanel);
		
		navAreaPanel.setLayout(new GridLayout(3, 3));
        navAreaPanel.setPreferredSize(new Dimension((int)(buttonSize.getWidth() * 2.5)+maxGap,
                (int)(buttonSize.getHeight() * 3.5)+maxGap * 2));
        

		miscAreaPanel.setLayout(new GridBagLayout());
		miscAreaPanel.setPreferredSize(new Dimension((int)(buttonSize.getWidth() * 2.5)+maxGap,
                (int)(buttonSize.getHeight() * 3.5)+maxGap * 2));
        
        this.add(navAreaPanel);
        this.add(miscAreaPanel);
	}

	public NavigationArea getNavigationArea() {
		return navArea;
	}
	public MiscActions getMiscArea() {
		return miscArea;
	}
	
	public void deregisterAllActions() {
		navArea.deregisterAllActions();
		miscArea.deregisterAllActions();
	}

	@Override
	public void registerAction(NavigationArea.ButtonNames btnName, Action act) {
		navArea.registerAction(btnName, act);
	}

	@Override
	public void registerAction(MiscActions.ButtonNames btnName, Action act) {
		miscArea.registerAction(btnName, act);
	}
	
}
