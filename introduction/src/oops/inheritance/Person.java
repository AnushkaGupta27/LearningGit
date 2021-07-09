package oops.inheritance;

public class Person {
	public Person (String name) {
		System.out.println("inside person cons");
	}

	protected String name;
	public void walk() {
		System.out.println(name+" is walking ");
	}
	public void eat() {
		System.out.println("person "+name+" is eating ");
	}
	static public void laughing() {
		System.out.println("person is laughing");
	}

	
}
