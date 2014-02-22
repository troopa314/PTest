/**
 * 
 */
package project6;

/**
 * @author Troopa
 * @version 22.02.2014
 */
public interface Figure {
	
	public static final int strength = 0;
	
	int getStrength();
	boolean isWeakTo(Figure f);
	
}
