package com.sunbeam;

public class TestEmp {

	public static void main(String[] args) {
		Emp[] arr = new Emp[3];

		arr[0] = new Manager(5000, 500);
		arr[1] = new Labor(300, 400);
		arr[2] = new Clerk(10000);

		double total = Emp.calcTotalIncome(arr);
		System.out.println("Total Income = " + total);
	}

}
