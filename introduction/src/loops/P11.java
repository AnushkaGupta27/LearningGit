package loops;
import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println();
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		}
		for(int i=a;i>=1;i--) {
			System.out.println();
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		}
		sc.close();
	}

}

