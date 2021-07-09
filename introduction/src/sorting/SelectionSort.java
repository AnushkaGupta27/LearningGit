package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter length of array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();   	
		}
		for(int i=0;i<n-1;i++) {
			int mid=i;
			for(int j=i;j<=n-1;j++) {
				if(a[j]<a[mid]) {
					mid=j;
				}
			}
			int temp=a[i];
			a[i]=a[mid];
			a[mid]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");  	
		}
		
	}

}
