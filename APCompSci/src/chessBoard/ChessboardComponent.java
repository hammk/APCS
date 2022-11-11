import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ChessboardComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;

      final int NSQUARES = 20;

      int size = Math.min(getWidth(), getHeight()) / NSQUARES;
      Chessboard cb = new Chessboard(NSQUARES, size);

      cb.draw(g2);
   }
}