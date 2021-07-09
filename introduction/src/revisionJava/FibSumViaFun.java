package revisionJava;

import java.util.Scanner;

public class FibSumViaFun {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter no of terms ");
		int a=sc.nextInt();
		int res= FibSum(a);
		System.out.println("sum of fibonacci series is= "+res);

	}
	static int FibSum(int n) {
		int a=0;
		int b=1;
		int sum=0;
		while(n>0) {
			sum+=a;
			int c = a+b;
			a=b;
			b=c;
			n--;
		}
		return sum;
	}

}

