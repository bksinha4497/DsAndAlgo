package com.bk.gfg.arrays;

import java.util.HashSet;
import java.util.Set;

/*
Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]

 */
public class CheckIfNAndItsDoubleExists {

    public static void main(String[] args) {
        /*int[] arr =new int[]{10,2,5,3};*/
        int[] arr =new int[]{-2,0,10,-19,4,6,-8};
        Boolean result=new CheckIfNAndItsDoubleExists().checkIfExist(arr);
        System.out.println(result);
    }
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int cnt=0;
        for(int i=0;i< arr.length;i++){
            set.add(arr[i]);
            if(arr[i]==0)
                cnt++;
        }
        for(int n : arr){
            if(n != 0 && set.contains(n*2))
                return true;
            else if(n == 0 && cnt > 1)
                return true;
        }
        return false;
    }
}
