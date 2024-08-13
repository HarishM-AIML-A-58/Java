import java.util.*;
public class Average
{
	public static void main(String args[])
	{
		int n,avg,mark,tot=0,i;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter number of subjects:");
		n=in.nextInt();
		int[] marr=new int[n];
		System.out.println("Enter mark of each subject");
		for(i=0;i<n;i++)
		{
			System.out.println("Enter mark:");
			marr[i]=in.nextInt();
		}
		for(int x:marr)
			tot=tot+x;
		avg=tot/n;
		System.out.println("Marks Earned:");
		for(int y:marr)
			System.out.println(y);
		System.out.println("Average:");
		System.out.println(avg);
	}
}