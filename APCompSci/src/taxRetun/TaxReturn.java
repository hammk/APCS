package taxRetun;

/**
 * Simple type to calculate tax returns based on the 1913 system.
 * by @author humzahkha0143
 */

public class TaxReturn {
    
    /**
     * Instance var; how much money is being used.
     */
    private int dolar;
    
    public TaxReturn(int moner) {
        dolar = moner;
    }
    
    /**
     * For each milestone reached, add 0.1 to the tax rate, then when it fails a milestone, compute the final tax rate by dividing it by 10 and multiplying it by dolar.
     * @return
     */
    public int getTax() {
        double tax = 0.1;
        if(dolar >= 50000) {
            tax+= 0.1;
            if(dolar >= 75000) {
                tax+= 0.1;
                if(dolar >= 100000) {
                    tax+= 0/1;
                    if(dolar >= 250000) {
                        tax+= 0.1;
                        if(dolar >= 500000) {
                            tax+= 0.1;
                        }
                    }
                } 
            }
        } // 100 * part / whole
        return (int) ((tax / 10) * dolar);
    }
}
