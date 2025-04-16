import java.util.*;
public class Minarr
{
public static void main(String x[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Size Of Arry");
   int a=sc.nextInt();
   int b[]=new int[a];

 System.out.println("Enter Array");
 for(int i=0;i<b.length;i++)
  {
  b[i]=sc.nextInt();
  } 

System.out.println("Min No Arry");
int min=b[0];
 for(int j=0;j<b.length;j++)
  {
    if(b[j] < min)
    {
      min=b[j];
    }
   
  }
      System.out.print(min+" ");
 }
}