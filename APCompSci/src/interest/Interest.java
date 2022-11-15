package interest;

public class Interest {
    
    private int cash;
    private int rate;

    public Interest (int c, int r) {
        cash = c;
        rate = r;
    }


    public int getRate() {
        return rate;
    }

    public int getBalance() {
        return cash;
    }

    public void calcInt(int time) {
        cash = ((rate / 100) * time + 1);
    }

}
