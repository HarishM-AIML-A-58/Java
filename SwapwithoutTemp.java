import java.util.*;
public class SwapwithoutTemp
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		a=in.nextInt();
		b=in.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping ");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}