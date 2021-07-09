package loops;
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=1;
		System.out.println("enter number of rows  ");
		int b=sc.nextInt();
		for(int i=1;i<=b;i++) {
			System.out.println();
			for(int j=1;j<=b-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(a++ +"   ");
			}
		}
		sc.close();
	}

}
