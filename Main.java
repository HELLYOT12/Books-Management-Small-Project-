import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book b1 = new Book();
		boolean flag = true;
		System.out.println("Please Enter libarySize");
		b1.libarySize(sc.nextInt());
		while (flag){
				System.out.println("-1 add Book");
				System.out.println("-2 edit Book");
				System.out.println("-3 Show Books");
				System.out.println("-4 Exit");
				int Option = sc.nextInt();
				switch(Option) {
				case 1: 
					b1.addBook();
					break;
				case 2:
					System.out.println("Enter name Of the Book that you want to edit");
					b1.editBook(sc.next());
					break;
				case 3:
					b1.printBooks();
					break;
				case 4: flag = false;
				break;
				default:System.out.println("Wrong Input");
				}
				

		}
	}
}
