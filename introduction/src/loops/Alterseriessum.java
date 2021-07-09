package loops;
import java.util.Scanner;

public class Alterseriessum {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter number of terms ");
		int n=sc.nextInt();
		float b=0,a=0, result=0;
		for (float i=1;i<=n;i++) {
			if (i%2==0) {
				result-=1/i;
			}
			else {
				result+=1/i;
			}
		}
		System.out.println(result);
		sc.close();
	}

}
