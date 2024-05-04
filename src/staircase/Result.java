package staircase;

import java.util.Scanner;

public class Result {

	public static void staircase(int n) {
		int i = n;
		while (i > 0) {
			String s = "";
			for(int j=0;j<i-1;j++) {
				 s= s+" ";
				 }
			for (int k = n; k > i - 1; k--) {
				s = s + "#";
			}
			 
			i--;
			System.out.println("."+s);
			//System.out.println(s+"f");
		}
		// System.out.println(s);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer n:");
		int n = scan.nextInt();
		staircase(n);
		scan.close();
	}
}
