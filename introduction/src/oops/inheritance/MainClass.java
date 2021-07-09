package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		//in java one class can have more than 1 children classes but a child cannot have 2 parent classes
		//method overriding-when we define same method in both children and parent class then if the function is called the method that is working is children class method means children classes method overrides parent class method it is called method overriding
		
		Teacher t= new Teacher("anushka");
		t.name="anushka";
		t.eat();
		t.teach();
		t.walk();
		Singer s= new Singer ("TheGretAnushka");
		s.name="TheGretAnushka";
		s.eat();
		s.walk();
		s.sing();
		Person p=t;//Upcasting or  implicit casting (apne aap hoti h no need for manual casting)
		//upcasting is fine cause teacher is also an person
		Teacher t1=(Teacher)p;//explicit or down casting
		System.out.println(p instanceof Teacher);//true cause int upscating I have did it
		System.out.println(t instanceof Teacher);//obiously yes
		System.out.println(p instanceof Singer);//no cause havnt did it anywhere
		System.out.println(t1 instanceof Person);//hell yeah cuse i have did it 
		System.out.println(p instanceof Person);//fuckin yeah
		System.out.println(s instanceof Person);//yeah cause ultimateky to hai hi ye
		System.out.println(t1 instanceof Teacher);//obious
		//SUPER KEYWORD-it is used when we need to refer to its immediate super(parent) class\
		//synatax--super.x();we can call parent by this
		
	}

}
