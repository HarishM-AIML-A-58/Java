import java.util.*;
public class NPalindrome
{
	public static void main(String[] args)
	{
		int num,copy,rev=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=in.nextInt();
		copy=num;
		while(copy>0)
		{
			rev=(rev*10)+(copy%10);
			copy=copy/10;
		}
		if(rev==num)
			System.out.println("Entered Number is a Palindrome");
		else
			System.out.println("Entered Number is not a Palindrome");
	}
}