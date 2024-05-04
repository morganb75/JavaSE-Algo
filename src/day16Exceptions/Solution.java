package day16Exceptions;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer String S");
		String s =scan.next();
		try {
			int n = Integer.parseInt(s);
			System.out.println(n);
			
		} catch (NumberFormatException e) {
			System.err.println("Bad String "+e.getMessage());
		}
	}
}
