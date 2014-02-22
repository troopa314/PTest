/**
 * 
 */
package project6;

/**
 * @author Troopa
 * @version 22.02.2014
 */
public class Scissor implements Figure {

	public int strength = 1;
	
	@Override
	public int getStrength() {
		return strength;
	}

	@Override
	public boolean isWeakTo(Figure f) {
		//as Interfaces disallow static methods, I am forced to do so
				if(f.getStrength() == new Rock().getStrength()) {
					return true;
				}
				else if(f.getStrength() == new Paper().getStrength()) {
					return false;
				}
				return false;
	}

}
