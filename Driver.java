package assignment2;

import javax.swing.SwingUtilities;

public class Driver {
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> AdminView.getInstance().setVisible(true));
		
	}
}
