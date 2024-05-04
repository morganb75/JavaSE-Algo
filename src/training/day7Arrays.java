package training;

import java.util.Scanner;

public class day7Arrays {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("entrer t");
		int t = scan.nextInt();
		int[] intArray = new int[t];
		System.out.println(intArray.length);

		for (int i = 1; i <= t; i++) {
			System.out.println("entrer entier n°" + i);
			intArray[i - 1] = scan.nextInt();

		}
		scan.close();

		for (int j = intArray.length - 1; j >= 0; j--) {
			System.out.print(intArray[j]);
		}

	}
}
