package revisionJava;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number of terms");
		int a= sc.nextInt();
		int b=0;
		int c=1;
		int d;
		System.out.println("0");
		System.out.println("1");
		while (a-2>0) {
			d=b+c;
			System.out.println(d);
			b=c;
			c=d;
			a--;
		}

	}

}
