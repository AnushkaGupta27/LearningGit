package oops.packages.models;

public class Teacher {

	public static void main(String[] args) {
		//private-the access level of private modifier is only within the current class
		//default-the access level of private modifier is within the current package
		//public- this can be access from anywhere
		//protected-this is only accessible to the children class 
		Student obj= new Student("anu");
		obj.name="anus";//this can be accessed cause student is in same package as of student and string variable is default there
		System.out.println(obj.getName());
	}

}
