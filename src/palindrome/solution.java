package palindrome;

import java.util.Scanner;

public class solution {

	public static boolean isPalindrome(String chaine) {
		String chaineInverse = new StringBuilder(chaine).reverse().toString();
		return chaine.equals(chaineInverse);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		/* Enter your code here. Print output to STDOUT. */
		if (isPalindrome(A)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
