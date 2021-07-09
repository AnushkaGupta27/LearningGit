package oops.interfaces;

public class Person implements Student,Youtuber {

	public static void main(String[] args) {
		Person obj=new Person ();
		obj.study();
		obj.makevideo();
		Youtuber obj2 = obj;//its not instantiation it is upcasting
		obj2.makevideo();
		obj2.editvideo();
//		obj2.study();it is throwing error cause obj2 is just a obj of youtuber so it cant implememnt student function
		
	}

	@Override
	public void makevideo() {
		System.out.println("person is making videos ");
		
	}

	@Override
	public void study() {
		System.out.println("person is studying ");
		
	}

	@Override
	public void editvideo() {
		System.out.println("person is editing videos ");
	}
	//you will have to override function to a non abstract class if you don't want to override you shoild make that class abstract
	public void uploadvideo() {
		System.out.println("overrided video uploaded ");
	}
}
