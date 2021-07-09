package string;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter both words ");
		String a= sc.next();
		String b=sc.next();
		boolean isAna=false;
		boolean isVis[]=new boolean[b.length()] ; 
		if(a.length()==b.length()) {
			for(int i=0;i<a.length();i++) {
				char c = a.charAt(i);
				for(int j=0;j<b.length();j++) {
					if(b.charAt(j)==c && !isVis[j]) {
						isVis[j]=true;
						isAna=true;
						break;
					}
				}
				if(!isAna) break;	
			}
		}
		if(isAna) {
			System.out.println("both are anagrams ");
		}
		else {
			System.out.println("not anagrams ");
		}

	}
	

}
