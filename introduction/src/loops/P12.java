package loops;
import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("n ");
		int a=sc.nextInt();
        for(int i=1;i<=a;i++) {
        	System.out.println();
        	for(int j=1;j<=i;j++) {
        		if(i==1 || i==a ||j==1 || j==i) {
        			System.out.print("* ");
        		}
        		else {
        			System.out.print("  ");
        		}
        	}
        }
	}

}
