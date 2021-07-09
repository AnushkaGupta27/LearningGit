package loops;
import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter rows number ");
		int a=sc.nextInt();
		int n=1;
		for (int i=1;i<=a;i++) {
			System.out.println();
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(n++ +"   ");
			}
			
		}
	}

}
