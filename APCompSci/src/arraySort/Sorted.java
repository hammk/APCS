package arraySort;

import java.util.ArrayList;

/**
 * Two methods; one 
 * @author humzahkha0143
 */

public class Sorted {

    /**
     * checks if an Array is sorted properly using
 * a for loop to compare an index against (index + 1) to see if
 * (index + 1) is higher than index. The second is the same, but
 * for ArrayLists instead of Arrays.
     * @param ar - Array of Integers
     * @return
     */
    public static boolean isArraySorted(int[] ar) {
        for(int i = 1; i < ar.length; i++) {
            if(ar[i] < ar[i - 1]) return false;
        }
        return true;
    }
    
    public static boolean isArrayListSorted(ArrayList<Integer> ar) {
        for(int i = 1; i < ar.size(); i++) {
            if(ar.get(i) < ar.get(i - 1)) return false;
        }
        return true;
    }
    
}
