public class UpadationElement
{
public static void main(String x[])
{
int a[]={10,20,30,40,50,0};
int item=100,pos=2;
   System.out.println("Before Updation");
  for(int i=0;i<5;i++)
  {
    System.out.print(" "+a[i]);
  }
System.out.println();
  
 System.out.println("After Updation");
 for(int i=5;i>pos;i--)
  {
      a[i]=a[i-1];
       
  }
   a[pos]=item;
   for(int i=0;i<a.length;i++)
  {
    System.out.print(" "+a[i]);
  }

}
}

