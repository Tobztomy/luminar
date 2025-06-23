import java.util.Scanner;

class WeekDays {
    public static void main(String[] args) {
     	int weekDay;
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter the week day");
        weekDay = sc.nextInt();
        switch(weekDay) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default :
				System.out.println("Enter a valid day");
				break;

		}

    }
}