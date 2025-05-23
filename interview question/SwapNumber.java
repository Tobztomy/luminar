import java.util.Scanner;

class SwapNumber {
    public static void main(String[] args) {
     	int numOne;
	int numTwo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        numOne = sc.nextInt();
        System.out.println("Enter a Second number");
        numTwo = sc.nextInt();

        System.out.println("Before Swapping");
        System.out.println("First Number "+numOne);
      	System.out.println("Second Number "+numTwo);

	numOne=numOne+numTwo;
	numTwo=numOne-numTwo;
	numOne=numOne-numTwo;

        System.out.println("After Swapping");
        System.out.println("First Number "+numOne);
      	System.out.println("Second Number "+numTwo);

    }
}
