import java.util.*;
public class Reverse
{
public static void main(String x[])
{
  Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size Arr");
     int a=sc.nextInt();

     int b[]=new int[a];
     int temp=0;
  System.out.println("Display Array");                       //b[i=0]=b[0]=1
  for(int i=0;i<a;i++)
  {
	b[i]=sc.nextInt(); // 1 2 3 4 5
  }

   int mid=a/2;  // 5/2=
   int end=a-1;//   5-1=4
   
     for(int i=0;i<mid;i++) // i=0<1 

   {
    	    temp=b[i];//temp=1,2,3,4
	    b[i]=b[end];//b[i]=5,4,3,2
            b[end]=temp;//b[end]=1,2.3,4 
             end--;
	System.out.print(b[i]+" ");//5 4  
   }
   
    System.out.println("Reversed Arry");
      for(int i=0;i<b.length;i++)

      {
 	System.out.print(b[i]);
      }

 }

} 