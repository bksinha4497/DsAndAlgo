package com.bk.gfg.arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		int n=4;
		int[] arr = new int[] {7,4,0,9};
		System.out.println(trappingWater(arr, n));
		n=7;
		arr = new int[] {8,8,2,4,5,5,1};
		System.out.println(trappingWater(arr, n));
	}
	static long trappingWater(int arr[], int n) { 
		long trap=0;
		int maxLeft=Integer.MIN_VALUE;
		int maxRight=Integer.MIN_VALUE;
		for(int i=0;i<n/2;i++) 
			maxLeft=Math.max(maxLeft, arr[i]);
		for(int i=n/2;i<n;i++)
			maxRight=Math.max(maxRight, arr[i]);
		int trapValue = Math.min(maxLeft, maxRight);
		//System.out.println("trap value "+ trapValue);
		for(int i =1 ;i<n-1;i++) {
			if(arr[i]!=arr[i-1]) 
				trap+=Math.abs(trapValue-arr[i]);
		}
		return trap;
	}
}
