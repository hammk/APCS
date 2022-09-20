package rect;


/**
 * @author humzahkha0143
 * the Component class for the rectangle.
 * An unfortunate logic error is that the two rectangles themselves won't draw.
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

// component to draw two rectangles

public class rectComponent extends JComponent {
	private static final long serialVersionUID = 1L; // dunno why this was needed?
	
	public void paintComponent(Graphics g) { // define later frame
	
		//get graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		//define rect, draw it
		Rectangle box = new Rectangle(5, 10, 20, 30);
		g2.draw(box);
		
		//move rect 15 right, 25 down, and draw it again
		box.translate(15,25);
		g2.draw(box);
		
	}
	
}