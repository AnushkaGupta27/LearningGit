package revisionJava;
import java.util.Scanner;

public class HollowTriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter n ");
		int a= sc.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println();
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i || i==a) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
		}

	}

}
