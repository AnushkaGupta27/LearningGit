package conditionalstatement;
import java.util.Scanner;

public class Rating {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("how much will you give this thing out of 5 ");
		int rating = sc.nextInt();		
		switch (rating) {
		case 1:
			System.out.println("bad");
			break;
		case 2:
			System.out.println("could be better");
			break;
		case 3:
			System.out.println("average");
			break;
		case 4:
			System.out.println("good");
			break;
		case 5:case 6:
			System.out.println("perfect");
			break;
		default:
			System.out.println("it is not defined!");

	   }
	}

}
