import java.util.Scanner;

class LargestNumber {
    public static void main(String[] args) {
     	int numOne;
      	int numTwo;
      	int numThree;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  first number");
        numOne = sc.nextInt();
        System.out.println("Enter a  second number");
        numTwo = sc.nextInt();
        System.out.println("Enter a  third number");
        numThree = sc.nextInt();

        if (numOne>numTwo && numOne>numThree) {
            System.out.println(numOne+" is the largest");
        } else if(numTwo>numThree){
            System.out.println(numTwo+" is the largest");
        } else{
            System.out.println(numThree+" is the largest");
        }


    }
}