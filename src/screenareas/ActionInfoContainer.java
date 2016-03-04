package screenareas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * Holds all the stuff that isn't in the main text area.
 * Think, "all that stuff below the actual text screen."
 * Mainly action panels and info panels.
 */

public class ActionInfoContainer {
	private NavigationArea navArea;
	private MiscActions miscArea;
	
	public ActionInfoContainer(int width, int height) {
		//super(width, height, new GridLayout());
		navArea = new NavigationArea((int)(width*.6), height);
		/*miscArea = new MiscActions((int)(width*.4), height);
		navArea.makeBorder();
		miscArea.makeBorder();*/

		//add(navArea, BorderLayout.WEST);
		//add(miscArea, BorderLayout.EAST);
		
		//add(navArea);
		//add(miscArea);
		
		

		/*JPanel test = new JPanel();
		test.setLayout(new GridLayout(0, 2));
        JButton b = new JButton("Just fake button");
        Dimension buttonSize = b.getPreferredSize();
        test.setPreferredSize(new Dimension((int)(buttonSize.getWidth() * 2.5)+5,
                (int)(buttonSize.getHeight() * 3.5)+5 * 2));
        test.add(new JButton("Button 1"));
        test.add(new JButton("Button 2"));
        test.add(new JButton("Button 3"));
        test.add(new JButton("Long-Named Button 4"));
        test.add(new JButton("5"));
		this.add(test);*/
		
	}
	
	public ActionArea getNavArea() {
		return navArea;
	}

	/*@Override
	public void actionPerformed(ActionEvent e) {
		// TODO
	}*/
}
