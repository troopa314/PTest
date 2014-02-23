package project24;

import java.util.Scanner;

/**
 * @author Troopa
 * @version 22.02.2014
 */
public class Dec2bin {
	private static String s = "";

	private static long getRemainder(long n) {
		return n % 2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number you want to convert:");
		long n = sc.nextLong();
		System.out.println("In binary, your number is:" + convertToBinary(n));
	}
	
	public static String convertToBinary(long n) {
		s = s + Long.toString(getRemainder(n));
		if(n != 0) {
			convertToBinary((int)Math.floor(n / 2));
		}
		return new StringBuilder(s).reverse().toString();
	}
	

}
