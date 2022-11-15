package randomData;

import java.util.*;

public class RandomDataAnalyzer {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need randomized? ");
        int rd = in.nextInt();
        
        for(int i = 1; i <= rd; i++) {
            
            System.out.print((int) (Math.random() * 100) + ", ");
        }
        in.useDelimiter(", ");
        
        int whole = in.nextInt();
        
        System.out.println(whole);
        
        
        
        in.close();
        
    }
    
}
