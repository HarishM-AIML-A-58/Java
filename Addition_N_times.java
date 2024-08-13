import java.util.*;
public class Addition_N_times
{
	public static void main(String args[])
	{
		int n,num,i,Sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of numbers : ");
		n = in.nextInt();
		for(i=1;i<=n;i++)
		{	
			num = in.nextInt();
			Sum = Sum+num;
		}
		System.out.println("Sum of Entered numbers is : "+Sum);
	}
}