package loops;
import java.util.Scanner;

public class Pstars {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("entr n ");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			int k=i;
			for(int j=2;j<=i;j++) {
				System.out.print(k+" ");
				k--;
			} 
			int n=1;
			for(int j=1 ;j<=i;j++) {
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
