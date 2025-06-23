import java.util.Scanner;

class AlphabetCheck {
	public static void main(String args[]) {
		char ch;
		Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter a character: ");
		ch = scanner.next().charAt(0);
	
        	if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
           		System.out.println(ch + " is an alphabet");
        	} else {
            		System.out.println(ch + " is not an alphabet");
        	}

    }
}
