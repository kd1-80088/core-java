import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
		int choice;
		int total=0;
		Scanner sc=new Scanner(System.in);
		
		do
		{

			System.out.println("0.Exit");
			System.out.println("1.Loni Dosa = 35");
			System.out.println("2.Masala Dosa = 40");
			System.out.println("3.Spoung Dosa = 45");
			System.out.println("4.Cut Dosa = 50");
			System.out.println("5.Maisur Dosa = 55");
			System.out.println("6.Plain Dosa = 30");
			System.out.println("7.Special Dosa = 60");
			System.out.println("8.Butter Dosa = 50");
			System.out.println("9.Idli = 30");
			System.out.println("10.Vada = 35");
			System.out.println("11. Genarate Bill");
			choice=sc.nextInt();
		switch(choice)
			{
			case 1:
			System.out.println("1.Loni Dosa = 35");
			total=total+35;
			break;
			case 2:
				System.out.println("2.Masala Dosa = 40");
				total=total+40;
				break;
			case 3:
				System.out.println("3.Spoung Dosa = 45");
				total=total+45;
				break;
			case 4:
				System.out.println("4.Cut Dosa = 50");
				total=total+50;
				break;
			case 5:
				System.out.println("5.Maisur Dosa = 55");
				total=total+55;
				break;
			case 6:
				System.out.println("6.Plain Dosa = 30");
				total=total+30;
				break;
			case 7:
				System.out.println("7.Special Dosa = 60");
				total=total+60;
				break;
			case 8:
				System.out.println("8.Butter Dosa = 50");
				total=total+50;
				break;
			case 9:
				System.out.println("9.Idli = 30");
				total=total+30;
				break;
			case 10:
				System.out.println("10.Vada = 35");
				total=total+35;
				break;
			case 11:
				System.out.println("Your Total Bill Is= "+total);
				break;
			default:
				//System.out.println("** Please Enter From Above Menue **");
			}
		}while(choice!=0);
		System.out.println("*** Thanks For Comming Please Visit Again ***");

	}

}

/*
 * 3. Display food menu to user. User will select items from menu along with the
 * quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed
 * prices to food items(hard code the prices) When user enters 'Generate Bill'
 * option , display total bill & exit.
 */
