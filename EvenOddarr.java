import java.util.*;
public class EvenOddarr
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size");
int a=sc.nextInt();
int b[]=new int[a];

System.out.println("Enter Elements");
for(int i=0;i<b.length;i++)
{
 b[i]=sc.nextInt();
}

    System.out.println("Even No");
  for(int j=0;j<b.length;j++)
   {
    if(b[j]%2==0)
    {
     System.out.print(" "+b[j]); 
    }
   }
System.out.println("Odd NO");
  for(int j=0;j<b.length;j++)
   {
    if(b[j]%2!=0)
    {
     System.out.print(" "+b[j]); 
    }

  }
}
}