import java.util.*;
public class PaeakApp
{
	public static void main(String x[])
	{
		int a[]={1, 3, 20, 4, 1, 0};		
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i-1]<a[i]  && a[i]>a[i+1])
			{
				System.out.println(a[i]);
			}
		}
	}
		
}