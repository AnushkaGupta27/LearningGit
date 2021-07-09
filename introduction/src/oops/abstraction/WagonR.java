package oops.abstraction;

public class WagonR extends Car {
	public void Accelerate() {
		System.out.println("wagonR is accelerating ");
	}

	@Override
	public void breaking() {
		System.out.println("wagonR is breaking ");
		
	}
	

}
