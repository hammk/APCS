package format;

import java.util.ArrayList;

public class Format
{
    /** Returns the total number of letters in wordList.
     *  Precondition: wordList contains at least two words, consisting of letters only.
     *  Fixes by author.
     *  @author humzahkha0143
     */
    public static int sumOfLetters(ArrayList<String> wordList)
    {
      int counter = 0;
      for(int i = 0; i < wordList.size(); i++) {
          counter += wordList.get(i).length();
      }
      return counter;
    }

}