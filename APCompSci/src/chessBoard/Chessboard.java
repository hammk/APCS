package chessBoard;

import java.awt.Graphics2D;

public class Chessboard {

    private int sq;
    private int sz;
    
    public Chessboard (int Squares, int Size) {
        sq = Squares;
        sz = Size;
    }

    public void draw(Graphics2D g2) {
        
        int count, y = 0;
        for(count = 0; y <= sz; count += sq) {
           if(count <= sz) g2.drawRect(count, y, sz, sz); 
        }
        
        
    }
    
    
    
}
