package loops;
import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no. of rows ");
		int a=sc.nextInt();
		System.out.println("enter no. of columns ");
		int b= sc.nextInt();
		for(int i=1; i<=a;i++) {
			System.out.println();
			for(int j=1;j<=b;j++) {
				if(i==1 || i==a|| j==1|| j==b) {
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			
		}
		
		sc.close();
	}

}
