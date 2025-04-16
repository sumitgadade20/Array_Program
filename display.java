import java.util.*;
public class display
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter NO");
 int a=sc.nextInt();
 int b[]=new int[a];

  for(int i=0;i<b.length;i++)
 {
  b[i]=sc.nextInt();
 }


 System.out.println("Displayd Arry");
 for(int j=0;j<b.length;j++)
 {
  System.out.print(b[j]+" ");
  }
 }
}