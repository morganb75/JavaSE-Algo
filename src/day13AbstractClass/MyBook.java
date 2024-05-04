package day13AbstractClass;

public class MyBook extends Book {

	public MyBook() {
		super();

	}

	public MyBook(String title, String author, int price) {
		super(title, author, price);

	}

	@Override
	public void display(String title, String author, int price) {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}

}
