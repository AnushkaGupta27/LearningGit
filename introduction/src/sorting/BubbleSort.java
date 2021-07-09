package sorting;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num of terms ");
		int a=sc.nextInt();
		System.out.println("enter array of numbers ");
		int ar1[]=new int [a];
		for(int i=0;i<a;i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.println("done");
		for(int j=0;j<a-1;j++) {
			boolean check=true;
			for(int i=0;i<a-1;i++) {
				if(ar1[i]>ar1[i+1]) {
					int temp=ar1[i];
					ar1[i]=ar1[i+1];
					ar1[i+1]=temp;
					check =false;
				}
			}
			if(check=false) {
				break;
			}
		}
		for(int item:ar1) {
			System.out.print(item+" ");
		}

	}

}
