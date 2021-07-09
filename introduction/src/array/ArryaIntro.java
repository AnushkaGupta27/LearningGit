package array;
import java.util.Scanner;

public class ArryaIntro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//declaration 2 methods
		//int marks[]= new int[];
		//second method for denfining
		//int marks[];
		//marks = new int[];
		//for initialisation ---
		//int marks []={12,56,90,78,56,65,12}
		//to get 
		int sum=0;
		System.out.println("enter number of students ");
		int a=sc.nextInt();
		System.out.println("now enter marks ");
		int marks[]= new int[a];
		for(int i=0;i<a;i++) {
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			sum+=marks[i];
		}
		int s=sum/a;
		System.out.println("the average marks are "+s);
	}

}
