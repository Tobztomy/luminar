import java.util.Scanner;
class DoWhileDemo {
	public static void main(String args[]) {
		int menu;
		int numOne;
		int numTwo;
		char choice;
		
		Scanner sc = new Scanner(System.in);
		
		
		do{
			System.out.println("Menu\n==============");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Divison");
			System.out.println("5. Exit");
			System.out.println("Enter the number one :");
			numOne = sc.nextInt();
			System.out.println("Enter the number Two :");
			numTwo = sc.nextInt();
			System.out.println("Enter your choice as 1,2,3....etc");
			menu = sc.nextInt();
			
			
			switch(menu){
				case 1:
					System.out.println("Result= "+(numOne+numTwo));
					break;
				case 2:
					System.out.println("Result= "+(numOne-numTwo));
					break;
				case 3:
					System.out.println("Result= "+(numOne*numTwo));
					break;
				case 4:
					System.out.println("Result= "+(numOne/numTwo));
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("invalid menu ");
					break;
			}
				System.out.println("Do you want to continue(y/n) ");
				choice=sc.next().charAt(0);	
				if(choice=='y'||choice == 'Y')
					continue;
				else
					break;
		}while(true);

	}
}
