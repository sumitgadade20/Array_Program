import java.util.*;
public class Missingelement
 {
  public static void main(String x[]) 
 {
   Scanner sc=new Scanner(System.in);

    System.out.println("Enter Size");
    int b=sc.nextInt();
    int a[]=new int[b];

 
    System.out.println("Display Array");
      for(int i=0;i<b;i++)
  {
      a[i]=sc.nextInt();   
  }

   for(int i=0;i<a.length;i++)
   {
     for(int j=i+1;j<a.length;j++)
    {
       if(a[i]>a[j])
         {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
         }
     }

	for(int j=a[i];j<(a[i+1]-1);)
	{
	System.out.println(++j+" ");
	}
}
    
   
  }
}

    