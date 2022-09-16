/**
 * @author humzahkha0143
 * rectangle evaluation dootler
 */

import java.awt.Rectangle;                                         // allows me to just say Rectangle to define variable

public class RectanglePrinter {

	public static void main(String[] args) {                       // Boilerplate is love, deeefinitely not a design problem.
		                                                           // bind a Rectangle to variable "rect"
		Rectangle rect = new Rectangle(5,20,30,10);
		
		                                                           // print rect bounds
		System.out.println("Expecting x=20, y=30, w=5, h=10 \n");  // what the expectations are for rect bounds
		System.out.println("X is... " + rect.getX());              // what the rect bounds actually are.
		System.out.println("Y is... " + rect.getY());
		System.out.println("Width is... " + rect.getWidth());
		System.out.println("Height is... " + rect.getHeight() + "\n");
		System.out.println(rect.getBounds2D() + "\n");             // Java-speak for above.
		
		rect.translate(5, -6);                                     // shift rect bounds by x + 5.3, y - 6
		rect.setRect(rect.getX(),rect.getY(), rect.getWidth() * 2, rect.getHeight() * 2); // double the size of the rectangle's width and height.
		
	                                                               // print translated rect bounds
		System.out.println("After translating, expecting x=10, y=14, w=60, h=20, a=1200 sq units. \n");
		System.out.println("X is... " + rect.getX());              // what the rect bounds actually are.
		System.out.println("Y is... " + rect.getY());
		System.out.println("Width is... " + rect.getWidth());
		System.out.println("Height is... " + rect.getHeight());
		System.out.println("Area is... " + (rect.getWidth()) * (rect.getHeight()) + " square units.\n");
																   // Multiply rect's width and height to get the area.
		
		System.out.println(rect.getBounds2D());                    // Java-speak for above, except the area.
		
	}

}
