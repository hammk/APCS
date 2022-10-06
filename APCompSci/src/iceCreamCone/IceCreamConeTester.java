package iceCreamCone;

import javax.swing.*;

public class IceCreamConeTester {

	public static void main(String[] args) {
		
		//It's not Thursday, it's Birsday.
		System.out.println("\n  ---------       /-- \n / \"HAPPY  \\     /-\\ \n/  BIRSDAY  \\   |. .|\n\\  AP COMP  / ~ | V |\n \\   SCI!\" /    |----\\ \n  ---------     |    ⁀⁀\\ \n                |       \\ \n                \\∖_____∕/\n                  || ||\n                 <=/ <=/\n");

		String hSt = JOptionPane.showInputDialog("Input a number to use as the cone's height.");
		double height = Integer.parseInt(hSt); // Takes string hSt and parses it for an int to store into Height.
		String rSt = JOptionPane.showInputDialog("Input a number to use as the ice cream's radius.");
		double radius = Integer.parseInt(rSt); // Takes string rSt and parses it for an int to store into Radius.
		
		IceCreamCone icc = new IceCreamCone(height, radius);
		
		JOptionPane.showMessageDialog(null, "Surface area: " + icc.getSurfaceArea() + "\nVolume: " + icc.getVolume());
		
	}

}
