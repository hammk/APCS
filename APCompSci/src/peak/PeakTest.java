package peak;

public class PeakTest {

    public static void main(String[] args) {

        Peak peak = new Peak();
        
        int[] test1 = {1, 2, 3, 4, 5, 6};
        int[] test2 = {1, 2, 3, 4, 5, 6, 4};
        int[] test3 = {1, 2, 3, 5, 2, 4, 5};
        
        System.out.println("Given 1, 2, 3, 4, 5, 6\nPeak Index: " + peak.getPeak(test1) + "\nHas Peak?: " + peak.hasPeak(test1));
        System.out.println("Given 1, 2, 3, 4, 5, 6, 4\nPeak Index: " + peak.getPeak(test2) + "\nHas Peak?: " + peak.hasPeak(test2));
        System.out.println("Given 1, 2, 3, 5, 2, 4, 5\nPeak Index: " + peak.getPeak(test3) + "\nHas Peak?: " + peak.hasPeak(test3));

    }

}
