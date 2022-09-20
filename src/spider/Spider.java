package spider;

public class Spider{
	/**
	 * Non-graphical Spider class to define the position of a horizontal 'spider'.
	 * It can be moved using method move(), or turned around using the turn() method.
	 * By @author humzahkha0143
	 */
	private int pos, dir;
	
	/**
	 * GetPos returns the spider's position as an integer.
	 * @return pos
	 */
	public int getPos() {
		return pos;
	}
	/**
	 * Default constructor; sets position to 5.
	 */
	public void cst() {
		setPos(5);
	}
	/**
	 * Constructor with arguments; sets position to integer.
	 * @param newPos
	 */
	public void cst(int newPos) {
		setPos(newPos);
	}
	
	/**
	 * Inverts direction of spider when move() is called.
	 */
	public void turn() {
		dir = dir * -1 
		System.out.println(dir)
	}
	/**
	 * Multiplies integer dst by either 1 or -1 depending on dir, then adds the result to the spider's position (the integer pos.)
	 * @param dst
	 */
	public void move(int dst) {
		int direct = dir * dst
		pos = pos + direct
	}
	
}
