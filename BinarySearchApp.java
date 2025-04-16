import java.util.*;
public class BinarySearchApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Elements");
		for(int i=0;i<size;i++)
		{
		  a[i]=sc.nextInt();
		}

		System.out.println("Enter Search No");
		int skey=sc.nextInt();
		
		int l=0;int r=a.length-1;  

		while(l<=r)
		{
			int mid=(l+r)/2; 

			if(a[mid]==skey)
			{
			System.out.println("Elemet Found At Index: "+mid);
			break;
			}
			else if(a[mid]<skey)
			{
			  l=mid+1;
			  System.out.println("L "+l);
			}
			else
			{
			  r=mid-1;
			  System.out.println("R "+r);
			}			
		} 
		
	}
}