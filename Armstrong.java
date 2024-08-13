import java.util.*;
public class Armstrong
{
	public static void main(String[] args)
	{
		int num,c1,c2,pow=0,dig,arm=0,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=in.nextInt();
		c1=num;
		c2=num;
		while(c1>0)
		{
			pow++;
			c1=c1/10;
		}
		System.out.println(pow);
		while(c2>0)
		{
			dig=c2%10;
			for(i=1;i<=pow;i++)
				System.out.println(i);
				dig=dig*dig;
				System.out.println(dig);
			arm=arm+dig;
			c2=c2/10;
		}
		if(arm==num)
			System.out.println("Entered Number is an Armstrong Number");
		else
			System.out.println("Entered Number is not an Armstrong Number");
	}
}