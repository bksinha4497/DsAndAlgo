package com.bk.gfg.dynamic;

import java.util.ArrayList;
import java.util.List;

public class MiimumCoins {

	private final int[] coins = new int[]{ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 } ;
	public static void main(String[] args) {
		System.out.println(minPartition(43));
	}
	static List<Integer> minPartition(int N)
	{
		return getCoinList(new ArrayList<>(),N,N);

	}

	static List<Integer> getCoinList(List<Integer> cointList ,int remainingCount, int N) {
		
		cointList.add(getNearestCoinFromResult(remainingCount));
		
		if(cointList.stream().reduce(0,(one,two)->one+two)==N) {
			return cointList;
		}else {
			getCoinList(cointList,N-cointList.stream().reduce(0,(one,two)->one+two).intValue(),N);
		}
		return cointList;
	}

	static int getNearestCoinFromResult(int N) {
		if(N<2) {
			return 1;
		}else if(N<5) {
			return 2;
		}else  if(N <10) {
			return 5;
		}else  if(N <20) {
			return 10;
		}else  if(N <50) {
			return 20;
		}else  if(N <100) {
			return 50;
		}else  if(N <200) {
			return 100;
		}else  if(N <500) {
			return 200;
		}else  if(N <2000) {
			return 500;
		}else {
			return 2000;
		}
	}

}
