package conditionalstatement;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number ");
		float firstnumber = sc.nextFloat();
		System.out.println("enter operator ");
		sc.nextLine();
		char operator = sc.nextLine().charAt(0);
		System.out.println("enter second number: ");
		float secondnumber =sc.nextFloat();
		float result = 0;
		switch (operator) {
		case '+':
			result = firstnumber+secondnumber;
			break;
		case '-':
			result = firstnumber-secondnumber;
			break;
		case '*':
			result = firstnumber*secondnumber;
			break;
		case '/':
			result = firstnumber/secondnumber;
			break;
		default :
			System.out.println("Invalid operation");
		}
		System.out.println("your result is "+ result);
		
		

	}

}
