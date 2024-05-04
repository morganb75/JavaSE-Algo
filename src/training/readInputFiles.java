package training;

import java.util.Scanner;

public class readInputFiles {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		
		System.out.println("entrer entier");
		int entier = scan.nextInt();
		System.out.println("entrer decimal");
		double decimal = scan.nextDouble();
		// Consommer la nouvelle ligne restante, necessaire sinon le prgm n'attend pas pour rentrer la String...
        scan.nextLine();
		System.out.println("entrer chaine");
		String phrase = scan.nextLine();
		
		scan.close();
		
		
		//System.out.println(s + phrase);
		System.out.println(i + entier);
		System.out.println(d + decimal);
		System.out.println(s + phrase);

		

	}

}
