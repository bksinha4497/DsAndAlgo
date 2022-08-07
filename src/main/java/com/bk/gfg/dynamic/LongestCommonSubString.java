package com.bk.gfg.dynamic;

import java.util.Arrays;

public class LongestCommonSubString {

	public static void main(String[] args) {
		String S1 = "ABCDGH", S2 = "ACDGHR";
		System.out.println(longestCommonSubstr(S1,S2,S1.length(),S2.length()));
	}
	static int longestCommonSubstr(String s1, String s2, int n, int m){
	   	int[][] dp = new int[n][m];
			Arrays.stream(dp).forEach(a -> Arrays.fill(a, 0));
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						if(i==0 || j==0) {
							dp[i][j]=1;
						}else {
							dp[i][j]=1+dp[i-1][j-1];
						}
					}
				}
			}
			return Arrays.stream(dp).flatMapToInt(Arrays::stream).reduce((a,b)->Math.max(a, b)).getAsInt();
	    }


}
