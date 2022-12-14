package chessBoard;

import java.awt.Color;
import java.awt.Graphics2D;
/**
 * Class to be used by JComponents. When called by a component, the draw method will draw a checkerboard.
 * @author humzahkha0143
 */

public class Chessboard {

    private int sq;
    private int sz;
    
    /**
     * Default constructor, two parameters
     * @param Squares - Amount of Squares on the checkerboard.
     * @param Size - How big the squares should be on the checkerboard.
     */
    public Chessboard (int Squares, int Size) {
        sq = Squares;
        sz = Size;
    }

    /**
     * Method calls a loop that increments the following square's y by
     * the size of the square until the amount of squares on that axis
     * achieved. Inside is another loop that increments the following is
     * square's x by the size of the square until it reaches a threshold
     * of the amount of squares multiplied by how big the squares are,
     * meanwhile flipfloppping between colors to give the squares.
     */
    public void draw(Graphics2D g2) {
        
        double x, y = 0;
        boolean wr = true;
        
        while(y <= (sq * sz)) {
            
           for(x = 0; x <= (sq * sz); x += sz) {
               
               
               if(wr == true) {
                   g2.setColor(Color.red);
                   wr = false;
               }
               else {
                   g2.setColor(Color.white);
                   wr = true;
               }
               g2.fillRect((int) x, (int) y, sz, sz); 
               
           }
           
           if(wr == true) {
               wr = false;
           }
           else {
               wr = true;
           }
           
           y += sz;
           
        }

    }
    
    
    
}
