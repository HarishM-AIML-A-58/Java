import java.util.*;
public class Fibonacci
{
	public static void main(String[] args)
	{
		int a,b,c,n,i;
		System.out.println("Enter the limit of Fibonacci series: ");
		Scanner in= new Scanner(System.in);
		n= in.nextInt();
		a=0;
		b=1;
		System.out.println(a);
		System.out.println(b);
		for(i=3;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}