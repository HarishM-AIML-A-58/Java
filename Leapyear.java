import java.util.*;
public class Leapyear
{
	public static void main(String[] args)
	{
		int year;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year: ");
		year=in.nextInt();
		if((year%4==0)&&(year%100!=0))
		{
			System.out.println("Yes, entered year is a leap year.");

		}
		else if((year%100==0)&&(year%400==0))
		{
			System.out.println("Yes, entered year is a leap year.");

		}
		else
		{
			System.out.println("No, entered year is not a leap year.");

		}
	}
}	