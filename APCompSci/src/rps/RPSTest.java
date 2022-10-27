package rps;

import java.util.Scanner;

public class RPSTest {

    public static void main(String[] args) {
        
        Scanner choice = new Scanner(System.in);
        System.out.print("Please enter Rock, Paper, or Scissors: ");
        String pC = choice.next();
        System.out.println(RPS.playRPS(pC));
        choice.close();
        
    }

}
