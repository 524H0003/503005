import java.util.Scanner;

public class CalculateDeposit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double money, interestRate = 0;
		int months = 0;
		System.out.print("Enter deposit amount: ");
		money = sc.nextDouble();
		for (int input; months == 0;) {
			System.out.print("Enter number of months wants to deposit: ");
			input = sc.nextInt();

			if (input > 0 && input < 13)
				months = input;
			else
				System.out.println("Please enter valid input");
		}

		if (months <= 3)				{ interestRate = 1; }
		else if (months <= 6)		{ interestRate = 1.5; }
		else if (months < 12)		{ interestRate = 3; }
		else if (months == 12)	{ interestRate = 5; }

		System.out.println("The amount will be recieved: " + (money + money * interestRate / 100));
	}
}
