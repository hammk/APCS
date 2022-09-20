package spider;

public class SpiderTester {
  
  public static void main(String args[]) {
   
    Spider spd = new Spider(4);
    System.out.println(spd.getPos);
    spd.move(2);
    spd.move(0);
    System.out.println(spd.getPos);
    spd.turn();
    spd.move(1);
    spd.move(1);
    spd.move(1);
    System.out.println(spd.getPos);
    
    
  }
  
}
