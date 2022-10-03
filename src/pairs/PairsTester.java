package pairs;

import java.util.Scanner;

public class PairsTester {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Give me a number: ");
		double n1 = in.nextDouble();
		System.out.print("\nGive me another number: ");
		double n2 = in.nextDouble();
		// create Scanner object. Then, prompt that object to ask the user for numbers to use in casting Pairs.
		
		Pairs pr = new Pairs(n1, n2);
		// create the illustrious Pairs object 
		
		System.out.println("\n" + pr.getProduct());
		System.out.println(pr.getSum());
		System.out.println(pr.getProduct());
		System.out.println(pr.getDifference());
		System.out.println(pr.getAverage());
		System.out.println(pr.getDistance());
		System.out.println(pr.getMaximum());
		System.out.println(pr.getMinimum());
		System.out.println(pr.getRadians());
		System.out.println(pr.getSecant());
		// test the Pairs object.
		
		in.close();
	}

}
