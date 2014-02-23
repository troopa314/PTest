package project24;

import java.util.Scanner;

/**
 * @author Troopa
 * @version 22.02.2014
 */
public class Dec2bin {
	private static String s = "";

	private static String[] numbers = {"A", "B", "C", "D", "E", "F"};
	
	private static int getRemainder(long n, int givenDivisor) {
		return (int) (n % givenDivisor);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number you want to convert:");
		long givenNumber = sc.nextLong();
		System.out.print("Base of targeted System:");
		int givenBase = sc.nextInt();
		System.out.println("In base "+ givenBase +", your number is:" + convertToGivenBase(givenNumber, givenBase));
	}
	
	public static String convertToBinary(long n) {
		s = s + Integer.toString(getRemainder(n, 2));
		if(n != 0) {
			convertToBinary((int)Math.floor(n / 2));
		}
		return new StringBuilder(s).reverse().toString();
	}
	
	public static String convertToGivenBase(long n, int base) {
		if(getRemainder(n, base) > 10) {
			s = s + numbers[getRemainder(n, base) - 10];
		}
		else {
			s = s + Integer.toString(getRemainder(n, base));
		}
		if(n > 1) {
			convertToGivenBase((int)Math.floor(n / base), base);
		}
		return new StringBuilder(s).reverse().toString();
	}
	

}
