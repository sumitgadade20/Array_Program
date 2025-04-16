import java.util.*;
public class Maxarr
{
public static void main(String x[])
{
 Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b[]=new int[a];

  System.out.println("Enter No");  
 for(int i=0;i<b.length;i++)
 {
 b[i]=sc.nextInt();
 }
   int max=b[0];
 System.out.println("The Maxmum No Is");
   for(int j=0;j<b.length;j++)
   {
     if(b[j]>max)
    {
     max=b[j];
    }
   }
 System.out.print(max+" ");
 }
}