import java.util.*;
public class Sercharr
{
public static void main(String x[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Size Of Array");
  int a=sc.nextInt();
  int b[]=new int[a];
  System.out.println("Enter Elements Arry");
 for(int i=0;i<b.length;i++)
 {
  b[i]=sc.nextInt();
 }
 
 System.out.println("Enter Search Key");
 int skey=sc.nextInt();
  //boolean flag=false; serch & occurnce
   int j=-1;
 for(int i=0;i<b.length;i++)
 {
  if(skey==b[i])
   {
    j=i;
    break;   
   }
 }
   if(j!=-1)
   {
     System.out.println("Fount Element At Index  "+j);
   }
  else
  {
   System.out.println("Not Found");
  }
}
}