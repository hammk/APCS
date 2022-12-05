package arraySort;

import java.util.ArrayList;

public class SortTest {

    public static void main(String[] args) {

        int[] ar = { 1, 3, 5, 7, 9, 11, 13 , 15, 17, 19}; // define Array

        ArrayList<Integer> arList = new ArrayList<Integer>() ;
        for (int i = 1 ; i <= 10 ; i++)
        {
            arList.add( i );                         // define ArrayList
        }
        
        //ar[9] = 3;
        //arList.set(9, 3);
        // ruin the list
        
        System.out.println(arList.toString());       // make sure ArrayList is OK
        
        System.out.print("[");
        for(int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");          // make sure Array is OK
        }
        System.out.print("]");
        
        System.out.println("\n" + Sorted.isArraySorted(ar));
        System.out.println(Sorted.isArrayListSorted(arList));
        
        System.out.println("\n  ---------       /-- \n / \"HAPPY  \\     /-\\ \n/  BIRSDAY  \\   |. .|\n\\  AP COMP  / ~ | V |\n \\   SCI!\" /    |----\\ \n  ---------     |    ⁀⁀\\ \n                |       \\ \n                \\∖_____∕/\n                  || ||\n                 <=/ <=/\n");

        
    }
    
}
