import java.util.*;
public class ReverseArr
{
public static void main(String x[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Size Of Array");
 int a=sc.nextInt();
 int b[]=new int[a];

 System.out.println("Enter Values");
 for(int i=0;i<b.length;i++)
 {
  b[i]=sc.nextInt();
 }
  System.out.println("The Reverse Values Are");
  for(int i=b.length-1;i>=0;i--)
  {
   System.out.print(b[i]+" "); 
  } 
 }
}
