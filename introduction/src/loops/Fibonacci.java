package loops;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter first term ");
		int a= sc.nextInt();
		System.out.println("enter second term ");
		int b= sc.nextInt();
		System.out.println("enter number of terms ");
		int n= sc.nextInt();
		int i,res=0;
		System.out.println(a+" ");
		System.out.println(b+" ");
		for(i=1;i<=n-2;i++) {
			res=res+a+b;	
			System.out.println(res);
			a=b;
			b=res;
			
		}
		
		
	}

}
