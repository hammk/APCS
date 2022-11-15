package interest;

public class IntTest {
    
    public static void main(String args[]) {
        Interest intr = new Interest(20000, 5);

        intr.calcInt(20);
        System.out.println(intr.getBalance());
    }

}
