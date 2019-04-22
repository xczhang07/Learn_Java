import java.util.Scanner;

public class Test {
	
	public static void main(String[] args)
	{
		int a = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input number a: ");
		a = input.nextInt();
		
		if(a%2 == 0)
			System.out.print("a is an even number\n");
		else
			System.out.print("a is an odd number\n");;
	}
}
