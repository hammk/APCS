package rps;

import java.util.Scanner;

public class RPSTest {

    public static void main(String[] args) {
        
        Scanner choice = new Scanner(System.in);
        String pC;
        do {
            System.out.print("Please enter Rock, Paper, or Scissors: ");
            pC = choice.next();
            System.out.println(RPS.playRPS(pC));
            System.out.print("\nFinished playing? If so, enter yes. ");
            pC = choice.next();
        }
        while(!pC.equalsIgnoreCase("yes"));
        System.out.println("C YA!");
        choice.close();
    }

}
