package com.bk.gfg.arrays;

public class FindNumberWithEvenNumerOfDigits {
    public static void main(String[] args) {
        System.out.println(new FindNumberWithEvenNumerOfDigits().findNumbers(new int[]{12,345,2,6,7896}));
    }
    public int findNumbers(int[] nums) {
        int result=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            int num = nums[i];
            while(num>0){
                num=num/10;
                count++;
            }
            if(count!=0 && count%2==0){
                result++;
            }
        }
        return result;
    }
}
