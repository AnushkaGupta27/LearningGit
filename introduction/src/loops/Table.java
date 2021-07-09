package loops;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter no. of tables ");
		int n= sc.nextInt();
		int i;
		for (i=2;i<=n;i++) {
			System.out.println();
			for (int j=1; j<=10;j++) {
				System.out.print(i*j+" ");
			}
			
		}
		sc.close();
	}

}
