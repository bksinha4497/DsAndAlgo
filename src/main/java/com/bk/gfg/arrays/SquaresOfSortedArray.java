package com.bk.gfg.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int arr[] = new int[]{4,-1,0,3,10};
        System.out.println(Arrays.toString(new SquaresOfSortedArray().sortedSquares(arr)));
    }
    public int[] sortedSquares(int[] nums) {
        int arr[] =new int[nums.length];
        for(int i=0;i< nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
