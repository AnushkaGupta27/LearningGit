
package loops;

import java.util.Scanner;

public class Armstrongno {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num ");
		int a=sc.nextInt();
		int remain=a;
		int sum=0;
		for(int i=1;remain>0;i++) {
			int digit = remain%10;
			remain= remain/10;
			sum+=digit*digit*digit;
		}
		if(sum==a) {
			System.out.print("yes it is a Armstrong number ");
			}
			else {
				System.out.print("not a Armstrong number");
			}

	}

}
