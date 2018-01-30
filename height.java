package practice3;
import java.util.Scanner;
public class height {

	public static void main(String args[]) 
	{
		int a[]= new int[10];
		int sumOfHeight=0,i;
		for(i=0;i<10;i++)
		{
		System.out.println("Please Enter the Height of student"+(i+1));
		Scanner sc=new Scanner(System.in);
		a[i]=sc.nextInt();
		sumOfHeight+=a[i];
		}
		int avg=sumOfHeight/10;
		System.out.println("Average of Heights is"+avg);
		int above=0, below=0;
		for(i=0;i<10;i++)
		{
			if(a[i]<avg)
			{
				below++;
			}
			else
			{
				above++;
			}
		}
		
		System.out.println("Total students with height above the average are"+above);
		System.out.println("Total students with height below the average are"+below);
	}
}
