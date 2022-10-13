package spider;

public class Spider{
	/**
	 * Non-graphical Spider class to define the position of a horizontal 'spider'.
	 * It can be moved using method move(), or turned around using the turn() method.
	 * By @author humzahkha0143
	 */
	private int pos, dir;

	/**
	 * Default constructor, setting the position of the Spider to 2.
	 */
	public Spider() {
		pos = 2;
	}
	/**
	 * Constructor with arguments, setting the position of the Spider to the integer newPos.
	 * @param newPos
	 */
	public Spider(int newPos) {
		pos = newPos;
	}
	
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
	
	public void turn() {
		dir = dir * -1;	
	}
	public void move(int p) {
		pos = pos + p;
	}
	
}
