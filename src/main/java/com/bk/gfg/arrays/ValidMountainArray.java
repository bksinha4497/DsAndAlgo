package com.bk.gfg.arrays;

public class ValidMountainArray {
    public static void main(String[] args) {
        ValidMountainArray obj = new ValidMountainArray();
        Boolean result=obj.validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9});
        System.out.println(result);
    }
    public boolean validMountainArray(int[] arr) {
        if(arr.length==1){
            return false;
        }
        boolean isIncreasing=false;
        boolean isdecreasing=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1] && isdecreasing==false){
                isIncreasing=true;
            }else if(arr[i]>arr[i+1] && isIncreasing==true){
                isdecreasing=true;
            }else{
                return false;
            }
        }
        return (isIncreasing&&isdecreasing);
    }
}
