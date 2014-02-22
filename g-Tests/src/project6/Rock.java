/**
 * 
 */
package project6;

/**
 * @author Troopa
 * @version 22.02.2014
 */
public class Rock implements Figure {

	public static final int strength = 2;
	
	@Override
	public int getStrength() {
		return 0;
	}

	@Override
	public boolean isWeakTo(Figure f) {
		return false;
	}

}
