import java.util.*;
import java.lang.Math;
public class SquareRoot
{
	public static void main(String args[])
	{
		float num,sqrt;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a number:");
		num=in.nextFloat();
		sqrt=Math.pow(num,0.5);
		System.out.println("Square root of entered number:");
		System.out.println(sqrt);
	}
}