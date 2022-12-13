package com.bk.gfg.arrays;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args){
        MergeSortedArray obj = new MergeSortedArray();
            int[] nums1 = new int[0];
            int m = nums1.length;
            int[] nums2 = new int[] {1};
            int n = nums2.length;
            obj.merge(nums1,m,nums2,n);
        Arrays.stream(nums1).forEach(System.out::println);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length<1 || m == 0) {
            nums1 = new int[nums2.length];
            for(int i=0;i<nums2.length;i++){
                nums1[i]=nums2[i];
            }
            System.out.println("op -- "+Arrays.toString(nums1));
            return;
        }
        if (m != 0 && n != 0) {
            int[] temp = new int[nums1.length + nums2.length - 1];
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < m && j < n) {
                if (nums1[i] == 0) {
                    i++;
                    continue;
                }
                if (nums2[j] == 0) {
                    j++;
                    continue;
                }
                if (nums1[i] < nums2[j])
                    temp[k++] = nums1[i++];
                else
                    temp[k++] = nums2[j++];
            }

            while (i < nums1.length && nums1[i] != 0)
                temp[k++] = nums1[i++];

            while (j < nums2.length && nums2[j] != 0)
                temp[k++] = nums2[j++];

            for (int z = 0; z < temp.length; z++) {
                if (temp[z] != 0)
                    nums1[z] = temp[z];
            }
        }
    }
}
