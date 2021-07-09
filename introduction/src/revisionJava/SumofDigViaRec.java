package revisionJava;

import java.util.Scanner;

public class SumofDigViaRec {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the num ");
		int b=  sc.nextInt();
		int res=Sum(b);
		System.out.println("sum= "+res);
		sc.close();
	}
	static int Sum(int a) {
		int sum=0;
		if(a>0) {
			int rem=a%10;
			sum=rem+Sum(a/=10);
		}
		
		return sum;
	}
}
