/**
 * @(#)DialogueTester.java
 *
 * A modified DialogueTester application
 *
 * @author Humzah Khan
 * @version 1.01 2022/8/30
 */
 
import javax.swing.JOptionPane;
 
public class DialogueTester {
    
    public static void main(String[] args) {
    	
    	String name = JOptionPane.showInputDialog("What is your name?"); // Make a string variable in the form of text to input in a dialog. In this case, store user's name.
    	String hby = JOptionPane.showInputDialog("What is your hobby?");         // Ditto, store user's hobby.
    	
    	if(name == null)                   // Clicking "Cancel" in the prompts sets the variables to null, which makes no sense.
    		name = "you";                  // This resolves it by setting it to a preset term. ("You" in place of your name, "breaking apps" in place of your hobby.)
    	if(name.isEmpty() == true)
    		name = "you";
    	if(hby == null)
    		hby = "Trying to break apps";
    	if(hby.isEmpty() == true)
    		hby = "Trying to break apps";
    	
       	JOptionPane.showMessageDialog(null, hby + " is such a " + name + " thing to do.");      // Use the string to complete a sentence in a response message dialog.
    }
}
