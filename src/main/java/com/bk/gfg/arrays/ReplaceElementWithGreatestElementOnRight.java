package com.bk.gfg.arrays;

import java.util.Arrays;

/**
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right,
 * and replace the last element with -1.
 *
 * After doing so, return the array.
 */
public class ReplaceElementWithGreatestElementOnRight {
    public static void main(String[] args) {
        ReplaceElementWithGreatestElementOnRight obj = new ReplaceElementWithGreatestElementOnRight();
        int[] arr = new  int[]{17,18,5,4,6,1};
        arr=obj.replaceElements(arr);
        System.out.println(Arrays.toString(arr));
    }
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int greatest=0;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]>greatest) {
                    greatest=arr[j];
                }
            }
            arr[i]=greatest;
        }
        arr[arr.length-1]=-1;
        return  arr;
    }
}
