package com.bk.gfg.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArraysEqual {

	public static void main(String[] args) {
		long n = 2;
		long[] a = new long[]{3,3};
		long[] b = new long[]{2,2};
		System.out.println(check(a,b,n));
	}

	public static boolean check(long A[],long B[],long N)
	{   
		int n = A.length;
		int m = B.length;

		if (n != m)
			return false;

		Map<Long, Integer> map
		= new HashMap<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (map.get(A[i]) == null)
				map.put(A[i], 1);
			else {
				count = map.get(A[i]);
				count++;
				map.put(A[i], count);
			}
		}
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(B[i]))
				return false;
			if (map.get(B[i]) == 0)
				return false;

			count = map.get(B[i]);
			--count;
			map.put(B[i], count);
		}

		return true;
	}

}
