package oops;
class vehicle {
	int wheel;
	String color;
	int engine;
	vehicle(){//non parameterised
		wheel=4;
		engine=1;
	}
	vehicle(int noOfwheel){//parameter with another name than variable name
		wheel=noOfwheel;//it also points constructor over loading
		engine=1;
	}
	vehicle(int wheel,String color){//parameter with similar name to variable name
		this.wheel=wheel;//this keyword points towards the current object means when an object is created at that time which are global parameters
		this .color=color;
		engine=1;
	}//this is also constructor over loading
} 

public class Constructors {
	Constructors(){
		System.out.println("object is now created");
	}

	public static void main(String[] args) {
		// constructors is similar to method(in looks) that gives a default value(decided by us) to the objects and it is invoked automatically when an object is created
		//its name should be same as the class name
		Constructors obj = new Constructors();//1st line after running
		vehicle car = new vehicle();
		System.out.println(car.wheel+" wheels");//non parameterised // it is by 1st constructor
		vehicle car2= new vehicle(4);// it is by 2nd constructor
		vehicle scooty= new vehicle(2);// it is by 2nd constructor
		System.out.println(car2.wheel+" wheels ");
		System.out.println(scooty.wheel+" wheels");
		vehicle Erikshaw=new vehicle(3,"black");//by 3rd constructor
		System.out.println(Erikshaw.wheel+" wheels and color is = "+Erikshaw.color);
		//still if you are in such a situation where u neither knows wheels nor color in that for getting default value you need to creat a blank constructor otherwise it wil show error cause one constructor changing the the values have already been created so obj cant achieve default value
		// im not creating it now bcoz for that i'll have to remove 1st constructor bcoz it is having same signature as of blank so it will show error so i am giving syntax below
//		vehicle(){
//		}
		//this is for creating like-- vehicle random = new vehicle();
	}

}
