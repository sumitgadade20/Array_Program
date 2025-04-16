public class Rev
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No");
		int no=sc.nextInt();		
		int a[]=new int[no];
		int l=a.length-1;
		for(int i=0;i<a.length/2;i++)
		{
		        int temp=a[i];
			a[i]=a[l];
			a[l]=temp;
			l--; 	
		}
		for(int i=0;i<a.length;i++)
		{
		  System.out.println(a[i]+" ");
		}
	}
}