package training;

import java.util.Scanner;

public class day9RecursionProduitFactoriel {
// ATTENTION AU DELA DE 12, ON SORT DES INT, PASSER EN Long
	public static int factorial(int n) {
		int res = 1;
		while (n > 1) {
			//System.out.println(res);
			return res = n * factorial(n-1);
			
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer N:");
		int n = scan.nextInt();
		scan.close();
		int res = factorial(n);
		System.out.println(res);
	}
}
