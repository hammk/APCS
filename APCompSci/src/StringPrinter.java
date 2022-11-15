
import java.util.*;

public class StringPrinter {

    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a String: ");  // ..
            String gvn = in.nextLine();            // Use scanner class to get the string to reverse.
            int j;
            
            for(j = gvn.length() - 1; j >= 0; j--) // Set J to the length of given string, decrement by 1 after the following runs until J is 0.
            {
                
                char gl = gvn.charAt(j);                         // Define a character at J's position
                if(gvn.indexOf(" ") == j) System.out.print(" "); // If the char is a space, just print a space and go back to start of loop
                else System.out.print(gl);                       // If the char isn't a space, print that char.
                
            }
            
        }

    }

}
