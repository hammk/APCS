package lastDigit;

import java.util.Scanner;

public class LastDigitChecker {

    /**
     * Nested loop. After initializing a temporary number,
     * the first loop sets the number to the contents of
     * index 0 of an array shrunk down to only a single
     * digit. This digit is then compared to the rest of
     * the array's entries (shrunk to a single digit) for
     * equality.
     * @param dgts
     * @return
     */
    public static Boolean calculate(int[] dgts) {
        int temp = 0;
        for(int dex = 0; dex < dgts.length; dex++) {
            temp = dgts[dex] % 10;
            for(int i = dex + 1; i < dgts.length; i++){
                if (temp == (dgts[i] % 10)) return true;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int[] gvn = new int[3];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter 3 non-negative integers: ");
        for(int dex = 0; dex < 3; dex++) gvn[dex] = in.nextInt();
        in.close();
        
        System.out.println(calculate(gvn));
        
        System.out.println("\n  ---------       /-- \n / \"HAPPY  \\     /-\\ \n/  BIRSDAY  \\   |. .|\n\\  AP COMP  / ~ | V |\n \\   SCI!\" /    |----\\ \n  ---------     |    ⁀⁀\\ \n                |       \\ \n                \\∖_____∕/\n                  || ||\n                 <=/ <=/\n");

        
    }

}
