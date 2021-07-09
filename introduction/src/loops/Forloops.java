package loops;
import java.util.Scanner;

public class Forloops {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("enter table no.: ");
		int b=a.nextInt();
		int i;
		for(i=1;i<=10;i++) {
			//x=x+i;
		
		System.out.println(i+ "x"+ b+ "=" + b*i);
		}
		a.close();
	}

}
