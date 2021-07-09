package oops.interfaces;

public abstract interface Youtuber extends VideoEditor{//interface imforces a class to impliment a method cause by default methods/any atribute formed in interfaces are abstract
	
	abstract void makevideo();//you cant instantiate an interface
	//by default any atribute in interface is public static and final
	//interface cant extend any class but can extend interface(multiple)
	//in abstract interface before java 8 giving body to a method was not allowed but after java 8 by applying default keyword before declaration u can give body to a method and it is  not necessary to override it in its child class
	default void uploadvideo() {
		System.out.println("upload  video ");
	}
	//BUT THIS CAN CAUSE NOW DIAMOND PROBLEM 
	//SO AS SOLUTION IF YOU ARE MAKING SAME METHOD IN TWO ITERFACES AND YOU HAVE IMPLEMENTED BOTH IN A CLASS SO YOU WILL HAVE TO OVERRIDE THAT FUNCTION IN THE CLASS WHICH U R RUNNING
}
