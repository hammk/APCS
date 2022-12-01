package arraySort;

import java.util.ArrayList;

/**
 * Two static methods that check if
 * an array (or arraylist) are sorted.
 * @author humzahkha0143
 */

public class Sorted {

    /**
     * Checks if an Array is sorted properly using
     * a for loop to compare an index against (index + 1) to see if
     * (index + 1) is higher than index.
     * @param ar - Array of Integers
     * @return
     */
    public static boolean isArraySorted(int[] ar) {
        for(int i = 1; i < ar.length; i++) {
            if(ar[i] < ar[i - 1]) return false;
        }
        return true;
    }
    
    /**
     * Same as isArraySorted, but for ArrayLists.
     * @param ar - ArrayList of Integers
     * @return
     */
    public static boolean isArrayListSorted(ArrayList<Integer> ar) {
        for(int i = 1; i < ar.size(); i++) {
            if(ar.get(i) < ar.get(i - 1)) return false;
        }
        return true;
    }
    
}
