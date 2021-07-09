package oops.inheritance;

public class Singer extends Person {

	public Singer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void sing() {
		System.out.println(name+" is singing ");
	}
	public void eat() {
		System.out.println("singer "+name+" is eating ");
	}
	static public void laughing() {
		System.out.println("singer is laughing");
	}

}
