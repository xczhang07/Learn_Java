import java.util.Scanner;


public class Addition {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int sum = 0;
		System.out.println("Enter the 1st number: ");
		num1 = input.nextInt();
		
		System.out.println("Enter the 2nd number: ");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		
		System.out.printf("the sum is: %d\n", sum);
		
	}
}
