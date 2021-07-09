package revisionJava;
import java.util.Scanner;

public class FullPyramidStar {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter num of rows ");
		int a= sc.nextInt();
		for (int i=1;i<=a;i++) {
			System.out.println();
			for(int j=a;j>i;j--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print("* ");
			}
		}
		
	}

}
