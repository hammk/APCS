package large2D;

public class TDTest {

    public static void main(String[] args) {

        int[][] sizeGvn = {{34,12,3},{42,21,4},{13,9,2},{12,11,334}};
        double[][] avgGvn = {{34.0, 12.0, 3.3, 14.8, 19.0, 0.5, 0.0, 13.9}, /* row 1 */ {43.9, 21.0, 4.2, 84.1, 39.9, 8.4, 12.4, 20.1,}, /* row 2 */ {13.9, 9.3, 1.2, 12.3, 98.0, 22.3, 43.2, 100.9}, /* row 3 */ {12.1, 11.2, 33.4, 95.2, 78.2, 100.0, 77.2, 21.1} /* row 4 */};
        
        System.out.println(TwoDArray.getLargestValue(sizeGvn));
        
        for (int row = 0; row < avgGvn.length; row++) {
            System.out.println(TwoDArray.getRowAvg(avgGvn)[row]);
        }
        
        System.out.println(" ");
        
        for (int col = 0; col < avgGvn.length; col++) {
            System.out.println(TwoDArray.getColAvg(avgGvn)[col]);
        }

    }

}
