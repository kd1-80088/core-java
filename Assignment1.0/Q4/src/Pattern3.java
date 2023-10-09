import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = sc.nextInt();

		for (int i = 1; i < num; i++) {
			for (int k = 0; k < num - i; k++) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) 
			{
				System.out.print("*");
			}
			for (int k = 0; k < i - 1; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
