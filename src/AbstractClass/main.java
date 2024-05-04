package AbstractClass;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Titre?");
		String title = scanner.nextLine();
		scanner.close();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	scanner.close();
	}

}
