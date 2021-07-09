package oops.packages.models;

public class Student {
	String name;//this is default modifier can be accessed in only this models package 
	public Student(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}

}
