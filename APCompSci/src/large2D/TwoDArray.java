package large2D;

/**
 * This class passes through a 2D array to determine either it's highest value and index or the average and sum of the array.
 * @author humzahkha0143
 */
public class TwoDArray {
    
    /**
     * This method initializes variables for the indexes of X and Y
     * across the array and what so far it thinks is the highest
     * number, then it traverses the given 2D array. When it finds
     * a number higher than it's own 'highest' number, that number
     * and it's index are stored. When it finishes the array, those
     * two values are returned.
     * @param ary - Two-Dimensional Array to search.
     * @return num - Highest detected number.
     * @return xC - X-axis coordinates for num.
     * @return yC - Y-axis coordinates for num.
     */
    public static String getLargestValue(int[][] ary) {
        
        int xIndex = 0;
        int xC = 0;
        int yIndex = 0;
        int yC = 0;
        int num = 0;
        
        for(xIndex = 0; xIndex < ary.length; xIndex++) {
        
            for(yIndex = 0; yIndex < ary[yIndex].length; yIndex++) {
                
                if(num < ary[xIndex][yIndex]) {
                    num = ary[xIndex][yIndex];
                    xC = xIndex;
                    yC = yIndex;
                }
                
            }
        
        }
        return "Largest Value: " + num + ", Index: (" + xC + ", " + yC + ")";
        
    }
    
    /**
     * 
     * @param ary
     * @return
     */
    public static double[] getRowAvg(double[][] ary) {
        int xIndex = 0;
        int yIndex = 0;
        double numTbl[] = new double[ary.length];
        double num = 0;
        
        for(xIndex = 0; xIndex < ary.length; xIndex++) {
        
            for(yIndex = 0; yIndex < ary[xIndex].length; yIndex++) {
                
                num += ary[xIndex][yIndex];
                
            }
            numTbl[xIndex] = num / ary[xIndex].length;
            
        }
        return numTbl;
    }
    
    /**
     * 
     * @param ary
     * @return
     */
    public static double[] getColAvg(double[][] ary) {
        int xIndex = 0;
        int yIndex = 0;
        double numTbl[] = new double[ary.length];
        double num = 0;
        
        for(xIndex = 0; xIndex < ary.length; xIndex++) {
        
            for(yIndex = 0; yIndex < ary[xIndex].length; yIndex++) {
                
                num += ary[xIndex][yIndex];
                
            }
            numTbl[xIndex] = num / ary[xIndex].length;
            
        }
        return numTbl;
    }
    
}
