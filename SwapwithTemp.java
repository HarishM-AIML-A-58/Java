import java.util.*;
public class SwapwithTemp
{
	public static void main(String[] args)
	{
		int a,b,temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		a=in.nextInt();
		b=in.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping ");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}