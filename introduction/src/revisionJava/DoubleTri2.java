package revisionJava;
import java.util.Scanner;

public class DoubleTri2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n ");
		int a=sc.nextInt();
		for(int i=1;i<=2*a-1;i++) {
			System.out.println();
			if(i<=a) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
			}
			else {
				for(int j=a;j>i-a;j--) {
					System.out.print("* ");
				}
			}
		}
		
	}

}
