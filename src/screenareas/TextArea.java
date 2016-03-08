package screenareas;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public abstract class TextArea {
	private JTextArea textArea;
	private JScrollPane scroll;
	
	public TextArea(int width, int height) {
		textArea = new JTextArea(width, height);
		textArea.setEditable(false);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		
		scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	}
	
	public JScrollPane getScrollPane() {
		return scroll;
	}
	
	public void setText(String str) {
		textArea.setText(str);
	}
	public void appendText(String str) {
		String textAreaContents = textArea.getText();
		if (textAreaContents.trim().length() == 0)
			setText(str);
		else
			setText(textAreaContents + "\n" + str);
	}
	public String getText() {
		return textArea.getText();
	}
}
