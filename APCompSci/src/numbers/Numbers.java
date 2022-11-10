package numbers;

public class Numbers {
    
    private int st;
    private int en;
    
    StringBuilder sb = new StringBuilder();
    
    public Numbers (int start, int end) {
        st = start;
        en = end;
    }
    
    public String findOddNumbers() {
        
        for(int gn = st; st <= en; st++) {
            if (gn % 2 == 0) sb.append(gn);
        }
        return sb.toString();
        
    }
    
    public String findEvenNumbers() {
        
        for(int gn = st; st <= en; st++) {
            if (gn % 2 == 1) sb.append(gn);
        }
        return sb.toString();
        
    }
    
}
