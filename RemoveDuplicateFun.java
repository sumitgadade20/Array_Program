import java.util.*;
public class RemoveDuplicateFun
{
public static void main(String x[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Size");
 int b=sc.nextInt();
 int a[]=new int[b];

 for(int i=0;i<b;i++)
 {
   a[i]=sc.nextInt();
 }
 for(int i=0;i<a.length;i++)
  {
    for(int j=i+1;i<a.length;j++)
    {
     if(a[i]==a[j])
      {
       System.out.println(" "+a[j]);
      }     
    }
  }

}

}