package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class solution {

	public static String triChaine(String chaine) {
		chaine = chaine.toLowerCase();
		char[] charTab = chaine.toCharArray();
		Arrays.sort(charTab);
		String chaineTriee = new String(charTab);
		return chaineTriee;
	}
	
	public static boolean isAnagram(String chaine1, String chaine2) {
		chaine1 = triChaine(chaine1);
		chaine2 = triChaine(chaine2);
				
		return chaine1.equals(chaine2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String A = sc.next();
//		String B = sc.next();
		String A = "anagramm";
		String B = "marganaa";
		sc.close();
		/* Enter your code here. Print output to STDOUT. */
		if (isAnagram(A,B)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
	}
}
