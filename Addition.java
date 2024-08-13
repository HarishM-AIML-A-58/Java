import java.util.Scanner;
public class Addition
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of numbers : ");
		a = in.nextInt();
		b = in.nextInt();
		c = a+b;
		System.out.println("Sum of Entered numbers is : "+c);
	}
}