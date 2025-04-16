import java.util.*;
public class Ascendingarr
{
public static void main(String x[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Size");
 int a=sc.nextInt();
 int b[]=new int[a];
 System.out.println("Enter Elements");
  for(int i=0;i<b.length;i++)
 {
  b[i]=sc.nextInt();
 }

 int temp=0;
System.out.println("Ascending Arry");
 for(int i=0;i<b.length;i++)
{ 
 for(int j=i+1;j<b.length;j++)
 {
  if(b[i]>b[j]) 
  {
   temp=b[i];
   b[i]=b[j];
   b[j]=temp;
  }
 }
System.out.print(b[i]+" ");
}

 
 }
}