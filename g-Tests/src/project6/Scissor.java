/**
 * 
 */
package project6;

/**
 * @author Troopa
 * @version 22.02.2014
 */
public class Scissor implements Figure {

	public static final int strength = 1;
	
	@Override
	public int getStrength() {
		return 0;
	}

	@Override
	public boolean isWeakTo(Figure f) {
		return false;
	}

}
