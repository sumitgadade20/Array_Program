import java.util.*;
public class RotateArr
{
public static void main(String x[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter A Size");
 int a=sc.nextInt();
 int b[]=new int[a];
 System.out.println("Enter Elements In Arr :");
  for(int i=0;i<a;i++)
   {
    b[i]=sc.nextInt();
   }
   System.out.println("Enter Index :");
  int r=sc.nextInt();
  System.out.println("After Rotation :");
   for(int i=r;i<a;i++)
   {
   System.out.print(" "+b[i]);
   }
    for(int i=0;i<r;i++)
   {
   System.out.print(" "+b[i]);
   }

  }
}