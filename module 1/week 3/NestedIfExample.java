import java.util.Scanner;

class NestedIfExample {
    public static void main(String[] args) {
     	int age;
		char gender;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        age = sc.nextInt();
        if (age >18) {
		System.out.println("Enter the gender M or F");
		gender = sc.next().charAt(0);
			if (gender == 'M' || gender == 'm'){
				System.out.println("CovidShield");
			} else if (gender == 'F' || gender == 'f'){
				System.out.println("Covaccine");
			}
		}else{
        	System.out.println("no vaccine");
		}

    }
}