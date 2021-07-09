package loops;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter no. of rows ");
		int a= sc.nextInt();
		System.out.println("enter number of columns ");
		int b = sc.nextInt();
		for (int i=1;i<=a;i++) {
			System.out.println();
			for(int j=1;j<=b;j++)
				System.out.print("* ");
			
		}
		sc.close();
	}

}
