package project24;

import java.util.Scanner;

/**
 * @author Troopa
 * @version 22.02.2014
 */
public class Dec2bin {
	private static String s = "";

	private static long getRemainder(long n, int givenDivisor) {
		return n % givenDivisor;
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
		s = s + Long.toString(getRemainder(n, 2));
		if(n != 0) {
			convertToBinary((int)Math.floor(n / 2));
		}
		return new StringBuilder(s).reverse().toString();
	}
	
	public static String convertToGivenBase(long n, int base) {
		s = s + Long.toString(getRemainder(n, base));
		if(n != 0) {
			convertToGivenBase((int)Math.floor(n / base), base);
		}
		return new StringBuilder(s).reverse().toString();
	}
	

}
