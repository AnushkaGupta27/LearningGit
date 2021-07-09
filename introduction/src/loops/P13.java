package loops;
import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("n=");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			int n=1;
			for(int j=1;j<=i;j++) {
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
