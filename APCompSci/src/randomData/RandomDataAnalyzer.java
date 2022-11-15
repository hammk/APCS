package randomData;

/**
 * This class's main method is split into two phases, Phase 1 uses a scanner to get
 * how many numbers the user wants the program to send out (rd), then initializes variables
 * for Phase 2, which calls a loop that runs until rd is reached. Inside the loop, a random
 * number is generated (0-0.999...) and multiplies it by 100 (0-99.9...) before casting it
 * into an int, adding it to the overall sum, and printing it out, which increments and goes
 * back to the start of the loop. After the loop ends, the average is calculated by dividing
 * the sum of all numbers generated in the loop with rd, before printing out the sum and average. 
 * by @author humzahkha0143
 */

import java.util.*;

public class RandomDataAnalyzer {
    
    
    public static void main(String args[]) {
        
        // phase 1
        
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need randomized? ");
        int rd = in.nextInt();
        int given;
        int sum = 0;
        
        // phase 2
        
        for(int i = 1; i <= rd; i++) {
            given = (int) (Math.random() * 100);
            sum += given;
            System.out.print(given + ", ");
        }
        
        double avg = (double) (sum) / (double) (rd);
        System.out.println("\n" + "The sum is:" + sum + ". The average is:" + avg);
        
        in.close();
        
    }
    
}
