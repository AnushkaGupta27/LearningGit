package loops;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size ");
		int a= sc.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println("");
			for(int j=a ; j<=i-1;j++) {
				System.out.print("  ");	
			}
			for(int j=1; j<=a-i+1;j++) {
				System.out.print("* ");
			}
		} 
	sc.close();	
	}

}
