package revisionJava;
import java.util.Scanner;	
public class SumOfOddNo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a positive number ");
		int a= sc.nextInt();
//		int temp=a;
//		int sum=0;
//		while(temp>0) {
//			int rem=temp%10;
//			if(rem%2!=0) {
//				sum+=rem;
//			}
//			temp/=10;
//		}
//		System.out.println("sum= "+sum);
		int res=sumOddDig(a);
		System.out.println("sum="+res);
		sc.close();
	}
	static int sumOddDig(int n) {
		int temp=n;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			if(rem%2!=0) {
				sum+=rem;
			}
			temp/=10;
		}
		return sum;
	}
}

