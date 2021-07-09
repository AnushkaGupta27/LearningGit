package revisionJava;
import java.util.Scanner;
public class AreaRec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length and breadth resp ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		int res =Area(a,b);
		System.out.println("area= "+res);
	}
	static int Area(int l,int b) {
		return l*b;
	}

}
