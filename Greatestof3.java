import java.util.*;
public class Greatestof3
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 3 numbers:");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if((a>b)&&(a>c))
		{
			System.out.println("The GOAT is :"+a);
		}
		else if(b>c)
		{	
			System.out.println("The GOAT is :"+b);
		}
		else
		{
			System.out.println("The GOAT is :"+c);
		}
	}
}