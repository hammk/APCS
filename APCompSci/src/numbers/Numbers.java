package numbers;

/**
 * Given a number to start with and a number to end at, this class will check each following
 * number to see if it is an even (using findEvenNumbers) or odd (using findOddNumbers) number,
 * returning all of either.
 * by @author humzahkha0143
 */
public class Numbers {
    
    private int st;
    private int en;
    
    /**
     * Constructor for two instance vars.
     * @param start - number to start comparison at
     * @param end - number to end comparison at
     */
    public Numbers (int start, int end) {
        st = start;
        en = end;
    }
    
    /**
     * In a loop that lasts from the start instance var (given number is set to it) to
     * the end instance var, it checks if the given number % 2 is 1, if so then append 
     * it to String val and increments the given number until it reaches the end instance var.
     * @return 15, 17, 19...
     */
    public String findOddNumbers() {
        String val = "";
        for(int gn = st; gn <= en; gn++) {
            if(gn % 2 == 1)
            {
                val += gn + " ";
                gn++;
            }
        }
        return val;
        
    }
    
    /**
     * In a loop that lasts from the start instance var (given number is set to it) to
     * the end instance var, it checks if the given number % 2 is 0, if so then append 
     * it to String val and increments the given number until it reaches the end instance var.
     * @return 16, 18, 20...
     */
    public String findEvenNumbers() {
        String val = "";
        for(int gn = st; gn <= en; gn++) {
            if(gn % 2 == 0)
            {
                val += gn + " ";
                gn++;
            }
        }
        return val;
        
    }
    
}
