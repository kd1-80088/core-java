package Com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private int age;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter roll number ");
		this.roll = sc.nextInt();
		System.out.print("Enter Student Name ");
		this.name = sc.next();
		System.out.print("Enter Student Age = ");
		this.age = sc.nextInt();
	}

//	public int hashCode() {
//		int hash = Objects.hash(this.roll);
//		return hash;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null)
//			return false;
//		if (this == obj)
//			return true;
//		if (obj instanceof Student) {
//			Student s = (Student) obj;
//			if (this.roll == s.roll) {
//				return true;
//			}
//		}
//		return false;
//	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}

}
