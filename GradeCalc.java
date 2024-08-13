import java.util.*;
public class GradeCalc
{
	public static void main(String[] args)
	{
		int percent;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your percentage: ");
		percent=in.nextInt();
		if(percent>=90 && percent<=100)
			System.out.println("Your Grade:O");
		else if(percent>=80 && percent<=90)
			System.out.println("Your Grade:A");
		else if(percent>=70 && percent<=80)
			System.out.println("Your Grade:B");
		else if(percent>=60 && percent<=70)
			System.out.println("Your Grade:C");
		else if(percent>=50 && percent<=60)
			System.out.println("Your Grade:D");
		else if(percent>=40 && percent<=50)
			System.out.println("Your Grade:E");
		else
			System.out.println("Your Grade:F");
	}

}