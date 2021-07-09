package loops;
import java.util.Scanner;

public class Insertprime {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter first number  ");
		int a = sc.nextInt();
		System.out.println("enter last number  ");
		int b = sc.nextInt();
		int j,i;
		for (i=a;i<b;i++) {
			for(j=2;j<i;j++) {
				if (i%j==0) {
					break;
				}				
			}if (j==i) {
				System.out.println(i);
			}
		}
			

	}

}