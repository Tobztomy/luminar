import java.util.Scanner;
class OperatorDemo {
	public static void main(String args[]) {
		int numOne;
		int numTwo;
		char operator;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number one :");
		numOne = sc.nextInt();
		System.out.print("Enter the Number Two :");
		numTwo = sc.nextInt();
		System.out.print("Enter the operator : ");
        operator = sc.next().charAt(0);
		
		switch (operator){
			case '+':
				System.out.println("Addition : result value "+(numOne+numTwo));
				break;
			case '-':
				System.out.println("Substraction : result value "+(numOne-numTwo));
				break;
			case '*':
				System.out.println("Multiplication : result value "+(numOne*numTwo));
				break;
			case '/':
				System.out.println("Divison : result value "+(numOne/numTwo));
				break;
			default :
				System.out.println("enter valid operator");
				break;
			
		
		}
	}
}
