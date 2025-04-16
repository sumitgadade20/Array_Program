import java.util.*;
public class Missingarr
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size Array");
int a=sc.nextInt();
int b[]=new int[a];

for(int i=0;i<b.length;i++)
{
b[i]=sc.nextInt();
}
 for(int i=0;i<b.length;i++)
{
  for(int j=i+1;j<b.length;j++)
  {
   if(b[i]>b[j])
    {
      int temp=b[i];
      b[i]=b[j];
      b[j]=temp;      
    }
  }
}

  for(int i=0;i<b.length-1;i++)
  {
     int first=b[i];
     int last=b[i+1];
     for(int j=first+1;j<last;j++)	 
    {
    System.out.print(j+" ");
    }    
  }
 }
}