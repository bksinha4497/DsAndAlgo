package com.bk.gfg.arrays;

import java.util.Arrays;
import java.util.stream.Collector;

public class DuplicateZeros {

    public static void main(String[] args){
        DuplicateZeros object = new DuplicateZeros();
        int[] arr = new int[] {1,0,2,3,0,4,5,0};
        object.duplicateZeros(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                shift(arr, ++i);
            }
        }
    }

    public void shift(int[] in, int cur) {
        if (cur == in.length) return;
        int prev = in[cur];
        in[cur] = 0;
        int temp;
        while (cur < in.length) {
            if (cur + 1 < in.length) {
                temp = in[cur + 1];
                in[++cur] = prev;
                prev = temp;
            } else
                cur++;
        }
    }
}
