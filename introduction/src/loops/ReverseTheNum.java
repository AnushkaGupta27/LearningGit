package loops;
import java.util.Scanner;

public class ReverseTheNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num ");
		int a=sc.nextInt();
		int remain=a;
		for(int i=1;remain>0;i++) {
			int tobeprint = remain%10;
			remain= remain/10;
			System.out.print(tobeprint);
		}

	}

}
