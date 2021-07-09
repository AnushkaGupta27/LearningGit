package array;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int sum=0,b;
		System.out.println("enter num of numbers ");
		int a= sc.nextInt();
		int al[] =new int [a];
		System.out.println("enter array ");
		for(int i=0;i<a;i++) {
			al[i]=sc.nextInt();
		}
		for(int i=0;i<al.length;i++) {
			b=al[i];
			sum+=b;
		}
		System.out.println("the sum of elements of array is "+sum);
		

	}

}
