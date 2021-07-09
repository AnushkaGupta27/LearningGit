package revisionJava;
import java.util.Scanner;

public class FullTriangleNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num of rows ");
		int a= sc.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println();
			for (int j=a;j>i;j-- ) {
				System.out.print("  ");
			}
			int n=2;
			for(int j=i;j>=1;j--) {
				int b=j;
				System.out.print(b++ +" ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print(n++ +" ");
			}
		}

	}

}
