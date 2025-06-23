import java.util.Scanner;
class VowelDemo {
	public static void main(String args[]) {
		char alphabet;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character :");
		alphabet = sc.next().charAt(0);
		switch (alphabet){
			case 'A':
			case 'a':
				System.out.println("Vowel");
				break;
			case 'E':
			case 'e':
				System.out.println("Vowel");
				break;
			case 'I':
			case 'i':
				System.out.println("Vowel");
				break;
			case 'O':
			case 'o':
				System.out.println("Vowel");
				break;
			case 'U':
			case 'u':
				System.out.println("Vowel");
				break;
			default :
				System.out.println("Consonant");
				break;
			
		
		}
	}
}
