package oops.finalKeyword;

public class MainClass extends Student {//a final variable is used when we know that this declaration and i dont have to change its value in future
	//a final variable can only be initialiseed once
	//a final variable cannot be changed 
	//a final method can not be override
	//a final class can not be extended
	//it is necessory to initialise a final variable when it is defining under a class but as local variable it is valid 
//	final int b;it is throwing error cause not initialised
	public void getdescrip() {
		System.out.println("inside main ");
	}
//	public void getdescrip2() {
//		System.out.println("inside student ");
//	}//it is showing error cause this function is final and cant be override

	public static void main(String[] args) {
		String name="anu";//can be changed in future like--
		name="anushka";
		final String name2= "gup";//it cant be changed in future it willl throw error
//		name2="gupta"; it is throwing error
		//it is necessory to initialise a final variable when it is defining under a class but as local variable it is valid 
		final int a;
		//always initialise a variable before using it either final or not otherwise it will throw error
		//it is a convention to declare a final variable in all caps
		final int ROLL_NO=076;
		Student s1= new Student();
		Student s2= new Student();
		s1=s2;//this reference assignment is possible cause s1 and s2 both are non-final variable 
		//but if final
		final Student s3= new Student();
		Student s4= new Student();
//		 it is not possible cause it is final variable 
		s4.name= "anushka ";// but it is possible 
		//over all changing reference is not possible 
		//changing any object inside classssss is possible
		s2.getdescrip();//it will always take from student class
		MainClass m1= new MainClass();
		m1.getdescrip();// it will over ride the function
		//but in case of final function it is not possible to override
		//a final class cannot be extend
		//here 

	}

}
