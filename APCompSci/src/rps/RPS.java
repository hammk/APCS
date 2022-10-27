package rps;

public class RPS {
    
    public static String playRPS(String pN) {
        
        String cN = null;
        String decision = "hah";
        int cC = (int) (Math.random() * 3);
        
        switch (cC) {
            case 1  : cN = "Rock";     break;
            case 2  : cN = "Paper";    break;
            case 3  : cN = "Scissors"; break;
            default : return "Wrong choice!";
        }
        
        if(pN.equalsIgnoreCase(cN)) return "Tie!";  
        else if(pN.equalsIgnoreCase("Rock")) {
            if(cN.equals("Paper")) return "I won! (chose Paper)";
            if(cN.equals("Scissors")) return "I lost! (chose Scissors)";
        }
        else if(pN.equalsIgnoreCase("Paper")) {
            if(cN.equals("Rock")) return "I lost! (chose Rock)";
            if(cN.equals("Scissors")) return "I won! (chose Scissors)";
        }
        else if(pN.equalsIgnoreCase("Scissors")) {
            if(cN.equals("Paper")) return "I lost! (chose Paper)";
            if(cN.equals("Rock")) return "I won! (chose Rock)";
        }
        
        return decision;
    }
    
    public static void main(String args[]) {
        System.out.println("\n  ---------       /-- \n / \"HAPPY  \\     /-\\ \n/  BIRSDAY  \\   |. .|\n\\  AP COMP  / ~ | V |\n \\   SCI!\" /    |----\\ \n  ---------     |    â?€â?€\\ \n                |       \\ \n                \\âˆ–_____âˆ•/\n                  || ||\n                 <=/ <=/\n");
    }
}
