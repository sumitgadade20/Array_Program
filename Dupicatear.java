import java.util.*;
public class Dupicatear
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size Of Arr : ");
int a=sc.nextInt();
int b[]=new int[a];

 System.out.println("Enter Element Arry");
 for(int i=0;i<b.length;i++)
  {
    b[i]=sc.nextInt();
  }
   System.out.println("Duplicate Element Of Arry");
  for(int i=0;i<b.length;i++)
 {

   for(int j=i+1;j<b.length;j++)
  {
    if(b[i]==b[j])
     {
       System.out.print(" "+b[j]);
     }
  }
   
 }
}
}