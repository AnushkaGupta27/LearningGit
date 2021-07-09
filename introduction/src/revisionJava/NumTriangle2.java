package revisionJava;
import java.util.Scanner;

public class NumTriangle2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int b;
		System.out.println("enter n ");
		int a= sc.nextInt();
		for(int i=1;i<=a;i++) {
			b=1;
			System.out.println();
			for(int j=1;j<=i;j++) {
				System.out.print(b++ +" ");
			}
		}
		
	}

}
