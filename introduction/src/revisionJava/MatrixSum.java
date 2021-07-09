package revisionJava;
import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in) ;
		System.out.println("enter no of rows ");	
		int a=sc.nextInt();
		System.out.println("enter no of columns ");
		int b=sc.nextInt();
		int ar1[][] = new int [a][b];
		int ar2[][] = new int [a][b];
		int ar3[][] = new int [a][b];
		System.out.println("enterr 1st matrix ");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				ar1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter second matrix ");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				ar2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				ar3[i][j]= ar1[i][j]+ar2[i][j];
			}
		}
		System.out.println("sum is");
		for(int i=0;i<a;i++) {
			System.out.println();
			for(int j=0;j<b;j++) {
				System.out.print(ar3[i][j]+" ");
			}
		}
		
	}

}
