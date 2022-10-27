package balloon;

public class BalloonTester {

	public static void main(String[] args) {
		
		Balloon bl = new Balloon();
		
		System.out.println("Volume: " + bl.getVolume());
		System.out.println("Expected: 0");
		System.out.println("Surface Area: " + bl.getSurfaceArea());
		System.out.println("Expected: 0");
		System.out.println("Radius: " + bl.getRadius());
		System.out.println("Expected: 0\n");
		
		bl.addAir(100);
		System.out.println("Volume: " + bl.getVolume());
		System.out.println("Expected: 100");
		System.out.println("Surface Area: " + bl.getSurfaceArea());
		System.out.println("Expected: 104.1879415");
		System.out.println("Radius: " + bl.getRadius());
		System.out.println("Expected: 2.8794119\n");
		
		bl.addAir(100);
		System.out.println("Volume: " + bl.getVolume());
		System.out.println("Expected: 200");
		System.out.println("Surface Area: " + bl.getSurfaceArea());
		System.out.println("Expected: 165.3880481");
		System.out.println("Radius: " + bl.getRadius());
		System.out.println("Expected: 3.6278317\n");
		
	}

}
