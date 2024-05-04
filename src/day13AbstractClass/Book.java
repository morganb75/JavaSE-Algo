package day13AbstractClass;

public abstract class Book {

	String title;
	String author;
	int price;

	public Book() {
		super();
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void display(String title, String author, int price) {
	}
}

