package com.bk.gfg.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayGroup {

	public static void main(String[] args) {
		ReverseArrayGroup obj = new ReverseArrayGroup();
		List<Integer> a =  Arrays.asList(36, 93, 64, 48, 96, 55, 70, 0, 82, 30, 16, 22, 38, 53,
					19, 50, 91, 43, 70, 88, 10, 57, 14, 94, 13, 36, 59, 32, 54, 58, 18, 82, 67);
		List<Integer> b =  Arrays.asList(38, 22, 16, 30, 82, 0, 70, 55, 96, 48, 64, 93, 36, 36,
				13, 94, 14, 57, 10, 88, 70, 43, 91, 50, 19, 53, 67 ,82, 18, 58, 54, 32, 59);
		ArrayList<Integer> arr = new ArrayList<>(a);
		obj.reverseInGroups(arr, 33, 13);
		System.out.println(arr);
	}

	void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		if(k>arr.size()) {
			for(int i =n-1;i>=0;i--) {
				result.add(arr.get(i));
			}
		}else{
			for(int i =k-1;i>=0;i--) {
				result.add(arr.get(i));
			}
			for(int i =n-1;i>k-1;i--) {
				result.add(arr.get(i));
			}
		}
		arr.clear();
		for(int i =0;i<n;i++) {
			arr.add(result.get(i));
		}
	}
}
