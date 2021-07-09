package array;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		//I'll do it  later... abhi aa ni rha hai
		int sum=0;
		System.out.println("enter num of rows of first matrix ");
		int a= sc.nextInt();
		System.out.println("enter no of columns of first matrix ");
		int b=sc.nextInt();
		int ar1[][]=new int [a][a];
		int ar2[][]=new int [a][a];
		int ar3[][]=new int [a][a];
			System.out.println("enter 1st matrix");
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					ar1[i][j]=sc.nextInt();
				}
			}
			System.out.println("enter second matrix");
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					ar2[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					ar3[i][j]=0;
					for(int k=0;k<b;k++) {
						ar3[i][j]+=ar1[i][k]*ar2[k][j];
					}
				}
			}
			System.out.println("result is ");
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					System.out.print(ar3[i][j]+" ");
				}
				System.out.println();
			}
		

	}

}
                                                                              