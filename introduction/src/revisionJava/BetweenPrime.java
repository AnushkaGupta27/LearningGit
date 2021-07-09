package revisionJava;
import java.util.Scanner;

public class BetweenPrime {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter first and last num ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int i,j=2;
		for(i=a;i<=b;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
			}
		}
		if(i==j) {
			System.out.println(i);
		}

	}

}
