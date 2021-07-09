package conditionalstatement;
import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a: ");
		int a=sc.nextInt();
		System.out.println("enter b: ");
		int b=sc.nextInt();
		System.out.println("enter c: ");
		int c=sc.nextInt();
		
		if(a>b) {
			if(a>c) {
			System.out.println("a is greatest");
			}
			else {
				System.out.println("c is greatest");
			}
		}
		else{
			if(b>c) {
				System.out.println("b is greatest");
			}
			else {
				System.out.println("c is greatest");
			}
		}
			
	}

}
