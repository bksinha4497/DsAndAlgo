package com.bk.gfg.arrays;

import java.util.Arrays;

public class Sort012 {
	public static void main(String[] args) {
		int[] arr = new int[]{0 ,2, 1, 2, 0};
		sort012(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort012(int a[], int n)
	{
		int zeroCount=0;
		int oneCount=0;
		int twoCount=0;
		for(int i=0;i<n;i++) {
			if(a[i]==0) {
				zeroCount++;
			}else if(a[i]==1) {
				oneCount++;
			}else if(a[i]==2) {
				twoCount++;
			}
		}
		int i=0;
		int zero=0;
		while(zero++<zeroCount) {
			a[i++]=0;
		}
		int one=0;
		while(one++<oneCount) {
			a[i++]=1;
		}
		int two=0;
		while(two++<twoCount) {
			a[i++]=2;
		}
	}
}
