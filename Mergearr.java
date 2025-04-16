import java.util.*;
public class Mergearr
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First Arr Size");
int a=sc.nextInt();
int b=sc.nextInt();
int c[]=new int[a,b];

System.out.println("Displayed Arry");
for(int i=0;i<c.length;i++)
{
  c[i]=sc.nextInt();
}
 for(int j=0;j<c.length;j++)
 {
  System.out.print(c[j]+" "); 
 }
}
}