package chessBoard;

/**
 * @(#)ChessboardViewer.java
 *
 * ChessboardViewer application
 *
 * @author 
 * @version 1.00 2017/11/14
 */

import javax.swing.*;

/**
   This program displays a Chessboard.
*/
public class ChessboardViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 330;
      final int FRAME_HEIGHT = 360;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("ChessboardViewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      ChessboardComponent component = new ChessboardComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}