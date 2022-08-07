package com.bk.gfg.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeAlternateArray {

	public static void main(String[] args) {
		long arr[] = new long[]{350, 863, 1902, 2328, 2854, 3915, 6800, 8955, 9877};
		rearrange(arr,9);
		System.out.println(Arrays.toString(arr));
	}

	public static void rearrange(long arr[], int n){
		if(n==1) {
			return;
		}
		int mid = n%2==0?n/2:n/2+1;
		List<Long> list = new ArrayList<>();
		for(int i=0;i<mid;i++) {
			list.add(arr[n-i-1]);
			list.add(arr[i]);
		}
		for(int i =0 ;i<n;i++) {
			arr[i]=list.get(i);
		}
	}

}
