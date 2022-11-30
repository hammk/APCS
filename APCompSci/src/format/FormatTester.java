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
             words2.add("About the time my");
             words2.add("Buddy Keith fell out");
             words2.add("The rollercoaster? Yeah, he");
             words2.add("Didn't drop far, mind");
             words2.add("You, just onto the");
             words2.add("Tracks, but the carnival");
             words2.add("People wouldn't stop the");
             words2.add("Ride 'cause all the");
             words2.add("Other people paid good");
             words2.add("Money and Keith snuck");
             words2.add("On for free, so");
             words2.add("He had to dodge");
             words2.add("For, like, 20 minutes");
             words2.add("Or so.");
             System.out.println("Should print 285 and prints: " + Format.sumOfLetters(words2));
        }
}
