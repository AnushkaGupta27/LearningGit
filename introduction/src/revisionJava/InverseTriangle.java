package revisionJava;
import java.util.Scanner;

public class InverseTriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter no of rows ");
		int a= sc.nextInt();
		for (int i= 1;i<=a;i++) {
			System.out.println();
			for(int j= 1;j<=a-i;j++) {
				System.out.print("* ");
			}
		}

	}

}
