package assignment;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number ");
		int num=sc.nextInt();
		System.out.println("In Binary = "+ Integer.toBinaryString(num));
		System.out.println("In Octal = "+Integer.toOctalString(num));
		System.out.println("In Hex = "+Integer.toHexString(num));
		}
}

/*Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())*/
