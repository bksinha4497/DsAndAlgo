package com.bk.gfg.arrays;

import java.util.LinkedList;
import java.util.List;

public class kthElementOfTwoSortedArray {

	public static void main(String[] args) {
		int arr1[] = new int[] {2, 3, 6, 7, 9};
		int arr2[] = new int[]{1, 4, 8, 10};
		int k = 5;
		System.out.println(kthElement(arr1, arr2, arr1.length,arr2.length, k));
	}

	public static  long kthElement( int arr1[], int arr2[], int n, int m, int k) {
		List<Integer> list = new LinkedList<>();
		int i =0,j=0;
			while(i<n && j<m) {
				if(arr1[i]<arr2[j]) {
					list.add(arr1[i++]);
				}else {
					list.add(arr2[j++]);
				}
		}
		while(i<n) {
			list.add(arr1[i++]);
		}
		while(j<m) {
			list.add(arr2[j++]);
		}
		return list.get(k-1);
	}

}
