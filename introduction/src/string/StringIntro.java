package string; 

public class StringIntro {

	public static void main(String[] args) {
		//there are two methods of initialisation of string
		//1st method by literals---
		//string a= "anushka";
		//by
		//String b=new String("anu");
		//basically difference between defining in these two types is in by literals stirng jo hai basically string pool area me satore hoti hai aur ondefining by second method string ek main memory me save hoti hai aur string pool area me bbii save hoti hai to by literallls save krna hi efficiency k liye better hota hai
		//aur string pool area me save krne ka ek loss ho skta hai ki hm phir same ko define ni kr skte h mtlb agr same string ko define kia to phir new string na bnegi but new variable me purani vali string save ho jaegi and fayad abhi hai ki space km lgega to decide krna hota hai ki agr baad me same name ki ek aur string bnani h to by lliteral na sve krna hi better hoga
		//and also strings are immutable to agr khbi change bhi kiya to vo ek naya string ban dega but ek purana vala string memory me pra rhega MAIN MEMORY KO HEAP MEMORY BHI KAHTE HAI
		String a="  ANushka ";
		String b=new String("anushka ");
		String c="anushka ";
		String d= a+"gupta";
		//charAt(int index) will return character at that index
		System.out.println(a.charAt(4));
		//length() will provide length of string
		System.out.println(a.length());
		//substring(ing begining index) it will return all the characters including and after begining index
		System.out.println(a.substring(4));
		//substring(begning index, end index) from beging index to end index it will return all character
		System.out.println(a.substring(3,7));
		//contains(char or word) it is boolean it willl return either that char or word exists in the variable or not
		System.out.println(a.contains("anu "));
		System.out.println(a.contains("anu"));
		System.out.println(a==b);
		System.out.println(a==c);
		//name1.equals(name2) it is also boolean so it will tell ki dono ki length same hai ya nahi hai
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		//isEmpty() boolean it will tel u wethr any string is empty or commited
		System.out.println(a.isEmpty());
		//concat() is basically for appending another string in one string there is also another method for this
		System.out.println(d);
		System.out.println(b.concat("gupta"));
		//replace(old char , new char) will replace old char by new one
		System.out.println(a.replace("anu", "great"));
		// trim() removes all the spaces
		System.out.println(a.trim());
		//int indexOf() 
		System.out.println(a.indexOf(a));
		// to toLowerCase()
		System.out.println(a.toLowerCase());
		//toUpperCase()
		System.out.println(a.toUpperCase());
		// split it basically splits any string by specified character into array like in example below I have splitted about comma
		String cars= "hyundai,maruti,suzuki,ford,fortuner,audi,lamborghini";
		String carlist[] = cars.split(",");
//		System.out.println(carlist[]);
		for(String car : carlist) {
		System.out.print(car+" ");
//		c=a+b;
		//here is a rule that a=c+b is valid but a+b=c assignment is not valid
		
//		System.out.println(c);
		}
		String A="rjkwrfb";
		A.substring(0,1).toUpperCase();
		String a1=A.replaceFirst(A.substring(0,1),A.substring(0,1).toUpperCase());
		System.out.println((int)A.charAt(0));
	}

}
