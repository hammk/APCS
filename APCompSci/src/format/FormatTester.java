package format;

/**
 * Write a description of class FormatterTester here.
 *
 * @author humzahkha0143
 * @version 11/30/22
 */
import java.util.ArrayList;
public class FormatTester
{
    public static void main(String[] args)
        {
             ArrayList<String> myWords = new ArrayList<String>();
             myWords.add("Good");
             myWords.add("Morning");
             myWords.add("AP");
             myWords.add("Comp");
             myWords.add("Sci");

             System.out.println("Should print 20 and prints: " + Format.sumOfLetters(myWords));
    
             ArrayList<String>words2 = new ArrayList<String>();
             words2.add("I ever tell you");
             words2.add("about the time my");
             words2.add("buddy Keith fell out");
             words2.add("the rollercoaster? Yeah, he");
             words2.add("didn't drop far, mind");
             words2.add("you, just onto the");
             words2.add("tracks, but the carnival");
             words2.add("people wouldn't stop the");
             words2.add("ride 'cause all the");
             words2.add("other people paid good");
             words2.add("money and Keith snuck");
             words2.add("on for free, so");
             words2.add("he had to dodge");
             words2.add("for, like, 20 minutes");
             words2.add("or so.");
             System.out.println("Should print 285 and prints: " + Format.sumOfLetters(words2) + "\n" + words2.toString());
        }
}
