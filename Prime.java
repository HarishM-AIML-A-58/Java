import java.util.*;
public class Prime
{
	public static void main(String args[])
	{
		int n, i,flag=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=in.nextInt();
		if(n<=1)
			System.out.println("Entered number is Not Prime");
		else
		{
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==1)
			System.out.println("Entered number is Not Prime");
		else
			System.out.println("Entered number is Prime");
	}
}
