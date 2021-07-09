package array;
import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//declaration int array[] []= new int [row=5] [column=6];
		//here indexing starts with 0;
		int i,j=0;
		System.out.println("enter number of rows ");
		int row =sc.nextInt();
		System.out.println("enter number of columns ");
		int col =sc.nextInt();
//		int matrix[] []= {{2,34,4},{738,544,5},{1,5,9}};
		System.out.println("enter first matrix  ");
		int matrix1[] []=new int [row] [col];
		int matrix2[] []=new int [row] [col];
		int matrix3[] []=new int [row] [col];
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				matrix1[i] [j]=sc.nextInt();
			}
		}
		System.out.println("enter second matrix ");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				matrix2[i] [j]=sc.nextInt();
			}
		}
		System.out.println("the sum of matrix is ");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				matrix3[i][j]= matrix1[i][j]+matrix2[i][j];
			}
		}
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
