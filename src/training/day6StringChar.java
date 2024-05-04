package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day6StringChar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		System.out.println("entrer t");
		int t = scan.nextInt();

		for (int i = 1; i <= t; i++) {
			System.out.println("entrer String s");
			String s = scan.next();
			list.add(s);
		}

		for (String element : list) {
			char[] myCharArray = element.toCharArray();
			for (int j = 0; j < myCharArray.length; j += 2) {
				System.out.print(myCharArray[j]);
			}
			System.out.print(" ");
			for (int k = 1; k < myCharArray.length; k += 2) {
				System.out.print(myCharArray[k]);
			}
			System.out.println("");
		}
		scan.close();
	}
}
