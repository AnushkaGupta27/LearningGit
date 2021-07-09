package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number: ");
		long a=sc.nextInt();
		long x=1;
		for(long i=a;i>0;i--) {
		x=i*x;
		}
		System.out.println(x);
		
	}
	

	

}
