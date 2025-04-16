import java.util.*;
public class DeletetionElement
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter A Elemnt");
 for(int i=0;i<n;i++)
 {
 a[i]=sc.nextInt();
 }
   System.out.println("Enter A Delete Element :");
   int del=sc.nextInt();
   int b=n; 
   
   for(int i=0;i<b;i++)
    {
     if(a[i]==del)
      { 
        for(int j=i;j<b-1;j++)
        {
          a[j]=a[j+1];
        } 
         b--; 
        System.out.println("I---> "+i);
         i--;
         System.out.println("I= "+i);
                 
      }
       
     }

   System.out.println("After Delation :");
    for(int i=0;i<b;i++)
   {
  System.out.print(a[i]+" ");
   }


}
}