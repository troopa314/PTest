/**
 * 
 */
package project6;

/**
 * @author Troopa
 * @version 22.02.2014
 */
public class Paper implements Figure {

	public static final int strength = 0;
	
	@Override
	public int getStrength() {
		return 0;
	}

	@Override
	public boolean isWeakTo(Figure f) {
		return false;
	}

}
