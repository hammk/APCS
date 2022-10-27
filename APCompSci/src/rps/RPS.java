package rps;

import java.util.Random;

public class RPS {
    
    public static String playRPS(String choice) {
        
        int cC = (int) Math.random();
        String cN;
        String decision = "hah";
        switch (cC) {
            case 1 : cN = "Rock";     break;
            case 2 : cN = "Paper";    break;
            case 3 : cN = "Scissors"; break;
        }
        if(choice.isEmpty()) return "No response??";
        if(choice.equalsIgnoreCase(cN)) return "Tie!";  
        else if() {
            
        }
        else if() {
            
        }
        else if() {
            
        }
        
        return decision;
    }
    
}
