package loops;
import java.util.Scanner;

public class ChekPalindrom {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter number ");
		int a=sc.nextInt();
		int temp=a;
		int sum=0;
		while(temp>0) {
			int lastDigit= temp%10;
			
			sum=sum*10+lastDigit;
			temp/=10;
			
		}
		if(sum==a) {
			System.out.println("yeah!!! it is a palindrome num  ");
		}
		else {
			System.out.println("not palindrome num :(  ");
			
		}
	}

}
