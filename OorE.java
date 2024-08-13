import java.util.*;
public class OorE
{
	public static void main(String[] args)
	{
		int num;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=in.nextInt();
		if(num%2==0)
			System.out.println("Entered number is Even");
		else
			System.out.println("Entered number is Odd");
	}
}