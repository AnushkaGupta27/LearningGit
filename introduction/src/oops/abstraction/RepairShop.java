package oops.abstraction;

public class RepairShop {//abstraction is used when we have to hide certain data for reducing complexity of code
//	public static void RepairCar(WagonR car) {
//		System.out.println("car is repaired ");
//	}
	public static void RepairCar(Car car) {
		System.out.println("car is repaired ");
	}
//	public static void RepairCar(Audi car) {
//		System.out.println("car is repaired ");
//	}

	public static void main(String[] args) {
		Audi a= new Audi();
		WagonR w= new WagonR();
		RepairCar(a);
		RepairCar(w);
	}

}
