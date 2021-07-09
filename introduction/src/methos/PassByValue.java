package methos;

public class PassByValue {

	public static void main(String[] args) {
		//java is always pass by value
		//primitive datatype
//		int c= 35;
//		int d=67;
//		swap(c,d);
//		System.out.println("c="+c+" d="+d);
		//non primitive
		Dog c= new Dog();
		c.legs=4;
		Dog d= new Dog();
		d.legs=3;
		swap(c,d);
		System.out.println("c="+c.legs+" d="+d.legs);
		Dog dog = new Dog();
		dog.legs=4;
		change(dog);
		System.out.println(dog.legs);
	}
	static void change(Dog d) {
		d.legs=6;
	}
	//primitive datatype
//	static void swap(int a, int b) {
//		int  temp;
//		temp=a ;
//		a=b;
//		b=temp;
//	}
	//non primitive
	static void swap(Dog a,Dog b) {
		Dog temp = a;
		a=b;
		b=temp;
	}
}
//non primitive
class Dog{
	int legs;
}
