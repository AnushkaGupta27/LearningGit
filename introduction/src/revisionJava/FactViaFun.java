package revisionJava;
import java.util.Scanner;
public class FactViaFun {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter num ");
		int n=sc.nextInt();
		int rest=Fact(n);
		System.out.println("factorial value = "+ rest);

	}
	static int Fact(int a) {
		int res=1;
//		if(a>1) {
//			res =a*Fact(a-1);
//		}
		for(int i=a;i>1;i--) {
			res= res*i;
		}
		return res;
	}

}
