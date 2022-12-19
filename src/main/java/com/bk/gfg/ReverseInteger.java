package com.bk.gfg;

import java.util.ArrayList;

public class ReverseInteger {
    public static void main(String[] args) {
	ReverseInteger obj = new ReverseInteger();
	int result = obj.reverse(123);
	System.out.println("result :: " + result);
	result = obj.reverse(120);
	System.out.println("result :: " + result);
	result = obj.reverse(-1205);
	System.out.println("result :: " + result);
	result = obj.reverse(1534236469);
	System.out.println("result :: " + result);
    }

    public int reverse(int x) {
	int res = 0;
	while (x != 0) {
	    if (Math.abs(res) > Integer.MAX_VALUE / 10)
		return 0;
	    res = res * 10 + x % 10;
	    x = x / 10;
	}
	return res;
    }
}
