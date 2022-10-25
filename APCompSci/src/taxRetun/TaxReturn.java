package taxRetun;

/**
 * Simple type to calculate tax returns based on the 1913 system.
 * by @author humzahkha0143
 */

public class TaxReturn {
    
    /**
     * Instance var; how much money 
     */
    private int dolar;
    
    public TaxReturn(int moner) {
        dolar = moner;
    }
    
    public int getTax() {
        int tax = 1;
        if(dolar >= 50000) {
            tax++;
            if(dolar >= 75000) {
                tax++;
                if(dolar >= 100000) {
                    tax++;
                    if(dolar >= 250000) {
                        tax++;
                        if(dolar >= 500000) {
                            tax++;
                        }
                    }
                } 
            }
        } // 100 * part / whole
        else return 5;
        return (tax * 100) / dolar;
    }
}
