public class Occuronce
{
public static void main(String x[])
{
 int a[]={1,2,3,4,5,1,8,1};
   int count=1;
   for(int i=0;i<a.length;i++)
   {
    for(int j=0;j<i;j++)
     {
       if(a[i]==a[j])
        {
          count++;
        }  
       
     }
     System.out.println(a[i]+"----->"+count);
   }
}
}