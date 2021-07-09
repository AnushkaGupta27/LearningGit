package loops;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter number  ");
		int a= sc.nextInt();
		int i=2;
		for (i=2; i<a; i++) {
			if (a%i==0) {
			System.out.println("number is non prime ");	
				break;
			}			
		}
		if (i==a) {
			System.out.println("number is prime ");
		}
		sc.close();
		
	}

}
