import java.util.*;
public class Factorial
{
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		int fact, facto, i;
		facto=1;
		System.out.println("Enter the number: ");
		fact=in.nextInt();
		for(i=fact;i>0;i--)
			facto=facto*i;	
		System.out.println("Factorial of entered number is:"+facto);
	}
}