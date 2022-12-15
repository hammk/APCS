package lastDigit;

import java.util.Scanner;

public class LastDigitChecker {

    public static Boolean calculate(int[] dgts) {
        int temp = 0;
        for(int dex = 0; dex < dgts.length; dex++) {
            
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int[] gvn = new int[3];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter 3 non-negative integers: ");
        for(int dex = 0; dex < gvn.length; dex++) gvn[dex] = in.nextInt();
        System.out.println(calculate(gvn));
        
        System.out.println("\n  ---------       /-- \n / \"HAPPY  \\     /-\\ \n/  BIRSDAY  \\   |. .|\n\\  AP COMP  / ~ | V |\n \\   SCI!\" /    |----\\ \n  ---------     |    ⁀⁀\\ \n                |       \\ \n                \\∖_____∕/\n                  || ||\n                 <=/ <=/\n");

    }

}
