/**
 * 
 */
package project6;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import misc.Logo;
/**
 * @author Troopa
 * @version 22.02.2014
 */
public class Rockpaperscissors {
	
	static int pScore, cScore, winningScore;
	static Scanner sc = new Scanner(System.in);
	
	private static boolean hasWon() {
		if(pScore >= winningScore) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Logo.printLogo();
		System.out.println("__________________________________");
		System.out.println("Rock is 2 - Paper is 0 - Scissors is 1");
		sc = new Scanner(System.in);
		winningScore = Integer.parseInt(JOptionPane.showInputDialog("Winning Score:"));
		//The game loop
		while (pScore < winningScore || cScore < winningScore) {
			game();
		}
		//Handling the Success/Game Over part
		if(hasWon()) {
			System.out.println("Yay, you won!");
		}
		else {
			System.out.println("Oh noes, you lost.. =(");
		}
	}
	
	public static void game() {
		Figure chosenFigure = null;
		//Input handling
		System.out.println("Your Turn!");
		int n = Integer.parseInt(JOptionPane.showInputDialog("Your Figure:"));
		switch(n) {
		case 0:
			chosenFigure = new Paper();
		case 1:
			chosenFigure = new Scissor();
		case 2:
			chosenFigure = new Rock();
		}
		JOptionPane.showMessageDialog(null, chosenFigure);
		JOptionPane.showMessageDialog(null, "Your Score: " + pScore + "\nComputer's Score: " + cScore);
		//Game logic
		Figure computerFigure = Rockpaperscissors.giveRandomFigure();
		System.out.println(chosenFigure.toString() + " VS " + computerFigure.toString());
		try{
		if(battle(chosenFigure, computerFigure) == chosenFigure) {
			pScore++;
			System.out.println("Your Score increased by One.");
			System.out.println("__________________________________");
		}
		else if(battle(chosenFigure, computerFigure) == computerFigure) {
			cScore++;
			System.out.println("Computer's Score increased by One.");
			System.out.println("__________________________________");
		}
		}
		catch(IllegalArgumentException e) {
			System.out.println("Both are equal.");
			System.out.println("__________________________________");
		}
	}
	
	/**
	 * 
	 * @param pF Player's figure
	 * @param cF Computer's figure
	 * @return Winning figure
	 */
	private static Figure battle(Figure pF, Figure cF) {
		if(pF == cF) {
			throw new IllegalArgumentException("Same figures!");
		}
		else if(pF.isWeakTo(cF)) {
			return cF;
		}
		return pF;
	}
	
	private static Figure giveRandomFigure() {
		int n = new Random().nextInt(60);
		if(n > 40) {
			return new Rock();
		}
		else if(n > 20 && n < 40) {
			return new Scissor();
		}
		else {
			return new Paper();
		}
	}
	
}
