package oops;

public class Person{//classes that I used during static=A,Person,static
	//we use static block if we something to execute between execution of main function according to its sequence
	
	static {
		System.out.println("in static block 1");
	}
	static {
		System.out.println("in static block 2");
	}


	String name;
	static String breed;
	//ham class me nesting krte hai kyuki isse ye confirm hota hai ki jo nested class hai vo main class se kafi closely related hai
	// aur nested class ko static bnane ka fayada hota hai ki use ek alg class ki tarah access kr skte hai baher se
	public static void main(String[] args) {
		System.out.println("inside main");
	}
	static {
		System.out.println("in static block 3");
	}

	
}

