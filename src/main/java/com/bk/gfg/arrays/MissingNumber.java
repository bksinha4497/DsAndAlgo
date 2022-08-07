package com.bk.gfg.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = new int[]{6,1,2,8,3,4,7,10,5};
		System.out.println(MissingNumber(arr,10));
	}
	static int MissingNumber(int array[], int n) {
		int sum1 = (n*(n+1))/2;
		int sum2 =0;
		for(int i=0;i<n-1;i++) {
		sum2+=array[i];	
		}
		return sum1-sum2;
	}

}
