package day12inheritance;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("first name");
		String firstName = scan.next();
		System.out.println("last name");
		String lastName = scan.next();
		System.out.println("id");
		int id = scan.nextInt();
		System.out.println("nombre de notes");
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			System.out.println("entrer note" + (i + 1));
			testScores[i] = scan.nextInt();
		}
		scan.close();
		Student s = new Student(firstName, lastName, id, testScores);
		// Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate(testScores));

	}

}
