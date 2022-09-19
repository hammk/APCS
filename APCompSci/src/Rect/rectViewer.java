package Rect;


/**
 * @author humzahkha0143
 * the Viewer class for the two rectangles we defined in Component.
 */

import javax.swing.JFrame;

public class rectViewer {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();                          // recall JFrame...
		
		frame.setSize(300, 400);                              // define window; its name is Dual Rectangles, it's size is 300x400, and closing it exits the frame.
		frame.setTitle("Dual Rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		rectComponent comp = new rectComponent(); // Use the earlier class; rectComponent.
		frame.add(comp);
		
		frame.setVisible(true);
		
	}
	
}
