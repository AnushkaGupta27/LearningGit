package loops;
import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size ");
		int a= sc.nextInt();
		for(int i=a;i>=1;i--) {
			System.out.println();
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
			}
			
		}
		sc.close();
		
	}

}
