package revisionJava;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two numbers ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int res =gcd(a,b);
		System.out.println("gcd is "+res);
	}
	static int gcd(int n1, int n2) {
		if(n2!=0) {
			return gcd(n2,n1%n2);
		}
		else return n1;
	}
}