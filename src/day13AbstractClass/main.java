package day13AbstractClass;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Titre?");
		String title = scanner.nextLine();
		System.out.println("Auteur?");
        String author = scanner.nextLine();
        System.out.println("Prix?");
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display(author, author, price);

	}

}
