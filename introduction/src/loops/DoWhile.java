package loops;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("enter a number to get return same number  ");
		do {
			n=sc.nextInt();
			System.out.println(n);
		}
		while(n>0);
	}

}
