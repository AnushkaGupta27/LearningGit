package loops;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size ");
		int a= sc.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println();
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		}
		sc.close();
	}

}
