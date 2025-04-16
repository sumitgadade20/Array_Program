import java.util.*;
public class MergeApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of  2Arr");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.println("Enter First Arr Element: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter First Arr Element: ");
		for(int i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int len=a.length+b.length;
		int merge[]=new int[len];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			merge[i]=a[i];
			merge[i+size]=b[i];
						
		}
		
		for(int i=0;i<merge.length;i++)
		{
			System.out.print(merge[i]+" ");
		}
		
		
	}
}