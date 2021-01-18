import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int checkType = 0;
		
		// scanner to get the user input for the switch statement
		System.out.println(" 1 for Normal Pay \n 2 for Special Pay \n 3 for Overtime Pay ");
		Scanner paycheck = new Scanner(System.in);
		checkType = paycheck.nextInt();
		
		switch (checkType) {
		
		// switch statement for regular, overtime, and special pay
		case 1: checkType = 1;
		{
			Person regularInput = new Person("Frank", "Smith", 12.0, 25.0);
			System.out.println(regularInput);
			break;
		}
		case 2: checkType = 2;
		{
			Overtime overtimeInput = new Overtime("Frank", "Smith", 12.0, 25.0);
			System.out.println(overtimeInput);
			break;
		}
		case 3: checkType = 3;
		{
			Special specialInput = new Special("Frank", "Smith", 12.0, 25.0);
			System.out.println(specialInput);
			break;
		}

		default:
			System.out.println("Error input invalid please try again");
		}

		

	}

}
