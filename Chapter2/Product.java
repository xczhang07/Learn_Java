import java.util.Scanner;

public class Test {
	
	public static void main(String[] args)
	{
		int x;
		int y;
		int z;
		int product = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the first number: ");
		x = input.nextInt();
		
		System.out.println("Input the second number: ");
		y = input.nextInt();
		
		System.out.println("Input the third number: ");
		z = input.nextInt();
		
		product = x * y * z;
		
		System.out.printf("the product of the three integers is: %d\n", product);
		return;
	}
}
