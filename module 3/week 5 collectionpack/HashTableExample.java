package collectionpack;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class Book {

	String bookName;
	String authorName;
	float bookPrice;

	public Book(String bookName, String authorName, float bookPrice) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
	}
}

public class HashTableExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bookId;
		String bookName;
		String authorName;
		float bookPrice;

		char choice;

		Map<Integer, Book> map = new Hashtable<Integer, Book>();

		do {
			System.out.print("Enter Book Id");
			bookId = scan.nextInt();
			scan.nextLine();

			System.out.print("Enter Book Name:");
			bookName = scan.nextLine();

			System.out.print("Enter Author Name:");
			authorName = scan.nextLine();

			System.out.print("Enter Book Price");
			bookPrice = scan.nextFloat();

			map.put(bookId, new Book(bookName, authorName, bookPrice));

			System.out.print("Enter another book (y/n)?");
			choice = scan.next().charAt(0);

			if ((choice == 'y') || (choice == 'Y')) {
				continue;
			} else {
				break;
			}

		} while (true);

		for (Map.Entry<Integer, Book> entry : map.entrySet()) {
			int key = entry.getKey();

			Book book = entry.getValue();

			System.out.println(key + " Details:");

			System.out.println(book.bookName + " " + book.authorName + " " + book.bookPrice);
		}

		scan.close();
	}
}
