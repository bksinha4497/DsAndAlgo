package com.bk.gfg.arrays;

import java.util.*;

public class SortArrayByParity {
    public static void main(String[] args) {
        SortArrayByParity obj = new SortArrayByParity();
        int[] nums = new int[]{3,1,2,4};
        nums=obj.sortArrayByParity(nums);
        System.out.println(Arrays.toString(nums));

    }
    public int[] sortArrayByParity(int[] nums) {
        int temp=0;
        List<Integer> odd = new LinkedList<>();
        List<Integer> even = new LinkedList<>();
        for (int i=0;i< nums.length;i++) {
            if (nums[i] % 2 == 0) {
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        int count=0;
        Iterator<Integer> evenItr= even.iterator();;
          while(evenItr.hasNext()){
              nums[count++]=evenItr.next();
          }
          Iterator<Integer> oddItr= odd.iterator();;
          while(oddItr.hasNext()){
              nums[count++]=oddItr.next();
          }
        return nums;
    }
}
