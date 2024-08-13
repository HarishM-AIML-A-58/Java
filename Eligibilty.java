import java.util.*;
public class Eligibilty
{
	public static void main(String[] args)
	{
		int age;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your age: ");
		age=in.nextInt();
		if(age>=18)
			System.out.println("You are Eligible To Vote");
		else
			System.out.println("You are Not Eligible to Vote");
	}
}	