package revisionJava;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the nm ");
		int a=sc.nextInt();
		int temp=a;
		int sum=0;
		while(temp>0) {
			int remain=temp%10;
			sum+=remain;
			temp/=10;
		}
		System.out.println(sum);
	}

}
