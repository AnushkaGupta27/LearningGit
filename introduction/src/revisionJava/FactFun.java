package revisionJava;

import java.util.Scanner;

public class FactFun {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter num of terms ");
		int b=sc.nextInt();
		int res= Sum(b);
		System.out.println("sum is "+res);

	}
	static int Fact (int a) {
		int res=1;
		if(a>1) {
			res=a*Fact(a-1);
		}
		return res;
	}
	static int Sum(int n) {
		int res=0;
		for(int i=1;i<=n;i++) {
			res+=Fact(i);
		}
		return res;
	}

}
