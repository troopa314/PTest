/**
 * 
 */
package project6;

/**
 * @author Troopa
 * @version 22.02.2014
 */
public class Paper implements Figure {

	public int strength = 0;
	
	@Override 
	public String toString() {
		return "Paper";
	}
	
	@Override
	public int getStrength() {
		return strength;
	}

	@Override
	public boolean isWeakTo(Figure f) {
		//as Interfaces disallow static methods, I am forced to do so
		if(f.getStrength() == new Rock().getStrength()) {
			return false;
		}
		else if(f.getStrength() == new Scissor().getStrength()) {
			return true;
		}
		return false;
	}

}
