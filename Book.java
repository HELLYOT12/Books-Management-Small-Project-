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
	private int sizeValue;

	private static Scanner sc = new Scanner(System.in);
	Book(){};
	Book(String name , String author , String category){
		this.name = name;
		this.author = author;
		this.category = category;		
	}
	
	public void libarySize(int size) {
		books = new Book[size];
		 sizeValue = size;
		 Initialization();

	}
	
	public void addBook() {
		Initialization();
		Book book = new Book();
		System.out.println("Enter the name Of the Book");
		book.name = sc.next();
		System.out.println("Enter author name");
		book.author = sc.next();
		System.out.println("Enter category");
		book.category = sc.next();
		if (ArrayCounter > books.length) {
			System.out.println("sorry The library is full");
		}
		else {
			books[ArrayCounter] = book;
			ArrayCounter++;
		}
				
	}
	
	public void editBook(String BookName) {
		int i;
		if (BookName.equalsIgnoreCase("null")){
			System.out.println("Wrong Input Dear :)\n");
			return;
		}
		for ( i=0; i<books.length; i++) {
			if (BookName.equalsIgnoreCase(books[i].name)) {
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
			}
				if (i+1 != books.length ) {
			System.out.println("No matched Books"+"\n");
		}
		}
	
	
	

	public	void printBooks() {
		for (Book book:books) {
			System.out.println(book);
		}
	}
	
	private void Initialization () {
	for	(int i=0; i<sizeValue; i++){
		books[i] = new Book("null" , "null" ,"null");
	}
		}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", category=" + category + "]";
	}
}
