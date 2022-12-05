package large2D;

public class TwoDArray {
    
    public static String getLargestValue(int[][] ary) {
        
        int xIndex = 0;
        int yIndex = 0;
        int num = 0;
        
        for(xIndex = 0; xIndex < ary.length; xIndex++) {
        
            for(yIndex = 0; yIndex < ary[yIndex].length; yIndex++) {
                
                if(num < ary[xIndex][yIndex]) num = ary[xIndex][yIndex];
                
            }
        
        }
        return "Largest Value: " + num + ", Index: (" + (xIndex - 1) + ", " + (yIndex - 1) + ")";
        
    }
    
}
