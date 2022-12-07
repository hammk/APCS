package carLot;

import java.util.ArrayList;

/**
 * This class utilizes an ArrayList holding instances of the
 * Car object to appraise a car's value, or do so by color.
 * @author humzahkha0143
 */
public class CarLot {
    
    private ArrayList<Car> gvn = new ArrayList<Car>();
    
    /**
     * Default Constructor; takes a Car ArrayList and stores it.
     * @param cars - ArrayList of Car objects.
     */
    public CarLot (ArrayList<Car> cars) {
        gvn = cars;
    }
    
    /**
     * Using a for loop to traverse the ArrayList of Car objects,
     * and adding to a counter the number returned from a method
     * in each Car object; getValue. When the loop concludes, the
     * counter is returned.
     * @return vl - Counter incremented by car values.
     */
    public double getValuation() {
        double vl = 0;
        
        for(int i = 0; i < gvn.size(); i++) {
            vl += gvn.get(i).getValue();
        }
                
        return vl;
    }
    
    /**
     * Using a for loop to traverse the ArrayList of Car objects,
     * the given Car object (through its getColor method) is compared
     * to the parameter Color for equality. If true, the getValue
     * method is used to add the car's value to a counter. When
     * the loop concludes, the counter is returned.
     * @param Color - Color to compare cars to.
     * @return vl - Counter incremented by car values.
     */
    public double getValuationByColor(String Color) {
        double vl = 0;
        
        for(int i = 0; i < gvn.size(); i++) {
            if(gvn.get(i).getColor() == "Black") vl += gvn.get(i).getValue();
        }
                
        return vl;
    }
    
}
