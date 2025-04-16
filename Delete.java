import java.util.*;
 public class Delete
{
  public static void main(String x[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Array");
 int a=sc.nextInt();
 int b[]=new int[7];


 for(int i=0;i<a;i++)
 {
   b[i]=sc.nextInt();
 }

System.out.println("Enter Delete Element");
 int del=sc.nextInt();

 int count=0;
 for(int i=0;i<a;i++)
  {
    if(b[i]==del)
       {
	for(int j=i;j<a-1;j++)
           {
             b[j]=b[j+1];                     
           }
          count++;
          a++;
           
     }
   }
System.out.println("Display Deleted Element");
   for(int i=0;i<5-count;i++)
	{
	 System.out.print(b[i]+" ");
	}
     }
}