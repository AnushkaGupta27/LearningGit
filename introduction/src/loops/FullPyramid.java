package loops;

import java.util.Scanner;

public class FullPyramid {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter n ");
		int a=sc.nextInt();
		int c=1,b=1;
		for(int i=1;i<=a;i++) {
			System.out.println();
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(c++ +" ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print(b++ +" ");
			}
			
		}
		

	}

}
