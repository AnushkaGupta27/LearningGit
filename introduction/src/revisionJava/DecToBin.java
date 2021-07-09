package revisionJava;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class DecToBin {

	public static void main(String[] args) {
		List<Integer>arr= new ArrayList();
		arr.add(0,1);
		arr.add(1,2);
		arr.add(2,3);
		arr.add(3,4);
		arr.add(4,5);
		long sum=0;
        List<Long> arr2= new ArrayList();
        for(long i=0;i<arr.size();i++){
            sum+=arr.get((int) i);
        }
        for(long j=0;j<arr.size();j++){
        	long temp=sum-arr.get((int) j);
            arr2.add((int) j,temp);
        }
        long max=0;
        long min=0;
        for(long j=0;j<arr2.size();j++){
            if(arr2.get((int) max)<arr2.get((int) j)) max=j;
            if(arr2.get((int) min)>arr2.get((int) j)) min=j;
        }
    System.out.print(arr2.get((int) min)+"  "+arr2.get((int) max));
	}

}
