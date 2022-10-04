package celsiusTester;

import java.util.Scanner;

public class CelsiusTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);               // Cast scanner into an object 
		System.out.print("Give me a number in Celsius: "); // Message for user to input..
		float num = sc.nextFloat();	                       // ..a float to store into num and to use in Celsius.java
		
		Celsius cs = new Celsius(num);                     // Cast our beloved Celsius.java into an object...
		System.out.print(cs.convertCToF());                // Finally, take num and convert it from Celsius to Farenheit, and print the result.
		
		sc.close();

	}

}
