package com.sunbeam;

import java.util.Scanner;

public class Date implements Displayable {
	int day;
	int month;
	int year;

	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 1900;
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void acceptDate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day = ");
		day = sc.nextInt();
		System.out.print("Enter month = ");
		month = sc.nextInt();
		System.out.print("Enter Year = ");
		year = sc.nextInt();
	}

	public void displayDate() {
		System.out.print(year + "/" + month + "/" + day);
	}

	@Override
	public void displayData() {
		System.out.println(day + "/" + month + "/" + year);
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
