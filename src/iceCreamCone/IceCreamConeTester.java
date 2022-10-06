package iceCreamCone;

import javax.swing.*;

public class IceCreamConeTester {

	public static void main(String[] args) {
		
		System.out.println("\n  ---------       /-- \n / \"HAPPY  \\     /-\\ \n/  BIRSDAY  \\   |. .|\n\\  AP COMP  / ~ | V |\n \\   SCI!\" /    |----\\ \n  ---------     |    ¯¯\\ \n                |       \\ \n                \\∖_____∕/\n                  || ||\n                 <=/ <=/\n");
		//It's not Thursday, it's Birsday.

		String hSt = JOptionPane.showInputDialog("Enter the cone's height.");
		double height = Integer.parseInt(hSt);
		// Takes string hSt and parses it for an int to store into Height.
		String rSt = JOptionPane.showInputDialog("Enter the cone's radius.");
		double radius = Integer.parseInt(rSt);
		// Takes string rSt and parses it for an int to store into Radius.
		
		IceCreamCone icc = new IceCreamCone(height, radius);
		// Casts our IceCreamCone class into an object using the parsed height and radius.
		
		JOptionPane.showMessageDialog(null, "Surface area: " + icc.getSurfaceArea() + "\nVolume: " + icc.getVolume());
		// Print out the Surface Area and Volume of the constructed ice cream cone.
		
	}

}
