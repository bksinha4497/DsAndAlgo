package com.bk.gfg.arrays;

import java.util.Arrays;

public class ArrayZigZag {

	public static void main(String[] args) {
		int[] arr = new int[] {4, 3, 7, 8, 6, 2, 1};
		int n =7;
		zigZag(arr,n);
		Arrays.stream(arr).forEach(System.out::print);
		/** Output: 3 7 4 8 2 6 1 */
	}

	static void zigZag(int a[], int n)
    {
        for (int i = 1; i < n; i += 2) {
            // Check if previous element
           // is greater then the current element
           // then swap them
            if (a[i - 1] > a[i])
                swap(a, i, i - 1);
           
            // if next element is greater then
            // then the current element then
            // also swap them.
            if (i + 1 < n && (a[i + 1] > a[i]))
                swap(a, i, i + 1);
        }
    }
	private static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}

}
