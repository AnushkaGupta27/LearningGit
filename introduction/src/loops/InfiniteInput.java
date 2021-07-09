package loops;
import java.util.Scanner;

public class InfiniteInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i>=1;i++) {
			if(i>0) {
				int a=sc.nextInt();
				System.out.println(a);
			}
			else {
				break;
			}
		}

	}

}
