package revisionJava;
import java.util.Scanner;

public class PatternK {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter size ");
		int a=sc.nextInt();
		for(int i=1;i<=2*a-1;i++) {
			System.out.println();
			if(i<=a) {
				for(int j= 1;j<=a-i;j++) {
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
			}
			else {
				for(int j=1;j<=i-a;j++) {
					System.out.print("  ");
				}
				for(int j=a;j>=a-i;j+=2) {
					System.out.print("* ");
				}
			}
			
		}

	}

}
