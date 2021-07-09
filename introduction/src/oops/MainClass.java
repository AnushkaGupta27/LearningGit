package oops;

class Cat{
	int legs,eyes;
	String color,breed;
	boolean furr;
	void walk() {
		System.out.println("cat is walking ");
	}
	void eat(){
		System.out.println("cat is eating ");
	}
	void description() {
		System.out.println("my cat has "+ legs+ " legs "+"and "+ eyes+" eyes ");
	}
}
class Dog{
	String name,breed;
	void jump() {
		System.out.println("my dog jumps ");
	}
	void description() {
		System.out.println("my dog name is "+name+" breed is "+breed);
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		Cat cat1= new Cat();
		Cat cat2= new Cat();
		cat1.eyes=3;
		cat1.legs=4;
		cat2.legs=3;
		cat2.eyes=2;
		cat1.description();
		cat2.description();
		cat2.walk();
		Dog dog1=new Dog();
		Dog dog2= new Dog();
		dog1.breed="husky";
		dog2.breed="poodle";
		dog1.name="rambo";
		dog2.name="milo";
		dog1.description();
		dog2.description();
		dog1.jump();
	}

}
