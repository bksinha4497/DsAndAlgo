package com.bk.gfg;

import java.util.ArrayList;

public class ReverseInteger {
    public static void main(String[] args) {
	ReverseInteger obj = new ReverseInteger();
	int result = obj.reverse(123);
	System.out.println("result :: "+result);
	result = obj.reverse(120);
	System.out.println("result :: "+result);
	result = obj.reverse(-1205);
	System.out.println("result :: "+result);
    }
    public int reverse(int x) {
	StringBuilder sb = new StringBuilder();
	String str = String.valueOf(x);
	boolean isPlus=false;
	boolean isMinus=false;
	for(int i=str.length()-1;i>=0;i--){
	    if(str.charAt(i)=='-')
		isMinus=true;
	    if(str.charAt(i)=='+')
		isPlus=true;
	    if((str.charAt(i)=='+' || str.charAt(i)=='-') && (i==0  || i==str.length()-1 ))
		continue;
	    if(str.charAt(i)!='-' && str.charAt(i)!='+'){
		sb.append(str.charAt(i));
	    }
	}
	String result=sb.toString();
	if(isPlus){
	    result="+"+result;
	}else if(isMinus){
	    result="-"+result;
	}
	return Integer.valueOf(result);
    }
}
