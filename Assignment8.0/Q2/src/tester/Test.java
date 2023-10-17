package tester;

import com.sunbeam.*;


class Box<T> {
	private T obj;

	public void setObj(T value) {
		this.obj = value;
	}

	public T getObj() {
		return this.obj;
	}
}

public class Test {
	
	public static void printDisplayableBox(Box<? extends Displayable> b) {
		b.getObj().displayData();
		}
	public static void printAnyBox(Box<?> b)
	{
		System.out.println(b.getObj().toString());
	}

	public static void main(String[] args) {

		Box<Person> b1=new Box<>();
		b1.setObj(new Person("Lord", 55));
		//System.out.println(b1.getObj().toString());
		printDisplayableBox(b1);
		
		printAnyBox(b1);
		System.err.println("----------------------------");
		Box <Date> b2=new Box<>();
		System.out.println();
		b2.setObj(new Date(27,7,2000));
		printDisplayableBox(b2);
		printAnyBox(b2);
	}

}
