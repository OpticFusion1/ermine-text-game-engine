package screenareas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayAreas {
	private JFrame frame;
	private TextArea textArea;
	private ActionInfoContainer actionArea;
	
	private static int textAreaRows = 20;
	private static int textAreaColumns = 80;
	private static int actionAreaAddPixelsHeight = 150;
	
	public DisplayAreas(int screenWidth, int screenHeight) {
		textArea = new MainTextArea(textAreaRows, textAreaColumns);
		actionArea = new ActionInfoContainer(screenWidth, actionAreaAddPixelsHeight + screenHeight);
		
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
        test.add(new JButton("5"));*/
		
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		//frame.add(textArea.getScrollPane(), BorderLayout.CENTER);
		//frame.add(actionArea, BorderLayout.SOUTH);
		frame.add(actionArea.getNavArea(), BorderLayout.SOUTH);
		
		//frame.add(test);
		
		frame.pack();
	}
	
	public void setText(String str) {
		textArea.setText(str);
	}
	public void appendText(String str) {
		textArea.appendText(str);
	}
	public String getText() {
		return textArea.getText();
	}
	
	
	
	
}
