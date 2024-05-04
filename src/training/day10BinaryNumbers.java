package training;

import java.util.Scanner;

public class day10BinaryNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer N : ");
		int n = scan.nextInt();
		scan.close();
		String nBinary = Integer.toBinaryString(n);
		//System.out.println(nBinary);
		String[] parts = nBinary.split("0");
		int maxStringLength = 0;
		for (String element : parts) {
			//System.out.println(element);
			if (element.length() > maxStringLength) {
			maxStringLength = element.length();
			}
		}
		System.out.println(maxStringLength);
	}
}
