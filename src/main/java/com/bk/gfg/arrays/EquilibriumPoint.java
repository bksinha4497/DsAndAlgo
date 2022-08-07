package com.bk.gfg.arrays;

public class EquilibriumPoint {
	 public static void main(String[] args) {
	        System.out.println(getEqui(new long[] {1 ,3, 5, 2, 2},5));
	    }
	 
	 static int getEqui(long arr[],int n) {
		 int mid = n/2;
		 int sum1 =0,sum2=0;
	        for(int i=0;i<mid;i++){
	            sum1+=arr[i];
	        }
	        for(int i=mid+1;i<arr.length ;i++){
	            sum2+=arr[i];
	        }
	        if(sum1<sum2) {
	        	while(sum1<sum2 && mid<n-1){
	        		sum1+=arr[mid++];
	        		sum2-=arr[mid-1];
	        		mid+=1;
	        	}
	        }else {
	        	while(sum1>sum2 && mid>=0){
	        		sum2+=arr[mid--];
	        		sum1-=arr[mid+1];
	        		mid-=1;
	        	}
	        }
	        
	        if(sum1==sum2){
	            return mid+1;
	        }
	        return -1;
	 }
}
