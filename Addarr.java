import java.util.*;
public class Addarr
{
public static void main(String x[])
{
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b[]=new int[a];
 System.out.println("Enter No");
 for(int i=0;i<b.length;i++)
 {
 b[i]=sc.nextInt(); 
 }
System.out.println("The Sum Of");
int sum=0;
for(int j=0;j<b.length;j++)
 {
  sum=sum+b[j];
 }
System.out.println(sum+" ");
}
}