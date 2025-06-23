import java.util.Scanner;

class Librarian {
	String LibrarianName;
	int LibrarianId;

	Librarian(String name, int id) {
		LibrarianName = name;
		LibrarianId = id;
	}

	public void issueBook(String bookName) {
		System.out.println("Book \"" + bookName + "\"  has been issued by Librarian " + LibrarianName);
	}
}

public class Library {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int id;
		String bookName;

		System.out.print("Enter Librarian Name: ");
		name = sc.nextLine();
		System.out.print("Enter Librarian ID: ");
		id = sc.nextInt();
		sc.nextLine();

		Librarian librarian = new Librarian(name, id);

		System.out.print("Enter Book Name to Issue: ");
		bookName = sc.nextLine();

		librarian.issueBook(bookName);

		sc.close();
	}
}
