import java.util.Scanner;
public class PracticeQ23{
	public static void main(String x[]){

	Scanner sc=new Scanner(System.in);
		
	System.out.println("enter rows");
	int r=sc.nextInt();	
	System.out.println("enter coloumns");
	int c=sc.nextInt();
	
	int[][]a=new int[r][c];

	System.out.println("enter row wise values");
	for(int i=0;i<a.length;i++){

		for(int j=0;j<a[i].length;j++){

		a[i][j]=sc.nextInt();

			}
		}

	
	int max[]=new int[r];

	for(int i=0;i<a.length;i++){
		
		int sum=0;
		for(int j=0;j<a[i].length;j++){
			
			if(a[i][j]==1){sum++;}

			}
		max[i]=sum;
		}
	
	for(int i=0;i<max.length;i++){System.out.printf("%d th row have this number of parking: %d \n",i,max[i]);
    }

	
}

}