import java.util.Scanner;

public class Book {
	// الاسم
	private String name;
	// المؤلف
	private String author;
	// الصنف
	private String category;
	// المكتبة من الكتب الي يحددها المستخدم
	private Book books[];
	
	private static int ArrayCounter = 0;
	
	private static Scanner sc = new Scanner(System.in);
	Book(){};
	Book(String name , String author , String category){
		this.name = name;
		this.author = author;
		this.category = category;		
	}
	
	public void libarySize(int size) {
		books = new Book[size];
	}
	
	public void addBook() {
		Book book = new Book();
		System.out.println("Enter the name Of the Book");
		book.name = sc.nextLine();
		System.out.println("Enter author name");
		book.author = sc.nextLine();
		System.out.println("Enter category");
		book.category = sc.nextLine();
		if (ArrayCounter > books.length) {
			System.out.println("sorry The library is full");
		}
		else {
			books[ArrayCounter] = book;
			ArrayCounter++;
		}
				
	}
	
	public void editBook(String BookName) {
		for (int i=0; i<books.length; i++) {
			if (BookName == books[i].name) {
				System.out.println("-1 to change Name");
				System.out.println("-2 to change author Name");
				System.out.println("-3 to change category");

				int Option = sc.nextInt();
				switch (Option) {
				case 1:
					System.out.println("Enter New Book name");
					books[i].name = sc.next();
					break;
				case 2:
					System.out.println("Enter New author name");
					books[i].author = sc.next();
					break;
				case 3:
					System.out.println("Enter New author name");
					books[i].category = sc.next();
					break;
					default:System.out.println("Wrong Input");
				   }
				}
			else {
				System.out.println("No Matched Name");
			}
			}
		}
	
	
	

	public	void printBooks() {
		for (Book book:books) {
			System.out.println(book);
		}
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", category=" + category + "]";
	}
}
