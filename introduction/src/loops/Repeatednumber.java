package loops;
import java.util.Scanner;

public class Repeatednumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of numbers: ");
		int n= sc.nextInt();
		System.out.println("enter number of repititions: ");
		int a= sc.nextInt();
		for (int j=1;j<=a;j++) {
			System.out.println();
			for (int i=1;i<=n;i++) {
				System.out.print(i+" ");
				
			}
				
				
		}
		sc.close();
	}

}
