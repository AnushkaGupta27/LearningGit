package loops;
import java.util.Scanner;

public class patterns5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size ");
		int a= sc.nextInt();
		for(int i=1; i<=a;i++) {
			System.out.println();
			for(int j=1;j<a-i+1;j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("* ");
			}
		}
		for(int i=1;i<=a-1;i++) {
			System.out.println("");
			for(int j=1 ; j<=i;j++) {
				System.out.print("  ");	
			}
			for(int j=1; j<=a-i;j++) {
				System.out.print("* ");
			}
		}
		sc.close();
	}

}
