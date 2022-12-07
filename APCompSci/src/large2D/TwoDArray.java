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
     * After initializing the variables, it begins a for loop that
     * traverses the rows (xIndex). Inside the loop is another for loop that
     * traverses the columns (yIndex) and adds up the values in that column.
     * The average for that column is then stored to the respective
     * index in the table of row averages before the xIndex loop
     * increments. When the xIndex loop concludes, the resulting
     * table of row averages are returned.
     * @param ary - Given array of doubles. NO JAGGED ARRAYS!
     * @return numTbl - 1D array of averages for each row in given array.
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
     * After initializing the variables, it begins a for loop that
     * traverses the columns (yIndex). Inside the loop is another for loop that
     * traverses the rows (xIndex) and adds up the values in that row.
     * The average for that row is then stored to the respective
     * index in the table of column averages before the yIndex loop
     * increments. When the yIndex loop concludes, the resulting
     * table of column averages are returned.
     * @param ary - Given array of doubles. NO JAGGED ARRAYS!
     * @return numTbl - 1D array of averages for each column in given array.
     */
    public static double[] getColAvg(double[][] ary) {
        int xIndex = 0;
        int yIndex = 0;
        double numTbl[] = new double[ary[0].length];
        double num = 0;
        
        for(yIndex = 0; yIndex < ary[0].length; yIndex++) {
            
            for(xIndex = 0; xIndex < ary.length; xIndex++) {
                
                num += ary[xIndex][yIndex];
                
            }
            numTbl[yIndex] = (num / ary.length);
            num = 0;
            
        }
        return numTbl;
    }
    
}
