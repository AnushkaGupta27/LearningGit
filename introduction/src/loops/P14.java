package loops;
import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n ");
		int a= sc.nextInt();
//		for(int i=1;i<=a;i++) {
//			System.out.println();
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");	
//			}
//		}
//		for(int i=1;i<=a-1;i++) {
//			System.out.println();
//			for(int j=1;j<=a-i;j++)
//			System.out.print("* ");
//		}
//		System.out.println();
			for(int i=1;i<=2*a-1;i++) {
				System.out.println();
				if(i<=a) {
					for(int j=1;j<=i;j++) {
					System.out.print("* ");
					}
				}
				else {
					for(int j=a-1;j>=i-a;j--) {
					System.out.print("* ");
					}
				}
			}
	}

}
