
import java.util.*;

public class StringPrinter {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String gvn = "Good Morning APCS!";//in.next();
        int j;
        
        for(j = gvn.length() - 1; j >= 0; j--)
        {
            
            char gl = gvn.charAt(j);
            System.out.print(gl);
            
        }
        
        in.close();

    }

}
