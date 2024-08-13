import java.util.*;
public class Square
{
	public static void main(String args[])
	{
		int num,sq;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a number:");
		num=in.nextInt();
		sq=num*num;
		System.out.println("Square of entered number:");
		System.out.println(sq);
	}
}