package loops;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter base ");
		int a= sc.nextInt();
		System.out.println("enter power ");
		int b = sc.nextInt();
		int i,x=1;
		for (i=1; i<=b;i++) {
			x*=a;
		}
		System.out.println(a+ " raise to power "+b+" is "+x);
		sc.close();
			
		
		
   
	}
}
