package oops.inheritance;

public class Teacher extends Person {
	

	public Teacher (String name) {
		super(name);
		System.out.println("inside teacher cons");
	}

	public void teach () {
		System.out.println(name+" is teaching ");
	}
	public void eat() {
		super.eat();
		System.out.println("teacher "+name+" is eating ");
	}
	static public void laughing() {
		System.out.println("teacher is laughing");
	}


}
