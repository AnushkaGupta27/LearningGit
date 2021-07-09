package array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class LargestSubarraySum {

	public static void main(String[] args) {
		long sum=0;
		List<Integer>arr= new ArrayList();
		arr.add(0,1);
		arr.add(1,2);
		arr.add(2,3);
		arr.add(3,4);
		arr.add(4,5);
        List<Long> arr2= new ArrayList();
        for(long i=0;i<arr.size();i++){
            for(long j=0;j<arr.size();j++){
                sum+=arr.get((int) j);
            }
            for(long j=0;j<arr.size();j++){
                sum=sum-arr.get((int) i);
                arr2.add((int) i,sum);
            }
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
