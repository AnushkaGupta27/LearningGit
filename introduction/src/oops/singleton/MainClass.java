package oops.singleton;

public class MainClass {

	public static void main(String[] args) {
		AppConfig obj2=AppConfig.getInstance();
		AppConfig obj=AppConfig.getInstance();
		AppConfig obj3=AppConfig.getInstance();
//i have called and created obj thrice but if u run it only one time it is going to execute means it is creating only once
	}

}
