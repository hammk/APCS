package chessBoard;

import java.awt.Color;
import java.awt.Graphics2D;

public class Chessboard {

    private int sq;
    private int sz;
    
    public Chessboard (int Squares, int Size) {
        sq = Squares;
        sz = Size;
    }

    public void draw(Graphics2D g2) {
        
        int count, y;
        boolean wr = true;
        for(y = 0; y <= sz; y += sz) {
            
           for(count = 0; count <= sz; count += sz) {
               
               if(wr == true) {
                   g2.setColor(Color.red);
                   wr = false;
               }
               else {
                   g2.setColor(Color.white);
                   wr = true;
               }
               g2.drawRect(count, y, sz, sz); 
               
           }
                   
        }
        
        
    }
    
    
    
}
