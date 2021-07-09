package revisionJava;
import java.util.Scanner;

public class HollowRectangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("ente size ");
		int a= sc.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println();
			for (int j=1 ;j<=a;j++) {
				if(i==1 || j==1 || j==a || i==a) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
		}

	}

}
