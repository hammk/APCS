package spider;

public class Spider{
	/**
	 * Non-graphical Spider class to define the position of a horizontal 'spider'.
	 * It can be moved using method move(), or turned around using the turn() method.
	 * By @author humzahkha0143
	 */
	private int pos;
	
	/**
	 * GetPos returns the spider's position as an integer.
	 * @return pos
	 */
	public int getPos() {
		return pos;
	}
	/**
	 * SetPos is a Setter method for the spider's position, changing it to a given integer.
	 * @param nPos
	 */
	public void setPos(int nPos) {
		this.pos = nPos;
	}
	/**
	 * 
	 */
	public void cst() {
		setPos(15);
	}
	public void cst(int newPos) {
		setPos(newPos);
	}
	
	

	
	public void turn() {
		// TODO Use a boolean to set direction back and forth.
		
	}
	
	public void move() {
		
		
		
	}
	
}
