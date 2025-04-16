import java.util.*;
public class RemoveDuplicate
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size Of Arry");
int a=sc.nextInt();
int b[]=new int[a];
System.out.println("Enter Element Of Arr");
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();
}

 for(int i=0;i<b.length;i++)
 {
      for(int j=i+1;j<b.length;j++)
    {
       if(b[i]==b[j])
      {
         b[j]=-1;
      }
   }
 }
System.out.println("After Removed Duplicate Elemnet");
for(int i=0;i<b.length;i++)
{
  if(b[i]!=-1)
  {
  System.out.print(b[i]+" ");
  } 
}

}
}