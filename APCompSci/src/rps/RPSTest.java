// by humzahkha0143
package rps;

import java.util.Scanner;

public class RPSTest {

    public static void main(String[] args) {
        
        // Instantiate choice and initialize String playerChoice
        Scanner choice = new Scanner(System.in);
        String pC;
        // Begin Do-While loop, it's guaranteed to run at least once.
        do {
            System.out.print("Please enter Rock, Paper, or Scissors: ");
            pC = choice.next();
            System.out.println(RPS.playRPS(pC));
            System.out.print("\nFinished playing? If so, enter yes. ");
            pC = choice.next();
        }
        while(!pC.equalsIgnoreCase("yes"));
        // Inevitable condition fail (the user wants out)
        System.out.println("C YA!");
        choice.close();
    }

}