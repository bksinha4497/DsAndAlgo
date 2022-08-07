package com.bk.gfg.arrays;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int n =5,s=12;
		int[] arr = new int[] {1,2,3,7,5}; 
		System.out.println(subarraySum(arr,n,s));
	}
	
	 static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	    {
	       int start =0;int end=n;
	       ArrayList<Integer> indexList = new ArrayList<>();
	       while(start>=0 && start<=end) {
	    	   int sum=0;
	    	   for(int i=start;i<end;i++) {
	    		   sum+=arr[i];
	    	   }
	    	   if(sum==s) {
	    		   indexList.add(start);
	    		   indexList.add(end+1);
	    	   }else if(sum>s) {
	    		   end--;
	    	   }else {
	    		   start++;
	    	   }
	       }
	       return indexList;
	    }

}
