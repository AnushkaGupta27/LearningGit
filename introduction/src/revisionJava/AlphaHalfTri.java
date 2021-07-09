package revisionJava;
import java.util.Scanner;

public class AlphaHalfTri {

	public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		System.out.println("enter no of rows ");
		int a=sc.nextInt();
		char b;
		for(int i=1;i<=a;i++) {
			b='a';
			System.out.println();
			for(int j=1;j<=i;j++) {
				System.out.print(b++ +" ");
			}
		}
		
	}

}
