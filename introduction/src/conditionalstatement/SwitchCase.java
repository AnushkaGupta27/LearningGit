package conditionalstatement;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("enter day number: ");
		Scanner sc= new Scanner(System.in);
		int day= sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("woohoo! sunday a holiday ");
			break;
		case 2:
			System.out.println("ohh! monday a working ");
			break;
		case 3:
			System.out.println("uff! tuesday repeat yesterday. ");
			break;
		case 4:
			System.out.println("okkkk! wednesday go to work again... ");
			break;
		case 5:
			System.out.println("carrry on! thursday I'm a bit tired ");
			break;
		case 6:
			System.out.println("alas! friday completely tired!!! ");
			break;
		case 7:case 8:
			System.out.println("yayyy! saturday weekend holiday!!!! ");
			break;
		default :
			System.out.println("ooooppss! day index out of range...?");
		}
		

	}

}
