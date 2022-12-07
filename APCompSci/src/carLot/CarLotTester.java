package carLot;

/**
 * @(#)CarLotTester.java
 *
 * CarLotTester application
 *
 * @author 
 * @version 1.00 2021/1/13
 */
import java.util.ArrayList;
import java.text.DecimalFormat;
 
public class CarLotTester {
    
    public static void main(String[] args) {
    	
    	ArrayList<Car> carLot = new ArrayList<Car>();
    	
    	carLot.add(new Car("Cadillac", "Silver", "Escalade", 2010, 87258, 20000));
    	carLot.add(new Car("Chevrolet", "Black", "Equinox", 2017, 90626, 13470));
    	carLot.add(new Car("Chevrolet", "White", "Malibu", 2018, 51470, 13434));
    	carLot.add(new Car("Genesis", "Blue", "G80", 2017, 33273, 26000));
    	carLot.add(new Car("Infiniti", "Black", "EX37", 2013, 84895, 13968));
    	carLot.add(new Car("Jeep", " Tango", "Wrangler Sport", 2011, 82946, 18991));
    	carLot.add(new Car("Lexus", "Silver", "IS 300", 2016, 15090, 25000));
    	carLot.add(new Car("Nissan", "White", "Altima", 2017, 90522, 11457));
    	carLot.add(new Car("Rolls-Royce", "Black", "Silver Spirit", 1986, 87111, 17777));
    	
    	
    	CarLot myCarLot = new CarLot(carLot);
    	
    	DecimalFormat numberFormat = new DecimalFormat("#.00");
    	
    	
    	System.out.println("The value of all cars are: $" +numberFormat.format(myCarLot.getValuation()));
    	System.out.println("The expected value of all cars are: $160097.00");
    	System.out.println("");
    	System.out.println("The value of all Black color cars are: $" + numberFormat.format(myCarLot.getValuationByColor("Black")));
    	System.out.println("The expected value Black color cars are: $45215.00");
    }
}
