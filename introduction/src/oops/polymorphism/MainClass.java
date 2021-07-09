package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		Dog d= new Dog();
		Animal a= d;
		Pet p=d;
		System.out.println(d.name);//when it comes to variable it is not called overriding it is called hiding as name variable is deefined in both dog and pet classes but while running it shows name defined in dog class 
		System.out.println(p.name);
		d.walk();
		p.walk();//in both 'dog is walking' is printing because p in 8th line is at the end is dogs instance
		//a.walk();//is showing error cause in animal class function walk is not defined
//it is also called run time polymorphism cause it decides which function to call while running and it is basically overriding of method
//it is also called dynamic bonding cause it decides which function to call while running means function calling can be changed while running so dynamic
// also called late binding
//this execution is slow cause linker have to decide which funciton to call while running
		
		
		
		greeting();
		greeting("anushka the great ");
		greeting("anushka the star ",5);//it is called compile time polymorphism
//cause it decides which function to call while compiling and it is basically overloading of method
//it is also called static bonding cause it decides which function to call while compiling means function calling can not be changed while running so static
// also called early binding
//this execution is fast cause linker do not have to decide which funciton to call while running it is pre defined while compiling
		


	}
	public static void greeting() {
		System.out.println("hey, there");
	}
	public static void greeting(String s) {
		System.out.println(s);
	}
	public static void greeting(String s,int a) {
		for(int i=1;i<=a;i++)
		System.out.println(s);
	}

}
