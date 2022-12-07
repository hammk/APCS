package carLot;

import java.util.ArrayList;

public class CarLot {
    
    private ArrayList<Car> gvn = new ArrayList<Car>();
    
    public CarLot (ArrayList<Car> cars) {
        gvn = cars;
    }
    
    public double getValuation() {
        double vl = 0;
        
        for(int i = 0; i < gvn.size(); i++) {
            vl += gvn.get(i).getValue();
        }
                
        return vl;
    }
    
    public double getValuationByColor(String Color) {
        double vl = 0;
        
        for(int i = 0; i < gvn.size(); i++) {
            if(gvn.get(i).getColor() == "Black") vl += gvn.get(i).getValue();
        }
                
        return vl;
    }
    
}
