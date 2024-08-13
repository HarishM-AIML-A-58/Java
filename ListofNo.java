import java.util.*;
public class ListofNo
{
	public static void main(String args[])
	{
		int n,i;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		n=in.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Array elements are: ");
		for(int x:arr)
			System.out.println(x);
	}
}