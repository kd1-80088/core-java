import java.util.Scanner;

public class AcceptDouble {

	public static void main(String[] args) {
		Double num1;
		Double num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a 1 Number :- ");
		num1=scan.nextDouble();
		System.out.println("Enter the Second Number :- ");
		num2=scan.nextDouble();

		if(num1==Math.floor(num1)||num2==Math.floor(num2))
		{
		if(num1==Math.floor(num1))
			System.out.println((num1)+" It is a Int,Please Enter a Double ");
		if(num2==Math.floor(num2));
		System.out.println(num2+" It is a Int,Please Enter a Double ");
		}
		else
			System.out.println(("Average of "+num1+" And "+num2+" is "+((num1+num2)/2)));
		scan.close();
		}

}
/*2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average.*/
