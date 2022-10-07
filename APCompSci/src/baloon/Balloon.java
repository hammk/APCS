package baloon;

public class Balloon {

	private int vol;
	
	public Balloon() {
		vol = 0;
	}
	
	public void addAir(int add) {
		vol += add;
	}
	
	public double getVolume() {
		return vol;
	}
	
	public double getSurfaceArea() {
		// 4 * Math.PI * rad^2
		double rad = Math.cbrt(vol / ( (4/3) / Math.PI) );
		return (Math.pow(rad, 2) * Math.PI * 4);
	}
	
	public double getRadius() {
		// volume = (4/3) * Math.PI * r3
		double r3 = vol / ((4/3)/Math.PI);
		return Math.cbrt(r3);
	}
	
}
