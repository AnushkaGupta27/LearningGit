package loops;
import java.util.Scanner;

public class BetweenPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter first nd last num ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i=a;
		int j;
		for(i=a;i<=b;i++ ) {
			for(j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j==i) {
				System.out.println(i);
			}
		}
		
	}

}
