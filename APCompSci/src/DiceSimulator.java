/**
 * @author humzahkha0143
 * collegeboard choosing a language to teach in comp sci classes be like:
 */

import java.util.Random;

public class DiceSimulator {

	public static void main(String[] args) {

		Random generator = new Random();                      // Recall random class
		
		int num = generator.nextInt(7);                       // Select an integer between 1 and 6 and store it into integer variable "num"
		if(num == 0) num = generator.nextInt(7);              // Reroll if it's zero. "...between and including 1 and 6 every time the program is run." - Die Simulator Lab.docx
		
		//String phrase = null;                               // Make a phrase to go along with any selected number, in this case what language CollegeBoard will use to teach in computer science.
                                                       		  // Phrase definitions.
		//if(num == 1) phrase = "CollegeBoard sternly decreed; use an outdated version of Java. Their money will go to Oracle because their yachts are cool and I guess anything in outdated Java applies to modern Java.";
		//else if(num == 2) phrase = "CollegeBoard politely decreed; use C as it makes the world go 'round. They don't see any licensing fees to deal with, it'll apply anywhere on any OS, and correct memory management is like zen.";
		//else if(num == 3) phrase = "CollegeBoard rudely decreed; use Scratch as it's what Comp Sci students know best after drilling it into their heads throughout elementary and middle school. MIT probably won't mind...";
		//else if(num == 4) phrase = "CollegeBoard decreed with a smile; use Assembly as it will create a bond between you and the computer; who cares about district security when you can cheat on x86 and code in ARM assembly?";
		//else if(num == 5) phrase = "CollegeBoard happily decreed; use Kotlin because it is an attempt to make a better version of Java. No fees to pay here, and Kotlin still interops with Java.";
		//else if(num == 6) phrase = "CollegeBoard decreed with a sneer; use Rust because it'll turn everybody into furries.";
		
		//System.out.println("\"" + num + ",\" " + phrase);   // Print the number and corresponding phrase.
		
		System.out.println("You rolled a " + num + ".");      // Print the number.

	}

}
