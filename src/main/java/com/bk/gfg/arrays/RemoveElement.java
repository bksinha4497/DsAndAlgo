package com.bk.gfg.arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args){
        RemoveElement obj = new RemoveElement();
        int[] arr=new int[]{3,2,2,3};
        obj.removeElement(arr,3);
    }
    public int removeElement(int[] nums, int val) {
        int count = 0;
        // Loop through all the elements of the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is not val
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }


}
