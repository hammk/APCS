/**
 * @author humzahkha0143
 * Combined Face Component and Viewer because CollegeBoard 
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class FaceComponent extends JComponent {   // face component
	private static final long serialVersionUID = -8616653740567423559L;

	public void paintComponent(Graphics g) {      // begin defining frame; including ellipses and rectangles.
		
		Graphics2D g2 = (Graphics2D) g;           // recall G2D
		
		Ellipse2D.Double head = new Ellipse2D.Double(5,5,200,200);          // define head ellipse
		Rectangle leftEye = new Rectangle(65, 65, 25, 25);                  // define left eye, rectangle
		Ellipse2D.Double rightEye = new Ellipse2D.Double(145, 65, 25, 25);   // define right eye, ellipse
		Ellipse2D.Double nose = new Ellipse2D.Double(105, 105, 45, 15);       // define nose, ellipse
		Rectangle mouth = new Rectangle(65, 135, 65, 25);                   // define mouth, rectangle
		
		g2.draw(head);
		g2.setColor(Color.BLUE);
		g2.fill(leftEye);
		g2.setColor(Color.GREEN);
		g2.fill(rightEye);
		g2.setColor(Color.RED);
		g2.fill(nose);
		g2.fill(mouth);
		
	}
	
	public static void main(String[] args) { // try 2 to integrate the viewer into the component class...

		JFrame frame = new JFrame();                         // Cast JFrame.
		
		frame.setSize(700, 500);
		frame.setTitle("FaceViewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FaceComponent comp = new FaceComponent();            // Grab the earlier frame,
		frame.add(comp);                                     // ...and cast it to our new JFrame.
		
		frame.setVisible(true);                              // Set the visibility to true so you can see the window.

	}

}