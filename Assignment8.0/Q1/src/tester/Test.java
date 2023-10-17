package tester;

import com.sunbeam.*;

class Box<T extends Employee> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public void totalSalary() {
		obj.calculateSalary();
	}

	public void accept() {
		obj.acceptData();
	}

	@Override
	public String toString() {
		return super.toString();
	}
}

public class Test {

	public static void main(String[] args) {

//		Box<CommissionEmployee> b2 = new Box<>();
//		b2.setObj(new CommissionEmployee());
//		b2.accept();
//		System.out.println(b2.getObj().toString());
		
		BaseSalariedCommissionEmployee s=new BaseSalariedCommissionEmployee();
		
		Box<Employee> b3=new Box<>();
		b3.setObj(s);
		b3.accept();
		b3.totalSalary();
		System.out.println(b3.getObj().toString());

//		b1.setObj(new HourlyEmployee("Rohit", "Sharma", 45, 264.1, 22.3f));
//		System.out.println(b1.getObj());
//
//		b1.setObj(new BaseSalariedCommissionEmployee("Virat", "Kohli", 18, 1500, 20, 10000));
//		System.out.println(b1.getObj());
//
//		b1.setObj(new CommissionEmployee("john", "Moses", 77, 1000, 25));
//		System.out.println(b1.getObj());


	}
}
