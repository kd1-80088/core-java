import java.util.Scanner;

//Q4. B
public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
	   //1st for loop
		for(int i=1;i<num;i++)
		{
			for(int k=0;k<num-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
       //2nd for loop
		for(int i=0;i<num;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<num-i-1;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<num-i;k++)
				{
					System.out.print("*");
				}
			System.out.println();
		}
	}

}
