package oops;

import oops.A.B;
import oops.A.C;

public class Static {
	
	public static void main(String[] args) {
		///static keyword indicates that a particular member(nested class,fields,method)belongs to a type rather than a type itself than to an instance of that type
		//static keyword is related to a class , it can be applied to variables , methods, blocks,nested classes
		//uses to help memory management
		
		A objA =new A();
		B objB=objA.new B();// since B class is non static so we need to create and use obj of A
		C objC= new A.C();//here since C class is static so we don't need to use or create obj of A
		
	}
	
}
