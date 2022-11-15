package interest;

public class Interest {
    
    private double cash;
    private int rate;

    /**
     * Default constructor - two parameters.
     * @param c - Starting Balance
     * @param r - Interest Rate
     */
    public Interest (int c, int r) {
        cash = c;
        rate = r;
    }

    /**
     * Instance var 'rate' getter method.
     * @return rate
     */
    public int getRate() {
        return rate;
    }

    /**
     * Instance var 'cash' getter method.
     * @return cash
     */
    public double getBalance() {
        return cash;
    }

    /**
     * Affects instance var 'cash' by calculating the owed interest and adding it to cash.
     * @param time - Years passed
     * @implNote newCash = cash * (1 + rate[.->%] / periods) * (periods * time)
     */
    public void calcInt(int time) {
        cash *= Math.pow((1.0 + ((rate / 100.0) / 12.0)), (time * 12));
    }

}
