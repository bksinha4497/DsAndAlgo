package com.bk.gfg.dynamic;

import java.util.Arrays;

public class LongestCommongSubSequence {

	public static void main(String[] args) {
		String S1 = "ABCDGH", S2 = "AEDFHR";
		System.out.println(lcs(S1,S2,S1.length(),S2.length()));
	}
	static int lcs(String s1,String s2,int n, int m) {
		int[][] dp = new int[n][m];
		Arrays.stream(dp).forEach(a->Arrays.fill(a, 0));
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				if(s1.charAt(i)==s2.charAt(j) && (i==0 || j==0)) {
					dp[i][j]=1;	
				}else if(s1.charAt(i)==s2.charAt(j)) {
					dp[i][j]=1+dp[i-1][j-1];
				}else 
					dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
			}
		}
		return dp[n-1][m-1];
	}


}
