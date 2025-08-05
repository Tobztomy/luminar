package collectionpack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idNumber;
		String name;
		char choice;

		Map<Integer, String> mapStudent = new HashMap<>();
		do {
			System.out.print("Enter ID number:");
			idNumber = scan.nextInt();

			System.out.print("Enter Name:");
			name = scan.next();

			mapStudent.put(idNumber, name);

			System.out.print("Enter another student (y/n)?");
			choice = scan.next().charAt(0);

			if ((choice == 'y') || (choice == 'Y')) {
				continue;
			} else {
				break;
			}

		} while (true);
		for (int id : mapStudent.keySet()) {
			// printing key and its related value by get(key)
			System.out.println(id + "\t" + mapStudent.get(id));
		}
	}
}
