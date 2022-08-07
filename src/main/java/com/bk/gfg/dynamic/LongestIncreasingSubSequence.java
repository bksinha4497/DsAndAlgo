package com.bk.gfg.dynamic;

import java.util.Arrays;

public class LongestIncreasingSubSequence {
	public static void main(String[] args) {
		int[] arr = new int[]{5,8,3,7,9,1};
		arr = new int[]{0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
		System.out.println(longestincreasingSubSequence(arr));
	}

	static int longestincreasingSubSequence(int[] arr){
		int[] lis = new int[arr.length];
		Arrays.fill(lis, 1);
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					lis[i]=Math.max(lis[i],1+lis[j]);
				}
			}
		}
		return (int) Arrays.stream(lis).max().getAsInt();
	}
	

}
