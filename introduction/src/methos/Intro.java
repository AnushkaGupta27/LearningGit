package methos;
import java.util.Scanner;
public class Intro {

	public static void main(String[] args) {
		//when a class has two or more methods with same name but different parameters(signature)is called method overloading
		//in signature only no. of parameter and type of parameter is included return type is not included in signature
		SayHi();
		int c=23;
		int d=67;
		int res1 = maxOf(c,d);
		int res2=maxOf(69,2);
		System.out.println("largest num is/are respectively \n"+res1+"\n"+res2);
		
	}
	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		}
		else return b;
	// a>b? a:b; in short ;)
		
	}
	static void SayHi() {
		System.out.println("hi\nhello\ngood morning");
	}
	static float maxOf(float c,int d) { //it is method over loading
		if(c>d) {
			return c;
		}
		else return d;
	}

}
