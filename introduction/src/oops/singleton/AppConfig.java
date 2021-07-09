package oops.singleton;
//we use singleton pattern when nneed to create only one object of any class it bcoz creating obj again and again takes alot time 

public class AppConfig {
	private AppConfig(){//by making it private no one can create any object of this class
		System.out.println("instance created");
	}
	static AppConfig obj=null;
	public static AppConfig getInstance() {// by thiis we can creat object once
		if(obj==null) {
			obj=new AppConfig();
		}
		return obj;
	}
	
	
}
