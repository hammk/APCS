package rps;

/**
 * Plays Rock, Paper, Scissors with the user using a given answer. This project started on Birsday.
 * by @author humzahkha0143
 */
public class RPS {
    
    /**
     * Plays Rock, Paper, Scissors with the user. It first sets the computer's choice to a selection of 0-3.
     * If it's zero, add one then convert 1 to Rock, 2 to Paper, and 3 to Scissors, storing it as String cN.
     * Then it's checked for equality with the Player's choice, quitting the app saying that it's a tie if
     * true. If it's not, then the Player's choice is compared with the Computer's other choices (scissors
     * and paper if Player chose rock, etc.) determining who won to String decision, then returning the decision.
     * @param pN - Name of Player's Choice
     * @return Winner
     */
    public static String playRPS(String pN) {
        
        String cN = null;
        String decision = null;
        int cC = (int) (Math.random() * 2);
        if(cC == 0) cC++;
        
        switch (cC) {
            case 0  : cN = "Rock";     break;
            case 1  : cN = "Paper";    break;
            case 2  : cN = "Scissors"; break;
            default : return "Oop, I screwed up.";
        }
        
        if(pN.equalsIgnoreCase(cN)) return "\nComputer selects: " + cN + "\n\nIt's a Tie!";  
        else if(pN.equalsIgnoreCase("Rock")) {
            if(cN.equals("Scissors")) decision = "Rock wins!!!";
            if(cN.equals("Paper")) decision = "Paper wins!!!";
        }
        else if(pN.equalsIgnoreCase("Paper")) {
            if(cN.equals("Rock")) decision = "Paper wins!!!";
            if(cN.equals("Scissors")) decision = "Scissors wins!!";
        }
        else if(pN.equalsIgnoreCase("Scissors")) {
            if(cN.equals("Paper")) decision = "Scissors wins!!!";
            if(cN.equals("Rock")) decision = "Rock wins!!!";
        }
        else return "You did not enter Rock, Paper, or Scissors!!!";
        
        return "\nComputer selects: " + cN + "!\n\n" + decision;
        
    }
    
    //public static void main(String args[]) {
    //    System.out.println("\n  ---------       /-- \n / \"HAPPY  \\     /-\\ \n/  BIRSDAY  \\   |. .|\n\\  AP COMP  / ~ | V |\n \\   SCI!\" /    |----\\ \n  ---------     |    ⁀⁀\\ \n                |       \\ \n                \\∖_____∕/\n                  || ||\n                 <=/ <=/\n");
    //}
}