/**
 * 
 */
package project6;

/**
 * @author Troopa
 * @version 22.02.2014
 */
public class Rock implements Figure {

	public int strength = 2;
	
	@Override 
	public String toString() {
		return "Rock";
	}
	
	@Override
	public int getStrength() {
		return strength;
	}

	@Override
	public boolean isWeakTo(Figure f) {
		//as Interfaces disallow static methods, I am forced to do so
				if(f.getStrength() == new Paper().getStrength()) {
					return true;
				}
				else if(f.getStrength() == new Scissor().getStrength()) {
					return false;
				}
				return false;
	}

}
