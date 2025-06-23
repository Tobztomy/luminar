import java.util.Scanner;

class IfElseIfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();

        if (age >= 60) {
            System.out.println("You are eligible to take covishield");
        } else if (age >= 40 && age < 60) {
            System.out.println("You are eligible to take covaccine");
        } else if (age >= 18 && age < 40) {
            System.out.println("You are eligible to take Pfizer"); 
        } else if (age >= 12 && age < 18) {
            System.out.println("You are eligible to take Sputnik V");
        } else {
            System.out.println("not allowed to take covid vaccine");
        }

    }
}