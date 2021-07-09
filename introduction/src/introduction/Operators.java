package introduction;

import java.time.LocalDate;
import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
//		System.out.println("enter num");
//		int i=4;
//		int i2=sc.nextInt()+i;
////		int i3=i2+i;
//		System.out.println(i2);
//		String s= "anu";
//		sc.nextLine();
//		System.out.println("enter string");
//		String s2= sc.nextLine();
//		String s3=s.concat(" ");
//		
//		String s4= s3.concat(s2);
//		System.out.println(s4);
//		int c=(int) Math.pow(2,7)*i;
//		System.out.println(c);
//		double h=45.7; 
//		double j=45.3;
////		int k=round(h);
//		int n=sc.nextInt();
//		System.out.print(divisor_sum(n));
		LocalDate d= LocalDate.now();
		
		System.out.println(d);
		
	}
	public static int divisor_sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n/i==0){
                sum+=i;
            }
            else continue;
        }
        return sum;
    }

}
