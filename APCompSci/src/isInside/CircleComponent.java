package isInside;

import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

/**
   Draws a circle and a point. The point is colored green if it falls
   inside the circle, yellow otherwise.
*/
public class CircleComponent extends JComponent
{
   public CircleComponent(Point2D.Double point)
   {
      circle = new Circle(200, 200, 100, Color.BLACK);
      final double SMALL_RADIUS = 3;
      Color color = null;
      if(circle.isInside(point) == true) color = Color.yellow;
      else color = Color.blue;
      
      smallCircle = new Circle(point.getX(), point.getY(), SMALL_RADIUS, color);
   }

   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      circle.draw(g2);
      smallCircle.draw(g2);
   }

   private Circle circle;
   private Circle smallCircle;
}
