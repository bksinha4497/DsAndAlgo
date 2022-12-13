package com.bk.gfg.arrays;

import java.util.Arrays;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int result=0;
        int currentmax=0;
            for (int i = 0; i < nums.length; i++) {
                currentmax = 0;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == 1) {
                            currentmax+=1;
                    }else{
                        break;
                    }
                }
                if (currentmax > result) {
                    result = currentmax;
                }
            }
            return result;
    }
}
