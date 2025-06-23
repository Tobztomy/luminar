import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {
     	int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();

        if (num%5==0) {
            System.out.println(num+" is divisble by five");
        } else{
            System.out.println(num+" is not divisble by five");
        }


    }
}