package loops;
import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		char b='a';
		System.out.println("enter number of rows ");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println();
			char temp=b;
			for(int j=1;j<=i;j++) {
				System.out.print(temp++ +" ");
			}
		}

	}
	

}
