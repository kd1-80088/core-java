import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			for(int k=0;k<num-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
