package loops;
import java.util.Scanner;

public class WhileDigitSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println(" enter num ");
		int a=sc.nextInt();
		int b=a;
		int sum=0;
		int lasdigit;
		while(b>0) {
			lasdigit=b%10;
			b/=10;
			sum+=lasdigit;
		}		
		System.out.println(sum);
	}
	
	//for number of digits in any number use formula {log10(n)+1} where n is number;
	// there is a function name log10() in math
	
}
