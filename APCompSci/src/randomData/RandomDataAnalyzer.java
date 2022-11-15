package randomData;

import java.util.*;

public class RandomDataAnalyzer {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need randomized? ");
        int rd = in.nextInt();
        int given;
        int whole = 0;
        
        // phase 1
        
        for(int i = 1; i <= rd; i++) {
            
            given = (int) (Math.random() * 100);
            whole += given;
            System.out.print(given + ", ");
        }
        
        double avg = (double) (whole) / (double) (rd);
        System.out.println("\n" + "The sum is:" + whole + ". The average is:" + avg);
        
        in.close();
        
    }
    
}
