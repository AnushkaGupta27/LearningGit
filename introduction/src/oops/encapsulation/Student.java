package oops.encapsulation;

public class Student {
	private int age;
	private String name;
		public int getAge() {
			return age;	
		}
		public void setAge(int age) {
			if(age>20) {
				System.out.println("your age is out of our range");
			}
			else
				{this.age=age;}
		}
		//to get getters and setters already generated 
		//go to source 
		//select generate getters and setters
		//encapsulation helps in controlling the modification of our data
		
		
}