package gcfInator;

/**
 * Class has two 
 * by @author humzahkha0143
 */
public class GCF {
    /**
     * First number to check.
     */
    private int num1;
    /**
     * Second number to check.
     */
    private int num2;
    
    /**
     * Default constructor; sets the 2 numbers to calculate the GCF with.
     * @param num1
     * @param num2
     */
    public GCF(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    /**
     * This method calculates the two numbers' GCF. It runs a loop that
     * runs until either num1 or num2 are 0. In the loop, if num1 is
     * greater than num2, subtract num1's value from num2, and vice versa.
     * @return Greatest Common Factor of num1 and num2.
     */
    public int findGCF() {
        while(num1 > 0 && num2 > 0) {
            if(num1 > num2) num1 -= num2;
            if(num1 < num2) num2 -= num2; 
        }
        if(num1 == 0)return num2;
        else if(num2 == 0) return num1;
        return 0;
    }
    
}
