import java.util.*;
public class InsertionElemnt
{
public static void main(String x[])
{
 Scanner sc=new Scanner(System.in);
System.out.println("Enter Size Of Arr :");
 int a=sc.nextInt();
 int b[]=new int[15];
System.out.println("Enter Arr Elements :");
  for(int i=0;i<a;i++)
  {
    b[i]=sc.nextInt();
  }
 System.out.println("Before Inseration :");
   for(int i=0;i<a;i++)
   {
    System.out.print(b[i]+" ");
   }
   System.out.println();

  System.out.println("Enter The Elemnt :");
  int insert=sc.nextInt();
  System.out.println("Enter The Position To Add Element :");
  int p=sc.nextInt();
   a++;


 
 for(int i=a-1;i>=p;i--)
  {
   b[i]=b[i-1];
  }

  b[p-1]=insert;

   for(int i=0;i<a;i++)
    {
     System.out.print(b[i]+" ");
   }
 System.out.println();
}
}


 


