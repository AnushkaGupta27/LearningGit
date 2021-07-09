package oops.finalKeyword;

public class Student  {// if I try to write extends ToFinal here it will show error cause ToFinal is a final class
	public void getdescrip() {
		System.out.println("inside student ");
	}
	public final void getdescrip2() {
		System.out.println("inside main ");
	}
	String name;
	//if we have made a blank final variable so I can initialise in 3 ways
	//1- inside a instance initialier block
	//2- if it a static variable then can be initialised in a static initialiser block
	//3- inside a constructor of that class
	final int num;
	final static int num2;
//	{
//		num=7;//i have to comment it cause a final variable can be initialised only once
//	}
	public Student () {
		num=7;
	}
	static {
		num2=8;
	}
	
	

}
