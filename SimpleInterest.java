import java.util.Scanner;
public class SimpleInterest
{
	public static void main(String args[])
	{
		float P,R,T,SI;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter Principal Amount:");
		P=in.nextFloat();
		System.out.println("Enter Rate of Interest in percentage:");
		R=in.nextFloat();
		System.out.println("Enter Time Period in years:");
		T=in.nextFloat();
		SI=P*(R/100)*T;
		System.out.println("Interest earned:");
		System.out.println(SI);
	}
}