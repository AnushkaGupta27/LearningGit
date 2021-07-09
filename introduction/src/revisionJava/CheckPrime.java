package revisionJava;
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the num ");
		int i;
		int a=sc.nextInt();
		for(i=2;i<a;i++) {
			if(a%i==0) {
				System.out.println("non prime");
				break;
			}
		}
		if(i==a) {
			System.out.println("prime");
		}
		
	}

}
