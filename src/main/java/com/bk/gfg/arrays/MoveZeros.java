package com.bk.gfg.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros obj = new MoveZeros();
        int[] nums = new int[]{0,1,0,3,12};
        obj.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
    public void moveZeroes(int[] nums) {
        int count=0;
        for (int i=0;i< nums.length;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        for(int i=count;i< nums.length;i++){
            nums[i]=0;
        }
    }
}
